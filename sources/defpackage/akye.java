package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: akye  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akye implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ akyf b;

    public akye(akyf akyf, Status status) {
        this.b = akyf;
        this.a = status;
    }

    public final void run() {
        akyk akyk = this.b.c;
        Status status = this.a;
        akrp akrp = (akrp) akyk;
        akrp.a.d = status;
        if (!status.c()) {
            if (Log.isLoggable("Places", 6)) {
                alfy.a("Places", String.format("Failed to remove %d geofences due to error: %s. Currently tracking %d.", new Object[]{Integer.valueOf(akrp.a.b.size()), rdp.g(status.i), Integer.valueOf(akrp.a.f.size())}));
            }
            akrp.b.c(akrp.a);
            return;
        }
        akrp.b.a(akrp.a);
    }
}
