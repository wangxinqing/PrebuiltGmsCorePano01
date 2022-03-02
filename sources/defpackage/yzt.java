package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: yzt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yzt implements yut {
    final /* synthetic */ yzz a;

    public yzt(yzz yzz) {
        this.a = yzz;
    }

    public final void a(ConnectionResult connectionResult, ysy ysy) {
        if (connectionResult.b() && ysy != null) {
            yzz yzz = this.a;
            yzz.r = ysy;
            yzz.p.a(yzz.z, yzz.g);
            yzz yzz2 = this.a;
            if (yzz2.w) {
                yzz2.a = false;
                yzz2.performClick();
                this.a.w = false;
            }
        }
    }
}
