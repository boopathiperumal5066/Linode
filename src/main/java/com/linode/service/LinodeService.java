package com.linode.service;

import java.util.List;

import com.linode.dto.LinodeDTO;
import com.linode.dto.ResponseDTO;

/**
 * @author boopathi
 *
 */
public interface LinodeService {

	public List<LinodeDTO> listAllConfiuration();

	public ResponseDTO addNewConfiuration(LinodeDTO linodeDTO);
}
