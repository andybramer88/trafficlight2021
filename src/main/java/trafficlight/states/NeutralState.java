package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class NeutralState implements State{

    private TrafficLightCtrl ctrl;

    public NeutralState(TrafficLightCtrl ctrl) { this.ctrl = ctrl;}

    @Override
    public void nextState() {
        ctrl.setCurrentState(ctrl.getRedState());
    }

    @Override
    public TrafficLightColor getState() {
        return TrafficLightColor.OFF;
    }
}
