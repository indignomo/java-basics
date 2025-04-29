
# Exercício Java: Sintaxe Básica e Tipos de Dados

Exercício prático de Java que demonstra conceitos básicos como sintaxe, variáveis, operadores, tipos de dados e I/O.  
**Parte do repositório de exercícios básicos de Java** - novos exemplos serão adicionados progressivamente.

---

## 🔍 Visão Geral Atualizada

Este projeto agora inclui múltiplas funcionalidades:
1. Sistema de cumprimentos personalizado
2. Calculadora de área de círculo
3. Estrutura para calculadora básica (em desenvolvimento)

Objetivos principais:
- Praticar interação com usuário via terminal
- Demonstrar uso de diferentes tipos de dados
- Implementar múltiplas classes com responsabilidades específicas

---

## 📁 Nova Estrutura do Código

### 1. Classe Principal (`App.java`)
```java
public class App {
    public static void main(String[] args) throws Exception {
        CalculadoraAreaCirculo calculadora = new CalculadoraAreaCirculo();
        Cumprimentar bemVindo = new Cumprimentar();
        
        bemVindo.cumprimentarVoce();
        calculadora.calcularArea();
    }
}
```
- Coordena o fluxo do programa
- Instancia e utiliza múltiplas classes

### 2. Classe de Cumprimentos (`Cumprimentar.java`)
```java
import java.util.Scanner;

public class Cumprimentar {
    Scanner input = new Scanner(System.in);
    
    public void cumprimentarVoce() {
        System.out.println("Olá! Qual é seu nome?");
        String nome = input.nextLine();
        System.out.println("Bem-vindo, "+ nome + "! É um prazer conhecê-lo.");
    }
}
```
- Coleta entrada do tipo String
- Demonstra concatenação de strings
- Usa nextLine() para leitura completa

### 3. Classe de Cálculo de Área (`CalculadoraAreaCirculo.java`)
```java
import java.util.Scanner;

public class CalculadoraAreaCirculo {
    float pi = 3.14f;
    double raio;
    Scanner input = new Scanner(System.in);

    public void calcularArea() {
        System.out.println("Insira o raio da circunferência: ");
        this.raio = input.nextInt();
        double area = pi * (raio * raio);
        System.out.println("A área da circunferência é de: " + area);
    }
}
```
- Mantém sua funcionalidade original
- Demonstra conversão implícita de tipos

### 4. Classe da Calculadora Básica (`CalculadoraBasica.java`)
// Disponível através do caminho abaixo:
[Ver README Calculadora Básica](BasicCalculator/README.md)

---

## 🛠️ Como Executar (Atualizado)

3. **Novo Fluxo do Programa**:
```
Olá! Qual é seu nome?
Vinicius
Bem-vindo, Vinicius! É um prazer conhecê-lo.
Insira o raio da circunferência: 5
A área da circunferência é de: 78.5
```

---

## 📌 Conceitos Aplicados (Expandido)

- **Novos Elementos Adicionados**:
  - Uso do `nextLine()` para strings completas
  - Concatenação de strings com `+`
  - Tipo `String` para manipulação de texto
  - Coordenação entre múltiplas classes
  - Separação de responsabilidades

- **Em Preparação** (CalculadoraBasica):
  - Estrutura básica de classes
  - Planejamento de funcionalidades
  - Documentação de código futuro

---

## 🔮 Próximas Atualizações

- Implementação completa da CalculadoraBasica:
  - Operações aritméticas básicas
  - Controle de fluxo para seleção de operações
  - Validação de entradas numéricas
- Aprimoramento da interação com usuário:
  - Menus interativos
  - Loops para repetição de operações

---

Desenvolvido com ☕ por Vinicius Moura. Bons estudos!
```
