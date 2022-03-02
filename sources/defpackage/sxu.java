package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.EventParcel;

/* renamed from: sxu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sxu implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ EventParcel c;
    final /* synthetic */ AppMetadata d;
    final /* synthetic */ String e;
    final /* synthetic */ sye f;

    public sxu(sye sye, boolean z, boolean z2, EventParcel eventParcel, AppMetadata appMetadata, String str) {
        this.f = sye;
        this.a = z;
        this.b = z2;
        this.c = eventParcel;
        this.d = appMetadata;
        this.e = str;
    }

    public final void run() {
        EventParcel eventParcel;
        sye sye = this.f;
        sug sug = sye.c;
        if (sug == null) {
            sye.E().c.a("Discarding data. Failed to send event to service");
            return;
        }
        if (!this.a) {
            try {
                if (!TextUtils.isEmpty(this.e)) {
                    sug.a(this.c, this.e, this.f.E().c());
                } else {
                    sug.a(this.c, this.d);
                }
            } catch (RemoteException e2) {
                this.f.E().c.a("Failed to send event to the service", e2);
            }
        } else {
            if (!this.b) {
                eventParcel = this.c;
            } else {
                eventParcel = null;
            }
            sye.a(sug, eventParcel, this.d);
        }
        this.f.q();
    }
}
