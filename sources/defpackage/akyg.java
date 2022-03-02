package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: akyg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akyg implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ akyh b;

    public akyg(akyh akyh, Status status) {
        this.b = akyh;
        this.a = status;
    }

    public final void run() {
        akyk akyk = this.b.c;
        Status status = this.a;
        akro akro = (akro) akyk;
        akro.a.d = status;
        if (!status.c()) {
            if (Log.isLoggable("Places", 6)) {
                alfy.a("Places", "Failed to remove all geofences by pending intent.");
            }
            akro.b.c(akro.a);
            return;
        }
        akro.b.b(akro.a);
    }
}
