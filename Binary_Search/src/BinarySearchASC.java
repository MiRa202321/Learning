//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BinarySearchASC {
    public static void main(String[] args) {
        int[] a={-48,-5,0,1,56,58,77};
        int target=77;

        System.out.println(bin(a,target));

        }
        static int bin(int[] a, int t){
        int start=0;
        int end= a.length -1;
        
        while(start<=end){
            int mid= start + ((end-start)/2);
            


             if (a[mid]<t) start=mid+1;

            else if(a[mid]>t)end=mid-1;

            else return mid;
                

        }
        return -1;
        }
    }
