package br.com.alura.forum.config.validacao;

public class ErroDeFormularioDto {
	private String campoErro;
	private String descricaoErro;

	public ErroDeFormularioDto(String campoErro, String descricaoErro) {
		super();
		this.campoErro = campoErro;
		this.descricaoErro = descricaoErro;
	}

	public String getCampoErro() {
		return campoErro;
	}

	public String getDescricaoErro() {
		return descricaoErro;
	}
}
