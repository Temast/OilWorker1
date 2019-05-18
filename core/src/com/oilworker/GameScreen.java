package com.oilworker;

import com.badlogic.gdx.Screen;

import java.util.ArrayList;
import java.util.List;

public class GameScreen implements Screen {
    private GameRender renderer;
    private float runTime;

    private List<GameScene> scenes;
    private int currentScene;

    public GameScreen() {
        scenes = new ArrayList<GameScene>();
        scenes.add(new GameScene());
    }

    public int getCurrentScene() {
        return currentScene;
    }

    public void setCurrentScene(int currentScene) {
        this.currentScene = currentScene;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        runTime += delta;
        //world.update(delta);
        renderer.render(runTime);
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
