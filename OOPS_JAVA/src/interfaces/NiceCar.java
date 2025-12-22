package interfaces;

public class NiceCar {
    private Engine engine;   //custom engine
    // Data hiding: private

    private Media player = new CDPlayer();

    public NiceCar() {
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine) { // if u want to add an engine of your own
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        player.start();
    }

    public void stopMusic(){
        player.stop();
    }

    public void upgradeEngine(){
//        this.engine = engine;

        this.engine = new ElectricEngine();
    }
}
