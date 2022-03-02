package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.beacon.BleSettings;

/* renamed from: gup  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gup extends bhv implements IInterface {
    public gup(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.beacon.internal.IBleService");
    }

    public final void a(ifu ifu, guo guo) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        bhx.a(aQ, (IInterface) guo);
        b(2, aQ);
    }

    public final void a(ifu ifu, guo guo, BleSettings bleSettings) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        bhx.a(aQ, (IInterface) guo);
        bhx.a(aQ, (Parcelable) bleSettings);
        b(1, aQ);
    }
}
