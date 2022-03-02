package defpackage;

import android.content.Context;
import com.android.volley.Response;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: oba  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oba implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ HelpConfig b;
    final /* synthetic */ okc c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;
    final /* synthetic */ String f;
    final /* synthetic */ Response.Listener g;
    final /* synthetic */ Response.ErrorListener h;

    public oba(Context context, HelpConfig helpConfig, okc okc, String str, String str2, String str3, Response.Listener listener, Response.ErrorListener errorListener) {
        this.a = context;
        this.b = helpConfig;
        this.c = okc;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = listener;
        this.h = errorListener;
    }

    public final void run() {
        obb.a(this.a, this.b, this.c, this.d, this.e, this.f, (String) null, this.g, this.h);
    }
}
