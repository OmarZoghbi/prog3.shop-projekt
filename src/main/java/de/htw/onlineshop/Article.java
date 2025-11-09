package de.htw.onlineshop;

public class Article {

    private String name;
    private String description;
    private double price;
    private boolean available;

    public Article(String name, String description , double price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.available = false; // optionaler Default-Wert
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { // ✅ Richtiger Setter
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

        public void setPrice(double price) {
            this.price = price;
        }


        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }



        public boolean isAvailable() {
            return available;
        }

        public void setAvailable(boolean available) {
            this.available = available;
        }
    }


