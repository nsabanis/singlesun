package singlesun.SingleSun;

/**
 *
 * @author nick.sabanis
 */
public class Sun {
    
    private static Sun sun;
    
    private Sun(){
        
    }
    
    public static Sun getUniqueSun(){
        if(sun == null){
            System.out.println("Sun is null, so Sun is created");
            sun = new Sun();
        }else{
            System.out.println("Sun is not null, so object Sun is returned");
        }
        return sun;
    }
    
    
}
