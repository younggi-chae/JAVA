package mvc.common;

public class Search extends Pagination {
	
	private String searchType;	
	private String keyword;
	
	public String getKeyword() {
		return keyword;
	}
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}	
}
