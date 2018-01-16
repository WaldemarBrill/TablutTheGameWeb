
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
                  DATE: Tue Jan 16 02:44:31 CET 2018
                  SOURCE: D:/Repository/TablutTheGameWeb/app/views/game.scala.html
                  HASH: 816e5343d6722e0f4573ee023fea2b218e310067
                  MATRIX: 810->1|837->20|875->21|904->24|1600->692|1629->693|1658->694|1701->709|1730->710|1759->711
                  LINES: 26->1|26->1|26->1|27->2|42->17|42->17|42->17|42->17|42->17|42->17
                  -- GENERATED --
              */
          