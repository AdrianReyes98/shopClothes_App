package fisei.reyespc.shopclothes_app.UI;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import fisei.reyespc.shopclothes_app.Adapter.CategoryAdapter;
import fisei.reyespc.shopclothes_app.Adapter.PopularAdapter;
import fisei.reyespc.shopclothes_app.Domain.CategoryDomain;
import fisei.reyespc.shopclothes_app.Domain.ClothesDomain;
import fisei.reyespc.shopclothes_app.R;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class DashboardActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter, adapter2;
    private RecyclerView recyclerViewCategotyList, recyclerViewPopularList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_dashboard);

        recyclerViewCategoty();
        recyclerViewPopular();


        //
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);

        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.btn_home:
                        // do something here
                        Toast toast1 =
                                Toast.makeText(getApplicationContext(),"Seleccionaste HOME", Toast.LENGTH_SHORT);
                        toast1.show();
                        return true;
                    case R.id.btn_profile:
                        // do something here
                        Toast toast2 =
                                Toast.makeText(getApplicationContext(),"Seleccionaste PROFILE", Toast.LENGTH_SHORT);
                        toast2.show();
                        return true;
                    case R.id.btn_cart:
                        // do something here
                        Toast toast3 =
                                Toast.makeText(getApplicationContext(),"Seleccionaste CART", Toast.LENGTH_SHORT);
                        toast3.show();
                        return true;
                    default: return true;
                }
            }
        });



    }

    private void recyclerViewPopular() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        recyclerViewPopularList = findViewById(R.id.viewPopular);
        recyclerViewPopularList.setLayoutManager(linearLayoutManager);

        ArrayList<ClothesDomain> clothesList = new ArrayList<>();
        clothesList.add(new ClothesDomain("Camisa de formal","camisaformal", "Camisa Formal", 15.0, 5, 20, 1000));
        clothesList.add(new ClothesDomain("Pantalon Jean","pantalonjean", "Jeans", 20.0, 4, 18, 1500));
        clothesList.add(new ClothesDomain("Camisa de oficina","camisaoficina", "Camisa Oficina", 25.0, 5, 20, 100));
        clothesList.add(new ClothesDomain("Camisa polo","camisapolo", "Camisa Polo", 30.0, 5, 20, 1000));



        adapter2 = new PopularAdapter(clothesList);
        recyclerViewPopularList.setAdapter(adapter2);
    }



    private void recyclerViewCategoty() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        recyclerViewCategotyList = findViewById(R.id.viewCategories);
        recyclerViewCategotyList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> categoryList = new ArrayList<>();
        categoryList.add(new CategoryDomain("Camisas","cat_1"));
        categoryList.add(new CategoryDomain("Blusas","cat_2"));
        categoryList.add(new CategoryDomain("Trajes","cat_3"));
        categoryList.add(new CategoryDomain("Pantalones","cat_4"));
        categoryList.add(new CategoryDomain("Gorras","cat_5"));

        adapter = new CategoryAdapter(categoryList);
        recyclerViewCategotyList.setAdapter(adapter);

    }

}