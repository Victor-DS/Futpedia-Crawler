# Futpedia-Scrapper
Scrapper para obter dados da Futpédia

## O quê é isto?
Um Web Scrapper, em Java, para obter dados da Futpédia.

Em outras palavras, ele abre uma conexão com o site da Futpédia, e varre o HTML em busca dos dados, e te retorna um POJO com os dados.

A lista de Campeonatos vem **puro**, ou seja, vem todos os dados e eles não são tratados. Recomendo verificar as classes no respectivo pacote para verificar exatamente os dados que você vai precisar...

Já os detalhes de um campeonato específico, em algumas situações vem do Javascript, enquanto que em outras do HTML, então os dados são tratados para unificar e simplificar.

Se você quiser puxar os dados puros, está implementado, mas não são todos os campeonatos que vão suportar.

## Como usar?
Basta criar um instância do Objeto ``Futpedia``, e chamar o método para obter uma lista de campeonatos, ou algum campeonato específico.
Por exemplo, para obter uma lista de todos os campeonatos brasileiros:
```java
Futpedia fp = new Futpedia();
ResultadoListaCampeonatos brs;
try {
  brs = fp.getBrasileiroUnificado();
} catch (Exception ex) {
  //Exceptions: IOException, FileNotFoundException, etc...
}
```

Para imprimir uma lista dos campeões, do mais recente para o mais antigo:
```java
for(Campeo c : brs.getCampeoes())
  System.out.println(c.getNomePopular());
```

Para obter a lista de times de um campeonato específico:
```java
CampeonatoSimples cs;
try {
  cs = fp.getDetalhesCampeonato("http://futpedia.globo.com/campeonato/campeonato-brasileiro/2016"); //Você também pode pegar a URL dentro do "ResultadoListaCampeonatos" no objeto "EdicaoDetalhes".
} catch (Exception ex) {
  //Exceptions: IOException, FileNotFoundException, etc...
}
                
System.out.println("Lista de equipes:");
for(String s: cs.getEquipes().keySet())
  System.out.println("Key: " + s + " / " + rc.getEquipe(s).getNomePopular());
```

## Que tipo de dados retorna?
- Todas as edições de cada campeonato;
- Jogos para cada uma das edições, e também os times que participaram dela;
- Resultados de partidas;

Dentre outros dados!

## Dependências
Para executar este projeto, você vai precisar de duas Libs:
- **Gson** para obter os dados que vem do JavaScript;
- **Jsoup** para obter os dados diretamente das TAGs HTML;

## LICENSE
```
The MIT License (MIT)

Copyright (c) 2016 Victor Santiago

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
