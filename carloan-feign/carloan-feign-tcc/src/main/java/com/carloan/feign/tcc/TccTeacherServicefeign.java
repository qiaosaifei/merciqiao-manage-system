package com.carloan.feign.tcc;

import com.carloan.apimodel.common.ResponseResult;
import com.carloan.apimodel.tcc.TccTeacher;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 /*
                           _ooOoo_
                          o8888888o
                          88" . "88
                          (| -_- |)
                          O\  =  /O
                       ____/`---'\____
                     .'  \\|     |//  `.
                    /  \\|||  :  |||//  \
                   /  _||||| -:- |||||-  \
                   |   | \\\  -  /// |   |
                   | \_|  ''\---/''  |   |
                   \  .-\__  `-`  ___/-. /
                 ___`. .'  /--.--\  `. . __
              ."" '<  `.___\_<|>_/___.'  >'"".
             | | :  `- \`.;`\ _ /`;.`/ - ` : | |
             \  \ `-.   \_ __\ /__ _/   .-` /  /
        ======`-.____`-.___\_____/___.-`____.-'======
                           `=---='
        ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
                 佛祖保佑       永无BUG
 */
/**
 * @classname: TccTeacherServicefeign
 * @description: 定义  tcc_teacher,微服务调用层
 * 使用Spring Cloud搭建各种微服务之后，服务可以通过@FeignClient使用和发现服务场中的其他服务
 * @author:  zhouzhiwei
 */
@FeignClient(value = "tcc-service-provider01",path = "/api/tccTeacher")
public interface TccTeacherServicefeign {

	/**
	 * 取得单个业务对象
	 * @return
	 */
	@RequestMapping(value = "/get/v1/{ID}", method = RequestMethod.POST)
	public ResponseResult<Object> queryTccTeacherByPrimaryKey(@PathVariable("ID") String ID);

	/**
	 * 取得List业务对象
	 * @return
	 */
	@RequestMapping(value = "/getTccTeacherList", method = RequestMethod.POST)
	public ResponseResult<Object> queryTccTeacherList(@RequestBody TccTeacher obj);



	/**
	 * 根据对象查询信息返回单个实体
	 * @return
	 */
	@RequestMapping(value = "/queryLike", method = RequestMethod.POST)
	public ResponseResult<Object> queryLikeTccTeacher(@RequestBody TccTeacher obj);


	/**
	 * 创建业务对象
	 * @return
	 */
	@RequestMapping(value="/create/v1",method=RequestMethod.POST)
	public ResponseResult insertTccTeacher(@RequestBody TccTeacher obj);

	/**
	 * 修改业务对象
	 * @return
	 */
	@RequestMapping(value="/update/v1",method=RequestMethod.POST)
	public ResponseResult updateTccTeacher(@RequestBody TccTeacher obj);







}