package jp.co.komura.FactoryMethod.idcard;

import java.util.HashMap;
import java.util.Map;

import jp.co.komura.FactoryMethod.framework.Factory;
import jp.co.komura.FactoryMethod.framework.Product;

public class IDCardFactory extends Factory {

    private Map<Integer, String> database = new HashMap<Integer, String>();

    private int serialNo = 100;

    @Override
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serialNo++);

    }

    @Override
    protected void registerProduct(Product product) {
        IDCard card = (IDCard)product;
        database.put(card.getSerialNo(), card.getOwner());
    }

    public Map<Integer, String> getOwners() {
        return database;
    }
}
