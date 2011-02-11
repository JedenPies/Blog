package pl.jedenpies.blog.managers;

import pl.jedenpies.blog.db.hibernate.ds.WpisDs;

public interface WpisyManager {

	/**
	 * Zapisuje istniej�cy b�d� tworzy nowy wpis, w zale�no�ci od tego czy ustawiony
	 * jest identyfikator, czyli pole id.
	 * @param wpis wpis do zapisania
	 * @return zapisany wpis
	 */
	public WpisDs zapiszWpis(WpisDs wpis);
}
