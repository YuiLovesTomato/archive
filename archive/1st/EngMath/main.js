var http = require('http');
var fs = require('fs');
var url = require('url');

function templateList(filelist) {
    var list = '<ul>';
    for (i=0; i<filelist.length; i++) {
        list+=`<li><a href='/?id=${filelist[i]}'>${filelist[i]}</a></li>`;
    }
    list += '</ul>';

    return list;
}

function templateHTML(title, description, list, body) {
    return template = `
            <!doctype html>
            <html>
            <head>
              <title>WEB1 - ${title}</title>
              <meta charset="utf-8">
            </head>
            <body>
              <h1><a href="/">WEB</a></h1>
              ${list}
              ${body}
            </body>
            </html>
                `;
}

var app = http.createServer(function(request,response){
    var _url = request.url;
    var queryData = url.parse(_url, true).query;
    var title = queryData.id;
    if(_url == '/'){
        _url = '/index.html';
        title = "Welcome";
    }
    if(_url == '/favicon.ico'){
        response.writeHead(404);
        response.end();
        return;
    }
    response.writeHead(200);
    fs.readFile(`data/${queryData.id}`, 'utf8', function(err, data) {
        fs.readdir(`./data`, function(err, filelist) {
            var description = data;
            if (title == "Welcome") {
                description = "hellooo";
            }
            var list = templateList(filelist);
            var body = `
            <h2>${title}</h2>${description}
            `;

            template = templateHTML(title, description, list, body);

            response.end(template);

        })

    })

});
app.listen(3000);