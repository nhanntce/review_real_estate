package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ObjectInfo.Image;
import Model.ImageModel;
import ObjectInfo.Product;
import java.util.ArrayList;
import Model.ProductModel;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    ProductModel pm = new ProductModel();
    ImageModel im = new ImageModel();
    ArrayList<Product> ninhKieu = pm.getProductByDistrict(1);
    ArrayList<Product> caiRang = pm.getProductByDistrict(3);
    ArrayList<Product> phongDien = pm.getProductByDistrict(4);
    ArrayList<Product> binhThuy = pm.getProductByDistrict(2);

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css\\\\style2.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css\\\\responsive.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css\\\\aos.css\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \n");
      out.write("        <link rel=\"icon\" type=\"image/png\" sizes=\"56x56\" href=\"images/logo/logo.png\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">-->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"move-top\">\n");
      out.write("            <a href=\"#\"><i class=\"fa fa-sort-asc\"></i></a>\n");
      out.write("        </div>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light nav-bg\" id=\"nav\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\"><img id=\"logo\" src=\"images/logo/logo.png\" alt=\"\"></a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <i class=\"fa fa-bars\"></i>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"homepage.jsp\">Home</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"product-list-client.jsp\">Product</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"homepage.jsp#team\">Our team</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"homepage.jsp#services\">Services</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"homepage.jsp#team\">Our team</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"homepage.jsp#contact\">Contact</a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--- Slinder--->\n");
      out.write("        <div id=\"slider\">\n");
      out.write("            <div id=\"headerSlider\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                <ol class=\"carousel-indicators\">\n");
      out.write("                    <li data-target=\"#headerSlider\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                    <li data-target=\"#headerSlider\" data-slide-to=\"1\"></li>\n");
      out.write("                    <li data-target=\"#headerSlider\" data-slide-to=\"2\"></li>\n");
      out.write("                </ol>\n");
      out.write("                <div class=\"carousel-inner\">\n");
      out.write("                    <div class=\"carousel-item active\">\n");
      out.write("                        <img class=\"d-block img-fluid\" src=\"images/home/slide-one.jpg\" alt=\"First slide\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <img class=\"d-block img-fluid\" src=\"images/home/slide-two.jpg\" alt=\"Second slide\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <img class=\"d-block img-fluid\" src=\"images/home/slide-four.jpeg\" alt=\"Third slide\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <a class=\"carousel-control-prev\" href=\"#headerSlider\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"sr-only\">Previous</span>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"carousel-control-next\" href=\"#headerSlider\" role=\"button\" data-slide=\"next\">\n");
      out.write("                    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"sr-only\">Next</span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--About-->\n");
      out.write("        <section id=\"list-product\">\n");
      out.write("            <div class=\"text-center\">\n");
      out.write("                <h1>Ninh Kieu</h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    ");

                        for (int i = 0; i < 3; i++) {
                            ArrayList<Image> image = im.getImageByIdProduct(ninhKieu.get(i).getIdProduct());
                            String img = image.get(0).getImage();
                    
      out.write("\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <div class=\"product-item\" data-aos=\"fade-up\">\n");
      out.write("                            <div class=\"image-item\">\n");
      out.write("                                <img src=\"images/products/");
      out.print(image.get(0).getImage());
      out.write("\" alt=\"aa\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"product-info\">\n");
      out.write("                                <div class=\"link\">\n");
      out.write("                                    <a href=\"product-detail-client-home.jsp?id=");
      out.print(ninhKieu.get(i).getIdProduct());
      out.write("\" style=\"color: #000;\">The house</a>\n");
      out.write("                                </div>\n");
      out.write("                                <span id=\"p-address\"><i class=\"fa fa-map-marker\"></i> ");
      out.print(ninhKieu.get(i).getPosition());
      out.write("</span>\n");
      out.write("                                <h5 id=\"p-price\">Price: ");
      out.print(ninhKieu.get(i).getPrice());
      out.write(" million</h5>\n");
      out.write("                                <div id=\"p-date\">\n");
      out.write("                                    <p>");
      out.print(ninhKieu.get(i).getPublicTime());
      out.write("</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"text-center\">\n");
      out.write("                <h1>Cai Rang</h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    ");

                        for (int i = 0; i < 3; i++) {
                            ArrayList<Image> image = im.getImageByIdProduct(caiRang.get(i).getIdProduct());
                            String img = image.get(0).getImage();
                    
      out.write("\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <div class=\"product-item\" data-aos=\"fade-down\">\n");
      out.write("                            <div class=\"image-item\">\n");
      out.write("                                <img src=\"images/products/");
      out.print(image.get(0).getImage());
      out.write("\" alt=\"aa\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"product-info\">\n");
      out.write("                                <div class=\"link\">\n");
      out.write("                                    <a href=\"product-detail-client-home.jsp?id=");
      out.print(caiRang.get(i).getIdProduct());
      out.write("\" style=\"color: #000;\">The house</a>\n");
      out.write("                                </div>\n");
      out.write("                                <span id=\"p-address\"><i class=\"fa fa-map-marker\"></i> ");
      out.print(caiRang.get(i).getPosition());
      out.write("</span>\n");
      out.write("                                <h5 id=\"p-price\">Price: ");
      out.print(caiRang.get(i).getPrice());
      out.write(" million</h5>\n");
      out.write("                                <div id=\"p-date\">\n");
      out.write("                                    <p>");
      out.print(caiRang.get(i).getPublicTime());
      out.write("</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"text-center\">\n");
      out.write("                <h1>Binh Thuy</h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    ");

                        for (int i = 0; i < 3; i++) {
                            ArrayList<Image> image = im.getImageByIdProduct(binhThuy.get(i).getIdProduct());
                            String img = image.get(0).getImage();
                    
      out.write("\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <div class=\"product-item\" data-aos=\"fade-up-right\">\n");
      out.write("                            <div class=\"image-item\">\n");
      out.write("                                <img src=\"images/products/");
      out.print(image.get(0).getImage());
      out.write("\" alt=\"aa\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"product-info\">\n");
      out.write("                                <div class=\"link\">\n");
      out.write("                                    <a href=\"product-detail-client-home.jsp?id=");
      out.print(binhThuy.get(i).getIdProduct());
      out.write("\" style=\"color: #000;\">The house</a>\n");
      out.write("                                </div>\n");
      out.write("                                <span id=\"p-address\"><i class=\"fa fa-map-marker\"></i> ");
      out.print(binhThuy.get(i).getPosition());
      out.write("</span>\n");
      out.write("                                <h5 id=\"p-price\">Price: ");
      out.print(binhThuy.get(i).getPrice());
      out.write(" million</h5>\n");
      out.write("                                <div id=\"p-date\">\n");
      out.write("                                    <p>");
      out.print(binhThuy.get(i).getPublicTime());
      out.write("</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"text-center\">\n");
      out.write("                <h1>Phong Dien</h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    ");

                        for (int i = 0; i < 3; i++) {
                            ArrayList<Image> image = im.getImageByIdProduct(phongDien.get(i).getIdProduct());
                            String img = image.get(0).getImage();
                    
      out.write("\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <div class=\"product-item\" data-aos=\"fade-up-left\">\n");
      out.write("                            <div class=\"image-item\">\n");
      out.write("                                <img src=\"images/products/");
      out.print(image.get(0).getImage());
      out.write("\" alt=\"aa\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"product-info\">\n");
      out.write("                                <div class=\"link\">\n");
      out.write("                                    <a href=\"product-detail-client-home.jsp?id=");
      out.print(phongDien.get(i).getIdProduct());
      out.write("\" style=\"color: #000;\">The house</a>\n");
      out.write("                                </div>\n");
      out.write("                                <span id=\"p-address\"><i class=\"fa fa-map-marker\"></i> ");
      out.print(phongDien.get(i).getPosition());
      out.write("</span>\n");
      out.write("                                <h5 id=\"p-price\">Price: ");
      out.print(phongDien.get(i).getPrice());
      out.write(" million</h5>\n");
      out.write("                                <div id=\"p-date\">\n");
      out.write("                                    <p>");
      out.print(phongDien.get(i).getPublicTime());
      out.write("</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div> <!--phon dien-->\n");
      out.write("        </section>\n");
      out.write("        <!--    Service-->\n");
      out.write("        <section id=\"services\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h1>How to buy a house</h1>\n");
      out.write("                <div class=\"row services\">\n");
      out.write("                    <div class=\"col-md-3 text-center\">\n");
      out.write("                        <div class=\"icon\">\n");
      out.write("                            <i class=\"fa fa-info\"></i>\n");
      out.write("                        </div>\n");
      out.write("                        <h3>Enter your information</h3>\n");
      out.write("                        <p>Let's leave your information here. We will contact to you.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3 text-center\">\n");
      out.write("                        <div class=\"icon\">\n");
      out.write("                            <i class=\"fa fa-meetup\"></i>\n");
      out.write("                        </div>\n");
      out.write("                        <h3>Have a meeting</h3>\n");
      out.write("                        <p>We have a day to meet to you. Get information, exchange question.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3 text-center\">\n");
      out.write("                        <div class=\"icon\">\n");
      out.write("                            <i class=\"fa fa-money\"></i>\n");
      out.write("                        </div>\n");
      out.write("                        <h3>Deal</h3>\n");
      out.write("                        <p>payment and get your own house</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3 text-center\">\n");
      out.write("                        <div class=\"icon\">\n");
      out.write("                            <i class=\"fa fa-home\"></i>\n");
      out.write("                        </div>\n");
      out.write("                        <h3>Stay</h3>\n");
      out.write("                        <p>After payment, you can stay in your house.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!--Team Members-->\n");
      out.write("        <section id=\"team\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h1>Our Team</h1>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-3 profile-pic text-center\">\n");
      out.write("                        <div class=\"img-box\" data-aos=\"fade-up\">\n");
      out.write("                            <img src=\"images/team/handsomeboy.jpg\" class=\"img-responsive\">\n");
      out.write("                            <ul>\n");
      out.write("                                <a href=\"#\"><li><i class=\"fa fa-facebook\"></i></li></a>\n");
      out.write("                                <a href=\"#\"><li><i class=\"fa fa-twitter\"></i></li></a>\n");
      out.write("                                <a href=\"#\"><li><i class=\"fa fa-linkedin\"></i></li></a>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <h2 data-aos=\"fade-up\">Nguyen Thanh Nhan</h2>\n");
      out.write("                        <h3 data-aos=\"fade-up\">Fouder / CEO</h3>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-3 profile-pic text-center\">\n");
      out.write("                        <div class=\"img-box\" data-aos=\"fade-up\">\n");
      out.write("                            <img src=\"images/team/linh.jpg\" class=\"img-responsive\">\n");
      out.write("                            <ul>\n");
      out.write("                                <a href=\"#\"><li><i class=\"fa fa-facebook\"></i></li></a>\n");
      out.write("                                <a href=\"#\"><li><i class=\"fa fa-twitter\"></i></li></a>\n");
      out.write("                                <a href=\"#\"><li><i class=\"fa fa-linkedin\"></i></li></a>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <h2 data-aos=\"fade-up\">Nguyen Chi Linh</h2>\n");
      out.write("                        <h3 data-aos=\"fade-up\">Fouder / CEO</h3>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-3 profile-pic text-center\">\n");
      out.write("                        <div class=\"img-box\" data-aos=\"fade-up\">\n");
      out.write("                            <img src=\"images/team/hai.jpg\" class=\"img-responsive\">\n");
      out.write("                            <ul>\n");
      out.write("                                <a href=\"#\"><li><i class=\"fa fa-facebook\"></i></li></a>\n");
      out.write("                                <a href=\"#\"><li><i class=\"fa fa-twitter\"></i></li></a>\n");
      out.write("                                <a href=\"#\"><li><i class=\"fa fa-linkedin\"></i></li></a>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <h2 data-aos=\"fade-up\">Mac Truong Hai</h2>\n");
      out.write("                        <h3 data-aos=\"fade-up\">Fouder / CEO</h3>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-3 profile-pic text-center\">\n");
      out.write("                        <div class=\"img-box\" data-aos=\"fade-up\">\n");
      out.write("                            <img src=\"images/team/pig.jpg\" class=\"img-responsive\">\n");
      out.write("                            <ul>\n");
      out.write("                                <a href=\"#\"><li><i class=\"fa fa-facebook\"></i></li></a>\n");
      out.write("                                <a href=\"#\"><li><i class=\"fa fa-twitter\"></i></li></a>\n");
      out.write("                                <a href=\"#\"><li><i class=\"fa fa-linkedin\"></i></li></a>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <h2 data-aos=\"fade-up\">Ma Anh Hoang</h2>\n");
      out.write("                        <h3 data-aos=\"fade-up\">Fouder / CEO</h3>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!--Promo-->\n");
      out.write("        <section id=\"promo\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <p data-aos=\"fade-right\">Buy or rent a house</p>\n");
      out.write("                <a href=\"#contact\" class=\"btn btn-primary\" data-aos=\"fade-left\">Contact Us</a>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--Get in Touch-->\n");
      out.write("        <section id=\"contact\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h1>Get in Touch</h1>\n");
      out.write("\n");
      out.write("                <form class=\"contact-form\" name=\"myForm\" id=\"myForm\" onsubmit=\"return validation()\" action=\"Customer-new-save-home.jsp\">\n");
      out.write("                    <div class=\"form-group\"  data-aos=\"fade-right\">\n");
      out.write("                        <label>Phone </label>\n");
      out.write("                        <input type=\"number\" class=\"form-control\" placeholder=\"Your phone...\"  name=\"cusPhone\" id=\"phone\" required>\n");
      out.write("                        <p id=\"phoneErr\"></p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\" data-aos=\"fade-left\">\n");
      out.write("                        <label>Name </label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Your name...\" id=\"client-name\" name=\"cusName\" required>\n");
      out.write("                        <p id=\"nameErr\"></p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\" data-aos=\"fade-right\">\n");
      out.write("                        <label>Email </label>\n");
      out.write("                        <input type=\"email\" class=\"form-control\" placeholder=\"Email...\" id=\"email\" name=\"cusMail\" required>\n");
      out.write("                        <p id=\"emailErr\"></p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"cusBirth\">BirthDay :</label>\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <div class=\"col-1\">\n");
      out.write("                                <select id=\"cusDayofBirth\" name=\"cusDayofBirth\" class=\"custom-select\">\n");
      out.write("                                    ");
                                    for (int i = 1; i <= 31; i++) {
                                    
      out.write("\n");
      out.write("                                    <option value=");
      out.print(i);
      out.write('>');
      out.print(i);
      out.write("</option>\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-1\">\n");
      out.write("                                <select id=\"cusMonthofBirth\" name=\"cusMonthofBirth\" class=\"custom-select\">\n");
      out.write("                                    ");

                                        for (int i = 1; i <= 12; i++) {
                                    
      out.write("\n");
      out.write("                                    <option value=");
      out.print(i);
      out.write('>');
      out.print(i);
      out.write("</option>\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-2\">\n");
      out.write("                                <select id=\"cusYearofBirth\" name=\"cusYearofBirth\" class=\"custom-select\">\n");
      out.write("                                    ");

                                        for (int i = 1900; i <= 2019; i++) {
                                    
      out.write("\n");
      out.write("                                    <option value=");
      out.print(i);
      out.write('>');
      out.print(i);
      out.write("</option>\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label >Gender* :</label> \n");
      out.write("                        <div>\n");
      out.write("                            <input type=\"radio\" id=\"male\" name=\"cusGender\" value=\"1\" checked> Male<br>\n");
      out.write("                            <input type=\"radio\" id=\"female\" name=\"cusGender\" value=\"2\"> Female<br>\n");
      out.write("                        </div>  \n");
      out.write("                    </div> \n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">SEND MESSAGE</button>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("        <!--Footer-->\n");
      out.write("        <section id=\"footer\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <p data-aos=\"fade-up\">Địa chỉ: 600, đường Nguyễn Văn Cừ (nối dài), phường An Bình,<br> quận Ninh Kiều, TP. Cần Thơ</p>\n");
      out.write("                        <p data-aos=\"fade-up\">Hotline: 0965689616</p>\n");
      out.write("                        <p data-aos=\"fade-up\">Zalo: 0965689616</p>\n");
      out.write("                        <p data-aos=\"fade-up\">Facebook: 0965689616</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <h4 data-aos=\"fade-up\">Contact with us</h4>\n");
      out.write("                        <i class=\"fa fa-facebook\" data-aos=\"fade-up\"></i>\n");
      out.write("                        <i class=\"fa fa-instagram\" data-aos=\"fade-up\"></i>\n");
      out.write("                        <i class=\"fa fa-skype\" data-aos=\"fade-up\"></i>\n");
      out.write("                        <i class=\"fa fa-youtube\" data-aos=\"fade-up\"></i>\n");
      out.write("                        <i class=\"fa fa-linkedin\" data-aos=\"fade-up\"></i>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <div class=\"design-by text-center\">\n");
      out.write("            <p>Designed by <span><a href=\"https://www.facebook.com/thanhnhan2102\">Across Border</a></span></p>\n");
      out.write("        </div>\n");
      out.write("        <!--Footer end-->\n");
      out.write("        <script src=\"js/smooth-scroll.js\"></script>\n");
      out.write("        <script src=\"js/aos.js\"></script>\n");
      out.write("        <script>\n");
      out.write("                    function validation() {\n");
      out.write("                        var phone = document.getElementById(\"phone\");\n");
      out.write("                        var name = document.getElementById(\"client-name\");\n");
      out.write("                        var email = document.getElementById(\"email\");\n");
      out.write("                        console.log(phone);\n");
      out.write("                        console.log(email);\n");
      out.write("                        var phoneErr = document.getElementById(\"phoneErr\");\n");
      out.write("                        var nameErr = document.getElementById(\"nameErr\");\n");
      out.write("                        var emailErr = document.getElementById(\"emailErr\");\n");
      out.write("                        var phoneCheck = /((09|03|07|08|05)+[0-9]{8})$/i.test(phone.value);\n");
      out.write("                        var emailCheck = /^(([^<>()[\\]\\\\.,;:\\s@\\\"]+(\\.[^<>()[\\]\\\\.,;:\\s@\\\"]+)*)|(\\\".+\\\"))@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$/i.test(email.value);\n");
      out.write("                        console.log(phoneCheck);\n");
      out.write("                        console.log(emailCheck);\n");
      out.write("\n");
      out.write("                        if (!phoneCheck || !emailCheck) {\n");
      out.write("                            if (!phoneCheck)\n");
      out.write("                                phoneErr.innerHTML = \"Phone invalid!\";\n");
      out.write("                            if (!emailCheck)\n");
      out.write("                                emailErr.innerHTML = \"Mail invalid!\";\n");
      out.write("                            return false;\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("            document.addEventListener(\"DOMContentLoaded\", function () {\n");
      out.write("                //nav\n");
      out.write("\n");
      out.write("                AOS.init();\n");
      out.write("                var nav = document.querySelector('nav');\n");
      out.write("                var logo = document.getElementById('logo');\n");
      out.write("                var onTop = true;\n");
      out.write("                var dictrict = document.getElementsByClassName('dictrict');\n");
      out.write("\n");
      out.write("                window.addEventListener(\"scroll\", function () {\n");
      out.write("                    if (window.pageYOffset > 500) {\n");
      out.write("                        if (onTop) {\n");
      out.write("                            nav.classList.add('navbar-top');\n");
      out.write("                            nav.classList.add('nav-bg-change');\n");
      out.write("                            logo.classList.add('logo');\n");
      out.write("                            onTop = false;\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    if (window.pageYOffset <= 500) {\n");
      out.write("                        if (!onTop) {\n");
      out.write("                            nav.classList.remove('navbar-top');\n");
      out.write("                            nav.classList.remove('nav-bg-change');\n");
      out.write("                            logo.classList.remove('logo');\n");
      out.write("                            onTop = true;\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("//                    if (window.pageYOffset >= 300) {\n");
      out.write("//                        for (var i = 0; i < dictrict.length; i++) {\n");
      out.write("//                            dictrict[i].classList.add('top');\n");
      out.write("//                        }\n");
      out.write("//                    }\n");
      out.write("\n");
      out.write("                });\n");
      out.write("                var scroll = new SmoothScroll('a[href*=\"#\"]');\n");
      out.write("            }, false);\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            $(\"#phone\").blur(function () {\n");
      out.write("                var phone = $('#phone').val();\n");
      out.write("                $.ajax({\n");
      out.write("                    url: \"check-client-exists.jsp\",\n");
      out.write("                    type: 'POST',\n");
      out.write("                    data: {phone: phone},\n");
      out.write("                    success: function (data) {\n");
      out.write("                        if (data !== \"\") {\n");
      out.write("                            var dataList = data.split(\",\");\n");
      out.write("                            document.getElementById(\"client-name\").value = dataList[0];\n");
      out.write("                            document.getElementById(\"email\").value = dataList[1];\n");
      out.write("                            document.getElementById(\"cusDayofBirth\").value = new Number(dataList[2]);\n");
      out.write("                            document.getElementById(\"cusMonthofBirth\").value = new Number(dataList[3]) + \"\";\n");
      out.write("                            console.log(new Number(dataList[3]));\n");
      out.write("                            document.getElementById(\"cusYearofBirth\").value = dataList[4];\n");
      out.write("                            if (dataList[5] === 1)\n");
      out.write("                                document.getElementById(\"male\").checked = true;\n");
      out.write("                            else {\n");
      out.write("                                document.getElementById(\"male\").checked = false;\n");
      out.write("                                document.getElementById(\"female\").checked = true;\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("//                        var dataList = data.split(\",\");  \n");
      out.write("\n");
      out.write("                        console.log(data);\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
