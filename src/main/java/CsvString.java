public class CsvString {
    private String url, keyword;
    private int countFreqOnSite;

    public String toString() {
        return url + ';' + keyword + ";" + countFreqOnSite;
    }

    public CsvString(String url, String keyword, int countFreqOnSite) {
        this.url = url;
        this.keyword = keyword;
        this.countFreqOnSite = countFreqOnSite;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public int getCountFreqOnSite() {
        return countFreqOnSite;
    }

    public void setCountFreqOnSite(int countFreqOnSite) {
        this.countFreqOnSite = countFreqOnSite;
    }
}
