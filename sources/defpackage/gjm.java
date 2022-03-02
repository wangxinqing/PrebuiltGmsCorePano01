package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.SystemClock;
import java.util.Random;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/* renamed from: gjm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gjm {
    public static final fzh a = new gjl();
    private final Context b;
    private final boolean c;
    private final opc d;

    public final HttpResponse a(HttpUriRequest httpUriRequest) {
        long clearCallingIdentity;
        izj.a(1025, Binder.getCallingUid());
        try {
            clearCallingIdentity = Binder.clearCallingIdentity();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            opc opc = this.d;
            HttpResponse a2 = opc.a(httpUriRequest, (opb) new opg(opc));
            aucd o = anoq.f.o();
            boolean z = this.c;
            if (o.c) {
                o.c();
                o.c = false;
            }
            anoq anoq = (anoq) o.b;
            anoq.a |= 1;
            anoq.b = z;
            String uri = httpUriRequest.getURI().toString();
            if (o.c) {
                o.c();
                o.c = false;
            }
            anoq anoq2 = (anoq) o.b;
            uri.getClass();
            anoq2.a |= 2;
            anoq2.c = uri;
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (o.c) {
                o.c();
                o.c = false;
            }
            anoq anoq3 = (anoq) o.b;
            anoq3.a |= 4;
            anoq3.d = elapsedRealtime2;
            StatusLine statusLine = a2.getStatusLine();
            if (statusLine != null) {
                int statusCode = statusLine.getStatusCode();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                anoq anoq4 = (anoq) o.b;
                anoq4.a |= 8;
                anoq4.e = statusCode;
            }
            aucd o2 = anon.v.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anon anon = (anon) o2.b;
            anon.c = 5;
            anon.a |= 1;
            anoq anoq5 = (anoq) o.i();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anon anon2 = (anon) o2.b;
            anoq5.getClass();
            anon2.f = anoq5;
            anon2.a |= 32;
            if (((double) new Random().nextFloat()) >= ent.u()) {
                new hol(this.b, "ANDROID_AUTH", (String) null).a(((anon) o2.i()).k()).b();
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
            izj.a();
            return a2;
        } catch (Throwable th) {
            izj.a();
            throw th;
        }
    }

    public gjm(Context context) {
        opc opc = new opc(context, "GoogleAuth/1.4", awjm.b(), hxz.g(context) ? opd.PERMIT_ALL : opd.PERMIT_BLOCK);
        HttpParams httpParams = opc.b;
        HttpConnectionParams.setConnectionTimeout(httpParams, 30000);
        HttpConnectionParams.setSoTimeout(httpParams, 30000);
        ConnManagerParams.setTimeout(httpParams, 30000);
        iva.a((Object) context);
        this.b = context;
        iva.a((Object) opc);
        this.d = opc;
        this.c = ((iit) iit.a.b()).a(opc, this.b);
    }
}
