package jp.co.komura.Main;

import jp.co.komura.AdapterPolymorphism.Print;
import jp.co.komura.AdapterPolymorphism.PrintBanner;

public class AdapterPolymorphismMain {

    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
