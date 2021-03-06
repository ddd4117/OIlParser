package sselab.nusek.oil.file.parserControl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

import sselab.nusek.oil.InvalidOilException;
import sselab.nusek.oil.OilAlarm;
import sselab.nusek.oil.OilAppMode;
import sselab.nusek.oil.OilAttribute;
import sselab.nusek.oil.OilCounter;
import sselab.nusek.oil.OilEvent;
import sselab.nusek.oil.OilISR;
import sselab.nusek.oil.OilObject;
import sselab.nusek.oil.OilObject_Attribute;
import sselab.nusek.oil.OilOs;
import sselab.nusek.oil.OilResource;
import sselab.nusek.oil.OilSpec;
import sselab.nusek.oil.OilTask;

public class OilParserControl {
	public void taskAppmode_Check(OilSpec oil) {
		if (oil.getAppMode() == null) {
			try {
				oil.setAppMode(new OilAppMode("std"));
			} catch (InvalidOilException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for (OilTask task : oil.getTasks()) {
			if (task.isAutostart() && task.getAppMode() == null) {
				task.setAppMode(oil.getAppMode().toString());
			}
		}

	}

	public void addObject(String name, String value, OilObject obj) {
		// System.out.println("\t" + name + " " + value);
		obj.addAttr(new OilAttribute(name, value));
	}
	
	public void finalizeOilObjCreation(OilObject currentObject, OilSpec oil) {
		if (currentObject instanceof OilTask) {
			OilAttribute attr = currentObject.findAttr("RESOURCE");
			if(attr != null){
				OilObject obj = new OilObject_Attribute("RESOURCE");
				Iterator<OilAttribute> iter = currentObject.getAttr().iterator();
				while(iter.hasNext()){
					OilAttribute temp = iter.next();
					if(temp.getName().equals("RESOURCE")){
						obj.addAttr(temp);
						iter.remove();
					}
				}
				currentObject.addObj(obj);
			}
			attr = currentObject.findAttr("EVENT");
			if(attr != null){
				OilObject obj = new OilObject_Attribute("EVENT");
				Iterator<OilAttribute> iter = currentObject.getAttr().iterator();
				while(iter.hasNext()){
					OilAttribute temp = iter.next();
					if(temp.getName().equals("EVENT")){
						obj.addAttr(temp);
						iter.remove();
					}
				}
				currentObject.addObj(obj);
			}
			oil.addTask((OilTask) currentObject);
		} else if (currentObject instanceof OilEvent) {
			oil.addEvent((OilEvent) currentObject);
		} else if (currentObject instanceof OilResource) {
			oil.addResource((OilResource) currentObject);
		} else if (currentObject instanceof OilAlarm) {
			oil.addAlarm((OilAlarm) currentObject);
		} else if (currentObject instanceof OilISR) {
			oil.addIsr((OilISR) currentObject);
		} else if (currentObject instanceof OilOs) {
			if (oil.getOs() == null)
				oil.setOs((OilOs) currentObject);
			else {
				for (OilAttribute temp : ((OilOs) currentObject).getOtherAttributes()) {
					oil.getOs().addAttr(new OilAttribute(temp.getName(), temp.getValue()));
				}
			}

		} else if (currentObject instanceof OilAppMode) {
			oil.addAppMode((OilAppMode) currentObject);
		} else if (currentObject instanceof OilCounter) {
			oil.addCounter((OilCounter) currentObject);
		}
	}

	public OilObject makeObject(String Name) {
		OilObject object = null;
		switch (Name) {
		case "OS":
			try {
				object = new OilOs();
			} catch (InvalidOilException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "APPMODE":
			object = new OilAppMode();
			break;
		case "TASK":
			object = new OilTask();
			break;
		case "RESOURCE":
			object = new OilResource();
			break;
		case "EVENT":
			object = new OilEvent();
			break;
		case "ALARM":
			object = new OilAlarm();
			break;
		case "ISR":
			object = new OilISR();
			break;
		case "COUNTER":
			try {
				object = new OilCounter();
			} catch (InvalidOilException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
		return object;
	}

	public OilSpec getOilSpec(OilSpec oil) {
		oil.updateCeilingPriority();
		return oil;
	}

	public void finailize(OilSpec oil) {
		this.setID(oil);
		if (oil.getOs() == null)
			try {
				oil.setOs(new OilOs());
			} catch (InvalidOilException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		this.taskAppmode_Check(oil);

	}

	public void setID(OilSpec oil) {
		// sort task and put ids
		List<OilObject> objs = new ArrayList<>();
		putIdsOnResources(oil.getResources());
		objs.clear();
		objs.addAll(oil.getTasks());
		putIdsOn(objs);
		objs.clear();
		objs.addAll(oil.getEvents());
		putIdsOn(objs);
		objs.clear();
		objs.addAll(oil.getAlarms());
		putIdsOn(objs);
		objs.clear();
		objs.addAll(oil.getIsrs());
		putIdsOn(objs);
	}

	private void putIdsOn(List<OilObject> objs) {
		// sort objs w.r.t. its name and put id w.r.t. its order
		int ID = 1;
		PriorityQueue<OilObject> queue = new PriorityQueue<>(Comparator.comparing(OilObject::getName));
		queue.addAll(objs);
		while (!queue.isEmpty()) {
			OilObject t = queue.poll();
			t.setId(ID++);
		}
	}

	private void putIdsOnResources(List<OilResource> objs) {
		// sort objs w.r.t. its name and put id w.r.t. its order
		int ID = 1;
		PriorityQueue<OilResource> queue = new PriorityQueue<>(Comparator.comparing(OilResource::getPrio));
		queue.addAll(objs);
		while (!queue.isEmpty()) {
			OilObject t = queue.poll();
			t.setId(ID++);
		}
	}

}