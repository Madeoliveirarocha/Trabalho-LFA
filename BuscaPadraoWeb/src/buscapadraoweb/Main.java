/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package buscapadraoweb;

import buscaweb.CapturaRecursosWeb;
import java.util.ArrayList;

public class Main {

    // busca char em vetor e retorna indice
    public static int get_char_ref(char[] vet, char ref) {
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == ref) {
                return i;
            }
        }
        return -1;
    }

    // busca string em vetor e retorna indice
    public static int get_string_ref(String[] vet, String ref) {
        for (int i = 0; i < vet.length; i++) {
            if (vet[i].equals(ref)) {
                return i;
            }
        }
        return -1;
    }

    // retorna o próximo estado, dado o estado atual e o símbolo lido
    public static int proximo_estado(char[] alfabeto, int[][] matriz, int estado_atual, char simbolo) {
        int simbol_indice = get_char_ref(alfabeto, simbolo);
        if (simbol_indice != -1) {
            return matriz[estado_atual][simbol_indice];
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        // instancia e usa objeto que captura código-fonte de páginas Web
        CapturaRecursosWeb crw = new CapturaRecursosWeb();
        crw.getListaRecursos().add("https://autopapo.com.br/noticia/numero-do-chassi-o-que-e-consulta/");
        // crw.getListaRecursos().add("https://educacaoautomotiva.com/2018/08/01/ano-modelo-chassis/");
        // crw.getListaRecursos().add("https://www.univali.br/");

        ArrayList<String> listaCodigos = crw.carregarRecursos();

        String codigoHTML = listaCodigos.get(0);

        // mapa do alfabeto
        char[] alfabeto = "ABCDEFGHJKLMNPRSTUVWXYZ0123456789".toCharArray();

        // mapa de estados
        String[] estados = new String[18];
        for (int i = 0; i < 18; i++) {
            estados[i] = "q" + i;
        }

        String estado_inicial = "q0";

        // estados finais
        String[] estados_finais = new String[1];
        estados_finais[0] = "q17";

        // tabela de transição de AFD para reconhecimento de VIN (número de chassi)
        // alfabeto: 0-9, A-Z, exceto I, O, Q (não pode ter essas letras no chassi pois são confundidas com números)
        int[][] matriz = new int[18][alfabeto.length];

        for (int i = 0; i < 17; i++) {
            for (char c : alfabeto) {
                matriz[get_string_ref(estados, "q" + i)][get_char_ref(alfabeto, c)] = get_string_ref(estados, "q" + (i + 1));
            }
        }

        int estado = get_string_ref(estados, estado_inicial);
        int estado_anterior = -1;
        ArrayList<String> vinReconhecidos = new ArrayList<>();

        String vin = "";

        // varre o código-fonte de um código
        for (int i = 0; i < codigoHTML.length(); i++) {
            estado_anterior = estado;
            estado = proximo_estado(alfabeto, matriz, estado, codigoHTML.charAt(i));
            // se não há transição
            if (estado == -1) {
                // pega estado inicial
                estado = get_string_ref(estados, estado_inicial);
                // se o estado anterior foi um estado final
                if (get_string_ref(estados_finais, estados[estado_anterior]) != -1) {
                    // se o VIN não é vazio adiciona VIN reconhecido
                    if (!vin.equals("")) {
                        vinReconhecidos.add(vin);
                    }
                }
                // zera vin
                vin = "";
            } else {
                // se houver transição válida, adiciona caractere ao vin
                vin += codigoHTML.charAt(i);
            }
        }

        // foreach no Java para exibir todos os vin reconhecidos
        if (vinReconhecidos.isEmpty()) {
            System.out.println("Nenhum VIN encontrado no código HTML.");
        } else {
            for (String p : vinReconhecidos) {
                System.out.println("VIN encontrado: " + p);
            }
        }
    }
}
