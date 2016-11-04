;
(function (win, undefined) {
	'use strict';
	
	var common = {
			init: function(){
				common.initTemplateHelper();
				common.renderHtml();
				common.watch();
			},

			/**
		     * 获取URL参数
		     * @param name url参数名
		     * @returns
		     */
		    getUrlParameter:function(name) {
		        var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
		        var r = window.location.search.substr(1).match(reg);
		        if (r != null) return decodeURI(r[2]) || '';
		    },
		    
		    /**
		     * 加载js
		     * @param src
		     * @param ver
		     */
		    loadJs: function(src,ver){
		    	var script = document.createElement("script"),
			    	head = document.head || document.getElementsByTagName('head')[0];
	
			    script.type = "text/javascript";
			    
			    var path = src;
			    
			    ver && path + 'ver=' + ver;
			    script.src = path;
	
			    head.appendChild(script);
		    },
			
			//初始化模板函数
			initTemplateHelper: function(){
				require(['artTemplate'],function(template){
					//图片路径
					template.helper('$picPath', function (img) {
	                    if(img.indexOf('http://wx') >= 0 ){
	                    	return img;//容错处理
	                    }else{
	                    	return PC_PIC_PATH + img;
	                    }
					})
				})
			},
		    
		    //渲染html
            renderHtml: function(){
            
            },
            
            //渲染组件
            renderComponent: function(){
            	
            },

           	//事件监听
            watch: function(){
                var self = common;
            }
		    	
    	};
	common.init();

	win.common = common;
})(window);