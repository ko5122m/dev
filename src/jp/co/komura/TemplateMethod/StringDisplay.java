package jp.co.komura.TemplateMethod;

import java.io.UnsupportedEncodingException;

public class StringDisplay extends AbstractDisplay {

    private String string;
    private int width;

    public StringDisplay(String string) throws UnsupportedEncodingException {
        this.string = string;
        this.width = string.getBytes("Shift-JIS").length;
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    @Override
    protected void open() {
        printLine();
    }

    @Override
    protected void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    protected void close() {
        printLine();
    }
}
