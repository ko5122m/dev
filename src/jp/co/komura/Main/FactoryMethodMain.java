package jp.co.komura.Main;

import jp.co.komura.FactoryMethod.framework.Factory;
import jp.co.komura.FactoryMethod.framework.Product;
import jp.co.komura.FactoryMethod.idcard.IDCardFactory;

public class FactoryMethodMain {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();

        Product card1 = factory.create("結城浩");
        Product card2 = factory.create("とむら");
        Product card3 = factory.create("佐藤花子");

        card1.use();
        card2.use();
        card3.use();
    }
}
