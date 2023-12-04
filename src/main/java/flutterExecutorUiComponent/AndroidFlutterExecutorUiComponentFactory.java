package flutterExecutorUiComponent;

public class AndroidFlutterExecutorUiComponentFactory implements FlutterExecutorUiComponentFactory{
    @Override
    public AndroidList createList() {
        return null;
    }

    @Override
    public AndroidButton createButton() {
        return null;
    }

    @Override
    public AndroidMenu createMenu() {
        return null;
    }

    @Override
    public FlutterExecutorUiComponentFactory getUiComponentFactory() {
        return new AndroidFlutterExecutorUiComponentFactory();
    }
}
