import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Classe que representa uma questão do quiz
class Questao {
    String pergunta = "";
    String opcaoA = "";
    String opcaoB = "";
    String opcaoC = "";
    String opcaoD = "";
    String opcaoE = "";
    String correta = "";

    public boolean isCorreta(String resposta) {
        if (resposta.equalsIgnoreCase(this.correta)) {
            System.out.println("Parabéns! Resposta Correta! - Letra: " + this.correta);
            System.out.println("");
            return true;
        } else {
            System.out.println("Resposta Errada!");
            System.out.println("A opção correta é a letra: " + this.correta);
            System.out.println("");
            return false;
        }
    }

    public String leiaResposta() {
        Scanner ler = new Scanner(System.in);
        String resp;
        do {
            System.out.println("Digite a resposta: ");
            resp = ler.next();
        } while (!respostaValida(resp));
        return resp;
    }

    private boolean respostaValida(String resp) {
        return resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") ||
                resp.equalsIgnoreCase("C") || resp.equalsIgnoreCase("D") ||
                resp.equalsIgnoreCase("E");
    }

    public void escrevaQuestao() {
        System.out.println(this.pergunta);
        System.out.println();
        System.out.println("A) " + this.opcaoA);
        System.out.println("B) " + this.opcaoB);
        System.out.println("C) " + this.opcaoC);
        System.out.println("D) " + this.opcaoD);
        System.out.println("E) " + this.opcaoE);
        System.out.println();
    }
}

// Classe principal que executa o quiz
public class Quiz {
    private List<Questao> questoes = new ArrayList<>();

    public void adicionarQuestao(Questao q) {
        questoes.add(q);
    }

    public void executarQuiz() {
        System.out.println("Bem-vindo ao Quiz!");
        System.out.println("Nome da Faculdade: Nome da Faculdade");
        System.out.println("Nome Completo do Aluno: Seu Nome Completo");
        System.out.println("Nome do Professor: Nome do Professor");
        System.out.println("Você irá responder 15 perguntas de múltipla escolha sobre o tema escolhido.");
        System.out.println();

        int acertos = 0;

        for (Questao questao : questoes) {
            questao.escrevaQuestao();
            String resposta = questao.leiaResposta();
            if (questao.isCorreta(resposta)) {
                acertos++;
            }
        }

        int total = questoes.size();
        System.out.println("Você acertou " + acertos + " de " + total + " questões.");
        System.out.println("Porcentagem de acertos: " + (acertos * 100 / total) + "%");
    }

    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        // Adicione suas 15 perguntas aqui
        Questao q1 = new Questao();
        q1.pergunta = "Qual é a fórmula da água?";
        q1.opcaoA = "H2O";
        q1.opcaoB = "CO2";
        q1.opcaoC = "O2";
        q1.opcaoD = "NaCl";
        q1.opcaoE = "H2";
        q1.correta = "A";
        quiz.adicionarQuestao(q1);

        Questao q2 = new Questao();
        q2.pergunta = "Qual é a capital da França?";
        q2.opcaoA = "Londres";
        q2.opcaoB = "Berlim";
        q2.opcaoC = "Paris";
        q2.opcaoD = "Madrid";
        q2.opcaoE = "Lisboa";
        q2.correta = "C";
        quiz.adicionarQuestao(q2);

        Questao q3 = new Questao();
        q3.pergunta = "Qual é o maior planeta do Sistema Solar?";
        q3.opcaoA = "Terra";
        q3.opcaoB = "Marte";
        q3.opcaoC = "Júpiter";
        q3.opcaoD = "Saturno";
        q3.opcaoE = "Vênus";
        q3.correta = "C";
        quiz.adicionarQuestao(q3);

        Questao q4 = new Questao();
        q4.pergunta = "Qual é a língua oficial do Brasil?";
        q4.opcaoA = "Espanhol";
        q4.opcaoB = "Português";
        q4.opcaoC = "Francês";
        q4.opcaoD = "Inglês";
        q4.opcaoE = "Italiano";
        q4.correta = "B";
        quiz.adicionarQuestao(q4);

        Questao q5 = new Questao();
        q5.pergunta = "Qual é a fórmula da glicose?";
        q5.opcaoA = "C6H12O6";
        q5.opcaoB = "C12H22O11";
        q5.opcaoC = "H2O";
        q5.opcaoD = "CO2";
        q5.opcaoE = "O2";
        q5.correta = "A";
        quiz.adicionarQuestao(q5);

        Questao q6 = new Questao();
        q6.pergunta = "Quem escreveu 'Dom Casmurro'?";
        q6.opcaoA = "Machado de Assis";
        q6.opcaoB = "José de Alencar";
        q6.opcaoC = "Clarice Lispector";
        q6.opcaoD = "Jorge Amado";
        q6.opcaoE = "Guimarães Rosa";
        q6.correta = "A";
        quiz.adicionarQuestao(q6);

        Questao q7 = new Questao();
        q7.pergunta = "Qual é o maior oceano do mundo?";
        q7.opcaoA = "Atlântico";
        q7.opcaoB = "Índico";
        q7.opcaoC = "Pacífico";
        q7.opcaoD = "Ártico";
        q7.opcaoE = "Antártico";
        q7.correta = "C";
        quiz.adicionarQuestao(q7);

        Questao q8 = new Questao();
        q8.pergunta = "Qual é o elemento químico com o símbolo 'O'?";
        q8.opcaoA = "Oxigênio";
        q8.opcaoB = "Ouro";
        q8.opcaoC = "Ósmio";
        q8.opcaoD = "Cálcio";
        q8.opcaoE = "Oxônio";
        q8.correta = "A";
        quiz.adicionarQuestao(q8);

        Questao q9 = new Questao();
        q9.pergunta = "Quem pintou a Mona Lisa?";
        q9.opcaoA = "Vincent van Gogh";
        q9.opcaoB = "Pablo Picasso";
        q9.opcaoC = "Leonardo da Vinci";
        q9.opcaoD = "Michelangelo";
        q9.opcaoE = "Rembrandt";
        q9.correta = "C";
        quiz.adicionarQuestao(q9);

        Questao q10 = new Questao();
        q10.pergunta = "Qual é o planeta conhecido como o 'Planeta Vermelho'?";
        q10.opcaoA = "Terra";
        q10.opcaoB = "Marte";
        q10.opcaoC = "Júpiter";
        q10.opcaoD = "Vênus";
        q10.opcaoE = "Saturno";
        q10.correta = "B";
        quiz.adicionarQuestao(q10);

        Questao q11 = new Questao();
        q11.pergunta = "Qual é o maior continente do mundo?";
        q11.opcaoA = "África";
        q11.opcaoB = "América do Norte";
        q11.opcaoC = "Ásia";
        q11.opcaoD = "Europa";
        q11.opcaoE = "Oceania";
        q11.correta = "C";
        quiz.adicionarQuestao(q11);

        Questao q12 = new Questao();
        q12.pergunta = "Qual é a capital do Japão?";
        q12.opcaoA = "Seul";
        q12.opcaoB = "Tóquio";
        q12.opcaoC = "Pequim";
        q12.opcaoD = "Bangcoc";
        q12.opcaoE = "Hanoi";
        q12.correta = "B";
        quiz.adicionarQuestao(q12);

        Questao q13 = new Questao();
        q13.pergunta = "Qual é a principal fonte de energia do Sol?";
        q13.opcaoA = "Fusão nuclear";
        q13.opcaoB = "Fissão nuclear";
        q13.opcaoC = "Queima de combustíveis fósseis";
        q13.opcaoD = "Energia solar";
        q13.opcaoE = "Radiação";
        q13.correta = "A";
        quiz.adicionarQuestao(q13);

        Questao q14 = new Questao();
        q14.pergunta = "Qual é a moeda do Japão?";
        q14.opcaoA = "Yuan";
        q14.opcaoB = "Won";
        q14.opcaoC = "Dólar";
        q14.opcaoD = "Iene";
        q14.opcaoE = "Rupia";
        q14.correta = "D";
        quiz.adicionarQuestao(q14);

        Questao q15 = new Questao();
        q15.pergunta = "Qual é o nome do maior deserto do mundo?";
        q15.opcaoA = "Sahara";
        q15.opcaoB = "Gobi";
        q15.opcaoC = "Antártico";
        q15.opcaoD = "Kalahari";
        q15.opcaoE = "Atacama";
        q15.correta = "C";
        quiz.adicionarQuestao(q15);

        // Execute o quiz
        quiz.executarQuiz();
    }
}
