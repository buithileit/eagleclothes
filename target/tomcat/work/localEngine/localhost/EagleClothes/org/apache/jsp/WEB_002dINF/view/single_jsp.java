package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class single_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      out.write("<title>EAGLECLOTHES Bootstarp responsive Website Template|\r\n");
      out.write("\tSingle-page :: w3layouts</title>\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<script type=\"application/x-javascript\">\r\n");
      out.write("\t addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } \r\n");
      out.write("</script>\r\n");
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
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- header-section-starts -->\r\n");
      out.write("\t<div class=\"user-desc\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"checkout.html\">Checkout</a></li>\r\n");
      out.write("\t\t\t\t<li><i class=\"user\"></i><a href=\"account.html\">My Account</a></li>\r\n");
      out.write("\t\t\t\t<li><i class=\"cart\"></i><a href=\"#\">Cart (0)</a></li>\r\n");
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
      out.write("\t\t\t\t\t\t<li><a href=\"index.html\" data-hover=\"HOME\">HOME</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"404.html\" data-hover=\"NEWS\">NEWS</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"active\" href=\"products.html\">PRODUCTS</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"404.html\" data-hover=\"FEATURES\">FEATURES</a></li>\r\n");
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
      out.write("\t\t\t\t\t\t\t\tclass=\"etalage_thumb_image\" src=\"images/d2.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"img-responsive\" /> <img class=\"etalage_source_image\"\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"images/d2.jpg\" class=\"img-responsive\" title=\"\" />\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><img class=\"etalage_thumb_image\" src=\"images/d1.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"img-responsive\" /> <img class=\"etalage_source_image\"\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"images/d1.jpg\" class=\"img-responsive\" title=\"\" /></li>\r\n");
      out.write("\t\t\t\t\t\t<li><img class=\"etalage_thumb_image\" src=\"images/d2.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"img-responsive\" /> <img class=\"etalage_source_image\"\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"images/d2.jpg\" class=\"img-responsive\" /></li>\r\n");
      out.write("\t\t\t\t\t\t<li><img class=\"etalage_thumb_image\" src=\"images/d3.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"img-responsive\" /> <img class=\"etalage_source_image\"\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"images/d3.jpg\" class=\"img-responsive\" /></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- start span1_of_1 -->\r\n");
      out.write("\t\t\t\t<div class=\"span1_of_1_des\">\r\n");
      out.write("\t\t\t\t\t<div class=\"desc1\">\r\n");
      out.write("\t\t\t\t\t\t<h3>Lorem Ipsum is simply dummy text</h3>\r\n");
      out.write("\t\t\t\t\t\t<p>It is a long established fact that a reader will be\r\n");
      out.write("\t\t\t\t\t\t\tdistracted by the readable content of a page when looking at its\r\n");
      out.write("\t\t\t\t\t\t\tlayout.</p>\r\n");
      out.write("\t\t\t\t\t\t<h5>\r\n");
      out.write("<!-- \t\t\t\t\t\t\tRs. 399 <a href=\"#\">click for offer</a> -->\r\n");
      out.write("\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"available\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>Available Options :</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>Color: <select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option>Silver</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option>Black</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option>Dark Black</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option>Red</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>Size: <select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option>L</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option>XL</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option>S</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option>M</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li>Quality: <select> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t\t<option>1</option> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t\t<option>2</option> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t\t<option>3</option> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t\t<option>4</option> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t\t<option>5</option> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t</select> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"btn_form\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"add to cart\" title=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"span_right\"><a href=\"#\">login to save in\r\n");
      out.write("\t\t\t\t\t\t\t\t\twishlist </a></span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t<div class=\"filter-by-color\"> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t<h3>Filter by Color</h3> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t<ul class=\"w_nav2\"> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color1\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color2\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color3\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color4\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color5\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color10\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color7\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color8\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color9\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color10\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color6\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color13\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color14\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color15\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color16\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color17\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color1\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color3\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<li><a class=\"color2\" href=\"#\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t</ul> -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- start tabs -->\r\n");
      out.write("\t\t\t<!--Horizontal Tab-->\r\n");
      out.write("\t\t\t<div id=\"horizontalTab\">\r\n");
      out.write("\t\t\t\t<ul class=\"resp-tabs-list\">\r\n");
      out.write("\t\t\t\t\t<li>More Information</li>\r\n");
      out.write("\t\t\t\t\t<li>Specifications</li>\r\n");
      out.write("\t\t\t\t\t<li>Reviews</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<div class=\"resp-tabs-container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"tab-content\">\r\n");
      out.write("\t\t\t\t\t\t<p>Maecenas mauris velit, consequat sit amet feugiat rit, elit\r\n");
      out.write("\t\t\t\t\t\t\tvitaeert scelerisque elementum, turpis nisl accumsan ipsum Lorem\r\n");
      out.write("\t\t\t\t\t\t\tIpsum is simply dummy text of the printing and typesetting\r\n");
      out.write("\t\t\t\t\t\t\tindustry. and scrambled it to make a type specimen book. It has\r\n");
      out.write("\t\t\t\t\t\t\tsurvived Auction your website on Flippa and you'll get the best\r\n");
      out.write("\t\t\t\t\t\t\tprice from serious buyers, dedicated support and a much better\r\n");
      out.write("\t\t\t\t\t\t\tdeal than you'll find with any website broker. Sell your site\r\n");
      out.write("\t\t\t\t\t\t\ttoday I need a twitter bootstrap 3.0 theme for the full-calendar\r\n");
      out.write("\t\t\t\t\t\t\tplugin. it would be great if the theme includes the add event;\r\n");
      out.write("\t\t\t\t\t\t\tremove event, show event details. this must be RESPONSIVE and\r\n");
      out.write("\t\t\t\t\t\t\tworks on mobile devices. Also, I've seen so many bootstrap themes\r\n");
      out.write("\t\t\t\t\t\t\tthat comes up with the fullcalendar plugin. However these .</p>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li>Research</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>Design and Development</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>Porting and Optimization</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>System integration</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>Verification, Validation and Testing</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>Maintenance and Support</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"tab-content\">\r\n");
      out.write("\t\t\t\t\t\t<p class=\"para\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>WELCOME </span> Contrary to popular belief, Lorem Ipsum is\r\n");
      out.write("\t\t\t\t\t\t\tnot simply random text. It has roots in a piece of classical\r\n");
      out.write("\t\t\t\t\t\t\tLatin literature from 45 BC, making it over 2000 years old.\r\n");
      out.write("\t\t\t\t\t\t\tRichard McClintock, a Latin professor at Hampden-Sydney College\r\n");
      out.write("\t\t\t\t\t\t\tin Virginia, looked up one of the more obscure Latin words,\r\n");
      out.write("\t\t\t\t\t\t\tconsectetur, from a Lorem Ipsum passage, and going through the\r\n");
      out.write("\t\t\t\t\t\t\tcites of the word in classical literature, discovered the\r\n");
      out.write("\t\t\t\t\t\t\tundoubtable source. Lorem Ipsum comes from sections\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"qua_nav\">\r\n");
      out.write("\t\t\t\t\t\t\t<li>Multimedia Systems</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>Digital media adapters</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>Set top boxes for HDTV and IPTV Player applications on\r\n");
      out.write("\t\t\t\t\t\t\t\tvarious Operating Systems and Hardware Platforms</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"tab-content\">\r\n");
      out.write("\t\t\t\t\t\t<p class=\"para top\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>LOREM IPSUM</span> There are many variations of passages of\r\n");
      out.write("\t\t\t\t\t\t\tLorem Ipsum available, but the majority have suffered alteration\r\n");
      out.write("\t\t\t\t\t\t\tin some form, by injected humour, or randomised words which don't\r\n");
      out.write("\t\t\t\t\t\t\tlook even slightly believable. If you are going to use a passage\r\n");
      out.write("\t\t\t\t\t\t\tof Lorem Ipsum, you need to be sure there isn't anything\r\n");
      out.write("\t\t\t\t\t\t\tembarrassing hidden in the middle of text. All the Lorem Ipsum\r\n");
      out.write("\t\t\t\t\t\t\tgenerators on the Internet tend to repeat predefined chunks as\r\n");
      out.write("\t\t\t\t\t\t\tnecessary, making this the first true generator on the Internet.\r\n");
      out.write("\t\t\t\t\t\t\tIt uses a dictionary of over 200 Latin words, combined\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li>Research</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>Design and Development</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>Porting and Optimization</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>System integration</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>Verification, Validation and Testing</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>Maintenance and Support</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- end tabs -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"left_sidebar\">\r\n");
      out.write("\t\t\t<div class=\"sellers\">\r\n");
      out.write("\t\t\t\t<h4>Best Sellers</h4>\r\n");
      out.write("\t\t\t\t<div class=\"single-nav\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Always free from repetition</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Always free from repetition</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">The standard chunk of Lorem Ipsum</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">The standard chunk of Lorem Ipsum</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Always free from repetition</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">The standard chunk of Lorem Ipsum</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Always free from repetition</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Always free from repetition</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Always free from repetition</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">The standard chunk of Lorem Ipsum</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Always free from repetition</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Always free from repetition</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Always free from repetition</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"banner-wrap bottom_banner color_link\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"main_link\">\r\n");
      out.write("\t\t\t\t\t\t<figure>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/delivery.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t</figure>\r\n");
      out.write("\t\t\t\t\t\t<h5>\r\n");
      out.write("\t\t\t\t\t\t\t<span>Free Shipping</span><br> on orders over $99.\r\n");
      out.write("\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t<p>This offer is valid on all our store items.</p>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"brands\">\r\n");
      out.write("\t\t\t\t\t<h1>Brands</h1>\r\n");
      out.write("\t\t\t\t\t<div class=\"field\">\r\n");
      out.write("\t\t\t\t\t\t<select class=\"select1\">\r\n");
      out.write("\t\t\t\t\t\t\t<option>Please Select</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>Lorem ipsum dolor sit amet</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>Lorem ipsum dolor sit amet</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>Lorem ipsum dolor sit amet</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- end sidebar -->\r\n");
      out.write("\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- end content -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- content-section-ends -->\r\n");
      out.write("\t<!-- contact-section-starts -->\r\n");
      out.write("\t<div class=\"content-section\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"col-md-3 about-us\">\r\n");
      out.write("\t\t\t\t<h4>LITTLE ABOUT US</h4>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<span>Sed posuere</span> consectetur est at. Nulla vitae elit\r\n");
      out.write("\t\t\t\t\tlibero, a pharetra. Lorem ipsum <span>dolor sit</span> amet,\r\n");
      out.write("\t\t\t\t\tconsectetuer adipiscing elit.\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<h4>FOLLOW US</h4>\r\n");
      out.write("\t\t\t\t<div class=\"social-icons\">\r\n");
      out.write("\t\t\t\t\t<i class=\"facebook\"></i> <i class=\"twitter\"></i> <i class=\"rss\"></i>\r\n");
      out.write("\t\t\t\t\t<i class=\"vimeo\"></i> <i class=\"dribble\"></i> <i class=\"msn\"></i>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-3 archives\">\r\n");
      out.write("\t\t\t\t<h4>ARCHIVES</h4>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">March 2012</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">February 2012</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">January 2012</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">December 2011</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-3 contact-us\">\r\n");
      out.write("\t\t\t\t<h4>CONTACT US</h4>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><i class=\"message\"></i></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"mail-to:info@premiumcoding.com\">info@premiumcoding.com</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><i class=\"land-phone\"></i></li>\r\n");
      out.write("\t\t\t\t\t<li>800 756 156</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><i class=\"smart-phone\"></i></li>\r\n");
      out.write("\t\t\t\t\t<li>+386408007561</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-3 about-us\">\r\n");
      out.write("\t\t\t\t<h4>SIGN TO NEWSLETTER</h4>\r\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"text\" value=\"Name\"\r\n");
      out.write("\t\t\t\t\tonfocus=\"this.value = '';\"\r\n");
      out.write("\t\t\t\t\tonblur=\"if (this.value == '') {this.value = 'Name';}\"> <input\r\n");
      out.write("\t\t\t\t\ttype=\"text\" class=\"text\" value=\"Email\" onfocus=\"this.value = '';\"\r\n");
      out.write("\t\t\t\t\tonblur=\"if (this.value == '') {this.value = 'Email';}\"> <input\r\n");
      out.write("\t\t\t\t\ttype=\"submit\" value=\"subscribe\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- contact-section-ends -->\r\n");
      out.write("\t<!-- footer-section-starts -->\r\n");
      out.write("\t<div class=\"footer\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"col-md-6 bottom-menu\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"index.html\">HOME</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">PORTFOLIO</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">SITEMAP</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"contact.html\"> CONTACT</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-6 copy-rights\">\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t&copy; 2015 Template by <a href=\"http://w3layouts.com\"\r\n");
      out.write("\t\t\t\t\t\ttarget=\"target_blank\">W3layouts</a>\r\n");
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
}