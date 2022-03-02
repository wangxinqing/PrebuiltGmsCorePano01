package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: opm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class opm extends bhv implements opo {
    public opm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.http.IGoogleHttpService");
    }

    public final Bundle a(String str) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        Parcel a = a(1, aQ);
        Bundle bundle = (Bundle) bhx.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final void a(String str, int i) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        aQ.writeInt(i);
        b(2, aQ);
    }
}
