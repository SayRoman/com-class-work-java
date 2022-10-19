package ClassWork.Interfaces;

public class DriversPlace implements SpeedControl, Gas, Brake, Helm {

    boolean isUseGas = false;
    boolean isUseBrake = false;
    boolean isHelmSpin = false;

    public boolean isUseGas() {
        return isUseGas;
    }

    public boolean isUseBrake() {
        return isUseBrake;
    }

    public boolean isHelmSpin() {
        return isHelmSpin;
    }


    public void chekPedalPosition() {

    }
}

