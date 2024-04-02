public class Carro extends Veiculo{
        private int numeroPortas;

        public Carro(String marca, String modelo, int ano, int numeroPortas) {
            super(marca, modelo, ano);
            this.numeroPortas = numeroPortas;
        }

        public int getNumeroPortas() {
            return numeroPortas;
        }

        public void setNumeroPortas(int numeroPortas) {
            this.numeroPortas = numeroPortas;
        }

        @Override
        public String toString() {
            return super.toString() + ", Número de Portas: " + numeroPortas;
        }
}

