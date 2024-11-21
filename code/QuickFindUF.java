class QuickFindUF
{
       int id[]; 
    
    public void main(int n , int p, int q)
    {
      id=new int[n];
      for (int i = 0; i < n; i++)
      id[i] = i;
      union(p,q);
      System.out.print(connected(p,q));
 }
 
 public boolean connected(int p, int q)
 { 
     return id[p] == id[q]; 
    }
 public void union(int p, int q)
 {
 int pid = id[p];
 int qid = id[q];
 for (int i = 0; i < id.length; i++)
 if (id[i] == pid) 
 id[i] = qid;
 }
}