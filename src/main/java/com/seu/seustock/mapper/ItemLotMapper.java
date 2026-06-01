package com.seu.seustock.mapper;

import com.seu.seustock.model.dto.ItemLotDTO;
import com.seu.seustock.model.dto.ItemLotUnitDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Mapper
public interface ItemLotMapper {
    void insertLot(ItemLotDTO lot);

    Optional<ItemLotDTO> findById(Long id);

    Optional<ItemLotDTO> findByItemIdAndLotNumber(@Param("itemId") Long itemId,
                                                  @Param("lotNumber") String lotNumber);

    Optional<ItemLotDTO> findByExternalIdAndUserId(@Param("externalId") UUID externalId,
                                                   @Param("userId") Long userId);

    List<ItemLotUnitDTO> findUnitsByLotExternalId(@Param("externalId") UUID externalId,
                                                  @Param("userId") Long userId);
}
