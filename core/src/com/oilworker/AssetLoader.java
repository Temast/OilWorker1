package com.oilworker;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class AssetLoader {
    public static Texture texture;
    public static TextureRegion[] backgrounds;


    public AssetLoader() {
        texture = new Texture(Gdx.files.internal("data/bg_map.png"));
        backgrounds = new TextureRegion[4];
        backgrounds[0] = new TextureRegion(texture);


    }
}


//вырезание текстуры
//bg = new TextureRegion(texture, 0, 0, 136, 43);
//        bg.flip(false, true);
