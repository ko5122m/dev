package jp.co.komura.Main;

import jp.co.komura.Singleton.Singleton;

public class SingletonMain {

    public static void main(String[] args) {
        System.out.println("Start.");

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2) {
            System.out.println("obj1とobj2は同じインスタンスです。");
        } else {
            System.out.println("obj1とobj2は違うインスタンスです。");
        }

        System.out.println("End.");
    }
}
