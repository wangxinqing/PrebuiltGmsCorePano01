package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.facs.cache.FacsInternalSyncCallOptions;

/* renamed from: mfh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mfh extends bhv implements mfj {
    public mfh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.facs.cache.internal.IFacsInternalSyncService");
    }

    public final void a(mfg mfg, FacsInternalSyncCallOptions facsInternalSyncCallOptions) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) mfg);
        bhx.a(aQ, (Parcelable) facsInternalSyncCallOptions);
        b(1, aQ);
    }

    public final void a(mfg mfg, byte[] bArr, FacsInternalSyncCallOptions facsInternalSyncCallOptions) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) mfg);
        aQ.writeByteArray(bArr);
        bhx.a(aQ, (Parcelable) facsInternalSyncCallOptions);
        b(2, aQ);
    }
}
