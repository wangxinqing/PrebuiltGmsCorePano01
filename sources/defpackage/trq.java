package defpackage;

import java.util.Arrays;

/* renamed from: trq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class trq implements toz {
    final /* synthetic */ arzs a;
    final /* synthetic */ aosh b;

    public trq(arzs arzs, aosh aosh) {
        this.a = arzs;
        this.b = aosh;
    }

    public final void a(uvy uvy) {
        jjg jjg = tky.a;
    }

    public final void a(uvy uvy, byte[] bArr) {
        if (!Arrays.equals(this.a.c.k(), bArr)) {
            jjg jjg = tky.a;
            tky.a(bArr);
            return;
        }
        ((anih) tky.a.d()).a("WifiAwareBandwidthUpgradeMedium discovered serviceInfo %s", (Object) tky.a(bArr));
        this.b.b((Object) uvy);
    }
}
