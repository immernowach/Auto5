package com.example.application.views.list;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.OptionalParameter;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Login | Login")
@Route(value = "login", layout = MainLayout.class)
public class LoginView extends VerticalLayout implements HasUrlParameter<String> {

    private final LoginForm login = new LoginForm();

    public LoginView(){
        addClassName("login-view");
        setSizeFull();
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);

        login.setAction("login/error");

        add(new H1("Philipp's Garage"), login);
    }



	@Override
	public void setParameter(BeforeEvent event, @OptionalParameter String parameter) {
		if(parameter != null && parameter.equals("error"))
			login.setError(true);
	}
}