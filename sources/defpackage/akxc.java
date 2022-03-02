package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: akxc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class akxc implements acvp {
    private final akxd a;

    public akxc(akxd akxd) {
        this.a = akxd;
    }

    public final void a(acwa acwa) {
        akxd akxd = this.a;
        if (acwa.b()) {
            akxd.b(Status.a);
            return;
        }
        if (Log.isLoggable("Places", 6)) {
            Log.e("Places", "Operation failed: RequestPlaceUpdates", acwa.e());
        }
        akxd.b(Status.c);
    }
}
