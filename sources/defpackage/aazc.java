package defpackage;

import com.android.volley.Response;

/* renamed from: aazc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aazc implements Response.Listener {
    final /* synthetic */ aazf a;

    public aazc(aazf aazf) {
        this.a = aazf;
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        aazf aazf = this.a;
        aazf.h = (String) obj;
        aazf.b();
    }
}
