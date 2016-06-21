package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

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
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      out.write("<title>EAGLECLOTHES Bootstarp responsive Website Template|\r\n");
      out.write("\tCheckout :: w3layouts</title>\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<link href=\"css/demo1.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
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
      out.write("<!-- JavaScript includes -->\r\n");
      out.write("<script src=\"js/ipresenter.packed.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$('#ipresenter').iPresenter({\r\n");
      out.write("\t\t\ttimerPadding : -1,\r\n");
      out.write("\t\t\tcontrolNav : true,\r\n");
      out.write("\t\t\tcontrolNavThumbs : true,\r\n");
      out.write("\t\t\tcontrolNavNextPrev : false\r\n");
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
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t<li><i class=\"cart\"></i><a href=\"loadCheckout\">Cart\r\n");
      out.write("\t\t\t\t\t\t(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
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
      out.write("\t\t\t\t\t\t<li><a  href=\"getMain\">HOME</a></li>\r\n");
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
      out.write("\t<!-- content-section-starts -->\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"My-wish-section\">\r\n");
      out.write("\t\t\t<section id=\"wish\">\r\n");
      out.write("\t\t\t\t<div class=\"my-wish-content\">\r\n");
      out.write("\t\t\t\t\t<div class=\"pag-nav\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"p-list\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"getMain\">Home</a></li> &nbsp;&nbsp;/&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"act\">&nbsp;Bascket(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.shopCart.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(")</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<!-- \t\t\t\t\t<div class=\"coats sing-c\"> -->\r\n");
      out.write("\t\t\t\t\t<!-- \t\t\t\t\t\t<div class=\"container\"> -->\r\n");
      out.write("\t\t\t\t\t<!-- \t\t\t\t\t\t\t<div class=\"check-out\"> -->\r\n");
      out.write("\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<div class=\"bs-example4\" -->\r\n");
      out.write("\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\tdata-example-id=\"simple-responsive-table\"> -->\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fchoose_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- \t\t\t\t\t</div> -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- \t\t\t\t</div> -->\r\n");
      out.write("\t<!-- \t\t</div> -->\r\n");
      out.write("\t<!-- \t</div> -->\r\n");
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
    // /WEB-INF/view/checkout.jsp(62,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user !=null }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<li><i class=\"user\"\r\n");
        out.write("\t\t\t\t\t\t\tstyle=\"background:");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.imageThumbnail}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(";\"></i> <a\r\n");
        out.write("\t\t\t\t\t\t\thref=\"404.html\">");
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
    // /WEB-INF/view/checkout.jsp(89,6) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/view/checkout.jsp(89,6) '${catalogsRoot }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${catalogsRoot }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/view/checkout.jsp(89,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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

  private boolean _jspx_meth_c_005fchoose_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f1.setParent(null);
    int _jspx_eval_c_005fchoose_005f1 = _jspx_th_c_005fchoose_005f1.doStartTag();
    if (_jspx_eval_c_005fchoose_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_005fwhen_005f1(_jspx_th_c_005fchoose_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_005fotherwise_005f1(_jspx_th_c_005fchoose_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
    // /WEB-INF/view/checkout.jsp(127,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.shopCart !=null && sessionScope.shopCart.size > 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
    if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<form action=\"checkout\" method=\"get\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<div class=\"deliver_info_left\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<h2 class=\"title-text\">Deliver Information</h2>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<div class=\"registration_form\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"exampleInputPhone\">Phone person receice</label> <input\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tname=\"phoneReceice\" type=\"text\" required\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"Phone number of person receice\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"exampleInputName\">Name person receice</label> <input\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tname=\"nameReceice\" type=\"text\" required\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"Name person receice\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"exampleInputAddress\">Address person\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\treceice</label> <input name=\"addressReceice\" type=\"text\" required\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"Address person receice\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dateDeliverMin}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(" <label for=\"exampleInputDate\">Date\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\treceice</label> <input name=\"dateReceice\" type=\"date\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dateDeliverMin}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-default\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\tid=\"checkout_btn\">Checkout</button>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t</form>\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<script type=\"text/javascript\">\r\n");
        out.write("\t\t\t\t\t\t\t\t$(document)\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t.ready(\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#checkout_btn\")\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.click(\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tconsole\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.info(\"run\");\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvar today = new Date();\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvar dd = today\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.getDate();\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvar mm = today\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.getMonth() + 1; //January is 0!\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvar yyyy = today\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.getFullYear();\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tif (dd < 10) {\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tdd = '0'\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ dd\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tif (mm < 10) {\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tmm = '0'\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ mm\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttoday = mm\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ '/'\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ dd\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ '/'\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ yyyy;\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvar dateDeliver = new Date();\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tdeliver\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvar dateDeliver = end_date\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.setDate(date\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.getDate()\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ days);\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tif ($(\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"[name='dateReceice']\")\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val() == \"\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|| new Date(\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"[name='dateReceice']\")\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val())\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.getTime() < dateDeliver\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.getTime()) {\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"[name='dateReceice']\")\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tdateDeliver\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val());\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#checkout_btn\")\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.submit();\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t});\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\r\n");
        out.write("\t\t\t\t\t\t\t</script>\r\n");
        out.write("\t\t\t\t\t\t\t<div class=\"products_right\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<div class=\"table-responsive\" align=\"center\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\tstyle=\"padding-left: 5%\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<table class=\"table-heading \">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<tr class=\"product-section-head-text\">\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<th><h3>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span>Item</span>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</h3></th>\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<th><h3>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span>Prices</span>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</h3></th>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<th><h3>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span>Amount</span>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</h3></th>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<th><h3>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span>Delivery</span>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</h3></th>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<th><h3>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span>Subtotal</span>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</h3></th>\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fforEach_005f1(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t<script> -->\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<!--  // function updateCart(){ // // alert(\"change\"); // // var\r\n");
        out.write("\t\t\t\t\t\t\t\t\turl_update = \"updateProductToCart?color=\" +$(\"#color\").val()\r\n");
        out.write("\t\t\t\t\t\t\t\t\t+\"productId=\"+$(\"#product_id\").val()\r\n");
        out.write("\t\t\t\t\t\t\t\t\t+\"size=\"+$(\"#size\").val()+\"amount=\"+$(\"#updateCart\").val() //\r\n");
        out.write("\t\t\t\t\t\t\t\t\t// // } // $(document).ready(function() { //\r\n");
        out.write("\t\t\t\t\t\t\t\t\t$(\"#updateCart\").change(function() { // // alert(\"change\"); //\r\n");
        out.write("\t\t\t\t\t\t\t\t\tvar url_update = \"updateProductToCart?color=\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\t+$(\"#color\").val() +\"productId=\"+$(\"#product_id\").val()\r\n");
        out.write("\t\t\t\t\t\t\t\t\t+\"size=\"+$(\"#size\").val()+\"amount=\"+$(\"#updateCart\").val() //\r\n");
        out.write("\t\t\t\t\t\t\t\t\t$.ajax({ // url : url_update, // success : function(data) { //\r\n");
        out.write("\t\t\t\t\t\t\t\t\t$('#message').html(data); // } // }); // }); // });\r\n");
        out.write("-->\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t</script> -->\r\n");
        out.write("\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t<div class=\"produced\"> -->\r\n");
        out.write("\t\t\t\t\t\t\t");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t</div> -->\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /WEB-INF/view/checkout.jsp(241,10) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/view/checkout.jsp(241,10) '${sessionScope.shopCart.orderBeans}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${sessionScope.shopCart.orderBeans}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/view/checkout.jsp(241,10) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("orderBean");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<tr class=\"cart-header\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><a href=\"single.html\" class=\"at-in\"><img\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderBean.imageThumbnail }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" class=\"img-responsive\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\talt=\"Responsive image\"></a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"sed\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h5>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderBean.name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"product_id\" type=\"hidden\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderBean.productId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"color\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"color\" type=\"color\" disabled=\"disabled\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"#");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderBean.color}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"size\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"size\" type=\"number\" disabled=\"disabled\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderBean.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderBean.price }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><form id=\"updateProductToCart\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\taction=\"updateProductToCart?productId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderBean.productId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("&color=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderBean.color}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("&size=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderBean.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"number\" id=\"updateCart\" name=\"amount\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tonload=\"updateCart()\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderBean.amount }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tmin=\"1\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</form></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${appProperties[\"label.deliver\"] }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"item_price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderBean.sumMoney }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"remove-check\"><a\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\thref=\"removeProductToCart?productId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderBean.productId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("&color=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderBean.color}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("&size=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderBean.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${appProperties[\"button.name.delete\"] }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</a></td>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
    int _jspx_eval_c_005fotherwise_005f1 = _jspx_th_c_005fotherwise_005f1.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<div class=\"product-section-head-text\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<h3 align=\"center\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<span>Cart is empty</span>\r\n");
        out.write("\t\t\t\t\t\t\t\t</h3>\r\n");
        out.write("\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f1);
    return false;
  }
}
