/**
 * Documentation thanks to Mozilla Contributors
 * https://developer.mozilla.org/en-US/docs/Web/API
 */

package org.scalajs.dom

import scala.scalajs.js

trait GetSVGDocument extends js.Object {
  def getSVGDocument(): Document = ???
}

class SVGPathSegCurvetoQuadraticRel extends SVGPathSeg {
  var y: js.Number = _
  var y1: js.Number = _
  var x: js.Number = _
  var x1: js.Number = _
}


class SVGMarkerElement extends SVGElement with SVGStylable with SVGLangSpace with SVGFitToViewBox with SVGExternalResourcesRequired {
  var orientType: SVGAnimatedEnumeration = _
  var markerUnits: SVGAnimatedEnumeration = _
  var markerWidth: SVGAnimatedLength = _
  var markerHeight: SVGAnimatedLength = _
  var orientAngle: SVGAnimatedAngle = _
  var refY: SVGAnimatedLength = _
  var refX: SVGAnimatedLength = _

  def setOrientToAngle(angle: SVGAngle): Unit = ???

  def setOrientToAuto(): Unit = ???

  var SVG_MARKER_ORIENT_UNKNOWN: js.Number = _
  var SVG_MARKER_ORIENT_ANGLE: js.Number = _
  var SVG_MARKERUNITS_UNKNOWN: js.Number = _
  var SVG_MARKERUNITS_STROKEWIDTH: js.Number = _
  var SVG_MARKER_ORIENT_AUTO: js.Number = _
  var SVG_MARKERUNITS_USERSPACEONUSE: js.Number = _
}

object SVGMarkerElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGMarkerElement),List())))) */
  var SVG_MARKER_ORIENT_UNKNOWN: js.Number = _
  var SVG_MARKER_ORIENT_ANGLE: js.Number = _
  var SVG_MARKERUNITS_UNKNOWN: js.Number = _
  var SVG_MARKERUNITS_STROKEWIDTH: js.Number = _
  var SVG_MARKER_ORIENT_AUTO: js.Number = _
  var SVG_MARKERUNITS_USERSPACEONUSE: js.Number = _
}

/**
  * The SVGGElement interface corresponds to the <g> element.
*/
class SVGGElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
}


class SVGPathSegCurvetoCubicSmoothAbs extends SVGPathSeg {
  var y: js.Number = _
  var x2: js.Number = _
  var x: js.Number = _
  var y2: js.Number = _
}


class SVGZoomEvent extends UIEvent {
  var zoomRectScreen: SVGRect = _
  var previousScale: js.Number = _
  var newScale: js.Number = _
  var previousTranslate: SVGPoint = _
  var newTranslate: SVGPoint = _
}


trait SVGUnitTypes extends js.Object {
  var SVG_UNIT_TYPE_UNKNOWN: js.Number = _
  var SVG_UNIT_TYPE_OBJECTBOUNDINGBOX: js.Number = _
  var SVG_UNIT_TYPE_USERSPACEONUSE: js.Number = _
}

object SVGUnitTypes extends js.Object {
  var SVG_UNIT_TYPE_UNKNOWN: js.Number = _
  var SVG_UNIT_TYPE_OBJECTBOUNDINGBOX: js.Number = _
  var SVG_UNIT_TYPE_USERSPACEONUSE: js.Number = _
}

class SVGPathSegMovetoRel extends SVGPathSeg {
  var y: js.Number = _
  var x: js.Number = _
}


/**
  * The SVGLineElement interface provides access to the properties of <line>
  * elements, as well as methods to manipulate them.
*/
class SVGLineElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
/**
  * Corresponds to attribute y1 on the given <line> element.
*/
  var y1: SVGAnimatedLength = _
/**
  * Corresponds to attribute x2 on the given <line> element.
*/
  var x2: SVGAnimatedLength = _
/**
  * Corresponds to attribute x1 on the given <line> element.
*/
  var x1: SVGAnimatedLength = _
/**
  * Corresponds to attribute y2 on the given <line> element.
*/
  var y2: SVGAnimatedLength = _
}


/**
  * The SVGDescElement interface corresponds to the <desc> element.
*/
class SVGDescElement extends SVGElement with SVGStylable with SVGLangSpace {
}


class SVGPathSegCurvetoQuadraticSmoothRel extends SVGPathSeg {
  var y: js.Number = _
  var x: js.Number = _
}


/**
  * The SVGClipPathElement interface provides access to the properties of
  * <clippath> elements, as well as methods to manipulate them.
*/
class SVGClipPathElement extends SVGElement with SVGUnitTypes with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
/**
  * Corresponds to attribute clipPathUnits on the given <clippath> element. Takes
  * one of the constants defined in SVGUnitTypes
*/
  var clipPathUnits: SVGAnimatedEnumeration = _
}


/**
  * The SVGTextPositioningElement interface is inherited by text-related
  * interfaces: SVGTextElement, SVGTSpanElement, SVGTRefElement and
  * SVGAltGlyphElement.
*/
class SVGTextPositioningElement extends SVGTextContentElement {
/**
  * Corresponds to attribute y on the given element.
*/
  var y: SVGAnimatedLengthList = _
/**
  * Corresponds to attribute rotate on the given element.
*/
  var rotate: SVGAnimatedNumberList = _
/**
  * Corresponds to attribute dy on the given element.
*/
  var dy: SVGAnimatedLengthList = _
/**
  * Corresponds to attribute x on the given element.
*/
  var x: SVGAnimatedLengthList = _
/**
  * Corresponds to attribute dx on the given element.
*/
  var dx: SVGAnimatedLengthList = _
}


class SVGPathSegLinetoVerticalRel extends SVGPathSeg {
  var y: js.Number = _
}


/**
  * The SVGAnimatedString interface is used for attributes of type DOMString which
  * can be animated.
*/
class SVGAnimatedString extends js.Object {
/**
  * If the given attribute or property is being animated, contains the current
  * animated value of the attribute or property. If the given attribute or property is
  * not currently being animated, contains the same value as baseVal.
*/
  var animVal: js.String = _
/**
  * The base value of the given attribute before applying any animations.
*/
  var baseVal: js.String = _
}


/**
  * Interface SVGTests defines an interface which applies to all elements which have
  * attributes requiredFeatures, requiredExtensions and systemLanguage.
*/
trait SVGTests extends js.Object {
/**
  * Corresponds to attribute requiredFeatures on the given element.
*/
  var requiredFeatures: SVGStringList = _
/**
  * Corresponds to attribute requiredExtensions on the given element.
*/
  var requiredExtensions: SVGStringList = _
/**
  * Corresponds to attribute systemLanguage on the given element.
*/
  var systemLanguage: SVGStringList = _

/**
  * Returns true if the browser supports the given extension, specified by a URI.
*/
  def hasExtension(extension: js.String): js.Boolean = ???
}

/**
  * The SVGPatternElement interface corresponds to the <pattern> element.
*/
class SVGPatternElement extends SVGElement with SVGUnitTypes with SVGStylable with SVGLangSpace with SVGTests with SVGFitToViewBox with SVGExternalResourcesRequired with SVGURIReference {
/**
  * Corresponds to attribute patternUnits on the given <pattern> element. Takes one
  * of the constants defined in SVGUnitTypes.
*/
  var patternUnits: SVGAnimatedEnumeration = _
/**
  * Corresponds to attribute y on the given <pattern> element.
*/
  var y: SVGAnimatedLength = _
/**
  * Corresponds to attribute width on the given <pattern> element.
*/
  var width: SVGAnimatedLength = _
/**
  * Corresponds to attribute x on the given <pattern> element.
*/
  var x: SVGAnimatedLength = _
/**
  * Corresponds to attribute patternContentUnits on the given <pattern> element.
  * Takes one of the constants defined in SVGUnitTypes.
*/
  var patternContentUnits: SVGAnimatedEnumeration = _
/**
  * Corresponds to attribute patternTransform on the given <pattern> element.
*/
  var patternTransform: SVGAnimatedTransformList = _
/**
  * Corresponds to attribute height on the given <pattern> element.
*/
  var height: SVGAnimatedLength = _
}


/**
  * The SVGAnimatedAngle interface is used for attributes of basic type <angle> which
  * can be animated.
*/
class SVGAnimatedAngle extends js.Object {
/**
  * A read only SVGAngle representing the current animated value of the given
  * attribute. If the given attribute is not currently being animated, then the
  * SVGAngle will have the same contents as baseVal. The object referenced by animVal
  * will always be distinct from the one referenced by baseVal, even when the attribute
  * is not animated.
*/
  var animVal: SVGAngle = _
/**
  * The base value of the given attribute before applying any animations.
*/
  var baseVal: SVGAngle = _
}


/**
  * The SVGScriptElement interface corresponds to the SVG <script> element.
*/
class SVGScriptElement extends SVGElement with SVGExternalResourcesRequired with SVGURIReference {
  var `type`: js.String = _
}


/**
  * The SVGViewElement interface provides access to the properties of <view>
  * elements, as well as methods to manipulate them.
*/
class SVGViewElement extends SVGElement with SVGZoomAndPan with SVGFitToViewBox with SVGExternalResourcesRequired {
/**
  * Corresponds to attribute viewTarget on the given <view> element. A list of
  * DOMString values which contain the names listed in the viewTarget attribute. Each
  * of the DOMString values can be associated with the corresponding element using the
  * getElementById() method call.
*/
  var viewTarget: SVGStringList = _
}


trait SVGLocatable extends js.Object {
  var farthestViewportElement: SVGElement = _
  var nearestViewportElement: SVGElement = _

  def getBBox(): SVGRect = ???

  def getTransformToElement(element: SVGElement): SVGMatrix = ???

  def getCTM(): SVGMatrix = ???

  def getScreenCTM(): SVGMatrix = ???
}

/**
  * The SVGTitleElement interface corresponds to the <title> element.
*/
class SVGTitleElement extends SVGElement with SVGStylable with SVGLangSpace {
}


/**
  * The SVGAnimatedTransformList interface is used for attributes which take a list
  * of numbers and which can be animated.
*/
class SVGAnimatedTransformList extends js.Object {
/**
  * A read only SVGTransformList representing the current animated value of the given
  * attribute. If the given attribute is not currently being animated, then the
  * SVGTransformList will have the same contents as baseVal. The object referenced by
  * animVal will always be distinct from the one referenced by baseVal, even when the
  * attribute is not animated.
*/
  var animVal: SVGTransformList = _
/**
  * The base value of the given attribute before applying any animations.
*/
  var baseVal: SVGTransformList = _
}


trait SVGFitToViewBox extends js.Object {
  var viewBox: SVGAnimatedRect = _
  var preserveAspectRatio: SVGAnimatedPreserveAspectRatio = _
}

class SVGPointList extends js.Object {
  var numberOfItems: js.Number = _

  def replaceItem(newItem: SVGPoint, index: js.Number): SVGPoint = ???

  def getItem(index: js.Number): SVGPoint = ???

  def clear(): Unit = ???

  def appendItem(newItem: SVGPoint): SVGPoint = ???

  def initialize(newItem: SVGPoint): SVGPoint = ???

  def removeItem(index: js.Number): SVGPoint = ???

  def insertItemBefore(newItem: SVGPoint, index: js.Number): SVGPoint = ???
}


/**
  * The SVGAnimatedLengthList interface is used for attributes of type
  * SVGLengthList which can be animated.
*/
class SVGAnimatedLengthList extends js.Object {
/**
  * A read only SVGLengthList representing the current animated value of the given
  * attribute. If the given attribute is not currently being animated, then the
  * SVGLengthList will have the same contents as baseVal. The object referenced by
  * animVal will always be distinct from the one referenced by baseVal, even when the
  * attribute is not animated.
*/
  var animVal: SVGLengthList = _
/**
  * The base value of the given attribute before applying any animations.
*/
  var baseVal: SVGLengthList = _
}


/**
  * The SVGAnimatedPreserveAspectRatio interface is used for attributes of type
  * SVGPreserveAspectRatio which can be animated.
*/
class SVGAnimatedPreserveAspectRatio extends js.Object {
/**
  * A read only SVGPreserveAspectRatio representing the current animated value of
  * the given attribute. If the given attribute is not currently being animated, then
  * the SVGPreserveAspectRatio will have the same contents as baseVal. The object
  * referenced by animVal is always distinct from the one referenced by baseVal, even
  * when the attribute is not animated.
*/
  var animVal: SVGPreserveAspectRatio = _
/**
  * The base value of the given attribute before applying any animations.
*/
  var baseVal: SVGPreserveAspectRatio = _
}


trait SVGExternalResourcesRequired extends js.Object {
  var externalResourcesRequired: SVGAnimatedBoolean = _
}

/**
  * The SVGAngle interface correspond to the <angle> basic data type.
*/
class SVGAngle extends js.Object {
/**
  * The value as a string value, in the units expressed by unitType. Setting this
  * attribute will cause value, valueInSpecifiedUnits and unitType to be updated
  * automatically to reflect this setting. Exceptions on setting: a DOMException
  * with code SYNTAX_ERR is raised if the assigned string cannot be parsed as a valid
  * <angle>. a DOMException with code NO_MODIFICATION_ALLOWED_ERR is raised when
  * the length corresponds to a read only attribute or when the object itself is read
  * only.
*/
  var valueAsString: js.String = _
/**
  * The value as a floating point value, in the units expressed by unitType. Setting
  * this attribute will cause value and valueAsString to be updated automatically to
  * reflect this setting. Exceptions on setting: a DOMException with code
  * NO_MODIFICATION_ALLOWED_ERR is raised when the length corresponds to a read only
  * attribute or when the object itself is read only.
*/
  var valueInSpecifiedUnits: js.Number = _
/**
  * The value as a floating point value, in user units. Setting this attribute will
  * cause valueInSpecifiedUnits and valueAsString to be updated automatically to
  * reflect this setting. Exceptions on setting: a DOMException with code
  * NO_MODIFICATION_ALLOWED_ERR is raised when the length corresponds to a read only
  * attribute or when the object itself is read only.
*/
  var value: js.Number = _
/**
  * The type of the value as specified by one of the SVG_ANGLETYPE_* constants defined
  * on this interface.
*/
  var unitType: js.Number = _

/**
  * Reset the value as a number with an associated unitType, thereby replacing the
  * values for all of the attributes on the object. Exceptions: a DOMException with
  * code NOT_SUPPORTED_ERR is raised if unitType is SVG_ANGLETYPE_UNKNOWN or not a
  * valid unit type constant (one of the other SVG_ANGLETYPE_* constants defined on
  * this interface). a DOMException with code NO_MODIFICATION_ALLOWED_ERR is
  * raised when the length corresponds to a read only attribute or when the object
  * itself is read only.
*/
  def newValueSpecifiedUnits(unitType: js.Number, valueInSpecifiedUnits: js.Number): Unit = ???

/**
  * Preserve the same underlying stored value, but reset the stored unit identifier to
  * the given unitType. Object attributes unitType, valueInSpecifiedUnits and
  * valueAsString might be modified as a result of this method.
*/
  def convertToSpecifiedUnits(unitType: js.Number): Unit = ???

  var SVG_ANGLETYPE_RAD: js.Number = _
  var SVG_ANGLETYPE_UNKNOWN: js.Number = _
  var SVG_ANGLETYPE_UNSPECIFIED: js.Number = _
  var SVG_ANGLETYPE_DEG: js.Number = _
  var SVG_ANGLETYPE_GRAD: js.Number = _
}

/**
  * The SVGAngle interface correspond to the <angle> basic data type.
*/
object SVGAngle extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGAngle),List())))) */
  var SVG_ANGLETYPE_RAD: js.Number = _
/**
  * The unit type is not one of predefined unit types. It is invalid to attempt to define a
  * new value of this type or to attempt to switch an existing value to this type.
*/
  var SVG_ANGLETYPE_UNKNOWN: js.Number = _
  var SVG_ANGLETYPE_UNSPECIFIED: js.Number = _
/**
  * The unit type was explicitly set to degrees.
*/
  var SVG_ANGLETYPE_DEG: js.Number = _
  var SVG_ANGLETYPE_GRAD: js.Number = _
}

/**
  * All of the SVG DOM interfaces that correspond directly to elements in the SVG
  * language derive from the SVGElement interface.
*/
class SVGElement extends Element {
  var onmouseover: js.Function1[MouseEvent, js.Any] = _
/**
  * The element which established the current viewport. Often, the nearest ancestor
  * <svg> element. Null if the given element is the outermost svg element.
*/
  var viewportElement: SVGElement = _
  var onmousemove: js.Function1[MouseEvent, js.Any] = _
  var onmouseout: js.Function1[MouseEvent, js.Any] = _
  var ondblclick: js.Function1[MouseEvent, js.Any] = _
  var onfocusout: js.Function1[FocusEvent, js.Any] = _
  var onfocusin: js.Function1[FocusEvent, js.Any] = _
/**
  * Corresponds to attribute xml:base on the given element.
*/
  var xmlbase: js.String = _
  var onmousedown: js.Function1[MouseEvent, js.Any] = _
  var onload: js.Function1[Event, js.Any] = _
  var onmouseup: js.Function1[MouseEvent, js.Any] = _
  var onclick: js.Function1[MouseEvent, js.Any] = _
/**
  * The nearest ancestor <svg> element. Null if the given element is the outermost svg
  * element.
*/
  var ownerSVGElement: SVGSVGElement = _
/**
  * The value of the id attribute on the given element, or the empty string if id is not
  * present.
*/
  var id: js.String = _

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}


class SVGPathSegLinetoHorizontalAbs extends SVGPathSeg {
  var x: js.Number = _
}


class SVGPathSegArcAbs extends SVGPathSeg {
  var y: js.Number = _
  var sweepFlag: js.Boolean = _
  var r2: js.Number = _
  var x: js.Number = _
  var angle: js.Number = _
  var r1: js.Number = _
  var largeArcFlag: js.Boolean = _
}


/**
  * The SVGTransformList defines a list of SVGTransform objects.
*/
class SVGTransformList extends js.Object {
  var numberOfItems: js.Number = _

/**
  * Returns the specified item from the list. The returned item is the item itself and
  * not a copy. Any changes made to the item are immediately reflected in the list. The
  * first item is number 0. Exceptions: a DOMException with code
  * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
  * attribute or when the object itself is read only.
*/
  def getItem(index: js.Number): SVGTransform = ???

  def consolidate(): SVGTransform = ???

/**
  * Clears all existing current items from the list, with the result being an empty
  * list. Exceptions: a DOMException with code NO_MODIFICATION_ALLOWED_ERR is
  * raised when the list corresponds to a read only attribute or when the object itself
  * is read only.
*/
  def clear(): Unit = ???

/**
  * Inserts a new item at the end of the list. If newItem is already in a list, it is removed
  * from its previous list before it is inserted into this list. The inserted item is the
  * item itself and not a copy. Exceptions: a DOMException with code
  * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
  * attribute or when the object itself is read only.
*/
  def appendItem(newItem: SVGTransform): SVGTransform = ???

/**
  * Clears all existing current items from the list and re-initializes the list to hold
  * the single item specified by the parameter. If the inserted item is already in a
  * list, it is removed from its previous list before it is inserted into this list. The
  * inserted item is the item itself and not a copy. The return value is the item inserted
  * into the list. Exceptions: a DOMException with code
  * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
  * attribute or when the object itself is read only.
*/
  def initialize(newItem: SVGTransform): SVGTransform = ???

/**
  * Removes an existing item from the list. Exceptions: a DOMException with code
  * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
  * attribute or when the object itself is read only. a DOMException with code
  * INDEX_SIZE_ERR is raised if the index number is greater than or equal to
  * numberOfItems.
*/
  def removeItem(index: js.Number): SVGTransform = ???

/**
  * Inserts a new item into the list at the specified position. The first item is number
  * 0. If newItem is already in a list, it is removed from its previous list before it is
  * inserted into this list. The inserted item is the item itself and not a copy. If the
  * item is already in this list, note that the index of the item to insert before is
  * before the removal of the item. If the index is equal to 0, then the new item is
  * inserted at the front of the list. If the index is greater than or equal to
  * numberOfItems, then the new item is appended to the end of the list. Exceptions: a
  * DOMException with code NO_MODIFICATION_ALLOWED_ERR is raised when the list
  * corresponds to a read only attribute or when the object itself is read only.
*/
  def insertItemBefore(newItem: SVGTransform, index: js.Number): SVGTransform = ???

/**
  * Replaces an existing item in the list with a new item. If newItem is already in a list,
  * it is removed from its previous list before it is inserted into this list. The
  * inserted item is the item itself and not a copy. If the item is already in this list,
  * note that the index of the item to replace is before the removal of the item.
  * Exceptions: a DOMException with code NO_MODIFICATION_ALLOWED_ERR is raised
  * when the list corresponds to a read only attribute or when the object itself is read
  * only. a DOMException with code INDEX_SIZE_ERR is raised if the index number is
  * greater than or equal to numberOfItems.
*/
  def replaceItem(newItem: SVGTransform, index: js.Number): SVGTransform = ???

  def createSVGTransformFromMatrix(matrix: SVGMatrix): SVGTransform = ???
}


class SVGPathSegClosePath extends SVGPathSeg {
}


/**
  * The SVGAnimatedLength interface is used for attributes of basic type <length>
  * which can be animated.
*/
class SVGAnimatedLength extends js.Object {
/**
  * If the given attribute or property is being animated, contains the current
  * animated value of the attribute or property. If the given attribute or property is
  * not currently being animated, contains the same value as baseVal.
*/
  var animVal: SVGLength = _
/**
  * The base value of the given attribute before applying any animations.
*/
  var baseVal: SVGLength = _
}


/**
  * The SVGAnimatedPoints interface supports elements which have a points attribute
  * which holds a list of coordinate values and which support the ability to animate
  * that attribute.
*/
trait SVGAnimatedPoints extends js.Object {
/**
  * Provides access to the base (i.e., static) contents of the points attribute.
*/
  var points: SVGPointList = _
/**
  * Provides access to the current animated contents of the points attribute. If the
  * given attribute or property is being animated, contains the current animated
  * value of the attribute or property. If the given attribute or property is not
  * currently being animated, contains the same value as points.
*/
  var animatedPoints: SVGPointList = _
}

/**
  * The SVGDefsElement interface corresponds to the <defs> element.
*/
class SVGDefsElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
}


class SVGPathSegLinetoHorizontalRel extends SVGPathSeg {
  var x: js.Number = _
}


/**
  * The SVGEllipseElement interface provides access to the properties of <ellipse>
  * elements, as well as methods to manipulate them.
*/
class SVGEllipseElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
/**
  * Corresponds to attribute ry on the given <ellipse> element.
*/
  var ry: SVGAnimatedLength = _
/**
  * Corresponds to attribute cx on the given <ellipse> element.
*/
  var cx: SVGAnimatedLength = _
/**
  * Corresponds to attribute rx on the given <ellipse> element.
*/
  var rx: SVGAnimatedLength = _
/**
  * Corresponds to attribute cy on the given <ellipse> element.
*/
  var cy: SVGAnimatedLength = _
}


/**
  * The SVGAElement interface provides access to the properties of <a> elements, as
  * well as methods to manipulate them.
*/
class SVGAElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired with SVGURIReference {
/**
  * Corresponds to attribute target on the given <a> element.
*/
  var target: SVGAnimatedString = _
}


/**
  * The SVGStylable interface is implemented on all objects corresponding to SVG
  * elements that can have style, class and presentation attributes specified on
  * them.
*/
trait SVGStylable extends js.Object {
/**
  * Corresponds to attribute class on the given element.
*/
  var className: SVGAnimatedString = _
/**
  * Corresponds to attribute style on the given element.
*/
  var style: CSSStyleDeclaration = _
}

/**
  * Interface SVGTransformable contains properties and methods that apply to all
  * elements which have attribute transform.
*/
trait SVGTransformable extends SVGLocatable {
/**
  * Corresponds to attribute transform on the given element.
*/
  var transform: SVGAnimatedTransformList = _
}

trait SVGLangSpace extends js.Object {
  var xmllang: js.String = _
  var xmlspace: js.String = _
}

class SVGPoint extends js.Object {
  var y: js.Number = _
  var x: js.Number = _

  def matrixTransform(matrix: SVGMatrix): SVGPoint = ???
}


/**
  * The SVGAnimatedNumber interface is used for attributes which take a list of
  * numbers and which can be animated.
*/
class SVGAnimatedNumberList extends js.Object {
/**
  * A read only SVGNumberList representing the current animated value of the given
  * attribute. If the given attribute is not currently being animated, then the
  * SVGNumberList will have the same contents as baseVal. The object referenced by
  * animVal will always be distinct from the one referenced by baseVal, even when the
  * attribute is not animated.
*/
  var animVal: SVGNumberList = _
/**
  * The base value of the given attribute before applying any animations.
*/
  var baseVal: SVGNumberList = _
}


/**
  * The SVGSVGElement interface provides access to the properties of <svg> elements,
  * as well as methods to manipulate them. This interface contains also various
  * miscellaneous commonly-used utility methods, such as matrix operations and the
  * ability to control the time of redraw on visual rendering devices.
*/
class SVGSVGElement extends SVGElement with SVGStylable with SVGZoomAndPan with DocumentEvent with SVGLangSpace with SVGLocatable with SVGTests with SVGFitToViewBox with SVGExternalResourcesRequired {
/**
  * Corresponds to attribute width on the given <svg> element.
*/
  var width: SVGAnimatedLength = _
/**
  * Corresponds to attribute x on the given <svg> element.
*/
  var x: SVGAnimatedLength = _
/**
  * Corresponds to attribute contentStyleType on the given <svg> element.
*/
  var contentStyleType: js.String = _
  var onzoom: js.Function1[js.Any, js.Any] = _
/**
  * Corresponds to attribute y on the given <svg> element.
*/
  var y: SVGAnimatedLength = _
/**
  * The position and size of the viewport (implicit or explicit) that corresponds to
  * this <svg> element. When the browser is actually rendering the content, then the
  * position and size values represent the actual values when rendering. The position
  * and size values are unitless values in the coordinate system of the parent element.
  * If no parent element exists (i.e., <svg> element represents the root of the
  * document tree), if this SVG document is embedded as part of another document (e.g.,
  * via the HTML <object> element), then the position and size are unitless values in
  * the coordinate system of the parent document. (If the parent uses CSS or XSL layout,
  * then unitless values represent pixel units for the current CSS or XSL viewport.)
*/
  var viewport: SVGRect = _
  var onerror: js.Function1[Event, js.Any] = _
/**
  * Corresponding size of a pixel unit along the y-axis of the viewport.
*/
  var pixelUnitToMillimeterY: js.Number = _
  var onresize: js.Function1[UIEvent, js.Any] = _
/**
  * Corresponding size of a screen pixel along the y-axis of the viewport.
*/
  var screenPixelToMillimeterY: js.Number = _
/**
  * Corresponds to attribute height on the given <svg> element.
*/
  var height: SVGAnimatedLength = _
  var onabort: js.Function1[UIEvent, js.Any] = _
/**
  * Corresponds to attribute contentScriptType on the given <svg> element.
*/
  var contentScriptType: js.String = _
/**
  * Size of a pixel units (as defined by CSS2) along the x-axis of the viewport, which
  * represents a unit somewhere in the range of 70dpi to 120dpi, and, on systems that
  * support this, might actually match the characteristics of the target medium. On
  * systems where it is impossible to know the size of a pixel, a suitable default pixel
  * size is provided.
*/
  var pixelUnitToMillimeterX: js.Number = _
/**
  * On an outermost <svg> element, the corresponding translation factor that takes
  * into account user "magnification".
*/
  var currentTranslate: SVGPoint = _
  var onunload: js.Function1[Event, js.Any] = _
/**
  * On an outermost <svg> element, this attribute indicates the current scale factor
  * relative to the initial view to take into account user magnification and panning
  * operations. DOM attributes currentScale and currentTranslate are equivalent to
  * the 2x3 matrix [a b c d e f] = [currentScale 0 0 currentScale currentTranslate.x
  * currentTranslate.y]. If "magnification" is enabled (i.e.,
  * zoomAndPan="magnify"), then the effect is as if an extra transformation were
  * placed at the outermost level on the SVG document fragment (i.e., outside the
  * outermost <svg> element).
*/
  var currentScale: js.Number = _
  var onscroll: js.Function1[UIEvent, js.Any] = _
/**
  * User interface (UI) events in DOM Level 2 indicate the screen positions at which the
  * given UI event occurred. When the browser actually knows the physical size of a
  * "screen unit", this attribute will express that information; otherwise, user
  * agents will provide a suitable default value such as .28mm.
*/
  var screenPixelToMillimeterX: js.Number = _

/**
  * Adjusts the clock for this SVG document fragment, establishing a new current time.
  * If setCurrentTime is called before the document timeline has begun (for example,
  * by script running in a <script> element before the document's SVGLoad event is
  * dispatched), then the value of seconds in the last invocation of the method gives
  * the time that the document will seek to once the document timeline has begun.
*/
  def setCurrentTime(seconds: js.Number): Unit = ???

/**
  * Creates an SVGLength object outside of any document trees. The object is
  * initialized to a value of zero user units.
*/
  def createSVGLength(): SVGLength = ???

/**
  * Returns the list of graphics elements whose rendered content intersects the
  * supplied rectangle. Each candidate graphics element is to be considered a match
  * only if the same graphics element can be a target of pointer events as defined in
  * pointer-events processing.
*/
  def getIntersectionList(rect: SVGRect, referenceElement: SVGElement): NodeList = ???

/**
  * Unsuspends (i.e., unpauses) currently running animations that are defined
  * within the SVG document fragment, causing the animation clock to continue from the
  * time at which it was suspended.
*/
  def unpauseAnimations(): Unit = ???

/**
  * Creates an SVGRect object outside of any document trees. The object is initialized
  * such that all values are set to 0 user units.
*/
  def createSVGRect(): SVGRect = ???

/**
  * Returns true if the rendered content of the given element intersects the supplied
  * rectangle. Each candidate graphics element is to be considered a match only if the
  * same graphics element can be a target of pointer events as defined in
  * pointer-events processing.
*/
  def checkIntersection(element: SVGElement, rect: SVGRect): js.Boolean = ???

/**
  * Cancels all currently active suspendRedraw() method calls. This method is most
  * useful at the very end of a set of SVG DOM calls to ensure that all pending
  * suspendRedraw() method calls have been cancelled.
*/
  def unsuspendRedrawAll(): Unit = ???

/**
  * Suspends (i.e., pauses) all currently running animations that are defined within
  * the SVG document fragment corresponding to this <svg> element, causing the
  * animation clock corresponding to this document fragment to stand still until it is
  * unpaused.
*/
  def pauseAnimations(): Unit = ???

/**
  * Takes a time-out value which indicates that redraw shall not occur until: the
  * corresponding unsuspendRedraw() call has been made, an unsuspendRedrawAll()
  * call has been made, or its timer has timed out. In environments that do not support
  * interactivity (e.g., print media), then redraw shall not be suspended. Calls to
  * suspendRedraw() and unsuspendRedraw() should, but need not be, made in balanced
  * pairs. To suspend redraw actions as a collection of SVG DOM changes occur, precede
  * the changes to the SVG DOM with a method call similar to: suspendHandleID =
  * suspendRedraw(maxWaitMilliseconds); and follow the changes with a method call
  * similar to: unsuspendRedraw(suspendHandleID); Note that multiple
  * suspendRedraw calls can be used at once and that each such method call is treated
  * independently of the other suspendRedraw method calls.
*/
  def suspendRedraw(maxWaitMilliseconds: js.Number): js.Number = ???

/**
  * Unselects any selected objects, including any selections of text strings and
  * type-in bars.
*/
  def deselectAll(): Unit = ???

/**
  * Creates an SVGAngle object outside of any document trees. The object is
  * initialized to a value of zero degrees (unitless).
*/
  def createSVGAngle(): SVGAngle = ???

  def getEnclosureList(rect: SVGRect, referenceElement: SVGElement): NodeList = ???

/**
  * Creates an SVGTransform object outside of any document trees. The object is
  * initialized to an identity matrix transform (SVG_TRANSFORM_MATRIX).
*/
  def createSVGTransform(): SVGTransform = ???

/**
  * Cancels a specified suspendRedraw() by providing a unique suspend handle ID that
  * was returned by a previous suspendRedraw() call.
*/
  def unsuspendRedraw(suspendHandleID: js.Number): Unit = ???

/**
  * In rendering environments supporting interactivity, forces the user agent to
  * immediately redraw all regions of the viewport that require updating.
*/
  def forceRedraw(): Unit = ???

/**
  * Returns the current time in seconds relative to the start time for the current SVG
  * document fragment. If getCurrentTime is called before the document timeline has
  * begun (for example, by script running in a <script> element before the document's
  * SVGLoad event is dispatched), then 0 is returned.
*/
  def getCurrentTime(): js.Number = ???

/**
  * Returns true if the rendered content of the given element is entirely contained
  * within the supplied rectangle. Each candidate graphics element is to be
  * considered a match only if the same graphics element can be a target of pointer
  * events as defined in pointer-events processing.
*/
  def checkEnclosure(element: SVGElement, rect: SVGRect): js.Boolean = ???

/**
  * Creates an SVGMatrix object outside of any document trees. The object is
  * initialized to the identity matrix.
*/
  def createSVGMatrix(): SVGMatrix = ???

/**
  * Creates an SVGPoint object outside of any document trees. The object is
  * initialized to the point (0,0) in the user coordinate system.
*/
  def createSVGPoint(): SVGPoint = ???

/**
  * Creates an SVGNumber object outside of any document trees. The object is
  * initialized to a value of zero.
*/
  def createSVGNumber(): SVGNumber = ???

/**
  * Creates an SVGTransform object outside of any document trees. The object is
  * initialized to the given matrix transform (i.e., SVG_TRANSFORM_MATRIX). The
  * values from the parameter matrix are copied, the matrix parameter is not adopted as
  * SVGTransform::matrix.
*/
  def createSVGTransformFromMatrix(matrix: SVGMatrix): SVGTransform = ???

  def getComputedStyle(elt: Element, pseudoElt: js.String): CSSStyleDeclaration = ???

  def getComputedStyle(elt: Element): CSSStyleDeclaration = ???

/**
  * Searches this SVG document fragment (i.e., the search is restricted to a subset of
  * the document tree) for an Element whose id is given by elementId. If an Element is
  * found, that Element is returned. If no such element exists, returns null. Behavior
  * is not defined if more than one element has this id.
*/
  def getElementById(elementId: js.String): Element = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???

  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}


/**
  * The SVGAnimatedInteger interface is used for attributes of basic type <integer>
  * which can be animated.
*/
class SVGAnimatedInteger extends js.Object {
/**
  * If the given attribute or property is being animated, contains the current
  * animated value of the attribute or property. If the given attribute or property is
  * not currently being animated, contains the same value as baseVal.
*/
  var animVal: js.Number = _
/**
  * The base value of the given attribute before applying any animations.
*/
  var baseVal: js.Number = _
}


/**
  * The SVGTextElement interface corresponds to the <text> elements.
*/
class SVGTextElement extends SVGTextPositioningElement with SVGTransformable {
}


/**
  * The SVGTSpanElement interface provides access to the properties of <tspan>
  * elements, as well as methods to manipulate them.
*/
class SVGTSpanElement extends SVGTextPositioningElement {
}


class SVGPathSegLinetoVerticalAbs extends SVGPathSeg {
  var y: js.Number = _
}


/**
  * The SVGStyleElement interface corresponds to the SVG <style> element.
*/
class SVGStyleElement extends SVGElement with SVGLangSpace {
/**
  * Corresponds to attribute media on the given element. A DOMException is raised with
  * code NO_MODIFICATION_ALLOWED_ERR on an attempt to change the value of a read only
  * attribut.
*/
  var media: js.String = _
  var `type`: js.String = _
/**
  * Corresponds to attribute title on the given element. A DOMException is raised with
  * code NO_MODIFICATION_ALLOWED_ERR on an attempt to change the value of a read only
  * attribut.
*/
  var title: js.String = _
}


/**
  * The SVGRadialGradientElement interface corresponds to the <radialgradient>
  * element.
*/
class SVGRadialGradientElement extends SVGGradientElement {
/**
  * Corresponds to attribute cx on the given <radialgradient> element.
*/
  var cx: SVGAnimatedLength = _
/**
  * Corresponds to attribute r on the given <radialgradient> element.
*/
  var r: SVGAnimatedLength = _
/**
  * Corresponds to attribute cy on the given <radialgradient> element.
*/
  var cy: SVGAnimatedLength = _
/**
  * Corresponds to attribute fx on the given <radialgradient> element.
*/
  var fx: SVGAnimatedLength = _
/**
  * Corresponds to attribute fy on the given <radialgradient> element.
*/
  var fy: SVGAnimatedLength = _
}


/**
  * The SVGImageElement interface corresponds to the <image> element.
*/
class SVGImageElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired with SVGURIReference {
/**
  * Corresponds to attribute y on the given <image> element.
*/
  var y: SVGAnimatedLength = _
/**
  * Corresponds to attribute width on the given <image> element.
*/
  var width: SVGAnimatedLength = _
/**
  * Corresponds to attribute preserveAspectRatio on the given <image> element.
*/
  var preserveAspectRatio: SVGAnimatedPreserveAspectRatio = _
/**
  * Corresponds to attribute x on the given <image> element.
*/
  var x: SVGAnimatedLength = _
/**
  * Corresponds to attribute height on the given <image> element.
*/
  var height: SVGAnimatedLength = _
}


/**
  * The SVGAnimatedNumber interface is used for attributes of basic type <Number>
  * which can be animated.
*/
class SVGAnimatedNumber extends js.Object {
/**
  * If the given attribute or property is being animated, contains the current
  * animated value of the attribute or property. If the given attribute or property is
  * not currently being animated, contains the same value as baseVal.
*/
  var animVal: js.Number = _
/**
  * The base value of the given attribute before applying any animations.
*/
  var baseVal: js.Number = _
}


class SVGMetadataElement extends SVGElement {
}


class SVGPathSegArcRel extends SVGPathSeg {
  var y: js.Number = _
  var sweepFlag: js.Boolean = _
  var r2: js.Number = _
  var x: js.Number = _
  var angle: js.Number = _
  var r1: js.Number = _
  var largeArcFlag: js.Boolean = _
}


class SVGPathSegMovetoAbs extends SVGPathSeg {
  var y: js.Number = _
  var x: js.Number = _
}


/**
  * The SVGStringList defines a list of DOMString objects.
*/
class SVGStringList extends js.Object {
  var numberOfItems: js.Number = _

/**
  * Replaces an existing item in the list with a new item. If newItem is already in a list,
  * it is removed from its previous list before it is inserted into this list. The
  * inserted item is the item itself and not a copy. If the item is already in this list,
  * note that the index of the item to replace is before the removal of the item.
  * Exceptions: a DOMException with code NO_MODIFICATION_ALLOWED_ERR is raised
  * when the list corresponds to a read only attribute or when the object itself is read
  * only. a DOMException with code INDEX_SIZE_ERR is raised if the index number is
  * greater than or equal to numberOfItems.
*/
  def replaceItem(newItem: js.String, index: js.Number): js.String = ???

/**
  * Returns the specified item from the list. The returned item is the item itself and
  * not a copy. Any changes made to the item are immediately reflected in the list. The
  * first item is number 0. Exceptions: a DOMException with code
  * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
  * attribute or when the object itself is read only.
*/
  def getItem(index: js.Number): js.String = ???

/**
  * Clears all existing current items from the list, with the result being an empty
  * list. Exceptions: a DOMException with code NO_MODIFICATION_ALLOWED_ERR is
  * raised when the list corresponds to a read only attribute or when the object itself
  * is read only.
*/
  def clear(): Unit = ???

/**
  * Inserts a new item at the end of the list. If newItem is already in a list, it is removed
  * from its previous list before it is inserted into this list. The inserted item is the
  * item itself and not a copy. Exceptions: a DOMException with code
  * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
  * attribute or when the object itself is read only.
*/
  def appendItem(newItem: js.String): js.String = ???

/**
  * Clears all existing current items from the list and re-initializes the list to hold
  * the single item specified by the parameter. If the inserted item is already in a
  * list, it is removed from its previous list before it is inserted into this list. The
  * inserted item is the item itself and not a copy. The return value is the item inserted
  * into the list. Exceptions: a DOMException with code
  * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
  * attribute or when the object itself is read only.
*/
  def initialize(newItem: js.String): js.String = ???

/**
  * Removes an existing item from the list. Exceptions: a DOMException with code
  * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
  * attribute or when the object itself is read only. a DOMException with code
  * INDEX_SIZE_ERR is raised if the index number is greater than or equal to
  * numberOfItems.
*/
  def removeItem(index: js.Number): js.String = ???

/**
  * Inserts a new item into the list at the specified position. The first item is number
  * 0. If newItem is already in a list, it is removed from its previous list before it is
  * inserted into this list. The inserted item is the item itself and not a copy. If the
  * item is already in this list, note that the index of the item to insert before is
  * before the removal of the item. If the index is equal to 0, then the new item is
  * inserted at the front of the list. If the index is greater than or equal to
  * numberOfItems, then the new item is appended to the end of the list. Exceptions: a
  * DOMException with code NO_MODIFICATION_ALLOWED_ERR is raised when the list
  * corresponds to a read only attribute or when the object itself is read only.
*/
  def insertItemBefore(newItem: js.String, index: js.Number): js.String = ???
}


/**
  * The SVGLength interface correspond to the <length> basic data type.
*/
class SVGLength extends js.Object {
/**
  * The value as a string value, in the units expressed by unitType. Setting this
  * attribute will cause value, valueInSpecifiedUnits and unitType to be updated
  * automatically to reflect this setting. Exceptions on setting: a DOMException
  * with code SYNTAX_ERR is raised if the assigned string cannot be parsed as a valid
  * <length>. a DOMException with code NO_MODIFICATION_ALLOWED_ERR is raised when
  * the length corresponds to a read only attribute or when the object itself is read
  * only.
*/
  var valueAsString: js.String = _
/**
  * The value as a floating point value, in the units expressed by unitType. Setting
  * this attribute will cause value and valueAsString to be updated automatically to
  * reflect this setting. Exceptions on setting: a DOMException with code
  * NO_MODIFICATION_ALLOWED_ERR is raised when the length corresponds to a read only
  * attribute or when the object itself is read only.
*/
  var valueInSpecifiedUnits: js.Number = _
/**
  * The value as a floating point value, in user units. Setting this attribute will
  * cause valueInSpecifiedUnits and valueAsString to be updated automatically to
  * reflect this setting. Exceptions on setting: a DOMException with code
  * NO_MODIFICATION_ALLOWED_ERR is raised when the length corresponds to a read only
  * attribute or when the object itself is read only.
*/
  var value: js.Number = _
/**
  * The type of the value as specified by one of the SVG_LENGTHTYPE_* constants defined
  * on this interface.
*/
  var unitType: js.Number = _

/**
  * Reset the value as a number with an associated unitType, thereby replacing the
  * values for all of the attributes on the object. Exceptions: a DOMException with
  * code NOT_SUPPORTED_ERR is raised if unitType is SVG_LENGTHTYPE_UNKNOWN or not a
  * valid unit type constant (one of the other SVG_LENGTHTYPE_* constants defined on
  * this interface). a DOMException with code NO_MODIFICATION_ALLOWED_ERR is
  * raised when the length corresponds to a read only attribute or when the object
  * itself is read only.
*/
  def newValueSpecifiedUnits(unitType: js.Number, valueInSpecifiedUnits: js.Number): Unit = ???

/**
  * Preserve the same underlying stored value, but reset the stored unit identifier to
  * the given unitType. Object attributes unitType, valueInSpecifiedUnits and
  * valueAsString might be modified as a result of this method. For example, if the
  * original value were "0.5cm" and the method was invoked to convert to millimeters,
  * then the unitType would be changed to SVG_LENGTHTYPE_MM, valueInSpecifiedUnits
  * would be changed to the numeric value 5 and valueAsString would be changed to "5mm".
*/
  def convertToSpecifiedUnits(unitType: js.Number): Unit = ???

  var SVG_LENGTHTYPE_NUMBER: js.Number = _
  var SVG_LENGTHTYPE_CM: js.Number = _
  var SVG_LENGTHTYPE_PC: js.Number = _
  var SVG_LENGTHTYPE_PERCENTAGE: js.Number = _
  var SVG_LENGTHTYPE_MM: js.Number = _
  var SVG_LENGTHTYPE_PT: js.Number = _
  var SVG_LENGTHTYPE_IN: js.Number = _
  var SVG_LENGTHTYPE_EMS: js.Number = _
  var SVG_LENGTHTYPE_PX: js.Number = _
  var SVG_LENGTHTYPE_UNKNOWN: js.Number = _
  var SVG_LENGTHTYPE_EXS: js.Number = _
}

/**
  * The SVGLength interface correspond to the <length> basic data type.
*/
object SVGLength extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGLength),List())))) */
  var SVG_LENGTHTYPE_NUMBER: js.Number = _
  var SVG_LENGTHTYPE_CM: js.Number = _
  var SVG_LENGTHTYPE_PC: js.Number = _
  var SVG_LENGTHTYPE_PERCENTAGE: js.Number = _
  var SVG_LENGTHTYPE_MM: js.Number = _
  var SVG_LENGTHTYPE_PT: js.Number = _
  var SVG_LENGTHTYPE_IN: js.Number = _
  var SVG_LENGTHTYPE_EMS: js.Number = _
  var SVG_LENGTHTYPE_PX: js.Number = _
/**
  * The unit type is not one of predefined unit types. It is invalid to attempt to define a
  * new value of this type or to attempt to switch an existing value to this type.
*/
  var SVG_LENGTHTYPE_UNKNOWN: js.Number = _
  var SVG_LENGTHTYPE_EXS: js.Number = _
}

/**
  * The SVGPolygonElement interface provides access to the properties of <polygon>
  * elements, as well as methods to manipulate them.
*/
class SVGPolygonElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGAnimatedPoints with SVGTests with SVGExternalResourcesRequired {
}


class SVGPathSegCurvetoCubicRel extends SVGPathSeg {
  var y: js.Number = _
  var y1: js.Number = _
  var x2: js.Number = _
  var x: js.Number = _
  var x1: js.Number = _
  var y2: js.Number = _
}


class SVGTextContentElement extends SVGElement with SVGStylable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
  var textLength: SVGAnimatedLength = _
  var lengthAdjust: SVGAnimatedEnumeration = _

  def getCharNumAtPosition(point: SVGPoint): js.Number = ???

  def getStartPositionOfChar(charnum: js.Number): SVGPoint = ???

  def getExtentOfChar(charnum: js.Number): SVGRect = ???

  def getComputedTextLength(): js.Number = ???

  def getSubStringLength(charnum: js.Number, nchars: js.Number): js.Number = ???

  def selectSubString(charnum: js.Number, nchars: js.Number): Unit = ???

  def getNumberOfChars(): js.Number = ???

  def getRotationOfChar(charnum: js.Number): js.Number = ???

  def getEndPositionOfChar(charnum: js.Number): SVGPoint = ???

  var LENGTHADJUST_SPACING: js.Number = _
  var LENGTHADJUST_SPACINGANDGLYPHS: js.Number = _
  var LENGTHADJUST_UNKNOWN: js.Number = _
}

object SVGTextContentElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGTextContentElement),List())))) */
  var LENGTHADJUST_SPACING: js.Number = _
  var LENGTHADJUST_SPACINGANDGLYPHS: js.Number = _
  var LENGTHADJUST_UNKNOWN: js.Number = _
}

/**
  * SVGTransform is the interface for one of the component transformations within an
  * SVGTransformList; thus, an SVGTransform object corresponds to a single
  * component (e.g., scale(…) or matrix(…)) within a transform attribute.
*/
class SVGTransform extends js.Object {
  var `type`: js.Number = _
/**
  * A convenience attribute for SVG_TRANSFORM_ROTATE, SVG_TRANSFORM_SKEWX and
  * SVG_TRANSFORM_SKEWY. It holds the angle that was specified. For
  * SVG_TRANSFORM_MATRIX, SVG_TRANSFORM_TRANSLATE and SVG_TRANSFORM_SCALE,
  * angle will be zero.
*/
  var angle: js.Number = _
/**
  * The matrix that represents this transformation. The matrix object is live,
  * meaning that any changes made to the SVGTransform object are immediately
  * reflected in the matrix object and vice versa. In case the matrix object is changed
  * directly (i.e., without using the methods on the SVGTransform interface itself)
  * then the type of the SVGTransform changes to SVG_TRANSFORM_MATRIX. For
  * SVG_TRANSFORM_MATRIX, the matrix contains the a, b, c, d, e, f values supplied by
  * the user. For SVG_TRANSFORM_TRANSLATE, e and f represent the translation amounts
  * (a=1, b=0, c=0 and d=1). For SVG_TRANSFORM_SCALE, a and d represent the scale
  * amounts (b=0, c=0, e=0 and f=0). For SVG_TRANSFORM_SKEWX and
  * SVG_TRANSFORM_SKEWY, a, b, c and d represent the matrix which will result in the
  * given skew (e=0 and f=0). For SVG_TRANSFORM_ROTATE, a, b, c, d, e and f together
  * represent the matrix which will result in the given rotation. When the rotation is
  * around the center point (0, 0), e and f will be zero.
*/
  var matrix: SVGMatrix = _

/**
  * Sets the transform type to SVG_TRANSFORM_TRANSLATE, with parameters tx and ty
  * defining the translation amounts. Exceptions: a DOMException with code
  * NO_MODIFICATION_ALLOWED_ERR is raised when attempting to modify a read only
  * attribute or when the object itself is read only.
*/
  def setTranslate(tx: js.Number, ty: js.Number): Unit = ???

/**
  * Sets the transform type to SVG_TRANSFORM_SCALE, with parameters sx and sy
  * defining the scale amounts. Exceptions: a DOMException with code
  * NO_MODIFICATION_ALLOWED_ERR is raised when attempting to modify a read only
  * attribute or when the object itself is read only.
*/
  def setScale(sx: js.Number, sy: js.Number): Unit = ???

/**
  * Sets the transform type to SVG_TRANSFORM_MATRIX, with parameter matrix defining
  * the new transformation. Note that the values from the parameter matrix are copied.
  * Exceptions: a DOMException with code NO_MODIFICATION_ALLOWED_ERR is raised
  * when attempting to modify a read only attribute or when the object itself is read
  * only.
*/
  def setMatrix(matrix: SVGMatrix): Unit = ???

/**
  * Sets the transform type to SVG_TRANSFORM_SKEWY, with parameter angle defining
  * the amount of skew. Exceptions: a DOMException with code
  * NO_MODIFICATION_ALLOWED_ERR is raised when attempting to modify a read only
  * attribute or when the object itself is read only.
*/
  def setSkewY(angle: js.Number): Unit = ???

/**
  * Sets the transform type to SVG_TRANSFORM_ROTATE, with parameter angle defining
  * the rotation angle and parameters cx and cy defining the optional center of
  * rotation. Exceptions: a DOMException with code NO_MODIFICATION_ALLOWED_ERR is
  * raised when attempting to modify a read only attribute or when the object itself is
  * read only.
*/
  def setRotate(angle: js.Number, cx: js.Number, cy: js.Number): Unit = ???

/**
  * Sets the transform type to SVG_TRANSFORM_SKEWX, with parameter angle defining
  * the amount of skew. Exceptions: a DOMException with code
  * NO_MODIFICATION_ALLOWED_ERR is raised when attempting to modify a read only
  * attribute or when the object itself is read only.
*/
  def setSkewX(angle: js.Number): Unit = ???

  var SVG_TRANSFORM_SKEWX: js.Number = _
  var SVG_TRANSFORM_UNKNOWN: js.Number = _
  var SVG_TRANSFORM_SCALE: js.Number = _
  var SVG_TRANSFORM_TRANSLATE: js.Number = _
  var SVG_TRANSFORM_MATRIX: js.Number = _
  var SVG_TRANSFORM_ROTATE: js.Number = _
  var SVG_TRANSFORM_SKEWY: js.Number = _
}

/**
  * SVGTransform is the interface for one of the component transformations within an
  * SVGTransformList; thus, an SVGTransform object corresponds to a single
  * component (e.g., scale(…) or matrix(…)) within a transform attribute.
*/
object SVGTransform extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGTransform),List())))) */
  var SVG_TRANSFORM_SKEWX: js.Number = _
/**
  * The unit type is not one of predefined unit types. It is invalid to attempt to define a
  * new value of this type or to attempt to switch an existing value to this type.
*/
  var SVG_TRANSFORM_UNKNOWN: js.Number = _
  var SVG_TRANSFORM_SCALE: js.Number = _
  var SVG_TRANSFORM_TRANSLATE: js.Number = _
  var SVG_TRANSFORM_MATRIX: js.Number = _
  var SVG_TRANSFORM_ROTATE: js.Number = _
  var SVG_TRANSFORM_SKEWY: js.Number = _
}

trait SVGURIReference extends js.Object {
  var href: SVGAnimatedString = _
}

class SVGPathSeg extends js.Object {
  var pathSegType: js.Number = _
  var pathSegTypeAsLetter: js.String = _
  var PATHSEG_MOVETO_REL: js.Number = _
  var PATHSEG_LINETO_VERTICAL_REL: js.Number = _
  var PATHSEG_CURVETO_CUBIC_SMOOTH_ABS: js.Number = _
  var PATHSEG_CURVETO_QUADRATIC_REL: js.Number = _
  var PATHSEG_CURVETO_CUBIC_ABS: js.Number = _
  var PATHSEG_LINETO_HORIZONTAL_ABS: js.Number = _
  var PATHSEG_CURVETO_QUADRATIC_ABS: js.Number = _
  var PATHSEG_LINETO_ABS: js.Number = _
  var PATHSEG_CLOSEPATH: js.Number = _
  var PATHSEG_LINETO_HORIZONTAL_REL: js.Number = _
  var PATHSEG_CURVETO_CUBIC_SMOOTH_REL: js.Number = _
  var PATHSEG_LINETO_REL: js.Number = _
  var PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS: js.Number = _
  var PATHSEG_ARC_REL: js.Number = _
  var PATHSEG_CURVETO_CUBIC_REL: js.Number = _
  var PATHSEG_UNKNOWN: js.Number = _
  var PATHSEG_LINETO_VERTICAL_ABS: js.Number = _
  var PATHSEG_ARC_ABS: js.Number = _
  var PATHSEG_MOVETO_ABS: js.Number = _
  var PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL: js.Number = _
}

object SVGPathSeg extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGPathSeg),List())))) */
  var PATHSEG_MOVETO_REL: js.Number = _
  var PATHSEG_LINETO_VERTICAL_REL: js.Number = _
  var PATHSEG_CURVETO_CUBIC_SMOOTH_ABS: js.Number = _
  var PATHSEG_CURVETO_QUADRATIC_REL: js.Number = _
  var PATHSEG_CURVETO_CUBIC_ABS: js.Number = _
  var PATHSEG_LINETO_HORIZONTAL_ABS: js.Number = _
  var PATHSEG_CURVETO_QUADRATIC_ABS: js.Number = _
  var PATHSEG_LINETO_ABS: js.Number = _
  var PATHSEG_CLOSEPATH: js.Number = _
  var PATHSEG_LINETO_HORIZONTAL_REL: js.Number = _
  var PATHSEG_CURVETO_CUBIC_SMOOTH_REL: js.Number = _
  var PATHSEG_LINETO_REL: js.Number = _
  var PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS: js.Number = _
  var PATHSEG_ARC_REL: js.Number = _
  var PATHSEG_CURVETO_CUBIC_REL: js.Number = _
  var PATHSEG_UNKNOWN: js.Number = _
  var PATHSEG_LINETO_VERTICAL_ABS: js.Number = _
  var PATHSEG_ARC_ABS: js.Number = _
  var PATHSEG_MOVETO_ABS: js.Number = _
  var PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL: js.Number = _
}

/**
  * The SVGNumber interface correspond to the <number> basic data type.
*/
class SVGNumber extends js.Object {
/**
  * The value of the given attribute. Exceptions on setting: a DOMException with code
  * NO_MODIFICATION_ALLOWED_ERR is Raised on an attempt to change the value of a read
  * only attribute.
*/
  var value: js.Number = _
}


/**
  * The SVGPathElement interface corresponds to the <path> element.
*/
class SVGPathElement extends SVGElement with SVGStylable with SVGAnimatedPathData with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
/**
  * Returns the index into pathSegList which is distance units along the path,
  * utilizing the user agent's distance-along-a-path algorithm.
*/
  def getPathSegAtLength(distance: js.Number): js.Number = ???

/**
  * Returns the (x,y) coordinate in user space which is distance units along the path,
  * utilizing the browser's distance-along-a-path algorithm.
*/
  def getPointAtLength(distance: js.Number): SVGPoint = ???

/**
  * Returns a stand-alone, parentless SVGPathSegCurvetoQuadraticAbs object.
  * Parameters: float x The absolute X coordinate for the end point of this path
  * segment. float y The absolute Y coordinate for the end point of this path segment.
  * float x1 The absolute X coordinate for the first control point. float y1 The
  * absolute Y coordinate for the first control point.
*/
  def createSVGPathSegCurvetoQuadraticAbs(x: js.Number, y: js.Number, x1: js.Number, y1: js.Number): SVGPathSegCurvetoQuadraticAbs = ???

/**
  * Returns a stand-alone, parentless SVGPathSegLinetoRel object. Parameters:
  * float x The relative X coordinate for the end point of this path segment. float y The
  * relative Y coordinate for the end point of this path segment.
*/
  def createSVGPathSegLinetoRel(x: js.Number, y: js.Number): SVGPathSegLinetoRel = ???

/**
  * Returns a stand-alone, parentless SVGPathSegCurvetoQuadraticRel object.
  * Parameters: float x The relative X coordinate for the end point of this path
  * segment. float y The relative Y coordinate for the end point of this path segment.
  * float x1 The relative X coordinate for the first control point. float y1 The
  * relative Y coordinate for the first control point.
*/
  def createSVGPathSegCurvetoQuadraticRel(x: js.Number, y: js.Number, x1: js.Number, y1: js.Number): SVGPathSegCurvetoQuadraticRel = ???

/**
  * Returns a stand-alone, parentless SVGPathSegCurvetoCubicAbs object.
  * Parameters: float x The absolute X coordinate for the end point of this path
  * segment. float y The absolute Y coordinate for the end point of this path segment.
  * float x1 The absolute X coordinate for the first control point. float y1 The
  * absolute Y coordinate for the first control point. float x2 The absolute X
  * coordinate for the second control point. float y2 The absolute Y coordinate for the
  * second control point.
*/
  def createSVGPathSegCurvetoCubicAbs(x: js.Number, y: js.Number, x1: js.Number, y1: js.Number, x2: js.Number, y2: js.Number): SVGPathSegCurvetoCubicAbs = ???

/**
  * Returns a stand-alone, parentless SVGPathSegLinetoAbs object. Parameters:
  * float x The absolute X coordinate for the end point of this path segment. float y The
  * absolute Y coordinate for the end point of this path segment.
*/
  def createSVGPathSegLinetoAbs(x: js.Number, y: js.Number): SVGPathSegLinetoAbs = ???

/**
  * Returns a stand-alone, parentless SVGPathSegClosePath object.
*/
  def createSVGPathSegClosePath(): SVGPathSegClosePath = ???

/**
  * Returns a stand-alone, parentless SVGPathSegCurvetoCubicRel object.
  * Parameters: float x The relative X coordinate for the end point of this path
  * segment. float y The relative Y coordinate for the end point of this path segment.
  * float x1 The relative X coordinate for the first control point. float y1 The
  * relative Y coordinate for the first control point. float x2 The relative X
  * coordinate for the second control point. float y2 The relative Y coordinate for the
  * second control point.
*/
  def createSVGPathSegCurvetoCubicRel(x: js.Number, y: js.Number, x1: js.Number, y1: js.Number, x2: js.Number, y2: js.Number): SVGPathSegCurvetoCubicRel = ???

/**
  * Returns a stand-alone, parentless SVGPathSegCurvetoQuadraticSmoothRel
  * object. Parameters: float x The absolute X coordinate for the end point of this path
  * segment. float y The absolute Y coordinate for the end point of this path segment.
*/
  def createSVGPathSegCurvetoQuadraticSmoothRel(x: js.Number, y: js.Number): SVGPathSegCurvetoQuadraticSmoothRel = ???

/**
  * Returns a stand-alone, parentless SVGPathSegMovetoRel object. Parameters:
  * float x The relative X coordinate for the end point of this path segment. float y The
  * relative Y coordinate for the end point of this path segment.
*/
  def createSVGPathSegMovetoRel(x: js.Number, y: js.Number): SVGPathSegMovetoRel = ???

/**
  * Returns a stand-alone, parentless SVGPathSegCurvetoCubicSmoothAbs object.
  * Parameters float x The absolute X coordinate for the end point of this path segment.
  * float y The absolute Y coordinate for the end point of this path segment. float x2 The
  * absolute X coordinate for the second control point. float y2 The absolute Y
  * coordinate for the second control point.
*/
  def createSVGPathSegCurvetoCubicSmoothAbs(x: js.Number, y: js.Number, x2: js.Number, y2: js.Number): SVGPathSegCurvetoCubicSmoothAbs = ???

/**
  * Returns a stand-alone, parentless SVGPathSegMovetoAbs object. Parameters:
  * float x The absolute X coordinate for the end point of this path segment. float y The
  * absolute Y coordinate for the end point of this path segment.
*/
  def createSVGPathSegMovetoAbs(x: js.Number, y: js.Number): SVGPathSegMovetoAbs = ???

/**
  * Returns a stand-alone, parentless SVGPathSegLinetoVerticalRel object.
  * Parameters: float y The relative Y coordinate for the end point of this path
  * segment.
*/
  def createSVGPathSegLinetoVerticalRel(y: js.Number): SVGPathSegLinetoVerticalRel = ???

/**
  * Returns a stand-alone, parentless SVGPathSegArcRel object. Parameters: float x
  * The relative X coordinate for the end point of this path segment. float y The
  * relative Y coordinate for the end point of this path segment. float r1 The x-axis
  * radius for the ellipse. float r2 The y-axis radius for the ellipse. float angle The
  * rotation angle in degrees for the ellipse's x-axis relative to the x-axis of the
  * user coordinate system. boolean largeArcFlag The value of the large-arc-flag
  * parameter. boolean sweepFlag The value of the large-arc-flag parameter.
*/
  def createSVGPathSegArcRel(x: js.Number, y: js.Number, r1: js.Number, r2: js.Number, angle: js.Number, largeArcFlag: js.Boolean, sweepFlag: js.Boolean): SVGPathSegArcRel = ???

/**
  * Returns a stand-alone, parentless SVGPathSegCurvetoQuadraticSmoothAbs
  * object. Parameters: float x The absolute X coordinate for the end point of this path
  * segment. float y The absolute Y coordinate for the end point of this path segment.
*/
  def createSVGPathSegCurvetoQuadraticSmoothAbs(x: js.Number, y: js.Number): SVGPathSegCurvetoQuadraticSmoothAbs = ???

/**
  * Returns a stand-alone, parentless SVGPathSegLinetoHorizontalRel object.
  * Parameters: float x The relative X coordinate for the end point of this path
  * segment.
*/
  def createSVGPathSegLinetoHorizontalRel(x: js.Number): SVGPathSegLinetoHorizontalRel = ???

  def getTotalLength(): js.Number = ???

/**
  * Returns a stand-alone, parentless SVGPathSegCurvetoCubicSmoothRel object.
  * Parameters float x The absolute X coordinate for the end point of this path segment.
  * float y The absolute Y coordinate for the end point of this path segment. float x2 The
  * absolute X coordinate for the second control point. float y2 The absolute Y
  * coordinate for the second control point.
*/
  def createSVGPathSegCurvetoCubicSmoothRel(x: js.Number, y: js.Number, x2: js.Number, y2: js.Number): SVGPathSegCurvetoCubicSmoothRel = ???

/**
  * Returns a stand-alone, parentless SVGPathSegLinetoHorizontalAbs object.
  * Parameters: float x The absolute X coordinate for the end point of this path
  * segment.
*/
  def createSVGPathSegLinetoHorizontalAbs(x: js.Number): SVGPathSegLinetoHorizontalAbs = ???

/**
  * Returns a stand-alone, parentless SVGPathSegLinetoVerticalAbs object.
  * Parameters: float y The absolute Y coordinate for the end point of this path
  * segment.
*/
  def createSVGPathSegLinetoVerticalAbs(y: js.Number): SVGPathSegLinetoVerticalAbs = ???

/**
  * Returns a stand-alone, parentless SVGPathSegArcAbs object. Parameters: float x
  * The absolute X coordinate for the end point of this path segment. float y The
  * absolute Y coordinate for the end point of this path segment. float r1 The x-axis
  * radius for the ellipse. float r2 The y-axis radius for the ellipse. float angle The
  * rotation angle in degrees for the ellipse's x-axis relative to the x-axis of the
  * user coordinate system. boolean largeArcFlag The value of the large-arc-flag
  * parameter. boolean sweepFlag The value of the large-arc-flag parameter.
*/
  def createSVGPathSegArcAbs(x: js.Number, y: js.Number, r1: js.Number, r2: js.Number, angle: js.Number, largeArcFlag: js.Boolean, sweepFlag: js.Boolean): SVGPathSegArcAbs = ???
}


/**
  * The SVGAnimatedRect interface is used for attributes of basic SVGRect which can be
  * animated.
*/
class SVGAnimatedRect extends js.Object {
/**
  * A read only SVGRect representing the current animated value of the given
  * attribute. If the given attribute is not currently being animated, then the
  * SVGRect will have the same contents as baseVal. The object referenced by animVal
  * will always be distinct from the one referenced by baseVal, even when the attribute
  * is not animated.
*/
  var animVal: SVGRect = _
/**
  * The base value of the given attribute before applying any animations.
*/
  var baseVal: SVGRect = _
}


class SVGPathSegList extends js.Object {
  var numberOfItems: js.Number = _

  def replaceItem(newItem: SVGPathSeg, index: js.Number): SVGPathSeg = ???

  def getItem(index: js.Number): SVGPathSeg = ???

  def clear(): Unit = ???

  def appendItem(newItem: SVGPathSeg): SVGPathSeg = ???

  def initialize(newItem: SVGPathSeg): SVGPathSeg = ???

  def removeItem(index: js.Number): SVGPathSeg = ???

  def insertItemBefore(newItem: SVGPathSeg, index: js.Number): SVGPathSeg = ???
}


class SVGElementInstance extends EventTarget {
  var previousSibling: SVGElementInstance = _
  var parentNode: SVGElementInstance = _
  var lastChild: SVGElementInstance = _
  var nextSibling: SVGElementInstance = _
  var childNodes: SVGElementInstanceList = _
  var correspondingUseElement: SVGUseElement = _
  var correspondingElement: SVGElement = _
  var firstChild: SVGElementInstance = _
}


/**
  * The SVGCircleElement interface provides access to the properties of <circle>
  * elements, as well as methods to manipulate them.
*/
class SVGCircleElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
/**
  * Corresponds to attribute cx on the given <circle> element.
*/
  var cx: SVGAnimatedLength = _
/**
  * Corresponds to attribute r on the given <circle> element.
*/
  var r: SVGAnimatedLength = _
/**
  * Corresponds to attribute cy on the given <circle> element.
*/
  var cy: SVGAnimatedLength = _
}


/**
  * The SVGRect represents rectangular geometry. Rectangles are defined as
  * consisting of a (x,y) coordinate pair identifying a minimum X value, a minimum Y
  * value, and a width and height, which are usually constrained to be non-negative.
*/
class SVGRect extends js.Object {
/**
  * The y coordinate of the rectangle, in user units.
*/
  var y: js.Number = _
/**
  * The width coordinate of the rectangle, in user units.
*/
  var width: js.Number = _
/**
  * The x coordinate of the rectangle, in user units.
*/
  var x: js.Number = _
/**
  * The height coordinate of the rectangle, in user units.
*/
  var height: js.Number = _
}


class SVGPathSegCurvetoCubicAbs extends SVGPathSeg {
  var y: js.Number = _
  var y1: js.Number = _
  var x2: js.Number = _
  var x: js.Number = _
  var x1: js.Number = _
  var y2: js.Number = _
}


class SVGPathSegCurvetoQuadraticAbs extends SVGPathSeg {
  var y: js.Number = _
  var y1: js.Number = _
  var x: js.Number = _
  var x1: js.Number = _
}


class SVGPathSegLinetoAbs extends SVGPathSeg {
  var y: js.Number = _
  var x: js.Number = _
}


/**
  * Many of SVG's graphics operations utilize 2x3 matrices of the form:
*/
class SVGMatrix extends js.Object {
  var e: js.Number = _
  var c: js.Number = _
  var a: js.Number = _
  var b: js.Number = _
  var d: js.Number = _
  var f: js.Number = _

/**
  * Performs matrix multiplication. This matrix is post-multiplied by another
  * matrix, returning the resulting new matrix.
*/
  def multiply(secondMatrix: SVGMatrix): SVGMatrix = ???

/**
  * Post-multiplies the transformation [1 0 0 -1 0 0] and returns the resulting
  * matrix.
*/
  def flipY(): SVGMatrix = ???

/**
  * Post-multiplies a skewY transformation on the current matrix and returns the
  * resulting matrix.
*/
  def skewY(angle: js.Number): SVGMatrix = ???

/**
  * Return the inverse matrix Exceptions: a DOMException with code
  * SVG_MATRIX_NOT_INVERTABLE is raised if the matrix is not invertable.
*/
  def inverse(): SVGMatrix = ???

/**
  * Post-multiplies a non-uniform scale transformation on the current matrix and
  * returns the resulting matrix.
*/
  def scaleNonUniform(scaleFactorX: js.Number, scaleFactorY: js.Number): SVGMatrix = ???

/**
  * Post-multiplies a rotation transformation on the current matrix and returns the
  * resulting matrix.
*/
  def rotate(angle: js.Number): SVGMatrix = ???

/**
  * Post-multiplies the transformation [-1 0 0 1 0 0] and returns the resulting
  * matrix.
*/
  def flipX(): SVGMatrix = ???

/**
  * Post-multiplies a translation transformation on the current matrix and returns
  * the resulting matrix.
*/
  def translate(x: js.Number, y: js.Number): SVGMatrix = ???

/**
  * Post-multiplies a uniform scale transformation on the current matrix and returns
  * the resulting matrix.
*/
  def scale(scaleFactor: js.Number): SVGMatrix = ???

/**
  * Post-multiplies a rotation transformation on the current matrix and returns the
  * resulting matrix. The rotation angle is determined by taking (+/-) atan(y/x). The
  * direction of the vector (x, y) determines whether the positive or negative angle
  * value is used. Exceptions: a DOMException with code SVG_INVALID_VALUE_ERR is
  * raised if one of the parameters has an invalid value.
*/
  def rotateFromVector(x: js.Number, y: js.Number): SVGMatrix = ???

/**
  * Post-multiplies a skewX transformation on the current matrix and returns the
  * resulting matrix.
*/
  def skewX(angle: js.Number): SVGMatrix = ???
}


/**
  * The SVGUseElement interface provides access to the properties of <use> elements,
  * as well as methods to manipulate them.
*/
class SVGUseElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired with SVGURIReference {
/**
  * Corresponds to attribute y on the given <use> element.
*/
  var y: SVGAnimatedLength = _
/**
  * Corresponds to attribute width on the given <use> element.
*/
  var width: SVGAnimatedLength = _
/**
  * If the xlink:href attribute is being animated, contains the current animated root
  * of the instance tree. If the xlink:href attribute is not currently being animated,
  * contains the same value as instanceRoot. See description of SVGElementInstance
  * to learn more about the instance tree.
*/
  var animatedInstanceRoot: SVGElementInstance = _
/**
  * The root of the instance tree. See description of SVGElementInstance to learn more
  * about the instance tree.
*/
  var instanceRoot: SVGElementInstance = _
/**
  * Corresponds to attribute x on the given <use> element.
*/
  var x: SVGAnimatedLength = _
/**
  * Corresponds to attribute height on the given <use> element.
*/
  var height: SVGAnimatedLength = _
}


trait SVGException extends js.Object {
  var code: js.Number = _
  var message: js.String = _

  var SVG_MATRIX_NOT_INVERTABLE: js.Number = _
  var SVG_WRONG_TYPE_ERR: js.Number = _
  var SVG_INVALID_VALUE_ERR: js.Number = _
  var name: js.String = _
}

object SVGException extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGException),List())))) */
  var SVG_MATRIX_NOT_INVERTABLE: js.Number = _
  var SVG_WRONG_TYPE_ERR: js.Number = _
  var SVG_INVALID_VALUE_ERR: js.Number = _
}

/**
  * The SVGLinearGradientElement interface corresponds to the <lineargradient>
  * element.
*/
class SVGLinearGradientElement extends SVGGradientElement {
/**
  * Corresponds to attribute y1 on the given <lineargradient> element.
*/
  var y1: SVGAnimatedLength = _
/**
  * Corresponds to attribute x2 on the given <lineargradient> element.
*/
  var x2: SVGAnimatedLength = _
/**
  * Corresponds to attribute x1 on the given <lineargradient> element.
*/
  var x1: SVGAnimatedLength = _
/**
  * Corresponds to attribute y2 on the given <lineargradient> element.
*/
  var y2: SVGAnimatedLength = _
}


/**
  * The SVGAnimatedEnumeration interface is used for attributes whose value must be a
  * constant from a particular enumeration and which can be animated.
*/
class SVGAnimatedEnumeration extends js.Object {
/**
  * If the given attribute or property is being animated, contains the current
  * animated value of the attribute or property. If the given attribute or property is
  * not currently being animated, contains the same value as baseVal.
*/
  var animVal: js.Number = _
/**
  * The base value of the given attribute before applying any animations.
*/
  var baseVal: js.Number = _
}


/**
  * The SVGRectElement interface provides access to the properties of <rect>
  * elements, as well as methods to manipulate them.
*/
class SVGRectElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
/**
  * Corresponds to attribute y on the given <rect> element.
*/
  var y: SVGAnimatedLength = _
/**
  * Corresponds to attribute width on the given <rect> element.
*/
  var width: SVGAnimatedLength = _
/**
  * Corresponds to attribute ry on the given <rect> element.
*/
  var ry: SVGAnimatedLength = _
/**
  * Corresponds to attribute rx on the given <rect> element.
*/
  var rx: SVGAnimatedLength = _
/**
  * Corresponds to attribute x on the given <rect> element.
*/
  var x: SVGAnimatedLength = _
/**
  * Corresponds to attribute height on the given <rect> element.
*/
  var height: SVGAnimatedLength = _
}


class SVGPathSegCurvetoQuadraticSmoothAbs extends SVGPathSeg {
  var y: js.Number = _
  var x: js.Number = _
}


class SVGPathSegCurvetoCubicSmoothRel extends SVGPathSeg {
  var y: js.Number = _
  var x2: js.Number = _
  var x: js.Number = _
  var y2: js.Number = _
}


/**
  * The SVGLengthList defines a list of SVGLength objects.
*/
class SVGLengthList extends js.Object {
  var numberOfItems: js.Number = _

/**
  * Replaces an existing item in the list with a new item. If newItem is already in a list,
  * it is removed from its previous list before it is inserted into this list. The
  * inserted item is the item itself and not a copy. If the item is already in this list,
  * note that the index of the item to replace is before the removal of the item.
  * Exceptions: a DOMException with code NO_MODIFICATION_ALLOWED_ERR is raised
  * when the list corresponds to a read only attribute or when the object itself is read
  * only. a DOMException with code INDEX_SIZE_ERR is raised if the index number is
  * greater than or equal to numberOfItems.
*/
  def replaceItem(newItem: SVGLength, index: js.Number): SVGLength = ???

/**
  * Returns the specified item from the list. The returned item is the item itself and
  * not a copy. Any changes made to the item are immediately reflected in the list. The
  * first item is number 0. Exceptions: a DOMException with code
  * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
  * attribute or when the object itself is read only.
*/
  def getItem(index: js.Number): SVGLength = ???

/**
  * Clears all existing current items from the list, with the result being an empty
  * list. Exceptions: a DOMException with code NO_MODIFICATION_ALLOWED_ERR is
  * raised when the list corresponds to a read only attribute or when the object itself
  * is read only.
*/
  def clear(): Unit = ???

/**
  * Inserts a new item at the end of the list. If newItem is already in a list, it is removed
  * from its previous list before it is inserted into this list. The inserted item is the
  * item itself and not a copy. Exceptions: a DOMException with code
  * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
  * attribute or when the object itself is read only.
*/
  def appendItem(newItem: SVGLength): SVGLength = ???

/**
  * Clears all existing current items from the list and re-initializes the list to hold
  * the single item specified by the parameter. If the inserted item is already in a
  * list, it is removed from its previous list before it is inserted into this list. The
  * inserted item is the item itself and not a copy. The return value is the item inserted
  * into the list. Exceptions: a DOMException with code
  * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
  * attribute or when the object itself is read only.
*/
  def initialize(newItem: SVGLength): SVGLength = ???

/**
  * Removes an existing item from the list. Exceptions: a DOMException with code
  * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
  * attribute or when the object itself is read only. a DOMException with code
  * INDEX_SIZE_ERR is raised if the index number is greater than or equal to
  * numberOfItems.
*/
  def removeItem(index: js.Number): SVGLength = ???

/**
  * Inserts a new item into the list at the specified position. The first item is number
  * 0. If newItem is already in a list, it is removed from its previous list before it is
  * inserted into this list. The inserted item is the item itself and not a copy. If the
  * item is already in this list, note that the index of the item to insert before is
  * before the removal of the item. If the index is equal to 0, then the new item is
  * inserted at the front of the list. If the index is greater than or equal to
  * numberOfItems, then the new item is appended to the end of the list. Exceptions: a
  * DOMException with code NO_MODIFICATION_ALLOWED_ERR is raised when the list
  * corresponds to a read only attribute or when the object itself is read only.
*/
  def insertItemBefore(newItem: SVGLength, index: js.Number): SVGLength = ???
}


/**
  * The SVGPolylineElement interface provides access to the properties of
  * <polyline> elements, as well as methods to manipulate them.
*/
class SVGPolylineElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGAnimatedPoints with SVGTests with SVGExternalResourcesRequired {
}


trait SVGAnimatedPathData extends js.Object {
  var pathSegList: SVGPathSegList = _
}

trait SVGZoomAndPan extends js.Object {
  var zoomAndPan: js.Number = _
  var SVG_ZOOMANDPAN_MAGNIFY: js.Number = _
  var SVG_ZOOMANDPAN_UNKNOWN: js.Number = _
  var SVG_ZOOMANDPAN_DISABLE: js.Number = _
}

object SVGZoomAndPan extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGZoomAndPan),List())))) */
  var SVG_ZOOMANDPAN_MAGNIFY: js.Number = _
  var SVG_ZOOMANDPAN_UNKNOWN: js.Number = _
  var SVG_ZOOMANDPAN_DISABLE: js.Number = _
}


class SVGTextPathElement extends SVGTextContentElement with SVGURIReference {
  var startOffset: SVGAnimatedLength = _
  var method: SVGAnimatedEnumeration = _
  var spacing: SVGAnimatedEnumeration = _
  var TEXTPATH_SPACINGTYPE_EXACT: js.Number = _
  var TEXTPATH_METHODTYPE_STRETCH: js.Number = _
  var TEXTPATH_SPACINGTYPE_AUTO: js.Number = _
  var TEXTPATH_SPACINGTYPE_UNKNOWN: js.Number = _
  var TEXTPATH_METHODTYPE_UNKNOWN: js.Number = _
  var TEXTPATH_METHODTYPE_ALIGN: js.Number = _
}

object SVGTextPathElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGTextPathElement),List())))) */
  var TEXTPATH_SPACINGTYPE_EXACT: js.Number = _
  var TEXTPATH_METHODTYPE_STRETCH: js.Number = _
  var TEXTPATH_SPACINGTYPE_AUTO: js.Number = _
  var TEXTPATH_SPACINGTYPE_UNKNOWN: js.Number = _
  var TEXTPATH_METHODTYPE_UNKNOWN: js.Number = _
  var TEXTPATH_METHODTYPE_ALIGN: js.Number = _
}

/**
  * The SVGGradient interface is a base interface used by SVGLinearGradientElement
  * and SVGRadialGradientElement.
*/
class SVGGradientElement extends SVGElement with SVGUnitTypes with SVGStylable with SVGExternalResourcesRequired with SVGURIReference {
/**
  * Corresponds to attribute spreadMethod on the given element. One of the Spread
  * Method Types defined on this interface.
*/
  var spreadMethod: SVGAnimatedEnumeration = _
/**
  * Corresponds to attribute gradientTransform on the given element.
*/
  var gradientTransform: SVGAnimatedTransformList = _
/**
  * Corresponds to attribute gradientUnits on the given element. Takes one of the
  * constants defined in SVGUnitTypes.
*/
  var gradientUnits: SVGAnimatedEnumeration = _
  var SVG_SPREADMETHOD_REFLECT: js.Number = _
  var SVG_SPREADMETHOD_PAD: js.Number = _
  var SVG_SPREADMETHOD_UNKNOWN: js.Number = _
  var SVG_SPREADMETHOD_REPEAT: js.Number = _
}

/**
  * The SVGGradient interface is a base interface used by SVGLinearGradientElement
  * and SVGRadialGradientElement.
*/
object SVGGradientElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGGradientElement),List())))) */
  var SVG_SPREADMETHOD_REFLECT: js.Number = _
  var SVG_SPREADMETHOD_PAD: js.Number = _
/**
  * The type is not one of predefined types. It is invalid to attempt to define a new value
  * of this type or to attempt to switch an existing value to this type.
*/
  var SVG_SPREADMETHOD_UNKNOWN: js.Number = _
  var SVG_SPREADMETHOD_REPEAT: js.Number = _
}

/**
  * The SVGNumberList defines a list of SVGNumber objects.
*/
class SVGNumberList extends js.Object {
  var numberOfItems: js.Number = _

/**
  * Replaces an existing item in the list with a new item. If newItem is already in a list,
  * it is removed from its previous list before it is inserted into this list. The
  * inserted item is the item itself and not a copy. If the item is already in this list,
  * note that the index of the item to replace is before the removal of the item.
  * Exceptions: a DOMException with code NO_MODIFICATION_ALLOWED_ERR is raised
  * when the list corresponds to a read only attribute or when the object itself is read
  * only. a DOMException with code INDEX_SIZE_ERR is raised if the index number is
  * greater than or equal to numberOfItems.
*/
  def replaceItem(newItem: SVGNumber, index: js.Number): SVGNumber = ???

/**
  * Returns the specified item from the list. The returned item is the item itself and
  * not a copy. Any changes made to the item are immediately reflected in the list. The
  * first item is number 0. Exceptions: a DOMException with code
  * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
  * attribute or when the object itself is read only.
*/
  def getItem(index: js.Number): SVGNumber = ???

/**
  * Clears all existing current items from the list, with the result being an empty
  * list. Exceptions: a DOMException with code NO_MODIFICATION_ALLOWED_ERR is
  * raised when the list corresponds to a read only attribute or when the object itself
  * is read only.
*/
  def clear(): Unit = ???

/**
  * Inserts a new item at the end of the list. If newItem is already in a list, it is removed
  * from its previous list before it is inserted into this list. The inserted item is the
  * item itself and not a copy. Exceptions: a DOMException with code
  * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
  * attribute or when the object itself is read only.
*/
  def appendItem(newItem: SVGNumber): SVGNumber = ???

/**
  * Clears all existing current items from the list and re-initializes the list to hold
  * the single item specified by the parameter. If the inserted item is already in a
  * list, it is removed from its previous list before it is inserted into this list. The
  * inserted item is the item itself and not a copy. The return value is the item inserted
  * into the list. Exceptions: a DOMException with code
  * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
  * attribute or when the object itself is read only.
*/
  def initialize(newItem: SVGNumber): SVGNumber = ???

/**
  * Removes an existing item from the list. Exceptions: a DOMException with code
  * NO_MODIFICATION_ALLOWED_ERR is raised when the list corresponds to a read only
  * attribute or when the object itself is read only. a DOMException with code
  * INDEX_SIZE_ERR is raised if the index number is greater than or equal to
  * numberOfItems.
*/
  def removeItem(index: js.Number): SVGNumber = ???

/**
  * Inserts a new item into the list at the specified position. The first item is number
  * 0. If newItem is already in a list, it is removed from its previous list before it is
  * inserted into this list. The inserted item is the item itself and not a copy. If the
  * item is already in this list, note that the index of the item to insert before is
  * before the removal of the item. If the index is equal to 0, then the new item is
  * inserted at the front of the list. If the index is greater than or equal to
  * numberOfItems, then the new item is appended to the end of the list. Exceptions: a
  * DOMException with code NO_MODIFICATION_ALLOWED_ERR is raised when the list
  * corresponds to a read only attribute or when the object itself is read only.
*/
  def insertItemBefore(newItem: SVGNumber, index: js.Number): SVGNumber = ???
}


class SVGPathSegLinetoRel extends SVGPathSeg {
  var y: js.Number = _
  var x: js.Number = _
}


/**
  * The SVGAnimatedBoolean interface is used for attributes of type boolean which can
  * be animated.
*/
class SVGAnimatedBoolean extends js.Object {
/**
  * If the given attribute or property is being animated, contains the current
  * animated value of the attribute or property. If the given attribute or property is
  * not currently being animated, contains the same value as baseVal.
*/
  var animVal: js.Boolean = _
/**
  * The base value of the given attribute before applying any animations.
*/
  var baseVal: js.Boolean = _
}


/**
  * The SVGSwitchElement interface corresponds to the <switch> element.
*/
class SVGSwitchElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
}


/**
  * The SVGPreserveAspectRatio interface corresponds to the preserveAspectRatio
  * attribute, which is available for some of SVG's elements.
*/
class SVGPreserveAspectRatio extends js.Object {
/**
  * The type of the alignment value as specified by one of the
  * SVG_PRESERVEASPECTRATIO_* constants defined on this interface.
*/
  var align: js.Number = _
/**
  * The type of the meet-or-slice value as specified by one of the SVG_MEETORSLICE_*
  * constants defined on this interface.
*/
  var meetOrSlice: js.Number = _
  var SVG_PRESERVEASPECTRATIO_NONE: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMINYMID: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMAXYMIN: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMINYMAX: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMAXYMAX: js.Number = _
  var SVG_MEETORSLICE_UNKNOWN: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMAXYMID: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMIDYMAX: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMINYMIN: js.Number = _
  var SVG_MEETORSLICE_MEET: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMIDYMID: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMIDYMIN: js.Number = _
  var SVG_MEETORSLICE_SLICE: js.Number = _
  var SVG_PRESERVEASPECTRATIO_UNKNOWN: js.Number = _
}

/**
  * The SVGPreserveAspectRatio interface corresponds to the preserveAspectRatio
  * attribute, which is available for some of SVG's elements.
*/
object SVGPreserveAspectRatio extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGPreserveAspectRatio),List())))) */
  var SVG_PRESERVEASPECTRATIO_NONE: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMINYMID: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMAXYMIN: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMINYMAX: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMAXYMAX: js.Number = _
/**
  * The enumeration was set to a value that is not one of predefined types. It is invalid
  * to attempt to define a new value of this type or to attempt to switch an existing value
  * to this type.
*/
  var SVG_MEETORSLICE_UNKNOWN: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMAXYMID: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMIDYMAX: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMINYMIN: js.Number = _
/**
  * Corresponds to value meet for attribute preserveAspectRatio.
*/
  var SVG_MEETORSLICE_MEET: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMIDYMID: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMIDYMIN: js.Number = _
/**
  * Corresponds to value slice for attribute preserveAspectRatio.
*/
  var SVG_MEETORSLICE_SLICE: js.Number = _
  var SVG_PRESERVEASPECTRATIO_UNKNOWN: js.Number = _
}


/**
  * The SVGStopElement interface corresponds to the <stop> element.
*/
class SVGStopElement extends SVGElement with SVGStylable {
/**
  * Corresponds to attribute offset on the given <stop> element.
*/
  var offset: SVGAnimatedNumber = _
}


/**
  * The SVGSymbolElement interface corresponds to the <symbol> element.
*/
class SVGSymbolElement extends SVGElement with SVGStylable with SVGLangSpace with SVGFitToViewBox with SVGExternalResourcesRequired {
}


class SVGElementInstanceList extends js.Object {
  var length: js.Number = _

  def item(index: js.Number): SVGElementInstance = ???
}


/**
  * The SVGMaskElement interface provides access to the properties of <mask>
  * elements, as well as methods to manipulate them.
*/
class SVGMaskElement extends SVGElement with SVGUnitTypes with SVGStylable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
/**
  * Corresponds to attribute y on the given <mask> element.
*/
  var y: SVGAnimatedLength = _
/**
  * Corresponds to attribute width on the given <mask> element.
*/
  var width: SVGAnimatedLength = _
/**
  * Corresponds to attribute maskUnits on the given <mask> element. Takes one of the
  * constants defined in SVGUnitTypes
*/
  var maskUnits: SVGAnimatedEnumeration = _
/**
  * Corresponds to attribute maskContentUnits on the given <mask> element. Takes one
  * of the constants defined in SVGUnitTypes
*/
  var maskContentUnits: SVGAnimatedEnumeration = _
/**
  * Corresponds to attribute x on the given <mask> element.
*/
  var x: SVGAnimatedLength = _
/**
  * Corresponds to attribute height on the given <mask> element.
*/
  var height: SVGAnimatedLength = _
}


/**
  * The SVGFilterElement interface provides access to the properties of <filter>
  * elements, as well as methods to manipulate them.
*/
class SVGFilterElement extends SVGElement with SVGUnitTypes with SVGStylable with SVGLangSpace with SVGURIReference with SVGExternalResourcesRequired {
/**
  * Corresponds to attribute y on the given <filter> element.
*/
  var y: SVGAnimatedLength = _
/**
  * Corresponds to attribute width on the given <filter> element.
*/
  var width: SVGAnimatedLength = _
/**
  * Contains the X component of attribute filterRes on the given <filter> element.
*/
  var filterResX: SVGAnimatedInteger = _
/**
  * Corresponds to attribute filterUnits on the given <filter> element. Takes one of
  * the constants defined in SVGUnitTypes.
*/
  var filterUnits: SVGAnimatedEnumeration = _
/**
  * Corresponds to attribute primitiveUnits on the given <filter> element. Takes one
  * of the constants defined in SVGUnitTypes.
*/
  var primitiveUnits: SVGAnimatedEnumeration = _
/**
  * Corresponds to attribute x on the given <filter> element.
*/
  var x: SVGAnimatedLength = _
/**
  * Corresponds to attribute height on the given <filter> element.
*/
  var height: SVGAnimatedLength = _
/**
  * Contains the Y component of attribute filterRes on the given <filter> element.
*/
  var filterResY: SVGAnimatedInteger = _

/**
  * Sets the values for attribute filterRes.
*/
  def setFilterRes(filterResX: js.Number, filterResY: js.Number): Unit = ???
}


class SVGFEMergeNodeElement extends SVGElement {
  var in1: SVGAnimatedString = _
}


class SVGFEFloodElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
}


class SVGFEFuncAElement extends SVGComponentTransferFunctionElement {
}


class SVGFETileElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var in1: SVGAnimatedString = _
}


class SVGFEBlendElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var in2: SVGAnimatedString = _
  var mode: SVGAnimatedEnumeration = _
  var in1: SVGAnimatedString = _
  var SVG_FEBLEND_MODE_DARKEN: js.Number = _
  var SVG_FEBLEND_MODE_UNKNOWN: js.Number = _
  var SVG_FEBLEND_MODE_MULTIPLY: js.Number = _
  var SVG_FEBLEND_MODE_NORMAL: js.Number = _
  var SVG_FEBLEND_MODE_SCREEN: js.Number = _
  var SVG_FEBLEND_MODE_LIGHTEN: js.Number = _
}

object SVGFEBlendElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEBlendElement),List())))) */
  var SVG_FEBLEND_MODE_DARKEN: js.Number = _
  var SVG_FEBLEND_MODE_UNKNOWN: js.Number = _
  var SVG_FEBLEND_MODE_MULTIPLY: js.Number = _
  var SVG_FEBLEND_MODE_NORMAL: js.Number = _
  var SVG_FEBLEND_MODE_SCREEN: js.Number = _
  var SVG_FEBLEND_MODE_LIGHTEN: js.Number = _
}

class SVGFEMergeElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
}


class SVGFEPointLightElement extends SVGElement {
  var y: SVGAnimatedNumber = _
  var x: SVGAnimatedNumber = _
  var z: SVGAnimatedNumber = _
}


class SVGFEGaussianBlurElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var stdDeviationX: SVGAnimatedNumber = _
  var in1: SVGAnimatedString = _
  var stdDeviationY: SVGAnimatedNumber = _

  def setStdDeviation(stdDeviationX: js.Number, stdDeviationY: js.Number): Unit = ???
}


trait SVGFilterPrimitiveStandardAttributes extends SVGStylable {
  var y: SVGAnimatedLength = _
  var width: SVGAnimatedLength = _
  var x: SVGAnimatedLength = _
  var height: SVGAnimatedLength = _
  var result: SVGAnimatedString = _
}

class SVGFESpecularLightingElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var kernelUnitLengthY: SVGAnimatedNumber = _
  var surfaceScale: SVGAnimatedNumber = _
  var specularExponent: SVGAnimatedNumber = _
  var in1: SVGAnimatedString = _
  var kernelUnitLengthX: SVGAnimatedNumber = _
  var specularConstant: SVGAnimatedNumber = _
}


class SVGFEMorphologyElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var operator: SVGAnimatedEnumeration = _
  var radiusX: SVGAnimatedNumber = _
  var radiusY: SVGAnimatedNumber = _
  var in1: SVGAnimatedString = _
  var SVG_MORPHOLOGY_OPERATOR_UNKNOWN: js.Number = _
  var SVG_MORPHOLOGY_OPERATOR_ERODE: js.Number = _
  var SVG_MORPHOLOGY_OPERATOR_DILATE: js.Number = _
}

object SVGFEMorphologyElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEMorphologyElement),List())))) */
  var SVG_MORPHOLOGY_OPERATOR_UNKNOWN: js.Number = _
  var SVG_MORPHOLOGY_OPERATOR_ERODE: js.Number = _
  var SVG_MORPHOLOGY_OPERATOR_DILATE: js.Number = _
}

class SVGFEFuncRElement extends SVGComponentTransferFunctionElement {
}


class SVGFEDisplacementMapElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var in2: SVGAnimatedString = _
  var xChannelSelector: SVGAnimatedEnumeration = _
  var yChannelSelector: SVGAnimatedEnumeration = _
  var scale: SVGAnimatedNumber = _
  var in1: SVGAnimatedString = _
  var SVG_CHANNEL_B: js.Number = _
  var SVG_CHANNEL_R: js.Number = _
  var SVG_CHANNEL_G: js.Number = _
  var SVG_CHANNEL_UNKNOWN: js.Number = _
  var SVG_CHANNEL_A: js.Number = _
}

object SVGFEDisplacementMapElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEDisplacementMapElement),List())))) */
  var SVG_CHANNEL_B: js.Number = _
  var SVG_CHANNEL_R: js.Number = _
  var SVG_CHANNEL_G: js.Number = _
  var SVG_CHANNEL_UNKNOWN: js.Number = _
  var SVG_CHANNEL_A: js.Number = _
}

class SVGComponentTransferFunctionElement extends SVGElement {
  var tableValues: SVGAnimatedNumberList = _
  var slope: SVGAnimatedNumber = _
  var `type`: SVGAnimatedEnumeration = _
  var exponent: SVGAnimatedNumber = _
  var amplitude: SVGAnimatedNumber = _
  var intercept: SVGAnimatedNumber = _
  var offset: SVGAnimatedNumber = _
  var SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN: js.Number = _
  var SVG_FECOMPONENTTRANSFER_TYPE_TABLE: js.Number = _
  var SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY: js.Number = _
  var SVG_FECOMPONENTTRANSFER_TYPE_GAMMA: js.Number = _
  var SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE: js.Number = _
  var SVG_FECOMPONENTTRANSFER_TYPE_LINEAR: js.Number = _
}

object SVGComponentTransferFunctionElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGComponentTransferFunctionElement),List())))) */
  var SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN: js.Number = _
  var SVG_FECOMPONENTTRANSFER_TYPE_TABLE: js.Number = _
  var SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY: js.Number = _
  var SVG_FECOMPONENTTRANSFER_TYPE_GAMMA: js.Number = _
  var SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE: js.Number = _
  var SVG_FECOMPONENTTRANSFER_TYPE_LINEAR: js.Number = _
}

class SVGFEDistantLightElement extends SVGElement {
  var azimuth: SVGAnimatedNumber = _
  var elevation: SVGAnimatedNumber = _
}


class SVGFEFuncBElement extends SVGComponentTransferFunctionElement {
}


class SVGFETurbulenceElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var baseFrequencyX: SVGAnimatedNumber = _
  var numOctaves: SVGAnimatedInteger = _
  var `type`: SVGAnimatedEnumeration = _
  var baseFrequencyY: SVGAnimatedNumber = _
  var stitchTiles: SVGAnimatedEnumeration = _
  var seed: SVGAnimatedNumber = _
  var SVG_STITCHTYPE_UNKNOWN: js.Number = _
  var SVG_STITCHTYPE_NOSTITCH: js.Number = _
  var SVG_TURBULENCE_TYPE_UNKNOWN: js.Number = _
  var SVG_TURBULENCE_TYPE_TURBULENCE: js.Number = _
  var SVG_TURBULENCE_TYPE_FRACTALNOISE: js.Number = _
  var SVG_STITCHTYPE_STITCH: js.Number = _
}

object SVGFETurbulenceElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFETurbulenceElement),List())))) */
  var SVG_STITCHTYPE_UNKNOWN: js.Number = _
  var SVG_STITCHTYPE_NOSTITCH: js.Number = _
  var SVG_TURBULENCE_TYPE_UNKNOWN: js.Number = _
  var SVG_TURBULENCE_TYPE_TURBULENCE: js.Number = _
  var SVG_TURBULENCE_TYPE_FRACTALNOISE: js.Number = _
  var SVG_STITCHTYPE_STITCH: js.Number = _
}

class SVGFEFuncGElement extends SVGComponentTransferFunctionElement {
}


class SVGFEColorMatrixElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var in1: SVGAnimatedString = _
  var `type`: SVGAnimatedEnumeration = _
  var values: SVGAnimatedNumberList = _
  var SVG_FECOLORMATRIX_TYPE_SATURATE: js.Number = _
  var SVG_FECOLORMATRIX_TYPE_UNKNOWN: js.Number = _
  var SVG_FECOLORMATRIX_TYPE_MATRIX: js.Number = _
  var SVG_FECOLORMATRIX_TYPE_HUEROTATE: js.Number = _
  var SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA: js.Number = _
}

object SVGFEColorMatrixElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEColorMatrixElement),List())))) */
  var SVG_FECOLORMATRIX_TYPE_SATURATE: js.Number = _
  var SVG_FECOLORMATRIX_TYPE_UNKNOWN: js.Number = _
  var SVG_FECOLORMATRIX_TYPE_MATRIX: js.Number = _
  var SVG_FECOLORMATRIX_TYPE_HUEROTATE: js.Number = _
  var SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA: js.Number = _
}

class SVGFESpotLightElement extends SVGElement {
  var pointsAtY: SVGAnimatedNumber = _
  var y: SVGAnimatedNumber = _
  var limitingConeAngle: SVGAnimatedNumber = _
  var specularExponent: SVGAnimatedNumber = _
  var x: SVGAnimatedNumber = _
  var pointsAtZ: SVGAnimatedNumber = _
  var z: SVGAnimatedNumber = _
  var pointsAtX: SVGAnimatedNumber = _
}


class SVGFEOffsetElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var dy: SVGAnimatedNumber = _
  var in1: SVGAnimatedString = _
  var dx: SVGAnimatedNumber = _
}


class SVGFEImageElement extends SVGElement with SVGLangSpace with SVGFilterPrimitiveStandardAttributes with SVGURIReference with SVGExternalResourcesRequired {
  var preserveAspectRatio: SVGAnimatedPreserveAspectRatio = _
}


class SVGFECompositeElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var operator: SVGAnimatedEnumeration = _
  var in2: SVGAnimatedString = _
  var k2: SVGAnimatedNumber = _
  var k1: SVGAnimatedNumber = _
  var k3: SVGAnimatedNumber = _
  var in1: SVGAnimatedString = _
  var k4: SVGAnimatedNumber = _
  var SVG_FECOMPOSITE_OPERATOR_OUT: js.Number = _
  var SVG_FECOMPOSITE_OPERATOR_OVER: js.Number = _
  var SVG_FECOMPOSITE_OPERATOR_XOR: js.Number = _
  var SVG_FECOMPOSITE_OPERATOR_ARITHMETIC: js.Number = _
  var SVG_FECOMPOSITE_OPERATOR_UNKNOWN: js.Number = _
  var SVG_FECOMPOSITE_OPERATOR_IN: js.Number = _
  var SVG_FECOMPOSITE_OPERATOR_ATOP: js.Number = _
}

object SVGFECompositeElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFECompositeElement),List())))) */
  var SVG_FECOMPOSITE_OPERATOR_OUT: js.Number = _
  var SVG_FECOMPOSITE_OPERATOR_OVER: js.Number = _
  var SVG_FECOMPOSITE_OPERATOR_XOR: js.Number = _
  var SVG_FECOMPOSITE_OPERATOR_ARITHMETIC: js.Number = _
  var SVG_FECOMPOSITE_OPERATOR_UNKNOWN: js.Number = _
  var SVG_FECOMPOSITE_OPERATOR_IN: js.Number = _
  var SVG_FECOMPOSITE_OPERATOR_ATOP: js.Number = _
}

class SVGFEComponentTransferElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var in1: SVGAnimatedString = _
}


class SVGFEDiffuseLightingElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var kernelUnitLengthY: SVGAnimatedNumber = _
  var surfaceScale: SVGAnimatedNumber = _
  var in1: SVGAnimatedString = _
  var kernelUnitLengthX: SVGAnimatedNumber = _
  var diffuseConstant: SVGAnimatedNumber = _
}


object SVGFEConvolveMatrixElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEConvolveMatrixElement),List())))) */
  var SVG_EDGEMODE_WRAP: js.Number = _
  var SVG_EDGEMODE_DUPLICATE: js.Number = _
  var SVG_EDGEMODE_UNKNOWN: js.Number = _
  var SVG_EDGEMODE_NONE: js.Number = _
}

class SVGFEConvolveMatrixElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var orderY: SVGAnimatedInteger = _
  var kernelUnitLengthY: SVGAnimatedNumber = _
  var orderX: SVGAnimatedInteger = _
  var preserveAlpha: SVGAnimatedBoolean = _
  var kernelMatrix: SVGAnimatedNumberList = _
  var edgeMode: SVGAnimatedEnumeration = _
  var kernelUnitLengthX: SVGAnimatedNumber = _
  var bias: SVGAnimatedNumber = _
  var targetX: SVGAnimatedInteger = _
  var targetY: SVGAnimatedInteger = _
  var divisor: SVGAnimatedNumber = _
  var in1: SVGAnimatedString = _
  var SVG_EDGEMODE_WRAP: js.Number = _
  var SVG_EDGEMODE_DUPLICATE: js.Number = _
  var SVG_EDGEMODE_UNKNOWN: js.Number = _
  var SVG_EDGEMODE_NONE: js.Number = _
}
