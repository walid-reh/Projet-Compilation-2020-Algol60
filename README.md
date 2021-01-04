# PROJET DE COMPILATION 2019-2020 : Algol60

Projet de compilation pour le langage Algol60

2ème année à Télécom Nancy.



Organisation du dépôt :
===

PCL 2:
===

Le niveau atteint est : 4.


Nous avons réussi à générer le print (outinteger pour les entiers/booléen et outstring pour les chaînes de caractère), donc les tests peuvent se faire avec les scripts que vous trouverez en dessous.  


Vous trouverez tous les fichiers du test que nous avons préparé pour ce rendu final dans le dépôt "Testfinaux".


Pour lancer notre compilateur nous avons implémenté les scripts shell demandés. Une fois le dépot cloné, il suffit de se placer à la racine du projet pour exécuter les scripts bash. Trois commandes sont disponibles :

./build.sh : cette commande permet de générer le fichier .jar du projet à partir du projet gradle.  

./compile.sh testfinaux/test.al test.src : après avoir généré le .jar, cette commande permet de compiler un code algol60, le code généré sera ensuite mis dans un fichier test.iup, qui sera exécuté après avec le script ./run.sh.  

Exemple:
./compile.sh testfinaux/array.al array.src

./run.sh test.iup : cette commande permet l'exécution du fichier test.iup précédemment généré.



Il faut aussi changer la permission des scripts pour permettre leurs exécutions.

Dans le rapport, vous trouverez les schémas de traduction expliquant la génération de code et la partie corcernant la gestion du projet. C'est le Projet_compilation.pdf


Auteurs
===

JABER HMIZA (IL)

REHIOUI WALID (IAMD)

ILHAM ANOUAR (SIE)

SOUHAIL FAZOUANE (IAMD)


