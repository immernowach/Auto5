package com.example.application.views.list;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.RouterLink;

public class MainLayout extends AppLayout {

    public MainLayout() {
        createHeader();
    }

    private void createHeader() {
        H3 logo = new H3("Philipp's Garage");

        HorizontalLayout header = new HorizontalLayout(logo);

        header.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER);
        header.setWidth("100%");

        addToNavbar(
                header,
                new RouterLink("Modelle", ModelleView.class),
                new RouterLink("Kontakt", KontaktView.class),
                new RouterLink("Standorte", StandorteView.class),
                new RouterLink("Login", LoginView.class)
        );

    }

}