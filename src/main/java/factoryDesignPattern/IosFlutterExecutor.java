package factoryDesignPattern;

public class IosFlutterExecutor implements FlutterExecutor{
    @Override
    public FlutterExecutor startapp() {
        return new IosFlutterExecutor();

    }

    @Override
    public void printHelloWorld() {

    }

    @Override
    public IosButton Createlist() {
        return new IosButton();
    }
}
