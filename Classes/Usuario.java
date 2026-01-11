package Classes;

public class Usuario {
	
	private String nome;
	private String cpf; 
	private String data_nasc;
	protected double somaAvaliacao; // Atributo para a soma de avaliações que o usuário pode receber
	protected int qtdAvaliacoes; // Atributo para a quantidade de avaliações
	protected double media; // Armazena a média das notas
	protected int nroCorrida; // Quantidade de corrida 
	
	public Usuario(String n, String cp, String data) {
	    this.nome = n;
	    this.cpf = cp;
	    this.data_nasc = data;
	    this.somaAvaliacao = 0;
	    this.qtdAvaliacoes = 0;
	    this.media = 0;
	    this.nroCorrida = 0;
	}

	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	
	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}
	
	
	public String getData_nasc() {
		return data_nasc;
	}

	public double getSomaAvaliacao() {
		return somaAvaliacao;
	}

	public void setSomaAvaliacao(double somaAvaliacao) {
		this.somaAvaliacao = somaAvaliacao;
	}

	public int getQtdAvaliacoes() {
		return qtdAvaliacoes;
	}

	public void setQtdAvaliacoes(int qtdAvaliacoes) {
		this.qtdAvaliacoes = qtdAvaliacoes;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public int getNroCorrida() {
		return nroCorrida;
	}

	public void setNroCorrida(int nroCorrida) {
		this.nroCorrida = nroCorrida;
	}
	
	// Métodos
	
	public void addAvaliacao(double valor) { // Adciona as avaliações e calcula a média
		if(valor >= 0) {
			somaAvaliacao += valor;
			qtdAvaliacoes ++;
			media = somaAvaliacao / qtdAvaliacoes;
		}
	}
	
	
	public void incrementaCorrida() { 
		nroCorrida ++; 
	}
	
	//Algorítmo para validar o CPF
    public static boolean validar(String CPF){ // Um método de validação estático foi criado para que possa ser acessado nas classes do mesmo pa-cote sem que uma instância da classe seja criada
        CPF = remover(CPF); //Chamando o método para remover os caracteres do cpf e facilitar as operações
        int[] vet = CPFtoArray(CPF); //Transformando meu cpf em array

        if(verificar(1, vet) == true){ //Passando como parâmetro a primeira posição
            return true; // Valido
        }else{
            return false; //Cpf invalido
        }
    }

    private static String remover(String CPF){ //Método privado para retirar os caracteres do cpf. Ele é privado para que não corra o risco de ser acessado nas outras classes, pode ser acessado apenas nessa em questão
        if(CPF.contains(".") || CPF.contains("-")){
            CPF = CPF.replace(".", "");
            CPF = CPF.replace("-", "");

        }
        return CPF;
    }

    //Função para transformar CPF em um vetor de inteiros
    private static int[] CPFtoArray(String CPF){
        int [] vet = new int[11];
        for(int i = 0; i <= 10; i++){
            vet[i] = Integer.parseInt(String.valueOf(CPF.charAt(i))); //Convertenedo o String para int (CharAt(i))) é um método próprio do string, valueof eu transformo em string

        }
        return vet;
    }

    private static boolean verificar(int pos, int[] cpf){ //Esse método vai pegar a posição do vetor, e verificar se eu estou verficando o primeiro digito(Verificador) ou o segundo
        int mult = 0; //Inicializando o valor que irá multiplicar os valores dos 9 primeiros digitos do cpf
        int par, result = 0, resto; //"par" é o parâmetro que será usado para indicar até qual posição do vetor eu farei os cálculos para gerar o primeiro dígito ou o segundo, "result" guarda o resultado, resto guardará o resto da divisão

        if(pos == 1){ //Se for o primeiro digito, mult inicia em 10
            mult = 10;
        }else{
            mult = 11; //Se for o segundo dígito
        }
        par = 7 + pos; //Se for o primeiro digito eu utilizarei os 9 primeiros digitos, se for o 2 eu utilizarei os 10 primeiros

        for(int i = 0; i <= par; i++){
            result += mult * cpf[i];
            mult--;  //Decrementando o valor do multiplicador até que chegue no digito indicado. Lembrando que ele irá decrementar até o número 2, seja para achar o primeiro digito verificador ou o segundo
        }
        resto =  result % 11; //Atribuindo ao resto, a divisão do resultado por 11

        if(resto < 2) {
            if (cpf[par + 1] == 0) { //Verificando se o primeiro ou segundo código verificador será igual a 0
                if (pos == 1) {  //Verificando se a posição do vetor é 1, se o resto do primeiro digito verificador for menor que 2 eu preciso calcular o segundo digito
                    return verificar(2, cpf); //Recursão com a posição igual a 2
                } else {
                    return true;
                }
            } else {
                return false; //Falso
            }
        }
        return true;
    }
	
	
}