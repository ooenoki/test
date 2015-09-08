<html>
<head>
<title>カタログ詳細</title>
</head>
<body>
  <table border="1">
    <thead>
      <tr>
        <th>商品番号</th>
        <th>商品名</th>
        <th>価格</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>${f:h(id)}</td>
        <td>${f:h(name)}&nbsp;${f:h(detail)}</td>
        <td align="right"><fmt:formatNumber value="${price}" pattern="#,##0"/></td>
      </tr>
      <tr>
        <td colspan="3"><html:img page="${f:h(pictureurl)}" /></td>
      </tr>
    </tbody>
  </table>
</body>
</html>