package com.example.application.views.list;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.radiobutton.RadioGroupVariant;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Philipp's Garage | Konfigurator")
@Route(value = "konfigurator", layout = MainLayout.class)

public class KonfiguratorView extends VerticalLayout {
    DataController dc = new DataController();
    public KonfiguratorView () {
        Image img1 = new Image("images/AutoSparsam.jpg", "Auto");
        img1.setWidth("600px");

        if (dc.getButtonSelection() == 2) {
            img1.setSrc("images/AutoStandard.jpg");
        }
        else if (dc.getButtonSelection() == 3) {
            img1.setSrc("images/AutoSport.jpg");
        }


        RadioButtonGroup<String> rg1 = new RadioButtonGroup<>();
        rg1.addThemeVariants(RadioGroupVariant.LUMO_VERTICAL);
        rg1.setLabel("Sitze | Material");
        rg1.setItems("Stoff", "Leder");
        rg1.setRequired(true);

        RadioButtonGroup<String> rg2 = new RadioButtonGroup<>();
        rg2.addThemeVariants(RadioGroupVariant.LUMO_VERTICAL);
        rg2.setLabel("Sitze | Anzahl");
        rg2.setItems("2 Sitze", "4 Sitze", "5 Sitze");

        VerticalLayout vl2 = new VerticalLayout(rg1, rg2);
        HorizontalLayout hl1 = new HorizontalLayout(img1, vl2);
        VerticalLayout vl3 = new VerticalLayout(hl1);
        vl3.setDefaultHorizontalComponentAlignment(Alignment.CENTER);

        Button WeiterButton = new Button("Weiter");
        WeiterButton.addClickListener(e -> WeiterButton.getUI().ifPresent(ui -> ui.navigate("extra")));
        VerticalLayout WeiterButtonLayout = new VerticalLayout(WeiterButton);
        WeiterButtonLayout.setDefaultHorizontalComponentAlignment(Alignment.END);

        add(new H1("Konfigurator"));
        add(vl3);
        add(WeiterButtonLayout);
    }
}
