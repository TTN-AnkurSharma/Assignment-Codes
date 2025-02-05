public class A4 {
    public static void main(String[] args) {
        OS redmi=Mobile.getOs("Android");
        redmi.spec();
    }
}
interface OS {
   void spec();}
class Android implements OS{
    @Override
    public void spec() {
        System.out.println("This is android");
    }
}
class IOS implements OS
{
    @Override
    public void spec()
    {
        System.out.println("This is IOS");
    }
}
class Mobile
{
    public static OS getOs(String os)
    {
        if(os.equals("Android"))
            return new Android();
        else
            return new IOS();
    }
}