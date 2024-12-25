package com.company;

import java.time.LocalTime;
import java.util.ArrayList;

public class Park {
    private String name;
    private LocalTime opening;
    private LocalTime closing;
    private ArrayList<Attraction> attractions;

    public Park(String name, LocalTime opening, LocalTime closing){
        this.name = name;
        this.opening = opening;
        this.closing = closing;
        attractions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalTime getOpening() {
        return opening;
    }

    public void setOpening(LocalTime opening) {
        this.opening = opening;
    }

    public LocalTime getClosing() {
        return closing;
    }

    public void setClosing(LocalTime closing) {
        this.closing = closing;
    }

    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public void setAttractions(ArrayList<Attraction> attractions) {
        this.attractions = attractions;
    }

    public class Attraction{
        private String name;
        private LocalTime opening;
        private LocalTime closing;
        private double price;

        public Attraction(String name, LocalTime opening, LocalTime closing, double price){
            this.name = name;
            this.opening = opening;
            this.closing = closing;
            this.price = price;
            attractions.add(this);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public LocalTime getOpening() {
            return opening;
        }

        public void setOpening(LocalTime opening) {
            this.opening = opening;
        }

        public LocalTime getClosing() {
            return closing;
        }

        public void setClosing(LocalTime closing) {
            this.closing = closing;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }
}
