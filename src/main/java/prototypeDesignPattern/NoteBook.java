package prototypeDesignPattern;

public class NoteBook {
    private PageType pageType;
    private int pageCount;
    private RuleType ruleType;
    private FrontPage frontPage;
    private FactPage factPage;

    public NoteBook(PageType pageType, int pageCount, RuleType ruleType) {
        this.pageType = pageType;
        this.pageCount = pageCount;
        this.ruleType = ruleType;
    }
    private NoteBook(){

    }
    public NoteBook clone(){
        NoteBook newNoteBook= new NoteBook();
        newNoteBook.pageType=this.pageType;
        newNoteBook.pageCount=this.pageCount;
        newNoteBook.ruleType=this.ruleType;
        return newNoteBook;
    }

    public FrontPage getFrontPage() {
        return frontPage;
    }

    public void setFrontPage(FrontPage frontPage) {
        this.frontPage = frontPage;
    }

    public FactPage getFactPage() {
        return factPage;
    }

    public void setFactPage(FactPage factPage) {
        this.factPage = factPage;
    }
}
