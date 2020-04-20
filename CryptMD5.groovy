import java.security.MessageDigest
import javax.swing.JOptionPane
import java.io.FileWriter;
import java.io.PrintWriter;

class CryptMD5{
  def CryptMD5Main(){
      def md5 = ""
      def input = JOptionPane.showInputDialog("MD5")

      MessageDigest crypt = MessageDigest.getInstance('MD5')
      crypt.update(input.bytes, 0, input.length())
      md5 = new BigInteger(1, crypt.crypt()).toString(16)

      FileWriter txtmd5 = new FileWriter("$input(MD5)" + ".txt")
      PrintWriter gravarmd5 = new PrintWriter(txtmd5)
      gravarmd5.printf("MD5: $md5")
      gravarmd5.close()
    }
}
