package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: yzw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yzw implements icb {
    final /* synthetic */ yzz a;

    public yzw(yzz yzz) {
        this.a = yzz;
    }

    public final void a(ConnectionResult connectionResult) {
        int i = connectionResult.c;
        if (i == 6 || i == 4) {
            yzz yzz = this.a;
            yzz.x = true;
            yzz.q.t();
            this.a.t = connectionResult;
        }
    }
}
