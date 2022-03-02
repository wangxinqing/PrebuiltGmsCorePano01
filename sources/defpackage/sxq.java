package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.AppMetadata;

/* renamed from: sxq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sxq implements Runnable {
    final /* synthetic */ AppMetadata a;
    final /* synthetic */ boolean b;
    final /* synthetic */ sye c;

    public sxq(sye sye, AppMetadata appMetadata, boolean z) {
        this.c = sye;
        this.a = appMetadata;
        this.b = z;
    }

    public final void run() {
        sye sye = this.c;
        sug sug = sye.c;
        if (sug != null) {
            try {
                sug.a(this.a);
                if (this.b) {
                    this.c.b().s();
                }
                this.c.a(sug, (AbstractSafeParcelable) null, this.a);
                this.c.q();
            } catch (RemoteException e) {
                this.c.E().c.a("Failed to send app launch to the service", e);
            }
        } else {
            sye.E().c.a("Discarding data. Failed to send app launch");
        }
    }
}
