package com.linode.impl;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linode.constant.AppConstants;
import com.linode.dto.LinodeDTO;
import com.linode.dto.ResponseDTO;
import com.linode.model.LinodeModel;
import com.linode.repository.LinodeRepository;
import com.linode.service.LinodeService;

@Service
public class LinodeServiceImpl implements LinodeService {

	@Autowired
	private LinodeRepository linodeRepository;

	private DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();

	@Override
	public ResponseDTO addNewConfiuration(LinodeDTO linodeDTO) {
		ResponseDTO responseDTO = new ResponseDTO();
		try {
			LinodeModel projectModel = dozerBeanMapper.map(linodeDTO, LinodeModel.class);
			linodeRepository.save(projectModel);
			responseDTO.setResponseCode(AppConstants.GENERIC_SUCCESS_RESPONSE_CODE);
			responseDTO.setResponseDescription(AppConstants.GENERIC_SUCCESS_RESPONSE_DESCRIPTION);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			responseDTO.setResponseCode(AppConstants.GENERIC_FAILURE_RESPONSE_CODE);
			responseDTO.setResponseDescription(AppConstants.GENERIC_FAILURE_RESPONSE_DESCRIPTION);
		}
		return responseDTO;
	}

	@Override
	public List<LinodeDTO> listAllConfiuration() {
		LinodeDTO linodeDTO = null;
		List<LinodeDTO> linodeDTOs = new ArrayList<LinodeDTO>();
		List<LinodeModel> linodeModels = linodeRepository.findAll();
		if (linodeModels != null) {
			linodeDTO = new LinodeDTO();
			for (LinodeModel model : linodeModels) {
				linodeDTO = dozerBeanMapper.map(model, LinodeDTO.class);
				linodeDTOs.add(linodeDTO);
			}
		}
		return linodeDTOs;
	}

}
