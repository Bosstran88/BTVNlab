package lab10;

public class Client {
    public Client(){

    }
    public void doUnchecked(String value){
        //Cần phải check exception, nếu không --> bug
        int result = canThrowUncheckedException(value);
        System.out.println("result="+ result);
    }
    private int canThrowUncheckedException(String value){
        return Integer.parseInt(value);
    }
    public  void doChecked(){
        try{
            //Bước phải check exceptions ở đây! K cách nào khác
            canThrowCheckedException();
            System.out.println("OK");
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
    private int canThrowCheckedException() throws Exception{
        throw new Exception("Failure");
    }

}
