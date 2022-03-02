package defpackage;

import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Scanner;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;

/* renamed from: lry  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lry {
    public static final ith a = new ith("NetworkResponseErrorDec", "");

    public static lrx a(NetworkResponse networkResponse) {
        String str;
        ByteArrayInputStream byteArrayInputStream = null;
        if (!a(networkResponse.statusCode)) {
            return null;
        }
        byte[] bArr = networkResponse.data;
        if (bArr != null) {
            Map map = networkResponse.headers;
            if (map != null) {
                str = (String) map.get("Content-Encoding");
            } else {
                str = null;
            }
            if (str == null) {
                try {
                    byteArrayInputStream = new ByteArrayInputStream(bArr);
                } catch (IOException e) {
                    a.c("NetworkResponseErrorDec", "Error while reading error response.", e);
                }
            } else if (str.equalsIgnoreCase("gzip")) {
                byteArrayInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
            } else if (!str.equalsIgnoreCase("deflate")) {
                a.b("Unsupported encoding: %s", str);
            } else {
                byteArrayInputStream = new InflaterInputStream(new ByteArrayInputStream(bArr));
            }
        }
        return a((InputStream) byteArrayInputStream);
    }

    public static boolean a(int i) {
        return i >= 400;
    }

    public static lrx a(InputStream inputStream) {
        String str = "";
        if (inputStream != null) {
            Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
            try {
                if (useDelimiter.hasNext()) {
                    str = useDelimiter.next();
                }
            } finally {
                useDelimiter.close();
            }
        }
        return new lrx(str);
    }

    public static void a(int i, lrx lrx) {
        if (lrx != null && lrx.b != null) {
            a.b("StatusCode:%d Reason:[%s] Location:[%s]", Integer.valueOf(i), lrx.b, lrx.d);
        }
    }

    public static void a(VolleyError volleyError) {
        NetworkResponse networkResponse = volleyError.networkResponse;
        if (networkResponse != null) {
            a(volleyError.networkResponse.statusCode, a(networkResponse));
        }
    }
}
