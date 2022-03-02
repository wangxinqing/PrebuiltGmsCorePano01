package defpackage;

import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.UserAttributeParcel;

/* renamed from: sxo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sxo implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ UserAttributeParcel b;
    final /* synthetic */ AppMetadata c;
    final /* synthetic */ sye d;

    public sxo(sye sye, boolean z, UserAttributeParcel userAttributeParcel, AppMetadata appMetadata) {
        this.d = sye;
        this.a = z;
        this.b = userAttributeParcel;
        this.c = appMetadata;
    }

    public final void run() {
        UserAttributeParcel userAttributeParcel;
        sye sye = this.d;
        sug sug = sye.c;
        if (sug == null) {
            sye.E().c.a("Discarding data. Failed to set user property");
            return;
        }
        if (!this.a) {
            userAttributeParcel = this.b;
        } else {
            userAttributeParcel = null;
        }
        sye.a(sug, userAttributeParcel, this.c);
        this.d.q();
    }
}
