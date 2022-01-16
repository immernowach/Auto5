package com.example.application.views.list;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Philipp's Garage | Extra")
@Route(value = "extra", layout = MainLayout.class)

public class ExtraView extends VerticalLayout {
    public ExtraView () {

        TextArea ta1 = new TextArea("Haben sie zusätzliche Wünsche?");
        ta1.setWidth("60%");
        ta1.setHeight("300px");
        VerticalLayout vl1 = new VerticalLayout(ta1);
        vl1.setDefaultHorizontalComponentAlignment(Alignment.CENTER);

        Button WeiterButton = new Button("Weiter");
        WeiterButton.addClickListener(e -> WeiterButton.getUI().ifPresent(ui -> ui.navigate("bestaetigung")));
        VerticalLayout WeiterButtonLayout = new VerticalLayout(WeiterButton);
        WeiterButtonLayout.setDefaultHorizontalComponentAlignment(Alignment.END);

        add(new H1("Extra"));
        add(vl1);
        add(WeiterButtonLayout);
    }
}
