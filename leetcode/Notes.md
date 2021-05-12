# HASHSET
```
    -   HashSet<Integer> hash = new HastSet<>();
    -   hash.add(element);
    -   hash.contains(element);
    -   hash.remove(element);
    -   hash.size();
    -   hash.clear();
    -   hash.clone();                   //shallow copy of hash
```
# HASHMAP
    -   HashMap<Integer,Integer> hash = new HashMap<>();
    -   LinkedHashMap<Integer,Integer> hash = new HashMap<>();  //for stability
    -   hash.size();
    -   hash.put(key,value);
    -   hash.remove(key)
    -   hash.get(key);                  //returns value
    -   hash.clear();                   //clear HashMap
    -   hash.containsKey(key)  
    -   map.put(key,map.getOrDefault(key,0)+1)        
    -   Iterating HashMap -
            for(Map.Entry<Integer,Integer> e: h.entrySet())
                System.out.println(e.getKey()+" "+e.getValue());
  
# String

    -   str = "SHALATAN"
    -   str.length();           //8
    -   str.charAt(4);          //A
    -   str.subString(2);       //ALATAN
    -   str.subString(2,5);     //ALA
    -   str.contains("TAN");    //true
    -   str.equal("SHALATAN");  //true
    -   str.compareTo("SHA");   //>0,0,<0
    -   str.indexOf("LAT);      //3, negative if not present
    -   str.indexOf("A",3);     //Occurence after index 3
    -   str=str.concat("14")    //SHALATAN14

# Queue
    - Queue<Integer> queue = new LinkedList<Integer>();
    - Queue<Integer> queue = new ArrayDeque<Integer>();
    - queue.size()      //size of queue
    - queue.isEmpty()   //empty or not
    - queue.add(x)      //insert element
    - queue.element()   //return first element
    - queue.remove()    //remove and return first element
    - queue.offer(x)    //insert element*
    - queue.peek()      //return first element*
    - queue.poll()      //remove and return first element*
    - * - Functions that do not throw exceptions, returns null