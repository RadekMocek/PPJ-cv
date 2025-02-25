# Cv06

## Profily a defaultní konfigurace logování

1. Vytvořte konfigurační třídu WriterConfiguration v namespace ppj.assignments.configs, která definuje bean implementující rozhraní ppj.assignments.writer.Writer pomocí implementace DevelWriter pro profil devel a ProdWriter pro ostatní profily

2. Nakofigurujte aktivní profil pomocí konfigurační proměnné spring.profiles.active v application.properties. Budeme používat dva profily: devel a prod.

3. Vytvořte profilově závislé properties soubory (application-$(profile).properties) a v nich nadefinujte proměnnou app.desc (pro každý profil bude mít jinou hodnotu). Proč není v profilu debug provedeno zalogování příslušné hlášky?

4. Zkuste i jiné způsoby nastavení aktivního profilu (argumenty při spuštění, systémové proměnné, programově – setAdditionalProfiles)

## Logback – detailní konfigurace

1. Nakonfigurujte Logback pomoci logback-spring.xml

   1. Nastavte logování (appender) do konzole s následujícím enkodérem

       `<encoder> <pattern>%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n</pattern> </encoder>`

   2. Kořenový logger na úroveň DEBUG – sledujte výstup Springu, poté jej nastavte na INFO

   3. Pro namespace Springu nastavte úroveň na WARN

2. Nastavte Logback tak, aby pro profil devel logoval namespace ppj od úrovně DEBUG a pro ostatní profily od úrovně INFO

3. Nakonfigurujte Logback tak, aby zapisoval výstup kořenového loggeru i do souboru log.txt
