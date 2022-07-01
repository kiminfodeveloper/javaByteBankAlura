public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoKevyn = new Conta(6646,969060);
		contaDoKevyn.deposita(100);
		contaDoKevyn.deposita(50);
		System.out.println(contaDoKevyn.getSaldo());

		boolean conseguiuRetirar = contaDoKevyn.saca(20);
		System.out.println(contaDoKevyn.getSaldo());
		System.out.println(conseguiuRetirar);

		Conta contaDaMarcela = new Conta(6644,969063);
		contaDaMarcela.deposita(1000);

		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoKevyn);

		if (sucessoTransferencia) {
			System.out.println("transferencia com sucesso");

		} else {
			System.out.println("faltou dinheiro");

		}
		System.out.println(contaDaMarcela.getSaldo());
		System.out.println(contaDoKevyn.getSaldo());
	}

}