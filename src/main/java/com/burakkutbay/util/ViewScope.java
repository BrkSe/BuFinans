package com.burakkutbay.util;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import javax.faces.context.FacesContext;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by hasanburakkutbay on 23.05.2017.
 */
public class ViewScope implements Scope {
    @SuppressWarnings("rawtypes")
/*	public Object get(String name, ObjectFactory objectFactory) {
        Map<String,Object> viewMap = FacesContext.getCurrentInstance().getViewRoot().getViewMap();
		if(viewMap.containsKey(name))
        {
			return viewMap.get(name);
		}
        else
        {
			Object object = objectFactory.getObject();
			viewMap.put(name, object);
			return object;
		}
	}*/
    public Object get(String name, ObjectFactory objectFactory) {
        Map<String, Object> viewMap =
                FacesContext.getCurrentInstance().getViewRoot().getViewMap();
        synchronized (viewMap) {
            if (viewMap.containsKey(name)) {
                return viewMap.get(name);
            } else {
                Map lruMap = (Map) FacesContext.getCurrentInstance().
                        getExternalContext().getSessionMap().get("com.sun.faces.application.view.activeViewMaps");
                synchronized (lruMap) {
                    if (lruMap != null && !lruMap.isEmpty() && lruMap.size() > 1) {
                        Iterator itr = lruMap.entrySet().iterator();
                        while (itr.hasNext()) {//Not req
                            Map.Entry entry = (Map.Entry) itr.next();
                            Map<String, Object> map = (Map<String, Object>) entry.getValue();
                            map.clear();
                            itr.remove();
                            break;
                        }
                    }
                    Object object = objectFactory.getObject();
                    viewMap.put(name, object);
                    return object;
                }
            }
        }
    }
    public Object remove(String name) {
        return FacesContext.getCurrentInstance().getViewRoot().getViewMap().remove(name);
    }
    public String getConversationId() {
        return null;
    }
    public void registerDestructionCallback(String name, Runnable callback) {
        //Not supported
    }
    public Object resolveContextualObject(String key) {
        return null;
    }
}