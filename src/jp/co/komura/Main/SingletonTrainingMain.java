package jp.co.komura.Main;

import jp.co.komura.Singleton.TicketMaker;

public class SingletonTrainingMain {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ":" + TicketMaker.getInstance().getNextTicketNumber());
        }
    }
}
