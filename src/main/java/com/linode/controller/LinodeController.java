package com.linode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.linode.dto.LinodeDTO;
import com.linode.dto.ResponseDTO;
import com.linode.service.LinodeService;

@RestController
@RequestMapping(value = "/api")
public class LinodeController {

	@Autowired
	private LinodeService linodeService;

	@RequestMapping(value = "/addNewConfiguration", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseDTO addNewConfiguration(@RequestBody LinodeDTO linodeDTO) {
		return linodeService.addNewConfiuration(linodeDTO);
	}

	@RequestMapping(value = "/listAllConfiuration", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public List<LinodeDTO> listAllConfiuration() {
		return linodeService.listAllConfiuration();
	}
}
