package botecodigital.info.abastest;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AbasAdapter adapter = new AbasAdapter(getSupportFragmentManager());
        adapter.adicionar( new PrimeiroFragment() , "Primeira Aba");
        adapter.adicionar( new SegundoFragment(), "Segunda Aba");
        adapter.adicionar( new TerceiroFragment(), "Terceira Aba");
        adapter.adicionar( new QuartoFragment(), "Quarto Aba");
        adapter.adicionar( new QuintoFragment(), "Quinta Aba");
        adapter.adicionar( new SextoFragment(), "Sexta Aba");
        adapter.adicionar( new SetimoFragment(), "Setima Aba");

        ViewPager viewPager = (ViewPager) findViewById(R.id.abas_view_pager);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.abas);
        tabLayout.setupWithViewPager(viewPager);
    }
}
