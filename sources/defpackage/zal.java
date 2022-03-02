package defpackage;

import android.content.Context;
import com.android.volley.Request;
import com.google.android.gms.common.internal.ClientContext;
import java.util.HashMap;

/* renamed from: zal  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zal extends izb {
    public zal(Context context, String str, String str2, boolean z, boolean z2, String str3, String str4) {
        super(context, str, str2, z, z2, str3, str4);
        this.g = 6400;
    }

    /* access modifiers changed from: protected */
    public final izw a(ClientContext clientContext) {
        return new izw(clientContext, (byte[]) null);
    }

    public final HashMap a(Context context, ClientContext clientContext) {
        izt izt;
        Long l;
        String str;
        String str2;
        String str3;
        HashMap a = super.a(context, clientContext);
        synchronized (izt.class) {
            if (izt.a == null) {
                izt.a = new izt();
            }
            izt = izt.a;
        }
        Context context2 = this.i;
        String a2 = zak.a(context2.getPackageManager(), clientContext.e);
        izx a3 = izx.a();
        String str4 = clientContext.f;
        synchronized (a3.a) {
            l = (Long) a3.a.get(str4);
        }
        a.put("X-Container-Url", a2);
        synchronized (izt) {
            if (izt.b == null) {
                izt.b = jhg.b(context2);
            }
            str = izt.b;
        }
        a.put("X-Network-ID", str);
        if (l != null) {
            str2 = l.toString();
        } else {
            str2 = "none";
        }
        a.put("X-Auth-Time", str2);
        if (clientContext != null) {
            str3 = clientContext.b("application_name");
        } else {
            str3 = null;
        }
        yxh.a();
        yxh.a(a, str3, jhg.f(context), jix.a(context.getResources()));
        a.put("User-Agent", izu.a(context, "G+ SDK/1.0.1"));
        return a;
    }

    /* access modifiers changed from: protected */
    public final void a(Request request, String str) {
        request.setRetryPolicy(new iym(this.i, str, ysu.a(request.getMethod(), request.getUrl()), 1, 1.0f));
    }
}
