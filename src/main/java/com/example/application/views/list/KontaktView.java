package com.example.application.views.list;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Philipp's Garage | Kontakt")
@Route(value = "kontakt", layout = MainLayout.class)

public class KontaktView extends VerticalLayout{
    public KontaktView () {
        Label lbl1 = new Label("kontakt@philippsgarage.ch");
        Label lbl2 = new Label("061 000 00 00");
        VerticalLayout vl1 = new VerticalLayout(lbl1, lbl2);
        vl1.setDefaultHorizontalComponentAlignment(Alignment.CENTER);

        add(new H1("Kontakt"));
        add(vl1);
    }
}
