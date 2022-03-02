package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.d2d.AccountTransferResult;

/* renamed from: abwu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abwu extends bhv implements IInterface {
    public abwu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.smartdevice.d2d.internal.IDirectTransferListener");
    }

    public final void a(int i, String str) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        aQ.writeString(str);
        b(3, aQ);
    }

    public final void a(PendingIntent pendingIntent) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) pendingIntent);
        b(2, aQ);
    }

    public final void a(AccountTransferResult[] accountTransferResultArr) {
        Parcel aQ = aQ();
        aQ.writeTypedArray(accountTransferResultArr, 0);
        b(1, aQ);
    }
}
