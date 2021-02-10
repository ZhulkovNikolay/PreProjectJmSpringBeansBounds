package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Timer {
//    Timer timer;
//    public Timer() {
//    }

//    public static Timer getTimer() {
//        return new Timer();
//    }


//    @Autowired
//    public void setTimer(Timer timer) {
//        this.timer = timer;
//    }
    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
