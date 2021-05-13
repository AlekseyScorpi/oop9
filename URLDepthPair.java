import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;

public class URLDepthPair {

    public static final String URL_PREFIX = "http://";
    private String url;
    private int depth;

    public URLDepthPair(String url){
        this.url = url;
        this.depth = 0;
    }

    public URLDepthPair(String url, int depth) {
        this.url = url;
        this.depth = depth;
    }

    public String getHost() throws MalformedURLException{
        return (new URL(this.url).getHost());
    }

    public String getPath() throws MalformedURLException {
        return (new URL(this.url)).getPath();
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public boolean containsURL(URLDepthPair udp, LinkedList<URLDepthPair> list){
        for (URLDepthPair u : list){
            if (u.getUrl().equals(udp.getUrl())) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return  "url=" + url + ", depth=" + depth;
    }
}
