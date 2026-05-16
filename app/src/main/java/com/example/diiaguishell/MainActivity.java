package com.example.diiaguishell;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
    private View feedPage;
    private View documentsPage;
    private TextView appBarTitle;
    private ImageView feedIcon;
    private ImageView documentsIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        feedPage = findViewById(R.id.feed_page);
        documentsPage = findViewById(R.id.documents_page);
        appBarTitle = findViewById(R.id.app_bar_title);
        feedIcon = findViewById(R.id.tab_feed_icon);
        documentsIcon = findViewById(R.id.tab_documents_icon);

        findViewById(R.id.tab_feed).setOnClickListener(view -> showFeedPage());
        findViewById(R.id.tab_documents).setOnClickListener(view -> showDocumentsPage());

        showFeedPage();
    }

    private void showFeedPage() {
        feedPage.setVisibility(View.VISIBLE);
        documentsPage.setVisibility(View.GONE);
        appBarTitle.setText("Стрічка");
        feedIcon.setImageResource(R.drawable.ic_tab_feed_selected);
        documentsIcon.setImageResource(R.drawable.ic_tab_documents_unselected);
    }

    private void showDocumentsPage() {
        feedPage.setVisibility(View.GONE);
        documentsPage.setVisibility(View.VISIBLE);
        appBarTitle.setText("Документи");
        feedIcon.setImageResource(R.drawable.ic_tab_feed_unselected);
        documentsIcon.setImageResource(R.drawable.ic_tab_documents_selected);
    }
}
