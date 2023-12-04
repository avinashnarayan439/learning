package flutterExecutorUiComponent;

public class Client {
    public static void main(String[] args) {
        FlutterExecutorUiComponentFactory flutterExecutorUiComponentFactory=FlutterExecutorUiComponentFactoryMethod.
                createExecutorBasedOnPlatform(Platform.IOS).getUiComponentFactory();
    }
}
