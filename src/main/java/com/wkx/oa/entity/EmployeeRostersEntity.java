package com.wkx.oa.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 员工花名册表
 * 
 * @author chaiduolai
 * @email cduolai@163.com
 * @date 2021-02-24 14:38:55
 */
@Data
@TableName("oa_employee_rosters")
public class EmployeeRostersEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String ids;
	/**
	 * 创建人
	 */
	private String createby;
	/**
	 * 创建时间
	 */
	private Date createdate;
	/**
	 * 创建人
	 */
	private String updateby;
	/**
	 * 创建时间
	 */
	private Date updatedate;
	/**
	 * 
	 */
	private String remarks;
	/**
	 * 状态1-正常2-取消
	 */
	private Integer state;
	/**
	 * 员工编号
	 */
	private String employeeNumber;
	/**
	 * 员工姓名
	 */
	private String employeeName;
	/**
	 * 员工身份证号
	 */
	private String employeeIdcards;
	/**
	 * 手机号
	 */
	private String employeePhone;
	/**
	 * 邮箱
	 */
	private String employeeEmail;
	/**
	 * 入职公司
	 */
	private String entryCompany;
	/**
	 * 入职公司ids
	 */
	private String entryCompanyIds;
	/**
	 * 入职岗位
	 */
	private String entryPosition;
	/**
	 * 入职岗位ids
	 */
	private String entryPositionIds;
	/**
	 * 试用期1开始时间
	 */
	private Date trialDateStartFirst;
	/**
	 * 试用期1结束时间
	 */
	private Date trialDateEndFirst;
	/**
	 * 试用期1薪资
	 */
	private BigDecimal trialSalaryFirst;
	/**
	 * 试用期2开始时间
	 */
	private Date trialDateStartSecond;
	/**
	 * 试用期2结束时间
	 */
	private Date trialDateEndSecond;
	/**
	 * 试用期2薪资
	 */
	private BigDecimal trialSalarySecond;
	/**
	 * 转正开始时间
	 */
	private Date trialDateStartOver;
	/**
	 * 转正结束时间
	 */
	private Date trialDateEndOver;
	/**
	 * 转正薪资
	 */
	private BigDecimal trialSalaryOver;
	/**
	 * 入职时间
	 */
	private Date trialDate;
	/**
	 * 劳动合同开始时间
	 */
	private Date laborContractDateStart;
	/**
	 * 劳动合同结束时间
	 */
	private Date laborContractDateEnd;
	/**
	 * 工资发放日
	 */
	private Integer payDay;
	/**
	 * 社保缴纳地
	 */
	private String sbJnd;
	/**
	 * 福利
	 */
	private String welfare;
	/**
	 * 是否实习1-否2-是
	 */
	private Integer isInternship;
	/**
	 * 是否内部员工1-否2-是
	 */
	private Integer isInterEmployee;
	/**
	 * 民族
	 */
	private String nation;
	/**
	 * 婚姻状态1-未婚2-已婚
	 */
	private Integer isMarital;
	/**
	 * 生肖
	 */
	private String zodiac;
	/**
	 * 星座
	 */
	private String constellation;
	/**
	 * 政治面貌
	 */
	private String politicalOutlook;
	/**
	 * 是否在北京缴纳过社保1-否2-是
	 */
	private Integer isPaymentSbBj;
	/**
	 * 学历
	 */
	private String education;
	/**
	 * 毕业院校
	 */
	private String graduationSchool;
	/**
	 * 专业
	 */
	private String major;
	/**
	 * 户籍所在地
	 */
	private String registeredResidence;
	/**
	 * 户口性质1-城镇2-农村
	 */
	private Integer registeredResidenceType;
	/**
	 * 现居地
	 */
	private String currentResidence;
	/**
	 * 教育及培训经历
	 */
	private String eduExperience;
	/**
	 * 工作经历
	 */
	private String workExperience;
	/**
	 * 家庭成员
	 */
	private String familyMember;
	/**
	 * 紧急联系人姓名
	 */
	private String emergencyContactName;
	/**
	 * 紧急联系人电话
	 */
	private String emergencyContactPhone;
	/**
	 * 定点医院1
	 */
	private String designatedHospital1;
	/**
	 * 定点医院2
	 */
	private String designatedHospital2;
	/**
	 * 定点医院3
	 */
	private String designatedHospital3;
	/**
	 * 定点医院4
	 */
	private String designatedHospital4;
	/**
	 * 定点医院5
	 */
	private String designatedHospital5;
	/**
	 * 照片标题内容
	 */
	private String photoContentTitle;
	/**
	 * 照片内容路径
	 */
	private String photoContentUrl;
	/**
	 * 在职状态1-在职2-离职
	 */
	private Integer jobStatus;

}
