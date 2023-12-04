package prototypeDesignPattern;

import flutterExecutorUiComponent.List;

import java.util.HashMap;
import java.util.Map;

public class NoteBookRegistry {
    Map<String,NoteBook> noteBooks=new HashMap<>();
     void registerNoteBook(String name,NoteBook noteBook){
         noteBooks.put(name,noteBook);

    }
    NoteBook getNotebook(String name){
         return noteBooks.get(name).clone();
    }
}
