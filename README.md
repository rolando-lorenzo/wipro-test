# wipro-test
Solucion a problema propuesto (Test) 

/// CREACION BASE DE DATOS MySQL ////

CREATE SCHEMA `notifications` ;

CREATE SCHEMA `accounts` ;

CREATE TABLE `accounts`.`account` (
  `id` INT NOT NULL,
  `incomes` VARCHAR(200) NULL,
  `expenses` VARCHAR(200) NULL,
  `settings` VARCHAR(200) NULL,
  PRIMARY KEY (`id`));

  CREATE TABLE `notifications`.`user_notification` (
  `id` int(11) NOT NULL,
  `first_name` varchar(200) DEFAULT NULL,
  `last_name` varchar(200) DEFAULT NULL,
  `phone` varchar(200) DEFAULT NULL,
  `notification_settigs` varchar(200) DEFAULT NULL,
  `account_id` int(11) NOT NULL,
  PRIMARY KEY (`id`));


INSERT INTO `accounts`.`account` (`id`, `incomes`, `expenses`, `settings`) VALUES ('1', 'venta de lacteos, venta de verduras, venta de cosmeticos', 'gastos en trasporte, gastos en materia prima, sueldo de empleados', 'gasto mayor=100000, ingreso menor=5000, num_maximo de empleados=100');

INSERT INTO `notifications`.`user_notification` (`id`, `firstName`, `lastName`, `phone`, `notificationSettigs`, `accountId`) VALUES ('1', 'Rolando', 'Lorenzo', '565761818', 'notif_hour=19:00, backup_frecuency=2, remid=2', '1');


///// MICROSERVICIOS /////////

Orden de ejecucion:
 1. test.eurekaserver
 2. test.zuulserver
 3. test.accountservice
 4. test.notificationservice


/// Para todas las peticiones apuntar a zuul server (gateway)
puerto: 5555
servicios: 
	-accounts
	-notifications

Ejemplos:

/// SERVICE ACCOUNT ///////
Metodo: GET
URL: http://localhost:5555/api/accounts/1

Metodo: POST
URL:http://localhost:5555/api/accounts/
Body:
{
    "id": 4,
    "incomes": "venta de lacteos3, venta de verduras3, venta de cosmeticos3",
    "expenses": "gastos en trasporte3, gastos en materia prima3, sueldo de empleados3",
    "settings": "gasto mayor=10000, ingreso menor=5000, num_maximo de empleados=1000"
}

Metodo: PUT
URL:http://localhost:5555/api/accounts/
{
    "id": 4,
    "incomes": "venta de lacteos4, venta de verduras4, venta de cosmeticos4",
    "expenses": "gastos en trasporte4, gastos en materia prima4, sueldo de empleados4",
    "settings": "gasto mayor=10004, ingreso menor=5004, num_maximo de empleados=1004"
}

/// SERVICE NOTIFICATION ///////
Metodo: GET
URL: http://localhost:5555/api/notifications/settings/1


Metodo: POST
URL: http://localhost:5555/api/notifications/settings/
Body:
{
    "userNotification": {
        "id": 4,
        "firstName": "Rolando3",
        "lastName": "Lorenzo3",
        "phone": "5657618183",
        "notificationSettigs": "notif_hour=19:03, backup_frecuency=23, remid=23",
        "accountId": 4
    },
    "account": {
        "id": 4,
        "incomes": "venta de lacteos3, venta de verduras3, venta de cosmeticos3",
        "expenses": "gastos en trasporte3, gastos en materia prima3, sueldo de empleados3",
        "settings": "gasto mayor=100003, ingreso menor=5003, num_maximo de empleados=103"
    }
}


