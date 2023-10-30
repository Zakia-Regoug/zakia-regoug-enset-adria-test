# zakia-regoug-enset-adria-test


Probl�me�:
	On souhaite d�velopper un POC (Proof Of Concept) sous forme d�une application web bas�e sur une architecture micro-service an utilisant l��cosyst�me Spring Boot et Spring Cloud cot� backend et un Framework comme Angular ou React cot� Frontend.
	L�application doit permettre de g�rer des porte feuilles (Wallets) de devises ainsi que les transferts entre les
portes feuilles. Pour faire plus simple, cette application se composera de deux micro-services fonctionnels :
� Un Micro-service qui permet de g�rer des � Wallet �. Chaque Wallet appartient � un client. Un client est d�fini par son id (num�rique auto incr�ment�), son nom et son email. Une Wallet est d�finie par son id (String de type UUID), son solde, sa date de cr�ation, sa devise.
� Un Micro-service qui permet de g�rer des transferts entre les Wallets. Chaque transfert est d�fini par son id, sa date, Wallet source, Wallet destination, son montant, son �tat (PENDIND, VALIDATED,REJECTED)

Les micro-services technique � mettre en place sont :
� Le service Gateway bas� sur Spring cloud Gateway
� Le service Discovery base sur Eureka Server ou Consul Discovery (au choix)
� Le service de configuration bas� sur Spring cloud config ou Consul Config (au choix)

Diagramme de classe�:



Architecture Technique�:
Creation des microservices�:
1- Wallet service 

2- Transfert service 

3- Config service�:

4- Gateway service 



D�marrer consul�:





Configuration�:
Cr�ation de dossier externe config-repo et l�int�grer dans le service config



Le service config est bien demmarer dans le port 8888�:



Wallet service�:





Gateway Service�:



La gateway est bien demmarer dans le port 9999 

