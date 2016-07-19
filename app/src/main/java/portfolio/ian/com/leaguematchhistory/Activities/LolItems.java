package portfolio.ian.com.leaguematchhistory.Activities;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import portfolio.ian.com.leaguematchhistory.*;
import portfolio.ian.com.leaguematchhistory.Constants.*;
import portfolio.ian.com.leaguematchhistory.DataHandling.*;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * Created by Ian on 26/05/2016.
 */
public class LolItems extends Fragment {

    ItemsViewAdapterLandscape landscapeAdapter;
    ItemsViewAdapter portraitAdapter;
    ListView listViewPortrait, listViewLandscape;
    static ArrayList<InGameItems> itemArrayList = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater,
                                @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View v = null;
        int rotation = getActivity().getWindowManager().getDefaultDisplay().getRotation();
        if (rotation == Surface.ROTATION_90 || rotation == Surface.ROTATION_270) {
            v = inflater.inflate(R.layout.activity_lol_items, container, false);
            listViewLandscape = (ListView) v.findViewById(R.id.itemList);
        }
        if (rotation == Surface.ROTATION_0 || rotation == Surface.ROTATION_180) {
            v = inflater.inflate(R.layout.item_portrait_layout, container, false);
            listViewPortrait = (ListView) v.findViewById(R.id.listView3);
        }

        return v;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        try {
            getActivity();
            updateUI();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void updateUI() {


        TinyDB itemDB = new TinyDB(getContext());
        ArrayList<String> items = itemDB.getListString("inGameItems");
        // method of prompting user to change screen orientation
        Display display = ((WindowManager) getContext().getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
        //int rotation = display.getRotation();
        int rotation = getActivity().getWindowManager().getDefaultDisplay().getRotation();
        if (rotation == Surface.ROTATION_90 || rotation == Surface.ROTATION_270) {
             try {
                 clearArrayList();


                 for (int i = 0; i < 1; i++) {
                     InGameItems item = new InGameItems();
                     item.item1 = Long.valueOf(items.get(i));
                     item.item2 = Long.valueOf(items.get(i + 1));
                     item.item3 = Long.valueOf(items.get(i + 2));
                     item.item4 = Long.valueOf(items.get(i + 3));
                     item.item5 = Long.valueOf(items.get(i + 4));
                     item.item6 = Long.valueOf(items.get(i + 5));
                     item.item7 = Long.valueOf(items.get(i + 6));
                     itemArrayList.add(item);



                 }
                 landscapeAdapter = new ItemsViewAdapterLandscape(getContext());
                 listViewLandscape.setAdapter(landscapeAdapter);
             } catch (Exception e) {
                 e.printStackTrace();
             }
         }
         if (rotation == Surface.ROTATION_0 || rotation == Surface.ROTATION_180)
         {
             clearArrayList();
             for (int i = 0; i < items.size(); i++)
             {
                 InGameItems item = new InGameItems();
                 item.image = item.itemIdToImage(getResources(), Long.valueOf(items.get(i))).itemImage;
                 item.name = item.itemIdToImage(getResources(), Long.valueOf(items.get(i))).name;
                 item.plaintext = item.itemIdToImage(getResources(), Long.valueOf(items.get(i))).plaintext;
                 itemArrayList.add(item);


                 portraitAdapter = new ItemsViewAdapter(getContext());
                 listViewPortrait.setAdapter(portraitAdapter);
             }

         }

    }

    void clearArrayList()
    {
        itemArrayList = null;
        itemArrayList = new ArrayList<>();
    }

    class ItemsViewAdapterLandscape extends BaseAdapter {

        private Context mContext;
        private LayoutInflater inflater = null;

        public ItemsViewAdapterLandscape(Context c) {
            mContext = c;
            inflater = (LayoutInflater) c.getSystemService(mContext.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return itemArrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return itemArrayList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View rowView;
            rowView = inflater.inflate(R.layout.item_row_layout, null);
            final InGameItems itemImage = new InGameItems();

            try {

                ImageView itemImage1 = (ImageView) rowView.findViewById(R.id.item1);
                itemImage1.setImageDrawable(itemImage.itemIdToImage(getResources(), Long.valueOf(itemArrayList.get(0).item1)).itemImage);
                ImageView itemImage2 = (ImageView) rowView.findViewById(R.id.item2);
                itemImage2.setImageDrawable(itemImage.itemIdToImage(getResources(), Long.valueOf(itemArrayList.get(0).item2)).itemImage);
                ImageView itemImage3= (ImageView) rowView.findViewById(R.id.item3);
                itemImage3.setImageDrawable(itemImage.itemIdToImage(getResources(), Long.valueOf(itemArrayList.get(0).item3)).itemImage);
                ImageView itemImage4 = (ImageView) rowView.findViewById(R.id.item4);
                itemImage4.setImageDrawable(itemImage.itemIdToImage(getResources(), Long.valueOf(itemArrayList.get(0).item4)).itemImage);
                ImageView itemImage5 = (ImageView) rowView.findViewById(R.id.item5);
                itemImage5.setImageDrawable(itemImage.itemIdToImage(getResources(), Long.valueOf(itemArrayList.get(0).item5)).itemImage);
                ImageView itemImage6 = (ImageView) rowView.findViewById(R.id.item6);
                itemImage6.setImageDrawable(itemImage.itemIdToImage(getResources(), Long.valueOf(itemArrayList.get(0).item6)).itemImage);
                ImageView itemImage7 = (ImageView) rowView.findViewById(R.id.item7);
                itemImage7.setImageDrawable(itemImage.itemIdToImage(getResources(), Long.valueOf(itemArrayList.get(0).item7)).itemImage);

                itemImage1.setOnTouchListener(new View.OnTouchListener() {

                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        // TODO Auto-generated method stub
                        String text = itemImage.itemIdToImage(getResources(), Long.valueOf(itemArrayList.get(0).item1)).name;
                        ToastMessage.message(getContext(), itemImage.itemIdToImage(getResources(), Long.valueOf(itemArrayList.get(0).item1)).name
                                + "\n" + itemImage.itemIdToImage(getResources(), Long.valueOf(itemArrayList.get(0).item1)).plaintext);
                        return false;
                    }
                });

                itemImage2.setOnTouchListener(new View.OnTouchListener() {

                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        // TODO Auto-generated method stub
                        ToastMessage.message(getContext(), itemImage.itemIdToImage(getResources(), Long.valueOf(itemArrayList.get(0).item2)).name
                                + "\n" +  itemImage.itemIdToImage(getResources(), Long.valueOf(itemArrayList.get(0).item2)).plaintext);
                        return false;
                    }
                });

                itemImage3.setOnTouchListener(new View.OnTouchListener() {

                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        // TODO Auto-generated method stub
                        ToastMessage.message(getContext(), itemImage.itemIdToImage(getResources(), Long.valueOf(itemArrayList.get(0).item3)).name
                                + "\n" +  itemImage.itemIdToImage(getResources(), Long.valueOf(itemArrayList.get(0).item3)).plaintext);
                        return false;
                    }
                });

                itemImage4.setOnTouchListener(new View.OnTouchListener() {

                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        // TODO Auto-generated method stub
                        ToastMessage.message(getContext(), itemImage.itemIdToImage(getResources(), Long.valueOf(itemArrayList.get(0).item4)).name
                                + "\n" + itemImage.itemIdToImage(getResources(), Long.valueOf(itemArrayList.get(0).item4)).plaintext);
                        return false;
                    }
                });

                itemImage5.setOnTouchListener(new View.OnTouchListener() {

                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        // TODO Auto-generated method stub
                        ToastMessage.message(getContext(), itemImage.itemIdToImage(getResources(), Long.valueOf(itemArrayList.get(0).item5)).name
                                + "\n" + itemImage.itemIdToImage(getResources(), Long.valueOf(itemArrayList.get(0).item5)).plaintext);
                        return false;
                    }
                });

                itemImage6.setOnTouchListener(new View.OnTouchListener() {

                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        // TODO Auto-generated method stub
                        ToastMessage.message(getContext(), itemImage.itemIdToImage(getResources(), Long.valueOf(itemArrayList.get(0).item6)).name
                                + "\n" + itemImage.itemIdToImage(getResources(), Long.valueOf(itemArrayList.get(0).item6)).plaintext);
                        return false;
                    }
                });

                itemImage7.setOnTouchListener(new View.OnTouchListener() {
//
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        // TODO Auto-generated method stub
                        ToastMessage.message(getContext(), itemImage.itemIdToImage(getResources(), Long.valueOf(itemArrayList.get(0).item7)).name
                                + "\n" + itemImage.itemIdToImage(getResources(), Long.valueOf(itemArrayList.get(0).item7)).plaintext);
                        return false;
                    }
                });

            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            return rowView;
        }
    }

    class ItemsViewAdapter extends BaseAdapter {

        public ArrayList<HashMap<String, String>> list;
        Activity activity;
        private Context mContext;
        private LayoutInflater inflater = null;
        InGameItems item = new InGameItems();

        public ItemsViewAdapter(Context c) {
            mContext = c;
            inflater = (LayoutInflater) c.getSystemService(mContext.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return itemArrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return itemArrayList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View rowView = null;
            try {
                rowView = inflater.inflate(R.layout.item_row_layout_portrait, null);
                ImageView itemImage = (ImageView) rowView.findViewById(R.id.itemImage);
                TextView itemName = (TextView) rowView.findViewById(R.id.itemName);
                TextView plaintext = (TextView) rowView.findViewById(R.id.itemPlaintext);

                itemImage.setImageDrawable(itemArrayList.get(position).image);
                itemName.setText(itemArrayList.get(position).name);
                plaintext.setText(itemArrayList.get(position).plaintext);

            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            return rowView;
        }
    }
}
