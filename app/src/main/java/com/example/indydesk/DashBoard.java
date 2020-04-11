package com.example.indydesk;

import android.content.DialogInterface;
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
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;
import java.util.List;
public class DashBoard extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AlbumsAdapter adapter;
    private List<Album> albumList;
    private FirebaseAuth mAuth;
    TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        tv1=findViewById(R.id.love_music);
        tv2=findViewById(R.id.foodme);
        tv1.setSelected(true);
        tv2.setSelected(true);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mAuth= FirebaseAuth.getInstance();
        initCollapsingToolbar();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        albumList = new ArrayList<>();
        adapter = new AlbumsAdapter(getApplicationContext(), albumList, new AlbumClickListener() {
            @Override
            public void onAlbumClick(Album album) {




                if(album.getThumbnail()==R.drawable.album1){
                    AlertDialog.Builder builder=new AlertDialog.Builder(DashBoard.this);
                    builder.setTitle("Yeh Dil Maange More");
                    builder.setIcon(R.drawable.album1);
                    builder.setMessage("Soft Drinks\n A very stylist T shirt. Perfect for layering under blazers. shirts or smart enough to wear on its own. Perfect fit and soft cotton. more then sufficient to beat this summer heat with style.\n" +
                            "\n" +
                            "Fit Type: Regular Fit\n" +
                            "Brand: Fifbi\n" +
                            "Sleeve: Half Sleeve\n" +
                            "Neck: Round Neck\n" +
                            "Fitting: Regular Fit\n" +
                            "Material: Cotton \n ");

                    builder.setNegativeButton("Rs.35.0", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });


                    AlertDialog dialog = builder.create();
                    dialog.show();



                }
                else if(album.getThumbnail()==R.drawable.album2){

                    AlertDialog.Builder builder=new AlertDialog.Builder(DashBoard.this);
                    builder.setTitle("Chai par Charcha");
                    builder.setIcon(R.drawable.album2);
                    builder.setMessage("T for Tapri\n A very stylist T shirt. Perfect for layering under blazers. shirts or smart enough to wear on its own. Perfect fit and soft cotton. more then sufficient to beat this summer heat with style.\n" +
                            "\n" +
                            "Fit Type: Regular Fit\n" +
                            "Brand: Fifbi\n" +
                            "Sleeve: Half Sleeve\n" +
                            "Neck: Round Neck\n" +
                            "Fitting: Regular Fit\n" +
                            "Material: Cotton \n ");



                    builder.setNegativeButton("Rs.399.0", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

                    AlertDialog dialog = builder.create();
                    dialog.show();

                }
                else if(album.getThumbnail()==R.drawable.album3){

                    AlertDialog.Builder builder=new AlertDialog.Builder(DashBoard.this);
                    builder.setTitle("The Taste of India");
                    builder.setIcon(R.drawable.album3);
                    builder.setMessage("Amul Drinks\n A very stylist T shirt. Perfect for layering under blazers. shirts or smart enough to wear on its own. Perfect fit and soft cotton. more then sufficient to beat this summer heat with style.\n" +
                            "\n" +
                            "Fit Type: Regular Fit\n" +
                            "Brand: Fifbi\n" +
                            "Sleeve: Half Sleeve\n" +
                            "Neck: Round Neck\n" +
                            "Fitting: Regular Fit\n" +
                            "Material: Cotton \n ");

                    builder.setNegativeButton("Rs.399.0", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

                    AlertDialog dialog = builder.create();
                    dialog.show();

                }
                else if(album.getThumbnail()==R.drawable.album4){

                    AlertDialog.Builder builder=new AlertDialog.Builder(DashBoard.this);
                    builder.setTitle("2 minute noodles");
                    builder.setIcon(R.drawable.album4);
                    builder.setMessage("Maggi-Momos\n A very stylist T shirt. Perfect for layering under blazers. shirts or smart enough to wear on its own. Perfect fit and soft cotton. more then sufficient to beat this summer heat with style.\n" +
                            "\n" +
                            "\n" +
                            "Fit Type: Regular Fit\n" +
                            "Brand: Fifbi\n" +
                            "Sleeve: Half Sleeve\n" +
                            "Neck: Round Neck\n" +
                            "Fitting: Regular Fit\n" +
                            "Material: Cotton \n ");

                    builder.setNegativeButton("Rs.399.0", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });

                    AlertDialog dialog = builder.create();
                    dialog.show();

                }
                else if(album.getThumbnail()==R.drawable.album5){

                    AlertDialog.Builder builder=new AlertDialog.Builder(DashBoard.this);
                    builder.setTitle("The one thing that everyone eats is Samosa");
                    builder.setIcon(R.drawable.album5);
                    builder.setMessage("Fifbi\n Fifbi Brought Up This Brown Coloured Single Pack Belt That Will Add A Touch Of Understated Style To Your Overall Office Appearance. Made Of Rich Quality Faux Leather, This Belt For Men Is Best Worn With Casual Or Semi-Casual. This Belt Will Not Only Keep Your Trousers And Jeans In Place But Will Also Make You Look Stylish. Material Of This Belt Is Of Faux Leather Which Is Highest In Its Quality\n" +
                            "\n" +
                            "\n" +
                            "Material:- 100% Genuine leather\n" +
                            "Pure Leather Brown Belt\n" +
                            "QUALITY: - Made of Artificial leather (PU Leather) Belt. *MADE IN INDIA. Specially designed for those who do not like animals leather product.\n" +
                            "CUT TO FIT STYLE:- Cut the belt as per your waist size and wear it. \n ");

                    builder.setNegativeButton("Rs.750.00", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });

                    AlertDialog dialog = builder.create();
                    dialog.show();

                }
                else if(album.getThumbnail()==R.drawable.album6){

                    AlertDialog.Builder builder=new AlertDialog.Builder(DashBoard.this);
                    builder.setTitle("Kuch mitha ho jaye");
                    builder.setIcon(R.drawable.album6);
                    builder.setMessage("Wafers and Chocolates\n TWO IN ONE:- Reversible belt, Twist buckle to change belt side. REVERSIBLE: It's a Reversible belt. just pull and turnbuckle and use it from BOTH SIDE BLACK AND BROWN. Quality: Premium. Made In India But Material Imported. A History & Tradition of Exceptional Quality: This Premium ADDITION full grain leather belt construction offers the highest quality and maximum durability. A Black shade which goes well with any of your formal or evening wear. This comes with a premium chrome buckle. **Note:- The Buckle design may slightly vary as per the availability. CARE INSTRUCTION - Clean with the SOFT cotton cloth.\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "Good Quality Italian Leather\n" +
                            "Made In India.\n" +
                            "MAKE SURE TO ORDER 2 SIZE BIGGER THAN YOUR WAIST/PANTS SIZE” as a rule of thumb your belt size needs to be approx. If your waist size is 28-inch, order belt of 32-inch. If your waist size is 30-inch, order belt of 34-inch and so on.\n" +
                            "Fifbi's black and brown leather-crafted belts are constructed from High Quality 100% genuine leather, which ensures the high quality and durability of the belt.\n" +
                            "Our customers love our products and make repetitive purchases. Most orders are dispatched within 24 hours giving you faster delivery. Just try our products and world-class services. \n ");

                    builder.setNegativeButton("Rs.1200.0", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });

                    AlertDialog dialog = builder.create();
                    dialog.show();

                }
                /*
                else if(album.getThumbnail()==R.drawable.album7){

                    AlertDialog.Builder builder=new AlertDialog.Builder(DashBoard.this);
                    builder.setTitle("Men's Classic Buckle belt with Premium Leather");
                    builder.setIcon(R.drawable.album7);
                    builder.setMessage("Fifbi\n Make Sure To Order 2 Size Bigger Than Your Waist/Pants Size\" as a rule of thumb your belt size needs to be approx. If your waist size is 28-inch, order belt of 32-inch. If your waist size is 30-inch, order belt of 34-inch and so on. For any query, ping us on messenger. \n 100% Pure Genuine Leather Belt. Handmade, Highly constructed for longer endurance and better upholding.\n   \n ");


                    builder.setNegativeButton("Rs.1200.0", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });



                    AlertDialog dialog = builder.create();
                    dialog.show();

                }
                else if(album.getThumbnail()==R.drawable.album8){

                    AlertDialog.Builder builder=new AlertDialog.Builder(DashBoard.this);
                    builder.setTitle("Men's Premium Leather Single Prong Classic Bucle belt");
                    builder.setIcon(R.drawable.album8);
                    builder.setMessage("Fifbi\n Customer's satisfaction is our mission- we are here to provide our esteemed customers a most pleasant experience. Our 30 days free return policy enables you a risk-free purchase! For any reason, you are unsatisfied with our belt, full refund or free replace is available as per your wish.\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "Pack of 1. Width: 35 mm. Material : Genuine Leather. Occasion: Formal & Casual Wear.\n" +
                            "Quality: Premium. Made In India. Made In India.\n" +
                            "MAKE SURE TO ORDER 2 SIZE BIGGER THAN YOUR WAIST/PANTS SIZE\" as a rule of thumb your belt size needs to be approx. If your waist size is 28-inch, order belt of 32-inch. If your waist size is 30-inch, order belt of 34-inch and so on.\n" +
                            "Fifbi's brown leather-crafted belts are constructed from High Quality 100% genuine leather, which ensures the high quality and durability of the belt.\n" +
                            "Our customers love our products and make repetitive purchases. Most orders are dispatched within 24 hours giving you a faster delivery. Just try our products and world class services. \n ");


                    builder.setNegativeButton("Rs.650.0", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });


                    AlertDialog dialog = builder.create();
                    dialog.show();

                }
                else if(album.getThumbnail()==R.drawable.album9){

                    AlertDialog.Builder builder=new AlertDialog.Builder(DashBoard.this);
                    builder.setTitle("Men's Genuine Leather Belt with Fashionable & Classic Buckle");
                    builder.setIcon(R.drawable.album9);
                    builder.setMessage("Fitbi\n  Fifbi presents you one of the most versatile and durable belts which are perfectly suitable to go with many outfit options. You can style it with jeans as well as trousers.\n" +
                            "They are a perfect value for money product and are crafted with pure leather but at a cost-effective price.\n" +
                            "The belts are handmade in India from soft brown/black leather and with a high-quality buckle.\n" +
                            "Perfectly suitable to use yourself or to gift someone you love. \n ");


                    builder.setNegativeButton("Rs.700.0", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });


                    AlertDialog dialog = builder.create();
                    dialog.show();

                }
                else if(album.getThumbnail()==R.drawable.album10){

                    AlertDialog.Builder builder=new AlertDialog.Builder(DashBoard.this);
                    builder.setTitle("Men's Slim Genuine smooth Leather Money Clip Dark Brown Wallet");
                    builder.setIcon(R.drawable.album10);
                    builder.setMessage("Fifbi\n The Best Pure Leather Wallets For Men! Is Your Existing Wallet Needed To Be Replaced? Do You Want To Have The Best Pure Leather Wallet On Your Cart? You Have Come To The Right Place! When It Comes To Best Wallet Brands For Men,We Have Made Men'S Wallets That Are Available Your Needs.\n" +
                            "\n" +
                            "100% Pure Leather\n" +
                            "Made In India\n" +
                            "It's Not Bulky: This Slim Wallet Will Never Become Bulky Even After You Keep All Your Atm Cards, Credit Cards And Cash\n" +
                            "This Perfect Sized Leather Wallet Will Seamlessly Slide Into Your Pocket., Soft & Firm Leather:\n" +
                            "This Men's Wallet Is Neatly Designed And Made With Soft And Firm Genuine Leather And Twill Fabric On The Inside. You Will Feel The Softness On Your Hand And It Will Never Be A Hard Leather Product \n ");

                    builder.setNegativeButton("Rs.500.0", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });


                    AlertDialog dialog = builder.create();
                    dialog.show();

                }
                else if(album.getThumbnail()==R.drawable.album11){

                    AlertDialog.Builder builder=new AlertDialog.Builder(DashBoard.this);
                    builder.setTitle("Men's Slim Genuine smooth Leather Money Clip Light Brown Wallet");
                    builder.setIcon(R.drawable.album11);
                    builder.setMessage("Fifbi\n The Best Pure Leather Wallets For Men! Is Your Existing Wallet Needed To Be Replaced? Do You Want To Have The Best Pure Leather Wallet On Your Cart? You Have Come To The Right Place! When It Comes To Best Wallet Brands For Men,We Have Made Men'S Wallets That Are Available Your Needs.\n" +
                            "\n" +
                            "100% Pure Leather\n" +
                            "Made In India\n" +
                            "It's Not Bulky: This Slim Wallet Will Never Become Bulky Even After You Keep All Your Atm Cards, Credit Cards And Cash\n" +
                            "This Perfect Sized Leather Wallet Will Seamlessly Slide Into Your Pocket., Soft & Firm Leather:\n" +
                            "This Men's Wallet Is Neatly Designed And Made With Soft And Firm Genuine Leather And Twill Fabric On The Inside. You Will Feel The Softness On Your Hand And It Will Never Be A Hard Leather Product \n ");


                    builder.setNegativeButton("Rs.500.0", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });


                    AlertDialog dialog = builder.create();
                    dialog.show();

                }*/
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if (id == R.id.sign_out) {
            mAuth.signOut();
            startActivity(new Intent(DashBoard.this,LoginActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }


    /**
     * Adding few albums for testing
     */
    private void prepareAlbums() {
        int[] covers = new int[]{
                R.drawable.album1,
                R.drawable.album2,
                R.drawable.album3,
                R.drawable.album4,
                R.drawable.album5,
                R.drawable.album6
                /*
                R.drawable.album7,
                R.drawable.album8,
                R.drawable.album9,
                R.drawable.album10,
                R.drawable.album11*/
        };

        Album a = new Album("Soft Drinks", 50, covers[0]);
        albumList.add(a);

        a = new Album("T for Tapri", 80, covers[1]);
        albumList.add(a);

        a = new Album("Amul", 60, covers[2]);
        albumList.add(a);

        a = new Album("Chinese", 50, covers[3]);
        albumList.add(a);

        a = new Album("Snacks", 50, covers[4]);
        albumList.add(a);

        a = new Album(" Wafers & Chocolates", 30, covers[5]);
        albumList.add(a);

/*
        a = new Album("Gucci", 20, covers[6]);
        albumList.add(a);

        a = new Album("Armani", 50, covers[7]);
        albumList.add(a);

        a = new Album("Louis Phillepe", 60, covers[9]);
        albumList.add(a);

        a = new Album("Louis Vetton", 40, covers[10]);
        albumList.add(a);
*/

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
