package factoryDesignPattern;

public class AndroidFlutterExecutor implements FlutterExecutor{
    @Override
    public AndroidFlutterExecutor startapp() {
        return new AndroidFlutterExecutor();

    }

    @Override
    public void printHelloWorld() {

    }

    @Override
    public AndroidButton Createlist() {
        return new AndroidButton();
    }
}
