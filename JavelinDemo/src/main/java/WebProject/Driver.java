package WebProject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
import org.eclipse.jetty.http.HttpStatus;

import io.javalin.Javalin;
import io.javalin.http.Context;

public class Driver {

	public static void main(String[] args) {
		List<Login> usrs = new ArrayList<>();
		List<Requests> reqs = new ArrayList<>();
		List<Requests> approvedreqs = new ArrayList<>();
		
		Javalin app = Javalin.create().start(8001);

		app.post("/addreq", ctx -> {
			Requests req = ctx.bodyAsClass(Requests.class);
			reqs.add(req);
			System.out.print(reqs.toString() + "\n");
		});

		app.get("/getreq", ctx -> {
			// System.out.print(reqs.toString());
			
			for (Requests i : approvedreqs) {
				if (ctx.body().equals(i.empid) & i.approved == true) {
					System.out.print("Approved!");
				}else {
					System.out.print("Not Approved");
				}

			}

		});

		app.post("/changereq", ctx -> {
			// System.out.print(reqs.toString());
			
			for (Requests i : reqs) {
				if (ctx.body().equals(i.empid) && i.empid.equals("222")) {

					i.approved = true;
					approvedreqs.add(i);
					
					
				} else {
					System.out.print("Invalid Credentials");
				}

			}
			
			
			System.out.print(approvedreqs.toString());

		});

		app.get("/Login", (Context ctx) -> {
			
			for(Login i : usrs) {
				if(ctx.body().equals(i.id)) {
					System.out.print("you are logged in as " + i.username);
						
					
				}
			}
			
			//ctx.res().getWriter().write("Hello, client");
		});

		app.post("/Register", ctx -> {

			Login cred = ctx.bodyAsClass(Login.class);
			usrs.add(cred);
			if (cred.isboss) {
				System.out.print("welcome boss");
			
			}else {
				System.out.print("welcome employee");
			}
			
		});

		

		

	
}}
