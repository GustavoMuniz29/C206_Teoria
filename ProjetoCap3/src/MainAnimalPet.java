public class MainAnimalPet {
    public static void main(String[] args) {
        //ANIMAL PET
        //1° ANIMAL:
        //ABRIR UM PONTEIRO:
        AnimalPet pet1 = new AnimalPet();

        //PASSAR OS PARAMETROS:
        pet1.nome = "Gato";
        pet1.especie = "Felino";
        pet1.som = "mia";
        pet1.comida = "racao de gato";
        pet1.idade = 2;

        //CHAMAR A FUNÇÃO ATRAVÉS DO PONTEIRO:
        pet1.emitirSom();
        pet1.alimentar();

        //______________________________________________________________________________________________________________
        //2° ANIMAL:
        //ABRIR UM PONTEIRO:
        AnimalPet pet2 = new AnimalPet();

        //PASSAR OS PARAMETROS:
        pet2.nome = "Cachorro";
        pet2.especie = "Canino";
        pet2.som = "late";
        pet2.comida = "racao";
        pet2.idade = 2;

        //CHAMAR A FUNÇÃO ATRAVÉS DO PONTEIRO:
        pet2.emitirSom();
        pet2.alimentar();

        //______________________________________________________________________________________________________________
        //3° ANIMAL:
        //ABRIR UM PONTEIRO:
        AnimalPet pet3 = new AnimalPet();

        //PASSAR OS PARAMETROS:
        pet3.nome = "Leao";
        pet3.especie = "Felino";
        pet3.som = "ruge";
        pet3.comida = "carne";
        pet3.idade = 2;

        //CHAMAR A FUNÇÃO ATRAVÉS DO PONTEIRO:
        pet3.emitirSom();
        pet3.alimentar();
    }
}
