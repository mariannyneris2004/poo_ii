# Programação Orientada a Objetos II — quatro aulas práticas

Projeto único em Java 17/Maven com atividades independentes U1–U4.

## Pré-requisitos
- JDK 17+; Maven 3.8+; MySQL Server 8+ somente para U4.
- Para U1, execute em um computador com ambiente gráfico (Swing).

### U4: banco MySQL
1. Inicie o servidor MySQL.
2. Execute `mysql -u root -p < sql/criar_banco.sql` (ou importe o arquivo pelo MySQL Workbench).
3. Configure variáveis de ambiente `DB_URL`, `DB_USER`, `DB_PASSWORD`. Exemplos:
   - DB_URL=`jdbc:mysql://localhost:3306/poo_ii?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC`
   - DB_USER=`root`
   - DB_PASSWORD=`sua_senha`
4. Rode a opção 4 do menu ou a classe `ConsultaMysql`.
