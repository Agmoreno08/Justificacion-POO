/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.97
 * Generated at: 2024-12-02 18:11:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.xava;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class core_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/xava/imports.jsp", Long.valueOf(1731691888000L));
    _jspx_dependants.put("jar:file:/C:/Users/zirda/OneDrive/Escritorio/openxava-studio-7-r3-windows/openxava-studio-7-r3/workspace/justificationpoo/target/justificationpoo/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt-1_0.tld", Long.valueOf(1153406682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1731629573212L));
    _jspx_dependants.put("/WEB-INF/openxava.tld", Long.valueOf(1731691888000L));
    _jspx_dependants.put("/xava/viewExt.jsp", Long.valueOf(1731691888000L));
    _jspx_dependants.put("jar:file:/C:/Users/zirda/OneDrive/Escritorio/openxava-studio-7-r3-windows/openxava-studio-7-r3/workspace/justificationpoo/target/justificationpoo/WEB-INF/lib/jstl-1.2.jar!/META-INF/c-1_0.tld", Long.valueOf(1153406682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
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
      out.write("\r\n");
      org.openxava.util.Messages errors = null;
      errors = (org.openxava.util.Messages) _jspx_page_context.getAttribute("errors", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (errors == null){
        errors = new org.openxava.util.Messages();
        _jspx_page_context.setAttribute("errors", errors, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\r');
      out.write('\n');
      org.openxava.util.Messages messages = null;
      messages = (org.openxava.util.Messages) _jspx_page_context.getAttribute("messages", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (messages == null){
        messages = new org.openxava.util.Messages();
        _jspx_page_context.setAttribute("messages", messages, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\r');
      out.write('\n');
      org.openxava.web.style.Style style = null;
      style = (org.openxava.web.style.Style) _jspx_page_context.getAttribute("style", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (style == null){
        style = new org.openxava.web.style.Style();
        _jspx_page_context.setAttribute("style", style, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\r');
      out.write('\n');
      org.openxava.controller.ModuleContext context = null;
      synchronized (session) {
        context = (org.openxava.controller.ModuleContext) _jspx_page_context.getAttribute("context", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (context == null){
          context = new org.openxava.controller.ModuleContext();
          _jspx_page_context.setAttribute("context", context, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");

org.openxava.controller.ModuleManager manager = (org.openxava.controller.ModuleManager) context.get(request, "manager");
org.openxava.view.View view = (org.openxava.view.View) context.get(request, "xava_view");
boolean buttonBar = !"false".equalsIgnoreCase(request.getParameter("buttonBar")); 
String focusPropertyId = manager.isListMode()?org.openxava.web.Lists.FOCUS_PROPERTY_ID:view.getFocusPropertyId();

      out.write("\r\n");
      out.write("<form id=\"");
      if (_jspx_meth_xava_005fid_005f0(_jspx_page_context))
        return;
      out.write("\" name=\"");
      if (_jspx_meth_xava_005fid_005f1(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("	class=\"xava_form\" method='POST' ");
      out.print(manager.getEnctype());
      out.write(" \r\n");
      out.write("	");
      out.print(manager.getFormAction(request));
      out.write(">\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("<INPUT type=\"hidden\" name=\"");
      if (_jspx_meth_xava_005fid_005f2(_jspx_page_context))
        return;
      out.write("\" value=\"\"/>\r\n");
      out.write("<INPUT type=\"hidden\" name=\"");
      if (_jspx_meth_xava_005fid_005f3(_jspx_page_context))
        return;
      out.write("\" value=\"\"/>\r\n");
      out.write("<INPUT type=\"hidden\" name=\"");
      if (_jspx_meth_xava_005fid_005f4(_jspx_page_context))
        return;
      out.write("\" value=\"\"/>\r\n");
      out.write("<INPUT type=\"hidden\" name=\"");
      if (_jspx_meth_xava_005fid_005f5(_jspx_page_context))
        return;
      out.write("\" value=\"\"/>\r\n");
      out.write("<INPUT type=\"hidden\" name=\"");
      if (_jspx_meth_xava_005fid_005f6(_jspx_page_context))
        return;
      out.write("\" value=\"");
      out.print(request.getParameter("application"));
      out.write("\"/>\r\n");
      out.write("<INPUT type=\"hidden\" name=\"");
      if (_jspx_meth_xava_005fid_005f7(_jspx_page_context))
        return;
      out.write("\" value=\"");
      out.print(request.getParameter("module"));
      out.write("\"/>\r\n");
      out.write("<INPUT type=\"hidden\" name=\"");
      if (_jspx_meth_xava_005fid_005f8(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("<INPUT type=\"hidden\" id=\"");
      if (_jspx_meth_xava_005fid_005f9(_jspx_page_context))
        return;
      out.write("\" \r\n");
      out.write("	name=\"");
      if (_jspx_meth_xava_005fid_005f10(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("<INPUT type=\"hidden\" id=\"");
      if (_jspx_meth_xava_005fid_005f11(_jspx_page_context))
        return;
      out.write("\" \r\n");
      out.write("	name=\"");
      if (_jspx_meth_xava_005fid_005f12(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("<INPUT type=\"hidden\" name=\"");
      if (_jspx_meth_xava_005fid_005f13(_jspx_page_context))
        return;
      out.write("\"/> \r\n");
      out.write("<INPUT type=\"hidden\" id=\"");
      if (_jspx_meth_xava_005fid_005f14(_jspx_page_context))
        return;
      out.write("\" \r\n");
      out.write("	name=\"");
      if (_jspx_meth_xava_005fid_005f15(_jspx_page_context))
        return;
      out.write("\" value=\"");
      out.print(focusPropertyId);
      out.write("\"/>\r\n");
      out.write("	\r\n");

String listModeClass=manager.isListMode()?"class='" + style.getListMode() + "'":""; 

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div ");
      out.print(listModeClass);
      out.write(">\r\n");
      out.write("\r\n");
      out.write("	");
 if (buttonBar) {	
      out.write(" \r\n");
      out.write("    <div id='");
      if (_jspx_meth_xava_005fid_005f16(_jspx_page_context))
        return;
      out.write("' class=\"");
      out.print(style.getButtonBarContainer());
      out.write("\">     \r\n");
      out.write("		");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "buttonBar.jsp", out, false);
      out.write(" \r\n");
      out.write("	</div>\r\n");
      out.write("	");
 } 
      out.write("\r\n");
      out.write("	    \r\n");
      out.write("    \r\n");
      out.write("    <div class=\"");
      out.print(style.getView());
      out.write("\">\r\n");
      out.write("    ");
 if (style.isShowModuleDescription() && !manager.isListMode()) { 
      out.write("\r\n");
      out.write("		<div class=\"");
      out.print(style.getModuleDescription());
      out.write("\"> \r\n");
      out.write("		");
      out.print(manager.getModuleDescription());
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	");
 } 
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    	<div id='");
      if (_jspx_meth_xava_005fid_005f17(_jspx_page_context))
        return;
      out.write("' class=\"ox-display-inline\"> \r\n");
      out.write("    		");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "errors.jsp", out, false);
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("    \r\n");
      out.write("		<div id='");
      if (_jspx_meth_xava_005fid_005f18(_jspx_page_context))
        return;
      out.write("' class=\"ox-display-inline\"> \r\n");
      out.write("			");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "messages.jsp", out, false);
      out.write("\r\n");
      out.write("		</div>            \r\n");
      out.write("\r\n");
      out.write("    	<div id='");
      if (_jspx_meth_xava_005fid_005f19(_jspx_page_context))
        return;
      out.write('\'');
      out.write(' ');
      out.print(manager.isListMode()?"":("class='ox-detail" + (view.isSimple()?" ox-simple-layout":"") + (view.isFlowLayout()?" ox-flow-layout":"") +  "'"));
      out.write(">\r\n");
      out.write("			");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, manager.getViewURL(), out, false);
      out.write("		\r\n");
      out.write("		</div>    	\r\n");
      out.write("		\r\n");
      out.write("		");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	");
 if (style.isSeparatorBeforeBottomButtons()) { 
      out.write(" \r\n");
      out.write("	<div class=\"ox-core-bottom-buttons-separator\"></div>\r\n");
      out.write("	");
 } 
      out.write(" \r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("    <div id='");
      if (_jspx_meth_xava_005fid_005f20(_jspx_page_context))
        return;
      out.write("' class=\"");
      out.print(style.getBottomButtons());
      out.write("\">\r\n");
      out.write("		");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "bottomButtons.jsp", out, false);
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("    \r\n");
      out.write("</div>\r\n");
      out.write(" \r\n");
      out.write("</form>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_xava_005fid_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:id
    org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f0 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
    _jspx_th_xava_005fid_005f0.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fid_005f0.setParent(null);
    // /xava/core.jsp(14,10) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fid_005f0.setName("form");
    int _jspx_eval_xava_005fid_005f0 = _jspx_th_xava_005fid_005f0.doStartTag();
    if (_jspx_th_xava_005fid_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f0);
    return false;
  }

  private boolean _jspx_meth_xava_005fid_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:id
    org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f1 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
    _jspx_th_xava_005fid_005f1.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fid_005f1.setParent(null);
    // /xava/core.jsp(14,40) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fid_005f1.setName("form");
    int _jspx_eval_xava_005fid_005f1 = _jspx_th_xava_005fid_005f1.doStartTag();
    if (_jspx_th_xava_005fid_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f1);
    return false;
  }

  private boolean _jspx_meth_xava_005fid_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:id
    org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f2 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
    _jspx_th_xava_005fid_005f2.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fid_005f2.setParent(null);
    // /xava/core.jsp(23,27) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fid_005f2.setName("xava_action");
    int _jspx_eval_xava_005fid_005f2 = _jspx_th_xava_005fid_005f2.doStartTag();
    if (_jspx_th_xava_005fid_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f2);
    return false;
  }

  private boolean _jspx_meth_xava_005fid_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:id
    org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f3 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
    _jspx_th_xava_005fid_005f3.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fid_005f3.setParent(null);
    // /xava/core.jsp(24,27) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fid_005f3.setName("xava_action_argv");
    int _jspx_eval_xava_005fid_005f3 = _jspx_th_xava_005fid_005f3.doStartTag();
    if (_jspx_th_xava_005fid_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f3);
    return false;
  }

  private boolean _jspx_meth_xava_005fid_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:id
    org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f4 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
    _jspx_th_xava_005fid_005f4.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fid_005f4.setParent(null);
    // /xava/core.jsp(25,27) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fid_005f4.setName("xava_action_range");
    int _jspx_eval_xava_005fid_005f4 = _jspx_th_xava_005fid_005f4.doStartTag();
    if (_jspx_th_xava_005fid_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f4);
    return false;
  }

  private boolean _jspx_meth_xava_005fid_005f5(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:id
    org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f5 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
    _jspx_th_xava_005fid_005f5.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fid_005f5.setParent(null);
    // /xava/core.jsp(26,27) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fid_005f5.setName("xava_action_already_processed");
    int _jspx_eval_xava_005fid_005f5 = _jspx_th_xava_005fid_005f5.doStartTag();
    if (_jspx_th_xava_005fid_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f5);
    return false;
  }

  private boolean _jspx_meth_xava_005fid_005f6(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:id
    org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f6 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
    _jspx_th_xava_005fid_005f6.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fid_005f6.setParent(null);
    // /xava/core.jsp(27,27) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fid_005f6.setName("xava_action_application");
    int _jspx_eval_xava_005fid_005f6 = _jspx_th_xava_005fid_005f6.doStartTag();
    if (_jspx_th_xava_005fid_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f6);
    return false;
  }

  private boolean _jspx_meth_xava_005fid_005f7(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:id
    org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f7 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
    _jspx_th_xava_005fid_005f7.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fid_005f7.setParent(null);
    // /xava/core.jsp(28,27) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fid_005f7.setName("xava_action_module");
    int _jspx_eval_xava_005fid_005f7 = _jspx_th_xava_005fid_005f7.doStartTag();
    if (_jspx_th_xava_005fid_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f7);
    return false;
  }

  private boolean _jspx_meth_xava_005fid_005f8(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:id
    org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f8 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
    _jspx_th_xava_005fid_005f8.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fid_005f8.setParent(null);
    // /xava/core.jsp(29,27) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fid_005f8.setName("xava_changed_property");
    int _jspx_eval_xava_005fid_005f8 = _jspx_th_xava_005fid_005f8.doStartTag();
    if (_jspx_th_xava_005fid_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f8);
    return false;
  }

  private boolean _jspx_meth_xava_005fid_005f9(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:id
    org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f9 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
    _jspx_th_xava_005fid_005f9.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fid_005f9.setParent(null);
    // /xava/core.jsp(30,25) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fid_005f9.setName("xava_current_focus");
    int _jspx_eval_xava_005fid_005f9 = _jspx_th_xava_005fid_005f9.doStartTag();
    if (_jspx_th_xava_005fid_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f9);
    return false;
  }

  private boolean _jspx_meth_xava_005fid_005f10(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:id
    org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f10 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
    _jspx_th_xava_005fid_005f10.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fid_005f10.setParent(null);
    // /xava/core.jsp(31,7) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fid_005f10.setName("xava_current_focus");
    int _jspx_eval_xava_005fid_005f10 = _jspx_th_xava_005fid_005f10.doStartTag();
    if (_jspx_th_xava_005fid_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f10);
    return false;
  }

  private boolean _jspx_meth_xava_005fid_005f11(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:id
    org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f11 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
    _jspx_th_xava_005fid_005f11.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fid_005f11.setParent(null);
    // /xava/core.jsp(32,25) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fid_005f11.setName("xava_previous_focus");
    int _jspx_eval_xava_005fid_005f11 = _jspx_th_xava_005fid_005f11.doStartTag();
    if (_jspx_th_xava_005fid_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f11);
    return false;
  }

  private boolean _jspx_meth_xava_005fid_005f12(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:id
    org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f12 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
    _jspx_th_xava_005fid_005f12.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fid_005f12.setParent(null);
    // /xava/core.jsp(33,7) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fid_005f12.setName("xava_previous_focus");
    int _jspx_eval_xava_005fid_005f12 = _jspx_th_xava_005fid_005f12.doStartTag();
    if (_jspx_th_xava_005fid_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f12);
    return false;
  }

  private boolean _jspx_meth_xava_005fid_005f13(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:id
    org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f13 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
    _jspx_th_xava_005fid_005f13.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fid_005f13.setParent(null);
    // /xava/core.jsp(34,27) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fid_005f13.setName("xava_focus_forward");
    int _jspx_eval_xava_005fid_005f13 = _jspx_th_xava_005fid_005f13.doStartTag();
    if (_jspx_th_xava_005fid_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f13);
    return false;
  }

  private boolean _jspx_meth_xava_005fid_005f14(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:id
    org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f14 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
    _jspx_th_xava_005fid_005f14.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fid_005f14.setParent(null);
    // /xava/core.jsp(35,25) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fid_005f14.setName("xava_focus_property_id");
    int _jspx_eval_xava_005fid_005f14 = _jspx_th_xava_005fid_005f14.doStartTag();
    if (_jspx_th_xava_005fid_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f14);
    return false;
  }

  private boolean _jspx_meth_xava_005fid_005f15(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:id
    org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f15 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
    _jspx_th_xava_005fid_005f15.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fid_005f15.setParent(null);
    // /xava/core.jsp(36,7) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fid_005f15.setName("xava_focus_property_id");
    int _jspx_eval_xava_005fid_005f15 = _jspx_th_xava_005fid_005f15.doStartTag();
    if (_jspx_th_xava_005fid_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f15);
    return false;
  }

  private boolean _jspx_meth_xava_005fid_005f16(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:id
    org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f16 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
    _jspx_th_xava_005fid_005f16.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fid_005f16.setParent(null);
    // /xava/core.jsp(45,13) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fid_005f16.setName("button_bar");
    int _jspx_eval_xava_005fid_005f16 = _jspx_th_xava_005fid_005f16.doStartTag();
    if (_jspx_th_xava_005fid_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f16);
    return false;
  }

  private boolean _jspx_meth_xava_005fid_005f17(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:id
    org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f17 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
    _jspx_th_xava_005fid_005f17.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fid_005f17.setParent(null);
    // /xava/core.jsp(58,14) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fid_005f17.setName("errors");
    int _jspx_eval_xava_005fid_005f17 = _jspx_th_xava_005fid_005f17.doStartTag();
    if (_jspx_th_xava_005fid_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f17);
    return false;
  }

  private boolean _jspx_meth_xava_005fid_005f18(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:id
    org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f18 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
    _jspx_th_xava_005fid_005f18.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fid_005f18.setParent(null);
    // /xava/core.jsp(62,11) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fid_005f18.setName("messages");
    int _jspx_eval_xava_005fid_005f18 = _jspx_th_xava_005fid_005f18.doStartTag();
    if (_jspx_th_xava_005fid_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f18);
    return false;
  }

  private boolean _jspx_meth_xava_005fid_005f19(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:id
    org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f19 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
    _jspx_th_xava_005fid_005f19.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fid_005f19.setParent(null);
    // /xava/core.jsp(66,14) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fid_005f19.setName("view");
    int _jspx_eval_xava_005fid_005f19 = _jspx_th_xava_005fid_005f19.doStartTag();
    if (_jspx_th_xava_005fid_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f19);
    return false;
  }

  private boolean _jspx_meth_xava_005fid_005f20(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:id
    org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f20 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
    _jspx_th_xava_005fid_005f20.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fid_005f20.setParent(null);
    // /xava/core.jsp(79,13) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fid_005f20.setName("bottom_buttons");
    int _jspx_eval_xava_005fid_005f20 = _jspx_th_xava_005fid_005f20.doStartTag();
    if (_jspx_th_xava_005fid_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f20);
    return false;
  }
}
