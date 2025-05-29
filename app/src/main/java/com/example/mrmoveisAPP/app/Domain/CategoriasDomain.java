package com.example.mrmoveisAPP.app.Domain;

public class CategoriasDomain {
    public class CategoriasModelo{
        private String title;
        private int id;
        private String fotUrl;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getFotUrl() {
            return fotUrl;
        }

        public void setFotUrl(String fotUrl) {
            this.fotUrl = fotUrl;
        }

        public CategoriasModelo() {

        }
    }
}
