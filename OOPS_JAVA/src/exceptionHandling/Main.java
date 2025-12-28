package exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
//            int c = a / b;
//            divide(a, b);     // by zero
//            This will always execute.
            //mimicing
//            throw new Exception("just for fun");

            String name = "Rashmi";
            if(name.equals("Rashmi")){
                throw new MyException("name is Rahshmi");  // name is Rahshmi
//                This will always execute.
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }/// by zero
            catch (Exception e){
                System.out.println("normal exception");
            } finally {  // only one finally block
            System.out.println("This will always execute.");
        }
    }

  static  int divide (int a, int b) throws ArithmeticException  {
//        return a/b;

      if(b==0){
          throw new ArithmeticException("Please do not divide by zero");
      }
      return a/b;
    }
}
