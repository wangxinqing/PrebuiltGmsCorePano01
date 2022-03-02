package defpackage;

import android.nfc.Tag;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: myw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class myw extends bhv implements IInterface {
    public myw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.common.nfc.INfcReaderCallback");
    }

    public final void a(Tag tag) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) tag);
        b(1, aQ);
    }
}
