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
public class Biseccion extends javax.swing.JFrame {

    private double xr;
    private double xi;
    private double xs;
    private double ER;
    private int max;
    private int dec;
    private Funcion F;
    
    
    public Biseccion() {
        initComponents();
        setLocationRelativeTo(null);
        fun.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txta = new javax.swing.JTextField();
        txtb = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Res = new javax.swing.JTextArea();
        Borrar = new javax.swing.JButton();
        Aceptar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        fun = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Método de Bisección");
        setName("Biseccion"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Xi");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Xs");

        txta.setFont(new java.awt.Font("Purisa", 0, 15)); // NOI18N
        txta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txta.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txta.setName("txta"); // NOI18N
        txta.setNextFocusableComponent(txtb);

        txtb.setFont(new java.awt.Font("Purisa", 0, 15)); // NOI18N
        txtb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtb.setNextFocusableComponent(Aceptar);

        Res.setEditable(true);
        Res.setColumns(20);
        Res.setFont(new java.awt.Font("Ubuntu Light", 1, 15));
        Res.setRows(5);
        Res.setNextFocusableComponent(salir);
        jScrollPane1.setViewportView(Res);

        Borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodosnumericos/borrar0.png"))); // NOI18N
        Borrar.setNextFocusableComponent(salir);
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        Aceptar.setText("Aceptar");
        Aceptar.setNextFocusableComponent(Borrar);
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(242, 241, 240));
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodosnumericos/inicio.png"))); // NOI18N
        salir.setBorder(null);
        salir.setBorderPainted(false);
        salir.setNextFocusableComponent(fun);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Ingrese Función");

        fun.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        fun.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fun.setNextFocusableComponent(txta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel3))
                            .addComponent(fun, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel1)
                                .addGap(4, 4, 4)
                                .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel2)
                                .addGap(4, 4, 4)
                                .addComponent(txtb, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(7, 7, 7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(11, 11, 11)
                        .addComponent(fun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel1))
                            .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel2))
                            .addComponent(txtb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Aceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, Short.MAX_VALUE)
                        .addGap(18, 18, 18))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        Res.setText(null);
        txtb.setText(null);
        txta.setText(null);
        fun.setText(null);
        fun.requestFocus();
    }//GEN-LAST:event_BorrarActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        F = new Funcion(fun.getText());
        Res.setText(null);
        xr = 0; int i = 0;
        String r = "";
        boolean si=true;
        double tol = 0; max = 0;
        double fa = 0;
        double fb = 0;
        double fc = 0;
        do{
            try {
                if(i==0){
                    xi = Double.parseDouble(txta.getText());
                    xs = Double.parseDouble(txtb.getText());
                    dec = F.decimales();
                    if(F.menu() == 1)
                        max = F.iteraciones();
                    else
                        tol = F.tolerancia();
                }
                fa = F.Redondear(F.Evaluar(xi), dec);
                fb = F.Redondear(F.Evaluar(xs), dec);
                double xAnt = xr;
                
                xr = F.Redondear(xi + ((xs-xi)/2), dec);
                fc = F.Redondear(F.Evaluar(xr), dec);
                ER = F.Redondear(Math.abs((xr - xAnt) / xr), dec > 10 ? dec : 8);
                if(max > 1 || ER >= tol){
                    if (fc * fb < 0) {
                        xi = xr;
                    } else if (fc * fa < 0) {
                        xs = xr;
                    } else if(fc * fa == 0 || fc * fb == 0){
                        max = 0;
                        tol = 0;
                    }
                    else{
                        max = 0;
                        tol = 0;
                        r = "Valores Limites \nIncorrectos\nLa Función Diverge";
                        si = false;
                        Res.setText(r);
                    }
                }
            }catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Función Incorrecta", "ERROR", 0);
                max = 0;
                tol = 0;
                fun.requestFocus();
                si = false;
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Valores limites Incorrectos", "ERROR", 0);
                max = 0;
                tol = 0;
                txta.setText(null);
                txtb.setText(null);
                txta.requestFocus();
                si = false;
            }
            i++;
            if(tol == 0)
                max--;
            else
                if(ER < tol && i != 1)
                    tol = 0;
            //"  |  F(b): " + fb + 
            r += ("Iteración: "+i+"  |  Xi: "   + xi +   "  |  Xs: " + xs + "  |  Xr: " + xr + "  |  F(Xi): " + fa 
                    + "  |  F(Xr): " + fc + "  |  F(Xi)*F(Xr): " + fa*fc + "  |  E.R: " + ER + "\n\n");
        }while(max > 0 || tol > 0 && i < 500);
        
        if (si){
            JOptionPane.showMessageDialog(null, "Iteraciones Finalizadas", "Resultados", JOptionPane.INFORMATION_MESSAGE);
            Res.setText(r + "\nRespuesta Aproximada\nX =  " + xr);
        }
    }//GEN-LAST:event_AceptarActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton salir;
    private javax.swing.JTextField txta;
    private javax.swing.JTextField txtb;
    // End of variables declaration//GEN-END:variables
}
