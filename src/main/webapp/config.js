var _VER = (new Date()).getTime(),//开发环境
	//_ver = '1.0.0',

	_XHR = '/rest/',
	_PATH = ''; //图片

var errorTips = '哎哟，网络好像有点问题了..';

require.config({
	urlArgs: "v=" +  _VER,
    baseUrl : "/",
    paths: {
    	//必须插件
        jquery:'plugin/jquery/jquery-1.9.0.min',
        common: 'dist/js/common',
        artTemplate: 'plugin/template/artTemplate-3.0',
        jqueryWeUI: 'plugin/jqweui/js/jquery-weui.min',
        
        mdater: 'plugin/mdater/js/jquery.mdater.min',
        dateFormat: 'utils/date/dateFormat.min'
    },
    shim: {
    	common: ['css!dist/css/common'],
    	artTemplate: ['css!plugin/jqweui/css/weui-and-jqueryweui'],
    	jqueryWeUI: {
            deps: ['jquery'],
            exports: '$'
        },
        mdater: ['css!plugin/mdater/css/jquery.mdater.min']
    },
    waitSeconds: 15
});

