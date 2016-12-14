package com.example.meghan.pong;


import android.graphics.RectF;

//To implemet once I can get the view working
//for the user to control
public class Paddle {

    // RectF is an object that holds four coordinates - just what we need
    private RectF rect;

    // How long and high our paddle will be
    private float length;
    private float height;

    // X is the far left of the rectangle which forms our paddle
    private float x;

    // Y is the top coordinate
    private float y;

    // old the pixels per second for the speed of the paddle
    private float paddleSpeed;

    //  paddle move
    public final int STOPPED = 0;
    public final int LEFT = 1;
    public final int RIGHT = 2;

    // Is the paddle moving and in which direction
    private int paddleMoving = STOPPED;

    // This the the constructor method
    // When we create an object from this class we will pass
    // in the screen width and height
    public Paddle(int screenX, int screenY){
        // 130 pixels wide and 20 pixels high
        length = 130;
        height = 20;

        // Start paddle in roughly the sceen centre
        x = screenX / 2;
        y = screenY - 20;

        // Initialize rectangle
        rect = new RectF(x, y, x + length, y + height);

        // How fast is the paddle in pixels per second
        paddleSpeed = 350;
    }


    // This is a getter method to make the rectangle that
    public RectF getRect(){
        return rect;
    }

    // method  left, right or nowhere
    public void setMovementState(int state){
        paddleMoving = state;
    }

    // if the paddle needs to move and changes the coordinates
    public void update(long fps){
        if(paddleMoving == LEFT){
            x = x - paddleSpeed / fps;
        }

        if(paddleMoving == RIGHT){
            x = x + paddleSpeed / fps;
        }

        rect.left = x;
        rect.right = x + length;
    }

}
