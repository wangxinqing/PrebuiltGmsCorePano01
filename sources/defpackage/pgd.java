package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.FootprintsRecordingSetting;
import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.MdhFootprint;
import com.google.android.gms.mdh.SyncStatus;
import com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable;
import java.util.Arrays;

/* renamed from: pgd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pgd implements sah {
    private final awdn a;
    private final int b;
    private final byte[] c;
    private FootprintsRecordingSetting d;
    private final sae e;

    public pgd(awdn awdn, sae sae, int i, byte[] bArr) {
        this.a = awdn;
        this.e = sae;
        this.b = i;
        this.c = bArr;
    }

    private final FootprintsRecordingSetting a(MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
        for (MdhFootprint mdhFootprint : mdhFootprintListSafeParcelable.a) {
            if (Arrays.equals(this.c, mdhFootprint.b)) {
                try {
                    aulx a2 = aeuz.a(mdhFootprint.a);
                    return new FootprintsRecordingSetting(this.b, a2.a, a2.b, mdhFootprint.c);
                } catch (auda e2) {
                    ((pdg) this.a.a()).a("MDH Proto exception while parsing RecordingSettings", e2);
                    return null;
                }
            }
        }
        return null;
    }

    public final IBinder asBinder() {
        return this.e.a;
    }

    public final void a(ifu ifu, LatestFootprintFilter latestFootprintFilter, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
        synchronized (this.e) {
            this.d = a(mdhFootprintListSafeParcelable);
            ifu.a(Status.a);
        }
    }

    public final void a(ifu ifu, SyncStatus syncStatus) {
        synchronized (this.e) {
            sae sae = this.e;
            FootprintsRecordingSetting footprintsRecordingSetting = this.d;
            Parcel aQ = sae.aQ();
            bhx.a(aQ, (IInterface) ifu);
            bhx.a(aQ, (Parcelable) footprintsRecordingSetting);
            bhx.a(aQ, (Parcelable) syncStatus);
            sae.c(1, aQ);
        }
    }

    public final void a(ifu ifu, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
        synchronized (this.e) {
            this.d = a(mdhFootprintListSafeParcelable);
            ifu.a(Status.a);
        }
    }
}
