package com.oilworker;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class GameRender {
    private int gameHeight;
    private OrthographicCamera cam;
    private ShapeRenderer shapeRenderer;
    private SpriteBatch batcher;
    private GameScreen screen;


    public GameRender(int gameHeight) {
        this.gameHeight = gameHeight;
        this.screen = screen;

        cam = new OrthographicCamera();
        cam.setToOrtho(true, 136, gameHeight);

        batcher = new SpriteBatch();
        batcher.setProjectionMatrix(cam.combined);
        shapeRenderer = new ShapeRenderer();
        shapeRenderer.setProjectionMatrix(cam.combined);
    }

    public void render(float runTime) {

        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

//        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
//
//        shapeRenderer.setColor(55 / 255.0f, 80 / 255.0f, 100 / 255.0f, 1);
//        shapeRenderer.rect(0, 0, 136, midPointY + 66);
//
//        shapeRenderer.setColor(111 / 255.0f, 186 / 255.0f, 45 / 255.0f, 1);
//        shapeRenderer.rect(0, midPointY + 66, 136, 11);
//
//        shapeRenderer.setColor(147 / 255.0f, 80 / 255.0f, 27 / 255.0f, 1);
//        shapeRenderer.rect(0, midPointY + 77, 136, 52);
//
//        shapeRenderer.end();}

        switch(screen.getCurrentScene()){
            case 0:{
                batcher.begin();
                batcher.disableBlending();
                batcher.draw(bg, 0, midPointY + 23, 136, 43);
                batcher.end();

            }
        }

    }
}
