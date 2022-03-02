package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.drive.realtime.internal.ParcelableCollaborator;

/* renamed from: alod  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alod implements alpk {
    final /* synthetic */ aloe a;

    public alod(aloe aloe) {
        this.a = aloe;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        alxk alxk;
        kem kem;
        aloe aloe = this.a;
        String str = ((alxj) obj).a;
        synchronized (aloe.a) {
            alxk = (alxk) aloe.a.remove(str);
        }
        if (alxk != null && (kem = aloe.b) != null) {
            try {
                lmb lmb = kem.a;
                ParcelableCollaborator a2 = keo.a(alxk);
                Parcel aQ = lmb.aQ();
                bhx.a(aQ, (Parcelable) a2);
                lmb.b(2, aQ);
            } catch (RemoteException e) {
            }
        }
    }
}
