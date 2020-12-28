-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 26-Maio-2020 às 02:20
-- Versão do servidor: 10.4.10-MariaDB
-- versão do PHP: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `dboficina`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE IF NOT EXISTS `cliente` (
  `idCliente` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome` varchar(60) DEFAULT NULL,
  `cpf` varchar(45) DEFAULT NULL,
  `data_nascimento` date DEFAULT NULL,
  `sexo` char(1) DEFAULT NULL,
  `endereco` varchar(100) DEFAULT NULL,
  `telefone` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`idCliente`, `nome`, `cpf`, `data_nascimento`, `sexo`, `endereco`, `telefone`) VALUES
(1, 'Matheus Barros', '123.456.789-13', '1997-06-06', 'M', 'Rua Eduardo Prado, SG, RJ, Lote:22', '(21) 96515-4996'),
(2, 'Daniel Antunes', '987.456.321-46', '1998-06-21', 'M', 'Rua Raimundo RJ', '(21) 96548-9716'),
(3, 'Larissa Fernandes', '213.486.548-75', '1997-07-06', 'F', 'Rua Amado Batista, Copacabana', '(22) 98745-8425'),
(4, 'Marcello Porto', '415.254.125-41', '1970-11-06', 'M', 'Rua Icaraí ', '(21) 95268-5252'),
(6, 'Rosa Maria', '021.859.548-58', '1970-06-16', 'F', 'Rua Caxambi', '(21) 65869-4142');

-- --------------------------------------------------------

--
-- Estrutura da tabela `mecanico`
--

DROP TABLE IF EXISTS `mecanico`;
CREATE TABLE IF NOT EXISTS `mecanico` (
  `idMecanico` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome` varchar(60) DEFAULT NULL,
  `cpf` varchar(45) DEFAULT NULL,
  `salario` varchar(45) DEFAULT NULL,
  `data_nascimento` date DEFAULT NULL,
  `sexo` char(1) DEFAULT NULL,
  `endereco` varchar(100) DEFAULT NULL,
  `telefone` varchar(20) DEFAULT NULL,
  `setor` varchar(30) DEFAULT NULL,
  `especialidade1` varchar(10) DEFAULT NULL,
  `especialidade2` varchar(10) DEFAULT NULL,
  `especialidade3` varchar(10) DEFAULT NULL,
  `especialidade4` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`idMecanico`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `mecanico`
--

INSERT INTO `mecanico` (`idMecanico`, `nome`, `cpf`, `salario`, `data_nascimento`, `sexo`, `endereco`, `telefone`, `setor`, `especialidade1`, `especialidade2`, `especialidade3`, `especialidade4`) VALUES
(1, 'Tiago Thiengo', '(21) 95875-9316', 'R$1.600,00', '1985-06-06', 'M', 'Rua Morango Niteroi', '(21) 95875-9316', 'Mecânica', 'BMW', NULL, 'Chevrolet', NULL),
(2, 'Victor Borges', '(21) 68255-4155', 'R$2.000,00', '1993-07-06', 'M', 'Rua Chaves, Méir', '(21) 68255-4155', 'Elétrica', NULL, 'Fiat', NULL, 'Volkswagen'),
(3, 'Edmundo Lopes', '(21) 65198-5620', 'R$4.000,00', '1965-06-06', 'M', 'Rua Eduardo Robert ', '(21) 65198-5620', 'Pintura', 'BMW', 'Fiat', 'Chevrolet', 'Volkswagen'),
(4, 'Roberto', '(21) 15845-8412', 'R$1.120,00', '1985-05-03', 'M', 'Rua America', '(21) 15845-8412', 'Lanternagem', 'BMW', 'Fiat', NULL, NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `pecas`
--

DROP TABLE IF EXISTS `pecas`;
CREATE TABLE IF NOT EXISTS `pecas` (
  `idPecas` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome` varchar(60) DEFAULT NULL,
  `codigo` varchar(45) DEFAULT NULL,
  `preco` varchar(45) DEFAULT NULL,
  `setor` varchar(30) DEFAULT NULL,
  `foto` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idPecas`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `pecas`
--

INSERT INTO `pecas` (`idPecas`, `nome`, `codigo`, `preco`, `setor`, `foto`) VALUES
(1, 'Paralama Gol G5', 'ID-1', 'R$250,00', 'Lanternagem', NULL),
(2, 'Banco Motorista Palio 2016', 'ID-2', 'R$350,00', 'Lanternagem', NULL),
(3, 'Chicote Civic 2019', 'ID-25', 'R$1.600,00', 'Elétrica', NULL),
(4, 'Tinta Vermelho Alpine ', 'ID-65', 'R$50,00', 'Pintura', NULL),
(7, 'Correia Ar Condicionado Palio 2016', 'ID-9.856', 'R$240,00', 'Mecânica', NULL),
(6, 'Tinta Preto NInja', 'ID-896', 'R$35,00', 'Pintura', NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `servico`
--

DROP TABLE IF EXISTS `servico`;
CREATE TABLE IF NOT EXISTS `servico` (
  `idServico` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `cliente` varchar(60) DEFAULT NULL,
  `mecanico` varchar(45) DEFAULT NULL,
  `situacao` varchar(100) DEFAULT NULL,
  `automovel` varchar(400) DEFAULT NULL,
  `pecas` varchar(400) DEFAULT NULL,
  `data_entrega` date DEFAULT NULL,
  `servico` varchar(400) DEFAULT NULL,
  PRIMARY KEY (`idServico`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `servico`
--

INSERT INTO `servico` (`idServico`, `cliente`, `mecanico`, `situacao`, `automovel`, `pecas`, `data_entrega`, `servico`) VALUES
(2, 'Rosa Maria', 'Edmundo Lopes', 'Pago', 'Audi A3 2020', 'Tinta Vermelho Alpine | R$50,00\nTinta Preto NInja | R$35,00\n', '2020-06-06', 'Revisão e retoque na pintura.');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
