package org.example;

import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("......");
        System.out.println("This tool was developed by りぃぜ.riizeks");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("↓Enter IP address↓");
        System.out.println(" ");
        String ip_address = scanner.next();
        Document document = Jsoup.connect("https://domainwat.ch/ip/" + ip_address).get();
        Elements courses = document.select("tr");
        for (Element course : courses) {
            System.out.println(course.text());
        }

    }
}


