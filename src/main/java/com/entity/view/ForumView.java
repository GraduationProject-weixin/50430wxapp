package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ForumEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 论坛
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("forum")
public class ForumView extends ForumEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 帖子状态的值
	*/
	@ColumnInfo(comment="帖子状态的字典表值",type="varchar(200)")
	private String forumStateValue;

	//级联表 司机
		/**
		* 司机名称
		*/

		@ColumnInfo(comment="司机名称",type="varchar(200)")
		private String sijiName;
		/**
		* 联系方式
		*/

		@ColumnInfo(comment="联系方式",type="varchar(200)")
		private String sijiPhone;
		/**
		* 邮箱
		*/

		@ColumnInfo(comment="邮箱",type="varchar(200)")
		private String sijiEmail;
		/**
		* 司机头像
		*/

		@ColumnInfo(comment="司机头像",type="varchar(200)")
		private String sijiPhoto;
		/**
		* 司机类型
		*/
		@ColumnInfo(comment="司机类型",type="int(11)")
		private Integer sijiTypes;
			/**
			* 司机类型的值
			*/
			@ColumnInfo(comment="司机类型的字典表值",type="varchar(200)")
			private String sijiValue;
		/**
		* 司机介绍
		*/

		@ColumnInfo(comment="司机介绍",type="longtext")
		private String sijiContent;
	//级联表 用户
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 联系方式
		*/

		@ColumnInfo(comment="联系方式",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 身份证号
		*/

		@ColumnInfo(comment="身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 电子邮箱
		*/

		@ColumnInfo(comment="电子邮箱",type="varchar(200)")
		private String yonghuEmail;
		/**
		* 余额
		*/
		@ColumnInfo(comment="余额",type="decimal(10,2)")
		private Double newMoney;
	//级联表 管理员
		/**
		* 用户名
		*/
		@ColumnInfo(comment="用户名",type="varchar(100)")
		private String uusername;
		/**
		* 密码
		*/
		@ColumnInfo(comment="密码",type="varchar(100)")
		private String upassword;
		/**
		* 角色
		*/
		@ColumnInfo(comment="角色",type="varchar(100)")
		private String urole;
		/**
		* 新增时间
		*/
		@ColumnInfo(comment="新增时间",type="timestamp")
		private Date uaddtime;



	public ForumView() {

	}

	public ForumView(ForumEntity forumEntity) {
		try {
			BeanUtils.copyProperties(this, forumEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 帖子状态的值
	*/
	public String getForumStateValue() {
		return forumStateValue;
	}
	/**
	* 设置： 帖子状态的值
	*/
	public void setForumStateValue(String forumStateValue) {
		this.forumStateValue = forumStateValue;
	}


	//级联表的get和set 司机

		/**
		* 获取： 司机名称
		*/
		public String getSijiName() {
			return sijiName;
		}
		/**
		* 设置： 司机名称
		*/
		public void setSijiName(String sijiName) {
			this.sijiName = sijiName;
		}

		/**
		* 获取： 联系方式
		*/
		public String getSijiPhone() {
			return sijiPhone;
		}
		/**
		* 设置： 联系方式
		*/
		public void setSijiPhone(String sijiPhone) {
			this.sijiPhone = sijiPhone;
		}

		/**
		* 获取： 邮箱
		*/
		public String getSijiEmail() {
			return sijiEmail;
		}
		/**
		* 设置： 邮箱
		*/
		public void setSijiEmail(String sijiEmail) {
			this.sijiEmail = sijiEmail;
		}

		/**
		* 获取： 司机头像
		*/
		public String getSijiPhoto() {
			return sijiPhoto;
		}
		/**
		* 设置： 司机头像
		*/
		public void setSijiPhoto(String sijiPhoto) {
			this.sijiPhoto = sijiPhoto;
		}
		/**
		* 获取： 司机类型
		*/
		public Integer getSijiTypes() {
			return sijiTypes;
		}
		/**
		* 设置： 司机类型
		*/
		public void setSijiTypes(Integer sijiTypes) {
			this.sijiTypes = sijiTypes;
		}


			/**
			* 获取： 司机类型的值
			*/
			public String getSijiValue() {
				return sijiValue;
			}
			/**
			* 设置： 司机类型的值
			*/
			public void setSijiValue(String sijiValue) {
				this.sijiValue = sijiValue;
			}

		/**
		* 获取： 司机介绍
		*/
		public String getSijiContent() {
			return sijiContent;
		}
		/**
		* 设置： 司机介绍
		*/
		public void setSijiContent(String sijiContent) {
			this.sijiContent = sijiContent;
		}
	//级联表的get和set 用户

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 联系方式
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 联系方式
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 电子邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 电子邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}

		/**
		* 获取： 余额
		*/
		public Double getNewMoney() {
			return newMoney;
		}
		/**
		* 设置： 余额
		*/
		public void setNewMoney(Double newMoney) {
			this.newMoney = newMoney;
		}
	//级联表的get和set 管理员
		/**
		* 获取： 用户名
		*/
		public String getUusername() {
			return uusername;
		}
		/**
		* 设置： 用户名
		*/
		public void setUusername(String uusername) {
			this.uusername = uusername;
		}
		/**
		* 获取： 密码
		*/
		public String getUpassword() {
			return upassword;
		}
		/**
		* 设置： 密码
		*/
		public void setUpassword(String upassword) {
			this.upassword = upassword;
		}
		/**
		* 获取： 角色
		*/
		public String getUrole() {
			return urole;
		}
		/**
		* 设置： 角色
		*/
		public void setUrole(String urole) {
			this.urole = urole;
		}
		/**
		* 获取： 新增时间
		*/
		public Date getUaddtime() {
			return uaddtime;
		}
		/**
		* 设置： 新增时间
		*/
		public void setUaddtime(Date uaddtime) {
			this.uaddtime = uaddtime;
		}


	@Override
	public String toString() {
		return "ForumView{" +
			", forumStateValue=" + forumStateValue +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			", newMoney=" + newMoney +
			", sijiName=" + sijiName +
			", sijiPhone=" + sijiPhone +
			", sijiEmail=" + sijiEmail +
			", sijiPhoto=" + sijiPhoto +
			", sijiContent=" + sijiContent +
			"} " + super.toString();
	}
}