-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 26-Jan-2021 às 22:24
-- Versão do servidor: 10.4.17-MariaDB
-- versão do PHP: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `trabalho`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tabela_cadastro`
--

CREATE TABLE `tabela_cadastro` (
  `id` int(20) NOT NULL,
  `nome` varchar(50) COLLATE utf8_bin NOT NULL,
  `cpf` varchar(30) COLLATE utf8_bin NOT NULL,
  `ra` varchar(30) COLLATE utf8_bin NOT NULL,
  `data` varchar(20) COLLATE utf8_bin NOT NULL,
  `telefone` varchar(30) COLLATE utf8_bin NOT NULL,
  `cidade` varchar(50) COLLATE utf8_bin NOT NULL,
  `endereco` varchar(50) COLLATE utf8_bin NOT NULL,
  `senha` varchar(30) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Extraindo dados da tabela `tabela_cadastro`
--

INSERT INTO `tabela_cadastro` (`id`, `nome`, `cpf`, `ra`, `data`, `telefone`, `cidade`, `endereco`, `senha`) VALUES
(1, 'saxaxax', '454.545.554-54', '45454545', '12/12/1222', '(12)12112-1212', 'addadad', 'dadadad', '[C@395b1207');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `tabela_cadastro`
--
ALTER TABLE `tabela_cadastro`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `tabela_cadastro`
--
ALTER TABLE `tabela_cadastro`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
