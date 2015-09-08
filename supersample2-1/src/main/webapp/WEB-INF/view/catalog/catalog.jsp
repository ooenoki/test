<html>
<head>
<title>カタログ</title>
</head>
<body>
詳細を見たい商品の商品番号をクリックして下さい。
  <table border="1">
    <thead>
      <tr>
        <th>商品番号</th>
        <th>商品名</th>
        <th>価格</th>
      </tr>
    </thead>
    <tbody>
      <%-- 1) begin, end属性によるページ制御 offsetから5件を表示 --%>
      <c:forEach var="catalog" begin="${offset}" end="${offset + 4}" items="${catalogList.catalogDtos}">
      <tr>
        <td><s:link href="/catalogDetail/show/${f:u(catalog.id)}">${f:u(catalog.id)}</s:link></td>
        <td>${f:h(catalog.name)}</td>
        <td align="right"><fmt:formatNumber value="${catalog.price}" pattern="#,##0"/></td>
      </tr>
      </c:forEach>
    </tbody>
  </table>

  <s:form>
    <%-- 2) prevボタンの表示制御 --%>
    <c:if test="${offset>0}" >
      <input type="submit" name="prev" value="prev" />
    </c:if>
    <%-- 3) nextボタンの表示制御 --%>
    <c:if test="${fn:length(catalogList.catalogDtos)-5 > offset}" >
      <input type="submit" name="next" value="next" />
    </c:if>
  </s:form>
</body>
</html>