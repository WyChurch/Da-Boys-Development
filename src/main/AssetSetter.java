package src.main;

import src.object.OBJ_Key;

public class AssetSetter {

    GamePanel gp;

    public AssetSetter(GamePanel gp){

        this.gp = gp;

    }

    public void setObject(){

        gp.obj[0] = new OBJ_Key();

    }
    
}
