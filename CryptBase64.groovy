import javax.swing.JOptionPane
import java.io.FileWriter;
import java.io.PrintWriter;
class CryptBase64{
  def Crypt64Main(){
    def texto = JOptionPane.showInputDialog("Text");
    def encoded = texto.bytes.encodeBase64().toString()

    FileWriter txt = new FileWriter("$texto(Base64)" + ".txt")
    PrintWriter gravartxt = new PrintWriter(txt);

    gravartxt.printf("Base64: " + encoded)
    gravartxt.close()
}

}
