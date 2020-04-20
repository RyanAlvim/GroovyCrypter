import groovy.swing.SwingBuilder
import javax.swing.JOptionPane

def md5 = new CryptMD5();
def base64 = new CryptBase64();
def decrypt = new DecryptBase64();
new SwingBuilder().edt {
  frame(title: 'Cracker', size: [300, 300], locationRelativeTo: null, show: true) {
    gridLayout(cols: 1, rows: 2)
    button('CryptBase64', actionPerformed: {base64.Crypt64Main()})
    button('DecryptBase64',actionPerformed:{decrypt.DecryptBase64Main()})
    button('CryptMD5',actionPerformed:{md5.CryptMD5Main()})
    button('Credits',actionPerformed:{JOptionPane.showMessageDialog (null, "GλrkeyLonely#6714");})
    }
  }
