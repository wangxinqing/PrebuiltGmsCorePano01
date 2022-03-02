package defpackage;

import android.app.Application;
import android.content.SharedPreferences;

/* renamed from: agfj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agfj implements awdt {
    private final bapu a;
    private final bapu b;
    private final bapu c;
    private final bapu d;
    private final bapu e;

    public agfj(bapu bapu, bapu bapu2, bapu bapu3, bapu bapu4, bapu bapu5) {
        this.a = bapu;
        this.b = bapu2;
        this.c = bapu3;
        this.d = bapu4;
        this.e = bapu5;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        return new agfi(((agku) this.a).a(), (Application) ((awdu) this.b).a, this.c, ((agel) this.d).a(), (SharedPreferences) this.e.a());
    }
}
