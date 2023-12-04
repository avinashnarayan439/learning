package prototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        NoteBookRegistry noteBookRegistry=new NoteBookRegistry();
        noteBookRegistry.registerNoteBook("a4_rule_120",new NoteBook(
                PageType.A4,
                120,
                RuleType.PLAIN
        ));
        noteBookRegistry.registerNoteBook("a4_plain_120",new NoteBook(
                PageType.A5,
                240,
                RuleType.RULED
        ));
        java.util.List<String>input= List.of(
                "A4_rule_120",
                "A4_rule_120",
                "A4_rule_120",
                "A3_rule_120",
                "A3_plain_120",
                "A3_plain_120",
                "A4_plain_120"
        );
        List<NoteBook> noteBooks=new ArrayList<>();
        for(String inp:input){
            NoteBook prototype=noteBookRegistry.getNotebook(inp);
            if(prototype==null){
                continue;
            }
            prototype.setFactPage(new FactPage());
            prototype.setFrontPage(new FrontPage());
            noteBooks.add(prototype);

        }
    }
}
