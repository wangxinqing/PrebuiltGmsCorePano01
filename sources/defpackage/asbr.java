package defpackage;

import com.google.android.gms.beacon.BleSettings;

/* renamed from: asbr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asbr implements asiz {
    final /* synthetic */ asiz a;
    final /* synthetic */ asbt b;

    public asbr(asbt asbt, asiz asiz) {
        this.b = asbt;
        this.a = asiz;
    }

    public final void a() {
        this.b.e.set(true);
        gtj gtj = new gtj();
        gtj.b(2);
        gtj.a(this.b.g);
        gtj.a(this.b.c());
        gtj.a = 1;
        BleSettings a2 = gtj.a();
        asbt asbt = this.b;
        asbt.b.a(asbt.h, a2);
        jjg jjg = asil.a;
        this.a.a();
    }

    public final void b() {
        anih anih = (anih) asil.a.b();
        anih.a((Throwable) new IllegalStateException());
        ((anih) anih.a("asbr", "b", 294, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Fail to enable bluetooth");
        this.a.b();
    }
}
