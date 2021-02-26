import java.util.*;
import java.math.*;
public class FCFS
{
  public static void WaitingTime(int processes[],int bt[],int wt[],int at[],int n) 
  { 
    int service_time[]=new int[n]; 
    service_time[0]=0; 
    wt[0]=0;  
    for(int i=1;i<n;i++) 
    { 
      int wasted=0;
      service_time[i]=service_time[i-1]+bt[i-1]; 
      wt[i]=service_time[i]-at[i]; 
      if(wt[i]<0) 
      {
        wasted=Math.abs(wt[i]);
	wt[i]=0; 
      }
      service_time[i]=service_time[i]+wasted; 
    } 
  } 

	 
  public static void TurnAroundTime(int processes[],int bt[],int wt[],int tat[],int n) 
  { 
    for (int i=0;i<n;i++) 
    tat[i]=bt[i]+wt[i]; 
  } 


  public static void main(String args[]) 
  {
    int processes[] = {1,2,3,4}; 
    int n = processes.length;  
    int burst_time[] = {10,20,10,5}; 
    int arrival_time[] = {0,6,60,110};
    int wt[]=new int[n];
    int tat[]=new int[n]; 
    Scanner sc=new Scanner(System.in);
    Integer i;
    String url;
    WaitingTime(processes,burst_time,wt,arrival_time,n);
    TurnAroundTime(processes,burst_time,wt,tat,n);
    do
    {
      System.out.println("Enter Choice : ");
      System.out.println("1. Waiting Time : ");
      System.out.println("2. Turnaround Time : ");
      System.out.println("3. Completion Time : ");
      System.out.println("4. Average Waiting Time : ");
      System.out.println("5. Average Turn Around Time : ");
      System.out.println();
      i=sc.nextInt();
      switch(i)
      {
        case 1:System.out.println();
               for(int j=0;j<n;j++)
               {
                 System.out.println(j+1+"\t"+wt[j]);
               }
               break;
   
        case 2:System.out.println();
               for(int j=0;j<n;j++)
               {
                 System.out.println(j+1+"\t"+tat[j]);
               }
               break;

        case 3:for(int j=0;j<n;j++)
               {
                 int cmpTime=arrival_time[j]+tat[j];
                 System.out.println(j+1+"\t"+cmpTime);
               }
               break;
        case 4:int total_Wt=0;
               for(int j=0;j<n;j++)
               {
                 total_Wt+=wt[j];
               }
               System.out.println((float)total_Wt/(float)n);
               break;
           
        case 5:int total_Tat=0;
               for(int j=0;j<n;j++)
               {
                 total_Tat+=tat[j];
               }
               System.out.println((float)total_Tat/(float)n);
               break;
            
       default:System.out.println("Invalid Choice ...");
      }
      System.out.println("Want to enter More ?(Y/N) : ");
      url=sc.next();
    }while(url.equals("Y")||url.equals("y"));
  } 
} 



