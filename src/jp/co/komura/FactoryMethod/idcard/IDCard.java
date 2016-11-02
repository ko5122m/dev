package jp.co.komura.FactoryMethod.idcard;

import jp.co.komura.FactoryMethod.framework.Product;

public class IDCard extends Product {

    private String owner;
    private int serialNo;

    IDCard(String owner, int serialNo) {
        System.out.println(owner + "（" + serialNo + "）のカードを作ります。");
        this.owner = owner;
        this.serialNo = serialNo;
    }

    @Override
    public void use() {
        System.out.println(owner + "（" + serialNo + "）のカードを使います。");
    }

    public String getOwner() {
        return owner;
    }

    public int getSerialNo() {
        return serialNo;
    }
}
