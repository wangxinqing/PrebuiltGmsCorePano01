package defpackage;

import android.content.Context;
import com.android.volley.Response;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: oev  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class oev implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ HelpConfig b;
    final /* synthetic */ okc c;
    final /* synthetic */ long d;
    final /* synthetic */ Response.Listener e;
    final /* synthetic */ Response.ErrorListener f;

    public oev(Context context, HelpConfig helpConfig, okc okc, long j, Response.Listener listener, Response.ErrorListener errorListener) {
        this.a = context;
        this.b = helpConfig;
        this.c = okc;
        this.d = j;
        this.e = listener;
        this.f = errorListener;
    }

    public final void run() {
        oez.a(this.a, this.b, this.c, this.d, (String) null, this.e, this.f);
    }
}
