package br.com.fiap.sprint3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.sprint3.model.ItemPedidoVenda;
import br.com.fiap.sprint3.model.PedidoVenda;
import br.com.fiap.sprint3.model.Usuario;
import br.com.fiap.sprint3.service.PedidoVendaService;
import br.com.fiap.sprint3.service.UsuarioService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class PedidoVendaController {
  
  @Autowired
  private PedidoVendaService service;

  @Autowired
  private UsuarioService serviceUsuario;

  @GetMapping("/api/pedidovenda/{IdPedidoVenda}")
  public ResponseEntity<PedidoVenda> findById(@PathVariable Long IdPedidoVenda ) {
      return ResponseEntity.status(HttpStatus.OK).body(service.findById(IdPedidoVenda));
  }
  
  @PostMapping("/api/pedidovenda/{idUsuario}")
	public ResponseEntity<PedidoVenda> compra(@PathVariable Long idUsuario, @RequestBody List<ItemPedidoVenda> itemPedidoVenda) {
  
		Usuario usuario = serviceUsuario.findById(idUsuario);
    PedidoVenda pedidoVenda = service.compra(usuario, itemPedidoVenda);

		return ResponseEntity.status(HttpStatus.OK).body(pedidoVenda);
	}
 
}
