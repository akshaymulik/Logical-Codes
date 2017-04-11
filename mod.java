class mod
{
 public static void main(String args[])
 {
  int r1=Integer.parseInt(args[0] );
  int r2=Integer.parseInt(args[1] );
  int r,q,t1,t2,t,rt;
  t1=0; t2=1;r=q=t=0; rt=r2; 
  System.out.println("q  | r2  | r1  | r  | t1 | t2 | t");
  System.out.println(q+" | "+r2+" | "+r1+" | "+r+" | "+t1+"  | "+t2+" | "+t);
  r=-1;
  for(int z=0;r!=0;z++)
  {
   q=r2/r1; r=r2%r1; t=t1-(t2*q);
   System.out.println(q+" | "+r2+" | "+r1+" | "+r+" | "+t1+"  | "+t2+" | "+t);
   if(r==0)
   {System.out.println("Answer "+t2);break;}
   r2=r1; r1=r; t1=t2; t2=t; 
  }
  if(t2<0){System.out.println("Ans"+(t2+rt));}
  else{System.out.println("Ans"+t2);} 
 }
}