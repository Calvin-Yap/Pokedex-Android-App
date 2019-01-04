package com.example.calvi.pokedex;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;

        import com.algolia.instantsearch.helpers.InstantSearch;
        import com.algolia.instantsearch.helpers.Searcher;
        import com.algolia.search.saas.Client;
        import com.algolia.search.saas.Index;

public class MainActivity extends AppCompatActivity {
    Searcher searcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Searcher searcher = Searcher.create("4762YEZX03", "f901e003f9b7fa470be78ce07db9cf75", "pokedex");
        InstantSearch helper = new InstantSearch(this, searcher);
        helper.search();
    }

    @Override
    protected void onDestroy() {
        searcher.destroy();
        super.onDestroy();
    }
}