package defpackage;

import android.content.Context;

/* renamed from: ulj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ulj {
    public final uru a = new uru();
    public final ulb b;
    public final upb c;
    public final ult d;
    public final ujq e;
    public final ukz f;
    public final uoh g;
    public final uoz h;
    public final ump i;
    public final une j;
    public final umm k;
    public final uls l;

    public ulj(Context context) {
        this.b = new ulb(context, this.a);
        this.c = new upb(context, this.a);
        this.d = new ult(context);
        this.e = new ujq(context, this.a);
        this.f = new ukz(context, this.a);
        this.g = new uoh(context, this.c, this.a);
        this.h = new uoz(context, this.a);
        this.i = new ump(context, this.a);
        this.j = new une(context, this.a);
        this.k = new umm(context);
        this.l = new uls(context);
    }

    public final void a() {
        ((anih) ((anih) ulh.a.d()).a("ulj", "a", 62, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Initiating shutdown of Bluetooth.");
        this.f.a();
        this.e.a();
        this.b.b();
        ((anih) ((anih) ulh.a.d()).a("ulj", "a", 66, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Bluetooth has shut down.");
        ((anih) ((anih) ulh.a.d()).a("ulj", "a", 69, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Initiating shutdown of WiFi.");
        une une = this.j;
        tid.a(une.c, "WifiDirect.singleThreadOffloader");
        une.c();
        une.f();
        une.a.a();
        this.i.a();
        this.h.a();
        uoh uoh = this.g;
        uoh.j();
        synchronized (uoh) {
            tid.a(uoh.l, "WifiHotspot.singleThreadOffloader");
            uoh.g();
            uoh.e();
            uoh.h();
        }
        this.c.d();
        ((anih) ((anih) ulh.a.d()).a("ulj", "a", 75, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("WiFi has shut down.");
        ((anih) ((anih) ulh.a.d()).a("ulj", "a", 78, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Initiating shutdown of NFC.");
        this.l.a();
        ((anih) ((anih) ulh.a.d()).a("ulj", "a", 81, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("NFC has shut down.");
        ((anih) ((anih) ulh.a.d()).a("ulj", "a", 84, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Initiating shutdown of WebRTC.");
        this.k.b();
        ((anih) ((anih) ulh.a.d()).a("ulj", "a", 86, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("WebRTC has shut down.");
        uru uru = this.a;
        if (uru.f.compareAndSet(false, true)) {
            synchronized (uru) {
                for (urs urs : uru.c.values()) {
                    urs.b.b();
                }
                tid.a(uru.e, "MultiMediumDependencyManager.needsRetryExecutor");
                for (urq urq : uru.b()) {
                    ((anih) ((anih) ulh.a.d()).a("uru", "a", 160, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s MediumOperation %s is unexpectedly registered and will be unregistered.", (Object) "[MMD]:", (Object) urq.d());
                    uru.c(urq);
                }
            }
        }
    }
}
