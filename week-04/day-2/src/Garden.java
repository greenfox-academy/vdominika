public class Garden {
    int flower;
    int trees;
    double waterFlowers;
    double waterTrees;
    double allTheWaters;


    public void watering(double waterFlowers, double waterTrees, double allTheWaters){
        if (waterFlowers < 5){
            waterFlowers = waterFlowers + allTheWaters/2*0.75;
            waterTrees = waterTrees + allTheWaters/2*0.4;
        } else if (waterTrees < 10){
            waterFlowers = waterFlowers;
            waterTrees = waterTrees + allTheWaters*0.4;
        }else{
            waterFlowers = waterFlowers;
            waterTrees = waterTrees;
        }

    }
}

