package emailFormatado;

import java.util.HashMap;
import java.util.Map;

class GeradorEmail {
	//mapa para ver quantas vezes o email foi gerado
    private Map<String, Integer> contadorEmails = new HashMap<>();

    //gerar email a partir do nome completo
    public String gerarEmail(String nomeCompleto) {
        String[] partes = nomeCompleto.toLowerCase().split(" ");
        String emailBase = partes[0] + "." + partes[partes.length - 1];

        int qtd = contadorEmails.getOrDefault(emailBase, 0) + 1;
        contadorEmails.put(emailBase, qtd);

        return emailBase + (qtd > 1 ? qtd : "") + "@empresa.com";
    }
}