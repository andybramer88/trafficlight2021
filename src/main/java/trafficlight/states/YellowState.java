package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class YellowState implements State {
    private TrafficLightCtrl ctrl;

    public YellowState(TrafficLightCtrl ctrl) {
        this.ctrl = ctrl;
    }

    @Override
    public void nextState() {

    }

    @Override
    public TrafficLightColor getState() {
        return null;
    }
}
