# selenide-deadlock
Reproducible example of deadlock in Selenide

The problem is described in https://github.com/selenide/selenide/issues/2372

### How to reproduce:
Run in command line
> mvn test

### Known workaround:
Un-comment line #13 in class `org.selenide.deadlock.TestSetupExtension`.
