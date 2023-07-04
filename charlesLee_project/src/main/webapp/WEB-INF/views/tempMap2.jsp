<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>�ּҷ� ��� ǥ���ϱ�</title>
    <link rel="stylesheet" href="css/map.css" type="text/css">
</head>
<body>
<p style="margin-top:-12px">
    <em class="link">
        <a href="javascript:void(0);" onclick="window.open('http://fiy.daum.net/fiy/map/CsGeneral.daum', '_blank', 'width=981, height=650')">
            Ȥ�� �ּ� ����� �߸� ������ ��쿡�� ���⿡ �������ּ���.
        </a>
    </em>
</p>
<div id="map" style="width:100%;height:350px;"></div>

<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=690096255b88e30ead8c02ac790dd149&libraries=services"></script>
<script>
	var mapContainer = document.getElementById('map'), // ������ ǥ���� div 
	    mapOption = {
	        center: new kakao.maps.LatLng(33.450701, 126.570667), // ������ �߽���ǥ
	        level: 3 // ������ Ȯ�� ����
	    };  

	// ������ �����մϴ�    
	var map = new kakao.maps.Map(mapContainer, mapOption); 
	
	// �ּ�-��ǥ ��ȯ ��ü�� �����մϴ�
	var geocoder = new kakao.maps.services.Geocoder();
	
	// �ּ� ����
	var address = '�λ� ������ ���� ������';
	
	
	// �ּҷ� ��ǥ�� �˻��մϴ�
	// result ���� �迭�� ������ ��
	geocoder.addressSearch(address, function(result, status) {

    // ���������� �˻��� �Ϸ������ 
     if (status === kakao.maps.services.Status.OK) {

        var coords = new kakao.maps.LatLng(result[0].y, result[0].x);
        
        
        // ��������� ���� ��ġ�� ��Ŀ�� ǥ���մϴ�
        var marker = new kakao.maps.Marker({
            map: map,
            position: coords
        });



        // ������ �߽��� ��������� ���� ��ġ�� �̵���ŵ�ϴ�
        map.setCenter(coords);

    } 
   	
    
     var content = '<div class="wrap">' + 
     '    <div class="info">' + 
     '        <div class="title">' + 
     '            īī�� �����̽����' + 
     '            <div class="close" onclick="closeOverlay()" title="�ݱ�"></div>' + 
     '        </div>' + 
     '        <div class="body">' + 
     '            <div class="img">' +
     '                <img src="img/logo.png" width="73" height="70">' +
     '           </div>' + 
     '            <div class="desc">' + 
     '                <div class="ellipsis">'+ address +'</div>' + 
     '                <div class="jibun ellipsis"> 7/3 ~ 7/16 </div>' + 
     '                <div><a href="https://www.kakaocorp.com/main" target="_blank" class="link">Ȩ������</a></div>' + 
     '            </div>' + 
     '        </div>' + 
     '    </div>' +    
     '</div>';
 	
 	
  	var overlay = new kakao.maps.CustomOverlay({
 	    content: content,
 	    map: map,
 	    position: marker.getPosition()       
 	});
 	
 	
    
	});
	
	kakao.maps.event.addListener(marker, 'click', function() {
 	    overlay.setMap(map);
 	}); 
	 	
 	function closeOverlay() {
 	    overlay.setMap(null);     
 	};

	
	
	
</script>
</body>
</html>