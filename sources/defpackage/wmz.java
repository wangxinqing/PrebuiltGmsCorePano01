package defpackage;

import android.content.Context;
import android.net.Uri;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;

/* renamed from: wmz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wmz {
    private static wmz c;
    public final Context a;
    public final izb b;
    private final jiq d;

    static {
        wmz.class.getName();
    }

    public wmz(Context context, izb izb) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.d = ycm.a(applicationContext);
        this.b = izb;
        izb.g = 5402;
    }

    public static synchronized wmz a(Context context) {
        wmz wmz;
        synchronized (wmz.class) {
            if (c == null) {
                izb izb = new izb(context, (String) null, (String) null, aywy.a.a().f(), true, (String) null, (String) null);
                izb.g = 5376;
                c = new wmz(context, izb);
            }
            wmz = c;
        }
        return wmz;
    }

    public final byte[] a(String str) {
        byte[] a2 = this.b.a(this.a, (Uri) null, str);
        if (a2 != null) {
            wss.a(this.a).a(0);
            wss.a(this.a).a(0);
        }
        return a2;
    }

    public final byte[] a(String str, boolean z) {
        String str2;
        try {
            if (this.d.a() / 1000 >= wss.a(this.a).b()) {
                return a(str);
            }
            throw new VolleyError("No request was sent, since we are currently backing off. A request at this time would likely fail.");
        } catch (VolleyError e) {
            if (ycc.b((Throwable) e)) {
                wss a2 = wss.a(this.a);
                wss a3 = wss.a(this.a);
                int i = a3.a.getInt("avatar_fetch_backoff_sec", 0);
                boolean V = aywy.a.a().V();
                int W = (int) aywy.a.a().W();
                if (i > 0) {
                    W = Math.max(W, i);
                    if (V) {
                        W += W;
                    }
                }
                int min = Math.min((int) aywy.a.a().X(), W);
                a3.a(min);
                if (min > 0) {
                    long max = Math.max(a2.b(), (this.d.a() / 1000) + ((long) min));
                    a2.a(max);
                    Context context = this.a;
                    StringBuilder sb = new StringBuilder(59);
                    sb.append("avatar backoff=");
                    sb.append(min);
                    sb.append(" delay until=");
                    sb.append(max);
                    wus.a(context, "PeopleIS", sb.toString());
                }
            } else if (z && ycc.a((Throwable) e)) {
                return wpc.c;
            }
            Object[] objArr = new Object[3];
            objArr[0] = str;
            objArr[1] = e.getMessage();
            NetworkResponse networkResponse = e.networkResponse;
            if (networkResponse != null) {
                str2 = String.valueOf(networkResponse.statusCode);
            } else {
                str2 = "none";
            }
            objArr[2] = str2;
            xdt.b("PeopleIS", "Error retrieving image at URL %s: %s [%s]", objArr);
            return wpc.d;
        }
    }
}
