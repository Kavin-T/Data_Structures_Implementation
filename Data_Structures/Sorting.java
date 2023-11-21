package Data_Structures;

public class Sorting {
    public static int[] recursiveSelectionSort(int[] arr,int start){
        if(start==arr.length){
            return arr;
        }
        else{
            int index=getMin(arr,start,start-1);
            int temp=arr[start-1];
            arr[start-1]=arr[index];
            arr[index]=temp;
            return recursiveSelectionSort(arr, start+1);
        }
    }
    public static int getMin(int[] arr,int start,int min){
        if(start==arr.length-1){
            return arr[start]<arr[min]?start:min;
        }
        return getMin(arr, start+1, arr[start]<arr[min]?start:min);
    }
    public static int[] recursiveBubbleSort(int[] arr,int start,int end){
        if(end==0){
            return arr;
        }
        if(start==end){
            return recursiveBubbleSort(arr, 0, end-1);
        }
        if(start<end){
            if(arr[start]>arr[end]){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            }
            return recursiveBubbleSort(arr, start+1, end);
        }
        return arr;
    }
    public int[] shellSortAscending(int[] arr){
        for(int g=arr.length/2;g>0;g/=2){
            int i=0,j=g;
            while(j<arr.length){
                if(arr[j]<arr[i]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
                i++;j++;
            }
            i--;
            if(i-g>=0 && arr[i-g]>arr[i]){
                int temp=arr[i-g];
                arr[i-g]=arr[i];
                arr[i]=temp;
            }
        }
        return arr;
    }
    public int[] shellSortDescending(int[] arr){
        for(int g=arr.length/2;g>0;g/=2){
            int i=0,j=g;
            while(j<arr.length){
                if(arr[j]>arr[i]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
                i++;j++;
            }
            i--;
            if(i-g>=0 && arr[i-g]<arr[i]){
                int temp=arr[i-g];
                arr[i-g]=arr[i];
                arr[i]=temp;
            }
        }
        return arr;
    }
    public int[] selectionSortAscending(int[] arr){
        int n=arr.length;
        if(n==0 || n==1){
			return arr;
		}
		int i=0;
		while(i!=n-1){
			int min=arr[i],minindex=i;
			for(int j=i+1;j<n;j++){
				if(arr[j]<min){
					min=arr[j];
					minindex=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[minindex];
			arr[minindex]=temp;
			i++;
		}
        return arr;
    }
    public int[] selectionSortDescending(int[] arr){
        int n=arr.length;
        if(n==0 || n==1){
			return arr;
		}
		int i=0;
		while(i!=n-1){
			int max=arr[i],maxindex=i;
			for(int j=i+1;j<n;j++){
				if(arr[j]>max){
					max=arr[j];
					maxindex=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[maxindex];
			arr[maxindex]=temp;
			i++;
		}
        return arr;
    }
    public int[] insertionSortAscending(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j=i-1,tempi=arr[i];
            while(j>0 && arr[j]>tempi){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=tempi;
        }
        return arr;
    }
    public int[] insertionSortDescending(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j=i-1,tempi=arr[i];
            while(j>=0 && arr[j]<tempi){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=tempi;
        }
        return arr;
    }
    public int[] countSortAscending(int[] arr){
        int[] count=new int[10];
        int res[] =new int[arr.length];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1]; 
        }
        for(int i=0;i<count.length;i++){
            count[i]--;
        }
        for(int i=arr.length-1;i>-1;i--){
            res[count[arr[i]]]=arr[i];
            count[arr[i]]--;
        }
        return res;
    }
    public int[] countSortDescending(int[] arr){
        int[] count=new int[10];
        int res[] =new int[arr.length];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1]; 
        }
        for(int i=0;i<count.length;i++){
            count[i]--;
        }
        for(int i=arr.length-1;i>-1;i--){
            res[count[arr[i]]]=arr[i];
            count[arr[i]]--;
        }
        return res;
    }
}
