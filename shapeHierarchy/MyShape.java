package shapeHierarchy;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;


public interface MyShape {
	public boolean ContainsPoint(Point2D point);
	public void setPosition(Point2D point);
	public void moveRelative(double X, double Y);
	public void setLineColor(Color color);
}
