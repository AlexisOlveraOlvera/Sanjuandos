package mecalogik.com.sanjuandos;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private TextView mPricipallabel;

    private TextView mRegionesLabel;

    private ViewPager mMainPager;

    private PagerViewAdaopter mPagerViewAdapter;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mPricipallabel = (TextView) findViewById(R.id.tvpricipalfiles);
        mRegionesLabel = (TextView) findViewById(R.id.tvregiones);

        mMainPager = (ViewPager) findViewById(R.id.viewp);
        mMainPager.setOffscreenPageLimit(2);

        mPagerViewAdapter = new PagerViewAdaopter(getSupportFragmentManager());
        mMainPager.setAdapter(mPagerViewAdapter);

        mPricipallabel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMainPager.setCurrentItem(0);

            }
        });



        mRegionesLabel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMainPager.setCurrentItem(1);
            }
        });

        mMainPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                changeTabs(position);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @SuppressLint("NewApi")
    private void changeTabs(int position) {

        if(position == 0){
            mPricipallabel.setTextColor(getColor(R.color.textTabBright));
            mPricipallabel.setTextSize(22);



            mRegionesLabel.setTextColor(getColor(R.color.textTabLight));
            mRegionesLabel.setTextSize(16);

        }


        if (position == 1){
            mPricipallabel.setTextColor(getColor(R.color.textTabLight));
            mPricipallabel.setTextSize(16);


            mRegionesLabel.setTextColor(getColor(R.color.textTabBright));
            mRegionesLabel.setTextSize(22);
        }
    }

}


