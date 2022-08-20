-- insert into T_CALI_PRODUTO (nr_sku, nm_produto, vl_preco_unitario, qt_produto_estoque, ds_produto, nm_marca) VALUES (10, 'Tunica Bege', 150.99, 20,'Tunica Bege linda', 'marca');
-- insert into T_CALI_ITEM_PEDIDO_VENDA (qt_pedida, vl_desconto_item_venda, vl_total_item_venda ) VALUES (n_venda, vl_total_item_vendal, 10, 50.00, 100.00, 1000.00);

insert INTO T_CALI_USUARIO (nm_usuario, nm_sobrenome_usuario, ds_email, nm_senha, nr_cpf, nm_genero) VALUES ('Jonathan', 'Felix', 'example@gmail.com', 'dev12', 5000, 'MASCULINO')
INSERT INTO T_CALI_EMPRESA (nr_cnpj, nm_razao_social, nm_fantasia) VALUES (1234, 'fiap', 'caliope');
INSERT INTO T_CALI_PRODUTO (id_empresa, nr_sku, nm_produto, vl_preco_unitario, qt_produto_estoque, ds_produto, nm_marca) VALUES (1, 10, 'Tunica Bege', 150.99, 20,'Tunica Bege linda', 'marca');
INSERT INTO T_CALI_PRODUTO (id_empresa, nr_sku, nm_produto, vl_preco_unitario, qt_produto_estoque, ds_produto, nm_marca) VALUES (1, 20, 'Tunica Preta', 200, 30,'Tunica Preta linda', 'marca');
