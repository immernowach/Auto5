package com.example.application.views.list;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.QueryParameters;
import com.vaadin.flow.router.Route;

@PageTitle("Philipp's Garage | Modelle")
@Route(value = "", layout = MainLayout.class)

public class ModelleView extends VerticalLayout{
    DataController dc = new DataController();
    public ModelleView() {
        //TODO Titel hinzufügen
        Image img1 = new Image("images/AutoSparsam.jpg", "Sparsam");
        img1.setWidth("200px");
        Label lbl1 = new Label("Preis: 50.-\n Verbrauch: 5l/km");
        Button btn1 = new Button("Auswählen");
        btn1.addClickListener(e -> btn1.getUI().ifPresent(ui -> ui.navigate("konfigurator/1")));
        VerticalLayout vl1 = new VerticalLayout(img1, lbl1, btn1);

        //TODO Titel hinzufügen
        Image img2 = new Image("images/AutoStandard.jpg", "Standard");
        img2.setWidth("200px");
        Label lbl2 = new Label("Preis: 50'000.-\n Verbrauch: 15l/km");
        Button btn2 = new Button("Auswählen");
        btn2.addClickListener(e -> btn2.getUI().ifPresent(ui -> ui.navigate("konfigurator/2")));
        VerticalLayout vl2 = new VerticalLayout(img2, lbl2, btn2);

        //TODO Titel hinzufügen
        Image img3 = new Image("images/AutoSport.jpg", "Sport");
        img3.setWidth("200px");
        Label lbl3 = new Label("Preis: 150'000.- \n Verbrauch: 50l/km");
        Button btn3 = new Button("Auswählen");
        btn3.addClickListener(e -> btn3.getUI().ifPresent(ui -> ui.navigate("konfigurator/3")));
        VerticalLayout vl3 = new VerticalLayout(img3, lbl3, btn3);

        HorizontalLayout hl1 = new HorizontalLayout(vl1, vl2, vl3);
        hl1.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER);
        hl1.setAlignItems(FlexComponent.Alignment.CENTER);



        VerticalLayout vl4 = new VerticalLayout(hl1);
        vl4.setDefaultHorizontalComponentAlignment(FlexComponent.Alignment.CENTER);

        add(new H1("Modelle"));
        add(vl4);

    }

}
