package defpackage;

import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: yzo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yzo implements yup {
    final /* synthetic */ yzp a;

    public yzo(yzp yzp) {
        this.a = yzp;
    }

    public final void a(ConnectionResult connectionResult, ysx ysx) {
        yzp yzp = this.a;
        if (yzp.a) {
            yzp.a = false;
            yzp.c.refreshDrawableState();
        }
        if (connectionResult.b() && ysx != null) {
            this.a.a(ysx);
            this.a.a();
            this.a.setTag((Intent) ysx.a.getParcelable("intent"));
            return;
        }
        Log.w("PlusOneButtonView", "PlusOne failed to load");
        this.a.b();
    }
}
