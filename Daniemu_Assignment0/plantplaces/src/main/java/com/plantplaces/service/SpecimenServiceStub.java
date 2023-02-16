package com.plantplaces.service;

import org.springframework.stereotype.Component;

import com.plantplaces.dto.SpecimenDTO;

@Component
public class SpecimenServiceStub implements ISpecimenService {

	/* (non-Javadoc)
	 * @see com.plantplaces.service.ISpecimenService#fetchById(int)
	 */
	public SpecimenDTO fetchById(int id) {
		SpecimenDTO specimenDTO = new SpecimenDTO();
		specimenDTO.setSpecimenID(43);
		specimenDTO.setLatitude("39.74");
		specimenDTO.setLongitude("-84.51");
		specimenDTO.setDescription("A beautiful Eastern Redbud");
		return specimenDTO;
	}
	
	/* (non-Javadoc)
	 * @see com.plantplaces.service.ISpecimenService#save(com.plantplaces.dto.SpecimenDTO)
	 */
	public void save(SpecimenDTO specimenDTO) {
		
	}
}
