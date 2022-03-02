package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.GetDefaultAccountResult;
import com.google.android.gms.common.api.Status;

/* renamed from: fti  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fti extends bhv implements ftk {
    public fti(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.IGetDefaultAccountCallback");
    }

    public final void a(Status status, GetDefaultAccountResult getDefaultAccountResult) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) getDefaultAccountResult);
        c(1, aQ);
    }
}
