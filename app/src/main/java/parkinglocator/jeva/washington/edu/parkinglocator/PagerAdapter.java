package parkinglocator.jeva.washington.edu.parkinglocator;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int tabCount;

    public PagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    //Overriding method getItem
    @Override
    public Fragment getItem(int position) {
        //Returning the current tabs
        switch (position) {
            case 0:
                ParkFragment tab1 = new ParkFragment();
                return tab1;
            case 1:
                FindCarFragment tab2 = new FindCarFragment();
                return tab2;
            case 2:
                SavedLocationsFragment tab3 = new SavedLocationsFragment();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
