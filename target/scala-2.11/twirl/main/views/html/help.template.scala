
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

object help extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE HTML>
<html lang="en">
<head>
	<!-- Bootstrap CSS -->
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

	<!-- Stylesheet	-->
	<link rel="stylesheet" media="screen" href=""""),_display_(/*11.47*/routes/*11.53*/.Assets.versioned("stylesheets/style.css")),format.raw/*11.95*/("""">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
	
	<script src="https://code.jquery.com/jquery-3.2.1.min.js" integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=" crossorigin="anonymous"></script>
	
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
	<div id="help">
		<h1><strong>Tablut - das Spiel aus dem Norden</strong></h1>
		
		<p>Dieses Spiel entdeckte der gro&szlig;e Naturforscher Carl von Linn&eacute; in Lappland und schrieb es in seinem Tagebuch auf. Tablut geh&ouml;rt zu einer Gruppe von Spielen, die es schon seit dem 4. Jahrhundert nach Christus im Norden Europas gibt. Die Wikinger brachten diese Spiele bei ihren Seefahrten auch nach England und Island. Wir bieten das spiel in drei Varianten (9x9, 11x11 und 13x13). Die klassischste Variante ist hierbei das 9x9-Spielfeld, welche sich Hnefatafl nennt.</p>
		
		<h2><strong>Das Spielprinzip</strong></h2>
		
		<p>Der gro&szlig;e Unterschied zu andern klassischen Brettspielen, wie M&uuml;hle und Schach, besteht darin, dass die zwei Spieler verschiedene Ziele zu erreichen haben um zu gewinnen. So hat ein Spieler das Ziel, den K&ouml;nig des andern Spieler zu umzingeln, diesen nennt man Angreifer, w&auml;hrend der Verteidiger versuchen muss seinen K&ouml;nig in eines der vier Eckfelder zu bewegen. Daraus ergeben sich die verschiedensten Strategien und Spielerlebnisse. F&uuml;r den Anfang mag es auch so erscheinen, dass der Angreifende Spieler eine gr&ouml;&szlig;ere Herausforderung zu bew&auml;ltigen hat.</p>
		
		<p>&nbsp;</p>
		
		<p class="cimg"><img alt="Mathematisches Brettspiel Tablut - das Spiel aus dem Norden" src="http://www.labbe.de/spielotti/mathematische_brettspiele/htm_jpg/tablut.jpg" /></p>
		
		<h2><strong>Spielanleitung</strong></h2>
		
		<p>Die Startaufstellung(9x9-Feld) seht ihr auf dem Bild. Auf dem Feld in der Mitte steht der K&ouml;nig. Er wird von acht Verteidigern bewacht, die kreuzf&ouml;rmig um ihn herum stehen. Der Gegner hat insgesamt 16 Angreifer, die vier Gruppen bilden.</p>
		
		<p><img src="http://www.labbe.de/spielotti/mathematische_brettspiele/htm_jpg/tablut_anleitung_a.gif" /></p>
		
		<h3>Das Ziehen</h3>
		
		<p>Das K&ouml;nigsfeld in der Mitte des Spielfelds darf nur vom K&ouml;nig betreten werden. Die anderen Spielsteine d&uuml;rfen aber dar&uuml;ber hinwegziehen. Die Eckfelder d&uuml;rfen ebenfalls auschlie&szlig;lich nur vom K&ouml;nig betreten werden. Gezogen wird abwechselnd, beginnend mit dem Angreifer,&nbsp;einen eigenen Spielstein senkrecht oder waagerecht &uuml;ber eine beliebige Anzahl freier Felder. &Uuml;berspringen ist nicht erlaubt. Es besteht Zugzwang!</p>
		
		<p>&nbsp;</p>
		
		<h3>Die Gefangennahme</h3>
		
		<ul>
			<li>Eine Figur wird gefangen, wenn sie <em>aktiv </em>von zwei gegen&uuml;berliegenden Seiten durch gegnerische Figuren eingeschlossen wird. Eine gefangene Figur wird sofort vom Spielplan entfernt.</li>
			<img alt="" src="https://upload.wikimedia.org/wikipedia/commons/a/a4/Tafl_catching_01.svg" />
			<li>Eine Figur kann jedoch <i>ungestraft</i> zwischen zwei gegnerische Figuren ziehen, ohne dabei gefangen zu werden.</li>
			<img alt="" src="https://upload.wikimedia.org/wikipedia/commons/3/31/Tafl_catching_04.svg" />
			<li>Der K&ouml;nig ist gefangen, sobald er von vier Gegnern eingekreist ist. Wenn er direkt neben dem Thron steht, muss er nur von drei Gegnern umzingelt werden. Gleiches gillt f&uuml;r den Spielfeldrand.</li>
			<img alt="" src="https://upload.wikimedia.org/wikipedia/commons/a/ae/Tafl_catching_05.svg" />
			<li>Es ist ebenfalls m&ouml;glich, mehrere gegnerische Figuren auf einmal zu schlagen, wenn eigene und gegnerische Steine abwechselnd in einer Reihe positioniert sind. Der letzte eigene Stein vervollst&auml;ndigt dabei die Reihe.</li>
		</ul>
		
		<h3>Das Gewinnen</h3>
		
		<p>Wie breits erw&auml;hnt, muss der K&ouml;nig in eins der vier Eckfelder kommen. Wird er jedoch von den Angreifern auf allen vier Seiten kreuzf&ouml;rmig umstellt, ist er gefangen und verliert. Hierbei ist zu beachten, dass sowohl das K&ouml;nigsfeld in der Mitte, als auch der Spielrand als Uzingelnder Spielstein z&auml;hlt. Dies hat zu Folge, dass lediglich drei Angreiffer zu Umzingelung von n&ouml;ten sind.</p>
	</div>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
</body>
</html>"""))
      }
    }
  }

  def render(name:String): play.twirl.api.HtmlFormat.Appendable = apply(name)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (name) => apply(name)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Jan 16 02:44:31 CET 2018
                  SOURCE: D:/Repository/TablutTheGameWeb/app/views/help.scala.html
                  HASH: 45a791ba0d576304e112bc7a65cf9b660b128241
                  MATRIX: 728->1|837->15|867->19|1146->271|1161->277|1224->319
                  LINES: 21->1|26->1|28->3|36->11|36->11|36->11
                  -- GENERATED --
              */
          