package com.abhi.taxiwala;

public class TaxiwalaProblem {


public final class EventBus {

    // private Map<String,List<Listener>> eventListenersMap = new HashMap<>()  ; 
  
    private Map<String,Set<Listener>> eventListenersMap = new HashMap<>()  ; 
  
    public void register(String eventName, Listener listener) {
        /* TODO */
      // null blank chk 
      if (StringUtils.isBlank(eventName)) {
          throw new RunTimeException("Null or emptu event name") ; 
      }
      
      if (listener == null) {
        throw new RunTimeException("Null listener provided") ; 
      }
      
      eventName = event.trim() ; 
      if (eventListenersMap.get(eventName) == null)  {
        
          eventListenersMap.put(eventName,new HashSet<>()) ;
        
        
      }
      
      eventListenersMap.get(evenName).add(listener) ;
      
    }
  

    public void unregister(String eventName, Listener listener) {
        /* TODO */
      if (StringUtils.isBlank(eventName)) {
          throw new RunTimeException("Null or emptu event name") ; 
      }
      
      if (listener == null) {
        throw new RunTimeException("Null listener provided") ; 
      }
      
      if (eventListenersMap.get(eventName) == null)  {
        // no op
        return ; 
      }
      eventName = event.trim() ;
      eventListenersMap.get(eventName).remove(listener) ; 
      
    }
  
  

    public void postEvent(String eventName, Object data) {
        /* TODO */
      if (StringUtils.isBlank(eventName)) {
          throw new RunTimeException("Null or emptu event name") ; 
      }
      
      
      if (eventListenersMap.get(eventName) == null)  {
        // no op
        return ; 
      }
      
      Set<Listener> set = eventListenersMap.get(evenName) ;
      
      for (Listeners l  : set) {
        l.onEvent(data) ; 
      }
      
      
    }


  
    // private boolean validate(String eventName, )
  
    public interface Listener {
        void onEvent(Object data);
    }
}


public class TopicListener implements  Listener { 
  
  void onEvent(Object data) {
    
  }

}
}
