# Futpedia-Scrapper
Scrapper para obter dados da Futpédia

## O quê é isto?
Um Web Scrapper, em Java, para obter dados da Futpédia.
Em outras palavras, ele abre uma conexão com o site da Futpédia, e varre o HTML em busca dos dados, e te retorna um POJO **puro** (isso quer dizer que alguns dados podem não estar ordenados ou separados, por exemplo, um objeto possui uma ID que referencia uma lista de times em um ``Map``).

## Como usar?
Basta criar um instância do Objeto ``Futpedia``, e chamar o método para obter uma lista de campeonatos, ou algum campeonato específico.
Por exemplo, para obter uma lista de todos os campeonatos brasileiros:
```java
Futpedia fp = new Futpedia();
ResultadoListaCampeonatos brs;
try {
  brs = fp.getBrasileiroUnificado();
} catch (PageNotFoundException ex) {
  //Caso a página do Futpédia não tenha sido encontrada...
} catch (Exception ex) {
  //Outras Expetions, como IOException, etc...
}
```

Para imprimir uma lista dos campeões, do mais recente para o mais antigo:
```java
for(Campeo c : brs.getCampeoes())
  System.out.println(c.getNomePopular());
```

Para obter a lista de times de um campeonato específico:
```java
ResultadoCampeonato rc = new ResultadoCampeonato();
try {
  rc = fp.getDetalhesCampeonato("http://futpedia.globo.com/campeonato/campeonato-brasileiro/2016");
} catch (PageNotFoundException ex) {
  //Caso a página do Futpédia não tenha sido encontrada...
} catch (Exception ex) {
  //Outras Expetions, como IOException, etc...
}
                
System.out.println("Lista de equipes:");
for(String s: rc.getEquipes().keySet())
  System.out.println("Key: " + s + " / " + rc.getEquipe(s).getNomePopular());
```

## Que tipo de dados retorna?
- Todas as edições de cada campeonato;
- Jogos para cada uma das edições, e também os times que participaram dela;
- Informações gerais de um time específico;

Dentre outros dados!

## Dependências
A única lib que você vai precisar para rodar é o **Gson**. Alguns dos dados vem do *Javascript* do HTML, então ele é necessário para fazer o parse da string de objetos que estão presentes no *HTML*.

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
