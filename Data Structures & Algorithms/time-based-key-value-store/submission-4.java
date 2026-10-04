class Data{
    String val;
    int timestamp;
    Data(String val,int timestamp){
        this.val = val;
        this.timestamp = timestamp;
    }
}
class TimeMap {
    Map<String,List<Data>> hm;
    public TimeMap() {
        hm = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(hm.containsKey(key))
        {
            Data obj = new Data(value,timestamp);
            hm.get(key).add(obj);
        }
        else
        {
            List<Data> alist = new ArrayList<>();
            hm.put(key,alist);
            Data obj = new Data(value,timestamp);
            hm.get(key).add(obj);
        }
    }
    
    public String get(String key, int timestamp) {
        // System.out.println(hm.get(key));
        // System.out.println(key);
        if(!hm.containsKey(key))
        return "";
        List<Data> alist = hm.get(key);
        int max = Integer.MIN_VALUE;
        Data res = null;
        int low = 0;
        int high = alist.size() - 1;
        // for(Data x:alist)
        // {
        //  if(x.timestamp <= timestamp)
        //  {
        //     // max = Math.max(max,x.timestamp);
        //     if(x.timestamp > max)
        //     {
        //         max = x.timestamp;
        //         res = x;
        //     }
        //  }
        // }
        while(low <= high){
            int mid = low + (high - low)/2;
            Data x = alist.get(mid);

            if(x.timestamp<=timestamp)
            {
                res = x;
                low = mid + 1;
            }
            else
            high = mid - 1;
        }
        
        return res == null ? "" : res.val;
    }
}
