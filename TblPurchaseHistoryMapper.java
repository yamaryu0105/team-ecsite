package jp.co.internous.sunflower.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import jp.co.internous.sunflower.model.domain.dto.PurchaseHistoryDto;

@Mapper
public interface TblPurchaseHistoryMapper {
	long insert(@Param("destinationId") long destinationId, @Param("userId") long userId);
	List<PurchaseHistoryDto> findHistory(long userId);
	
	@Update("UPDATE tbl_purchase_history SET status = 0, updated_at = now() WHERE user_id = #{userId}")
	long logicalDeleteHistory(long userId);

	
}

