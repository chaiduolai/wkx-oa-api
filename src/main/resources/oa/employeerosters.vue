<template>
  <div class="mod-config">
    <el-form :inline="true" :model="dataForm" @keyup.enter.native="getDataList()">
      <el-form-item>
        <el-input v-model="dataForm.key" placeholder="参数名" clearable></el-input>
      </el-form-item>
      <el-form-item>
        <el-button @click="getDataList()">查询</el-button>
        <el-button v-if="isAuth('oa:employeerosters:save')" type="primary" @click="addOrUpdateHandle()">新增</el-button>
        <el-button v-if="isAuth('oa:employeerosters:delete')" type="danger" @click="deleteHandle()" :disabled="dataListSelections.length <= 0">批量删除</el-button>
      </el-form-item>
    </el-form>
    <el-table
      :data="dataList"
      border
      v-loading="dataListLoading"
      @selection-change="selectionChangeHandle"
      style="width: 100%;">
      <el-table-column
        type="selection"
        header-align="center"
        align="center"
        width="50">
      </el-table-column>
      <el-table-column
        prop="ids"
        header-align="center"
        align="center"
        label="">
      </el-table-column>
      <el-table-column
        prop="createby"
        header-align="center"
        align="center"
        label="创建人">
      </el-table-column>
      <el-table-column
        prop="createdate"
        header-align="center"
        align="center"
        label="创建时间">
      </el-table-column>
      <el-table-column
        prop="updateby"
        header-align="center"
        align="center"
        label="创建人">
      </el-table-column>
      <el-table-column
        prop="updatedate"
        header-align="center"
        align="center"
        label="创建时间">
      </el-table-column>
      <el-table-column
        prop="remarks"
        header-align="center"
        align="center"
        label="">
      </el-table-column>
      <el-table-column
        prop="state"
        header-align="center"
        align="center"
        label="状态1-正常2-取消">
      </el-table-column>
      <el-table-column
        prop="employeeNumber"
        header-align="center"
        align="center"
        label="员工编号">
      </el-table-column>
      <el-table-column
        prop="employeeName"
        header-align="center"
        align="center"
        label="员工姓名">
      </el-table-column>
      <el-table-column
        prop="employeeIdcards"
        header-align="center"
        align="center"
        label="员工身份证号">
      </el-table-column>
      <el-table-column
        prop="employeePhone"
        header-align="center"
        align="center"
        label="手机号">
      </el-table-column>
      <el-table-column
        prop="employeeEmail"
        header-align="center"
        align="center"
        label="邮箱">
      </el-table-column>
      <el-table-column
        prop="entryCompany"
        header-align="center"
        align="center"
        label="入职公司">
      </el-table-column>
      <el-table-column
        prop="entryCompanyIds"
        header-align="center"
        align="center"
        label="入职公司ids">
      </el-table-column>
      <el-table-column
        prop="entryPosition"
        header-align="center"
        align="center"
        label="入职岗位">
      </el-table-column>
      <el-table-column
        prop="entryPositionIds"
        header-align="center"
        align="center"
        label="入职岗位ids">
      </el-table-column>
      <el-table-column
        prop="trialDateStartFirst"
        header-align="center"
        align="center"
        label="试用期1开始时间">
      </el-table-column>
      <el-table-column
        prop="trialDateEndFirst"
        header-align="center"
        align="center"
        label="试用期1结束时间">
      </el-table-column>
      <el-table-column
        prop="trialSalaryFirst"
        header-align="center"
        align="center"
        label="试用期1薪资">
      </el-table-column>
      <el-table-column
        prop="trialDateStartSecond"
        header-align="center"
        align="center"
        label="试用期2开始时间">
      </el-table-column>
      <el-table-column
        prop="trialDateEndSecond"
        header-align="center"
        align="center"
        label="试用期2结束时间">
      </el-table-column>
      <el-table-column
        prop="trialSalarySecond"
        header-align="center"
        align="center"
        label="试用期2薪资">
      </el-table-column>
      <el-table-column
        prop="trialDateStartOver"
        header-align="center"
        align="center"
        label="转正开始时间">
      </el-table-column>
      <el-table-column
        prop="trialDateEndOver"
        header-align="center"
        align="center"
        label="转正结束时间">
      </el-table-column>
      <el-table-column
        prop="trialSalaryOver"
        header-align="center"
        align="center"
        label="转正薪资">
      </el-table-column>
      <el-table-column
        prop="trialDate"
        header-align="center"
        align="center"
        label="入职时间">
      </el-table-column>
      <el-table-column
        prop="laborContractDateStart"
        header-align="center"
        align="center"
        label="劳动合同开始时间">
      </el-table-column>
      <el-table-column
        prop="laborContractDateEnd"
        header-align="center"
        align="center"
        label="劳动合同结束时间">
      </el-table-column>
      <el-table-column
        prop="payDay"
        header-align="center"
        align="center"
        label="工资发放日">
      </el-table-column>
      <el-table-column
        prop="sbJnd"
        header-align="center"
        align="center"
        label="社保缴纳地">
      </el-table-column>
      <el-table-column
        prop="welfare"
        header-align="center"
        align="center"
        label="福利">
      </el-table-column>
      <el-table-column
        prop="isInternship"
        header-align="center"
        align="center"
        label="是否实习1-否2-是">
      </el-table-column>
      <el-table-column
        prop="isInterEmployee"
        header-align="center"
        align="center"
        label="是否内部员工1-否2-是">
      </el-table-column>
      <el-table-column
        prop="nation"
        header-align="center"
        align="center"
        label="民族">
      </el-table-column>
      <el-table-column
        prop="isMarital"
        header-align="center"
        align="center"
        label="婚姻状态1-未婚2-已婚">
      </el-table-column>
      <el-table-column
        prop="zodiac"
        header-align="center"
        align="center"
        label="生肖">
      </el-table-column>
      <el-table-column
        prop="constellation"
        header-align="center"
        align="center"
        label="星座">
      </el-table-column>
      <el-table-column
        prop="politicalOutlook"
        header-align="center"
        align="center"
        label="政治面貌">
      </el-table-column>
      <el-table-column
        prop="isPaymentSbBj"
        header-align="center"
        align="center"
        label="是否在北京缴纳过社保1-否2-是">
      </el-table-column>
      <el-table-column
        prop="education"
        header-align="center"
        align="center"
        label="学历">
      </el-table-column>
      <el-table-column
        prop="graduationSchool"
        header-align="center"
        align="center"
        label="毕业院校">
      </el-table-column>
      <el-table-column
        prop="major"
        header-align="center"
        align="center"
        label="专业">
      </el-table-column>
      <el-table-column
        prop="registeredResidence"
        header-align="center"
        align="center"
        label="户籍所在地">
      </el-table-column>
      <el-table-column
        prop="registeredResidenceType"
        header-align="center"
        align="center"
        label="户口性质1-城镇2-农村">
      </el-table-column>
      <el-table-column
        prop="currentResidence"
        header-align="center"
        align="center"
        label="现居地">
      </el-table-column>
      <el-table-column
        prop="eduExperience"
        header-align="center"
        align="center"
        label="教育及培训经历">
      </el-table-column>
      <el-table-column
        prop="workExperience"
        header-align="center"
        align="center"
        label="工作经历">
      </el-table-column>
      <el-table-column
        prop="familyMember"
        header-align="center"
        align="center"
        label="家庭成员">
      </el-table-column>
      <el-table-column
        prop="emergencyContactName"
        header-align="center"
        align="center"
        label="紧急联系人姓名">
      </el-table-column>
      <el-table-column
        prop="emergencyContactPhone"
        header-align="center"
        align="center"
        label="紧急联系人电话">
      </el-table-column>
      <el-table-column
        prop="designatedHospital1"
        header-align="center"
        align="center"
        label="定点医院1">
      </el-table-column>
      <el-table-column
        prop="designatedHospital2"
        header-align="center"
        align="center"
        label="定点医院2">
      </el-table-column>
      <el-table-column
        prop="designatedHospital3"
        header-align="center"
        align="center"
        label="定点医院3">
      </el-table-column>
      <el-table-column
        prop="designatedHospital4"
        header-align="center"
        align="center"
        label="定点医院4">
      </el-table-column>
      <el-table-column
        prop="designatedHospital5"
        header-align="center"
        align="center"
        label="定点医院5">
      </el-table-column>
      <el-table-column
        prop="photoContentTitle"
        header-align="center"
        align="center"
        label="照片标题内容">
      </el-table-column>
      <el-table-column
        prop="photoContentUrl"
        header-align="center"
        align="center"
        label="照片内容路径">
      </el-table-column>
      <el-table-column
        prop="jobStatus"
        header-align="center"
        align="center"
        label="在职状态1-在职2-离职">
      </el-table-column>
      <el-table-column
        fixed="right"
        header-align="center"
        align="center"
        width="150"
        label="操作">
        <template slot-scope="scope">
          <el-button type="text" size="small" @click="addOrUpdateHandle(scope.row.ids)">修改</el-button>
          <el-button type="text" size="small" @click="deleteHandle(scope.row.ids)">删除</el-button>
        </template>
      </el-table-column>
    </el-table>
    <el-pagination
      @size-change="sizeChangeHandle"
      @current-change="currentChangeHandle"
      :current-page="pageIndex"
      :page-sizes="[10, 20, 50, 100]"
      :page-size="pageSize"
      :total="totalPage"
      layout="total, sizes, prev, pager, next, jumper">
    </el-pagination>
    <!-- 弹窗, 新增 / 修改 -->
    <add-or-update v-if="addOrUpdateVisible" ref="addOrUpdate" @refreshDataList="getDataList"></add-or-update>
  </div>
</template>

<script>
  import AddOrUpdate from './employeerosters-add-or-update'
  export default {
    data () {
      return {
        dataForm: {
          key: ''
        },
        dataList: [],
        pageIndex: 1,
        pageSize: 10,
        totalPage: 0,
        dataListLoading: false,
        dataListSelections: [],
        addOrUpdateVisible: false
      }
    },
    components: {
      AddOrUpdate
    },
    activated () {
      this.getDataList()
    },
    methods: {
      // 获取数据列表
      getDataList () {
        this.dataListLoading = true
        this.$http({
          url: this.$http.adornUrl('/oa/employeerosters/list'),
          method: 'get',
          params: this.$http.adornParams({
            'page': this.pageIndex,
            'limit': this.pageSize,
            'key': this.dataForm.key
          })
        }).then(({data}) => {
          if (data && data.code === 0) {
            this.dataList = data.page.list
            this.totalPage = data.page.totalCount
          } else {
            this.dataList = []
            this.totalPage = 0
          }
          this.dataListLoading = false
        })
      },
      // 每页数
      sizeChangeHandle (val) {
        this.pageSize = val
        this.pageIndex = 1
        this.getDataList()
      },
      // 当前页
      currentChangeHandle (val) {
        this.pageIndex = val
        this.getDataList()
      },
      // 多选
      selectionChangeHandle (val) {
        this.dataListSelections = val
      },
      // 新增 / 修改
      addOrUpdateHandle (id) {
        this.addOrUpdateVisible = true
        this.$nextTick(() => {
          this.$refs.addOrUpdate.init(id)
        })
      },
      // 删除
      deleteHandle (id) {
        var ids = id ? [id] : this.dataListSelections.map(item => {
          return item.ids
        })
        this.$confirm(`确定对[id=${ids.join(',')}]进行[${id ? '删除' : '批量删除'}]操作?`, '提示', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(() => {
          this.$http({
            url: this.$http.adornUrl('/oa/employeerosters/delete'),
            method: 'post',
            data: this.$http.adornData(ids, false)
          }).then(({data}) => {
            if (data && data.code === 0) {
              this.$message({
                message: '操作成功',
                type: 'success',
                duration: 1500,
                onClose: () => {
                  this.getDataList()
                }
              })
            } else {
              this.$message.error(data.msg)
            }
          })
        })
      }
    }
  }
</script>
