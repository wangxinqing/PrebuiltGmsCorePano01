package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: cpw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cpw extends bhv implements IInterface {
    public cpw(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.installapi.IPlayInstallService");
    }

    public final Bundle a(String str, String str2, Bundle bundle) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        aQ.writeString(str2);
        bhx.a(aQ, (Parcelable) bundle);
        Parcel a = a(1, aQ);
        Bundle bundle2 = (Bundle) bhx.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle2;
    }
}
