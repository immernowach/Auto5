package com.example.application.views.list;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.radiobutton.RadioGroupVariant;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Philipp's Garage | Konfigurator")
@Route(value = "konfigurator", layout = MainLayout.class)

public class KonfiguratorView extends VerticalLayout implements HasUrlParameter<String> {
	
    private String buttonSelection;
    
    HorizontalLayout carColorPicker = new HorizontalLayout();
    VerticalLayout carColorPickerWrapper = new VerticalLayout(new Paragraph("Auto | Farbe"), carColorPicker);
    Div carColor1 = new Div();
    Div carColor2 = new Div();
    Div carColor3 = new Div();
    Div carColor4 = new Div();
    Div carColor5 = new Div();
    List<Div> carColors = new ArrayList<Div>();
    
    HorizontalLayout seatColorPicker = new HorizontalLayout();
    VerticalLayout seatColorPickerWrapper = new VerticalLayout(new Paragraph("Sitze | Farbe"), seatColorPicker);
    Div seatColor1 = new Div();
    Div seatColor2 = new Div();
    Div seatColor3 = new Div();
    Div seatColor4 = new Div();
    Div seatColor5 = new Div();
    List<Div> seatColors = new ArrayList<Div>();
    
    @Override
	public void setParameter(BeforeEvent event, String parameter) {
		this.buttonSelection = parameter;
		initUI();
	}
  
    
    public void initUI() {
        Image img1 = new Image("images/AutoSparsam.jpg", "Auto");
        img1.setWidth("600px");
        if (buttonSelection.equals("2")) {
            img1.setSrc("images/AutoStandard.jpg");
        }
        else if (buttonSelection.equals("3")) {
            img1.setSrc("images/AutoSport.jpg");
        }


        RadioButtonGroup<String> rg1 = new RadioButtonGroup<>();
        rg1.addThemeVariants(RadioGroupVariant.LUMO_VERTICAL);
        rg1.setLabel("Sitze | Material");
        rg1.setItems("Stoff", "Leder");
        rg1.setValue("Stoff");

        RadioButtonGroup<String> rg2 = new RadioButtonGroup<>();
        rg2.addThemeVariants(RadioGroupVariant.LUMO_VERTICAL);
        rg2.setLabel("Sitze | Anzahl");
        rg2.setItems("2 Sitze", "4 Sitze", "5 Sitze");
        rg2.setValue("2 Sitze");
        
        createCarColorPicker();
        createSeatColorPicker();
        
        
        VerticalLayout vl2 = new VerticalLayout(carColorPickerWrapper, rg1, rg2, seatColorPickerWrapper);
        
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
    
    private void createCarColorPicker() {
    	
        carColorPickerWrapper.setPadding(false);
        carColorPickerWrapper.setSpacing(false);

        
        carColors.add(carColor1);
        carColors.add(carColor2);
        carColors.add(carColor3);
        carColors.add(carColor4);
        carColors.add(carColor5);
        
 
        for(Div color : carColors) {
        	color.setHeight("30px");
            color.setWidth("30px");
            color.getStyle().set("border-radius", "50%");
            color.getStyle().set("border", "solid #ffffff 2px");
            carColorPicker.add(color);
        }
        
        carColor1.getStyle().set("background-color", "#b9dee7");
        carColor1.addClickListener(s -> selectCarColor(carColor1));
        carColor1.getStyle().set("border", "solid #000000 2px");
        
        carColor2.getStyle().set("background-color", "#98b4b8");
        carColor2.addClickListener(s -> selectCarColor(carColor2));
        
        carColor3.getStyle().set("background-color", "#76c9db");
        carColor3.addClickListener(s -> selectCarColor(carColor3));
        
        carColor4.getStyle().set("background-color", "#546883");
        carColor4.addClickListener(s -> selectCarColor(carColor4));
        
        carColor5.getStyle().set("background-color", "#20538c");
        carColor5.addClickListener(s -> selectCarColor(carColor5));
	}
    
    private void createSeatColorPicker() {
 
        seatColorPickerWrapper.setPadding(false);
        seatColorPickerWrapper.setSpacing(false);
        
        seatColors.add(seatColor1);
        seatColors.add(seatColor2);
        seatColors.add(seatColor3);
        seatColors.add(seatColor4);
        seatColors.add(seatColor5);
        
 
        for(Div color : seatColors) {
        	color.setHeight("30px");
            color.setWidth("30px");
            color.getStyle().set("border-radius", "50%");
            color.getStyle().set("border", "solid #ffffff 2px");
            seatColorPicker.add(color);
        }
        
        seatColor1.getStyle().set("background-color", "#b9dee7");
        seatColor1.addClickListener(s -> selectSeatColor(seatColor1));
        seatColor1.getStyle().set("border", "solid #000000 2px");
        
        seatColor2.getStyle().set("background-color", "#98b4b8");
        seatColor2.addClickListener(s -> selectSeatColor(seatColor2));
        
        seatColor3.getStyle().set("background-color", "#76c9db");
        seatColor3.addClickListener(s -> selectSeatColor(seatColor3));
        
        seatColor4.getStyle().set("background-color", "#546883");
        seatColor4.addClickListener(s -> selectSeatColor(seatColor4));
        
        seatColor5.getStyle().set("background-color", "#20538c");
        seatColor5.addClickListener(s -> selectSeatColor(seatColor5));
	}

    
    private void selectCarColor(Div color) {
    	for(Div colorDiv : seatColors) {
        	if(colorDiv.getStyle().get("background-color").equals(color.getStyle().get("background-color"))) {
        		colorDiv.getStyle().set("border", "solid #000000 2px");
        	}else {
        		colorDiv.getStyle().set("border", "solid #ffffff 2px");
        	}
        }
    	
    }
    
	private void selectSeatColor(Div color) {
    	for(Div colorDiv : seatColors) {
        	if(colorDiv.getStyle().get("background-color").equals(color.getStyle().get("background-color"))) {
        		colorDiv.getStyle().set("border", "solid #000000 2px");
        	}else {
        		colorDiv.getStyle().set("border", "solid #ffffff 2px");
        	}
        }
    	
    }
    

}
