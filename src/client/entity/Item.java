package client.entity;
import client.model.Animable;
import client.model.Model;

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public final class Item extends Animable {

  @Override
  public final Model getRotatedModel() {
    ItemDef itemDef = ItemDef.forID(ID);
    return itemDef.method201(anInt1559);
  }

  public Item() {
  }

  public int ID;
  public int x;
  public int y;
  public int anInt1559;
}
