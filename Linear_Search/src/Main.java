//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] a={15,2,4,1,6};
        int x=1;
        System.out.print("Location: "+Linear(a,a.length,x));

    }

    static int Linear(int[] a, int n, int x){
int i=0;
for(int e: a){
    if(e==x) {
        System.out.println("Found");
        return i;
    }
    i++;
}
        System.out.println("Not found");
return -1;
    }
}