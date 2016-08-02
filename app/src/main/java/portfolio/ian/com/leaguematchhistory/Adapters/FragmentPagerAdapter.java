package portfolio.ian.com.leaguematchhistory.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import java.util.List;

/**
 * Created by Ian on 26/05/2016.
 */
public class FragmentPagerAdapter extends android.support.v4.app.FragmentPagerAdapter {

    List<Fragment> listFragments;


    public FragmentPagerAdapter(FragmentManager fm, List<Fragment> listFragments) {
        super(fm);
        this.listFragments = listFragments;

    }

    @Override
    public Fragment getItem(int position) {
        return listFragments.get(position);
    }

    @Override
    public int getCount() {
        return listFragments.size();
    }
}
