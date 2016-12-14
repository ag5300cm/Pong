package com.example.meghan.pong;



import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.Button;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.ImageView;

//main screen is for game options
public class MainActivity extends Activity { // implements View.OnTouchListener {
    //Use AppCompatDelegate { instead?

    //@Override
    //public boolean onTouchEvent ()


    //How to get imageView to work? Why can't I get imageview to work!!!!!!!!!!!!!!!!!!!!!!!!!!
    //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // The size of the screen in pixels
        int screenX;
        int screenY;

        //image view is a default for running the code and will be used to display the game
        ImageView ourFrame = (ImageView) findViewById(R.id.imageView);
        //SurfaceView ourFrame = (SurfaceView) findViewById(R.id.surfaceView); //Which one will Work??? 

        //Making a bitmap object, for the game image layout
        Bitmap ourBitmap = Bitmap.createBitmap(300, 600, Bitmap.Config.ARGB_8888);
        Canvas ourCanvas = new Canvas(ourBitmap);

        //Used for drawing
        Paint paint = new Paint();

        //Backround Coloring
        ourCanvas.drawColor(Color.BLACK);

        //Change the color of the virtual paint brush
        paint.setColor(Color.argb(255, 255, 255, 255));

        //TESTING ONE, TWO, THREE!
        ourCanvas.drawText("Score: 42 to 7", 10, 10, paint);
        ourCanvas.drawLine(10, 50, 200, 50, paint);
        ourCanvas.drawCircle(110, 160, 100, paint);
        ourCanvas.drawPoint(10, 260, paint);

        // Putting canvas in frame
        ourFrame.setImageBitmap(ourBitmap);


    }


    /*
    PongView PongView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        PongView = new PongView(this);
        setContentView(PongView);
    }

    class PongView extends SurfaceView implements  Runnable {

        // This is our thread
        Thread gameThread = null;

        // This is new. We need a SurfaceHolder
        // When we use Paint and Canvas in a thread
        // We will see it in action in the draw method soon.
        SurfaceHolder ourHolder;

        // A boolean which we will set and unset
        // when the game is running- or not.
        volatile boolean playing;

        // Game is paused at the start
        boolean paused = true;

        // A Canvas and a Paint object
        Canvas canvas;
        Paint paint;

        // This variable tracks the game frame rate
        long fps;

        // This is used to help calculate the fps
        private long timeThisFrame;

        // The size of the screen in pixels
        int screenX;
        int screenY;

        public PongView(Context context) {

            // SurfaceView class to set up our object.

            super(context);

            // Initialize ourHolder and paint objects
            ourHolder = getHolder();
            paint = new Paint();

            // Get a Display object to access screen details
            Display display = getWindowManager().getDefaultDisplay();
            // Load the resolution into a Point object
            Point size = new Point();
            display.getSize(size);

            screenX = size.x;
            screenY = size.y;

        }


    }
    */


    /*
    //for solo play
    public Button mbutton_one_player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbutton_one_player = (Button) findViewById(R.id.button_one_player);
        mbutton_one_player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Todo make new class for one player game
                Intent start_oneplayergame = new Intent(getApplicationContext(),
                        oneplayergame.class);
                        
                startActivity(start_oneplayergame);
            }
        });

    }

    */
}
