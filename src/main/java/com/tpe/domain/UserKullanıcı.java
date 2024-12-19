package com.tpe.domain;

public class UserKullanıcı {
    public class Kullanici {
        private int id;
        private String name;//null varsayılan değer
        private String email;//null
        private String password;
        private String adres;
        private Rol rol;

        public enum Rol {
            MUSTERI, ADMIN
        }

        // Yapıcı Metot
        public Kullanici(int id, String name, String email, String password, String adres, Rol rol) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.password = password;
            this.adres = adres;
            this.rol = rol;
        }

        // Getter ve Setter Metotları
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getAdres() {
            return adres;
        }

        public void setAdres(String adres) {
            this.adres = adres;
        }

        public Rol getRol() {
            return rol;
        }

        public void setRol(Rol rol) {
            this.rol = rol;
        }
    }
}
