package defpackage;

import com.android.volley.toolbox.HttpClientStack;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketPermission;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.Permission;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* renamed from: awdg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awdg extends HttpURLConnection {
    private static final Set e = new LinkedHashSet(Arrays.asList(new String[]{"OPTIONS", "GET", "HEAD", "POST", "PUT", "DELETE", "TRACE", HttpClientStack.HttpPatch.METHOD_NAME}));
    private static final avzk f = new avzk();
    final avze a;
    protected IOException b;
    protected awcs c;
    avyz d;
    private avza g = new avza();
    private long h = -1;
    private int i;
    private avzb j;
    private avzo k;

    static {
        awaj.a(0, 0);
    }

    public awdg(URL url, avze avze) {
        super(url);
        this.a = avze;
    }

    private final avzb a() {
        String str;
        if (this.j == null) {
            avzm d2 = c().d();
            avza b2 = d2.f.b();
            b2.c(awcw.d, d2.b.e);
            String str2 = awcw.e;
            avzm avzm = d2.h;
            if (avzm == null) {
                if (d2.i != null) {
                    int i2 = d2.c;
                    StringBuilder sb = new StringBuilder(17);
                    sb.append("CACHE ");
                    sb.append(i2);
                    str = sb.toString();
                } else {
                    str = "NONE";
                }
            } else if (d2.i == null) {
                int i3 = d2.c;
                StringBuilder sb2 = new StringBuilder(19);
                sb2.append("NETWORK ");
                sb2.append(i3);
                str = sb2.toString();
            } else {
                int i4 = avzm.c;
                StringBuilder sb3 = new StringBuilder(29);
                sb3.append("CONDITIONAL_CACHE ");
                sb3.append(i4);
                str = sb3.toString();
            }
            b2.c(str2, str);
            this.j = b2.a();
        }
        return this.j;
    }

    private final void b() {
        IOException iOException = this.b;
        if (iOException != null) {
            throw iOException;
        } else if (this.c == null) {
            this.connected = true;
            try {
                if (this.doOutput) {
                    if (this.method.equals("GET")) {
                        this.method = "POST";
                    } else if (!awct.b(this.method)) {
                        throw new ProtocolException(String.valueOf(this.method).concat(" does not support writing"));
                    }
                }
                this.c = a(this.method, (awde) null, (awda) null, (avzm) null);
            } catch (IOException e2) {
                this.b = e2;
                throw e2;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007f, code lost:
        if (r6.equals("HEAD") == false) goto L_0x00fd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x017d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.awcs c() {
        /*
            r9 = this;
            r9.b()
            awcs r0 = r9.c
            boolean r0 = r0.c()
            if (r0 != 0) goto L_0x018d
        L_0x000b:
            r0 = 1
            boolean r1 = r9.a(r0)
            if (r1 == 0) goto L_0x000b
            awcs r1 = r9.c
            avzm r1 = r1.d()
            awcs r2 = r9.c
            avzm r3 = r2.l
            if (r3 == 0) goto L_0x0187
            awde r3 = r2.c
            awdk r3 = r3.b()
            r4 = 0
            if (r3 == 0) goto L_0x002b
            avzo r3 = r3.a
            goto L_0x002c
        L_0x002b:
            r3 = r4
        L_0x002c:
            if (r3 != 0) goto L_0x0033
            avze r3 = r2.b
            java.net.Proxy r3 = r3.c
            goto L_0x0035
        L_0x0033:
            java.net.Proxy r3 = r3.b
        L_0x0035:
            avzm r5 = r2.l
            int r5 = r5.c
            avzj r6 = r2.i
            java.lang.String r6 = r6.b
            r7 = 307(0x133, float:4.3E-43)
            java.lang.String r8 = "GET"
            if (r5 == r7) goto L_0x0072
            r7 = 308(0x134, float:4.32E-43)
            if (r5 == r7) goto L_0x0072
            r7 = 401(0x191, float:5.62E-43)
            if (r5 == r7) goto L_0x0066
            r7 = 407(0x197, float:5.7E-43)
            if (r5 == r7) goto L_0x0055
            switch(r5) {
                case 300: goto L_0x0081;
                case 301: goto L_0x0081;
                case 302: goto L_0x0081;
                case 303: goto L_0x0081;
                default: goto L_0x0052;
            }
        L_0x0052:
            r2 = r4
            goto L_0x00fe
        L_0x0055:
            java.net.Proxy$Type r5 = r3.type()
            java.net.Proxy$Type r6 = java.net.Proxy.Type.HTTP
            if (r5 != r6) goto L_0x005e
            goto L_0x0066
        L_0x005e:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r0.<init>(r1)
            throw r0
        L_0x0066:
            avze r5 = r2.b
            awcb r5 = r5.t
            avzm r2 = r2.l
            avzj r2 = defpackage.awcw.a((defpackage.avzm) r2, (java.net.Proxy) r3)
            goto L_0x00fe
        L_0x0072:
            boolean r3 = r6.equals(r8)
            if (r3 != 0) goto L_0x0081
            java.lang.String r3 = "HEAD"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x00fd
        L_0x0081:
            avze r3 = r2.b
            boolean r3 = r3.o
            if (r3 == 0) goto L_0x00fd
            avzm r3 = r2.l
            java.lang.String r5 = "Location"
            java.lang.String r3 = r3.a(r5)
            if (r3 == 0) goto L_0x00fd
            avzj r5 = r2.i
            avzd r5 = r5.a
            avzc r7 = new avzc
            r7.<init>()
            int r3 = r7.a((defpackage.avzd) r5, (java.lang.String) r3)
            if (r3 != r0) goto L_0x00a5
            avzd r3 = r7.b()
            goto L_0x00a6
        L_0x00a5:
            r3 = r4
        L_0x00a6:
            if (r3 == 0) goto L_0x00fd
            java.lang.String r5 = r3.a
            avzj r7 = r2.i
            avzd r7 = r7.a
            java.lang.String r7 = r7.a
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x00b7
            goto L_0x00be
        L_0x00b7:
            avze r5 = r2.b
            boolean r5 = r5.n
            if (r5 != 0) goto L_0x00be
            goto L_0x00fd
        L_0x00be:
            avzj r5 = r2.i
            avzi r5 = r5.b()
            boolean r7 = defpackage.awct.b(r6)
            if (r7 == 0) goto L_0x00ea
            java.lang.String r7 = "PROPFIND"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L_0x00d6
            r5.a((java.lang.String) r8, (defpackage.avzk) r4)
            goto L_0x00da
        L_0x00d6:
            r5.a((java.lang.String) r6, (defpackage.avzk) r4)
        L_0x00da:
            java.lang.String r6 = "Transfer-Encoding"
            r5.a((java.lang.String) r6)
            java.lang.String r6 = "Content-Length"
            r5.a((java.lang.String) r6)
            java.lang.String r6 = "Content-Type"
            r5.a((java.lang.String) r6)
        L_0x00ea:
            boolean r2 = r2.a((defpackage.avzd) r3)
            if (r2 != 0) goto L_0x00f5
            java.lang.String r2 = "Authorization"
            r5.a((java.lang.String) r2)
        L_0x00f5:
            r5.a((defpackage.avzd) r3)
            avzj r2 = r5.a()
            goto L_0x00fe
        L_0x00fd:
            r2 = r4
        L_0x00fe:
            if (r2 == 0) goto L_0x017d
            int r3 = r9.i
            int r3 = r3 + r0
            r9.i = r3
            r0 = 20
            if (r3 > r0) goto L_0x0164
            java.net.URL r0 = r2.f
            if (r0 == 0) goto L_0x010e
            goto L_0x0116
        L_0x010e:
            avzd r0 = r2.a
            java.net.URL r0 = r0.a()
            r2.f = r0
        L_0x0116:
            r9.url = r0
            avzb r0 = r2.c
            avza r0 = r0.b()
            r9.g = r0
            awcs r0 = r9.c
            batz r0 = r0.b()
            java.lang.String r3 = r2.b
            java.lang.String r5 = r9.method
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0131
            goto L_0x0132
        L_0x0131:
            r0 = r4
        L_0x0132:
            if (r0 != 0) goto L_0x0135
            goto L_0x0139
        L_0x0135:
            boolean r3 = r0 instanceof defpackage.awda
            if (r3 == 0) goto L_0x015a
        L_0x0139:
            awcs r3 = r9.c
            awde r3 = r3.f()
            awcs r5 = r9.c
            avzd r6 = r2.a
            boolean r5 = r5.a((defpackage.avzd) r6)
            if (r5 == 0) goto L_0x014b
            r4 = r3
            goto L_0x014e
        L_0x014b:
            r3.c()
        L_0x014e:
            java.lang.String r2 = r2.b
            awda r0 = (defpackage.awda) r0
            awcs r0 = r9.a(r2, r4, r0, r1)
            r9.c = r0
            goto L_0x000b
        L_0x015a:
            java.net.HttpRetryException r0 = new java.net.HttpRetryException
            int r1 = r9.responseCode
            java.lang.String r2 = "Cannot retry streamed HTTP body"
            r0.<init>(r2, r1)
            throw r0
        L_0x0164:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 40
            r1.<init>(r2)
            java.lang.String r2 = "Too many follow-up requests: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x017d:
            awcs r0 = r9.c
            awde r0 = r0.c
            r0.c()
            awcs r0 = r9.c
            return r0
        L_0x0187:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x018d:
            awcs r0 = r9.c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awdg.c():awcs");
    }

    public final void addRequestProperty(String str, String str2) {
        if (this.connected) {
            throw new IllegalStateException("Cannot add request property after connection is made");
        } else if (str == null) {
            throw new NullPointerException("field == null");
        } else if (str2 == null) {
            awag awag = awag.a;
            StringBuilder sb = new StringBuilder(str.length() + 44);
            sb.append("Ignoring header ");
            sb.append(str);
            sb.append(" because its value was null.");
            awag.a(sb.toString());
        } else if ("X-Android-Transports".equals(str) || "X-Android-Protocols".equals(str)) {
            a(str2, true);
        } else {
            this.g.c(str, str2);
        }
    }

    public final void connect() {
        b();
        do {
        } while (!a(false));
    }

    public final void disconnect() {
        awcu awcu;
        awdk awdk;
        awcs awcs = this.c;
        if (awcs != null) {
            awde awde = awcs.c;
            synchronized (awde.b) {
                awde.f = true;
                awcu = awde.g;
                awdk = awde.d;
            }
            if (awcu != null) {
                awcu.a();
            } else if (awdk != null) {
                awdk.a();
            }
        }
    }

    public final int getConnectTimeout() {
        return this.a.q;
    }

    public final InputStream getErrorStream() {
        try {
            awcs c2 = c();
            if (!awcs.c(c2.d()) || c2.d().c < 400) {
                return null;
            }
            return c2.d().g.a();
        } catch (IOException e2) {
            return null;
        }
    }

    public final String getHeaderField(int i2) {
        try {
            return a().b(i2);
        } catch (IOException e2) {
            return null;
        }
    }

    public final String getHeaderFieldKey(int i2) {
        try {
            return a().a(i2);
        } catch (IOException e2) {
            return null;
        }
    }

    public final Map getHeaderFields() {
        try {
            return awcw.a(a(), awdd.a(c().d()).toString());
        } catch (IOException e2) {
            return Collections.emptyMap();
        }
    }

    public final InputStream getInputStream() {
        if (this.doInput) {
            awcs c2 = c();
            if (getResponseCode() < 400) {
                return c2.d().g.a();
            }
            throw new FileNotFoundException(this.url.toString());
        }
        throw new ProtocolException("This protocol does not support input");
    }

    public final boolean getInstanceFollowRedirects() {
        return this.a.o;
    }

    public final OutputStream getOutputStream() {
        connect();
        awcs awcs = this.c;
        bate bate = awcs.n;
        if (bate == null) {
            batz b2 = awcs.b();
            if (b2 != null) {
                bate = batq.a(b2);
                awcs.n = bate;
            } else {
                bate = null;
            }
        }
        if (bate == null) {
            String valueOf = String.valueOf(this.method);
            throw new ProtocolException(valueOf.length() == 0 ? new String("method does not support a request body: ") : "method does not support a request body: ".concat(valueOf));
        } else if (!this.c.c()) {
            return new bats((batt) bate);
        } else {
            throw new ProtocolException("cannot write request body after response has been read");
        }
    }

    public final Permission getPermission() {
        URL url = getURL();
        String host = url.getHost();
        int port = url.getPort() != -1 ? url.getPort() : avzd.a(url.getProtocol());
        if (usingProxy()) {
            InetSocketAddress inetSocketAddress = (InetSocketAddress) this.a.c.address();
            host = inetSocketAddress.getHostName();
            port = inetSocketAddress.getPort();
        }
        StringBuilder sb = new StringBuilder(String.valueOf(host).length() + 12);
        sb.append(host);
        sb.append(":");
        sb.append(port);
        return new SocketPermission(sb.toString(), "connect, resolve");
    }

    public final int getReadTimeout() {
        return this.a.r;
    }

    public final Map getRequestProperties() {
        if (!this.connected) {
            return awcw.a(this.g.a(), (String) null);
        }
        throw new IllegalStateException("Cannot access request header fields after connection is set");
    }

    public final String getRequestProperty(String str) {
        if (str == null) {
            return null;
        }
        avza avza = this.g;
        for (int size = avza.a.size() - 2; size >= 0; size -= 2) {
            if (str.equalsIgnoreCase((String) avza.a.get(size))) {
                return (String) avza.a.get(size + 1);
            }
        }
        return null;
    }

    public final int getResponseCode() {
        return c().d().c;
    }

    public final String getResponseMessage() {
        return c().d().d;
    }

    public final void setConnectTimeout(int i2) {
        avze avze = this.a;
        long j2 = (long) i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (j2 < 0) {
            throw new IllegalArgumentException("timeout < 0");
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j2);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException("Timeout too large.");
            } else if (millis == 0 && j2 > 0) {
                throw new IllegalArgumentException("Timeout too small.");
            } else {
                avze.q = (int) millis;
            }
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public final void setFixedLengthStreamingMode(int i2) {
        setFixedLengthStreamingMode((long) i2);
    }

    public final void setIfModifiedSince(long j2) {
        super.setIfModifiedSince(j2);
        if (this.ifModifiedSince != 0) {
            this.g.b("If-Modified-Since", ((DateFormat) awcq.b.get()).format(new Date(this.ifModifiedSince)));
            return;
        }
        this.g.a("If-Modified-Since");
    }

    public final void setInstanceFollowRedirects(boolean z) {
        this.a.o = z;
    }

    public final void setReadTimeout(int i2) {
        avze avze = this.a;
        long j2 = (long) i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (j2 < 0) {
            throw new IllegalArgumentException("timeout < 0");
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j2);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException("Timeout too large.");
            } else if (millis == 0 && j2 > 0) {
                throw new IllegalArgumentException("Timeout too small.");
            } else {
                avze.r = (int) millis;
            }
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public final void setRequestMethod(String str) {
        if (e.contains(str)) {
            this.method = str;
            return;
        }
        String valueOf = String.valueOf(e);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25 + String.valueOf(str).length());
        sb.append("Expected one of ");
        sb.append(valueOf);
        sb.append(" but was ");
        sb.append(str);
        throw new ProtocolException(sb.toString());
    }

    public final void setRequestProperty(String str, String str2) {
        if (this.connected) {
            throw new IllegalStateException("Cannot set request property after connection is made");
        } else if (str == null) {
            throw new NullPointerException("field == null");
        } else if (str2 == null) {
            awag awag = awag.a;
            StringBuilder sb = new StringBuilder(str.length() + 44);
            sb.append("Ignoring header ");
            sb.append(str);
            sb.append(" because its value was null.");
            awag.a(sb.toString());
        } else if ("X-Android-Transports".equals(str) || "X-Android-Protocols".equals(str)) {
            a(str2, false);
        } else {
            this.g.b(str, str2);
        }
    }

    public final boolean usingProxy() {
        avzo avzo = this.k;
        Proxy proxy = avzo == null ? this.a.c : avzo.b;
        return (proxy == null || proxy.type() == Proxy.Type.DIRECT) ? false : true;
    }

    public final String getHeaderField(String str) {
        if (str != null) {
            return a().a(str);
        }
        try {
            return awdd.a(c().d()).toString();
        } catch (IOException e2) {
            return null;
        }
    }

    public final void setFixedLengthStreamingMode(long j2) {
        if (this.connected) {
            throw new IllegalStateException("Already connected");
        } else if (this.chunkLength > 0) {
            throw new IllegalStateException("Already in chunked mode");
        } else if (j2 >= 0) {
            this.h = j2;
            this.fixedContentLength = (int) Math.min(j2, 2147483647L);
        } else {
            throw new IllegalArgumentException("contentLength < 0");
        }
    }

    private final awcs a(String str, awde awde, awda awda, avzm avzm) {
        avzk avzk;
        boolean z;
        String str2;
        if (awct.a(str)) {
            avzk = f;
        } else {
            avzk = null;
        }
        URL url = getURL();
        Logger logger = awaa.a;
        String url2 = url.toString();
        avzc avzc = new avzc();
        int a2 = avzc.a((avzd) null, url2);
        int i2 = a2 - 1;
        boolean z2 = true;
        if (i2 == 0) {
            avzd b2 = avzc.b();
            avzi avzi = new avzi();
            avzi.a(b2);
            String str3 = str;
            avzi.a(str, avzk);
            avzb a3 = this.g.a();
            int a4 = a3.a();
            for (int i3 = 0; i3 < a4; i3++) {
                avzi.a(a3.a(i3), a3.b(i3));
            }
            if (awct.b(str)) {
                long j2 = this.h;
                if (j2 != -1) {
                    avzi.b("Content-Length", Long.toString(j2));
                    z2 = false;
                } else if (this.chunkLength > 0) {
                    avzi.b("Transfer-Encoding", "chunked");
                    z2 = false;
                }
                if (a3.a("Content-Type") == null) {
                    avzi.b("Content-Type", "application/x-www-form-urlencoded");
                }
                z = z2;
            } else {
                z = false;
            }
            if (a3.a("User-Agent") == null) {
                String property = System.getProperty("http.agent");
                avzi.b("User-Agent", property == null ? "okhttp/2.7.2" : awaj.a(property));
            }
            return new awcs(this.a, avzi.a(), z, awde, awda, avzm);
        } else if (i2 != 4) {
            if (a2 != 1) {
                str2 = a2 != 2 ? a2 != 3 ? a2 != 4 ? "INVALID_HOST" : "INVALID_PORT" : "UNSUPPORTED_SCHEME" : "MISSING_SCHEME";
            } else {
                str2 = "SUCCESS";
            }
            StringBuilder sb = new StringBuilder(str2.length() + 18 + String.valueOf(url2).length());
            sb.append("Invalid URL: ");
            sb.append(str2);
            sb.append(" for ");
            sb.append(url2);
            throw new MalformedURLException(sb.toString());
        } else {
            String valueOf = String.valueOf(url2);
            throw new UnknownHostException(valueOf.length() == 0 ? new String("Invalid host: ") : "Invalid host: ".concat(valueOf));
        }
    }

    private final void a(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.addAll(this.a.d);
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        int i2 = 0;
        while (i2 < length) {
            try {
                arrayList.add(avzh.a(split[i2]));
                i2++;
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }
        avze avze = this.a;
        List a2 = awaj.a((List) arrayList);
        if (!a2.contains(avzh.HTTP_1_1)) {
            String valueOf = String.valueOf(a2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
            sb.append("protocols doesn't contain http/1.1: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        } else if (a2.contains(avzh.HTTP_1_0)) {
            String valueOf2 = String.valueOf(a2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 37);
            sb2.append("protocols must not contain http/1.0: ");
            sb2.append(valueOf2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!a2.contains((Object) null)) {
            avze.d = awaj.a(a2);
        } else {
            throw new IllegalArgumentException("protocols must not contain null");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v83, resolved type: awdk} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r3v56 */
    /* JADX WARNING: type inference failed for: r3v81 */
    /* JADX WARNING: type inference failed for: r3v84 */
    /* JADX WARNING: type inference failed for: r3v86 */
    /* JADX WARNING: type inference failed for: r3v88 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        r7 = new defpackage.awdk(r10.c.b());
        r10.a(r7);
        r2 = r10.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x018e, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        r3 = r10.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0197, code lost:
        if (r3.f.isEmpty() != false) goto L_0x019a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x019a, code lost:
        r3.b.execute(r3.e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01a1, code lost:
        r3.f.add(r7);
        r10.d = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01aa, code lost:
        if (r10.f != false) goto L_0x02ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01ac, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        r2 = r10.a.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01b3, code lost:
        if (r7.e != null) goto L_0x02b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01b5, code lost:
        r3 = new defpackage.avzq(r2);
        r4 = r7.a;
        r8 = r4.b;
        r4 = r4.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01c2, code lost:
        if (r4.h != null) goto L_0x01f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01ca, code lost:
        if (r2.contains(defpackage.avyu.c) == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01cc, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01ce, code lost:
        r2 = java.lang.String.valueOf(r2);
        r6 = new java.lang.StringBuilder(java.lang.String.valueOf(r2).length() + 39);
        r6.append("CLEARTEXT communication not supported: ");
        r6.append(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01f7, code lost:
        throw new defpackage.awdb(new java.net.UnknownServiceException(r6.toString()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01f8, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01fb, code lost:
        if (r7.e != null) goto L_0x02a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0203, code lost:
        if (r8.type() == java.net.Proxy.Type.DIRECT) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x020b, code lost:
        if (r8.type() == java.net.Proxy.Type.HTTP) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x020d, code lost:
        r1 = new java.net.Socket(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0213, code lost:
        r1 = r4.c.createSocket();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0219, code lost:
        r7.b = r1;
        r7.a(r12, r13, r14, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x021e, code lost:
        r1 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0221, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0222, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        defpackage.awaj.a(r7.c);
        defpackage.awaj.a(r7.b);
        r7.c = null;
        r7.b = null;
        r7.h = null;
        r7.i = null;
        r7.d = null;
        r7.e = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x023a, code lost:
        if (r2 == null) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x023c, code lost:
        r2 = new defpackage.awdb(r1);
        r17 = r4;
        r18 = r8;
        r19 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0248, code lost:
        r15 = r2.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x024c, code lost:
        if (defpackage.awdb.a != null) goto L_0x024e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x024e, code lost:
        r17 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0252, code lost:
        r18 = r8;
        r19 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:?, code lost:
        defpackage.awdb.a.invoke(r1, new java.lang.Object[]{r15});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0267, code lost:
        r18 = r8;
        r19 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x026c, code lost:
        r17 = r4;
        r18 = r8;
        r19 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        r2.b = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0274, code lost:
        if (r11 != false) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0276, code lost:
        r3.d = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x029b, code lost:
        r1 = r20;
        r4 = r17;
        r8 = r18;
        r12 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02a5, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x02a6, code lost:
        r19 = r12;
        r10.a().b(r7.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x02b9, code lost:
        throw new java.lang.IllegalStateException("already connected");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x02c1, code lost:
        throw new java.io.IOException("Canceled");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x02c2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:?, code lost:
        r1 = r10.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x02cd, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x02d0, code lost:
        if (r7.g == 0) goto L_0x02f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x02d2, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x02d7, code lost:
        if (r7.a(r9) == false) goto L_0x02da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x02da, code lost:
        r10.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x02e5, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x02e6, code lost:
        r3 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x02eb, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x02ec, code lost:
        r3 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x02f2, code lost:
        r3 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:?, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x050a, code lost:
        r0 = th;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0510, code lost:
        r0 = e;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0516, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0517, code lost:
        r3 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x051b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x051c, code lost:
        r3 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0520, code lost:
        r3 = r3;
        r3 = r3;
        r3 = r3;
        r3 = r3;
        r3 = r3;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0521, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0523, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0524, code lost:
        r3 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0528, code lost:
        r3 = r3;
        r3 = r3;
        r3 = r3;
        r3 = r3;
        r3 = r3;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0529, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x052b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x052c, code lost:
        r3 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x052f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0530, code lost:
        r3 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0534, code lost:
        r3 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0538, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0539, code lost:
        r3 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0562, code lost:
        r0 = e;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0564, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0565, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0567, code lost:
        r3 = r3;
        r3 = r3;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x056c, code lost:
        throw new defpackage.awdb(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0574, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0575, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0576, code lost:
        r1 = r0;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x057a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x057b, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x057c, code lost:
        r2 = r0;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0580, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0581, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x05e9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x05ea, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x05ec, code lost:
        r1 = r0;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x05ed, code lost:
        r2 = r3.c;
        r4 = r2.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x05f3, code lost:
        if (r4.d != null) goto L_0x05f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x05f5, code lost:
        r4.a(r1.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x05fa, code lost:
        r4 = r4.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x05fc, code lost:
        if (r4 == null) goto L_0x05fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0603, code lost:
        if (r4.a() == false) goto L_0x0605;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0605, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0607, code lost:
        r4 = r1.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x060b, code lost:
        if ((r4 instanceof java.net.ProtocolException) == false) goto L_0x060d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x060f, code lost:
        if ((r4 instanceof java.io.InterruptedIOException) == false) goto L_0x0611;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x0624, code lost:
        if ((r4 instanceof java.net.SocketTimeoutException) == false) goto L_0x0626;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x0626, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x062c, code lost:
        if (r2.b.p != false) goto L_0x062e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x062e, code lost:
        r8 = new defpackage.awcs(r2.b, r2.i, r2.h, r2.f(), (defpackage.awda) r2.m, r2.d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x0645, code lost:
        if (r4 != null) goto L_0x0647;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:?, code lost:
        r3.c = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x0649, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x064b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x064c, code lost:
        r2 = r0;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x0651, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:?, code lost:
        r1 = r1.b;
        r3.b = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x0655, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x0657, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x065a, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x0661, code lost:
        r3.c.f().c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0122, code lost:
        r19 = r12;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x02e5 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:152:0x0272] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x02eb A[ExcHandler: awdb (e awdb), Splitter:B:99:0x017e] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x02f1 A[ExcHandler: awcy (e awcy), Splitter:B:99:0x017e] */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x050a A[ExcHandler: all (th java.lang.Throwable), PHI: r3 
      PHI: (r3v19 awdg) = (r3v97 awdg), (r3v101 awdg), (r3v105 awdg), (r3v108 awdg), (r3v112 awdg), (r3v115 awdg), (r3v118 awdg), (r3v121 awdg) binds: [B:238:0x0399, B:348:0x0567, B:342:0x0561, B:343:?, B:315:0x0528, B:316:?, B:307:0x0520, B:308:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:238:0x0399] */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0510 A[ExcHandler: awdb (e awdb), PHI: r3 
      PHI: (r3v17 awdg) = (r3v95 awdg), (r3v99 awdg), (r3v104 awdg), (r3v107 awdg), (r3v111 awdg), (r3v114 awdg), (r3v117 awdg), (r3v120 awdg) binds: [B:238:0x0399, B:348:0x0567, B:342:0x0561, B:343:?, B:315:0x0528, B:316:?, B:307:0x0520, B:308:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:238:0x0399] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0513 A[ExcHandler: awcy (e awcy), Splitter:B:238:0x0399] */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x052b A[ExcHandler: all (th java.lang.Throwable), Splitter:B:187:0x02cb] */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x052f A[ExcHandler: awdb (e awdb), Splitter:B:187:0x02cb] */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0533 A[ExcHandler: awcy (e awcy), Splitter:B:187:0x02cb] */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x0538 A[ExcHandler: IOException (e java.io.IOException), Splitter:B:152:0x0272] */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x0574 A[ExcHandler: awdb (e awdb), PHI: r1 
      PHI: (r1v17 awdg) = (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v32 awdg) binds: [B:3:0x0006, B:17:0x0032, B:24:0x0041, B:29:0x0050, B:30:?, B:35:0x006d, B:49:0x00af, B:50:?, B:55:0x00f4, B:56:?, B:57:0x0109] A[DONT_GENERATE, DONT_INLINE], Splitter:B:29:0x0050] */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x057a A[ExcHandler: all (th java.lang.Throwable), PHI: r1 
      PHI: (r1v15 awdg) = (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v32 awdg) binds: [B:1:0x0004, B:2:?, B:3:0x0006, B:17:0x0032, B:24:0x0041, B:29:0x0050, B:30:?, B:35:0x006d, B:49:0x00af, B:50:?, B:55:0x00f4, B:56:?, B:57:0x0109] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0004] */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x0580 A[ExcHandler: IOException (e java.io.IOException), Splitter:B:1:0x0004] */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x058d A[Catch:{ all -> 0x05e5, all -> 0x065b }] */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x0597  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x059a A[SYNTHETIC, Splitter:B:372:0x059a] */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x05af A[Catch:{ all -> 0x05e5, all -> 0x065b }] */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x05d6  */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x05d9 A[SYNTHETIC, Splitter:B:394:0x05d9] */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x05e2 A[SYNTHETIC, Splitter:B:399:0x05e2] */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x05e9 A[Catch:{ all -> 0x05e5, all -> 0x065b }, ExcHandler: awdb (e awdb), PHI: r1 
      PHI: (r1v11 awdg) = (r1v0 awdg), (r1v0 awdg), (r1v32 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg) binds: [B:1:0x0004, B:2:?, B:115:0x01c4, B:52:0x00bf, B:53:?, B:42:0x0094, B:32:0x0056, B:33:?, B:27:0x0047, B:28:?, B:21:0x003c, B:22:?, B:12:0x0021, B:13:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0004] */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x05f5 A[Catch:{ all -> 0x05e5, all -> 0x065b }] */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x05fe A[Catch:{ all -> 0x05e5, all -> 0x065b }] */
    /* JADX WARNING: Removed duplicated region for block: B:413:0x05ff A[Catch:{ all -> 0x05e5, all -> 0x065b }] */
    /* JADX WARNING: Removed duplicated region for block: B:434:0x0647 A[SYNTHETIC, Splitter:B:434:0x0647] */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x0651 A[SYNTHETIC, Splitter:B:440:0x0651] */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x0656 A[Catch:{ all -> 0x05e5, all -> 0x065b }, ExcHandler: awcy (e awcy), PHI: r1 
      PHI: (r1v4 awdg) = (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v32 awdg), (r1v32 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg), (r1v0 awdg) binds: [B:1:0x0004, B:2:?, B:3:0x0006, B:17:0x0032, B:24:0x0041, B:29:0x0050, B:30:?, B:35:0x006d, B:49:0x00af, B:50:?, B:55:0x00f4, B:56:?, B:57:0x0109, B:115:0x01c4, B:52:0x00bf, B:53:?, B:42:0x0094, B:32:0x0056, B:33:?, B:27:0x0047, B:28:?, B:21:0x003c, B:22:?, B:12:0x0021, B:13:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0004] */
    /* JADX WARNING: Removed duplicated region for block: B:452:0x0661  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean a(boolean r21) {
        /*
            r20 = this;
            r1 = r20
            r3 = 1
            r4 = 0
            awcs r5 = r1.c     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x057a }
            awce r6 = r5.p     // Catch:{ awcy -> 0x0656, awdb -> 0x0574, IOException -> 0x0580, all -> 0x057a }
            if (r6 == 0) goto L_0x000d
            r3 = r1
            goto L_0x0399
        L_0x000d:
            awcu r6 = r5.e     // Catch:{ awcy -> 0x0656, awdb -> 0x0574, IOException -> 0x0580, all -> 0x057a }
            if (r6 != 0) goto L_0x056d
            avzj r6 = r5.i     // Catch:{ awcy -> 0x0656, awdb -> 0x0574, IOException -> 0x0580, all -> 0x057a }
            avzi r9 = r6.b()     // Catch:{ awcy -> 0x0656, awdb -> 0x0574, IOException -> 0x0580, all -> 0x057a }
            java.lang.String r10 = "Host"
            java.lang.String r10 = r6.a(r10)     // Catch:{ awcy -> 0x0656, awdb -> 0x0574, IOException -> 0x0580, all -> 0x057a }
            if (r10 != 0) goto L_0x0030
            java.lang.String r10 = "Host"
            avzd r11 = r6.a     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
            java.lang.String r11 = defpackage.awaj.a((defpackage.avzd) r11)     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
            r9.b(r10, r11)     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
            goto L_0x0030
        L_0x002b:
            r0 = move-exception
            r2 = r0
            r3 = r1
            goto L_0x057d
        L_0x0030:
            java.lang.String r10 = "Connection"
            java.lang.String r10 = r6.a(r10)     // Catch:{ awcy -> 0x0656, awdb -> 0x0574, IOException -> 0x0580, all -> 0x057a }
            if (r10 != 0) goto L_0x003f
            java.lang.String r10 = "Connection"
            java.lang.String r11 = "Keep-Alive"
            r9.b(r10, r11)     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
        L_0x003f:
            java.lang.String r10 = "Accept-Encoding"
            java.lang.String r10 = r6.a(r10)     // Catch:{ awcy -> 0x0656, awdb -> 0x0574, IOException -> 0x0580, all -> 0x057a }
            if (r10 != 0) goto L_0x0050
            r5.g = r3     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
            java.lang.String r10 = "Accept-Encoding"
            java.lang.String r11 = "gzip"
            r9.b(r10, r11)     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
        L_0x0050:
            avze r10 = r5.b     // Catch:{ awcy -> 0x0656, awdb -> 0x0574, IOException -> 0x0580, all -> 0x057a }
            java.net.CookieHandler r10 = r10.g     // Catch:{ awcy -> 0x0656, awdb -> 0x0574, IOException -> 0x0580, all -> 0x057a }
            if (r10 == 0) goto L_0x006b
            avzj r11 = r9.a()     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
            avzb r11 = r11.c     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
            java.util.Map r11 = defpackage.awcw.a((defpackage.avzb) r11, (java.lang.String) r4)     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
            java.net.URI r12 = r6.a()     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
            java.util.Map r10 = r10.get(r12, r11)     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
            defpackage.awcw.a((defpackage.avzi) r9, (java.util.Map) r10)     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
        L_0x006b:
            java.lang.String r10 = "User-Agent"
            java.lang.String r6 = r6.a(r10)     // Catch:{ awcy -> 0x0656, awdb -> 0x0574, IOException -> 0x0580, all -> 0x057a }
            if (r6 == 0) goto L_0x0074
            goto L_0x007b
        L_0x0074:
            java.lang.String r6 = "User-Agent"
            java.lang.String r10 = "okhttp/2.7.2"
            r9.b(r6, r10)     // Catch:{ awcy -> 0x0656, awdb -> 0x0574, IOException -> 0x0580, all -> 0x057a }
        L_0x007b:
            avzj r6 = r9.a()     // Catch:{ awcy -> 0x0656, awdb -> 0x0574, IOException -> 0x0580, all -> 0x057a }
            java.util.logging.Logger r9 = defpackage.awaa.a     // Catch:{ awcy -> 0x0656, awdb -> 0x0574, IOException -> 0x0580, all -> 0x057a }
            java.lang.System.currentTimeMillis()     // Catch:{ awcy -> 0x0656, awdb -> 0x0574, IOException -> 0x0580, all -> 0x057a }
            awcd r9 = new awcd     // Catch:{ awcy -> 0x0656, awdb -> 0x0574, IOException -> 0x0580, all -> 0x057a }
            r9.<init>(r6)     // Catch:{ awcy -> 0x0656, awdb -> 0x0574, IOException -> 0x0580, all -> 0x057a }
            awce r10 = new awce     // Catch:{ awcy -> 0x0656, awdb -> 0x0574, IOException -> 0x0580, all -> 0x057a }
            avzj r11 = r9.a     // Catch:{ awcy -> 0x0656, awdb -> 0x0574, IOException -> 0x0580, all -> 0x057a }
            r10.<init>(r11)     // Catch:{ awcy -> 0x0656, awdb -> 0x0574, IOException -> 0x0580, all -> 0x057a }
            avzj r11 = r10.a     // Catch:{ awcy -> 0x0656, awdb -> 0x0574, IOException -> 0x0580, all -> 0x057a }
            if (r11 == 0) goto L_0x00ae
            avzj r9 = r9.a     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
            avyl r11 = r9.g     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
            if (r11 != 0) goto L_0x00a3
            avzb r11 = r9.c     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
            avyl r11 = defpackage.avyl.a(r11)     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
            r9.g = r11     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
            goto L_0x00a4
        L_0x00a3:
        L_0x00a4:
            boolean r9 = r11.i     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
            if (r9 == 0) goto L_0x00ae
            awce r10 = new awce     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
            r10.<init>(r4)     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
            goto L_0x00af
        L_0x00ae:
        L_0x00af:
            r5.p = r10     // Catch:{ awcy -> 0x0656, awdb -> 0x0574, IOException -> 0x0580, all -> 0x057a }
            awce r9 = r5.p     // Catch:{ awcy -> 0x0656, awdb -> 0x0574, IOException -> 0x0580, all -> 0x057a }
            avzj r10 = r9.a     // Catch:{ awcy -> 0x0656, awdb -> 0x0574, IOException -> 0x0580, all -> 0x057a }
            r5.j = r10     // Catch:{ awcy -> 0x0656, awdb -> 0x0574, IOException -> 0x0580, all -> 0x057a }
            avzm r9 = r9.b     // Catch:{ awcy -> 0x0656, awdb -> 0x0574, IOException -> 0x0580, all -> 0x057a }
            r5.k = r4     // Catch:{ awcy -> 0x0656, awdb -> 0x0574, IOException -> 0x0580, all -> 0x057a }
            avzj r9 = r5.j     // Catch:{ awcy -> 0x0656, awdb -> 0x0574, IOException -> 0x0580, all -> 0x057a }
            if (r9 != 0) goto L_0x00f4
            avzm r6 = r5.k     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
            avzl r6 = new avzl     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
            r6.<init>()     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
            avzj r9 = r5.i     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
            r6.a = r9     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
            avzm r9 = r5.d     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
            avzm r9 = defpackage.awcs.a((defpackage.avzm) r9)     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
            r6.a((defpackage.avzm) r9)     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
            avzh r9 = defpackage.avzh.HTTP_1_1     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
            r6.b = r9     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
            r9 = 504(0x1f8, float:7.06E-43)
            r6.c = r9     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
            java.lang.String r9 = "Unsatisfiable Request (only-if-cached)"
            r6.d = r9     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
            avzn r9 = defpackage.awcs.a     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
            r6.g = r9     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
            avzm r6 = r6.a()     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
            r5.l = r6     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
            avzm r6 = r5.l     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
            avzm r6 = r5.b(r6)     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
            r5.l = r6     // Catch:{ awcy -> 0x0656, awdb -> 0x05e9, IOException -> 0x0580, all -> 0x002b }
            r3 = r1
            goto L_0x0399
        L_0x00f4:
            java.lang.String r9 = r9.b     // Catch:{ awcy -> 0x0656, awdb -> 0x0574, IOException -> 0x0580, all -> 0x057a }
            java.lang.String r10 = "GET"
            boolean r9 = r9.equals(r10)     // Catch:{ awcy -> 0x0656, awdb -> 0x0574, IOException -> 0x0580, all -> 0x057a }
            r9 = r9 ^ r3
            awde r10 = r5.c     // Catch:{ awcy -> 0x0656, awdb -> 0x0574, IOException -> 0x0580, all -> 0x057a }
            avze r11 = r5.b     // Catch:{ awcy -> 0x0656, awdb -> 0x0574, IOException -> 0x0580, all -> 0x057a }
            int r12 = r11.q     // Catch:{ awcy -> 0x0656, awdb -> 0x0574, IOException -> 0x0580, all -> 0x057a }
            int r13 = r11.r     // Catch:{ awcy -> 0x0656, awdb -> 0x0574, IOException -> 0x0580, all -> 0x057a }
            int r14 = r11.s     // Catch:{ awcy -> 0x0656, awdb -> 0x0574, IOException -> 0x0580, all -> 0x057a }
            boolean r11 = r11.p     // Catch:{ awcy -> 0x0656, awdb -> 0x0574, IOException -> 0x0580, all -> 0x057a }
        L_0x0109:
            avys r15 = r10.b     // Catch:{ IOException -> 0x0564, awcy -> 0x0656, awdb -> 0x0574, all -> 0x057a }
            monitor-enter(r15)     // Catch:{ IOException -> 0x0564, awcy -> 0x0656, awdb -> 0x0574, all -> 0x057a }
            boolean r7 = r10.e     // Catch:{ all -> 0x055d }
            if (r7 != 0) goto L_0x0552
            awcu r7 = r10.g     // Catch:{ all -> 0x055d }
            if (r7 != 0) goto L_0x0549
            boolean r7 = r10.f     // Catch:{ all -> 0x055d }
            if (r7 != 0) goto L_0x0540
            awdk r7 = r10.d     // Catch:{ all -> 0x055d }
            if (r7 != 0) goto L_0x011d
            goto L_0x0126
        L_0x011d:
            boolean r8 = r7.k     // Catch:{ all -> 0x055d }
            if (r8 != 0) goto L_0x0126
            monitor-exit(r15)     // Catch:{ all -> 0x055d }
            r19 = r12
            goto L_0x02cb
        L_0x0126:
            avys r7 = r10.b     // Catch:{ all -> 0x055d }
            avyj r8 = r10.a     // Catch:{ all -> 0x055d }
            java.util.Deque r7 = r7.f     // Catch:{ all -> 0x055d }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x055d }
        L_0x0130:
            boolean r16 = r7.hasNext()     // Catch:{ all -> 0x055d }
            if (r16 == 0) goto L_0x0169
            java.lang.Object r16 = r7.next()     // Catch:{ all -> 0x055d }
            r2 = r16
            awdk r2 = (defpackage.awdk) r2     // Catch:{ all -> 0x055d }
            java.util.List r3 = r2.j     // Catch:{ all -> 0x055d }
            int r3 = r3.size()     // Catch:{ all -> 0x055d }
            awbb r4 = r2.f     // Catch:{ all -> 0x055d }
            if (r4 == 0) goto L_0x014d
            int r4 = r4.a()     // Catch:{ all -> 0x055d }
            goto L_0x014e
        L_0x014d:
            r4 = 1
        L_0x014e:
            if (r3 >= r4) goto L_0x0166
            avzo r3 = r2.a     // Catch:{ all -> 0x055d }
            avyj r3 = r3.a     // Catch:{ all -> 0x055d }
            boolean r3 = r8.equals(r3)     // Catch:{ all -> 0x055d }
            if (r3 == 0) goto L_0x0163
            boolean r3 = r2.k     // Catch:{ all -> 0x055d }
            if (r3 != 0) goto L_0x0163
            r10.a((defpackage.awdk) r2)     // Catch:{ all -> 0x055d }
            r7 = r2
            goto L_0x016a
        L_0x0163:
            r3 = 1
            r4 = 0
            goto L_0x0130
        L_0x0166:
            r3 = 1
            r4 = 0
            goto L_0x0130
        L_0x0169:
            r7 = 0
        L_0x016a:
            if (r7 != 0) goto L_0x02c6
            awdc r2 = r10.c     // Catch:{ all -> 0x053c }
            if (r2 != 0) goto L_0x017d
            awdc r2 = new awdc     // Catch:{ all -> 0x055d }
            avyj r3 = r10.a     // Catch:{ all -> 0x055d }
            awah r4 = r10.a()     // Catch:{ all -> 0x055d }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x055d }
            r10.c = r2     // Catch:{ all -> 0x055d }
        L_0x017d:
            monitor-exit(r15)     // Catch:{ all -> 0x053c }
            awdc r2 = r10.c     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            avzo r2 = r2.b()     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            awdk r7 = new awdk     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            r7.<init>(r2)     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            r10.a((defpackage.awdk) r7)     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            avys r2 = r10.b     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            monitor-enter(r2)     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            avys r3 = r10.b     // Catch:{ all -> 0x02c2 }
            java.util.Deque r4 = r3.f     // Catch:{ all -> 0x02c2 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x02c2 }
            if (r4 != 0) goto L_0x019a
            goto L_0x01a1
        L_0x019a:
            java.util.concurrent.Executor r4 = r3.b     // Catch:{ all -> 0x02c2 }
            java.lang.Runnable r8 = r3.e     // Catch:{ all -> 0x02c2 }
            r4.execute(r8)     // Catch:{ all -> 0x02c2 }
        L_0x01a1:
            java.util.Deque r3 = r3.f     // Catch:{ all -> 0x02c2 }
            r3.add(r7)     // Catch:{ all -> 0x02c2 }
            r10.d = r7     // Catch:{ all -> 0x02c2 }
            boolean r3 = r10.f     // Catch:{ all -> 0x02c2 }
            if (r3 != 0) goto L_0x02ba
            monitor-exit(r2)     // Catch:{ all -> 0x02c2 }
            avyj r2 = r10.a     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            java.util.List r2 = r2.e     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            avzh r3 = r7.e     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            if (r3 != 0) goto L_0x02b2
            avzq r3 = new avzq     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            avzo r4 = r7.a     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            java.net.Proxy r8 = r4.b     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            avyj r4 = r4.a     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            javax.net.ssl.SSLSocketFactory r15 = r4.h     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            if (r15 != 0) goto L_0x01f8
            avyu r15 = defpackage.avyu.c     // Catch:{ IOException -> 0x0564, awcy -> 0x0656, awdb -> 0x05e9, all -> 0x002b }
            boolean r15 = r2.contains(r15)     // Catch:{ IOException -> 0x0564, awcy -> 0x0656, awdb -> 0x05e9, all -> 0x002b }
            if (r15 == 0) goto L_0x01ce
            r2 = 0
            goto L_0x01f9
        L_0x01ce:
            awdb r3 = new awdb     // Catch:{ IOException -> 0x0564, awcy -> 0x0656, awdb -> 0x05e9, all -> 0x002b }
            java.net.UnknownServiceException r4 = new java.net.UnknownServiceException     // Catch:{ IOException -> 0x0564, awcy -> 0x0656, awdb -> 0x05e9, all -> 0x002b }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x0564, awcy -> 0x0656, awdb -> 0x05e9, all -> 0x002b }
            java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x0564, awcy -> 0x0656, awdb -> 0x05e9, all -> 0x002b }
            int r5 = r5.length()     // Catch:{ IOException -> 0x0564, awcy -> 0x0656, awdb -> 0x05e9, all -> 0x002b }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0564, awcy -> 0x0656, awdb -> 0x05e9, all -> 0x002b }
            int r5 = r5 + 39
            r6.<init>(r5)     // Catch:{ IOException -> 0x0564, awcy -> 0x0656, awdb -> 0x05e9, all -> 0x002b }
            java.lang.String r5 = "CLEARTEXT communication not supported: "
            r6.append(r5)     // Catch:{ IOException -> 0x0564, awcy -> 0x0656, awdb -> 0x05e9, all -> 0x002b }
            r6.append(r2)     // Catch:{ IOException -> 0x0564, awcy -> 0x0656, awdb -> 0x05e9, all -> 0x002b }
            java.lang.String r2 = r6.toString()     // Catch:{ IOException -> 0x0564, awcy -> 0x0656, awdb -> 0x05e9, all -> 0x002b }
            r4.<init>(r2)     // Catch:{ IOException -> 0x0564, awcy -> 0x0656, awdb -> 0x05e9, all -> 0x002b }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0564, awcy -> 0x0656, awdb -> 0x05e9, all -> 0x002b }
            throw r3     // Catch:{ IOException -> 0x0564, awcy -> 0x0656, awdb -> 0x05e9, all -> 0x002b }
        L_0x01f8:
            r2 = 0
        L_0x01f9:
            avzh r15 = r7.e     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            if (r15 != 0) goto L_0x02a6
            java.net.Proxy$Type r15 = r8.type()     // Catch:{ IOException -> 0x0221, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT     // Catch:{ IOException -> 0x0221, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            if (r15 == r1) goto L_0x0213
            java.net.Proxy$Type r1 = r8.type()     // Catch:{ IOException -> 0x0221, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            java.net.Proxy$Type r15 = java.net.Proxy.Type.HTTP     // Catch:{ IOException -> 0x0221, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            if (r1 == r15) goto L_0x0213
            java.net.Socket r1 = new java.net.Socket     // Catch:{ IOException -> 0x0221, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            r1.<init>(r8)     // Catch:{ IOException -> 0x0221, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            goto L_0x0219
        L_0x0213:
            javax.net.SocketFactory r1 = r4.c     // Catch:{ IOException -> 0x0221, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            java.net.Socket r1 = r1.createSocket()     // Catch:{ IOException -> 0x0221, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
        L_0x0219:
            r7.b = r1     // Catch:{ IOException -> 0x0221, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            r7.a(r12, r13, r14, r3)     // Catch:{ IOException -> 0x0221, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            r1 = r20
            goto L_0x01f9
        L_0x0221:
            r0 = move-exception
            r1 = r0
            java.net.Socket r15 = r7.c     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            defpackage.awaj.a((java.net.Socket) r15)     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            java.net.Socket r15 = r7.b     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            defpackage.awaj.a((java.net.Socket) r15)     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            r15 = 0
            r7.c = r15     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            r7.b = r15     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            r7.h = r15     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            r7.i = r15     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            r7.d = r15     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            r7.e = r15     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            if (r2 != 0) goto L_0x0248
            awdb r2 = new awdb     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            r17 = r4
            r18 = r8
            r19 = r12
            goto L_0x0274
        L_0x0248:
            java.io.IOException r15 = r2.b     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            java.lang.reflect.Method r17 = defpackage.awdb.a     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            if (r17 == 0) goto L_0x026c
            r17 = r4
            java.lang.reflect.Method r4 = defpackage.awdb.a     // Catch:{ InvocationTargetException -> 0x0266, IllegalAccessException -> 0x0264 }
            r18 = r8
            r19 = r12
            r8 = 1
            java.lang.Object[] r12 = new java.lang.Object[r8]     // Catch:{ InvocationTargetException -> 0x0262, IllegalAccessException -> 0x0260 }
            r8 = 0
            r12[r8] = r15     // Catch:{ InvocationTargetException -> 0x0262, IllegalAccessException -> 0x0260 }
            r4.invoke(r1, r12)     // Catch:{ InvocationTargetException -> 0x0262, IllegalAccessException -> 0x0260 }
            goto L_0x0272
        L_0x0260:
            r0 = move-exception
            goto L_0x0272
        L_0x0262:
            r0 = move-exception
            goto L_0x0272
        L_0x0264:
            r0 = move-exception
            goto L_0x0267
        L_0x0266:
            r0 = move-exception
        L_0x0267:
            r18 = r8
            r19 = r12
            goto L_0x0272
        L_0x026c:
            r17 = r4
            r18 = r8
            r19 = r12
        L_0x0272:
            r2.b = r1     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
        L_0x0274:
            if (r11 == 0) goto L_0x02a5
            r4 = 1
            r3.d = r4     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            boolean r4 = r3.c     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            if (r4 == 0) goto L_0x02a5
            boolean r4 = r1 instanceof java.net.ProtocolException     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            if (r4 != 0) goto L_0x02a5
            boolean r4 = r1 instanceof java.io.InterruptedIOException     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            if (r4 != 0) goto L_0x02a5
            boolean r4 = r1 instanceof javax.net.ssl.SSLHandshakeException     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            if (r4 == 0) goto L_0x0291
            java.lang.Throwable r8 = r1.getCause()     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            boolean r8 = r8 instanceof java.security.cert.CertificateException     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            if (r8 != 0) goto L_0x02a5
        L_0x0291:
            boolean r8 = r1 instanceof javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            if (r8 != 0) goto L_0x02a5
            if (r4 != 0) goto L_0x029b
            boolean r1 = r1 instanceof javax.net.ssl.SSLProtocolException     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            if (r1 == 0) goto L_0x02a5
        L_0x029b:
            r1 = r20
            r4 = r17
            r8 = r18
            r12 = r19
            goto L_0x01f9
        L_0x02a5:
            throw r2     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
        L_0x02a6:
            r19 = r12
            awah r1 = r10.a()     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            avzo r2 = r7.a     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            r1.b(r2)     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            goto L_0x02cb
        L_0x02b2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            java.lang.String r2 = "already connected"
            r1.<init>(r2)     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            throw r1     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
        L_0x02ba:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x02c2 }
            java.lang.String r3 = "Canceled"
            r1.<init>(r3)     // Catch:{ all -> 0x02c2 }
            throw r1     // Catch:{ all -> 0x02c2 }
        L_0x02c2:
            r0 = move-exception
            r1 = r0
            monitor-exit(r2)     // Catch:{ all -> 0x02c2 }
            throw r1     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
        L_0x02c6:
            r19 = r12
            r10.d = r7     // Catch:{ all -> 0x053c }
            monitor-exit(r15)     // Catch:{ all -> 0x053c }
        L_0x02cb:
            avys r1 = r10.b     // Catch:{ IOException -> 0x0538, awcy -> 0x0533, awdb -> 0x052f, all -> 0x052b }
            monitor-enter(r1)     // Catch:{ IOException -> 0x0538, awcy -> 0x0533, awdb -> 0x052f, all -> 0x052b }
            int r2 = r7.g     // Catch:{ all -> 0x0523 }
            if (r2 == 0) goto L_0x02f7
            monitor-exit(r1)     // Catch:{ all -> 0x0523 }
            boolean r1 = r7.a(r9)     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            if (r1 == 0) goto L_0x02da
            goto L_0x02f8
        L_0x02da:
            r10.e()     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            r12 = r19
            r3 = 1
            r4 = 0
            r1 = r20
            goto L_0x0109
        L_0x02e5:
            r0 = move-exception
            r7 = 1
            r3 = r20
            goto L_0x065c
        L_0x02eb:
            r0 = move-exception
            r7 = 1
            r3 = r20
            goto L_0x05ec
        L_0x02f1:
            r0 = move-exception
            r7 = 1
            r3 = r20
            goto L_0x0659
        L_0x02f7:
            monitor-exit(r1)     // Catch:{ all -> 0x0523 }
        L_0x02f8:
            awbb r1 = r7.f     // Catch:{ IOException -> 0x0538, awcy -> 0x0533, awdb -> 0x052f, all -> 0x052b }
            if (r1 == 0) goto L_0x0304
            awco r1 = new awco     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            awbb r2 = r7.f     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            r1.<init>(r10, r2)     // Catch:{ IOException -> 0x0538, awcy -> 0x02f1, awdb -> 0x02eb, all -> 0x02e5 }
            goto L_0x032a
        L_0x0304:
            java.net.Socket r1 = r7.c     // Catch:{ IOException -> 0x0538, awcy -> 0x0533, awdb -> 0x052f, all -> 0x052b }
            r1.setSoTimeout(r13)     // Catch:{ IOException -> 0x0538, awcy -> 0x0533, awdb -> 0x052f, all -> 0x052b }
            batf r1 = r7.h     // Catch:{ IOException -> 0x0538, awcy -> 0x0533, awdb -> 0x052f, all -> 0x052b }
            bauc r1 = r1.bu()     // Catch:{ IOException -> 0x0538, awcy -> 0x0533, awdb -> 0x052f, all -> 0x052b }
            long r2 = (long) r13     // Catch:{ IOException -> 0x0538, awcy -> 0x0533, awdb -> 0x052f, all -> 0x052b }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ IOException -> 0x0538, awcy -> 0x0533, awdb -> 0x052f, all -> 0x052b }
            r1.a(r2, r4)     // Catch:{ IOException -> 0x0538, awcy -> 0x0533, awdb -> 0x052f, all -> 0x052b }
            bate r1 = r7.i     // Catch:{ IOException -> 0x0538, awcy -> 0x0533, awdb -> 0x052f, all -> 0x052b }
            bauc r1 = r1.bu()     // Catch:{ IOException -> 0x0538, awcy -> 0x0533, awdb -> 0x052f, all -> 0x052b }
            long r2 = (long) r14     // Catch:{ IOException -> 0x0538, awcy -> 0x0533, awdb -> 0x052f, all -> 0x052b }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ IOException -> 0x0538, awcy -> 0x0533, awdb -> 0x052f, all -> 0x052b }
            r1.a(r2, r4)     // Catch:{ IOException -> 0x0538, awcy -> 0x0533, awdb -> 0x052f, all -> 0x052b }
            awcm r1 = new awcm     // Catch:{ IOException -> 0x0538, awcy -> 0x0533, awdb -> 0x052f, all -> 0x052b }
            batf r2 = r7.h     // Catch:{ IOException -> 0x0538, awcy -> 0x0533, awdb -> 0x052f, all -> 0x052b }
            bate r3 = r7.i     // Catch:{ IOException -> 0x0538, awcy -> 0x0533, awdb -> 0x052f, all -> 0x052b }
            r1.<init>(r10, r2, r3)     // Catch:{ IOException -> 0x0538, awcy -> 0x0533, awdb -> 0x052f, all -> 0x052b }
        L_0x032a:
            avys r2 = r10.b     // Catch:{ IOException -> 0x0538, awcy -> 0x0533, awdb -> 0x052f, all -> 0x052b }
            monitor-enter(r2)     // Catch:{ IOException -> 0x0538, awcy -> 0x0533, awdb -> 0x052f, all -> 0x052b }
            int r3 = r7.g     // Catch:{ all -> 0x051b }
            r4 = 1
            int r3 = r3 + r4
            r7.g = r3     // Catch:{ all -> 0x051b }
            r10.g = r1     // Catch:{ all -> 0x051b }
            monitor-exit(r2)     // Catch:{ all -> 0x051b }
            r5.e = r1     // Catch:{ awcy -> 0x0533, awdb -> 0x052f, IOException -> 0x0516, all -> 0x052b }
            awcu r1 = r5.e     // Catch:{ awcy -> 0x0533, awdb -> 0x052f, IOException -> 0x0516, all -> 0x052b }
            r1.a((defpackage.awcs) r5)     // Catch:{ awcy -> 0x0533, awdb -> 0x052f, IOException -> 0x0516, all -> 0x052b }
            avzj r1 = r5.j     // Catch:{ awcy -> 0x0533, awdb -> 0x052f, IOException -> 0x0516, all -> 0x052b }
            boolean r1 = r5.a((defpackage.avzj) r1)     // Catch:{ awcy -> 0x0533, awdb -> 0x052f, IOException -> 0x0516, all -> 0x052b }
            if (r1 == 0) goto L_0x0397
            batz r1 = r5.m     // Catch:{ awcy -> 0x02f1, awdb -> 0x02eb, IOException -> 0x0516, all -> 0x02e5 }
            if (r1 != 0) goto L_0x0397
            long r1 = defpackage.awcw.a((defpackage.avzj) r6)     // Catch:{ awcy -> 0x02f1, awdb -> 0x02eb, IOException -> 0x0516, all -> 0x02e5 }
            boolean r3 = r5.h     // Catch:{ awcy -> 0x02f1, awdb -> 0x02eb, IOException -> 0x0516, all -> 0x02e5 }
            if (r3 != 0) goto L_0x0365
            awcu r3 = r5.e     // Catch:{ awcy -> 0x02f1, awdb -> 0x02eb, IOException -> 0x0516, all -> 0x02e5 }
            avzj r4 = r5.j     // Catch:{ awcy -> 0x02f1, awdb -> 0x02eb, IOException -> 0x0516, all -> 0x02e5 }
            r3.a((defpackage.avzj) r4)     // Catch:{ awcy -> 0x02f1, awdb -> 0x02eb, IOException -> 0x0516, all -> 0x02e5 }
            awcu r3 = r5.e     // Catch:{ awcy -> 0x02f1, awdb -> 0x02eb, IOException -> 0x0516, all -> 0x02e5 }
            avzj r4 = r5.j     // Catch:{ awcy -> 0x02f1, awdb -> 0x02eb, IOException -> 0x0516, all -> 0x02e5 }
            batz r1 = r3.a(r4, r1)     // Catch:{ awcy -> 0x02f1, awdb -> 0x02eb, IOException -> 0x0516, all -> 0x02e5 }
            r5.m = r1     // Catch:{ awcy -> 0x02f1, awdb -> 0x02eb, IOException -> 0x0516, all -> 0x02e5 }
            r3 = r20
            goto L_0x0399
        L_0x0365:
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 > 0) goto L_0x038f
            r3 = -1
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L_0x037d
            awda r1 = new awda     // Catch:{ awcy -> 0x02f1, awdb -> 0x02eb, IOException -> 0x0516, all -> 0x02e5 }
            r2 = -1
            r1.<init>(r2)     // Catch:{ awcy -> 0x02f1, awdb -> 0x02eb, IOException -> 0x0516, all -> 0x02e5 }
            r5.m = r1     // Catch:{ awcy -> 0x02f1, awdb -> 0x02eb, IOException -> 0x0516, all -> 0x02e5 }
            r3 = r20
            goto L_0x0399
        L_0x037d:
            awcu r3 = r5.e     // Catch:{ awcy -> 0x02f1, awdb -> 0x02eb, IOException -> 0x0516, all -> 0x02e5 }
            avzj r4 = r5.j     // Catch:{ awcy -> 0x02f1, awdb -> 0x02eb, IOException -> 0x0516, all -> 0x02e5 }
            r3.a((defpackage.avzj) r4)     // Catch:{ awcy -> 0x02f1, awdb -> 0x02eb, IOException -> 0x0516, all -> 0x02e5 }
            awda r3 = new awda     // Catch:{ awcy -> 0x02f1, awdb -> 0x02eb, IOException -> 0x0516, all -> 0x02e5 }
            int r2 = (int) r1     // Catch:{ awcy -> 0x02f1, awdb -> 0x02eb, IOException -> 0x0516, all -> 0x02e5 }
            r3.<init>(r2)     // Catch:{ awcy -> 0x02f1, awdb -> 0x02eb, IOException -> 0x0516, all -> 0x02e5 }
            r5.m = r3     // Catch:{ awcy -> 0x02f1, awdb -> 0x02eb, IOException -> 0x0516, all -> 0x02e5 }
            r3 = r20
            goto L_0x0399
        L_0x038f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ awcy -> 0x02f1, awdb -> 0x02eb, IOException -> 0x0516, all -> 0x02e5 }
            java.lang.String r2 = "Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2 GiB."
            r1.<init>(r2)     // Catch:{ awcy -> 0x02f1, awdb -> 0x02eb, IOException -> 0x0516, all -> 0x02e5 }
            throw r1     // Catch:{ awcy -> 0x02f1, awdb -> 0x02eb, IOException -> 0x0516, all -> 0x02e5 }
        L_0x0397:
            r3 = r20
        L_0x0399:
            awcs r1 = r3.c     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            avyq r1 = r1.e()     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            if (r1 == 0) goto L_0x03af
            r2 = r1
            awdk r2 = (defpackage.awdk) r2     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            avzo r2 = r2.a     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            r3.k = r2     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            awdk r1 = (defpackage.awdk) r1     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            avyz r1 = r1.d     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            r3.d = r1     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            goto L_0x03b4
        L_0x03af:
            r1 = 0
            r3.k = r1     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            r3.d = r1     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
        L_0x03b4:
            if (r21 == 0) goto L_0x0508
            awcs r1 = r3.c     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            avzm r2 = r1.l     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            if (r2 != 0) goto L_0x0508
            avzj r2 = r1.j     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            if (r2 == 0) goto L_0x04fe
            bate r2 = r1.n     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            if (r2 == 0) goto L_0x03ec
            r4 = r2
            batt r4 = (defpackage.batt) r4     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            batd r4 = r4.a     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            long r5 = r4.b     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x03ec
            r9 = r2
            batt r9 = (defpackage.batt) r9     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            boolean r9 = r9.c     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            if (r9 != 0) goto L_0x03e4
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x03ec
            batt r2 = (defpackage.batt) r2     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            batz r2 = r2.b     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            r2.a(r4, r5)     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            goto L_0x03ec
        L_0x03e4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            java.lang.String r2 = "closed"
            r1.<init>(r2)     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            throw r1     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
        L_0x03ec:
            long r4 = r1.f     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            r6 = -1
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0426
            avzj r2 = r1.j     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            long r4 = defpackage.awcw.a((defpackage.avzj) r2)     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x041f
            batz r2 = r1.m     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            boolean r4 = r2 instanceof defpackage.awda     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            if (r4 == 0) goto L_0x041f
            awda r2 = (defpackage.awda) r2     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            batd r2 = r2.a     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            long r4 = r2.b     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            avzj r2 = r1.j     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            avzi r2 = r2.b()     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            java.lang.String r6 = "Content-Length"
            java.lang.String r4 = java.lang.Long.toString(r4)     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            r2.b(r6, r4)     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            avzj r2 = r2.a()     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            r1.j = r2     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
        L_0x041f:
            awcu r2 = r1.e     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            avzj r4 = r1.j     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            r2.a((defpackage.avzj) r4)     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
        L_0x0426:
            batz r2 = r1.m     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            if (r2 != 0) goto L_0x042b
            goto L_0x0443
        L_0x042b:
            bate r4 = r1.n     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            if (r4 == 0) goto L_0x0433
            r4.close()     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            goto L_0x0436
        L_0x0433:
            r2.close()     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
        L_0x0436:
            batz r2 = r1.m     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            boolean r4 = r2 instanceof defpackage.awda     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            if (r4 == 0) goto L_0x0443
            awcu r4 = r1.e     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            awda r2 = (defpackage.awda) r2     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            r4.a((defpackage.awda) r2)     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
        L_0x0443:
            awcu r2 = r1.e     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            r2.c()     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            awcu r2 = r1.e     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            avzl r2 = r2.b()     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            avzj r4 = r1.j     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            r2.a = r4     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            awde r4 = r1.c     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            awdk r4 = r4.b()     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            avyz r4 = r4.d     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            r2.e = r4     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            java.lang.String r4 = defpackage.awcw.b     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            long r5 = r1.f     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            java.lang.String r5 = java.lang.Long.toString(r5)     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            r2.a((java.lang.String) r4, (java.lang.String) r5)     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            java.lang.String r4 = defpackage.awcw.c     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            java.lang.String r5 = java.lang.Long.toString(r5)     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            r2.a((java.lang.String) r4, (java.lang.String) r5)     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            avzm r2 = r2.a()     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            avzl r4 = r2.a()     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            awcu r5 = r1.e     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            avzn r2 = r5.a((defpackage.avzm) r2)     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            r4.g = r2     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            avzm r2 = r4.a()     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            java.lang.String r4 = "close"
            avzj r5 = r2.a     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            java.lang.String r6 = "Connection"
            java.lang.String r5 = r5.a(r6)     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            boolean r4 = r4.equalsIgnoreCase(r5)     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            if (r4 != 0) goto L_0x04a7
            java.lang.String r4 = "close"
            java.lang.String r5 = "Connection"
            java.lang.String r5 = r2.a(r5)     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            boolean r4 = r4.equalsIgnoreCase(r5)     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            if (r4 != 0) goto L_0x04a7
            goto L_0x04ac
        L_0x04a7:
            awde r4 = r1.c     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            r4.d()     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
        L_0x04ac:
            avzb r4 = r2.f     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            r1.a((defpackage.avzb) r4)     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            avzm r4 = r1.k     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            avzl r4 = r2.a()     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            avzj r5 = r1.i     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            r4.a = r5     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            avzm r5 = r1.d     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            avzm r5 = defpackage.awcs.a((defpackage.avzm) r5)     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            r4.a((defpackage.avzm) r5)     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            avzm r5 = r1.k     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            r5 = 0
            avzm r6 = defpackage.awcs.a((defpackage.avzm) r5)     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            if (r6 != 0) goto L_0x04ce
            goto L_0x04d3
        L_0x04ce:
            java.lang.String r5 = "cacheResponse"
            defpackage.avzl.a((java.lang.String) r5, (defpackage.avzm) r6)     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
        L_0x04d3:
            r4.i = r6     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            avzm r2 = defpackage.awcs.a((defpackage.avzm) r2)     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            if (r2 != 0) goto L_0x04dc
            goto L_0x04e1
        L_0x04dc:
            java.lang.String r5 = "networkResponse"
            defpackage.avzl.a((java.lang.String) r5, (defpackage.avzm) r2)     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
        L_0x04e1:
            r4.h = r2     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            avzm r2 = r4.a()     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            r1.l = r2     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            avzm r2 = r1.l     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            boolean r2 = defpackage.awcs.c(r2)     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            if (r2 == 0) goto L_0x0508
            java.util.logging.Logger r2 = defpackage.awaa.a     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            awcc r2 = r1.o     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            avzm r2 = r1.l     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            avzm r2 = r1.b(r2)     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            r1.l = r2     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            goto L_0x0508
        L_0x04fe:
            avzm r1 = r1.k     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            java.lang.String r2 = "call sendRequest() first!"
            r1.<init>(r2)     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            throw r1     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
        L_0x0508:
            r1 = 1
            return r1
        L_0x050a:
            r0 = move-exception
            goto L_0x057c
        L_0x050d:
            r0 = move-exception
            goto L_0x0582
        L_0x0510:
            r0 = move-exception
            goto L_0x0576
        L_0x0513:
            r0 = move-exception
            goto L_0x0658
        L_0x0516:
            r0 = move-exception
            r3 = r20
            goto L_0x0582
        L_0x051b:
            r0 = move-exception
            r3 = r20
        L_0x051e:
            r1 = r0
            monitor-exit(r2)     // Catch:{ all -> 0x0521 }
            throw r1     // Catch:{ IOException -> 0x0562, awcy -> 0x0513, awdb -> 0x0510, all -> 0x050a }
        L_0x0521:
            r0 = move-exception
            goto L_0x051e
        L_0x0523:
            r0 = move-exception
            r3 = r20
        L_0x0526:
            r2 = r0
            monitor-exit(r1)     // Catch:{ all -> 0x0529 }
            throw r2     // Catch:{ IOException -> 0x0562, awcy -> 0x0513, awdb -> 0x0510, all -> 0x050a }
        L_0x0529:
            r0 = move-exception
            goto L_0x0526
        L_0x052b:
            r0 = move-exception
            r3 = r20
            goto L_0x057c
        L_0x052f:
            r0 = move-exception
            r3 = r20
            goto L_0x0576
        L_0x0533:
            r0 = move-exception
            r3 = r20
            goto L_0x0658
        L_0x0538:
            r0 = move-exception
            r3 = r20
            goto L_0x0566
        L_0x053c:
            r0 = move-exception
            r3 = r20
            goto L_0x055f
        L_0x0540:
            r3 = r1
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x055b }
            java.lang.String r2 = "Canceled"
            r1.<init>(r2)     // Catch:{ all -> 0x055b }
            throw r1     // Catch:{ all -> 0x055b }
        L_0x0549:
            r3 = r1
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x055b }
            java.lang.String r2 = "stream != null"
            r1.<init>(r2)     // Catch:{ all -> 0x055b }
            throw r1     // Catch:{ all -> 0x055b }
        L_0x0552:
            r3 = r1
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x055b }
            java.lang.String r2 = "released"
            r1.<init>(r2)     // Catch:{ all -> 0x055b }
            throw r1     // Catch:{ all -> 0x055b }
        L_0x055b:
            r0 = move-exception
            goto L_0x055f
        L_0x055d:
            r0 = move-exception
            r3 = r1
        L_0x055f:
            r1 = r0
            monitor-exit(r15)     // Catch:{ all -> 0x055b }
            throw r1     // Catch:{ IOException -> 0x0562, awcy -> 0x0513, awdb -> 0x0510, all -> 0x050a }
        L_0x0562:
            r0 = move-exception
            goto L_0x0566
        L_0x0564:
            r0 = move-exception
            r3 = r1
        L_0x0566:
            r1 = r0
            awdb r2 = new awdb     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            r2.<init>(r1)     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            throw r2     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
        L_0x056d:
            r3 = r1
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            r1.<init>()     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
            throw r1     // Catch:{ awcy -> 0x0513, awdb -> 0x0510, IOException -> 0x050d, all -> 0x050a }
        L_0x0574:
            r0 = move-exception
            r3 = r1
        L_0x0576:
            r1 = r0
            r7 = 1
            goto L_0x05ed
        L_0x057a:
            r0 = move-exception
            r3 = r1
        L_0x057c:
            r2 = r0
        L_0x057d:
            r7 = 1
            goto L_0x065d
        L_0x0580:
            r0 = move-exception
            r3 = r1
        L_0x0582:
            r1 = r0
            awcs r2 = r3.c     // Catch:{ all -> 0x05e5 }
            batz r4 = r2.m     // Catch:{ all -> 0x05e5 }
            awde r5 = r2.c     // Catch:{ all -> 0x05e5 }
            awdk r6 = r5.d     // Catch:{ all -> 0x05e5 }
            if (r6 == 0) goto L_0x0597
            int r6 = r6.g     // Catch:{ all -> 0x05e5 }
            r5.a((java.io.IOException) r1)     // Catch:{ all -> 0x05e5 }
            r7 = 1
            if (r6 != r7) goto L_0x0598
            r4 = 0
            goto L_0x05d7
        L_0x0597:
            r7 = 1
        L_0x0598:
            if (r4 == 0) goto L_0x05a0
            boolean r6 = r4 instanceof defpackage.awda     // Catch:{ all -> 0x065b }
            if (r6 != 0) goto L_0x05a0
            r6 = 0
            goto L_0x05a1
        L_0x05a0:
            r6 = 1
        L_0x05a1:
            awdc r5 = r5.c     // Catch:{ all -> 0x065b }
            if (r5 == 0) goto L_0x05ab
            boolean r5 = r5.a()     // Catch:{ all -> 0x065b }
            if (r5 == 0) goto L_0x05d6
        L_0x05ab:
            boolean r5 = r1 instanceof java.net.ProtocolException     // Catch:{ all -> 0x065b }
            if (r5 != 0) goto L_0x05d6
            boolean r5 = r1 instanceof java.io.InterruptedIOException     // Catch:{ all -> 0x065b }
            if (r5 == 0) goto L_0x05b5
            r4 = 0
            goto L_0x05d7
        L_0x05b5:
            if (r6 == 0) goto L_0x05d4
            avze r5 = r2.b     // Catch:{ all -> 0x065b }
            boolean r5 = r5.p     // Catch:{ all -> 0x065b }
            if (r5 == 0) goto L_0x05d4
            awde r12 = r2.f()     // Catch:{ all -> 0x065b }
            awcs r5 = new awcs     // Catch:{ all -> 0x065b }
            avze r9 = r2.b     // Catch:{ all -> 0x065b }
            avzj r10 = r2.i     // Catch:{ all -> 0x065b }
            boolean r11 = r2.h     // Catch:{ all -> 0x065b }
            r13 = r4
            awda r13 = (defpackage.awda) r13     // Catch:{ all -> 0x065b }
            avzm r14 = r2.d     // Catch:{ all -> 0x065b }
            r8 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x065b }
            r4 = r5
            goto L_0x05d7
        L_0x05d4:
            r4 = 0
            goto L_0x05d7
        L_0x05d6:
            r4 = 0
        L_0x05d7:
            if (r4 == 0) goto L_0x05e2
            r3.c = r4     // Catch:{ all -> 0x05dd }
            r1 = 0
            return r1
        L_0x05dd:
            r0 = move-exception
            r2 = r0
            r1 = 0
            goto L_0x064e
        L_0x05e2:
            r3.b = r1     // Catch:{ all -> 0x065b }
            throw r1     // Catch:{ all -> 0x065b }
        L_0x05e5:
            r0 = move-exception
            r7 = 1
            goto L_0x065c
        L_0x05e9:
            r0 = move-exception
            r3 = r1
            r7 = 1
        L_0x05ec:
            r1 = r0
        L_0x05ed:
            awcs r2 = r3.c     // Catch:{ all -> 0x065b }
            awde r4 = r2.c     // Catch:{ all -> 0x065b }
            awdk r5 = r4.d     // Catch:{ all -> 0x065b }
            if (r5 == 0) goto L_0x05fa
            java.io.IOException r5 = r1.b     // Catch:{ all -> 0x065b }
            r4.a((java.io.IOException) r5)     // Catch:{ all -> 0x065b }
        L_0x05fa:
            awdc r4 = r4.c     // Catch:{ all -> 0x065b }
            if (r4 != 0) goto L_0x05ff
            goto L_0x0607
        L_0x05ff:
            boolean r4 = r4.a()     // Catch:{ all -> 0x065b }
            if (r4 != 0) goto L_0x0607
        L_0x0605:
            r4 = 0
            goto L_0x0645
        L_0x0607:
            java.io.IOException r4 = r1.b     // Catch:{ all -> 0x065b }
            boolean r5 = r4 instanceof java.net.ProtocolException     // Catch:{ all -> 0x065b }
            if (r5 != 0) goto L_0x0605
            boolean r5 = r4 instanceof java.io.InterruptedIOException     // Catch:{ all -> 0x065b }
            if (r5 != 0) goto L_0x0622
            boolean r5 = r4 instanceof javax.net.ssl.SSLHandshakeException     // Catch:{ all -> 0x065b }
            if (r5 == 0) goto L_0x061d
            java.lang.Throwable r5 = r4.getCause()     // Catch:{ all -> 0x065b }
            boolean r5 = r5 instanceof java.security.cert.CertificateException     // Catch:{ all -> 0x065b }
            if (r5 != 0) goto L_0x0626
        L_0x061d:
            boolean r4 = r4 instanceof javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x065b }
            if (r4 != 0) goto L_0x0626
            goto L_0x0628
        L_0x0622:
            boolean r4 = r4 instanceof java.net.SocketTimeoutException     // Catch:{ all -> 0x065b }
            if (r4 != 0) goto L_0x0628
        L_0x0626:
            r4 = 0
            goto L_0x0645
        L_0x0628:
            avze r4 = r2.b     // Catch:{ all -> 0x065b }
            boolean r4 = r4.p     // Catch:{ all -> 0x065b }
            if (r4 == 0) goto L_0x0626
            awde r12 = r2.f()     // Catch:{ all -> 0x065b }
            awcs r4 = new awcs     // Catch:{ all -> 0x065b }
            avze r9 = r2.b     // Catch:{ all -> 0x065b }
            avzj r10 = r2.i     // Catch:{ all -> 0x065b }
            boolean r11 = r2.h     // Catch:{ all -> 0x065b }
            batz r5 = r2.m     // Catch:{ all -> 0x065b }
            r13 = r5
            awda r13 = (defpackage.awda) r13     // Catch:{ all -> 0x065b }
            avzm r14 = r2.d     // Catch:{ all -> 0x065b }
            r8 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x065b }
        L_0x0645:
            if (r4 == 0) goto L_0x0651
            r3.c = r4     // Catch:{ all -> 0x064b }
            r1 = 0
            return r1
        L_0x064b:
            r0 = move-exception
            r1 = 0
            r2 = r0
        L_0x064e:
            r1 = r2
            r2 = 0
            goto L_0x065f
        L_0x0651:
            java.io.IOException r1 = r1.b     // Catch:{ all -> 0x065b }
            r3.b = r1     // Catch:{ all -> 0x065b }
            throw r1     // Catch:{ all -> 0x065b }
        L_0x0656:
            r0 = move-exception
            r3 = r1
        L_0x0658:
            r7 = 1
        L_0x0659:
            r1 = 0
            throw r1     // Catch:{ all -> 0x065b }
        L_0x065b:
            r0 = move-exception
        L_0x065c:
            r2 = r0
        L_0x065d:
            r1 = r2
            r2 = 1
        L_0x065f:
            if (r2 == 0) goto L_0x066a
            awcs r2 = r3.c
            awde r2 = r2.f()
            r2.c()
        L_0x066a:
            goto L_0x066c
        L_0x066b:
            throw r1
        L_0x066c:
            goto L_0x066b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awdg.a(boolean):boolean");
    }
}
