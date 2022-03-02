package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.MdhFootprintsReadResult;

/* renamed from: sal  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sal extends bhv implements san {
    public sal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mdh.internal.IMdhFootprintsReadResultCallback");
    }

    public final void a(Status status, MdhFootprintsReadResult mdhFootprintsReadResult) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) mdhFootprintsReadResult);
        c(1, aQ);
    }
}
