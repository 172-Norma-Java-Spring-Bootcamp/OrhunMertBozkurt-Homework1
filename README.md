# OrhunMertBozkurt-Homework1

# English

# Summary of Project

It is assumed that there is an imaginary database. By using the Maven Plugin, it is clear whether the user can access or not with the register and login options.

# How can you run?

- The program is developed in Intellij IDEA's Ultimate 2021.3.3 version.
- The version 11.0.13 is used as the Java JDK.
- You do not need to have Apache Maven installed on your computer. This program was run on Apache Maven version 3.8.5. After installing it on your computer, the environment
You should do the necessary additions in the variables in the following order:
1. VariableName = M2            VaraibleValue = %M2_HOME%\bin
2. VariableName = M2_HOME       VaraibleValue = C:\Program Files\Apache Software Foundation\apache-maven-3.8.5
3. VariableName = JAVA_HOME     VaraibleValue = C:\Program Files\Java\jdk-11.0.13
4. VariableName = Path          VaraibleValue = %M2_HOME%\bin

- Then it's time to run the program.
```
mvn install
mvn groupId:artifactId:MojoClass_name

```

- These two commands are run in sequence. Instead of groupId, com.example.Plugin, instead of artifactId, maven-plugin-odev1, and instead of MojoClass_name, user should be written specifically for this project.

# Owner of Project

Orhun Mert BOZKURT

# Turkish

# Proje Özeti

Hayali olarak bir database olduğu varsayılmaktadır. Maven Plugin kullanılarak, kayıt ol ve giriş yap seçenekleri ile kullanıcının erişim yapıp yapamacağı belli olur.

# Proje nasıl çalıştırılır?

- Program Intellij IDEA'nın Ultimate 2021.3.3 sürümünde geliştirilmiştir.
- Java JDK'sı olarak 11.0.13 versiyonu kullanılmaktadır.
- Bilgisayarınızda Apache Maven kurulu olması gerekemektedir. Bu program Apache Maven'ın 3.8.5 versiyonunda çalıştırılmıştır. Bilgisayarınızda kurduktan sonra ise ortam 
değişkenlerinde gerekli eklemeli şu sıra ile yapmalısınız:

1. VariableName = M2            VaraibleValue = %M2_HOME%\bin
2. VariableName = M2_HOME       VaraibleValue = C:\Program Files\Apache Software Foundation\apache-maven-3.8.5
3. VariableName = JAVA_HOME     VaraibleValue = C:\Program Files\Java\jdk-11.0.13
4. VariableName = Path          VaraibleValue = %M2_HOME%\bin

- Daha sonra ise sıra programı çalıştırmaya geldi.

```
mvn install
mvn groupId:artifactId:MojoClass_name

```

- Bu iki komut sırası ile çalıştırılır. groupId yerine com.example.Plugin, artifactId yerine ise maven-plugin-odev1, MojoClass_name yerine ise bu proje özelinde user yazılmalıdır.

# Proje Sahibi

Orhun Mert BOZKURT
