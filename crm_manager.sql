/*
 Navicat Premium Data Transfer

 Source Server         : ghr
 Source Server Type    : MySQL
 Source Server Version : 80022
 Source Host           : localhost:3306
 Source Schema         : crm_manager

 Target Server Type    : MySQL
 Target Server Version : 80022
 File Encoding         : 65001

 Date: 30/12/2020 09:22:38
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for cp_table
-- ----------------------------
DROP TABLE IF EXISTS `cp_table`;
CREATE TABLE `cp_table`  (
  `cpid` int(0) NOT NULL COMMENT '产品编号',
  `cpname` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '产品名称',
  `cptime` date NULL DEFAULT NULL COMMENT '生产日期',
  `cptype` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '产品类型',
  `cpprice` double(10, 2) NOT NULL COMMENT '价格',
  PRIMARY KEY (`cpid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of cp_table
-- ----------------------------
INSERT INTO `cp_table` VALUES (1, '冰箱', '2019-01-24', '电器类', 2300.00);
INSERT INTO `cp_table` VALUES (2, '微波炉', '2020-07-03', '电器类', 800.00);
INSERT INTO `cp_table` VALUES (3, '电饭煲', '2020-04-01', '电器类', 500.00);
INSERT INTO `cp_table` VALUES (4, '热水壶', '2020-07-01', '电器类', 200.00);
INSERT INTO `cp_table` VALUES (5, '电烤箱', '2019-06-01', '电器类', 1200.00);
INSERT INTO `cp_table` VALUES (6, '空调', '2018-09-09', '电器类', 3200.00);
INSERT INTO `cp_table` VALUES (7, '空气净化器', '2020-11-05', '电器类', 600.00);
INSERT INTO `cp_table` VALUES (8, '电吹风', '2020-01-01', '电器类', 120.00);
INSERT INTO `cp_table` VALUES (9, '电熨斗', '2019-10-01', '电器类', 450.00);

-- ----------------------------
-- Table structure for fkxx_table
-- ----------------------------
DROP TABLE IF EXISTS `fkxx_table`;
CREATE TABLE `fkxx_table`  (
  `fkid` int(0) NOT NULL COMMENT '反馈编号',
  `fkname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '反馈人姓名',
  `fktime` date NOT NULL COMMENT '反馈时间',
  `fkcontent` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '反馈内容',
  `cpid` int(0) NOT NULL COMMENT '产品编号',
  `solve` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '解决情况',
  PRIMARY KEY (`fkid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of fkxx_table
-- ----------------------------
INSERT INTO `fkxx_table` VALUES (1, '施译霖', '2020-01-05', '冰箱不制冷', 1, '购买超过7天，但在保修期内，免费维修');
INSERT INTO `fkxx_table` VALUES (2, '韩辛杰', '2020-09-04', '微波炉不运作', 2, '购买未超过7天，无理由退换');
INSERT INTO `fkxx_table` VALUES (3, '经彦', '2020-12-29', '空气净化器运作不净化空气', 7, '购买超过7天，但在保修期内，免费维修');
INSERT INTO `fkxx_table` VALUES (4, '钱征炜', '2020-11-05', '热水壶无法正常工作', 4, '购买超过7天，但在保修期内，免费维修');
INSERT INTO `fkxx_table` VALUES (5, '明思哲', '2020-01-18', '电吹风只吹冷风', 8, '购买未超过7天，无理由退换');

-- ----------------------------
-- Table structure for kh_table
-- ----------------------------
DROP TABLE IF EXISTS `kh_table`;
CREATE TABLE `kh_table`  (
  `khid` int(0) NOT NULL COMMENT '客户编号',
  `kfname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '姓名',
  `khphone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '联系方式',
  `khadress` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系地址',
  `khcredit` int(0) NOT NULL COMMENT '信用度',
  `khproduct` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '所购产品',
  `khtime` date NOT NULL COMMENT '消费时间',
  `lxrid` int(0) NOT NULL COMMENT '联系人编号',
  PRIMARY KEY (`khid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of kh_table
-- ----------------------------
INSERT INTO `kh_table` VALUES (1, '施译霖', '15875766181', '江苏南通', 97, '冰箱', '2019-03-20', 1);
INSERT INTO `kh_table` VALUES (2, '郭浩然', '17602553197', '江苏南京', 99, '微波炉', '2020-08-09', 2);
INSERT INTO `kh_table` VALUES (3, '薛安楠', '15964920197', '江苏无锡', 96, '电饭煲', '2020-05-18', 3);
INSERT INTO `kh_table` VALUES (4, '钱征炜', '15864985011', '江苏无锡', 98, '热水壶', '2020-09-10', 4);
INSERT INTO `kh_table` VALUES (5, '徐天锡', '17631165499', '江苏镇江', 95, '电烤箱', '2019-07-17', 5);
INSERT INTO `kh_table` VALUES (6, '戎星磊', '13915964455', '江苏南京', 100, '冰箱', '2019-12-09', 6);
INSERT INTO `kh_table` VALUES (7, '李俊杰', '15987268984', '江苏南京', 98, '空调', '2019-07-21', 7);
INSERT INTO `kh_table` VALUES (8, '经彦', '17685589631', '江苏苏州', 96, '空气净化器', '2020-12-09', 8);
INSERT INTO `kh_table` VALUES (9, '明思哲', '17654011679', '江苏南通', 97, '电吹风', '2020-01-16', 9);
INSERT INTO `kh_table` VALUES (10, '吴智超', '13913565464', '江苏盐城', 99, '电熨斗', '2019-11-22', 10);
INSERT INTO `kh_table` VALUES (11, '韩辛杰', '15852523144', '江苏徐州', 100, '微波炉', '2020-09-01', 11);
INSERT INTO `kh_table` VALUES (12, '郑家辉', '17902546479', '江苏徐州', 97, '空调', '2019-08-29', 12);
INSERT INTO `kh_table` VALUES (13, '周义昊', '13915794631', '江苏南京', 95, '电烤箱', '2019-09-12', 13);
INSERT INTO `kh_table` VALUES (14, '汪明', '15998565985', '江苏南通', 98, '空气净化器', '2020-12-15', 14);
INSERT INTO `kh_table` VALUES (15, '盛明星', '17644984561', '江苏无锡', 97, '热水壶', '2020-10-02', 15);

-- ----------------------------
-- Table structure for lxr_table
-- ----------------------------
DROP TABLE IF EXISTS `lxr_table`;
CREATE TABLE `lxr_table`  (
  `lxrid` int(0) NOT NULL COMMENT '联系人编号',
  `lxrname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '姓名',
  `lxrdepartment` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '所属部门',
  `cptype` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '产品类型',
  `rwid` int(0) NOT NULL COMMENT '任务计划编号',
  `salary` double(20, 2) NOT NULL COMMENT '工资',
  PRIMARY KEY (`lxrid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of lxr_table
-- ----------------------------
INSERT INTO `lxr_table` VALUES (1, '小王', '销售部', '电器类', 1, 3000.00);
INSERT INTO `lxr_table` VALUES (2, '小张', '销售部', '电器类', 2, 3200.00);
INSERT INTO `lxr_table` VALUES (3, '小明', '售后部', '电器类', 3, 4000.00);
INSERT INTO `lxr_table` VALUES (4, '小红', '售后部', '电器类', 4, 4100.00);
INSERT INTO `lxr_table` VALUES (5, '小钱', '经理部', '电器类', 5, 6000.00);

-- ----------------------------
-- Table structure for manager_table
-- ----------------------------
DROP TABLE IF EXISTS `manager_table`;
CREATE TABLE `manager_table`  (
  `id` int(0) NOT NULL,
  `account` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `admin_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of manager_table
-- ----------------------------
INSERT INTO `manager_table` VALUES (1, 'admin', '41933e60e9c19b866b3d68864727afe7', 'ghr');

-- ----------------------------
-- Table structure for rwjh_table
-- ----------------------------
DROP TABLE IF EXISTS `rwjh_table`;
CREATE TABLE `rwjh_table`  (
  `rwid` int(0) NOT NULL COMMENT '任务计划编号',
  `lxrid` int(0) NOT NULL COMMENT '联系人编号',
  `khcount` int(0) NULL DEFAULT NULL COMMENT '客户数量',
  `rwprofits` int(0) NULL DEFAULT NULL COMMENT '计划利润',
  `rwtime` date NULL DEFAULT NULL COMMENT '计划时间',
  `rwsituation` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '实施情况',
  PRIMARY KEY (`rwid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of rwjh_table
-- ----------------------------
INSERT INTO `rwjh_table` VALUES (1, 1, 7, 856, '2020-12-09', '已完成');
INSERT INTO `rwjh_table` VALUES (2, 2, 8, 972, '2020-12-21', '已完成');
INSERT INTO `rwjh_table` VALUES (3, 3, 2, 120, '2020-12-18', '已完成');
INSERT INTO `rwjh_table` VALUES (4, 4, 3, 180, '2020-12-14', '已完成');
INSERT INTO `rwjh_table` VALUES (5, 5, 15, 1828, '2020-12-02', '已完成');

SET FOREIGN_KEY_CHECKS = 1;
