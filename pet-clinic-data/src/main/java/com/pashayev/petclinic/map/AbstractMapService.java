package com.pashayev.petclinic.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {

    public Map<ID,T>  map=new HashMap<>();


    public Set<T>findAll(){
        return new HashSet<>(map.values());
    }

    public T finById(ID id){
        return map.get(id);
    }

    public T save(ID id, T object){
      map.put(id,object);
      return object;
    }

    public void deleteById(ID id){
        map.entrySet().removeIf(entry->entry.getKey().equals(id));
    }

    public void delete (T object){
        map.entrySet().removeIf(entry->entry.getValue().equals(object));
    }


}
