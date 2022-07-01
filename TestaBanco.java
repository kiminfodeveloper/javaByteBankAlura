public class TestaBanco {
	public static void main(String[] args) {
		Cliente kevyn = new Cliente();
		kevyn.setNome("Kevyn Melo");
		kevyn.setCpf("222.222.222.-22");
		kevyn.setProfissao("programador");

		Conta contaDoKevyn = new Conta(6646,969060);
		contaDoKevyn.deposita(100);

		contaDoKevyn.setTitular(kevyn);
		System.out.println(contaDoKevyn.getTitular().getNome());
		System.out.println(contaDoKevyn.getTitular());

	}
}