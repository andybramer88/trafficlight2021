import org.junit.jupiter.api.*;
import trafficlight.ctrl.TrafficLightCtrl;
import trafficlight.gui.TrafficLightGui;
import trafficlight.states.TrafficLightColor;

public class testcases {



    @BeforeAll
    static void init(){
    }

    @BeforeEach
    void setUp(){
    }

    @Test
    public void testStateOff(){
        boolean actual = TrafficLightCtrl.getInstance().getCurrentState().equals(TrafficLightColor.OFF);
        Assertions.assertEquals(actual, false);
    }

    @Test
    /*public void testStateRed(){

    }*/

}
