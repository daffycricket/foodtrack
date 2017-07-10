package org.nla.foodtrack;

public class MainPresenter implements Presenter {

    private FoodCatalog foodCatalog;
    private MainView view;

    public MainPresenter(MainView view, FoodCatalog foodCatalog) {
        this.view = view;
        this.foodCatalog = foodCatalog;
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    public void addFoodEaten() {
        view.onFoodEatenAdded();
    }
}
