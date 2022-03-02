package defpackage;

import android.os.Build;

/* renamed from: uxa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uxa extends arwm {
    final /* synthetic */ int a;
    final /* synthetic */ uxb b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uxa(uxb uxb, String str, int i) {
        super(str);
        this.b = uxb;
        this.a = i;
    }

    public final void run() {
        uxd uxd = this.b.a;
        int i = this.a;
        int i2 = Build.VERSION.SDK_INT;
        for (uxc a2 : uxd.a) {
            jjg jjg = tgc.a;
            a2.a(i);
        }
    }
}
