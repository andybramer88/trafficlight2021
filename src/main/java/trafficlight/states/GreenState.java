package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class GreenState implements State {

    private TrafficLightCtrl ctrl;

    public GreenState(TrafficLightCtrl ctrl) {
        this.ctrl = ctrl;
    }

    @Override
    public void nextState() {
        ctrl.setCurrentState(ctrl.getYellowState());
        ctrl.setPreviousState(this);
    }

    @Override
    public TrafficLightColor getState() {
        return TrafficLightColor.GREEN;
    }

}
