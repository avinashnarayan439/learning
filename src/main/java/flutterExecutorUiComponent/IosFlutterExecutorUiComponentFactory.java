package flutterExecutorUiComponent;

public class IosFlutterExecutorUiComponentFactory implements FlutterExecutorUiComponentFactory{
    @Override
    public IosList createList() {
        return null;
    }

    @Override
    public IosButton createButton() {
        return null;
    }

    @Override
    public IosMenu createMenu() {
        return null;
    }

    @Override
    public FlutterExecutorUiComponentFactory getUiComponentFactory() {
        return null;
//        return new IosFlutterExecutorUiComponentFactory();
    }
}
