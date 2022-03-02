package defpackage;

import android.content.IntentFilter;

/* renamed from: asbw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asbw implements asiz {
    final /* synthetic */ asiz a;
    final /* synthetic */ asbx b;

    public asbw(asbx asbx, asiz asiz) {
        this.b = asbx;
        this.a = asiz;
    }

    public final void a() {
        this.b.b.set(true);
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.device.action.FOUND");
        asbx asbx = this.b;
        asda asda = asbx.a;
        asda.i.registerReceiver(asbx.e, intentFilter, (String) null, asda.k);
        this.b.a.f();
        jjg jjg = asil.a;
        this.a.a();
    }

    public final void b() {
        anih anih = (anih) asil.a.b();
        anih.a((Throwable) new IllegalStateException());
        ((anih) anih.a("asbw", "b", 100, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Fail to enable bluetooth");
        this.a.b();
    }
}
