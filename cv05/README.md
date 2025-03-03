# Cv05

Modifikujte projekt z minulého cvičení tak, že zcela odstraňte XML konfiguraci a nahraďte ji jednou konfigurační třídou. Konfigurační třída přitom může být přímo třída Main. Context vytvořte ze třídy Main pomocí:

`ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);`

__a)__ Odstraňte všechny anotace @Component a nahraďte je definicemi beanů pomocí anotace @Bean v dalších nově přidaných konfiguračních třídách. Dependency Injection ve třídě replyMessage proveďte pomocí anotace @Autowired nad příslušným atributem.

__b)__ Vyzkoušejte dále anotaci @PostConstruct a zkuste také vybrané Beany definovat s různým rozsahem platnosti (Scope).

__c)__ JUnit
