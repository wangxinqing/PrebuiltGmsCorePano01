package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: acfe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acfe extends bhv implements acfg {
    public acfe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.smartdevice.directtransfer.internal.IDirectTransferCallback");
    }

    public final void a(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        c(1, aQ);
    }
}
