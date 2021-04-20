/*
* EQUIPO:
* JOSÉ MAURICIO CANUL CHUC
* MARCO ANTONIO TUZ PECH
* RODRIGO ÁNGEL POOT POOT
*JOSÉ RICARDO MAY ESTRELLA
*/
package metodosnumericos;
import javax.swing.JOptionPane;
import org.nfunk.jep.ParseException;
/**
 *
 * @author Mauricio
 */
public class NewtonRaphson extends javax.swing.JFrame {
    private Funcion F;
    
    public NewtonRaphson() {
        initComponents();
        setLocationRelativeTo(null);
        fun.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Aceptar = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        fun = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Res = new javax.swing.JTextArea();
        txtx0 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Método de Newton-Raphson");

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        Borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodosnumericos/borrar0.png"))); // NOI18N
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        fun.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        fun.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Res.setEditable(true);
        Res.setColumns(20);
        Res.setFont(new java.awt.Font("Ubuntu Light", 1, 15));
        Res.setRows(5);
        jScrollPane1.setViewportView(Res);

        txtx0.setFont(new java.awt.Font("Purisa", 0, 15)); // NOI18N
        txtx0.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Xo");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Ingrese Función");

        salir.setBackground(new java.awt.Color(242, 241, 240));
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodosnumericos/inicio.png"))); // NOI18N
        salir.setBorder(null);
        salir.setBorderPainted(false);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fun, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtx0, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtx0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(Aceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        double x = 0;
        double xo = 0;
        double ER = 0;
        int max = 0;
        int dec = 0;
        String deri = null;

        Res.setText(null);
        F = new Funcion(fun.getText());
        String r = "";
        int i = 0;
        boolean si = true;
        double tol = 0;
        max = 0;
        do {
            try {
                double xAnt = x;
                F.setF(fun.getText());
                if (i == 0) {
                    deri = F.Derivada();
                    xo = Double.parseDouble(txtx0.getText());
                    xAnt = xo;
                    dec = F.decimales();
                    if (F.menu() == 1) {
                        max = F.iteraciones();
                    } else { 
                        tol = F.tolerancia();
                    }
                }
                double fx = F.Evaluar(xAnt);
                F.setF(deri);
                x = F.Redondear(xAnt - (fx/F.Evaluar(xAnt)), dec);
                ER = F.Redondear(Math.abs((x - xAnt) / x), dec > 10 ? dec : 8);
                if (ER == 0) {
                    max = 0;
                    tol = 0;
                }
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Función Incorrecta", "ERROR", 0);
                max = 0;
                tol = 0;
                fun.requestFocus();
                si = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor Inicial Incorrecto", "ERROR", 0);
                max = 0;
                tol = 0;
                txtx0.setText(null);
                txtx0.requestFocus();
                si = false;
            }
            i++;
            if (tol == 0) {
                max--;
            } else if (ER < tol && i != 1) {
                tol = 0;
            }
            r += ("Iteración : " + i + "  |  Xi : " + x + "  |  Error : " + ER + "\n\n");
        } while (max > 0 || tol > 0 && i < 500);
        if (i == 500) {
            r = "La Función Diverge\n\n";
        }

        if (si) {
            JOptionPane.showMessageDialog(null, "Iteraciones Finalizadas", "Resultados", JOptionPane.INFORMATION_MESSAGE);
            Res.setText(r + "\nRespuesta Aproximada\nX = " + x);
        }
    }//GEN-LAST:event_AceptarActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        Res.setText(null);
        txtx0.setText(null);
        fun.setText(null);
        fun.requestFocus();
    }//GEN-LAST:event_BorrarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        if(evt.getSource() == salir){	
            MenuMetodos abrir=new MenuMetodos();
            abrir.setVisible(true);
            this.setVisible(false);
	}
    }//GEN-LAST:event_salirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Borrar;
    private javax.swing.JTextArea Res;
    private javax.swing.JTextField fun;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton salir;
    private javax.swing.JTextField txtx0;
    // End of variables declaration//GEN-END:variables
}
