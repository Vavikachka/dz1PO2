package ModelElements;

import java.security.cert.PolicyNode;
import java.util.ArrayList;

public class Scene<Type1,Type2> {
    public int id;
    public ArrayList<PoligonalModel> models = new ArrayList<PoligonalModel>();
    public ArrayList<Flash> flashes = new ArrayList<>();
    public ArrayList<Camera> cameras = new ArrayList<>();


    public Scene(PoligonalModel inputModels, Camera inputCamera){
        models.add(inputModels);
        cameras.add(inputCamera);
    }
    public Type1 method1(Type1 t){
        return t;
    }
    public Type2 method2(Type2 t1, Type2 t2){
        return t1;
    }
}
