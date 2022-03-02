package defpackage;

import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: obk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class obk {
    public final obj a;
    public final HelpConfig b;
    public final aoru c;
    public final okc d;

    public obk(obj obj, HelpConfig helpConfig, aoru aoru, okc okc) {
        this.a = obj;
        this.b = helpConfig;
        this.c = aoru;
        this.d = okc;
    }

    public static void a(aoru aoru, obj obj, HelpConfig helpConfig, okc okc) {
        aoru.execute(new obi(new obk(obj, helpConfig, aoru, okc)));
    }
}
