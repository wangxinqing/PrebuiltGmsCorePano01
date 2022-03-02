package defpackage;

import android.content.Context;
import android.util.Log;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import java.util.Locale;
import java.util.Map;

/* renamed from: ajkx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ajkx extends izb {
    private static final int[] n = {3, 4, 3, 6, 4, 7, 5, 5};
    public ajkw m;

    public ajkx(Context context, String str, String str2, String str3) {
        super(context, str, str2, true, true, str3, (String) null);
    }

    public final void a(Request request, boolean z, String str) {
        try {
            ajkw ajkw = this.m;
            int method = request.getMethod();
            long j = 4;
            if (method >= 0 && method < n.length) {
                j = (long) n[method];
            }
            long j2 = j + 1;
            String url = request.getUrl();
            if (url != null) {
                Locale locale = Locale.US;
                Object[] objArr = {url, Integer.valueOf(url.length())};
                j2 += (long) url.length();
            }
            long j3 = j2 + 11;
            Map headers = request.getHeaders();
            if (headers != null && !headers.isEmpty()) {
                for (Map.Entry entry : headers.entrySet()) {
                    int length = ((String) entry.getKey()).length() + 2 + ((String) entry.getValue()).length() + 2;
                    Locale locale2 = Locale.US;
                    Object[] objArr2 = {entry.getKey(), entry.getValue(), Integer.valueOf(length)};
                    j3 += (long) length;
                }
            }
            long j4 = j3 + 2;
            byte[] body = request.getBody();
            if (body != null) {
                int length2 = body.length;
                StringBuilder sb = new StringBuilder(62);
                sb.append("LoggingApiaryServer.sizeFromRequest(): . body size ");
                sb.append(length2);
                sb.toString();
                j4 += (long) length2;
            }
            StringBuilder sb2 = new StringBuilder(72);
            sb2.append("LoggingApiaryServer.sizeFromRequest(): . total size ");
            sb2.append(j4);
            sb2.toString();
            ajkw.a(j4);
        } catch (AuthFailureError e) {
            Log.e("GCoreUlr", "Failed to calculate RPC size", e);
            this.m.a(-1);
        } catch (RuntimeException e2) {
            ajix.b("GCoreUlr", "RuntimeException trying to log an RPC!", (Throwable) e2);
        } catch (Throwable th) {
            super.a(request, z, str);
            throw th;
        }
        super.a(request, z, str);
    }
}
