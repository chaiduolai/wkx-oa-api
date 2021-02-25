<template>
  <el-dialog
    :title="!dataForm.id ? '新增' : '修改'"
    :close-on-click-modal="false"
    :visible.sync="visible">
    <el-form :model="dataForm" :rules="dataRule" ref="dataForm" @keyup.enter.native="dataFormSubmit()" label-width="80px">
    <el-form-item label="创建人" prop="createby">
      <el-input v-model="dataForm.createby" placeholder="创建人"></el-input>
    </el-form-item>
    <el-form-item label="创建时间" prop="createdate">
      <el-input v-model="dataForm.createdate" placeholder="创建时间"></el-input>
    </el-form-item>
    <el-form-item label="创建人" prop="updateby">
      <el-input v-model="dataForm.updateby" placeholder="创建人"></el-input>
    </el-form-item>
    <el-form-item label="创建时间" prop="updatedate">
      <el-input v-model="dataForm.updatedate" placeholder="创建时间"></el-input>
    </el-form-item>
    <el-form-item label="" prop="remarks">
      <el-input v-model="dataForm.remarks" placeholder=""></el-input>
    </el-form-item>
    <el-form-item label="状态1-正常2-取消" prop="state">
      <el-input v-model="dataForm.state" placeholder="状态1-正常2-取消"></el-input>
    </el-form-item>
    <el-form-item label="员工编号" prop="employeeNumber">
      <el-input v-model="dataForm.employeeNumber" placeholder="员工编号"></el-input>
    </el-form-item>
    <el-form-item label="员工姓名" prop="employeeName">
      <el-input v-model="dataForm.employeeName" placeholder="员工姓名"></el-input>
    </el-form-item>
    <el-form-item label="员工身份证号" prop="employeeIdcards">
      <el-input v-model="dataForm.employeeIdcards" placeholder="员工身份证号"></el-input>
    </el-form-item>
    <el-form-item label="手机号" prop="employeePhone">
      <el-input v-model="dataForm.employeePhone" placeholder="手机号"></el-input>
    </el-form-item>
    <el-form-item label="邮箱" prop="employeeEmail">
      <el-input v-model="dataForm.employeeEmail" placeholder="邮箱"></el-input>
    </el-form-item>
    <el-form-item label="入职公司" prop="entryCompany">
      <el-input v-model="dataForm.entryCompany" placeholder="入职公司"></el-input>
    </el-form-item>
    <el-form-item label="入职公司ids" prop="entryCompanyIds">
      <el-input v-model="dataForm.entryCompanyIds" placeholder="入职公司ids"></el-input>
    </el-form-item>
    <el-form-item label="入职岗位" prop="entryPosition">
      <el-input v-model="dataForm.entryPosition" placeholder="入职岗位"></el-input>
    </el-form-item>
    <el-form-item label="入职岗位ids" prop="entryPositionIds">
      <el-input v-model="dataForm.entryPositionIds" placeholder="入职岗位ids"></el-input>
    </el-form-item>
    <el-form-item label="试用期1开始时间" prop="trialDateStartFirst">
      <el-input v-model="dataForm.trialDateStartFirst" placeholder="试用期1开始时间"></el-input>
    </el-form-item>
    <el-form-item label="试用期1结束时间" prop="trialDateEndFirst">
      <el-input v-model="dataForm.trialDateEndFirst" placeholder="试用期1结束时间"></el-input>
    </el-form-item>
    <el-form-item label="试用期1薪资" prop="trialSalaryFirst">
      <el-input v-model="dataForm.trialSalaryFirst" placeholder="试用期1薪资"></el-input>
    </el-form-item>
    <el-form-item label="试用期2开始时间" prop="trialDateStartSecond">
      <el-input v-model="dataForm.trialDateStartSecond" placeholder="试用期2开始时间"></el-input>
    </el-form-item>
    <el-form-item label="试用期2结束时间" prop="trialDateEndSecond">
      <el-input v-model="dataForm.trialDateEndSecond" placeholder="试用期2结束时间"></el-input>
    </el-form-item>
    <el-form-item label="试用期2薪资" prop="trialSalarySecond">
      <el-input v-model="dataForm.trialSalarySecond" placeholder="试用期2薪资"></el-input>
    </el-form-item>
    <el-form-item label="转正开始时间" prop="trialDateStartOver">
      <el-input v-model="dataForm.trialDateStartOver" placeholder="转正开始时间"></el-input>
    </el-form-item>
    <el-form-item label="转正结束时间" prop="trialDateEndOver">
      <el-input v-model="dataForm.trialDateEndOver" placeholder="转正结束时间"></el-input>
    </el-form-item>
    <el-form-item label="转正薪资" prop="trialSalaryOver">
      <el-input v-model="dataForm.trialSalaryOver" placeholder="转正薪资"></el-input>
    </el-form-item>
    <el-form-item label="入职时间" prop="trialDate">
      <el-input v-model="dataForm.trialDate" placeholder="入职时间"></el-input>
    </el-form-item>
    <el-form-item label="劳动合同开始时间" prop="laborContractDateStart">
      <el-input v-model="dataForm.laborContractDateStart" placeholder="劳动合同开始时间"></el-input>
    </el-form-item>
    <el-form-item label="劳动合同结束时间" prop="laborContractDateEnd">
      <el-input v-model="dataForm.laborContractDateEnd" placeholder="劳动合同结束时间"></el-input>
    </el-form-item>
    <el-form-item label="工资发放日" prop="payDay">
      <el-input v-model="dataForm.payDay" placeholder="工资发放日"></el-input>
    </el-form-item>
    <el-form-item label="社保缴纳地" prop="sbJnd">
      <el-input v-model="dataForm.sbJnd" placeholder="社保缴纳地"></el-input>
    </el-form-item>
    <el-form-item label="福利" prop="welfare">
      <el-input v-model="dataForm.welfare" placeholder="福利"></el-input>
    </el-form-item>
    <el-form-item label="是否实习1-否2-是" prop="isInternship">
      <el-input v-model="dataForm.isInternship" placeholder="是否实习1-否2-是"></el-input>
    </el-form-item>
    <el-form-item label="是否内部员工1-否2-是" prop="isInterEmployee">
      <el-input v-model="dataForm.isInterEmployee" placeholder="是否内部员工1-否2-是"></el-input>
    </el-form-item>
    <el-form-item label="民族" prop="nation">
      <el-input v-model="dataForm.nation" placeholder="民族"></el-input>
    </el-form-item>
    <el-form-item label="婚姻状态1-未婚2-已婚" prop="isMarital">
      <el-input v-model="dataForm.isMarital" placeholder="婚姻状态1-未婚2-已婚"></el-input>
    </el-form-item>
    <el-form-item label="生肖" prop="zodiac">
      <el-input v-model="dataForm.zodiac" placeholder="生肖"></el-input>
    </el-form-item>
    <el-form-item label="星座" prop="constellation">
      <el-input v-model="dataForm.constellation" placeholder="星座"></el-input>
    </el-form-item>
    <el-form-item label="政治面貌" prop="politicalOutlook">
      <el-input v-model="dataForm.politicalOutlook" placeholder="政治面貌"></el-input>
    </el-form-item>
    <el-form-item label="是否在北京缴纳过社保1-否2-是" prop="isPaymentSbBj">
      <el-input v-model="dataForm.isPaymentSbBj" placeholder="是否在北京缴纳过社保1-否2-是"></el-input>
    </el-form-item>
    <el-form-item label="学历" prop="education">
      <el-input v-model="dataForm.education" placeholder="学历"></el-input>
    </el-form-item>
    <el-form-item label="毕业院校" prop="graduationSchool">
      <el-input v-model="dataForm.graduationSchool" placeholder="毕业院校"></el-input>
    </el-form-item>
    <el-form-item label="专业" prop="major">
      <el-input v-model="dataForm.major" placeholder="专业"></el-input>
    </el-form-item>
    <el-form-item label="户籍所在地" prop="registeredResidence">
      <el-input v-model="dataForm.registeredResidence" placeholder="户籍所在地"></el-input>
    </el-form-item>
    <el-form-item label="户口性质1-城镇2-农村" prop="registeredResidenceType">
      <el-input v-model="dataForm.registeredResidenceType" placeholder="户口性质1-城镇2-农村"></el-input>
    </el-form-item>
    <el-form-item label="现居地" prop="currentResidence">
      <el-input v-model="dataForm.currentResidence" placeholder="现居地"></el-input>
    </el-form-item>
    <el-form-item label="教育及培训经历" prop="eduExperience">
      <el-input v-model="dataForm.eduExperience" placeholder="教育及培训经历"></el-input>
    </el-form-item>
    <el-form-item label="工作经历" prop="workExperience">
      <el-input v-model="dataForm.workExperience" placeholder="工作经历"></el-input>
    </el-form-item>
    <el-form-item label="家庭成员" prop="familyMember">
      <el-input v-model="dataForm.familyMember" placeholder="家庭成员"></el-input>
    </el-form-item>
    <el-form-item label="紧急联系人姓名" prop="emergencyContactName">
      <el-input v-model="dataForm.emergencyContactName" placeholder="紧急联系人姓名"></el-input>
    </el-form-item>
    <el-form-item label="紧急联系人电话" prop="emergencyContactPhone">
      <el-input v-model="dataForm.emergencyContactPhone" placeholder="紧急联系人电话"></el-input>
    </el-form-item>
    <el-form-item label="定点医院1" prop="designatedHospital1">
      <el-input v-model="dataForm.designatedHospital1" placeholder="定点医院1"></el-input>
    </el-form-item>
    <el-form-item label="定点医院2" prop="designatedHospital2">
      <el-input v-model="dataForm.designatedHospital2" placeholder="定点医院2"></el-input>
    </el-form-item>
    <el-form-item label="定点医院3" prop="designatedHospital3">
      <el-input v-model="dataForm.designatedHospital3" placeholder="定点医院3"></el-input>
    </el-form-item>
    <el-form-item label="定点医院4" prop="designatedHospital4">
      <el-input v-model="dataForm.designatedHospital4" placeholder="定点医院4"></el-input>
    </el-form-item>
    <el-form-item label="定点医院5" prop="designatedHospital5">
      <el-input v-model="dataForm.designatedHospital5" placeholder="定点医院5"></el-input>
    </el-form-item>
    <el-form-item label="照片标题内容" prop="photoContentTitle">
      <el-input v-model="dataForm.photoContentTitle" placeholder="照片标题内容"></el-input>
    </el-form-item>
    <el-form-item label="照片内容路径" prop="photoContentUrl">
      <el-input v-model="dataForm.photoContentUrl" placeholder="照片内容路径"></el-input>
    </el-form-item>
    <el-form-item label="在职状态1-在职2-离职" prop="jobStatus">
      <el-input v-model="dataForm.jobStatus" placeholder="在职状态1-在职2-离职"></el-input>
    </el-form-item>
    </el-form>
    <span slot="footer" class="dialog-footer">
      <el-button @click="visible = false">取消</el-button>
      <el-button type="primary" @click="dataFormSubmit()">确定</el-button>
    </span>
  </el-dialog>
</template>

<script>
  export default {
    data () {
      return {
        visible: false,
        dataForm: {
          ids: 0,
          createby: '',
          createdate: '',
          updateby: '',
          updatedate: '',
          remarks: '',
          state: '',
          employeeNumber: '',
          employeeName: '',
          employeeIdcards: '',
          employeePhone: '',
          employeeEmail: '',
          entryCompany: '',
          entryCompanyIds: '',
          entryPosition: '',
          entryPositionIds: '',
          trialDateStartFirst: '',
          trialDateEndFirst: '',
          trialSalaryFirst: '',
          trialDateStartSecond: '',
          trialDateEndSecond: '',
          trialSalarySecond: '',
          trialDateStartOver: '',
          trialDateEndOver: '',
          trialSalaryOver: '',
          trialDate: '',
          laborContractDateStart: '',
          laborContractDateEnd: '',
          payDay: '',
          sbJnd: '',
          welfare: '',
          isInternship: '',
          isInterEmployee: '',
          nation: '',
          isMarital: '',
          zodiac: '',
          constellation: '',
          politicalOutlook: '',
          isPaymentSbBj: '',
          education: '',
          graduationSchool: '',
          major: '',
          registeredResidence: '',
          registeredResidenceType: '',
          currentResidence: '',
          eduExperience: '',
          workExperience: '',
          familyMember: '',
          emergencyContactName: '',
          emergencyContactPhone: '',
          designatedHospital1: '',
          designatedHospital2: '',
          designatedHospital3: '',
          designatedHospital4: '',
          designatedHospital5: '',
          photoContentTitle: '',
          photoContentUrl: '',
          jobStatus: ''
        },
        dataRule: {
          createby: [
            { required: true, message: '创建人不能为空', trigger: 'blur' }
          ],
          createdate: [
            { required: true, message: '创建时间不能为空', trigger: 'blur' }
          ],
          updateby: [
            { required: true, message: '创建人不能为空', trigger: 'blur' }
          ],
          updatedate: [
            { required: true, message: '创建时间不能为空', trigger: 'blur' }
          ],
          remarks: [
            { required: true, message: '不能为空', trigger: 'blur' }
          ],
          state: [
            { required: true, message: '状态1-正常2-取消不能为空', trigger: 'blur' }
          ],
          employeeNumber: [
            { required: true, message: '员工编号不能为空', trigger: 'blur' }
          ],
          employeeName: [
            { required: true, message: '员工姓名不能为空', trigger: 'blur' }
          ],
          employeeIdcards: [
            { required: true, message: '员工身份证号不能为空', trigger: 'blur' }
          ],
          employeePhone: [
            { required: true, message: '手机号不能为空', trigger: 'blur' }
          ],
          employeeEmail: [
            { required: true, message: '邮箱不能为空', trigger: 'blur' }
          ],
          entryCompany: [
            { required: true, message: '入职公司不能为空', trigger: 'blur' }
          ],
          entryCompanyIds: [
            { required: true, message: '入职公司ids不能为空', trigger: 'blur' }
          ],
          entryPosition: [
            { required: true, message: '入职岗位不能为空', trigger: 'blur' }
          ],
          entryPositionIds: [
            { required: true, message: '入职岗位ids不能为空', trigger: 'blur' }
          ],
          trialDateStartFirst: [
            { required: true, message: '试用期1开始时间不能为空', trigger: 'blur' }
          ],
          trialDateEndFirst: [
            { required: true, message: '试用期1结束时间不能为空', trigger: 'blur' }
          ],
          trialSalaryFirst: [
            { required: true, message: '试用期1薪资不能为空', trigger: 'blur' }
          ],
          trialDateStartSecond: [
            { required: true, message: '试用期2开始时间不能为空', trigger: 'blur' }
          ],
          trialDateEndSecond: [
            { required: true, message: '试用期2结束时间不能为空', trigger: 'blur' }
          ],
          trialSalarySecond: [
            { required: true, message: '试用期2薪资不能为空', trigger: 'blur' }
          ],
          trialDateStartOver: [
            { required: true, message: '转正开始时间不能为空', trigger: 'blur' }
          ],
          trialDateEndOver: [
            { required: true, message: '转正结束时间不能为空', trigger: 'blur' }
          ],
          trialSalaryOver: [
            { required: true, message: '转正薪资不能为空', trigger: 'blur' }
          ],
          trialDate: [
            { required: true, message: '入职时间不能为空', trigger: 'blur' }
          ],
          laborContractDateStart: [
            { required: true, message: '劳动合同开始时间不能为空', trigger: 'blur' }
          ],
          laborContractDateEnd: [
            { required: true, message: '劳动合同结束时间不能为空', trigger: 'blur' }
          ],
          payDay: [
            { required: true, message: '工资发放日不能为空', trigger: 'blur' }
          ],
          sbJnd: [
            { required: true, message: '社保缴纳地不能为空', trigger: 'blur' }
          ],
          welfare: [
            { required: true, message: '福利不能为空', trigger: 'blur' }
          ],
          isInternship: [
            { required: true, message: '是否实习1-否2-是不能为空', trigger: 'blur' }
          ],
          isInterEmployee: [
            { required: true, message: '是否内部员工1-否2-是不能为空', trigger: 'blur' }
          ],
          nation: [
            { required: true, message: '民族不能为空', trigger: 'blur' }
          ],
          isMarital: [
            { required: true, message: '婚姻状态1-未婚2-已婚不能为空', trigger: 'blur' }
          ],
          zodiac: [
            { required: true, message: '生肖不能为空', trigger: 'blur' }
          ],
          constellation: [
            { required: true, message: '星座不能为空', trigger: 'blur' }
          ],
          politicalOutlook: [
            { required: true, message: '政治面貌不能为空', trigger: 'blur' }
          ],
          isPaymentSbBj: [
            { required: true, message: '是否在北京缴纳过社保1-否2-是不能为空', trigger: 'blur' }
          ],
          education: [
            { required: true, message: '学历不能为空', trigger: 'blur' }
          ],
          graduationSchool: [
            { required: true, message: '毕业院校不能为空', trigger: 'blur' }
          ],
          major: [
            { required: true, message: '专业不能为空', trigger: 'blur' }
          ],
          registeredResidence: [
            { required: true, message: '户籍所在地不能为空', trigger: 'blur' }
          ],
          registeredResidenceType: [
            { required: true, message: '户口性质1-城镇2-农村不能为空', trigger: 'blur' }
          ],
          currentResidence: [
            { required: true, message: '现居地不能为空', trigger: 'blur' }
          ],
          eduExperience: [
            { required: true, message: '教育及培训经历不能为空', trigger: 'blur' }
          ],
          workExperience: [
            { required: true, message: '工作经历不能为空', trigger: 'blur' }
          ],
          familyMember: [
            { required: true, message: '家庭成员不能为空', trigger: 'blur' }
          ],
          emergencyContactName: [
            { required: true, message: '紧急联系人姓名不能为空', trigger: 'blur' }
          ],
          emergencyContactPhone: [
            { required: true, message: '紧急联系人电话不能为空', trigger: 'blur' }
          ],
          designatedHospital1: [
            { required: true, message: '定点医院1不能为空', trigger: 'blur' }
          ],
          designatedHospital2: [
            { required: true, message: '定点医院2不能为空', trigger: 'blur' }
          ],
          designatedHospital3: [
            { required: true, message: '定点医院3不能为空', trigger: 'blur' }
          ],
          designatedHospital4: [
            { required: true, message: '定点医院4不能为空', trigger: 'blur' }
          ],
          designatedHospital5: [
            { required: true, message: '定点医院5不能为空', trigger: 'blur' }
          ],
          photoContentTitle: [
            { required: true, message: '照片标题内容不能为空', trigger: 'blur' }
          ],
          photoContentUrl: [
            { required: true, message: '照片内容路径不能为空', trigger: 'blur' }
          ],
          jobStatus: [
            { required: true, message: '在职状态1-在职2-离职不能为空', trigger: 'blur' }
          ]
        }
      }
    },
    methods: {
      init (id) {
        this.dataForm.ids = id || 0
        this.visible = true
        this.$nextTick(() => {
          this.$refs['dataForm'].resetFields()
          if (this.dataForm.ids) {
            this.$http({
              url: this.$http.adornUrl(`/oa/employeerosters/info/${this.dataForm.ids}`),
              method: 'get',
              params: this.$http.adornParams()
            }).then(({data}) => {
              if (data && data.code === 0) {
                this.dataForm.createby = data.employeeRosters.createby
                this.dataForm.createdate = data.employeeRosters.createdate
                this.dataForm.updateby = data.employeeRosters.updateby
                this.dataForm.updatedate = data.employeeRosters.updatedate
                this.dataForm.remarks = data.employeeRosters.remarks
                this.dataForm.state = data.employeeRosters.state
                this.dataForm.employeeNumber = data.employeeRosters.employeeNumber
                this.dataForm.employeeName = data.employeeRosters.employeeName
                this.dataForm.employeeIdcards = data.employeeRosters.employeeIdcards
                this.dataForm.employeePhone = data.employeeRosters.employeePhone
                this.dataForm.employeeEmail = data.employeeRosters.employeeEmail
                this.dataForm.entryCompany = data.employeeRosters.entryCompany
                this.dataForm.entryCompanyIds = data.employeeRosters.entryCompanyIds
                this.dataForm.entryPosition = data.employeeRosters.entryPosition
                this.dataForm.entryPositionIds = data.employeeRosters.entryPositionIds
                this.dataForm.trialDateStartFirst = data.employeeRosters.trialDateStartFirst
                this.dataForm.trialDateEndFirst = data.employeeRosters.trialDateEndFirst
                this.dataForm.trialSalaryFirst = data.employeeRosters.trialSalaryFirst
                this.dataForm.trialDateStartSecond = data.employeeRosters.trialDateStartSecond
                this.dataForm.trialDateEndSecond = data.employeeRosters.trialDateEndSecond
                this.dataForm.trialSalarySecond = data.employeeRosters.trialSalarySecond
                this.dataForm.trialDateStartOver = data.employeeRosters.trialDateStartOver
                this.dataForm.trialDateEndOver = data.employeeRosters.trialDateEndOver
                this.dataForm.trialSalaryOver = data.employeeRosters.trialSalaryOver
                this.dataForm.trialDate = data.employeeRosters.trialDate
                this.dataForm.laborContractDateStart = data.employeeRosters.laborContractDateStart
                this.dataForm.laborContractDateEnd = data.employeeRosters.laborContractDateEnd
                this.dataForm.payDay = data.employeeRosters.payDay
                this.dataForm.sbJnd = data.employeeRosters.sbJnd
                this.dataForm.welfare = data.employeeRosters.welfare
                this.dataForm.isInternship = data.employeeRosters.isInternship
                this.dataForm.isInterEmployee = data.employeeRosters.isInterEmployee
                this.dataForm.nation = data.employeeRosters.nation
                this.dataForm.isMarital = data.employeeRosters.isMarital
                this.dataForm.zodiac = data.employeeRosters.zodiac
                this.dataForm.constellation = data.employeeRosters.constellation
                this.dataForm.politicalOutlook = data.employeeRosters.politicalOutlook
                this.dataForm.isPaymentSbBj = data.employeeRosters.isPaymentSbBj
                this.dataForm.education = data.employeeRosters.education
                this.dataForm.graduationSchool = data.employeeRosters.graduationSchool
                this.dataForm.major = data.employeeRosters.major
                this.dataForm.registeredResidence = data.employeeRosters.registeredResidence
                this.dataForm.registeredResidenceType = data.employeeRosters.registeredResidenceType
                this.dataForm.currentResidence = data.employeeRosters.currentResidence
                this.dataForm.eduExperience = data.employeeRosters.eduExperience
                this.dataForm.workExperience = data.employeeRosters.workExperience
                this.dataForm.familyMember = data.employeeRosters.familyMember
                this.dataForm.emergencyContactName = data.employeeRosters.emergencyContactName
                this.dataForm.emergencyContactPhone = data.employeeRosters.emergencyContactPhone
                this.dataForm.designatedHospital1 = data.employeeRosters.designatedHospital1
                this.dataForm.designatedHospital2 = data.employeeRosters.designatedHospital2
                this.dataForm.designatedHospital3 = data.employeeRosters.designatedHospital3
                this.dataForm.designatedHospital4 = data.employeeRosters.designatedHospital4
                this.dataForm.designatedHospital5 = data.employeeRosters.designatedHospital5
                this.dataForm.photoContentTitle = data.employeeRosters.photoContentTitle
                this.dataForm.photoContentUrl = data.employeeRosters.photoContentUrl
                this.dataForm.jobStatus = data.employeeRosters.jobStatus
              }
            })
          }
        })
      },
      // 表单提交
      dataFormSubmit () {
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            this.$http({
              url: this.$http.adornUrl(`/oa/employeerosters/${!this.dataForm.ids ? 'save' : 'update'}`),
              method: 'post',
              data: this.$http.adornData({
                'ids': this.dataForm.ids || undefined,
                'createby': this.dataForm.createby,
                'createdate': this.dataForm.createdate,
                'updateby': this.dataForm.updateby,
                'updatedate': this.dataForm.updatedate,
                'remarks': this.dataForm.remarks,
                'state': this.dataForm.state,
                'employeeNumber': this.dataForm.employeeNumber,
                'employeeName': this.dataForm.employeeName,
                'employeeIdcards': this.dataForm.employeeIdcards,
                'employeePhone': this.dataForm.employeePhone,
                'employeeEmail': this.dataForm.employeeEmail,
                'entryCompany': this.dataForm.entryCompany,
                'entryCompanyIds': this.dataForm.entryCompanyIds,
                'entryPosition': this.dataForm.entryPosition,
                'entryPositionIds': this.dataForm.entryPositionIds,
                'trialDateStartFirst': this.dataForm.trialDateStartFirst,
                'trialDateEndFirst': this.dataForm.trialDateEndFirst,
                'trialSalaryFirst': this.dataForm.trialSalaryFirst,
                'trialDateStartSecond': this.dataForm.trialDateStartSecond,
                'trialDateEndSecond': this.dataForm.trialDateEndSecond,
                'trialSalarySecond': this.dataForm.trialSalarySecond,
                'trialDateStartOver': this.dataForm.trialDateStartOver,
                'trialDateEndOver': this.dataForm.trialDateEndOver,
                'trialSalaryOver': this.dataForm.trialSalaryOver,
                'trialDate': this.dataForm.trialDate,
                'laborContractDateStart': this.dataForm.laborContractDateStart,
                'laborContractDateEnd': this.dataForm.laborContractDateEnd,
                'payDay': this.dataForm.payDay,
                'sbJnd': this.dataForm.sbJnd,
                'welfare': this.dataForm.welfare,
                'isInternship': this.dataForm.isInternship,
                'isInterEmployee': this.dataForm.isInterEmployee,
                'nation': this.dataForm.nation,
                'isMarital': this.dataForm.isMarital,
                'zodiac': this.dataForm.zodiac,
                'constellation': this.dataForm.constellation,
                'politicalOutlook': this.dataForm.politicalOutlook,
                'isPaymentSbBj': this.dataForm.isPaymentSbBj,
                'education': this.dataForm.education,
                'graduationSchool': this.dataForm.graduationSchool,
                'major': this.dataForm.major,
                'registeredResidence': this.dataForm.registeredResidence,
                'registeredResidenceType': this.dataForm.registeredResidenceType,
                'currentResidence': this.dataForm.currentResidence,
                'eduExperience': this.dataForm.eduExperience,
                'workExperience': this.dataForm.workExperience,
                'familyMember': this.dataForm.familyMember,
                'emergencyContactName': this.dataForm.emergencyContactName,
                'emergencyContactPhone': this.dataForm.emergencyContactPhone,
                'designatedHospital1': this.dataForm.designatedHospital1,
                'designatedHospital2': this.dataForm.designatedHospital2,
                'designatedHospital3': this.dataForm.designatedHospital3,
                'designatedHospital4': this.dataForm.designatedHospital4,
                'designatedHospital5': this.dataForm.designatedHospital5,
                'photoContentTitle': this.dataForm.photoContentTitle,
                'photoContentUrl': this.dataForm.photoContentUrl,
                'jobStatus': this.dataForm.jobStatus
              })
            }).then(({data}) => {
              if (data && data.code === 0) {
                this.$message({
                  message: '操作成功',
                  type: 'success',
                  duration: 1500,
                  onClose: () => {
                    this.visible = false
                    this.$emit('refreshDataList')
                  }
                })
              } else {
                this.$message.error(data.msg)
              }
            })
          }
        })
      }
    }
  }
</script>
