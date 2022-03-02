package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: eom  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eom extends bhv implements IInterface {
    public eom(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IBundleCallback");
    }

    public final void a(Status status, Bundle bundle) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) bundle);
        c(2, aQ);
    }
}
