package com.example.application.views.list;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.QueryParameters;
import com.vaadin.flow.router.Route;

@PageTitle("Philipp's Garage | Modelle")
@Route(value = "", layout = MainLayout.class)

public class ModelleView extends VerticalLayout{
    public ModelleView() {

        H4 titel1 = new H4("Sparsam");
        H4 titel2 = new H4("Standard");
        H4 titel3 = new H4("Sport");
        HorizontalLayout hlTitel = new HorizontalLayout(titel1, titel2, titel3);
        VerticalLayout vlTitel = new VerticalLayout(hlTitel);
        vlTitel.setDefaultHorizontalComponentAlignment(Alignment.CENTER);

        Image img1 = new Image("images/AutoSparsam.jpg", "Sparsam");
        img1.setWidth("200px");
        Label Beschreibung1Text1 = new Label("Preis: 50.-");
        Label Beschreibung1Text2 = new Label("Km/h: 50km/h");
        Label Beschreibung1Text3 = new Label("Verbrauch: 5l/km");
        Button btn1 = new Button("Auswählen");
        btn1.addClickListener(e -> btn1.getUI().ifPresent(ui -> ui.navigate("konfigurator/1")));
        VerticalLayout vl1 = new VerticalLayout(img1, Beschreibung1Text1, Beschreibung1Text2, Beschreibung1Text3, btn1);

        Image img2 = new Image("images/AutoStandard.jpg", "Standard");
        img2.setWidth("200px");
        Label Beschreibung2Text1 = new Label("Preis: 50'000.-");
        Label Beschreibung2Text2 = new Label("Km/h: 150km/h");
        Label Beschreibung2Text3 = new Label("Verbrauch: 15l/km");
        Button btn2 = new Button("Auswählen");
        btn2.addClickListener(e -> btn2.getUI().ifPresent(ui -> ui.navigate("konfigurator/2")));
        VerticalLayout vl2 = new VerticalLayout(img2, Beschreibung2Text1, Beschreibung2Text2, Beschreibung2Text3, btn2);

        Image img3 = new Image("images/AutoSport.jpg", "Sport");
        img3.setWidth("200px");
        Label Beschreibung3Text1 = new Label("Preis: 150'000.-");
        Label Beschreibung3Text2 = new Label("Km/h: 500km/h");
        Label Beschreibung3Text3 = new Label("Verbrauch: 50l/km");
        Button btn3 = new Button("Auswählen");
        btn3.addClickListener(e -> btn3.getUI().ifPresent(ui -> ui.navigate("konfigurator/3")));
        VerticalLayout vl3 = new VerticalLayout(img3, Beschreibung3Text1, Beschreibung3Text2, Beschreibung3Text3, btn3);

        HorizontalLayout hl1 = new HorizontalLayout(vl1, vl2, vl3);
        hl1.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER);
        hl1.setAlignItems(FlexComponent.Alignment.CENTER);



        VerticalLayout vl4 = new VerticalLayout(hl1);
        vl4.setDefaultHorizontalComponentAlignment(FlexComponent.Alignment.CENTER);

        add(new H1("Modelle"));
        add(vlTitel);
        add(vl4);

    }

}
