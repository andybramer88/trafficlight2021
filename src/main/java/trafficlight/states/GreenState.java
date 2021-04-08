package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class GreenState implements State {
    private TrafficLightCtrl ctrl;

    public GreenState(TrafficLightCtrl ctrl) {
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
