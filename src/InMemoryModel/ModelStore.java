package InMemoryModel;

import ModelElements.*;

import java.util.ArrayList;

public class ModelStore implements IModeChanger{
    public ArrayList<PoligonalModel> models = new ArrayList<PoligonalModel>();
    public ArrayList<Scene> scenes = new ArrayList<Scene>();
    public ArrayList<Flash> flashes = new ArrayList<Flash>();
    public ArrayList<Camera> cameras = new ArrayList<Camera>();
    private ArrayList<IModelChangerObserver> changedObservers = new ArrayList<IModelChangerObserver>();

    public  ModelStore(Texture texture){
        models.add(new PoligonalModel(texture));
        flashes.add(new Flash());
        cameras.add(new Camera());
        scenes.add(new Scene(models.get(0), cameras.get(0)));
    }
    @Override
    public void notifyChange(IModeChanger sender){

    }

    public Scene getScene(int sceneNumber){
        return scenes.get(sceneNumber);
    }
}
