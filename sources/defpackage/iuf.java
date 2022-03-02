package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: iuf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iuf extends bhv implements iuh {
    public iuf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISharedPreferencesService");
    }

    public final Bundle a(String str, int i, Bundle bundle) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        aQ.writeInt(0);
        bhx.a(aQ, (Parcelable) bundle);
        Parcel a = a(1, aQ);
        Bundle bundle2 = (Bundle) bhx.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle2;
    }
}
