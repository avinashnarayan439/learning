package flutterExecutorUiComponent;

public class FlutterExecutorUiComponentFactoryMethod {
    public static FlutterExecutorUiComponentFactory createExecutorBasedOnPlatform(Platform platform){
        switch (platform){
            case IOS -> {return new IosFlutterExecutorUiComponentFactory();}
            case ANDROID->{return new AndroidFlutterExecutorUiComponentFactory();}
        }
    return null;}
}
