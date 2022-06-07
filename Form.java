package application;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Form {
	Rectangle a;
	Rectangle b;
	Rectangle c;
	Rectangle d;
	Color color;
	private String name;
	public int form = 1;

	public Form(Rectangle a, Rectangle b, Rectangle c, Rectangle d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public Form(Rectangle a, Rectangle b, Rectangle c, Rectangle d, String name) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.name = name;

		switch (name) {
		case "j":
			color = Color.web("F7E135");
			break;
		case "l":
			color = Color.web("CB6CE6");
			break;
		case "o":
			color = Color.web("FFA0DC");
			break;
		case "s":
			color = Color.web("EEF8EB");
			break;
		case "t":
			color = Color.web("A5E8D3");
			break;
		case "z":
			color = Color.web("EF5241");
			break;
		case "i":
			color = Color.web("CDAD79");
			break;

		}
		this.a.setFill(color);
		this.b.setFill(color);
		this.c.setFill(color);
		this.d.setFill(color);
	}


	public String getName() {
		return name;
	}


	public void changeForm() {
		if (form != 4) {
			form++;
		} else {
			form = 1;
		}
	}
}