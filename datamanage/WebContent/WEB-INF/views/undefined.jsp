<%@page import="com.emg.datamanage.bean.TableEnum"%>
<%@page import="com.emg.datamanage.bean.OperateType"%>
<%@page import="com.emg.datamanage.bean.SQLOperationalCharacter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix='c' uri='http://java.sun.com/jstl/core_rt'%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
	String baseUrl = request.getScheme()+"://"+ request.getServerName()+":"+request.getServerPort()+"/datamanage/";
	String path = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<title>接口生成</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta name="robots" content="nofollow" />

<link href="resources/bootstrap-3.3.7/css/bootstrap.min.css"  rel="stylesheet" />
	
<script src="resources/jquery/jquery-3.2.1.min.js" ></script>
<script src="resources/js/jquery.formvalidate.js" ></script>

<script type="text/javascript">
	function typeChange(value) {
		switch(value){
		case "INSERT":
			$("#divSet").show();
			$("#divWhere").hide();
			break;
		case "COUNT":
		case "DELETE":
		case "SELECT":
			$("#divSet").hide();
			$("#divWhere").show();
			break;
		case "UPDATE":
			$("#divSet").show();
			$("#divWhere").show();
			break;
		default:
			break;
		}
	}
	function delResult(){
		$("#result").text("");
		$(".panel").removeClass("panel-default");
		$(".panel").removeClass("panel-success");
		$(".panel").removeClass("panel-warning");
		$(".panel").removeClass("panel-danger");
		
		$(".panel").addClass("panel-default");
	};
	
	function makeUrl(){
		delResult();
		var table = $("#table").val();
		var type = $("#type").val();
		var params = {};
       	params["set"] = funcSet();
       	params["where"] = funcWhere();
       	var url = "<%=baseUrl%>interface.web?" + "table=" + table + "&type=" + type + "&params=" + JSON.stringify(params);
       	$(".panel").addClass("panel-success");
		$("#result").text(url);
		return url;
	};
	
    function doPost() {
    	delResult();
    	var table = $("#table").val();
		var type = $("#type").val();
       	var params = {};
       	params["set"] = funcSet();
       	params["where"] = funcWhere();
       	
       	var url = "<%=path%>/interface.web";
       	
       	jQuery.post(url, {
       		"table": table,
			"type": type,
			"params": JSON.stringify(params)
		}, function(data){
			$(".panel").removeClass("panel-default");
			
			if(data.status){
				$(".panel").addClass("panel-success");
				$("#result").text(JSON.stringify(data));
			}else{
				$(".panel").addClass("panel-warning");
				$("#result").text(JSON.stringify(data));
			}
		}, "json");

	};
	
	function addSetLine(obj) {
		var tbody = $(obj).parents('table').children("tbody");
		var html = "<tr class='trSetParam'>" + $("#trSetModel").html() + "</tr>";
		tbody.append(html);
	}

	function addWhereLine(obj) {
		var tbody = $(obj).parents('table').children("tbody");
		var html = "<tr class='trWhereParam'>" + $("#trWhereModel").html() + "</tr>";
		tbody.append(html);
	};

	function delLine(obj) {
		var tr = $(obj).parents('tr');
		tr.remove();
	};
	
	function addWhere() {
		var divWheres = $("#wheres");
		var html = "<div class='clswhere'>" + $("#divWhereModel").html() + "</div>";
		divWheres.append(html);
	}
	
	function delOr(obj) {
		$(obj).parents('div .clswhere').remove();
	}
	
	function funcSet() {
		var set = new Array();
		var objLines = $("div#sets table tbody tr.trSetParam");
		$.each(objLines, function(j, objLine) {
			var colunmName = $(objLine).find("input.key").val();
			var optCharater = $(objLine).find("select.cha").val();
			var value = $(objLine).find("input.value").val();
			
			if(colunmName){
				var line = {"columnName": colunmName,"optCharater": optCharater,"value": value};
				set.push(line);
			}
		});
		return set;
	}
	
	function funcWhere() {
		var where = new Array();
		var objOrs = $("div .clswhere");
		$.each(objOrs, function(i, objOr) {
			var or = new Array();
			var objLines = $(objOr).find("tr.trWhereParam");
			$.each(objLines, function(j, objLine) {
				var colunmName = $(objLine).find("input.key").val();
				var optCharater = $(objLine).find("select.cha").val();
				var value = $(objLine).find("input.value").val();
				
				if(colunmName){				
					var line = {"columnName": colunmName,"optCharater": optCharater,"value": value};
					or.push(line);
				}
			});
			where.push(or);
		});
		return where;
	}

	$(document).ready(function() {
    });
</script>
</head>
<body style="background-size: inherit;">
	<div style="margin: 20px auto; position: relative; display: table; background-color: #fff; border-radius: 5px;">
		<div style="width: 680px;">
			<div style="padding: 20px;">
				<table class="table table-hover" id="tbBases">
					<tbody>
						<tr>
							<td><input type="text" class="form-control" value="TABLE" disabled></td>
							<td>
								<select class="form-control" id="table">
									<c:set var="tableenums" value="<%= TableEnum.values() %>"/>
									<c:forEach items="${tableenums }" var="tableenum">
										<option value="${tableenum.toString() }">${tableenum.toString() }</option>
									</c:forEach>
								</select>
							</td>
						</tr>
						<tr>
							<td><input type="text" class="form-control" value="TYPE" disabled></td>
							<td><select class="form-control" id="type" onchange="typeChange(this.options[this.options.selectedIndex].value);">
									<c:set var="opttypes" value="<%= OperateType.values() %>"/>
									<c:forEach items="${opttypes }" var="opttype">
										<option value="${opttype.toString() }">${opttype.toString() }</option>
									</c:forEach>
							</select></td>
						</tr>
					</tbody>
				</table>
				<div id="divSet">
					<h3>SET</h3>
					<div class="panel panel-default" id="sets">
						<table class="table table-hover set">
							<thead>
									<tr>
										<th>列</th>
										<th>运算符</th>
										<th>值</th>
										<th><button type="button" class="btn btn-default"
											onclick="addSetLine(this);">
											<span class="glyphicon glyphicon glyphicon-plus"></span>
										</button></th>
									</tr>
								</thead>
							<tbody>
								<tr class="trSetParam">
									<td><input type="text" class="form-control key"></td>
									<td>
										<select class="form-control cha" disabled>
											<option value="EQUALTO">等于</option>
										</select>
									</td>
									<td><input type="text" class="form-control value"></td>
									<td>
										<button type="button" class="btn btn-default"
											onclick="delLine(this);">
											<span class="glyphicon glyphicon-minus"></span>
										</button>
									</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
				<div id="divWhere" style="display: none;">
					<h3>WHERE
						<button type="button" class="btn btn-default" onclick="addWhere();" style="float: right; margin-right: 15px;">
							<span class="glyphicon glyphicon glyphicon-plus"></span>
						</button>
					</h3>
					<div id="wheres"></div>
				</div>

				<div class="panel panel-default" style="margin-top: 20px;">
					<div class="panel-heading">
						<h3 class="panel-title"><strong>请求结果</strong></h3>
					</div>
					<div class="panel-body" id="result" style="word-wrap:break-word;word-break:break-all;"></div>
				</div>
				
			</div>
		</div>
	</div>
	<div class="nav pinned" style="right: 15%; top: 100px; position: fixed;">
		<h4><strong>操作</strong></h4>
		<div class="btn-group btn-group-vertical">
			<button type="button" class="btn btn-default" onclick="delResult();">清空结果</button>
			<button type="button" class="btn btn-default" onclick="makeUrl();">生成URL</button>
			<button type="button" class="btn btn-default" onclick="doPost();">发送请求</button>
		</div>
	</div>
	<div style="display: none;">
		<div id="divWhereModel">
			<div class="panel panel-default">
				<div class="panel-heading">
					<div>OR
						<button type="button" class="btn btn-default" onclick="delOr(this);"  style="float: right;margin-top: -7px;">
							<span class="glyphicon glyphicon-minus"></span>
						</button>
					</div>
				</div>
				<table class="table table-hover or" style="display: block;margin: 0 10px;">
					<thead>
							<tr>
								<th>逻辑</th>
								<th>列</th>
								<th>运算符</th>
								<th>值</th>
								<th><button type="button" class="btn btn-default"
									onclick="addWhereLine(this);">
									<span class="glyphicon glyphicon glyphicon-plus"></span>
								</button></th>
							</tr>
						</thead>
					<tbody>
						<tr class="trWhereParam">
							<td><h5>AND</h5></td>
							<td><input type="text" class="form-control key"></td>
							<td>
								<select class="form-control cha">
									<c:set var="optchas" value="<%= SQLOperationalCharacter.values() %>"/>
									<c:forEach items="${optchas }" var="optcha">
										<option value="${optcha.toString() }">${optcha.getDescription() }</option>
									</c:forEach>
								</select>
							</td>
							<td><input type="text" class="form-control value"></td>
							<td>
								<button type="button" class="btn btn-default"
									onclick="delLine(this);">
									<span class="glyphicon glyphicon-minus"></span>
								</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
		<table>
			<tr id="trWhereModel">
				<td><h5>AND</h5></td>
				<td><input type="text" class="form-control key"></td>
				<td>
					<select class="form-control cha">
						<c:set var="optchas" value="<%= SQLOperationalCharacter.values() %>"/>
						<c:forEach items="${optchas }" var="optcha">
							<option value="${optcha.toString() }">${optcha.getDescription() }</option>
						</c:forEach>
					</select>
				</td>
				<td><input type="text" class="form-control value"></td>
				<td>
					<button type="button" class="btn btn-default"
						onclick="delLine(this);">
						<span class="glyphicon glyphicon-minus"></span>
					</button>
				</td>
			</tr>
			<tr id="trSetModel">
				<td><input type="text" class="form-control key"></td>
				<td>
					<select class="form-control cha" disabled>
						<option value="EQUALTO">等于</option>
					</select>
				</td>
				<td><input type="text" class="form-control value"></td>
				<td>
					<button type="button" class="btn btn-default"
						onclick="delLine(this);">
						<span class="glyphicon glyphicon-minus"></span>
					</button>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>
