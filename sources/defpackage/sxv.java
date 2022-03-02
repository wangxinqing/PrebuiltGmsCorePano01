package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;

/* renamed from: sxv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sxv implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ConditionalUserPropertyParcel c;
    final /* synthetic */ AppMetadata d;
    final /* synthetic */ ConditionalUserPropertyParcel e;
    final /* synthetic */ sye f;

    public sxv(sye sye, boolean z, boolean z2, ConditionalUserPropertyParcel conditionalUserPropertyParcel, AppMetadata appMetadata, ConditionalUserPropertyParcel conditionalUserPropertyParcel2) {
        this.f = sye;
        this.a = z;
        this.b = z2;
        this.c = conditionalUserPropertyParcel;
        this.d = appMetadata;
        this.e = conditionalUserPropertyParcel2;
    }

    public final void run() {
        ConditionalUserPropertyParcel conditionalUserPropertyParcel;
        sye sye = this.f;
        sug sug = sye.c;
        if (sug == null) {
            sye.E().c.a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (!this.a) {
            try {
                if (TextUtils.isEmpty(this.e.a)) {
                    sug.a(this.c, this.d);
                } else {
                    sug.a(this.c);
                }
            } catch (RemoteException e2) {
                this.f.E().c.a("Failed to send conditional user property to the service", e2);
            }
        } else {
            if (!this.b) {
                conditionalUserPropertyParcel = this.c;
            } else {
                conditionalUserPropertyParcel = null;
            }
            sye.a(sug, conditionalUserPropertyParcel, this.d);
        }
        this.f.q();
    }
}
