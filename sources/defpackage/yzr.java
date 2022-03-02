package defpackage;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: yzr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yzr implements yup {
    final /* synthetic */ yzz a;

    public yzr(yzz yzz) {
        this.a = yzz;
    }

    public final void a(ConnectionResult connectionResult, ysx ysx) {
        yzz yzz = this.a;
        if (yzz.a) {
            yzz.a = false;
            yzz.c.refreshDrawableState();
        }
        if (connectionResult.b() && ysx != null) {
            yzz yzz2 = this.a;
            yzz2.s = ysx;
            yzz2.a(yzz2.s);
            this.a.a();
        } else {
            Log.w("PlusOneButtonView", "PlusOne failed to load");
            this.a.b();
        }
        this.a.v = false;
    }
}
