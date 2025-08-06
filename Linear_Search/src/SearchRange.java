//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SearchRange {
    public static void main(String[] args) {
        int[] a={15,2,4,1,6};
        int x=3;
        int start=1;
        int end=4;
//        System.out.print("Location: "+Linear(a,a.length,x));
        System.out.print("Location: "+Linear2(a,x,start,end));

    }

//    static int Linear(int[] a, int n, int x){
//int i=0;
//for(int e: a){
//    if(e==x) {
//        System.out.println("Found");
//        return i;
//    }
//    i++;
////}
//        System.out.println("Not found");
//return -1;
//    }

    static int Linear2(int[] a, int x,int beg,int end){
        if(end>a.length || beg<0){
            System.out.println("Invalid range");
            return -1;
        }

        for(int i=beg;i<end;i++){
            if(a[i]==x) {
                System.out.println("Found");
                return i;
            }
        }
        System.out.println("Not found");
        return -1;
    }
}