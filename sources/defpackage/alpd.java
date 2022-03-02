package defpackage;

import java.util.Map;

/* renamed from: alpd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alpd implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ alqf b;
    final /* synthetic */ Map c;
    final /* synthetic */ String d;
    final /* synthetic */ alpi e;
    final /* synthetic */ alva f;
    final /* synthetic */ alpe g;

    public alpd(alpe alpe, String str, alqf alqf, Map map, String str2, alpi alpi, alva alva) {
        this.g = alpe;
        this.a = str;
        this.b = alqf;
        this.c = map;
        this.d = str2;
        this.e = alpi;
        this.f = alva;
    }

    public final void run() {
        this.g.a.a(this.a, this.b, this.c, this.d, new alpc(this), this.f);
    }
}
