package flutterExecutorUiComponent;

public interface FlutterExecutorUiComponentFactory {
    List createList();
    Button createButton();
    Menu createMenu();
    FlutterExecutorUiComponentFactory getUiComponentFactory();
}
