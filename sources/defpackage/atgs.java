package defpackage;

import android.util.Log;
import com.android.volley.Cache;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.RequestFuture;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: atgs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class atgs extends Request {
    private final atgt d;
    private final byte[] e;
    private final atgu f;
    private final RequestFuture g;
    private final boolean h = true;

    public atgs(atgt atgt, byte[] bArr, atgu atgu, String str, RequestFuture requestFuture) {
        super(1, str, requestFuture);
        this.d = atgt;
        this.e = bArr;
        this.f = atgu;
        this.g = requestFuture;
    }

    public final /* bridge */ /* synthetic */ void deliverResponse(Object obj) {
        this.g.onResponse((byte[]) obj);
    }

    public final byte[] getBody() {
        return this.e;
    }

    public final String getBodyContentType() {
        return "application/binary";
    }

    public final Map getHeaders() {
        atgt atgt = this.d;
        byte[] bArr = this.e;
        boolean z = this.h;
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Length", String.valueOf(bArr.length));
        if (!z) {
            String m = atgt.b.m();
            String n = atgt.b.n();
            if (n != null) {
                hashMap.put("X-Google-Maps-Mobile-API", atgb.a(new String[]{m, n, atgt.f, "6.18.0", atgt.e}, ","));
            } else {
                throw new IllegalStateException("app version not set");
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        String str = (String) networkResponse.headers.get("Content-Type");
        try {
            atgt atgt = this.d;
            int i = networkResponse.statusCode;
            if (i != 200) {
                if (atfx.a(atgt.a, 5)) {
                    String str2 = atgt.a;
                    StringBuilder sb = new StringBuilder(35);
                    sb.append("Bad HTTP response code: ");
                    sb.append(i);
                    Log.w(str2, sb.toString());
                }
                if (i == 500) {
                    for (atgo e2 : atgt.c) {
                        e2.e();
                    }
                    String a = atgt.a(atgt.c);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(a).length() + 41);
                    sb2.append("Serverside failure (HTTP");
                    sb2.append(500);
                    sb2.append(") for ");
                    sb2.append(a);
                    throw new atgv(sb2.toString());
                } else if (i != 501) {
                    String a2 = atgt.a(atgt.c);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(a2).length() + 40);
                    sb3.append("Bad HTTP response code: ");
                    sb3.append(i);
                    sb3.append(" for ");
                    sb3.append(a2);
                    throw new IOException(sb3.toString());
                } else {
                    atgt.b.r();
                    throw new IOException("Server side HTTP not implemented");
                }
            } else if (!"application/binary".equals(str)) {
                if (atfx.a(atgt.a, 6)) {
                    String str3 = atgt.a;
                    String valueOf = String.valueOf(str);
                    Log.e(str3, valueOf.length() == 0 ? new String("Bad HTTP content type: ") : "Bad HTTP content type: ".concat(valueOf));
                }
                String a3 = atgt.a(atgt.c);
                StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 28 + String.valueOf(a3).length());
                sb4.append("Bad HTTP content type: ");
                sb4.append(str);
                sb4.append(" for ");
                sb4.append(a3);
                throw new IOException(sb4.toString());
            } else {
                this.f.a();
                return Response.success(networkResponse.data, (Cache.Entry) null);
            }
        } catch (atgv | IOException e3) {
            return Response.error(new VolleyError(e3));
        }
    }
}
