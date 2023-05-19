package com.JaeRak.mygallag.items;


import android.content.Context;

import com.JaeRak.mygallag.R;
import com.JaeRak.mygallag.SpaceInvadersView;
import com.JaeRak.mygallag.sprites.Sprite;

import java.util.Timer;
import java.util.TimerTask;

public class HealItemSprite extends Sprite {
    SpaceInvadersView game;

    public HealItemSprite(Context context, SpaceInvadersView game, int x, int y, int dx, int dy) {
        super(context, R.drawable.heal_item, x ,y);
        this.game = game;
        this.dx = dx;
        this.dy = dy;

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                autoRemove();
            }
        }, 10000);
    }
    private void autoRemove() { game.removeSprite(this);}

    @Override
    public void move() { //dx 와 dy 값을 바꿈
        if((dx<0) && (x <120)){
            dx *=-1; return;
        }
        if((dx>0) && (x > game.screenW - 120)){
            dx *= -1; return;
        }if(y < 120){
            dy *= -1; return;
        }if((dy>0) && (y> game.screenH-120)){
            dy *= -1; return;
        }
        super.move();
    }
}
