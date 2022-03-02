package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: eos  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eos extends bhv implements IInterface {
    public eos(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGetAccountIdCallback");
    }

    public final void a(Status status, String str) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        aQ.writeString(str);
        c(2, aQ);
    }
}
