package jp.co.komura.Main;

import java.io.UnsupportedEncodingException;

import jp.co.komura.TemplateMethod.AbstractDisplay;
import jp.co.komura.TemplateMethod.CharDisplay;
import jp.co.komura.TemplateMethod.StringDisplay;

public class TemplateMethodMain {

    public static void main(String[] args) throws UnsupportedEncodingException {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello, World.");
        AbstractDisplay d3 = new StringDisplay("こんにちは。");

        d1.display();
        d2.display();
        d3.display();
    }
}
