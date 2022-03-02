package defpackage;

import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* renamed from: bawv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bawv extends HttpURLConnection {
    public static final /* synthetic */ int h = 0;
    public final bawy a = new bawy();
    public UrlRequest b;
    public final baww c = new baww(this);
    public bawx d;
    public UrlResponseInfo e;
    public IOException f;
    public boolean g;
    private final CronetEngine i;
    private final List j = new ArrayList();
    private boolean k;
    private int l;
    private boolean m;
    private int n;
    /* access modifiers changed from: private */
    public boolean o;
    private List p;
    private Map q;

    static {
        bawv.class.getSimpleName();
    }

    public bawv(URL url, CronetEngine cronetEngine) {
        super(url);
        this.i = cronetEngine;
    }

    private final int a(String str) {
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            if (((String) ((Pair) this.j.get(i2)).first).equalsIgnoreCase(str)) {
                return i2;
            }
        }
        return -1;
    }

    private final void b() {
        if (!this.connected) {
            ExperimentalUrlRequest.Builder builder = (ExperimentalUrlRequest.Builder) this.i.newUrlRequestBuilder(getURL().toString(), new bawu(this), this.a);
            if (this.doOutput) {
                if (this.method.equals("GET")) {
                    this.method = "POST";
                }
                bawx bawx = this.d;
                if (bawx != null) {
                    builder.setUploadDataProvider(bawx.c(), (Executor) this.a);
                    if (getRequestProperty("Content-Length") == null && !d()) {
                        addRequestProperty("Content-Length", Long.toString(this.d.c().getLength()));
                    }
                    this.d.a();
                } else if (getRequestProperty("Content-Length") == null) {
                    addRequestProperty("Content-Length", "0");
                }
                if (getRequestProperty("Content-Type") == null) {
                    addRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                }
            }
            List list = this.j;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Pair pair = (Pair) list.get(i2);
                builder.addHeader((String) pair.first, (String) pair.second);
            }
            if (!getUseCaches()) {
                builder.disableCache();
            }
            builder.setHttpMethod(this.method);
            if (this.k) {
                builder.setTrafficStatsTag(this.l);
            }
            if (this.m) {
                builder.setTrafficStatsUid(this.n);
            }
            ExperimentalUrlRequest build = builder.build();
            this.b = build;
            build.start();
            this.connected = true;
        }
    }

    private final Map.Entry c(int i2) {
        try {
            c();
            List f2 = f();
            if (i2 < f2.size()) {
                return (Map.Entry) f2.get(i2);
            }
            return null;
        } catch (IOException e2) {
            return null;
        }
    }

    private final Map e() {
        Map map = this.q;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry entry : f()) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add((String) entry.getValue());
            treeMap.put((String) entry.getKey(), Collections.unmodifiableList(arrayList));
        }
        Map unmodifiableMap = Collections.unmodifiableMap(treeMap);
        this.q = unmodifiableMap;
        return unmodifiableMap;
    }

    private final List f() {
        List list = this.p;
        if (list != null) {
            return list;
        }
        this.p = new ArrayList();
        for (Map.Entry entry : this.e.getAllHeadersAsList()) {
            if (!((String) entry.getKey()).equalsIgnoreCase("Content-Encoding")) {
                this.p.add(new AbstractMap.SimpleImmutableEntry(entry));
            }
        }
        List unmodifiableList = Collections.unmodifiableList(this.p);
        this.p = unmodifiableList;
        return unmodifiableList;
    }

    public final void addRequestProperty(String str, String str2) {
        a(str, str2, false);
    }

    public final void connect() {
        getOutputStream();
        b();
    }

    public final void disconnect() {
        if (this.connected) {
            this.b.cancel();
        }
    }

    public final InputStream getErrorStream() {
        try {
            c();
            if (this.e.getHttpStatusCode() >= 400) {
                return this.c;
            }
            return null;
        } catch (IOException e2) {
            return null;
        }
    }

    public final String getHeaderField(int i2) {
        Map.Entry c2 = c(i2);
        if (c2 != null) {
            return (String) c2.getValue();
        }
        return null;
    }

    public final String getHeaderFieldKey(int i2) {
        Map.Entry c2 = c(i2);
        if (c2 != null) {
            return (String) c2.getKey();
        }
        return null;
    }

    public final Map getHeaderFields() {
        try {
            c();
            return e();
        } catch (IOException e2) {
            return Collections.emptyMap();
        }
    }

    public final InputStream getInputStream() {
        c();
        if (!this.instanceFollowRedirects && this.g) {
            throw new IOException("Cannot read response body of a redirect.");
        } else if (this.e.getHttpStatusCode() < 400) {
            return this.c;
        } else {
            throw new FileNotFoundException(this.url.toString());
        }
    }

    public final OutputStream getOutputStream() {
        if (this.d == null && this.doOutput) {
            if (this.connected) {
                throw new ProtocolException("Cannot write to OutputStream after receiving response.");
            } else if (d()) {
                this.d = new bawr(this.chunkLength, this.a);
                b();
            } else {
                long a2 = a();
                if (a2 != -1) {
                    this.d = new bawt(a2, this.a);
                    b();
                } else {
                    String requestProperty = getRequestProperty("Content-Length");
                    if (requestProperty == null) {
                        this.d = new bawp();
                    } else {
                        this.d = new bawp(Long.parseLong(requestProperty));
                    }
                }
            }
        }
        return this.d;
    }

    public final Map getRequestProperties() {
        if (!this.connected) {
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            List list = this.j;
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                Pair pair = (Pair) list.get(i2);
                if (!treeMap.containsKey(pair.first)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add((String) pair.second);
                    treeMap.put((String) pair.first, Collections.unmodifiableList(arrayList));
                    i2++;
                } else {
                    throw new IllegalStateException("Should not have multiple values.");
                }
            }
            return Collections.unmodifiableMap(treeMap);
        }
        throw new IllegalStateException("Cannot access request headers after connection is set.");
    }

    public final String getRequestProperty(String str) {
        int a2 = a(str);
        if (a2 >= 0) {
            return (String) ((Pair) this.j.get(a2)).second;
        }
        return null;
    }

    public final int getResponseCode() {
        c();
        return this.e.getHttpStatusCode();
    }

    public final String getResponseMessage() {
        c();
        return this.e.getHttpStatusText();
    }

    public final void setConnectTimeout(int i2) {
    }

    public final void setRequestProperty(String str, String str2) {
        a(str, str2, true);
    }

    public final boolean usingProxy() {
        return false;
    }

    private final long a() {
        long j2 = (long) this.fixedContentLength;
        try {
            long j3 = getClass().getField("fixedContentLengthLong").getLong(this);
            return j3 != -1 ? j3 : j2;
        } catch (IllegalAccessException | NoSuchFieldException e2) {
            return j2;
        }
    }

    private final boolean d() {
        return this.chunkLength > 0;
    }

    public final String getHeaderField(String str) {
        try {
            c();
            Map e2 = e();
            if (!e2.containsKey(str)) {
                return null;
            }
            List list = (List) e2.get(str);
            return (String) list.get(list.size() - 1);
        } catch (IOException e3) {
            return null;
        }
    }

    private final void c() {
        bawx bawx = this.d;
        if (bawx != null) {
            bawx.b();
            if (d()) {
                this.d.close();
            }
        }
        if (!this.o) {
            b();
            this.a.a();
        }
        if (this.o) {
            IOException iOException = this.f;
            if (iOException != null) {
                throw iOException;
            } else if (this.e == null) {
                throw new NullPointerException("Response info is null when there is no exception.");
            }
        } else {
            throw new IllegalStateException("No response.");
        }
    }

    private final void a(String str, String str2, boolean z) {
        if (!this.connected) {
            int a2 = a(str);
            if (a2 >= 0) {
                if (z) {
                    this.j.remove(a2);
                } else {
                    throw new UnsupportedOperationException("Cannot add multiple headers of the same key, " + str + ". crbug.com/432719.");
                }
            }
            this.j.add(Pair.create(str, str2));
            return;
        }
        throw new IllegalStateException("Cannot modify request property after connection is made.");
    }

    public final void a(int i2) {
        if (!this.connected) {
            this.k = true;
            this.l = i2;
            return;
        }
        throw new IllegalStateException("Cannot modify traffic stats tag after connection is made.");
    }

    public final void b(int i2) {
        if (!this.connected) {
            this.m = true;
            this.n = i2;
            return;
        }
        throw new IllegalStateException("Cannot modify traffic stats UID after connection is made.");
    }
}
