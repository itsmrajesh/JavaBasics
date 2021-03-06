package corejava.collectionframework.sports;

import java.util.List;

public interface PlayerContainer {
	void add(Player p);

	List<Player> getCricketPlayers();

	List<Player> getFootballPlayers();

	List<Player> getCommonPlayers(List<Player> football, List<Player> cricket);
}
