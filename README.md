# Programação Orientada a Objetos II — quatro aulas práticas

Projeto único em Java 17/Maven com atividades independentes U1–U4.

## Pré-requisitos
- JDK 17+; Maven 3.8+; MySQL Server 8+ somente para U4.
- Para U1, execute em um computador com ambiente gráfico (Swing).

## Como executar
1. Abra esta pasta como projeto Maven no IntelliJ IDEA (ou terminal).
2. No terminal: `mvn clean compile`.
3. Menu integrado: `mvn exec:java`.
4. Também é possível executar diretamente a classe `main` de cada unidade na IDE.

### U4: banco MySQL
1. Inicie o servidor MySQL.
2. Execute `mysql -u root -p < sql/criar_banco.sql` (ou importe o arquivo pelo MySQL Workbench).
3. Configure variáveis de ambiente `DB_URL`, `DB_USER`, `DB_PASSWORD`. Exemplos:
   - DB_URL=`jdbc:mysql://localhost:3306/poo_ii?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC`
   - DB_USER=`root`
   - DB_PASSWORD=`sua_senha`
4. Rode a opção 4 do menu ou a classe `ConsultaMysql`.

**Atenção:** sem MySQL instalado/ativo, a U4 não poderá se conectar. O projeto não inclui credenciais reais. A U1 segue o roteiro: os botões não executam ações. A U2 aguarda ambas as threads finalizarem.

## Entrega acadêmica
O arquivo `documentacao/Relatorio_Aula_Pratica.pdf` contém texto e instruções precisas para inserir capturas de tela reais. Os espaços de evidência são intencionalmente vazios: não são prints fabricados. O PDF contém listagem dos códigos-fonte para cumprir os roteiros.
