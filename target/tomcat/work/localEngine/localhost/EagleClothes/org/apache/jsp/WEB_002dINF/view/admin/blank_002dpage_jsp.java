package org.apache.jsp.WEB_002dINF.view.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class blank_002dpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta name=\"description\" content=\"\">\n");
      out.write("<meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("<title>SB Admin - Bootstrap Admin Template</title>\n");
      out.write("\n");
      out.write("<!-- Bootstrap Core CSS -->\n");
      out.write("<link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Custom CSS -->\n");
      out.write("<link href=\"../css/sb-admin.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Custom Fonts -->\n");
      out.write("<link href=\"../font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\"\n");
      out.write("\ttype=\"text/css\">\n");
      out.write("\n");
      out.write("<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<div id=\"wrapper\">\n");
      out.write("\n");
      out.write("\t\t<!-- Navigation -->\n");
      out.write("\t\t<nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("\t\t\t<!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\n");
      out.write("\t\t\t\t\tdata-target=\".navbar-ex1-collapse\">\n");
      out.write("\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span> <span\n");
      out.write("\t\t\t\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\n");
      out.write("\t\t\t\t\t\tclass=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"index.html\">SB Admin</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- Top Menu Items -->\n");
      out.write("\t\t\t<ul class=\"nav navbar-right top-nav\">\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\"\n");
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\"><i class=\"fa fa-envelope\"></i> <b\n");
      out.write("\t\t\t\t\t\tclass=\"caret\"></b></a>\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu message-dropdown\">\n");
      out.write("\t\t\t\t\t\t<li class=\"message-preview\"><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"media\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"pull-left\"> <img class=\"media-object\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsrc=\"http://placehold.it/50x50\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"media-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"media-heading\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<strong>John Smith</strong>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"small text-muted\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-clock-o\"></i> Yesterday at 4:32 PM\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur...</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"message-preview\"><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"media\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"pull-left\"> <img class=\"media-object\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsrc=\"http://placehold.it/50x50\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"media-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"media-heading\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<strong>John Smith</strong>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"small text-muted\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-clock-o\"></i> Yesterday at 4:32 PM\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur...</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"message-preview\"><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"media\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"pull-left\"> <img class=\"media-object\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsrc=\"http://placehold.it/50x50\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"media-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"media-heading\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<strong>John Smith</strong>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"small text-muted\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-clock-o\"></i> Yesterday at 4:32 PM\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur...</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"message-footer\"><a href=\"#\">Read All New\n");
      out.write("\t\t\t\t\t\t\t\tMessages</a></li>\n");
      out.write("\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\"\n");
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\"><i class=\"fa fa-bell\"></i> <b\n");
      out.write("\t\t\t\t\t\tclass=\"caret\"></b></a>\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu alert-dropdown\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Alert Name <span\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"label label-default\">Alert Badge</span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Alert Name <span\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"label label-primary\">Alert Badge</span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Alert Name <span\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"label label-success\">Alert Badge</span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Alert Name <span class=\"label label-info\">Alert\n");
      out.write("\t\t\t\t\t\t\t\t\tBadge</span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Alert Name <span\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"label label-warning\">Alert Badge</span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Alert Name <span\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"label label-danger\">Alert Badge</span></a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">View All</a></li>\n");
      out.write("\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\"\n");
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\"><i class=\"fa fa-user\"></i> John Smith <b\n");
      out.write("\t\t\t\t\t\tclass=\"caret\"></b></a>\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-fw fa-user\"></i> Profile</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-fw fa-envelope\"></i>\n");
      out.write("\t\t\t\t\t\t\t\tInbox</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-fw fa-gear\"></i> Settings</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-fw fa-power-off\"></i> Log\n");
      out.write("\t\t\t\t\t\t\t\tOut</a></li>\n");
      out.write("\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t<!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse navbar-ex1-collapse\">\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav side-nav\">\n");
      out.write("\t\t\t\t\t<li><a href=\"index.html\"><i class=\"fa fa-fw fa-dashboard\"></i>\n");
      out.write("\t\t\t\t\t\t\tDashboard</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"charts.html\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-fw fa-bar-chart-o\"></i> Charts</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"tables.html\"><i class=\"fa fa-fw fa-table\"></i>\n");
      out.write("\t\t\t\t\t\t\tTables</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"forms.html\"><i class=\"fa fa-fw fa-edit\"></i>\n");
      out.write("\t\t\t\t\t\t\tForms</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"bootstrap-elements.html\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-fw fa-desktop\"></i> Bootstrap Elements</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"bootstrap-grid.html\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-fw fa-wrench\"></i> Bootstrap Grid</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"javascript:;\" data-toggle=\"collapse\"\n");
      out.write("\t\t\t\t\t\tdata-target=\"#demo\"><i class=\"fa fa-fw fa-arrows-v\"></i>\n");
      out.write("\t\t\t\t\t\t\tDropdown <i class=\"fa fa-fw fa-caret-down\"></i></a>\n");
      out.write("\t\t\t\t\t\t<ul id=\"demo\" class=\"collapse\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Dropdown Item</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Dropdown Item</a></li>\n");
      out.write("\t\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t\t<li class=\"active\"><a href=\"blank-page.html\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-fw fa-file\"></i> Blank Page</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"index-rtl.html\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-fw fa-dashboard\"></i> RTL Dashboard</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- /.navbar-collapse -->\n");
      out.write("\t\t</nav>\n");
      out.write("\n");
      out.write("\t\t<div id=\"page-wrapper\">\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- Page Heading -->\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-12\">\n");
      out.write("\t\t\t\t\t\t<h1 class=\"page-header\">\n");
      out.write("\t\t\t\t\t\t\tBlank Page <small>Subheading</small>\n");
      out.write("\t\t\t\t\t\t</h1>\n");
      out.write("\t\t\t\t\t\t<ol class=\"breadcrumb\">\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"fa fa-dashboard\"></i> <a href=\"index.html\">Dashboard</a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"active\"><i class=\"fa fa-file\"></i> Blank Page</li>\n");
      out.write("\t\t\t\t\t\t</ol>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- /.row -->\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- /.container-fluid -->\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- /#page-wrapper -->\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<!-- /#wrapper -->\n");
      out.write("\n");
      out.write("\t<!-- jQuery -->\n");
      out.write("\t<script src=\"../js/jquery.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Bootstrap Core JavaScript -->\n");
      out.write("\t<script src=\"../js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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
