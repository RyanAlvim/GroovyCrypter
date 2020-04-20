import javax.swing.JOptionPane
import java.io.FileWriter;
import java.io.PrintWriter;

class DecryptBase64{
  def DecryptBase64Main(){
      def object = JOptionPane.showInputDialog('Hash')

      byte[] transobject = object.decodeBase64()
      String res = new String(transobject)

      FileWriter txt = new FileWriter("$res" + ".txt")
      PrintWriter gravartxt = new PrintWriter(txt);

      gravartxt.printf("Decrypt(Base64): " + res)
      gravartxt.close()
    }
}
