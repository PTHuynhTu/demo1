package com.citynow.smallerp.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.citynow.smallerp.entity.LeaveForm;
import com.citynow.smallerp.model.LeaveFormModel;
public interface LeaveFormMapper {
    LeaveFormMapper INTANCE = Mappers.getMapper(LeaveFormMapper.class);

    @Mapping(source = "fromDate", target = "fromDate")
    @Mapping(source = "toDate", target = "toDate")
    @Mapping(source = "reason", target = "reason")
    @Mapping(source = "user_id", target = "user_id")
    LeaveForm leaveFormtoLeaveFormModel (LeaveFormModel leaveFormModel);

    @Mapping(source = "fromDate", target = "fromDate")
    @Mapping(source = "toDate", target = "toDate")
    @Mapping(source = "reason", target = "reason")
    @Mapping(source = "user_id", target = "user_id")
    LeaveFormModel leaveFormModeltoLeaveForm (LeaveForm leaveForm);

}
