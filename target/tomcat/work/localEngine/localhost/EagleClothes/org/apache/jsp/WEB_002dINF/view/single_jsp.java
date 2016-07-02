package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class single_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>");
      if (_jspx_meth_spring_005fmessage_005f0(_jspx_page_context))
        return;
      out.write('|');
      if (_jspx_meth_spring_005fmessage_005f1(_jspx_page_context))
        return;
      out.write("</title>\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("<!--webfont-->\r\n");
      out.write("<link\r\n");
      out.write("\thref='http://fonts.googleapis.com/css?family=Yanone+Kaffeesatz:400,200,300,700'\r\n");
      out.write("\trel='stylesheet' type='text/css'>\r\n");
      out.write("<link\r\n");
      out.write("\thref='http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900,200italic,300italic,400italic,600italic,700italic,900italic'\r\n");
      out.write("\trel='stylesheet' type='text/css'>\r\n");
      out.write("<link\r\n");
      out.write("\thref='http://fonts.googleapis.com/css?family=Karla:400,400italic,700,700italic'\r\n");
      out.write("\trel='stylesheet' type='text/css'>\r\n");
      out.write("<!--webfont-->\r\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/etalage.css\">\r\n");
      out.write("<script src=\"js/jquery.etalage.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\tjQuery(document)\r\n");
      out.write("\t\t\t.ready(\r\n");
      out.write("\t\t\t\t\tfunction($) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t$('#etalage')\r\n");
      out.write("\t\t\t\t\t\t\t\t.etalage(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tthumb_image_width : 300,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tthumb_image_height : 400,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tsource_image_width : 800,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tsource_image_height : 1000,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tshow_hint : true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclick_callback : function(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\timage_anchor, instance_id) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\talert('Callback example:\\nYou clicked on an image with the anchor: \"'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ image_anchor\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ '\"\\n(in Etalage instance: \"'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ instance_id + '\")');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("</script>\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\"\r\n");
      out.write("\thref=\"css/easy-responsive-tabs.css\" />\r\n");
      out.write("<script src=\"js/easyResponsiveTabs.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$('#horizontalTab').easyResponsiveTabs({\r\n");
      out.write("\t\t\ttype : 'default', //Types: default, vertical, accordion           \r\n");
      out.write("\t\t\twidth : 'auto', //auto or any width like 600px\r\n");
      out.write("\t\t\tfit : true, // 100% fit in a container\r\n");
      out.write("\t\t\tclosed : 'accordion', // Start closed if in accordion view\r\n");
      out.write("\t\t\tactivate : function(event) { // Callback function if tab is switched\r\n");
      out.write("\t\t\t\tvar $tab = $(this);\r\n");
      out.write("\t\t\t\tvar $info = $('#tabInfo');\r\n");
      out.write("\t\t\t\tvar $name = $('span', $info);\r\n");
      out.write("\t\t\t\t$name.text($tab.text());\r\n");
      out.write("\t\t\t\t$info.show();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$('#verticalTab').easyResponsiveTabs({\r\n");
      out.write("\t\t\ttype : 'vertical',\r\n");
      out.write("\t\t\twidth : 'auto',\r\n");
      out.write("\t\t\tfit : true\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/easing.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tjQuery(document).ready(function($) {\r\n");
      out.write("\t\t$(\".scroll\").click(function(event) {\r\n");
      out.write("\t\t\tevent.preventDefault();\r\n");
      out.write("\t\t\t$('html,body').animate({\r\n");
      out.write("\t\t\t\tscrollTop : $(this.hash).offset().top\r\n");
      out.write("\t\t\t}, 1200);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<!--- start-rate---->\r\n");
      out.write("<script src=\"js/jstarbox.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/jstarbox.css\" type=\"text/css\"\r\n");
      out.write("\tmedia=\"screen\" />\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tjQuery(function() {\r\n");
      out.write("\t\tjQuery('.starbox')\r\n");
      out.write("\t\t\t\t.each(\r\n");
      out.write("\t\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\t\tvar starbox = jQuery(this);\r\n");
      out.write("\t\t\t\t\t\t\tstarbox\r\n");
      out.write("\t\t\t\t\t\t\t\t\t.starbox(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t// \t\t\t\t\taverage: starbox.attr('data-start-value'),\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\taverage : 0.6,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t// \t\t\t\t\tchangeable: starbox.hasClass('unchangeable') ? false : starbox.hasClass('clickonce') ? 'once' : true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tchangeable : true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t// \t\t\t\t\tghosting: starbox.hasClass('ghosting'),\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tghosting : true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tautoUpdateAverage : starbox\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.hasClass('autoupdate'),\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tbuttons : starbox\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.hasClass('smooth') ? false\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t: starbox\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.attr('data-button-count') || 5,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tstars : starbox\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.attr('data-star-count') || 5\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t\t\t\t\t.bind(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'starbox-value-changed',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tfunction(event, value) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tif (starbox.hasClass('random')) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar val = Math.random();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tstarbox.next().text(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t' ' + val);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\treturn val;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<!---//End-rate---->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- header-section-starts -->\r\n");
      out.write("\t<div class=\"user-desc\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t<li><i class=\"cart\"></i><a href=\"loadCheckout\">Cart\r\n");
      out.write("\t\t\t\t\t\t(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sizeCart}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(")</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"header\">\r\n");
      out.write("\t\t<div class=\"header-top\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t\t\t<a href=\"index.html\"><img src=\"images/logo.png\" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"top-menu\">\r\n");
      out.write("\t\t\t\t\t<span class=\"menu\"> </span>\r\n");
      out.write("\t\t\t\t\t<ul class=\"cl-effect-15\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"getMain\">HOME</a></li>\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"contact.html\" data-hover=\"CONTACT\">CONTACT</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--script-nav-->\r\n");
      out.write("\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t$(\"span.menu\").click(function() {\r\n");
      out.write("\t\t\t\t\t\t$(\".top-menu ul\").slideToggle(\"slow\", function() {\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t<!--script-nav-->\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- header-section-ends -->\r\n");
      out.write("\t<!-- start content -->\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"single\">\r\n");
      out.write("\t\t<!-- start span1_of_1 -->\r\n");
      out.write("\t\t<div class=\"left_content\">\r\n");
      out.write("\t\t\t<div class=\"span_1_of_left\">\r\n");
      out.write("\t\t\t\t<div class=\"grid images_3_of_2\">\r\n");
      out.write("\t\t\t\t\t<ul id=\"etalage\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"optionallink.html\"> <img\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"etalage_thumb_image\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.image }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"img-responsive\" /> <img class=\"etalage_source_image\"\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.image }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"img-responsive\" title=\"\" />\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><img class=\"etalage_thumb_image\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.image }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"img-responsive\" /> <img class=\"etalage_source_image\"\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.image }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"img-responsive\" title=\"\" /></li>\r\n");
      out.write("\t\t\t\t\t\t<li><img class=\"etalage_thumb_image\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.image }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"img-responsive\" /> <img class=\"etalage_source_image\"\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.image }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"img-responsive\" /></li>\r\n");
      out.write("\t\t\t\t\t\t<li><img class=\"etalage_thumb_image\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.image }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"img-responsive\" /> <img class=\"etalage_source_image\"\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.image }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"img-responsive\" /></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- start span1_of_1 -->\r\n");
      out.write("\t\t\t\t<form action=\"shop\" method=\"get\">\r\n");
      out.write("\t\t\t\t\t<div class=\"span1_of_1_des\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"desc1\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.description }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t\t<h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\tRs. 399 <a href=\"#\">click for offer</a> -->\r\n");
      out.write("\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"available\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Available Options :</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul><li><input name=\"productId\"type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Color: <!-- \t\t\t\t\t\t\t\t<select> --> ");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input name=\"color\" type=\"color\" value=\"#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.color  }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('"');
      out.write('>');
      out.write(' ');
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t\t\tselected=\"selected\"></option> --> <!-- \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option>Black</option> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option>Dark Black</option> --> <!-- \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option>Red</option> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t</select> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Size: <select name = size>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.size }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t\t<option>29</option> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t\t<option>28</option> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t\t<option>27</option> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><div class=\"block\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"starbox small ghosting\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"btn_form\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"add to cart\" title=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t<span class=\"span_right\"><a href=\"#\">login to save in -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\twishlist </a></span> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t<div class=\"filter-by-color\"> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t<h3>Filter by Color</h3> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t<ul class=\"w_nav2\"> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color1\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color2\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color3\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color4\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color5\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color10\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color7\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color8\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color9\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color10\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color6\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color13\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color14\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color15\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color16\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color17\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color1\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color3\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color2\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t</ul> -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- start tabs -->\r\n");
      out.write("\t<!--Horizontal Tab-->\r\n");
      out.write("\t<!-- <div id=\"horizontalTab\">\r\n");
      out.write("\t\t\t<ul class=\"resp-tabs-list\">\r\n");
      out.write("\t\t\t\t<li>More Information</li>\r\n");
      out.write("\t\t\t\t<li>Specifications</li>\r\n");
      out.write("\t\t\t\t<li>Reviews</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<div class=\"resp-tabs-container\">\r\n");
      out.write("\t\t\t\t<div class=\"tab-content\">\r\n");
      out.write("\t\t\t\t\t<p>Maecenas mauris velit, consequat sit amet feugiat rit, elit\r\n");
      out.write("\t\t\t\t\t\tvitaeert scelerisque elementum, turpis nisl accumsan ipsum Lorem\r\n");
      out.write("\t\t\t\t\t\tIpsum is simply dummy text of the printing and typesetting\r\n");
      out.write("\t\t\t\t\t\tindustry. and scrambled it to make a type specimen book. It has\r\n");
      out.write("\t\t\t\t\t\tsurvived Auction your website on Flippa and you'll get the best\r\n");
      out.write("\t\t\t\t\t\tprice from serious buyers, dedicated support and a much better\r\n");
      out.write("\t\t\t\t\t\tdeal than you'll find with any website broker. Sell your site\r\n");
      out.write("\t\t\t\t\t\ttoday I need a twitter bootstrap 3.0 theme for the full-calendar\r\n");
      out.write("\t\t\t\t\t\tplugin. it would be great if the theme includes the add event;\r\n");
      out.write("\t\t\t\t\t\tremove event, show event details. this must be RESPONSIVE and\r\n");
      out.write("\t\t\t\t\t\tworks on mobile devices. Also, I've seen so many bootstrap themes\r\n");
      out.write("\t\t\t\t\t\tthat comes up with the fullcalendar plugin. However these .</p>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li>Research</li>\r\n");
      out.write("\t\t\t\t\t\t<li>Design and Development</li>\r\n");
      out.write("\t\t\t\t\t\t<li>Porting and Optimization</li>\r\n");
      out.write("\t\t\t\t\t\t<li>System integration</li>\r\n");
      out.write("\t\t\t\t\t\t<li>Verification, Validation and Testing</li>\r\n");
      out.write("\t\t\t\t\t\t<li>Maintenance and Support</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"tab-content\">\r\n");
      out.write("\t\t\t\t\t<p class=\"para\">\r\n");
      out.write("\t\t\t\t\t\t<span>WELCOME </span> Contrary to popular belief, Lorem Ipsum is\r\n");
      out.write("\t\t\t\t\t\tnot simply random text. It has roots in a piece of classical Latin\r\n");
      out.write("\t\t\t\t\t\tliterature from 45 BC, making it over 2000 years old. Richard\r\n");
      out.write("\t\t\t\t\t\tMcClintock, a Latin professor at Hampden-Sydney College in\r\n");
      out.write("\t\t\t\t\t\tVirginia, looked up one of the more obscure Latin words,\r\n");
      out.write("\t\t\t\t\t\tconsectetur, from a Lorem Ipsum passage, and going through the\r\n");
      out.write("\t\t\t\t\t\tcites of the word in classical literature, discovered the\r\n");
      out.write("\t\t\t\t\t\tundoubtable source. Lorem Ipsum comes from sections\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<ul class=\"qua_nav\">\r\n");
      out.write("\t\t\t\t\t\t<li>Multimedia Systems</li>\r\n");
      out.write("\t\t\t\t\t\t<li>Digital media adapters</li>\r\n");
      out.write("\t\t\t\t\t\t<li>Set top boxes for HDTV and IPTV Player applications on\r\n");
      out.write("\t\t\t\t\t\t\tvarious Operating Systems and Hardware Platforms</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"tab-content\">\r\n");
      out.write("\t\t\t\t\t<p class=\"para top\">\r\n");
      out.write("\t\t\t\t\t\t<span>LOREM IPSUM</span> There are many variations of passages of\r\n");
      out.write("\t\t\t\t\t\tLorem Ipsum available, but the majority have suffered alteration\r\n");
      out.write("\t\t\t\t\t\tin some form, by injected humour, or randomised words which don't\r\n");
      out.write("\t\t\t\t\t\tlook even slightly believable. If you are going to use a passage\r\n");
      out.write("\t\t\t\t\t\tof Lorem Ipsum, you need to be sure there isn't anything\r\n");
      out.write("\t\t\t\t\t\tembarrassing hidden in the middle of text. All the Lorem Ipsum\r\n");
      out.write("\t\t\t\t\t\tgenerators on the Internet tend to repeat predefined chunks as\r\n");
      out.write("\t\t\t\t\t\tnecessary, making this the first true generator on the Internet.\r\n");
      out.write("\t\t\t\t\t\tIt uses a dictionary of over 200 Latin words, combined\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li>Research</li>\r\n");
      out.write("\t\t\t\t\t\t<li>Design and Development</li>\r\n");
      out.write("\t\t\t\t\t\t<li>Porting and Optimization</li>\r\n");
      out.write("\t\t\t\t\t\t<li>System integration</li>\r\n");
      out.write("\t\t\t\t\t\t<li>Verification, Validation and Testing</li>\r\n");
      out.write("\t\t\t\t\t\t<li>Maintenance and Support</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- end tabs -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- <div class=\"left_sidebar\">\r\n");
      out.write("\t\t<div class=\"sellers\">\r\n");
      out.write("\t\t\t <h4>Best Sellers</h4>\r\n");
      out.write("\t\t\t<div class=\"single-nav\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Always free from repetition</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Always free from repetition</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">The standard chunk of Lorem Ipsum</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">The standard chunk of Lorem Ipsum</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Always free from repetition</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">The standard chunk of Lorem Ipsum</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Always free from repetition</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Always free from repetition</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Always free from repetition</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">The standard chunk of Lorem Ipsum</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Always free from repetition</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Always free from repetition</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Always free from repetition</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>  \r\n");
      out.write("\t\t\t<div class=\"banner-wrap bottom_banner color_link\">\r\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"main_link\">\r\n");
      out.write("\t\t\t\t\t<figure>\r\n");
      out.write("\t\t\t\t\t\t<img src=\"images/delivery.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t</figure>\r\n");
      out.write("\t\t\t\t\t<h5>\r\n");
      out.write("\t\t\t\t\t\t<span>Free Shipping</span><br> on orders over $99.\r\n");
      out.write("\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t<p>This offer is valid on all our store items.</p>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"brands\">\r\n");
      out.write("\t\t\t\t<h1>Brands</h1>\r\n");
      out.write("\t\t\t\t<div class=\"field\">\r\n");
      out.write("\t\t\t\t\t<select class=\"select1\">\r\n");
      out.write("\t\t\t\t\t\t<option>Please Select</option>\r\n");
      out.write("\t\t\t\t\t\t<option>Lorem ipsum dolor sit amet</option>\r\n");
      out.write("\t\t\t\t\t\t<option>Lorem ipsum dolor sit amet</option>\r\n");
      out.write("\t\t\t\t\t\t<option>Lorem ipsum dolor sit amet</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>-->\r\n");
      out.write("\t<!-- end sidebar -->\r\n");
      out.write("\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t<!-- \t</div> -->\r\n");
      out.write("\t<!-- \t</div> -->\r\n");
      out.write("\t<!-- end content -->\r\n");
      out.write("\t<!-- \t</div> -->\r\n");
      out.write("\t<!-- \t</div> -->\r\n");
      out.write("\t<!-- \t</div> -->\r\n");
      out.write("\t<!-- content-section-ends -->\r\n");
      out.write("\t<!-- contact-section-starts -->\r\n");
      out.write("\t<div class=\"content-section\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"col-md-3 about-us\">\r\n");
      out.write("\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_spring_005fmessage_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_spring_005fmessage_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_spring_005fmessage_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t<div class=\"social-icons\">\r\n");
      out.write("\t\t\t\t\t<i class=\"facebook\"></i> <i class=\"twitter\"></i> <i class=\"rss\"></i>\r\n");
      out.write("\t\t\t\t\t<i class=\"vimeo\"></i> <i class=\"dribble\"></i> <i class=\"msn\"></i>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-3 archives\">\r\n");
      out.write("\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_spring_005fmessage_005f5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">March 2012</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">February 2012</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">January 2012</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">December 2011</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-3 contact-us\">\r\n");
      out.write("\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_spring_005fmessage_005f6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><i class=\"message\"></i></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"mail-to:info@premiumcoding.com\">");
      if (_jspx_meth_spring_005fmessage_005f7(_jspx_page_context))
        return;
      out.write("/a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><i class=\"land-phone\"></i></li>\r\n");
      out.write("\t\t\t\t\t<li>");
      if (_jspx_meth_spring_005fmessage_005f8(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><i class=\"smart-phone\"></i></li>\r\n");
      out.write("\t\t\t\t\t<li>");
      if (_jspx_meth_spring_005fmessage_005f9(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- \t\t\t<div class=\"col-md-3 about-us\"> -->\r\n");
      out.write("\t\t\t<!-- \t\t\t\t<h4>SIGN TO NEWSLETTER</h4> -->\r\n");
      out.write("\t\t\t<!-- \t\t\t\t<input type=\"text\" class=\"text\" value=\"Name\" -->\r\n");
      out.write("\t\t\t<!-- \t\t\t\t\tonfocus=\"this.value = '';\" -->\r\n");
      out.write("\t\t\t<!-- \t\t\t\t\tonblur=\"if (this.value == '') {this.value = 'Name';}\"> <input -->\r\n");
      out.write("\t\t\t<!-- \t\t\t\t\ttype=\"text\" class=\"text\" value=\"Email\" onfocus=\"this.value = '';\" -->\r\n");
      out.write("\t\t\t<!-- \t\t\t\t\tonblur=\"if (this.value == '') {this.value = 'Email';}\"> <input -->\r\n");
      out.write("\t\t\t<!-- \t\t\t\t\ttype=\"submit\" value=\"subscribe\"> -->\r\n");
      out.write("\t\t\t<!-- \t\t\t</div> -->\r\n");
      out.write("\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- contact-section-ends -->\r\n");
      out.write("\t<!-- footer-section-starts -->\r\n");
      out.write("\t<div class=\"footer\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"col-md-6 bottom-menu\">\r\n");
      out.write("\t\t\t\t<!-- \t\t\t\t<ul> -->\r\n");
      out.write("\t\t\t\t<!-- \t\t\t\t\t<li><a href=\"index.html\">HOME</a></li> -->\r\n");
      out.write("\t\t\t\t<!-- \t\t\t\t\t<li><a href=\"#\">PORTFOLIO</a></li> -->\r\n");
      out.write("\t\t\t\t<!-- \t\t\t\t\t<li><a href=\"#\">SITEMAP</a></li> -->\r\n");
      out.write("\t\t\t\t<!-- \t\t\t\t\t<li><a href=\"contact.html\"> CONTACT</a></li> -->\r\n");
      out.write("\t\t\t\t<!-- \t\t\t\t</ul> -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-6 copy-rights\">\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t&copy;\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_spring_005fmessage_005f10(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t<a href=\"http://traditionalfashion-fontal.rhcloud.com/\"\r\n");
      out.write("\t\t\t\t\t\ttarget=\"target_blank\">");
      if (_jspx_meth_spring_005fmessage_005f11(_jspx_page_context))
        return;
      out.write("</a>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- footer-section-ends -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_spring_005fmessage_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f0 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f0.setParent(null);
    // /WEB-INF/view/single.jsp(9,7) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f0.setCode("title.main");
    int[] _jspx_push_body_count_spring_005fmessage_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f0 = _jspx_th_spring_005fmessage_005f0.doStartTag();
      if (_jspx_th_spring_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f0.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f1 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f1.setParent(null);
    // /WEB-INF/view/single.jsp(9,44) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f1.setCode("page.name.single");
    int[] _jspx_push_body_count_spring_005fmessage_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f1 = _jspx_th_spring_005fmessage_005f1.doStartTag();
      if (_jspx_th_spring_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f1.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent(null);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /WEB-INF/view/single.jsp(144,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user !=null }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<li><i class=\"user\"\r\n");
        out.write("\t\t\t\t\t\t\tstyle=\"background:");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.imageThumbnail}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(";\"></i> <a\r\n");
        out.write("\t\t\t\t\t\t\thref=\"loadAccount\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</a></li>\r\n");
        out.write("\t\t\t\t\t\t<li><a href=\"logout.html\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${appProperties[\"title.logout\"] }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</a></li>\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<li><a href=\"loadLogin\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${appProperties[\"title.login\"] }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</a></li>\r\n");
        out.write("\t\t\t\t\t\t<li><a href=\"loadLogin\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${appProperties[\"title.registry\"] }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</a></li>\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/view/single.jsp(171,6) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/view/single.jsp(171,6) '${catalogsRoot }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${catalogsRoot }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/view/single.jsp(171,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("catalog");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t<li><a href=\"getProductByCatalog?catalogId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ catalog.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\r\n");
          out.write("\t\t\t\t\t\t\t\tdata-hover=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ catalog.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ catalog.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</a></li>\r\n");
          out.write("\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f2 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f2.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f2.setParent(null);
    // /WEB-INF/view/single.jsp(418,5) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f2.setCode("label.introduteUs");
    int[] _jspx_push_body_count_spring_005fmessage_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f2 = _jspx_th_spring_005fmessage_005f2.doStartTag();
      if (_jspx_th_spring_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f2.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f3 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f3.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f3.setParent(null);
    // /WEB-INF/view/single.jsp(421,5) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f3.setCode("content.introduteUs");
    int[] _jspx_push_body_count_spring_005fmessage_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f3 = _jspx_th_spring_005fmessage_005f3.doStartTag();
      if (_jspx_th_spring_005fmessage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f3.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f4 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f4.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f4.setParent(null);
    // /WEB-INF/view/single.jsp(424,5) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f4.setCode("label.followUs");
    int[] _jspx_push_body_count_spring_005fmessage_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f4 = _jspx_th_spring_005fmessage_005f4.doStartTag();
      if (_jspx_th_spring_005fmessage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f4.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f5 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f5.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f5.setParent(null);
    // /WEB-INF/view/single.jsp(433,5) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f5.setCode("label.archives");
    int[] _jspx_push_body_count_spring_005fmessage_005f5 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f5 = _jspx_th_spring_005fmessage_005f5.doStartTag();
      if (_jspx_th_spring_005fmessage_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f5.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f5);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f6 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f6.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f6.setParent(null);
    // /WEB-INF/view/single.jsp(444,5) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f6.setCode("label.contactUs");
    int[] _jspx_push_body_count_spring_005fmessage_005f6 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f6 = _jspx_th_spring_005fmessage_005f6.doStartTag();
      if (_jspx_th_spring_005fmessage_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f6.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f6);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f7 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f7.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f7.setParent(null);
    // /WEB-INF/view/single.jsp(448,50) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f7.setCode("contact.mail");
    int[] _jspx_push_body_count_spring_005fmessage_005f7 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f7 = _jspx_th_spring_005fmessage_005f7.doStartTag();
      if (_jspx_th_spring_005fmessage_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f7.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f7);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f8 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f8.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f8.setParent(null);
    // /WEB-INF/view/single.jsp(453,9) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f8.setCode("contact.phone");
    int[] _jspx_push_body_count_spring_005fmessage_005f8 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f8 = _jspx_th_spring_005fmessage_005f8.doStartTag();
      if (_jspx_th_spring_005fmessage_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f8[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f8.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f8.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f8);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f9 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f9.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f9.setParent(null);
    // /WEB-INF/view/single.jsp(457,9) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f9.setCode("contact.homePhone");
    int[] _jspx_push_body_count_spring_005fmessage_005f9 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f9 = _jspx_th_spring_005fmessage_005f9.doStartTag();
      if (_jspx_th_spring_005fmessage_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f9[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f9.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f9.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f9);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f10 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f10.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f10.setParent(null);
    // /WEB-INF/view/single.jsp(487,5) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f10.setCode("label.author");
    int[] _jspx_push_body_count_spring_005fmessage_005f10 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f10 = _jspx_th_spring_005fmessage_005f10.doStartTag();
      if (_jspx_th_spring_005fmessage_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f10[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f10.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f10.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f10);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f11 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f11.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f11.setParent(null);
    // /WEB-INF/view/single.jsp(489,28) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f11.setCode("label.author.name");
    int[] _jspx_push_body_count_spring_005fmessage_005f11 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f11 = _jspx_th_spring_005fmessage_005f11.doStartTag();
      if (_jspx_th_spring_005fmessage_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f11[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f11.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f11.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f11);
    }
    return false;
  }
}
