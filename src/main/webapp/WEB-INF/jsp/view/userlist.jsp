<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html lang="zh-cn">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Gentelella Alela! | </title>

    <!-- Bootstrap -->
    <link href="${ctx}/vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="${ctx}/vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="${ctx}/vendors/nprogress/nprogress.css" rel="stylesheet">
    <!-- iCheck -->
   <link href="../vendors/iCheck/skins/flat/green.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="${ctx}/build/css/custom.min.css" rel="stylesheet">
  </head>

  <body class="nav-md">
    <div class="container body">
      <div class="main_container">
        <jsp:include page="${ctx}/base/left.jsp"/>
        <!-- top navigation -->
        <jsp:include page="${ctx}/base/top.jsp"/>
        <!-- /top navigation -->

        <!-- page content -->
        <div class="right_col" role="main">
          <div class="">
            <!-- <div class="page-title">
              <div class="title_left">
                <h3>Tables <small>Some examples to get you started</small></h3>
              </div>

              <div class="title_right">
                <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
                  <div class="input-group">
                    <input type="text" class="form-control" placeholder="Search for...">
                    <span class="input-group-btn">
                      <button class="btn btn-default" type="button">Go!</button>
                    </span>
                  </div>
                </div>
              </div>
            </div> -->

            <div class="clearfix"></div>
 			
 			 <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>Plus Table Design</small></h2>
                    <ul class="nav navbar-right panel_toolbox">
                      <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                      </li>
                      <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
                        <ul class="dropdown-menu" role="menu">
                          <li><a href="#">Settings 1</a>
                          </li>
                          <li><a href="#">Settings 2</a>
                          </li>
                        </ul>
                      </li>
                      <li><a class="close-link"><i class="fa fa-close"></i></a>
                      </li>
                    </ul>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <p class="text-muted font-13 m-b-30">
                      DataTables has most features enabled by default, so all you need to do to use it with your own tables is to call the construction function: <code>$().DataTable();</code>
                    </p>
                    <table id="datatable-checkbox" class="table table-striped table-bordered bulk_action">
                      <thead>
                        <tr>
                          <th>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </th>
                          <th>Name</th>
                          <th>Position</th>
                          <th>Office</th>
                          <th>Age</th>
                          <th>Start date</th>
                          <th>Salary</th>
                        </tr>
                      </thead>


                      <tbody>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Tiger Nixon</td>
                          <td>System Architect</td>
                          <td>Edinburgh</td>
                          <td>61</td>
                          <td>2011/04/25</td>
                          <td>$320,800</td>
                        </tr>
                        <tr>
                         <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Garrett Winters</td>
                          <td>Accountant</td>
                          <td>Tokyo</td>
                          <td>63</td>
                          <td>2011/07/25</td>
                          <td>$170,750</td>
                        </tr>
                        <tr>
							<td>
								 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Ashton Cox</td>
                          <td>Junior Technical Author</td>
                          <td>San Francisco</td>
                          <td>66</td>
                          <td>2009/01/12</td>
                          <td>$86,000</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Cedric Kelly</td>
                          <td>Senior Javascript Developer</td>
                          <td>Edinburgh</td>
                          <td>22</td>
                          <td>2012/03/29</td>
                          <td>$433,060</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Airi Satou</td>
                          <td>Accountant</td>
                          <td>Tokyo</td>
                          <td>33</td>
                          <td>2008/11/28</td>
                          <td>$162,700</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Brielle Williamson</td>
                          <td>Integration Specialist</td>
                          <td>New York</td>
                          <td>61</td>
                          <td>2012/12/02</td>
                          <td>$372,000</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Herrod Chandler</td>
                          <td>Sales Assistant</td>
                          <td>San Francisco</td>
                          <td>59</td>
                          <td>2012/08/06</td>
                          <td>$137,500</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Rhona Davidson</td>
                          <td>Integration Specialist</td>
                          <td>Tokyo</td>
                          <td>55</td>
                          <td>2010/10/14</td>
                          <td>$327,900</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Colleen Hurst</td>
                          <td>Javascript Developer</td>
                          <td>San Francisco</td>
                          <td>39</td>
                          <td>2009/09/15</td>
                          <td>$205,500</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Sonya Frost</td>
                          <td>Software Engineer</td>
                          <td>Edinburgh</td>
                          <td>23</td>
                          <td>2008/12/13</td>
                          <td>$103,600</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Jena Gaines</td>
                          <td>Office Manager</td>
                          <td>London</td>
                          <td>30</td>
                          <td>2008/12/19</td>
                          <td>$90,560</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Quinn Flynn</td>
                          <td>Support Lead</td>
                          <td>Edinburgh</td>
                          <td>22</td>
                          <td>2013/03/03</td>
                          <td>$342,000</td>
                        </tr>
                        <tr>
						  <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Charde Marshall</td>
                          <td>Regional Director</td>
                          <td>San Francisco</td>
                          <td>36</td>
                          <td>2008/10/16</td>
                          <td>$470,600</td>
                        </tr>
                        <tr>
						   <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Haley Kennedy</td>
                          <td>Senior Marketing Designer</td>
                          <td>London</td>
                          <td>43</td>
                          <td>2012/12/18</td>
                          <td>$313,500</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Tatyana Fitzpatrick</td>
                          <td>Regional Director</td>
                          <td>London</td>
                          <td>19</td>
                          <td>2010/03/17</td>
                          <td>$385,750</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Michael Silva</td>
                          <td>Marketing Designer</td>
                          <td>London</td>
                          <td>66</td>
                          <td>2012/11/27</td>
                          <td>$198,500</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Paul Byrd</td>
                          <td>Chief Financial Officer (CFO)</td>
                          <td>New York</td>
                          <td>64</td>
                          <td>2010/06/09</td>
                          <td>$725,000</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Gloria Little</td>
                          <td>Systems Administrator</td>
                          <td>New York</td>
                          <td>59</td>
                          <td>2009/04/10</td>
                          <td>$237,500</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Bradley Greer</td>
                          <td>Software Engineer</td>
                          <td>London</td>
                          <td>41</td>
                          <td>2012/10/13</td>
                          <td>$132,000</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Dai Rios</td>
                          <td>Personnel Lead</td>
                          <td>Edinburgh</td>
                          <td>35</td>
                          <td>2012/09/26</td>
                          <td>$217,500</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Jenette Caldwell</td>
                          <td>Development Lead</td>
                          <td>New York</td>
                          <td>30</td>
                          <td>2011/09/03</td>
                          <td>$345,000</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Yuri Berry</td>
                          <td>Chief Marketing Officer (CMO)</td>
                          <td>New York</td>
                          <td>40</td>
                          <td>2009/06/25</td>
                          <td>$675,000</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Caesar Vance</td>
                          <td>Pre-Sales Support</td>
                          <td>New York</td>
                          <td>21</td>
                          <td>2011/12/12</td>
                          <td>$106,450</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Doris Wilder</td>
                          <td>Sales Assistant</td>
                          <td>Sidney</td>
                          <td>23</td>
                          <td>2010/09/20</td>
                          <td>$85,600</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Angelica Ramos</td>
                          <td>Chief Executive Officer (CEO)</td>
                          <td>London</td>
                          <td>47</td>
                          <td>2009/10/09</td>
                          <td>$1,200,000</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Gavin Joyce</td>
                          <td>Developer</td>
                          <td>Edinburgh</td>
                          <td>42</td>
                          <td>2010/12/22</td>
                          <td>$92,575</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Jennifer Chang</td>
                          <td>Regional Director</td>
                          <td>Singapore</td>
                          <td>28</td>
                          <td>2010/11/14</td>
                          <td>$357,650</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Brenden Wagner</td>
                          <td>Software Engineer</td>
                          <td>San Francisco</td>
                          <td>28</td>
                          <td>2011/06/07</td>
                          <td>$206,850</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Fiona Green</td>
                          <td>Chief Operating Officer (COO)</td>
                          <td>San Francisco</td>
                          <td>48</td>
                          <td>2010/03/11</td>
                          <td>$850,000</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Shou Itou</td>
                          <td>Regional Marketing</td>
                          <td>Tokyo</td>
                          <td>20</td>
                          <td>2011/08/14</td>
                          <td>$163,000</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Michelle House</td>
                          <td>Integration Specialist</td>
                          <td>Sidney</td>
                          <td>37</td>
                          <td>2011/06/02</td>
                          <td>$95,400</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Suki Burks</td>
                          <td>Developer</td>
                          <td>London</td>
                          <td>53</td>
                          <td>2009/10/22</td>
                          <td>$114,500</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Prescott Bartlett</td>
                          <td>Technical Author</td>
                          <td>London</td>
                          <td>27</td>
                          <td>2011/05/07</td>
                          <td>$145,000</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Gavin Cortez</td>
                          <td>Team Leader</td>
                          <td>San Francisco</td>
                          <td>22</td>
                          <td>2008/10/26</td>
                          <td>$235,500</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Martena Mccray</td>
                          <td>Post-Sales support</td>
                          <td>Edinburgh</td>
                          <td>46</td>
                          <td>2011/03/09</td>
                          <td>$324,050</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Unity Butler</td>
                          <td>Marketing Designer</td>
                          <td>San Francisco</td>
                          <td>47</td>
                          <td>2009/12/09</td>
                          <td>$85,675</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Howard Hatfield</td>
                          <td>Office Manager</td>
                          <td>San Francisco</td>
                          <td>51</td>
                          <td>2008/12/16</td>
                          <td>$164,500</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Hope Fuentes</td>
                          <td>Secretary</td>
                          <td>San Francisco</td>
                          <td>41</td>
                          <td>2010/02/12</td>
                          <td>$109,850</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Vivian Harrell</td>
                          <td>Financial Controller</td>
                          <td>San Francisco</td>
                          <td>62</td>
                          <td>2009/02/14</td>
                          <td>$452,500</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Timothy Mooney</td>
                          <td>Office Manager</td>
                          <td>London</td>
                          <td>37</td>
                          <td>2008/12/11</td>
                          <td>$136,200</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Jackson Bradshaw</td>
                          <td>Director</td>
                          <td>New York</td>
                          <td>65</td>
                          <td>2008/09/26</td>
                          <td>$645,750</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Olivia Liang</td>
                          <td>Support Engineer</td>
                          <td>Singapore</td>
                          <td>64</td>
                          <td>2011/02/03</td>
                          <td>$234,500</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Bruno Nash</td>
                          <td>Software Engineer</td>
                          <td>London</td>
                          <td>38</td>
                          <td>2011/05/03</td>
                          <td>$163,500</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Sakura Yamamoto</td>
                          <td>Support Engineer</td>
                          <td>Tokyo</td>
                          <td>37</td>
                          <td>2009/08/19</td>
                          <td>$139,575</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Thor Walton</td>
                          <td>Developer</td>
                          <td>New York</td>
                          <td>61</td>
                          <td>2013/08/11</td>
                          <td>$98,540</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Finn Camacho</td>
                          <td>Support Engineer</td>
                          <td>San Francisco</td>
                          <td>47</td>
                          <td>2009/07/07</td>
                          <td>$87,500</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Serge Baldwin</td>
                          <td>Data Coordinator</td>
                          <td>Singapore</td>
                          <td>64</td>
                          <td>2012/04/09</td>
                          <td>$138,575</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Zenaida Frank</td>
                          <td>Software Engineer</td>
                          <td>New York</td>
                          <td>63</td>
                          <td>2010/01/04</td>
                          <td>$125,250</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Zorita Serrano</td>
                          <td>Software Engineer</td>
                          <td>San Francisco</td>
                          <td>56</td>
                          <td>2012/06/01</td>
                          <td>$115,000</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Jennifer Acosta</td>
                          <td>Junior Javascript Developer</td>
                          <td>Edinburgh</td>
                          <td>43</td>
                          <td>2013/02/01</td>
                          <td>$75,650</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Cara Stevens</td>
                          <td>Sales Assistant</td>
                          <td>New York</td>
                          <td>46</td>
                          <td>2011/12/06</td>
                          <td>$145,600</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Hermione Butler</td>
                          <td>Regional Director</td>
                          <td>London</td>
                          <td>47</td>
                          <td>2011/03/21</td>
                          <td>$356,250</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Lael Greer</td>
                          <td>Systems Administrator</td>
                          <td>London</td>
                          <td>21</td>
                          <td>2009/02/27</td>
                          <td>$103,500</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Jonas Alexander</td>
                          <td>Developer</td>
                          <td>San Francisco</td>
                          <td>30</td>
                          <td>2010/07/14</td>
                          <td>$86,500</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Shad Decker</td>
                          <td>Regional Director</td>
                          <td>Edinburgh</td>
                          <td>51</td>
                          <td>2008/11/13</td>
                          <td>$183,000</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Michael Bruce</td>
                          <td>Javascript Developer</td>
                          <td>Singapore</td>
                          <td>29</td>
                          <td>2011/06/27</td>
                          <td>$183,000</td>
                        </tr>
                        <tr>
                          <td>
							 <th><input type="checkbox" id="check-all" class="flat"></th>
						  </td>
                          <td>Donna Snider</td>
                          <td>Customer Support</td>
                          <td>New York</td>
                          <td>27</td>
                          <td>2011/01/25</td>
                          <td>$112,000</td>
                        </tr>
                      </tbody>
                    </table>
                  </div>
                </div>
              </div>
 			
 			

              <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
            
                  <div class="x_title">
                  
                    <h2>用户列表 <small></small></h2>
                  
                   
                    
                    <ul class="nav navbar-right panel_toolbox">
                      <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                      </li>
                      <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
                        <ul class="dropdown-menu" role="menu">
                          <li><a href="#">Settings 1</a>
                          </li>
                        </ul>
                      </li>
                      <li><a class="close-link"><i class="fa fa-close"></i></a>
                      </li>
                    </ul>
                    <div class="clearfix"></div>
                  </div>

                  <div class="x_content">
					<!-- 标签 -->
                    <input type="text" placeholder="Last Name">
                    <button type="button" class="btn btn-round btn-primary">查询</button>
                    <button type="button" class="btn btn-round btn-success">新增</button>
                    <button type="button" class="btn btn-round btn-info">修改</button>
                    <button type="button" class="btn btn-round btn-warning">禁用</button>
                    <button type="button" class="btn btn-round btn-danger">删除</button>

                    <div class="table-responsive">
                      <table class="table table-striped jambo_table bulk_action">
                        <thead>
                          <tr class="headings">
                            <th>
                              <input type="checkbox" id="check-all" class="flat">
                            </th>
                            <th class="column-title">用户名</th>
                            <th class="column-title">真实姓名</th>
                            <th class="column-title">年龄 </th>
                            <th class="column-title">性别 </th>
                            <th class="column-title">电话 </th>
                            <th class="column-title">生日 </th>
                            <th class="column-title">状态 </th>
                            <th class="column-title no-link last"><span class="nobr">创建时间</span>
                            </th>
                            <th class="bulk-actions" colspan="7">
                              <a class="antoo" style="color:#fff; font-weight:500;">Bulk Actions ( <span class="action-cnt"> </span> ) <i class="fa fa-chevron-down"></i></a>
                            </th>
                          </tr>
                        </thead>
						<div id="userList">
                        <tbody>
                       <%--  <c:forEach var="user" items="${userList}">
                          <tr class="even pointer">
                            <td class="a-center ">
                              <input type="checkbox" class="flat" name="table_records">
                            </td>
                            <td class=" ">${user.username }</td>
                            <td class=" ">${user.realname }</td>
                            <td class=" ">${user.age }</td>
                            <td class=" ">
                            <c:if test="${user.sex==0 }">女</c:if>
                            <c:if test="${user.sex==1 }">男</c:if>
                            </td>
                            <td class=" ">Paid</td>
                            <td class="a-right a-right ">$7.45</td>
                            <td class=""><a href="#">View</a>
                            <td class=" last ">May 23, 2014 11:47:56 PM </td>
                            </td>
                          </tr>
                         </c:forEach> --%>
                         </div>
                        </tbody>
                      </table>
                    </div>
							
						
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- /page content -->

        <!-- footer content -->
        <footer>
          <div class="pull-right">
            Gentelella - Bootstrap Admin Template by <a href="https://colorlib.com">Colorlib</a>
          </div>
          <div class="clearfix"></div>
        </footer>
        <!-- /footer content -->
      </div>
    </div>

    <!-- jQuery -->
    <script src="../vendors/jquery/dist/jquery.min.js"></script>
    <!-- Bootstrap -->
    <script src="../vendors/bootstrap/dist/js/bootstrap.min.js"></script>
    <!-- FastClick -->
    <script src="../vendors/fastclick/lib/fastclick.js"></script>
    <!-- NProgress -->
    <script src="../vendors/nprogress/nprogress.js"></script>
    <!-- iCheck -->
    <script src="../vendors/iCheck/icheck.min.js"></script>
	
	<script src="../vendors/datatables.net/js/jquery.dataTables.min.js"></script>
    <script src="../vendors/datatables.net-bs/js/dataTables.bootstrap.min.js"></script>
    <script src="../vendors/datatables.net-buttons/js/dataTables.buttons.min.js"></script>
    <script src="../vendors/datatables.net-buttons-bs/js/buttons.bootstrap.min.js"></script>
    <script src="../vendors/datatables.net-buttons/js/buttons.flash.min.js"></script>
    <script src="../vendors/datatables.net-buttons/js/buttons.html5.min.js"></script>
    <script src="../vendors/datatables.net-buttons/js/buttons.print.min.js"></script>
    <script src="../vendors/datatables.net-fixedheader/js/dataTables.fixedHeader.min.js"></script>
    <script src="../vendors/datatables.net-keytable/js/dataTables.keyTable.min.js"></script>
    <script src="../vendors/datatables.net-responsive/js/dataTables.responsive.min.js"></script>
    <script src="../vendors/datatables.net-responsive-bs/js/responsive.bootstrap.js"></script>
    <script src="../vendors/datatables.net-scroller/js/dataTables.scroller.min.js"></script>
    <script src="../vendors/jszip/dist/jszip.min.js"></script>
    <script src="../vendors/pdfmake/build/pdfmake.min.js"></script>
    <script src="../vendors/pdfmake/build/vfs_fonts.js"></script>
	
	
	
    <!-- Custom Theme Scripts -->
    <script src="../build/js/custom.min.js"></script>
  </body>
</html>