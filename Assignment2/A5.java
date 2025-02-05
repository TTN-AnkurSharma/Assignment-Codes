public class A5 {
    public static void main(String[] args) {
        Dbconn db=Dbconn.getConn();
        Dbconn db2=Dbconn.getConn();
        System.out.println(db==db2);
    }
}
class Dbconn
{
    private static Dbconn conn;
    private Dbconn(){ }
    public static Dbconn getConn()
    {
        if(conn==null)
            conn=new Dbconn();
       return conn;

    }
}