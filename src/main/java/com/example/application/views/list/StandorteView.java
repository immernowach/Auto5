package com.example.application.views.list;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Philipp's Garage | Standorte")
@Route(value = "standorte", layout = MainLayout.class)

public class StandorteView extends VerticalLayout{
    public StandorteView (){
        H2 title1 = new H2("Basel");
        Label lbl1 = new Label("Hauptstrasse 1");
        Label lbl2 = new Label("4001 Basel");
        Label lbl3 = new Label("Schweiz");
        VerticalLayout vl1 = new VerticalLayout(title1, lbl1, lbl2, lbl3);
        vl1.setDefaultHorizontalComponentAlignment(Alignment.CENTER);

        H2 title2 = new H2("Zürich");
        Label lbl4 = new Label("Hauptstrasse 1");
        Label lbl5 = new Label("8000 Zürich");
        Label lbl6 = new Label("Schweiz");
        VerticalLayout vl2 = new VerticalLayout(title2, lbl4, lbl5, lbl6);
        vl2.setDefaultHorizontalComponentAlignment(Alignment.CENTER);

        add(new H1("Standorte"));
        add(vl1, vl2);
    }
}
