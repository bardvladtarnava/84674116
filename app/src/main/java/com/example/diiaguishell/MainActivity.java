package com.example.diiaguishell;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
    private View feedPage;
    private View documentsPage;
    private View servicesPage;
    private View menuPage;
    private TextView appBarTitle;
    private ImageView feedIcon;
    private ImageView documentsIcon;
    private ImageView servicesIcon;
    private ImageView menuIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        feedPage = findViewById(R.id.feed_page);
        documentsPage = findViewById(R.id.documents_page);
        servicesPage = findViewById(R.id.services_page);
        menuPage = findViewById(R.id.menu_page);
        appBarTitle = findViewById(R.id.app_bar_title);
        feedIcon = findViewById(R.id.tab_feed_icon);
        documentsIcon = findViewById(R.id.tab_documents_icon);
        servicesIcon = findViewById(R.id.tab_services_icon);
        menuIcon = findViewById(R.id.tab_menu_icon);

        findViewById(R.id.tab_feed).setOnClickListener(view -> showFeedPage());
        findViewById(R.id.tab_documents).setOnClickListener(view -> showDocumentsPage());
        findViewById(R.id.tab_services).setOnClickListener(view -> showServicesPage());
        findViewById(R.id.tab_menu).setOnClickListener(view -> showMenuPage());

        showFeedPage();
    }

    private void showFeedPage() {
        feedPage.setVisibility(View.VISIBLE);
        documentsPage.setVisibility(View.GONE);
        servicesPage.setVisibility(View.GONE);
        menuPage.setVisibility(View.GONE);
        appBarTitle.setText("Стрічка");
        feedIcon.setImageResource(R.drawable.ic_tab_feed_selected);
        documentsIcon.setImageResource(R.drawable.ic_tab_documents_unselected);
        servicesIcon.setImageResource(R.drawable.ic_tab_services_unselected);
        menuIcon.setImageResource(R.drawable.ic_tab_menu_unselected_badge);
    }

    private void showDocumentsPage() {
        feedPage.setVisibility(View.GONE);
        documentsPage.setVisibility(View.VISIBLE);
        servicesPage.setVisibility(View.GONE);
        menuPage.setVisibility(View.GONE);
        appBarTitle.setText("Документи");
        feedIcon.setImageResource(R.drawable.ic_tab_feed_unselected);
        documentsIcon.setImageResource(R.drawable.ic_tab_documents_selected);
        servicesIcon.setImageResource(R.drawable.ic_tab_services_unselected);
        menuIcon.setImageResource(R.drawable.ic_tab_menu_unselected_badge);
    }

    private void showServicesPage() {
        feedPage.setVisibility(View.GONE);
        documentsPage.setVisibility(View.GONE);
        servicesPage.setVisibility(View.VISIBLE);
        menuPage.setVisibility(View.GONE);
        appBarTitle.setText("Сервіси");
        feedIcon.setImageResource(R.drawable.ic_tab_feed_unselected);
        documentsIcon.setImageResource(R.drawable.ic_tab_documents_unselected);
        servicesIcon.setImageResource(R.drawable.ic_tab_services_selected);
        menuIcon.setImageResource(R.drawable.ic_tab_menu_unselected_badge);
    }

    private void showMenuPage() {
        feedPage.setVisibility(View.GONE);
        documentsPage.setVisibility(View.GONE);
        servicesPage.setVisibility(View.GONE);
        menuPage.setVisibility(View.VISIBLE);
        appBarTitle.setText("Меню");
        feedIcon.setImageResource(R.drawable.ic_tab_feed_unselected);
        documentsIcon.setImageResource(R.drawable.ic_tab_documents_unselected);
        servicesIcon.setImageResource(R.drawable.ic_tab_services_unselected);
        menuIcon.setImageResource(R.drawable.ic_tab_menu_selected);
    }
}
