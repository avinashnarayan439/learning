package factoryDesignPattern;

public class FlutterExecutorFactory {
    public static FlutterExecutor CreateExecutorBasedOnPlatform(Platform platform){
        switch (platform){
            case ANDROID -> {return new AndroidFlutterExecutor();
            }
            case IOS -> {return new IosFlutterExecutor();}
        }
    return null;
    }
}
