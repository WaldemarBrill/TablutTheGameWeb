
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

object game extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/head("Game Tablut")/*1.21*/{_display_(Seq[Any](format.raw/*1.22*/("""
	"""),format.raw/*2.2*/("""<div id="status_elemente">
		<div class="btn-group">
			<button class="btn btn-default dropdown-toggle" type="button" data-toggle="dropdown">Menu<span class="caret"></span></button>
			<ul class="dropdown-menu">
				<li><a role="button" data-toggle="modal" size="9">Neustart 9 x 9</a></li>
				<li><a role="button" data-toggle="modal" size="11">Neustart 11 x 11</a></li>
				<li><a role="button" data-toggle="modal" size="13">Neustart 13 x 13</a></li>
			</ul>
		</div>
		<ul id="status_fenster">
			<p>Bewegungs Nachricht</p>
			<li v-for="status in status_list" v-text="status"></li>
		</ul>
	</div>
	<div id="spiel_elemente">
		<div id="player_turn">"""),format.raw/*17.25*/("""{"""),format.raw/*17.26*/("""{"""),format.raw/*17.27*/("""get_player_turn"""),format.raw/*17.42*/("""}"""),format.raw/*17.43*/("""}"""),format.raw/*17.44*/("""</div>
    	<table id="Gamefield" size="0"></table>
    </div>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Jan 16 02:00:09 CET 2018
                  SOURCE: D:/Repository/TablutTheGameWeb/app/views/game.scala.html
                  HASH: 2d9587b78a0152ccd61538317d066b4a5effac4e
                  MATRIX: 1029->1|1056->20|1094->21|1123->24|1819->692|1848->693|1877->694|1920->709|1949->710|1978->711
                  LINES: 33->1|33->1|33->1|34->2|49->17|49->17|49->17|49->17|49->17|49->17
                  -- GENERATED --
              */
          