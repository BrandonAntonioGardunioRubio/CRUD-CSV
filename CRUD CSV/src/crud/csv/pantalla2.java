package crud.csv;

import com.opencsv.exceptions.CsvValidationException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;


public class pantalla2 extends javax.swing.JPanel {
     public JFrame frame;
     DefaultTableModel modelo=new DefaultTableModel(){
         @Override
         public boolean isCellEditable(int row,int column){
             return false;
         }
     };

    public pantalla2(JFrame jf ){
        initComponents();
         try {
             llenarTabla();
         } catch (CsvValidationException ex) {
             Logger.getLogger(pantalla2.class.getName()).log(Level.SEVERE, null, ex);
         }
        this.frame=jf;
        txtinicio.setHorizontalAlignment(SwingConstants.CENTER);
        txtagregar.setHorizontalAlignment(SwingConstants.CENTER);
        txtmodificar.setHorizontalAlignment(SwingConstants.CENTER);
        txteliminar.setHorizontalAlignment(SwingConstants.CENTER);
    }

    private void llenarTabla() throws CsvValidationException{
        ArrayList<Object> nombreColumnas=new ArrayList<>();
        nombreColumnas.add("ID");
        nombreColumnas.add("Nombre plantilla");
        nombreColumnas.add("Descripcion ");
        for(Object columnas: nombreColumnas){
            modelo.addColumn(columnas);
        }
        this.tblPlantilla.setModel(modelo);
        ArrayList<Plantiilla> pl=CSVManager.leerCSV();
        
        modelo=(DefaultTableModel)tblPlantilla.getModel();
        Object[] ob=new Object[3];
        for(int i=0;i<pl.size();i++){
            Plantiilla plantilla=pl.get(i);
            ob[0]=plantilla.getIdPlantilla();
            ob[1]=plantilla.getNombre();
            ob[2]=plantilla.getDescripcion();
            modelo.addRow(ob);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        txtagregar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txteliminar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtmodificar = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtinicio = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPlantilla = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(640, 301));

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel1.setText("Administrar plantillas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 20));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 190, 10));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtagregar.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        txtagregar.setText("Agregar");
        txtagregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtagregarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 251, 50));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txteliminar.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        txteliminar.setText("Eliminar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txteliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txteliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 251, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtmodificar.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        txtmodificar.setText("Modificar");
        txtmodificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtmodificarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 251, 50));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtinicio.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        txtinicio.setText("Examinar plantilla");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jScrollPane2.setViewportView(tblPlantilla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtagregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtagregarMouseClicked
        
        agregarPlantilla agr= new agregarPlantilla();
        agr.setVisible(true);
        frame.dispose();
    }//GEN-LAST:event_txtagregarMouseClicked

    private void txtmodificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtmodificarMouseClicked
        int fila = tblPlantilla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un registro para modificar");
       } else {
            int id = Integer.parseInt(tblPlantilla.getValueAt(fila, 0).toString());
            try {
                ArrayList<Plantiilla> listaPlantilla=CSVManager.leerCSV();
                Plantiilla pl=listaPlantilla.get(id);
                pl.setNombre("Prueba 1");
                pl.setDescripcion("wenas");
                CSVManager.modificarRegistro(listaPlantilla, id, pl);
            } catch (CsvValidationException ex) {
                Logger.getLogger(pantalla2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
       }
    }//GEN-LAST:event_txtmodificarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblPlantilla;
    private javax.swing.JLabel txtagregar;
    private javax.swing.JLabel txteliminar;
    private javax.swing.JLabel txtinicio;
    private javax.swing.JLabel txtmodificar;
    // End of variables declaration//GEN-END:variables
}
