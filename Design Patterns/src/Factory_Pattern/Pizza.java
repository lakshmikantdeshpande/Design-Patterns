package Factory_Pattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	List<String> toppings = new ArrayList<String>();

	void prepare() {
		StringBuilder strb = new StringBuilder();
		strb.append("Preparing " + name);
		strb.append("tossing " + dough);
		strb.append("adding sauce " + sauce);
		strb.append("addin	g toppings ");
		for (String str : toppings)
			strb.append(str + ",");
		strb.append("\n");
		System.out.println(strb.toString());
	}

	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	void cut() {
		System.out.println("Cutting pizza in four pieces");
	}

	void box() {
		System.out.println("Putting pizza in box");
	}

	public String getName() {
		return name;
	}
}
