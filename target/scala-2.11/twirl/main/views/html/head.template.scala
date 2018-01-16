
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
import play.api.mvc._
import play.api.data._

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
                  DATE: Tue Jan 16 02:44:31 CET 2018
                  SOURCE: D:/Repository/TablutTheGameWeb/app/views/head.scala.html
                  HASH: c3020aecbe959eeae083f62e592729ba3d8d4a0e
                  MATRIX: 733->1|858->31|888->35|1310->430|1325->436|1388->478|1464->527|1479->533|1539->572|1793->799|1808->805|1876->852|2275->1224|2303->1231
                  LINES: 21->1|26->1|28->3|37->12|37->12|37->12|40->15|40->15|40->15|44->19|44->19|44->19|59->34|59->34
                  -- GENERATED --
              */
          