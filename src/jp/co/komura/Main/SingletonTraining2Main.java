package jp.co.komura.Main;

import jp.co.komura.Singleton.Triple;

public class SingletonTraining2Main {

    public static void main(String[] args) {

        Triple triple1 = Triple.getInstance(0);
        Triple triple2 = Triple.getInstance(1);
        Triple triple3 = Triple.getInstance(2);

        System.out.println(triple1);
        System.out.println(triple2);
        System.out.println(triple3);
    }

}
