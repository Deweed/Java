public class emprestimo {
        private int diasAtraso;
        private double taxaMulta;

        public emprestimo(material material, int diasAtraso, double taxaMulta) {
            this.diasAtraso = diasAtraso;
            this.taxaMulta = taxaMulta;
        }

        public double calcularMulta() {
            return diasAtraso * taxaMulta;
        }


}
