package org.chromium.net;

import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class UrlResponseInfo {

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public abstract class HeaderBlock {
        public abstract List getAsList();

        public abstract Map getAsMap();
    }

    public abstract Map getAllHeaders();

    public abstract List getAllHeadersAsList();

    public abstract int getHttpStatusCode();

    public abstract String getHttpStatusText();

    public abstract String getNegotiatedProtocol();

    public abstract String getProxyServer();

    public abstract long getReceivedByteCount();

    public abstract String getUrl();

    public abstract List getUrlChain();

    public abstract boolean wasCached();
}
