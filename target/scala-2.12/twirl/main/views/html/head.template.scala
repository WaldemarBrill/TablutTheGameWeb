
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object head extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE HTML>
<html lang="en">
    <head>
    	<!-- Bootstrap CSS -->
    	<meta charset="utf-8">
    	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    	
    	<!-- Stylesheet -->
    	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
    	<link rel="stylesheet" media="screen" href=""""),_display_(/*12.51*/routes/*12.57*/.Assets.versioned("stylesheets/style.css")),format.raw/*12.99*/("""">
    	
    	<!-- VUE -->
    	<script src=""""),_display_(/*15.20*/routes/*15.26*/.Assets.versioned("javascripts/vue.js")),format.raw/*15.65*/(""""></script>
    	
    	<!-- Javascript -->
    	<script src="https://code.jquery.com/jquery-3.2.1.min.js" integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=" crossorigin="anonymous"></script>
    	<script src=""""),_display_(/*19.20*/routes/*19.26*/.Assets.versioned("javascripts/tablut_game.js")),format.raw/*19.73*/(""""></script>
    	
    	
    	
    	<title>TablutTheGame</title>
        <table id="linker">
            <tr>
                <th><a href="/tablut">Zum Spiel</a></th>
                <th><a href="/help">Hilfe</a></th>
                <th><a href="/controls">Steuerung</a></th>
            </tr>
        </table>
        
    </head>
    <body>
        <div>"""),_display_(/*34.15*/content),format.raw/*34.22*/("""</div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
    </body>
</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Jan 16 02:00:09 CET 2018
                  SOURCE: D:/Repository/TablutTheGameWeb/app/views/head.scala.html
                  HASH: e4231babd33a1c82dabcfa1aa87eac4550400dd8
                  MATRIX: 952->1|1077->31|1107->35|1529->430|1544->436|1607->478|1683->527|1698->533|1758->572|2012->799|2027->805|2095->852|2494->1224|2522->1231
                  LINES: 28->1|33->1|35->3|44->12|44->12|44->12|47->15|47->15|47->15|51->19|51->19|51->19|66->34|66->34
                  -- GENERATED --
              */
          