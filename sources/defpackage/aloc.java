package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.drive.realtime.internal.ParcelableCollaborator;

/* renamed from: aloc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aloc implements alpk {
    final /* synthetic */ aloe a;

    public aloc(aloe aloe) {
        this.a = aloe;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        alxk alxk;
        kem kem;
        aloe aloe = this.a;
        alxk alxk2 = ((alxi) obj).a;
        synchronized (aloe.a) {
            alxk = (alxk) aloe.a.put(alxk2.a, alxk2);
        }
        if (alxk == null && (kem = aloe.b) != null) {
            try {
                lmb lmb = kem.a;
                ParcelableCollaborator a2 = keo.a(alxk2);
                Parcel aQ = lmb.aQ();
                bhx.a(aQ, (Parcelable) a2);
                lmb.b(1, aQ);
            } catch (RemoteException e) {
            }
        }
    }
}
