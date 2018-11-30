package ConstructCode.FlyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * ÏíÔª¹¤³§
 * @author hello
 *
 */
public class PieceFactory {
	private static PieceFactory pieceFactory;
	private Map<String,Piece> map = new HashMap<>();
	public static PieceFactory getInstance(){
		if (pieceFactory == null) {
			synchronized (PieceFactory.class) {
				if (pieceFactory == null) {
					pieceFactory = new PieceFactory();
				}
			}
		}
		return pieceFactory;
	};
	
	public Piece getPiece(String key){
		if (!map.containsKey(key)) {
			map.put(key, new Piece());
		}
		return map.get(key);
	}
}
