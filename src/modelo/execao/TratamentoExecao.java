package modelo.execao;

public class TratamentoExecao extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public TratamentoExecao(String msg) {
		super(msg);
	}

}
