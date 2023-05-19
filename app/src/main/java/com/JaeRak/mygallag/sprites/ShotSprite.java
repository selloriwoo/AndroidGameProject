package com.JaeRak.mygallag.sprites;


import android.content.Context;

import com.JaeRak.mygallag.SpaceInvadersView;

public class ShotSprite extends Sprite{

    private SpaceInvadersView game;

    public ShotSprite(Context context, SpaceInvadersView game, int redId, float x, float y, int dy) {
        super(context, redId, x, y);
        this.game = game;
        setDy(dy);
    }
}
