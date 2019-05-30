package soundsystem;

import org.springframework.stereotype.Component;

//@Component
public class CompactDisc {

    public CompactDisc() {
        super();
        System.out.println("CompactDisc...");
    }

    public void play(){
        System.out.println("Playing music...");
    }
}
