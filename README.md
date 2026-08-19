# ⭐ Star Patterns — Java Challenges

A collection of **Java star-pattern programming challenges** designed to practice loops, nested loops, pattern logic, and problem-solving.

Each challenge includes the **Java source code** along with reference images showing the expected star pattern output.

---

## 📂 Repository Structure

```text
stars-patterns/
│
├── Stars-Patterns1/
│   ├── Stars_pattern_image_Challeng.java
│   ├── challeng_01_a.png
│   ├── challeng_01_b.png
│   └── challeng_01_c.png
│
├── Stars-Patterns2/
│   ├── Stars_pattern_image_Challeng_2.java
│   └── challeng_02_a.png
│
├── Stars-Patterns3/
│   ├── Stars_pattern_image_Challeng_04.java
│   ├── challeng_04_a.png
│   ├── challeng_04_b.png
│   └── challeng_04_c.png
│
└── Stars-Patterns4/
    ├── Stars_pattern_image_Challeng_3.java
    ├── challeng_03_a.jpg
    ├── challeng_03_b.png
    └── challeng_03_c.png
```

---

## 🎯 What You'll Practice

Through these challenges, you'll practice:

* `for` loops
* Nested `for` loops
* Rows and columns
* Spaces and alignment
* Increasing and decreasing patterns
* Pattern recognition
* Console output formatting
* Translating visual patterns into algorithms
* Java problem-solving fundamentals

---

## 🧩 Challenges

### ⭐ Stars Patterns 1

Contains the first set of star-pattern challenges with multiple reference patterns.

**Focus:**
Basic nested loops, spacing, and structured console output.

---

### ⭐ Stars Patterns 2

Contains the second star-pattern challenge.

**Focus:**
Understanding how row and column relationships affect the generated pattern.

---

### ⭐ Stars Patterns 3

Contains the fourth challenge and its reference images.

**Focus:**
More complex pattern structures and nested-loop logic.

---

### ⭐ Stars Patterns 4

Contains the third challenge with its reference images.

**Focus:**
Combining spaces and stars to reproduce a specific visual pattern.

---

## 💻 Example

A simple Java star pattern can be generated using nested loops:

```java
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

Output:

```text
*
* *
* * *
* * * *
* * * * *
```

The same fundamental idea can be extended to create increasingly complex patterns.

---

## 🚀 How to Run

### 1. Clone the repository

```bash
git clone https://github.com/Suleman-Khokhar/stars-patterns.git
```

### 2. Open the project

Open the repository in your preferred IDE, such as:

* IntelliJ IDEA
* Eclipse
* VS Code
* NetBeans

### 3. Navigate to a challenge

For example:

```text
Stars-Patterns1/
```

### 4. Compile the Java file

```bash
javac Stars_pattern_image_Challeng.java
```

### 5. Run it

```bash
java Stars_pattern_image_Challeng
```

> The exact filename and execution command may vary depending on the challenge.

---

## 🧠 Learning Approach

The goal of this repository is not just to memorize pattern programs.

For every challenge:

1. Look at the reference image.
2. Identify the number of rows.
3. Determine how many spaces are required.
4. Determine how the number of stars changes per row.
5. Convert the pattern into nested loops.
6. Test the output.
7. Compare it with the reference image.
8. Improve the logic if necessary.

This approach helps build a strong foundation in **loops and algorithmic thinking**.

---

## 🛠️ Technologies

| Technology         | Purpose                |
| ------------------ | ---------------------- |
| ☕ Java             | Pattern implementation |
| 🔄 Loops           | Pattern generation     |
| 🧠 Problem Solving | Algorithm development  |
| 🖥️ Console        | Program output         |
| 🐙 Git & GitHub    | Version control        |

---

## 📈 Future Improvements

Possible additions to this repository:

* [ ] Add more star-pattern challenges
* [ ] Add number-pattern challenges
* [ ] Add character-pattern challenges
* [ ] Add hollow patterns
* [ ] Add pyramid and diamond patterns
* [ ] Add pattern explanations
* [ ] Add difficulty levels
* [ ] Improve Java class naming
* [ ] Add sample console outputs

---

## 👨‍💻 Author

**Suleman Khokhar**

Computer Science Student
FCCU Lahore, Pakistan

GitHub: **[@Suleman-Khokhar](https://github.com/Suleman-Khokhar)**

---

## ⭐ If You Find This Useful

If you're learning Java loops and pattern programming, feel free to explore the challenges, experiment with the code, and create your own patterns.

**Keep coding. Keep experimenting. 🚀**
