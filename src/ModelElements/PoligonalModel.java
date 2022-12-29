package ModelElements;

import Stuff.Point3D;

public class PoligonalModel {
    public Poligon poligons;
    public Texture textures;

//    конструктор
    public PoligonalModel(Texture inputTexture){
        poligons = new Poligon( new Point3D());
        textures = inputTexture;
    }
}
