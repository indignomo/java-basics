```markdown
# Exercício Java: Calculadora de Área de Círculo

Exercício prático de Java que demonstra conceitos básicos como sintaxe, variáveis, operadores, tipos de dados e I/O (entrada e saída).  
**Parte do repositório de exercícios básicos de Java** - novos exemplos serão adicionados progressivamente.

---

## 🔍 Visão Geral

Este programa calcula a área de um círculo com base no raio fornecido pelo usuário.  
Objetivos principais:
- Demonstrar interação básica com o usuário (input/output)
- Praticar o uso de variáveis e operadores matemáticos
- Ilustrar a organização simples de classes em Java

---

## 📁 Estrutura do Código

### 1. Classe Principal (`App.java`)
```java
public class App {
    public static void main(String[] args) throws Exception {
        CalculadoraAreaCirculo calculadora = new CalculadoraAreaCirculo();
        calculadora.calcularArea();
    }
}
```
- Ponto de entrada do programa
- Cria uma instância da calculadora e executa o cálculo

### 2. Classe da Calculadora (`CalculadoraAreaCirculo.java`)
```java
import java.util.Scanner;

public class CalculadoraAreaCirculo {
    float pi = 3.14f;
    double raio;
    Scanner input = new Scanner(System.in);

    public void calcularArea(){
        System.out.println("Insira o raio da circunferência: ");
        this.raio = input.nextInt();
        double area = pi * (raio * raio);
        System.out.println("A área da circunferência é de: " + area);
    }
}
```
- Utiliza `Scanner` para receber input do usuário
- Calcula a área usando a fórmula `π * r²`
- Exibe o resultado formatado

---

## 🛠️ Como Executar

1. **Pré-requisitos**:
   - JDK 8 ou superior instalado
   - Terminal/Command Prompt

2. **Passos**:
```bash
# Compilar o código
javac App.java

# Executar o programa
java App
```

3. **Fluxo do Programa**:
```
Insira o raio da circunferência: 5
A área da circunferência é de: 78.5
```

---

## 📌 Conceitos Aplicados

- **Variáveis**: 
  - `float pi` (constante)
  - `double raio` (valor dinâmico)
  
- **Operadores**:
  - Multiplicação (`*`)
  - Atribuição (`=`)

- **Tipos de Dados**:
  - `float` para precisão simples
  - `double` para precisão dupla

- **I/O Básico**:
  - `Scanner` para leitura de entrada
  - `System.out.println` para exibição de resultados

---

## 📂 Sobre o Repositório

- **Organização**:
  - Cada exercício em diretório separado
  - Progressão gradual de complexidade
  - Foco em fundamentos da linguagem

- **Próximos Tópicos**:
  - Controle de fluxo (if/else, loops)
  - Métodos estáticos
  - Manipulação de strings

---

## 🤝 Como Contribuir

1. Faça um fork do repositório
2. Adicione novos exercícios em pastas separadas
3. Mantenha a estrutura atual de documentação
4. Envie um Pull Request com descrição clara

---

Desenvolvido com ☕ por Vinicius Moura. Bons estudos!
``` 

