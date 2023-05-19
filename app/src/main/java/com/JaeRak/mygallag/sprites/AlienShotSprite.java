package com.JaeRak.mygallag.sprites;

import android.content.Context;

import com.JaeRak.mygallag.R;
import com.JaeRak.mygallag.SpaceInvadersView;

public class AlienShotSprite extends Sprite{
    private Context context;
    private SpaceInvadersView game;
    public AlienShotSprite(Context context, SpaceInvadersView game, float x, float  y, int dy) {
        super(context, R.drawable.shot_001, x, y);
        this.game = game;
        this.context =context;
        setDy(dy);
    }
}
