![image](https://github.com/HidekiSanches/API-Pokedex-v2/assets/111136206/68863552-b993-47fc-b98e-9b2252298d0b)

<h1>API-Pokedex-v2</h1>
<div style="justify-content: space-around">
  <img src="https://img.shields.io/badge/Made%20with-Java-1f425f.svg">
  <img src="https://img.shields.io/badge/Made%20with-SpringBoot-1f425f.svg">
</div>

<h2>Descrição</h2>
<p>
  API-Pokedex-v2 é uma API RESTful desenvolvida em Java com Spring Boot, que fornece dados detalhados sobre todos os Pokémon. Esta versão atualizada oferece novos recursos, melhorias de desempenho e dados adicionais, permitindo uma integração mais eficiente e informativa para desenvolvedores que desejam incorporar informações da Pokédex em seus aplicativos.
</p>

<h2>Recursos</h2>
<ul>
  <li><strong>Dados abrangentes:</strong> Informações completas sobre todos os Pokémon, incluindo estatísticas, habilidades, evoluções e muito mais.</li>
  <li><strong>Filtros avançados:</strong> Pesquise Pokémon por tipo, região, geração, e outras características específicas.</li>
  <li><strong>Melhorias de desempenho:</strong> Consultas mais rápidas e eficientes para um desempenho otimizado.</li>
  <li><strong>Endpoints adicionais:</strong> Novos endpoints para acessar dados complementares como itens, habilidades, e movimentos.</li>
  <li><strong>Documentação detalhada:</strong> Documentação completa para facilitar a integração e utilização da API.</li>
</ul>

<h2>Requisitos</h2>
<ul>
  <li>Java 17 ou superior</li>
  <li>Spring Boot 3.2.x ou superior</li>
  <li>mySQL 8.x ou superior</li>
</ul>

<h2>Instalação</h2>
<ol>
  <li>Clone o repositório:
    <pre><code>git clone https://github.com/HidekiSanches/API-Pokedex-v2.git</code></pre>
  </li>
  <li>Navegue até o diretório do projeto:
    <pre><code>cd API-Pokedex-v2</code></pre>
  </li>
  <li>Configure as variáveis de ambiente no arquivo <code>application.properties</code> conforme o exemplo fornecido em <code>application.properties.example</code>.</li>
  <li>Compile e execute o projeto:
    <pre><code>./mvnw spring-boot:run</code></pre>
  </li>
</ol>

<h2>Uso</h2>
<ol>
  <li>Inicie o servidor:
    <pre><code>./mvnw spring-boot:run</code></pre>
  </li>
  <li>Acesse a API em <code>http://localhost:8080</code>.</li>
</ol>

<h2>Endpoints Principais</h2>
<ul>
  <li><code>GET /api/pokemon</code>: Lista todos os Pokémon.</li>
  <li><code>GET /api/pokemon/{id}</code>: Detalhes de um Pokémon específico.</li>
  <li><code>GET /api/types</code>: Lista todos os tipos de Pokémon.</li>
  <li><code>GET /api/abilities</code>: Lista todas as habilidades de Pokémon.</li>
</ul>
<p>
  Para uma lista completa de endpoints e exemplos de uso, consulte a <a href="docs/documentation.md">documentação</a>.
</p>

<h2>Contribuição</h2>
<p>Contribuições são bem-vindas! Por favor, siga as etapas abaixo:</p>
<ol>
  <li>Faça um fork do repositório.</li>
  <li>Crie um branch para sua feature (<code>git checkout -b feature/nova-feature</code>).</li>
  <li>Commit suas mudanças (<code>git commit -am 'Adiciona nova feature'</code>).</li>
  <li>Envie para o branch (<code>git push origin feature/nova-feature</code>).</li>
  <li>Abra um Pull Request.</li>
</ol>

<h2>Licença</h2>
<p>
  Este projeto está licenciado sob a licença MIT. Veja o arquivo <a href="LICENSE">LICENSE</a> para mais detalhes.
</p>

<h2>Contato</h2>
<p>Para questões e sugestões, por favor, abra uma issue ou entre em contato:</p>
<ul>
  <li><strong>Email:</strong> sanches.thi81@gmail.com</li>
  <li><strong>GitHub Issues:</strong> <a href="https://github.com/HidekiSanches/API-Pokedex-v2/issues">Issues</a></li>
</ul>
