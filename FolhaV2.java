import javax.swing.JOptionPane;

public class FolhaV2{
    public static void main(String args[]){
        
        EmpregadoV2 e1;
        String txtNome;
        String txtCargo;
        String txtSalario;
        String txtAumento;

        JOptionPane.showMessageDialog(null,"Bem vindo ao sistema de Folha de Pagamentos");
        txtNome    = JOptionPane.showInputDialog("Digite o nome do Funcionario");
        txtCargo   = JOptionPane.showInputDialog("Digite o cargo do Funcionario");
        txtSalario = JOptionPane.showInputDialog("Digite o salario do Funcionario");

        // e1 = new Empregado();
        EmpregadoV2 e1;
        e1 = new EmpregadoV2(txtNome, txtCargo, Double.parseDouble(txtSalario));

        // e1.setNome(txtNome);
        // e1.setCargo(txtCargo);
        // e1.setSalario(Double.parseDouble(txtSalario));

        JOptionPane.showMessageDialog(null, e1.exibirInfo());
        txtAumento = JOptionPane.showInputDialog("Digite a porcentagem de aumento");
        e1.aumentarSalario(Double.parseDouble(txtAumento));
        JOptionPane.showMessageDialog(null, e1.exibirInfo());

    }
}