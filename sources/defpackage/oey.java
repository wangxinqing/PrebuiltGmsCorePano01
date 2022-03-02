package defpackage;

import android.content.Context;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: oey  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oey implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ HelpConfig b;
    final /* synthetic */ okc c;

    public oey(Context context, HelpConfig helpConfig, okc okc) {
        this.a = context;
        this.b = helpConfig;
        this.c = okc;
    }

    public final void run() {
        oex oex = new oex(this.a, this.b, oez.f());
        oex.a(16, this.c);
        oex.e();
    }
}
