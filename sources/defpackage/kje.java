package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

/* renamed from: kje  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kje implements Closeable {
    private static final ith b = new ith("HttpMultipartRequest", "");
    public int a;
    private final Context c;
    private final String d;
    private lib e;
    private boolean f = false;
    private lhb g;
    private final lho h;
    private final izw i;

    public kje(Context context, URL url, String str, ClientContext clientContext, lic lic) {
        this.c = context;
        lib a2 = lic.a(url);
        this.e = a2;
        try {
            this.h = a2.b();
            char[] cArr = new char[20];
            Random random = new Random();
            for (int i2 = 0; i2 < 20; i2++) {
                cArr[i2] = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(random.nextInt(64));
            }
            this.d = new String(cArr);
            HttpURLConnection a3 = this.e.a();
            a3.setChunkedStreamingMode(0);
            a3.setRequestMethod(str);
            String str2 = this.d;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 30);
            sb.append("multipart/related; boundary=\"");
            sb.append(str2);
            sb.append("\"");
            a3.setRequestProperty("Content-Type", sb.toString());
            a3.setRequestProperty("Host", url.getHost());
            a3.setRequestProperty("Connection", "close");
            this.i = kht.a(a3, clientContext, this.c);
            a3.setDoOutput(true);
        } catch (Exception e2) {
            this.e.close();
            throw e2;
        }
    }

    private final void g() {
        iva.a(this.f, (Object) "Request not executed");
    }

    public final int a() {
        boolean z;
        f();
        lhb e2 = e();
        String str = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8);
        sb.append("\r\n--");
        sb.append(str);
        sb.append("--\r\n");
        e2.a(sb.toString());
        e().close();
        if (this.a > 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z);
        this.f = true;
        int responseCode = this.e.a().getResponseCode();
        if (responseCode != 401) {
            return responseCode;
        }
        this.i.c(this.c);
        return 401;
    }

    public final InputStream b() {
        f();
        g();
        return this.e.a().getInputStream();
    }

    public final InputStream c() {
        f();
        g();
        return this.e.a().getErrorStream();
    }

    public final void close() {
        if (this.e != null) {
            try {
                e().close();
            } catch (IOException e2) {
                b.b("HttpMultipartRequest", "Unable to close output stream", (Throwable) e2);
            }
            this.e.close();
            this.e = null;
        }
    }

    public final long d() {
        return e().a;
    }

    public final lhb e() {
        if (this.g == null) {
            this.g = new lhb(this.e.a().getOutputStream(), this.h);
        }
        return this.g;
    }

    public final void f() {
        iva.a(this.e != null, (Object) "Connection already closed");
    }

    public final void b(String str) {
        iva.a((Object) str);
        StringBuilder sb = new StringBuilder();
        if (this.a != 0) {
            sb.append("\r\n");
        }
        sb.append("--");
        sb.append(this.d);
        sb.append("\r\nContent-Type: ");
        sb.append(str);
        sb.append("\r\n\r\n");
        e().a(sb.toString());
    }

    public final void c(String str) {
        f();
        try {
            a("application/json; charset=UTF-8", str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e2) {
            throw new IOException("Unable to encode metadata", e2);
        }
    }

    public final String a(String str) {
        f();
        g();
        return this.e.a().getHeaderField(str);
    }

    public final void a(String str, String str2) {
        f();
        this.e.a().setRequestProperty(str, str2);
    }

    public final void a(String str, byte[] bArr) {
        f();
        b(str);
        e().write(bArr);
        this.a++;
        int length = bArr.length;
    }
}
