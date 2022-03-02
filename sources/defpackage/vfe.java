package defpackage;

import com.android.volley.NetworkError;
import com.android.volley.NetworkResponse;
import com.android.volley.NoConnectionError;
import com.android.volley.Response;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import java.util.Map;

/* renamed from: vfe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vfe implements Response.Listener, Response.ErrorListener {
    final /* synthetic */ vff a;

    public vfe(vff vff) {
        this.a = vff;
    }

    private final void a(audx audx, int i, Map map) {
        arwg arwg = this.a.g;
        StringBuilder sb = new StringBuilder(37);
        sb.append("ServerTaskImpl.onResponse:");
        sb.append(i);
        arwg.c(new vfc(this, sb.toString(), audx));
        vff vff = this.a;
        vfg vfg = vff.k;
        vff.a(audx);
        vfg.a(audx, i, map);
        vff vff2 = this.a;
        Object a2 = vff2.a(vff2.m, audx);
        avcz a3 = this.a.a(audx);
        int i2 = 1;
        if (!(a3 == null || (a3.a & 2) == 0)) {
            avad avad = a3.b;
            if (avad == null) {
                avad = avad.b;
            }
            int a4 = avcd.a(avad.a);
            if (a4 != 0) {
                i2 = a4;
            }
        }
        int i3 = i2 - 2;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 0) {
            vff vff3 = this.a;
            vff3.g.c(new vey(vff3, a2));
        } else if (i3 != 204) {
            ((anih) ((anih) tgc.a.c()).a("vfe", "a", 657, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s unknown status code from server. Response Header: %s", (Object) "ServerTask: ", (Object) a3);
            this.a.b(13);
        } else {
            this.a.g.c(new vfd(this, "ServerTaskImpl.registerDevice"));
            this.a.b(13);
        }
    }

    public final void onErrorResponse(VolleyError volleyError) {
        String str;
        NetworkResponse networkResponse = volleyError.networkResponse;
        if (networkResponse != null && networkResponse.statusCode == 401 && this.a.l > 0) {
            this.a.k.a((audx) null, networkResponse.statusCode, networkResponse.headers);
            jjg jjg = tgc.a;
            int i = this.a.l;
            vff vff = this.a;
            vff.l--;
            this.a.g.c(new vez(this, "ServerTaskImpl.unauthorizedRetry"));
        } else if (networkResponse == null) {
            this.a.k.a((audx) null, 400, (Map) null);
            this.a.g.c(new vfa(this, "ServerTaskImpl.logErrorResponse"));
            if ((volleyError instanceof TimeoutError) || (volleyError instanceof NoConnectionError) || (volleyError instanceof NetworkError)) {
                this.a.b(7);
            } else {
                this.a.b(13);
            }
        } else {
            int i2 = networkResponse.statusCode;
            this.a.k.a((audx) null, i2, networkResponse.headers);
            if (i2 == 300) {
                byte[] bArr = networkResponse.data;
                Map map = networkResponse.headers;
                try {
                    vff vff2 = this.a;
                    vff2.n = vff2.n.av().a(bArr).i();
                    a(this.a.n, 300, map);
                } catch (auda e) {
                    jjg jjg2 = tgc.a;
                    vff vff3 = this.a;
                    new VolleyError((Throwable) e);
                    vff3.b(vff.a(400));
                }
            } else if (i2 != 204) {
                this.a.g.c(new vfb(this, "ServerTaskImpl.logErrorResponse", i2));
                if (((anih) tgc.a.c()).l()) {
                    anih anih = (anih) ((anih) tgc.a.c()).a("vfe", "onErrorResponse", 624, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
                    NetworkResponse networkResponse2 = volleyError.networkResponse;
                    Object[] objArr = new Object[3];
                    objArr[0] = volleyError.getClass().getSimpleName();
                    if (networkResponse2 != null) {
                        int i3 = networkResponse2.statusCode;
                        StringBuilder sb = new StringBuilder(13);
                        sb.append("(");
                        sb.append(i3);
                        sb.append(")");
                        str = sb.toString();
                    } else {
                        str = "";
                    }
                    objArr[1] = str;
                    objArr[2] = volleyError.getMessage();
                    anih.a("%s Bad status response: %s", (Object) "ServerTask: ", (Object) String.format("%s: %s%s", objArr));
                }
                this.a.b(vff.a(i2));
            } else {
                a(this.a.n, 204, networkResponse.headers);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        a((audx) obj, 200, vfg.a);
    }
}
