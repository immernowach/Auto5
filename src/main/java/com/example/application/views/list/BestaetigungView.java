package com.example.application.views.list;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Philipp's Garage | Bestätigung")
@Route(value = "bestaetigung", layout = MainLayout.class)
public class BestaetigungView extends VerticalLayout {
    public BestaetigungView () {
        Image img1 = new Image("images/GruenerHacken.png", "Grüner Hacken");
        img1.setWidth("200px");
        Label lbl1 = new Label("Ihre Bestellung wurde ausgeführt, wir werden Sie schnellstmöglich kontaktieren.");

        HorizontalLayout hl1 = new HorizontalLayout(img1, lbl1);
        hl1.setDefaultVerticalComponentAlignment(Alignment.CENTER);
        VerticalLayout vl1 = new VerticalLayout(hl1);
        vl1.setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        add(vl1);
    }
}
