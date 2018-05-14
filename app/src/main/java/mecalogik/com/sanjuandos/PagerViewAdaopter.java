package mecalogik.com.sanjuandos;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Ryzen on 11/05/2018.
 */

public class PagerViewAdaopter extends FragmentPagerAdapter{
    public PagerViewAdaopter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:

                PrincipalFragment principalFragment = new PrincipalFragment();
                return principalFragment;

            case 1:
                RegionesFragment regionesFragment = new RegionesFragment();
                return regionesFragment;
                default:
                    return null;

        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
