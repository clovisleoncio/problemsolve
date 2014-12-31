package p118;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String linha = in.readLine();
		StringTokenizer stk = new StringTokenizer(linha);
		Q118 q118 = new Q118(Integer.parseInt(stk.nextToken()), Integer.parseInt(stk.nextToken()));
		while ( (linha = in.readLine()) != null) {
			stk = new StringTokenizer(linha);
			q118.init(Integer.parseInt(stk.nextToken()), Integer.parseInt(stk.nextToken()), Direction.valueOf(stk.nextToken()));
			q118.execute(in.readLine());
			System.out.println(q118.getFinalState());
		}
		
		in.close();
	}
	
	public static enum Direction {
		N(0, 1), E(1, 0), S(0, -1), W(-1, 0);

		public static int getIndex(Direction reference) {
			for (int i = 0; i < values().length; i++) {
				if (values()[i] == reference) {
					return i;
				}
			}
			return -1;
		}
		
		private int x;
		private int y;

		Direction(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}
		
	}

	
	public static class Coordinate {
		
		private int x;
		private int y;
		
		public Coordinate(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public Coordinate(Coordinate reference, Direction direction) {
			this(reference.getX() + direction.getX(), reference.getY() + direction.getY());
		}
		
		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}

		public boolean isInside(int width, int height) {
			return (x >= 0 && x <= width) && (y >= 0 && y <= height);
		}

		@Override
		public int hashCode() {
			return x + y;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (!(obj instanceof Coordinate))
				return false;
			Coordinate other = (Coordinate) obj;
			if (x != other.x)
				return false;
			if (y != other.y)
				return false;
			return true;
		}
		
		
	}

	public static class Q118 {
		

		private int width;
		private int height;

		private Coordinate coordinate;
		private int directionIndex;
		
		private Set<Coordinate> lostRobots = new HashSet<Coordinate>();
		private boolean lost;

		public Q118(int width, int height) {
			this.width = width;
			this.height = height;
		}

		public void init(int x, int y, Direction direction) {
			this.coordinate = new Coordinate(x, y);
			this.directionIndex = Direction.getIndex(direction);
			this.lost = false;
		}

		public Coordinate getCoordinate() {
			return coordinate;
		}

		public Direction getDirection() {
			return Direction.values()[directionIndex];
		}

		public void turnLeft() {
			directionIndex = ((directionIndex - 1) + Direction.values().length) % Direction.values().length;
		}

		public void turnRight() {
			directionIndex = (directionIndex + 1) % Direction.values().length;
		}

		public boolean forward() {
			Direction direction = Direction.values()[directionIndex];
			
			Coordinate newCoordinate = new Coordinate(coordinate, direction);
			
			boolean inside = newCoordinate.isInside(width, height);
			
			if (inside) {
				coordinate = newCoordinate;
			}
			else {
				inside = lostRobots.contains(coordinate);
				lostRobots.add(coordinate);
			}

			return inside;
		}

		public void execute(String input) {
			char[] inputChars = input.toCharArray();
			for (int i = 0; i < inputChars.length && !lost; i++) {
				char c = inputChars[i];
				switch (c) {
				case 'R':
					turnRight();
					break;
					
				case 'L':
					turnLeft();
					break;

				default:
					if (!forward()) {
						lost = true;
					}
					break;
				}
			}
		}

		public String getFinalState() {
			String state = coordinate.getX() + " " + coordinate.getY() + " " + Direction.values()[directionIndex];
			if (lost) {
				state += " LOST";
			}
			return state;
		}


	}

}
