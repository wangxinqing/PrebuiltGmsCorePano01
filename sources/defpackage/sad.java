package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: sad  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sad extends bhv implements IInterface {
    public sad(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mdh.internal.IByteArrayCallback");
    }

    public final void a(Status status, byte[] bArr) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        aQ.writeByteArray(bArr);
        c(1, aQ);
    }
}
