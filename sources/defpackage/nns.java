package defpackage;

import com.google.android.gms.ads.internal.clearcut.a;
import com.google.android.gms.ads.internal.clearcut.b;

/* renamed from: nns  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class nns implements acvf {
    private final int a;
    private final aucd b;

    public nns(aucd aucd, int i) {
        this.b = aucd;
        this.a = i;
    }

    public final Object a(acwa acwa) {
        aucd aucd = this.b;
        int i = this.a;
        int i2 = nnt.a;
        if (!acwa.b()) {
            return false;
        }
        a a2 = ((b) acwa.d()).a(((com.google.ads.afma.b) aucd.i()).k());
        a2.b = i;
        a2.a();
        return true;
    }
}
