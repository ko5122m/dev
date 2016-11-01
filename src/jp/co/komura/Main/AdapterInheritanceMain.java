package jp.co.komura.Main;

import jp.co.komura.AdapterInheritance.PrintBanner;
import jp.co.komura.AdapterInheritance.IF.Print;

public class AdapterInheritanceMain {

    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
