package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdd.FileGroupResponse;

/* renamed from: rww  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rww extends bhv implements rwy {
    public rww(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mdd.IMddFileGroupCallback");
    }

    public final void a(Status status, FileGroupResponse fileGroupResponse) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) fileGroupResponse);
        c(1, aQ);
    }
}
