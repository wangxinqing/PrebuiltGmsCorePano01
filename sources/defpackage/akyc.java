package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: akyc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akyc implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ akyd b;

    public akyc(akyd akyd, Status status) {
        this.b = akyd;
        this.a = status;
    }

    public final void run() {
        akyk akyk = this.b.c;
        Status status = this.a;
        akrk akrk = (akrk) akyk;
        akrk.a.d = status;
        if (!status.c()) {
            if (Log.isLoggable("Places", 6)) {
                alfy.a("Places", String.format("Failed to add %d geofences due to error: %s. Currently tracking %d geofences.", new Object[]{Integer.valueOf(akrk.a.c.size()), rdp.g(status.i), Integer.valueOf(akrk.a.f.size())}));
            }
            akrk.b.c(akrk.a);
            return;
        }
        akrk.b.b(akrk.a);
    }
}
