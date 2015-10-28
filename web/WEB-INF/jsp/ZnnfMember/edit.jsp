<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta charset="utf-8" />
<title>Form Elements - Ace Admin</title>

<meta name="description" content="Common form elements and layouts" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

<!-- bootstrap & fontawesome -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/assets/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/assets/css/font-awesome.min.css" />

<!-- page specific plugin styles -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/assets/css/jquery-ui.custom.min.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/assets/css/chosen.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/assets/css/datepicker.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/assets/css/bootstrap-timepicker.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/assets/css/daterangepicker.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/assets/css/bootstrap-datetimepicker.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/assets/css/colorpicker.css" />

<!-- text fonts -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/assets/css/ace-fonts.css" />

<!-- ace styles -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/assets/css/ace.min.css"
	id="main-ace-style" />

<!--[if lte IE 9]>
			<link rel="stylesheet" href="<%=request.getContextPath()%>/ace/assets/css/ace-part2.min.css" />
		<![endif]-->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/assets/css/ace-skins.min.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/assets/css/ace-rtl.min.css" />

<!--[if lte IE 9]>
		  <link rel="stylesheet" href="<%=request.getContextPath()%>/ace/assets/css/ace-ie.min.css" />
		<![endif]-->

<!-- inline styles related to this page -->

<!-- ace settings handler -->
<script
	src="<%=request.getContextPath()%>/ace/assets/js/ace-extra.min.js"></script>

<!-- HTML5shiv and Respond.js for IE8 to support HTML5 elements and media queries -->

<!--[if lte IE 8]>
		<script src="<%=request.getContextPath()%>/ace/assets/js/html5shiv.min.js"></script>
		<script src="<%=request.getContextPath()%>/ace/assets/js/respond.min.js"></script>
		<![endif]-->
</head>

<body class="no-skin">
	<div class="breadcrumbs" id="breadcrumbs">

		<ul class="breadcrumb">
			<li><i class="ace-icon fa fa-home home-icon"></i> <a href="#">Home</a>
			</li>

			<li><a href="#">Tables</a></li>
			<li class="active">Simple &amp; Dynamic</li>
		</ul>
		<!-- /.breadcrumb -->

	</div>

	<!-- /section:basics/content.breadcrumbs -->
	<div class="page-content">
		<!-- /section:settings.box -->
		<div class="page-content-area">
			<div class="page-header">
				<h1>
					Form Elements 
				</h1>
			</div>
			<!-- /.page-header -->

			<div class="row">
				<div class="col-xs-12">
					<!-- PAGE CONTENT BEGINS -->
					<form id="drizzt-table" class="form-horizontal"
						action="<%=request.getContextPath()%>/znnfMember/edit.do"
						method="post">
						<!-- #section:elements.form -->
								<input type="hidden" id="form-field-1" name="id" value="${znnfMember.id}"
									class="col-xs-10 col-sm-5" />
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-1"> member_name </label>
		
									<div class="col-sm-9">
										<input type="text" id="form-field-1" placeholder="member_name"
											name="member_name" value="${znnfMember.member_name}"
											class="col-xs-10 col-sm-5" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-1"> member_number </label>
		
									<div class="col-sm-9">
										<input type="text" id="form-field-1" placeholder="member_number"
											name="member_number" value="${znnfMember.member_number}"
											class="col-xs-10 col-sm-5" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-1"> member_type </label>
		
									<div class="col-sm-9">
										<input type="text" id="form-field-1" placeholder="member_type"
											name="member_type" value="${znnfMember.member_type}"
											class="col-xs-10 col-sm-5" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-1"> member_id_type </label>
		
									<div class="col-sm-9">
										<input type="text" id="form-field-1" placeholder="member_id_type"
											name="member_id_type" value="${znnfMember.member_id_type}"
											class="col-xs-10 col-sm-5" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-1"> member_id_number </label>
		
									<div class="col-sm-9">
										<input type="text" id="form-field-1" placeholder="member_id_number"
											name="member_id_number" value="${znnfMember.member_id_number}"
											class="col-xs-10 col-sm-5" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-1"> member_phone </label>
		
									<div class="col-sm-9">
										<input type="text" id="form-field-1" placeholder="member_phone"
											name="member_phone" value="${znnfMember.member_phone}"
											class="col-xs-10 col-sm-5" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-1"> member_status </label>
		
									<div class="col-sm-9">
										<input type="text" id="form-field-1" placeholder="member_status"
											name="member_status" value="${znnfMember.member_status}"
											class="col-xs-10 col-sm-5" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-1"> member_id_photo </label>
		
									<div class="col-sm-9">
										<input type="text" id="form-field-1" placeholder="member_id_photo"
											name="member_id_photo" value="${znnfMember.member_id_photo}"
											class="col-xs-10 col-sm-5" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-1"> member_landline_number </label>
		
									<div class="col-sm-9">
										<input type="text" id="form-field-1" placeholder="member_landline_number"
											name="member_landline_number" value="${znnfMember.member_landline_number}"
											class="col-xs-10 col-sm-5" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-1"> member_address </label>
		
									<div class="col-sm-9">
										<input type="text" id="form-field-1" placeholder="member_address"
											name="member_address" value="${znnfMember.member_address}"
											class="col-xs-10 col-sm-5" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-1"> member_zipcode </label>
		
									<div class="col-sm-9">
										<input type="text" id="form-field-1" placeholder="member_zipcode"
											name="member_zipcode" value="${znnfMember.member_zipcode}"
											class="col-xs-10 col-sm-5" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-1"> member_email </label>
		
									<div class="col-sm-9">
										<input type="text" id="form-field-1" placeholder="member_email"
											name="member_email" value="${znnfMember.member_email}"
											class="col-xs-10 col-sm-5" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-1"> member_recommended </label>
		
									<div class="col-sm-9">
										<input type="text" id="form-field-1" placeholder="member_recommended"
											name="member_recommended" value="${znnfMember.member_recommended}"
											class="col-xs-10 col-sm-5" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-1"> member_bank </label>
		
									<div class="col-sm-9">
										<input type="text" id="form-field-1" placeholder="member_bank"
											name="member_bank" value="${znnfMember.member_bank}"
											class="col-xs-10 col-sm-5" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-1"> member_bank_card_number </label>
		
									<div class="col-sm-9">
										<input type="text" id="form-field-1" placeholder="member_bank_card_number"
											name="member_bank_card_number" value="${znnfMember.member_bank_card_number}"
											class="col-xs-10 col-sm-5" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-1"> menber_crop_name </label>
		
									<div class="col-sm-9">
										<input type="text" id="form-field-1" placeholder="menber_crop_name"
											name="menber_crop_name" value="${znnfMember.menber_crop_name}"
											class="col-xs-10 col-sm-5" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-1"> member_acreage </label>
		
									<div class="col-sm-9">
										<input type="text" id="form-field-1" placeholder="member_acreage"
											name="member_acreage" value="${znnfMember.member_acreage}"
											class="col-xs-10 col-sm-5" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-1"> member_cultivate_position </label>
		
									<div class="col-sm-9">
										<input type="text" id="form-field-1" placeholder="member_cultivate_position"
											name="member_cultivate_position" value="${znnfMember.member_cultivate_position}"
											class="col-xs-10 col-sm-5" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-1"> member_soil_fertility </label>
		
									<div class="col-sm-9">
										<input type="text" id="form-field-1" placeholder="member_soil_fertility"
											name="member_soil_fertility" value="${znnfMember.member_soil_fertility}"
											class="col-xs-10 col-sm-5" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-1"> member_crop_historical_production </label>
		
									<div class="col-sm-9">
										<input type="text" id="form-field-1" placeholder="member_crop_historical_production"
											name="member_crop_historical_production" value="${znnfMember.member_crop_historical_production}"
											class="col-xs-10 col-sm-5" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-1"> member_fertilizer_costs </label>
		
									<div class="col-sm-9">
										<input type="text" id="form-field-1" placeholder="member_fertilizer_costs"
											name="member_fertilizer_costs" value="${znnfMember.member_fertilizer_costs}"
											class="col-xs-10 col-sm-5" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-1"> member_comprehensive_cost </label>
		
									<div class="col-sm-9">
										<input type="text" id="form-field-1" placeholder="member_comprehensive_cost"
											name="member_comprehensive_cost" value="${znnfMember.member_comprehensive_cost}"
											class="col-xs-10 col-sm-5" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-1"> member_remark </label>
		
									<div class="col-sm-9">
										<input type="text" id="form-field-1" placeholder="member_remark"
											name="member_remark" value="${znnfMember.member_remark}"
											class="col-xs-10 col-sm-5" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-1"> member_update_name </label>
		
									<div class="col-sm-9">
										<input type="text" id="form-field-1" placeholder="member_update_name"
											name="member_update_name" value="${znnfMember.member_update_name}"
											class="col-xs-10 col-sm-5" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-1"> commissioner_id </label>
		
									<div class="col-sm-9">
										<input type="text" id="form-field-1" placeholder="commissioner_id"
											name="commissioner_id" value="${znnfMember.commissioner_id}"
											class="col-xs-10 col-sm-5" />
									</div>
								</div>
						<div class="clearfix form-actions">
							<div class="col-md-offset-3 col-md-9">
								<input type="submit" class="btn btn-info" value="提交" />

								&nbsp; &nbsp; &nbsp;
								<input type="button" class="btn btn-info" type="button" onclick="location.href='<%=request.getContextPath()%>/znnfMember/list.do'" value="返回" />
							</div>
						</div>
					</form>

					<!-- PAGE CONTENT ENDS -->
				</div>
				<!-- /.col -->
			</div>
			<!-- /.row -->
		</div>
		<!-- /.page-content-area -->
	</div>
	<!-- /.page-content -->
</body>

<!-- basic scripts -->

<!--[if !IE]> -->
<script type="text/javascript">
	window.jQuery
			|| document
					.write("<script src='<%=request.getContextPath()%>/ace/assets/js/jquery.min.js'>"
							+ "<"+"/script>");
</script>

<!-- <![endif]-->

<!--[if IE]>
<script type="text/javascript">
 window.jQuery || document.write("<script src='<%=request.getContextPath()%>/ace/assets/js/jquery1x.min.js'>"+"<"+"/script>");
</script>
<![endif]-->
<script type="text/javascript">
	if ('ontouchstart' in document.documentElement)
		document.write("<script src='<%=request.getContextPath()%>/ace/assets/js/jquery.mobile.custom.min.js'>"+ "<"+"/script>");
</script>

<script
	src="<%=request.getContextPath()%>/ace/assets/js/bootstrap.min.js"></script>

<!-- the following scripts are used in demo only for onpage help and you don't need them -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/assets/css/ace.onpage-help.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/docs/assets/js/themes/sunburst.css" />

</html>
