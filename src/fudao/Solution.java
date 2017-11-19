package fudao;

/**
 * Created by Administrator on 2017/11/18 0018.
 */
public class Solution {

    public int InversePairs(int [] array) {
               if(array.length==0) return 0;
              if(array.length==1) return 0;
                int i = solve(array,0,array.length-1);
              return i;
         }

           public int solve(int[] arr,int start,int end){
                 if(start>=end) return 0;
                 int mid = (start+end)/2;
                     int left = solve(arr,start,mid);
                     int right = solve(arr, mid+1, end);
                    int i=mid;int j=end;
                     int count = left+right;
                     while(i>=start && j>=mid+1){
                            if(arr[j]<arr[i]){
                                    count += j-mid;
                                     i--;
                                 }else if(arr[i]==arr[j]){
                                   count += j-mid-1;
                                    i--;
                              }else{
                                  j--;
                               }
                         }

                    i = start;j=mid+1;
                    int[] t_arr = new int[end-start+1];
                   int k=0;
                  while(i<=mid&&j<=end){
                        if(arr[i]<arr[j]){
                               t_arr[k] = arr[i];
                                 i++;
                                }else{
                                   t_arr[k] = arr[j];
                                  j++;
                             }
                          k++;
                        }
                     while(i<=mid){
                            t_arr[k] = arr[i];
                             i++;
                          k++;
                      }
                 while(j<=end){
                         t_arr[k] = arr[j];
                           j++;
                          k++;
                   }
                  for(k=0;k<end-start+1;k++){
                            arr[start+k] = t_arr[k];
                      }
                   return count;
                }
  }

