package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.SyncStatus;
import com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable;

/* renamed from: saf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class saf extends bhv implements sah {
    public saf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mdh.internal.ILatestFootprintListener");
    }

    public final void a(ifu ifu, LatestFootprintFilter latestFootprintFilter, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        bhx.a(aQ, (Parcelable) latestFootprintFilter);
        bhx.a(aQ, (Parcelable) mdhFootprintListSafeParcelable);
        c(1, aQ);
    }

    public final void a(ifu ifu, SyncStatus syncStatus) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        bhx.a(aQ, (Parcelable) syncStatus);
        c(5, aQ);
    }

    public final void a(ifu ifu, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        bhx.a(aQ, (Parcelable) mdhFootprintListSafeParcelable);
        c(2, aQ);
    }
}
