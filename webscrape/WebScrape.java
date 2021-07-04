



import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class WebScrape {
    public static void main(String args[]){

    final String url =
            "https://www.moneycontrol.com/markets/indian-indices/";

    try{

      final Document document = Jsoup.connect(url).get();
           for (Element row: document.select("table.responsive tr")) {


               if(row.select("td:nth-of-type(1)").text().equals("")) {
                   continue;
               }

                else{
                final String comp = row.select("td:nth-of-type(1)").text();
                final String ltp = row.select("td:nth-of-type(2)").text();

                   System.out.println(comp + " " + ltp);
                }

           }
    }

      catch(Exception Ex){
         Ex.printStackTrace();
       }
    }

}
