package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class account_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>EAGLECLOTHES Bootstarp responsive Website Template| Account :: w3layouts</title>\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<link href=\"css/demo1.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("<!--webfont-->\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Yanone+Kaffeesatz:400,200,300,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900,200italic,300italic,400italic,600italic,700italic,900italic' rel='stylesheet' type='text/css'>\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Karla:400,400italic,700,700italic' rel='stylesheet' type='text/css'>\r\n");
      out.write("\t\t<!-- JavaScript includes -->\r\n");
      out.write("\t\t<script src=\"js/ipresenter.packed.js\"></script>\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\t$(document).ready(function(){\r\n");
      out.write("\t\t\t\t$('#ipresenter').iPresenter({\r\n");
      out.write("\t\t\t\t\ttimerPadding: -1,\r\n");
      out.write("\t\t\t\t\tcontrolNav: true,\r\n");
      out.write("\t\t\t\t\tcontrolNavThumbs: true,\r\n");
      out.write("\t\t\t\t\tcontrolNavNextPrev: false\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t    <script type=\"text/javascript\" src=\"js/move-top.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/easing.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\t\tjQuery(document).ready(function($) {\r\n");
      out.write("\t\t\t\t$(\".scroll\").click(function(event){\t\t\r\n");
      out.write("\t\t\t\t\tevent.preventDefault();\r\n");
      out.write("\t\t\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1200);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- header-section-starts -->\r\n");
      out.write("\t<div class=\"user-desc\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"checkout.html\">Checkout</a></li>\r\n");
      out.write("\t\t\t\t<li><i class=\"user\"></i><a href=\"account.html\">My Account</a></li>\r\n");
      out.write("\t\t\t\t<li><i class=\"cart\"></i><a href=\"#\">Cart (3)</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"header\">\r\n");
      out.write("\t\t<div class=\"header-top\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t\t\t<a href=\"index.html\"><img src=\"images/logo.png\" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"top-menu\">\r\n");
      out.write("\t\t\t\t <span class=\"menu\"> </span>\r\n");
      out.write("\t\t\t\t\t<ul class=\"cl-effect-15\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"index.html\" data-hover=\"HOME\">HOME</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"404.html\" data-hover=\"NEWS\">NEWS</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"products.html\" data-hover=\"PRODUCTS\">PRODUCTS</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"404.html\" data-hover=\"FEATURES\">FEATURES</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"contact.html\" data-hover=\"CONTACT\">CONTACT</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--script-nav-->\r\n");
      out.write("\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t$(\"span.menu\").click(function(){\r\n");
      out.write("\t\t\t\t$(\".top-menu ul\").slideToggle(\"slow\" , function(){\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t<!--script-nav-->\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("<!-- header-section-ends -->\r\n");
      out.write("<!-- content-section-starts -->\r\n");
      out.write("\t<!-- start registration -->\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"registration\">\r\n");
      out.write("\t\t<div class=\"registration_left\">\r\n");
      out.write("\t\t<h2>new user? <span> create An account </span></h2>\r\n");
      out.write("\t\t<a href=\"#\"><div class=\"reg_fb\"><img src=\"images/facebook.png\" alt=\"\"><i>register using Facebook</i><div class=\"clearfix\"></div></div></a>\r\n");
      out.write("\t\t<!-- [if IE] \r\n");
      out.write("\t\t    < link rel='stylesheet' type='text/css' href='ie.css'/>  \r\n");
      out.write("\t\t [endif] -->  \r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t<!-- [if lt IE 7]>  \r\n");
      out.write("\t\t    < link rel='stylesheet' type='text/css' href='ie6.css'/>  \r\n");
      out.write("\t\t<! [endif] -->  \r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\t(function() {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t// Create input element for testing\r\n");
      out.write("\t\t\tvar inputs = document.createElement('input');\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// Create the supports object\r\n");
      out.write("\t\t\tvar supports = {};\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tsupports.autofocus   = 'autofocus' in inputs;\r\n");
      out.write("\t\t\tsupports.required    = 'required' in inputs;\r\n");
      out.write("\t\t\tsupports.placeholder = 'placeholder' in inputs;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t// Fallback for autofocus attribute\r\n");
      out.write("\t\t\tif(!supports.autofocus) {\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// Fallback for required attribute\r\n");
      out.write("\t\t\tif(!supports.required) {\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t// Fallback for placeholder attribute\r\n");
      out.write("\t\t\tif(!supports.placeholder) {\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// Change text inside send button on submit\r\n");
      out.write("\t\t\tvar send = document.getElementById('register-submit');\r\n");
      out.write("\t\t\tif(send) {\r\n");
      out.write("\t\t\t\tsend.onclick = function () {\r\n");
      out.write("\t\t\t\t\tthis.innerHTML = '...Sending';\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t})();\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t <div class=\"registration_form\">\r\n");
      out.write("\t\t <!-- Form -->\r\n");
      out.write("\t\t\t<form id=\"registration_form\" action=\"contact.php\" method=\"post\">\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<label>\r\n");
      out.write("\t\t\t\t\t\t<input placeholder=\"first name:\" type=\"text\" tabindex=\"1\" required autofocus>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<label>\r\n");
      out.write("\t\t\t\t\t\t<input placeholder=\"last name:\" type=\"text\" tabindex=\"2\" required autofocus>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<label>\r\n");
      out.write("\t\t\t\t\t\t<input placeholder=\"email address:\" type=\"email\" tabindex=\"3\" required>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"sky-form\">\r\n");
      out.write("\t\t\t\t\t<div class=\"sky_form1\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><label class=\"radio left\"><input type=\"radio\" name=\"radio\" checked=\"\"><i></i>Male</label></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><label class=\"radio\"><input type=\"radio\" name=\"radio\"><i></i>Female</label></li>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<label>\r\n");
      out.write("\t\t\t\t\t\t<input placeholder=\"password\" type=\"password\" tabindex=\"4\" required>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</div>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<label>\r\n");
      out.write("\t\t\t\t\t\t<input placeholder=\"retype password\" type=\"password\" tabindex=\"4\" required>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"create an account\" id=\"register-submit\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"sky-form\">\r\n");
      out.write("\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\" ><i></i>i agree to shoppe.com &nbsp;<a class=\"terms\" href=\"#\"> terms of service</a> </label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t<!-- /Form -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"registration_left\">\r\n");
      out.write("\t\t<h2>existing user</h2>\r\n");
      out.write("\t\t<a href=\"#\"><div class=\"reg_fb\"><img src=\"images/facebook.png\" alt=\"\"><i>sign in using Facebook</i><div class=\"clear\"></div></div></a>\r\n");
      out.write("\t\t <div class=\"registration_form\">\r\n");
      out.write("\t\t <!-- Form -->\r\n");
      out.write("\t\t\t<form id=\"registration_form\" action=\"contact.php\" method=\"post\">\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<label>\r\n");
      out.write("\t\t\t\t\t\t<input placeholder=\"email:\" type=\"email\" tabindex=\"3\" required>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<label>\r\n");
      out.write("\t\t\t\t\t\t<input placeholder=\"password\" type=\"password\" tabindex=\"4\" required>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</div>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"sign in\" id=\"register-submit\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"forget\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">forgot your password</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t<!-- /Form -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("   <!-- content-section-ends -->\t\r\n");
      out.write("   <!-- contact-section-starts -->\r\n");
      out.write("\t<div class=\"content-section\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"col-md-3 about-us\">\r\n");
      out.write("\t\t\t\t<h4>LITTLE ABOUT US</h4>\r\n");
      out.write("\t\t\t\t<p><span>Sed posuere</span> consectetur  est at. Nulla vitae elit libero, a pharetra. Lorem ipsum <span>dolor sit</span> amet, consectetuer adipiscing elit.</p>\r\n");
      out.write("\t\t\t\t<h4>FOLLOW US</h4>\r\n");
      out.write("\t\t\t\t<div class=\"social-icons\">\r\n");
      out.write("\t\t\t\t\t<i class=\"facebook\"></i>\r\n");
      out.write("\t\t\t\t\t<i class=\"twitter\"></i>\r\n");
      out.write("\t\t\t\t\t<i class=\"rss\"></i>\r\n");
      out.write("\t\t\t\t\t<i class=\"vimeo\"></i>\r\n");
      out.write("\t\t\t\t\t<i class=\"dribble\"></i>\r\n");
      out.write("\t\t\t\t\t<i class=\"msn\"></i>\r\n");
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
      out.write("\t\t\t\t<input type=\"text\" class=\"text\" value=\"Name\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Name';}\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"text\" value=\"Email\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Email';}\">\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"subscribe\">\r\n");
      out.write("\t\t\t</div>\t\r\n");
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
      out.write("\t\t\t\t<p>&copy; 2015 Template by <a href=\"http://w3layouts.com\" target=\"target_blank\">W3layouts</a></p>\r\n");
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
