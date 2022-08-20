package br.com.fiap.sprint3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.sprint3.model.ItemPedidoVenda;

import br.com.fiap.sprint3.service.ItemPedidoVendaService;


@RestController
public class ItemPedidoVendaController {

	@Autowired
	private ItemPedidoVendaService service;


	@GetMapping("/api/itempedidovenda")
	public ResponseEntity<List<ItemPedidoVenda>> index() {
		return ResponseEntity.status(HttpStatus.OK).body(service.index());
	}

}
