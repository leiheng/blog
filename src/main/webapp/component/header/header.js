;
(function (win, undefined) {
	'use strict';
	
	var dateFormat = require('dateFormat'),
		header = {
	        init: function(){
	            var self = header;
	            	header.renderHtml();
	            	header.renderComponent();
	            	header.watch();
	        },
	        
	        //全局属性
	        options: {
	        	
	        },
	        
	        data: {
	            navBtn:[
	                  	{
	                		name: '实时监测',
	                		href: '/index/detect',
	                        isCheck: true
	                  	},
	                  	{
	                		name: '健康诊断',
	                		href: '/index/health',
	                        isCheck: false
	                  	}
	                ],
	            title: '机组状态监测系统',
	            time: dateFormat(new Date(),'dateTime'),
	            user: {
	                name: '何立军'
	            }
	        },
	        
	        //渲染html
	        renderHtml: function(){
	        	//时间++
	        	setInterval(function(){
	        		$('#currentTime h4').text(dateFormat(new Date(),'dateTime'))
	        	}, 1000)
	        },
	        
	        //渲染组件
	        renderComponent: function(){
	        	
	        },

	       	//事件监听
	        watch: function(){
	            var self = header;
	            
	            var $body = $('body');
	            $body.on();
	        }
	    }
		header.init();
		
	win.headerData = header.data;
})(window);