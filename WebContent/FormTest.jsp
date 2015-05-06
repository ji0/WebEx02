<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action = "/WebEx02/param" method = "post">


ID : <input type = text name = 'id' /> <br>
비밀번호 : <input type = password name = 'pwd' /><br><br>

당신의 성별을 골라주세요. <br>
<input type = radio name = 'gender'  value = '남자' /> 남자<br>
<input type = radio name = 'gender'  value = '여자' /> 여자<br><br>

좋아하는 취미를 골라주세요. <br>
<input type = "checkbox" name = 'hobby' value = '조깅' /> 조깅 
<input type = "checkbox" name = 'hobby' value = '수영' /> 수영 
<input type = "checkbox" name = 'hobby' value = '농구' /> 농구 
<input type = "checkbox" name = 'hobby' value = '프랑스자수' /> 프랑스자수 
<input type = "checkbox" name = 'hobby' value = '우클렐레' /> 우클렐레
<input type = "checkbox" name = 'hobby' value = '피아노연주' /> 피아노연주 
<br><br>

나이를 골라주세요.<br>
<select id = 'age' name = 'age' size = '1'>
<option value =""> 선택하세요</option>
<option value ="10대"> 10대 </option>
<option value ="20대"> 20대 </option>
<option value ="30대"> 30대 </option>
<option value ="40대"> 40대 </option>
<option value ="50대"> 50대 </option>
<option value ="60대"> 60대 </option>
<option value ="70대"> 70대 </option>
</select>
<br><br>

좋아하는 음료를 최대 3개까지 골라주세요.<br>
<select id = 'drink' name = 'drink' size = '3' multiple = "multiple">
<option value =""> 선택하세요</option>
<option value ="오렌지쥬스"> 오렌지쥬스 </option>
<option value ="레몬에이드"> 레몬에이드 </option>
<option value ="한약보다 쓴 에스프레소"> 한약보다 쓴 에스프레소 </option>
<option value ="카라멜마끼야또"> 카라멜마끼야또 </option>
<option value ="계란 동동 띄운 쌍화차"> 계란 동동 띄운 쌍화차 </option>
<option value ="다이어트 콜라"> 다이어트 콜라 </option>
<option value ="소맥"> 소맥 </option>
</select>
<br><br>

하고싶은 말을 남겨주세요. <br>
<textarea id = 'content' name = 'content' row = '3' cols = '35'> </textarea>
<br>
<input type = 'submit' value = "전송" />
</form>




</body>
</html>