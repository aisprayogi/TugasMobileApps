package tugas.mobile.apps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);
        startAnimating();
    }

    private void startAnimating() {

        final ImageView logo1 = (ImageView) findViewById(R.id.imageView1);

        Animation fade1 = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        logo1.startAnimation(fade1);

        fade1.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationEnd(Animation animation) {



                    startActivity(new Intent(Splash.this, MainActivity.class));
                    Splash.this.finish();



            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        });

    }
    @Override
    protected void onPause() {
        super.onPause();
        // Stop the animation
        ImageView logo1 = (ImageView) findViewById(R.id.imageView1);
        logo1.clearAnimation();

    }

    @Override
    protected void onResume() {
        super.onResume();
        startAnimating();
    }

}
