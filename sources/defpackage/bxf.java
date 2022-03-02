package defpackage;

import java.util.Set;

/* renamed from: bxf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bxf implements acvp {
    final /* synthetic */ Set a;
    final /* synthetic */ bxh b;

    public bxf(bxh bxh, Set set) {
        this.b = bxh;
        this.a = set;
    }

    public final void a(acwa acwa) {
        if (!acwa.b() || !((Boolean) acwa.d()).booleanValue()) {
            ((anih) ((anih) bxk.a.c()).a("bxf", "a", 174, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[UpdateFenceRegistrationOperation] Gesture nano app is not available.");
            this.b.a(7514);
            return;
        }
        this.a.remove(23);
        this.b.a(this.a);
    }
}
