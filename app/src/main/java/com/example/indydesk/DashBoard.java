package com.example.indydesk;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;
public class DashBoard extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AlbumsAdapter adapter;
    private List<Album> albumList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initCollapsingToolbar();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        albumList = new ArrayList<>();
        adapter = new AlbumsAdapter(getApplicationContext(), albumList, new AlbumClickListener() {
            @Override
            public void onAlbumClick(Album album) {




                if(album.getThumbnail()==R.drawable.Album1){
                    AlertDialog.Builder builder=new AlertDialog.Builder(DashBoard.this);
                    builder.setTitle("Workout Warrior Half Sleeve T-Shirt");
                    builder.setIcon(R.drawable.Album1);
                    builder.setMessage("Fifbi Apparela Rs.399.0");

                    AlertDialog dialog = builder.create();
                    dialog.show();



                }
                else if(album.getThumbnail()==R.drawable.Album2){

                    AlertDialog.Builder builder=new AlertDialog.Builder(DashBoard.this);
                    builder.setTitle("Student Waldrof Half Sleeve T-Shirt");
                    builder.setIcon(R.drawable.Album2);
                    builder.setMessage("Fifbi Apparela Rs.399.0");

                    AlertDialog dialog = builder.create();
                    dialog.show();

                }
                else if(album.getThumbnail()==R.drawable.Album3){

                    AlertDialog.Builder builder=new AlertDialog.Builder(DashBoard.this);
                    builder.setTitle("Stand up for what is Right Half Sleeve T-Shirt");
                    builder.setIcon(R.drawable.Album3);
                    builder.setMessage("Fifbi Apparela Rs.399.0");

                    AlertDialog dialog = builder.create();
                    dialog.show();

                }
                else if(album.getThumbnail()==R.drawable.Album4){

                    AlertDialog.Builder builder=new AlertDialog.Builder(DashBoard.this);
                    builder.setTitle("Daddy! Half Sleeve T-Shirt");
                    builder.setIcon(R.drawable.Album4);
                    builder.setMessage("Fifbi Apparela Rs.399.0");

                    AlertDialog dialog = builder.create();
                    dialog.show();

                }
                else if(album.getThumbnail()==R.drawable.Album5){

                    AlertDialog.Builder builder=new AlertDialog.Builder(DashBoard.this);
                    builder.setTitle("Men's Premium Leather TimberLand Belt with classic buckle");
                    builder.setIcon(R.drawable.Album5);
                    builder.setMessage("Fitbi  Rs.750.0");

                    AlertDialog dialog = builder.create();
                    dialog.show();

                }
                else if(album.getThumbnail()==R.drawable.Album6){

                    AlertDialog.Builder builder=new AlertDialog.Builder(DashBoard.this);
                    builder.setTitle("Men's Reversible Premium Leather Blt with Removable buckle");
                    builder.setIcon(R.drawable.Album6);
                    builder.setMessage("Fitbi  Rs.1200.0");

                    AlertDialog dialog = builder.create();
                    dialog.show();

                }
                else if(album.getThumbnail()==R.drawable.Album7){

                    AlertDialog.Builder builder=new AlertDialog.Builder(DashBoard.this);
                    builder.setTitle("Men's Classic Buckle belt with Premium Leather");
                    builder.setIcon(R.drawable.Album7);
                    builder.setMessage("Fitbi  Rs.1200.0");

                    AlertDialog dialog = builder.create();
                    dialog.show();

                }
                else if(album.getThumbnail()==R.drawable.Album8){

                    AlertDialog.Builder builder=new AlertDialog.Builder(DashBoard.this);
                    builder.setTitle("Men's Premium Leather Single Prong Classic Bucle belt");
                    builder.setIcon(R.drawable.Album8);
                    builder.setMessage("Fitbi Rs.650.0");

                    AlertDialog dialog = builder.create();
                    dialog.show();

                }
                else if(album.getThumbnail()==R.drawable.Album9){

                    AlertDialog.Builder builder=new AlertDialog.Builder(DashBoard.this);
                    builder.setTitle("Men's Genuine Leather Belt with Fashionable & Classic Buckle");
                    builder.setIcon(R.drawable.Album9);
                    builder.setMessage("Fitbi  Rs.700.0");

                    AlertDialog dialog = builder.create();
                    dialog.show();

                }
                else if(album.getThumbnail()==R.drawable.Album10){

                    AlertDialog.Builder builder=new AlertDialog.Builder(DashBoard.this);
                    builder.setTitle("Men's Slim Genuine smooth Leather Money Clip Dark Brown Wallet");
                    builder.setIcon(R.drawable.Album10);
                    builder.setMessage("Fifbi  Rs.500.0");

                    AlertDialog dialog = builder.create();
                    dialog.show();

                }
                else if(album.getThumbnail()==R.drawable.album11){

                    AlertDialog.Builder builder=new AlertDialog.Builder(DashBoard.this);
                    builder.setTitle("Men's Slim Genuine smooth Leather Money Clip Light Brown Wallet");
                    builder.setIcon(R.drawable.album11);
                    builder.setMessage("Fitbi  Rs.500.0");

                    AlertDialog dialog = builder.create();
                    dialog.show();

                }
            }
        });

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(10), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        prepareAlbums();

        try {
            Glide.with(this).load(R.drawable.cover).into((ImageView) findViewById(R.id.backdrop));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Initializing collapsing toolbar
     * Will show and hide the toolbar title on scroll
     */
    private void initCollapsingToolbar() {
        final CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(" ");
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.appbar);
        appBarLayout.setExpanded(true);

        // hiding & showing the title when toolbar expanded & collapsed
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = false;
            int scrollRange = -1;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                if (scrollRange + verticalOffset == 0) {
                    collapsingToolbar.setTitle(getString(R.string.app_name));
                    isShow = true;
                } else if (isShow) {
                    collapsingToolbar.setTitle(" ");
                    isShow = false;
                }
            }
        });
    }

    /**
     * Adding few albums for testing
     */
    private void prepareAlbums() {
        int[] covers = new int[]{
                R.drawable.Album1,
                R.drawable.Album2,
                R.drawable.Album3,
                R.drawable.Album4,
                R.drawable.Album5,
                R.drawable.Album6,
                R.drawable.Album7,
                R.drawable.Album8,
                R.drawable.Album9,
                R.drawable.Album10,
                R.drawable.album11
        };

        Album a = new Album("True Romance", 13, covers[0]);
        albumList.add(a);

        a = new Album("Xscpae", 8, covers[1]);
        albumList.add(a);

        a = new Album("Maroon 5", 11, covers[2]);
        albumList.add(a);

        a = new Album("Born to Die", 12, covers[3]);
        albumList.add(a);

        a = new Album("Honeymoon", 14, covers[4]);
        albumList.add(a);

        a = new Album("I Need a Doctor", 1, covers[5]);
        albumList.add(a);

        a = new Album("Loud", 11, covers[6]);
        albumList.add(a);

        a = new Album("Legend", 14, covers[7]);
        albumList.add(a);

        a = new Album("Hello", 11, covers[8]);
        albumList.add(a);

        a = new Album("Greatest Hits", 17, covers[9]);
        albumList.add(a);

        adapter.notifyDataSetChanged();
    }

    /**
     * RecyclerView item decoration - give equal margin around grid item
     */
    public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

        private int spanCount;
        private int spacing;
        private boolean includeEdge;

        public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
            this.spanCount = spanCount;
            this.spacing = spacing;
            this.includeEdge = includeEdge;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            int position = parent.getChildAdapterPosition(view); // item position
            int column = position % spanCount; // item column

            if (includeEdge) {
                outRect.left = spacing - column * spacing / spanCount; // spacing - column * ((1f / spanCount) * spacing)
                outRect.right = (column + 1) * spacing / spanCount; // (column + 1) * ((1f / spanCount) * spacing)

                if (position < spanCount) { // top edge
                    outRect.top = spacing;
                }
                outRect.bottom = spacing; // item bottom
            } else {
                outRect.left = column * spacing / spanCount; // column * ((1f / spanCount) * spacing)
                outRect.right = spacing - (column + 1) * spacing / spanCount; // spacing - (column + 1) * ((1f /    spanCount) * spacing)
                if (position >= spanCount) {
                    outRect.top = spacing; // item top
                }
            }
        }
    }

    /**
     * Converting dp to pixel
     */
    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }

}
