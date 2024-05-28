-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           8.4.0 - MySQL Community Server - GPL
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              12.1.0.6537
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- Copiando dados para a tabela eventos.tb_evento_psc_quinta: ~2 rows (aproximadamente)
INSERT IGNORE INTO `tb_evento_psc_quinta` (`cod_evento`, `nome`, `descricao`, `data_inicio`, `data_fim`) VALUES
	(1, 'Evento1', 'Esse é o evento 1', '2024-05-28 17:45:37', '2024-05-28 17:45:37'),
	(2, 'Evento 2', 'Esse é o evento 2', '2024-05-28 17:45:37', '2024-05-28 17:45:37');

-- Copiando dados para a tabela eventos.tb_usuario_psc_quinta: ~2 rows (aproximadamente)
INSERT IGNORE INTO `tb_usuario_psc_quinta` (`cod_usuario`, `login`, `senha`, `tipo`) VALUES
	(1, 'admin', 'admin', 1),
	(2, 'comum', 'comum', 2);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
