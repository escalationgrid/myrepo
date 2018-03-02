package htmlParse;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
 
public class htmlParser{
 
    public static void main(String args[]) {
 
        // Parse HTML String using JSoup library
        String cycleHtmlEmail = CycleHtmlContent.EMAIL_CONTENT;
 
        Document html = Jsoup.parse(cycleHtmlEmail);
        
        //String cycle_title_all = html.body().getElementsByTag("span").get(0).text(); //OK
        String cycle_title_all_1 = html.body().getElementsByTag("tr").get(0).text(); //OK
        String cycle_title_all_2 = html.body().getElementsByTag("tr").get(1).text(); // OK
        String cycle_chamado_numero = html.body().getElementsByTag("a").text(); 
        String cycle_chamado_numero_link = html.body().getElementsByTag("a").attr("href"); // OK
        
        String cycle_solicitante_title =  html.body().getElementsByTag("tr").get(2).text(); //OK
        String cycle_solicitante_contato =  html.body().getElementsByTag("td").get(3).text();
        String cycle_solicitante_local =  html.body().getElementsByTag("td").get(4).text();
        String cycle_solicitante_empresa =  html.body().getElementsByTag("td").get(5).text();
        String cycle_solicitante_data_solicitacao =  html.body().getElementsByTag("td").get(6).text();
        
        String cycle_detalhes_chamado_title =  html.body().getElementsByTag("td").get(7).text();
        String cycle_detalhes_chamado_responsavel =  html.body().getElementsByTag("td").get(8).text();
        String cycle_detalhes_chamado_acao =  html.body().getElementsByTag("td").get(9).text();
        String cycle_detalhes_chamado_procedimento =  html.body().getElementsByTag("td").get(10).text();
        String cycle_detalhes_chamado_data_acao =  html.body().getElementsByTag("td").get(11).text();
        String cycle_detalhes_chamado_descricao =  html.body().getElementsByTag("td").get(12).text();
        String cycle_detalhes_chamado_data_limite =  html.body().getElementsByTag("td").get(13).text();
        
        String cycle_mensagens =  html.body().getElementsByTag("td").get(14).text();
        String[] mensagensList = cycle_mensagens.split("---------- Mensagem original ----------");
        
        String cycle_informacoes_adicionais_title =  html.body().getElementsByTag("td").get(15).text();
        String cycle_informacoes_adicionais_bloco =  html.body().getElementsByTag("td").get(16).text(); // BLOCO
     
       //  String cycle_informacoes  =  html.body().getElementsByTag("td").get(16).html(); // BLOCO COM HTML
        
        System.out.println("cycle_title_all_1:                     " + cycle_title_all_1);
        System.out.println("cycle_title_all_2:                     " + cycle_title_all_2);
        System.out.println("cycle_chamado_numero:                  " + cycle_chamado_numero);
        System.out.println("cycle_chamado_numero_link:             " + cycle_chamado_numero_link);
        
        System.out.println("cycle_solicitante_title:               " + cycle_solicitante_title);
        System.out.println("cycle_solicitante_contato:             " + cycle_solicitante_contato);
        System.out.println("cycle_solicitante_local:               " + cycle_solicitante_local);
        System.out.println("cycle_solicitante_empresa:             " + cycle_solicitante_empresa);
        System.out.println("cycle_solicitante_data_solicitacao:    " + cycle_solicitante_data_solicitacao);
        
        System.out.println("cycle_detalhes_chamado_title:          " + cycle_detalhes_chamado_title);
        System.out.println("cycle_detalhes_chamado_responsavel:    " + cycle_detalhes_chamado_responsavel);
        System.out.println("cycle_detalhes_chamado_acao:           " + cycle_detalhes_chamado_acao);
        System.out.println("cycle_detalhes_chamado_procedimento:   " + cycle_detalhes_chamado_procedimento);
        System.out.println("cycle_detalhes_chamado_data_acao:      " + cycle_detalhes_chamado_data_acao);
        System.out.println("cycle_detalhes_chamado_descricao:      " + cycle_detalhes_chamado_descricao);
        System.out.println("cycle_detalhes_chamado_data_limite:    " + cycle_detalhes_chamado_data_limite);
        
        System.out.println("cycle_mensagens:                       " + cycle_mensagens);
        System.out.println("cycle_mensagensList:                   ");
        for( int i = 0; i <= mensagensList.length - 1; i++) {
        System.out.println("                                    -->" + mensagensList[i].trim() );
        }
        
        System.out.println("cycle_informacoes_adicionais_title:    " + cycle_informacoes_adicionais_title);
        System.out.println("cycle_informacoes_adicionais_bloco:    " + cycle_informacoes_adicionais_bloco);
        
        
        
    }
 
}
