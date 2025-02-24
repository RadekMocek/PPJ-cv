# Cv04

__a)__ Neměňte žádné soubory a nakonfigurujte aplikační kontext Springu pomocí XML a bez využití funkce Autowire tak,
aby se metoda Main úspěšně provedla.

__b)__ Modifikujte program tak, aby místo v XML definoval beany pomocí anotace @Component a využíval funkci Autowire
Jako parametr metody getBean používejte namísto názvu příslušnou třídu. Hlavičku XML rozšiřte o namespace:

`xmlns:context="http://www.springframework.org/schema/context"`

a přidejte tag:

`<context:component-scan base-package="app.assignments"></context:component-scan>`

TIP: Pokud v IDE zadáte <compo … nabídne Vám doplnění a přidá namespace do XML automaticky
