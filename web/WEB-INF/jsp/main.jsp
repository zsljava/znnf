<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns:wb="http://open.weibo.com/wb">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta charset="utf-8" />
<title>CIA验证平台</title>

<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

<!-- bootstrap & fontawesome -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/assets/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/assets/css/font-awesome.min.css" />

<!-- page specific plugin styles -->

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

<!-- weibo -->
<script src="http://tjs.sjs.sinajs.cn/open/api/js/wb.js"
	type="text/javascript" charset="utf-8"></script>

<!-- HTML5shiv and Respond.js for IE8 to support HTML5 elements and media queries -->

<!--[if lte IE 8]>
		<script src="<%=request.getContextPath()%>/ace/assets/js/html5shiv.min.js"></script>
		<script src="<%=request.getContextPath()%>/ace/assets/js/respond.min.js"></script>
		<![endif]-->

</head>

<body class="no-skin">
	<!-- #section:basics/navbar.layout -->
	<div id="navbar" class="navbar navbar-default">
		<script type="text/javascript">
			try {
				ace.settings.check('navbar', 'fixed')
			} catch (e) {
			}
		</script>

		<div class="navbar-container" id="navbar-container">
			<!-- #section:basics/sidebar.mobile.toggle -->
			<button type="button" class="navbar-toggle menu-toggler pull-left"
				id="menu-toggler">
				<span class="sr-only">Toggle sidebar</span> <span class="icon-bar"></span>

				<span class="icon-bar"></span> <span class="icon-bar"></span>
			</button>

			<!-- /section:basics/sidebar.mobile.toggle -->
			<div class="navbar-header pull-left">
				<!-- #section:basics/navbar.layout.brand -->
				<a href="http://www.ciaapp.cn/" class="navbar-brand"> <small>
						开发者平台
				</small>
				</a>

				<!-- /section:basics/navbar.layout.brand -->

				<!-- #section:basics/navbar.toggle -->

				<!-- /section:basics/navbar.toggle -->
			</div>

			<!-- #section:basics/navbar.dropdown -->
			<div class="navbar-buttons navbar-header pull-right"
				role="navigation">
				<ul class="nav ace-nav">
					<!-- #section:basics/navbar.user_menu -->
					<li class="light-blue"><a data-toggle="dropdown" href="#"
						class="dropdown-toggle"> <!-- 
					<img class="nav-user-photo"
							src="<%=request.getContextPath()%>/ace/assets/avatars/user.jpg" alt="Jason's Photo" />
					
							<span class="user-info"> <small>欢迎,</small> 
							--> ${loginUser.name } <i class="ace-icon fa fa-caret-down"></i>
					</a>

						<ul
							class="user-menu dropdown-menu-right dropdown-menu dropdown-yellow dropdown-caret dropdown-closer">
							<!--  
							<li><a href="#"> <i class="ace-icon fa fa-cog"></i>
									Settings
							</a></li>

							<li class="divider"></li>
							-->
							<li><a href="<%=request.getContextPath()%>/outSystem.do">
									<i class="ace-icon fa fa-power-off"></i> 退出
							</a></li>
						</ul></li>

					<!-- /section:basics/navbar.user_menu -->
				</ul>
			</div>

			<!-- /section:basics/navbar.dropdown -->
		</div>
		<!-- /.navbar-container -->
	</div>

	<!-- /section:basics/navbar.layout -->
	<div class="main-container" id="main-container">
		<!-- #section:basics/sidebar -->
		<div id="sidebar" class="sidebar                  responsive">
			<script type="text/javascript">
				try {
					ace.settings.check('sidebar', 'fixed')
				} catch (e) {
				}
			</script>

			<!-- /.sidebar-shortcuts -->
			<ul class="nav nav-list">
				<li class=""><a
					href="<%=request.getContextPath()%>/znnfMember/list.do" target="iframe">
						<i class="menu-icon fa fa-tachometer"></i>
						<span class="menu-text">ZnnfMember</span>
				</a> <b class="arrow"></b></li>
				
				<li class=""><a
					href="<%=request.getContextPath()%>/znnfWebsiteTitle\/list.do" target="iframe">
						<i class="menu-icon fa fa-tachometer"></i><span class="menu-text">
							ZnnfWebsiteTitle</span>
				</a> <b class="arrow"></b></li>
				
				<li class=""><a
					href="<%=request.getContextPath()%>/znnfWebsiteContent/list.do" target="iframe">
						<i class="menu-icon fa fa-tachometer"></i><span class="menu-text">
							ZnnfWebsiteContent</span>
				</a> <b class="arrow"></b></li>
				
				<li class=""><a
					href="<%=request.getContextPath()%>/znnfLogin/list.do" target="iframe">
						<i class="menu-icon fa fa-tachometer"></i><span class="menu-text">
							ZnnfLogin</span>
				</a> <b class="arrow"></b></li>
				
			</ul>
			<!-- /.nav-list -->
			<!-- #section:basics/sidebar.layout.minimize -->
			<div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
				<i class="ace-icon fa fa-angle-double-left"
					data-icon1="ace-icon fa fa-angle-double-left"
					data-icon2="ace-icon fa fa-angle-double-right"></i>
			</div>

			<!-- /section:basics/sidebar.layout.minimize -->
			<script type="text/javascript">
				try {
					ace.settings.check('sidebar', 'collapsed')
				} catch (e) {
				}
			</script>
		</div>

		<!-- /section:basics/sidebar -->
		<div class="main-content">
			<div class="page-content"
				style="margin: 1px; padding: 0px; height: 650px;">
				<iframe id="iframe" name="iframe" frameborder="0" scrolling="yes"
					src="<%=request.getContextPath()%>/znnfMember/list.do"
					width="100%" height="100%"></iframe>
			</div>
			<!-- /.page-content -->
		</div>
		<!-- /.main-content -->
	</div>
	<!-- /.main-container -->

	<div class="footer">
		<div class="footer-inner">
			<!-- #section:basics/footer -->
			<div class="footer-content">
				<span class="bigger-120"> 北京 <span class="blue bolder">znfs</span>
					有限公司 &copy; 2015-2020
				</span> &nbsp; &nbsp; <span class="action-buttons"> <a href="#">
						<!--  
						<i class="ace-icon fa fa-twitter-square light-blue bigger-150"></i>
						--> <!--  
						<wb:follow-button uid="2272618631" type="red_1" width="24" height="20" ></wb:follow-button>
						--> 
				</a> <!--  
				<a href="#"> <i
						class="ace-icon fa fa-facebook-square text-primary bigger-150"></i>
				</a> <a href="#"> <i
						class="ace-icon fa fa-rss-square orange bigger-150"></i>
				</a>
				-->
				</span>
			</div>

			<!-- /section:basics/footer -->
		</div>
	</div>
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
		document
				.write("<script src='<%=request.getContextPath()%>/ace/assets/js/jquery.mobile.custom.min.js'>"
						+ "<"+"/script>");
</script>
<script
	src="<%=request.getContextPath()%>/ace/assets/js/bootstrap.min.js"></script>

<!-- page specific plugin scripts -->

<!-- ace scripts -->
<script
	src="<%=request.getContextPath()%>/ace/assets/js/ace-elements.min.js"></script>
<script src="<%=request.getContextPath()%>/ace/assets/js/ace.min.js"></script>

<!-- inline scripts related to this page -->

<!-- the following scripts are used in demo only for onpage help and you don't need them -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/assets/css/ace.onpage-help.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/docs/assets/js/themes/sunburst.css" />

<script
	src="<%=request.getContextPath()%>/ace/assets/js/ace/elements.onpage-help.js"></script>
<script
	src="<%=request.getContextPath()%>/ace/assets/js/ace/ace.onpage-help.js"></script>
<script
	src="<%=request.getContextPath()%>/ace/docs/assets/js/rainbow.js"></script>
<script
	src="<%=request.getContextPath()%>/ace/docs/assets/js/language/generic.js"></script>
<%-- <script
	src="<%=request.getContextPath()%>/ace/docs/assets/js/language/html.js"></script> --%>
<script
	src="<%=request.getContextPath()%>/ace/docs/assets/js/language/css.js"></script>
<script
	src="<%=request.getContextPath()%>/ace/docs/assets/js/language/javascript.js"></script>
<script type="text/javascript">
	function toPage(obj){
		window.location.href="<%=request.getContextPath()%>/"+obj;
	}
	function message(){
		$("span[name='messageCount']").text('0');
		document.getElementById("iframe").src='<%=request.getContextPath()%>/ciaSuggest/list.do';
	}
	$(function () { $("[data-toggle='tooltip']").tooltip(); });
	
</script>
<script type="text/javascript">
	$(function(){
		if(${loginUser.webType==2}){
			$("#sidebar-shortcuts").hide();
		}
	});
</script> 
</html>
