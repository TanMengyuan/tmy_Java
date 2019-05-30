package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {

    @Autowired(required = false)
    private CompactDisc cd;

    @Autowired
    private Power power;

//    @Autowired
//    public void setCd(CompactDisc cd) {
//        this.cd = cd;
//        System.out.println("Setting CD...");
//    }
//
//    @Autowired
//    public void setPower(Power power) {
//        this.power = power;
//        System.out.println("Setting Power...");
//    }

    public CDPlayer() {
        super();
        System.out.println("CDPlayer...");
    }

//    @Autowired
//    public CDPlayer(CompactDisc cd) {
//        this.cd = cd;
//        System.out.println("CDPlayer has args...");
//    }
//
//    @Autowired
//    public CDPlayer(CompactDisc cd, Power power) {
//        this.cd = cd;
//        this.power = power;
//        System.out.println("CDPlayer has two args...");
//    }

//    @Autowired
//    public void prepare(CompactDisc cd, Power power){
//        this.cd = cd;
//        this.power = power;
//        System.out.println("Preparing...");
//    }

    public void play(){
        power.supply();
        if (cd != null) {
            cd.play();
        }
    }
}
