package JonaxMed.api.domain.medico;

import JonaxMed.api.domain.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroMedico(

        @NotBlank // não nulo e não vazio, em strings
        String nome,

        @NotBlank
        @Email // validação email
        String email,

        @NotBlank
        String telefone,

        @NotBlank
        @Pattern(regexp = "\\d{4,6}") // padrão 4 a 6 dígitos
        String crm,

        @NotNull
        Especialidade especialidade,

        @NotNull
        @Valid // chamar a validação de DadosEndereço
        DadosEndereco endereco) {

}
