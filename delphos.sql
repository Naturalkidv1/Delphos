drop database delphos;

create database delphos;
use delphos;

create table poderes
(
codPoder int unsigned not null,
nombrePoder varchar(60) null,
detallesPoder varchar(240) null,
rangoPoder char(1) null,
constraint pk_poderes primary key (codPoder)
);

create table heroes
(
codHeroe int unsigned not null,
nomHeroe varchar(60) null,
apellHeroe varchar(60) null,
aliasHeroe varchar(60) null,
lugarNacHeroe varchar(60) null,
codPoder int unsigned not null,
organizacion varchar(60) null,
estado boolean default true,
constraint pk_heroes primary key (codHeroe),
constraint fk_poderes_heroes foreign key (codPoder) references poderes (codPoder)
	on delete no action on update cascade
);

create table empresas
(
codEmpresa int unsigned not null,
nombreEmpresa varchar(60) null,
detallesEmpresa varchar(240) null,
constraint pk_empresas primary key (codEmpresa)
);

create table contratoHeroe
(
codHeroe int unsigned not null,
codEmpresa int unsigned not null,
numContratoHeroe int unsigned not null,
constraint fk_heroes_contrato foreign key (codHeroe) references heroes (codHeroe)
	on delete no action on update cascade,
constraint fk_empresas_contrato foreign key (codEmpresa) references empresas (codEmpresa)
	on delete no action on update cascade,
constraint pk_contratoHeroe primary key (codEmpresa, codHeroe, numContratoHeroe)
);

INSERT INTO poderes 
	(codPoder, nombrePoder, detallesPoder, rangoPoder)
VALUES 
	(1, 'Manipulación Elemental - Luz', 'Manipulación a nivel Elemental de las ondas electromagnéticas.', 'A'),
    (2, 'Manipulación Molecular - Agua', 'Manipulación a nivel Molecular de las moléculas de Agua.', 'A'),
    (3, 'Manipulación Elemental - Fuego', 'Manipulación a nivel Elemental del Fuego.', 'A'),
    (4, 'Manipulación divina - Viento Invernal', 'Manipulación otorgada por el dios de los Vientos del Norte, Bóreas.', 'S'),
    (5, 'Manipulación divina - Tierra', 'Manipulación otorgada por la diosa de la Tierra, Gea. ', 'S');
    
INSERT INTO heroes 
	(codHeroe, nomHeroe, apellHeroe, aliasHeroe, lugarNacHeroe, codPoder, organizacion, estado)

VALUES 
	(1, 'Juan José', 'Bazán Espinosa', 'NK', 'España', 1, 'El Consejo' , true),
    (2, 'Pono', 'Wai', 'Aqua', 'EEUU', 2, 'El Consejo' , true),
    (3, 'Kai', 'Nobunaga', 'Ignis', 'Japón', 3, 'El Consejo' , false),
    (4, 'Anem', 'Zetes', 'Ventus', 'Grecia', 4, 'El Consejo' , false),
    (5, 'Guadalupe', 'Rodríguez', 'Terra', 'Colombia', 5, 'El Consejo' , true);
    
INSERT INTO empresas 
	(codEmpresa, nombreEmpresa, detallesEmpresa)

VALUES 
	(1, 'El Consejo', 'El Consejo de Asuntos Mágicos es un Organismo de la Organización de las Naciones Unidas para la que trabajan la mayoría de Héroes de Europa, África, America del Sur y Asia.');

INSERT INTO contratoHeroe 
	(codEmpresa, codHeroe, numContratoHeroe)

VALUES 
	(1, 1, 1),
    (1, 2, 2),
    (1, 3, 3),
    (1, 4, 4),
    (1, 5, 5);


select * from contratoHeroe;
select * from heroes;
select * from poderes;
select * from empresas;
