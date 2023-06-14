# MyMusics

O projeto MyMusics é um sistema de gerenciamento de áudios que permite a manipulação e classificação de músicas e podcasts.

## Estrutura do Projeto

O projeto está organizado em pacotes para facilitar a separação das classes:

### Pacote `br.com.alura.mymusics.models`

Este pacote contém as classes que representam os modelos de áudios.

- `Audio`: Classe base que representa um áudio genérico com título, total de reproduções, total de curtidas e classificação.
- `Musica`: Classe que herda de `Audio` e representa uma música com atributos adicionais como álbum, artista e gênero.
- `Podcast`: Classe que herda de `Audio` e representa um podcast com atributos adicionais como host e descrição.

### Pacote `br.com.alura.mymusics.principal`

Este pacote contém a classe principal `Main` que demonstra o uso dos modelos de áudios.

## Utilização

No método `main` da classe `Main`, são criadas instâncias de `Musica` e `Podcast` e realizadas operações como reprodução e curtidas.

Os áudios são então incluídos nas "Minhas Preferidas" através da classe `MinhasPreferidas`.

## Executando o Projeto

Para executar o projeto, basta compilar e rodar a classe `Main`.

```bash
javac br/com/alura/mymusics/principal/Main.java
java br.com.alura.mymusics.principal.Main
```

## Contribuição
Sinta-se à vontade para contribuir com melhorias no projeto. Basta fazer um fork deste repositório, fazer as modificações desejadas e enviar um pull request.

Esse é um projeto de exemplo criado com fins didáticos.
