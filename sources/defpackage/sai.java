package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable;

/* renamed from: sai  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sai extends bhv implements sak {
    public sai(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mdh.internal.IMdhFootprintsListCallback");
    }

    public final void a(Status status, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) mdhFootprintListSafeParcelable);
        c(1, aQ);
    }
}
