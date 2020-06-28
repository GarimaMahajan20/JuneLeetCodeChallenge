class Solution 
{
    
    public List<String> findItinerary(List<List<String>> s) 
    {
        HashMap<String,PriorityQueue<String>> g=new HashMap<>();
        for(int x=0;x<s.size();x++)
        {
            if(!g.containsKey(s.get(x).get(0)))
            {
                PriorityQueue<String> pq=new PriorityQueue<>();
                g.put(s.get(x).get(0),pq);
            }
            g.get(s.get(x).get(0)).add(s.get(x).get(1));
        }
        LinkedList<String> ans=new LinkedList<>();
        dfs(g,ans,"JFK");
        LinkedList<String> res=new LinkedList<>();
        for(int x=ans.size()-1;x>=0;x--)
        {
            res.add(ans.get(x));
        }
        return res;
        
    }
    public void dfs(HashMap<String,PriorityQueue<String>> g,LinkedList<String> ans,String s)
    {
        PriorityQueue<String> q=g.get(s);
        while(q!=null&&!q.isEmpty())
        {
            dfs(g,ans,q.poll());
        }
        ans.add(s);
    }
}