package factoryDesignPattern;

public class ClientFactoryDesignPattern {
    public static void main(String[] args) {
        FlutterExecutor flutterExecutor=FlutterExecutorFactory.
                CreateExecutorBasedOnPlatform(Platform.ANDROID);
        FlutterExecutor flutterExecutor1=FlutterExecutorFactory.CreateExecutorBasedOnPlatform(Platform.IOS);
    }
}
