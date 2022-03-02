package defpackage;

import android.content.Context;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: omi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class omi {
    public final String a;
    public final Context b;
    public final HelpConfig c;
    public final aoru d;
    public final ofn e;
    public final okc f;

    public omi(String str, Context context, HelpConfig helpConfig, aoru aoru, ofn ofn, okc okc) {
        this.a = str;
        this.b = context;
        this.c = helpConfig;
        this.d = aoru;
        this.e = ofn;
        this.f = okc;
    }

    public static void a(String str, aoru aoru, Context context, HelpConfig helpConfig, ofn ofn, okc okc) {
        aoru.execute(new omh(new omi(str, context.getApplicationContext(), helpConfig, aoru, ofn, okc)));
    }
}
