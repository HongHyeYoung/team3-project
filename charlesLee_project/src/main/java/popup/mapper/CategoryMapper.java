package popup.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CategoryMapper {

	public boolean insertCategory(@Param("storeNum") int storeNum,@Param("category1") String category1) throws Exception;

}