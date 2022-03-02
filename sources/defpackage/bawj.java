package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.UrlResponseInfo;

/* renamed from: bawj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bawj extends UrlResponseInfo {
    private final List a;
    private final int b;
    private final String c;
    private final String d;
    private final String e;
    private final AtomicLong f = new AtomicLong(0);
    private final bawi g;

    public bawj(List list, int i, String str, List list2, String str2, String str3) {
        this.a = Collections.unmodifiableList(list);
        this.b = i;
        this.c = str;
        this.g = new bawi(Collections.unmodifiableList(list2));
        this.d = str2;
        this.e = str3;
    }

    public final Map getAllHeaders() {
        bawi bawi = this.g;
        Map map = bawi.b;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry entry : bawi.a) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add((String) entry.getValue());
            treeMap.put((String) entry.getKey(), Collections.unmodifiableList(arrayList));
        }
        bawi.b = Collections.unmodifiableMap(treeMap);
        return bawi.b;
    }

    public final List getAllHeadersAsList() {
        return this.g.a;
    }

    public final int getHttpStatusCode() {
        return this.b;
    }

    public final String getHttpStatusText() {
        return this.c;
    }

    public final String getNegotiatedProtocol() {
        return this.d;
    }

    public final String getProxyServer() {
        return this.e;
    }

    public final long getReceivedByteCount() {
        return this.f.get();
    }

    public final String getUrl() {
        List list = this.a;
        return (String) list.get(list.size() - 1);
    }

    public final List getUrlChain() {
        return this.a;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        List list = this.a;
        return String.format(locale, "UrlResponseInfo@[%s][%s]: urlChain = %s, httpStatus = %d %s, headers = %s, wasCached = %b, negotiatedProtocol = %s, proxyServer= %s, receivedByteCount = %d", new Object[]{Integer.toHexString(System.identityHashCode(this)), (String) list.get(list.size() - 1), this.a.toString(), Integer.valueOf(this.b), this.c, getAllHeadersAsList().toString(), false, this.d, this.e, Long.valueOf(this.f.get())});
    }

    public final boolean wasCached() {
        return false;
    }
}
