public class Moto extends Veiculo {
        private boolean eletrica;

        public Moto(String marca, String modelo, int ano, boolean eletrica) {
            super(marca, modelo, ano);
            this.eletrica = eletrica;
        }

        public boolean isEletrica() {
            return eletrica;
        }

        public void setEletrica(boolean eletrica) {
            this.eletrica = eletrica;
        }

        @Override
        public String toString() {
            return super.toString() + ", Elétrica: " + eletrica;
        }
}
