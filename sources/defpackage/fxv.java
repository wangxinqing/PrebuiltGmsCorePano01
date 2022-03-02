package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: fxv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fxv extends bhv implements fxx {
    public fxv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.appcert.IAppCertService");
    }

    public final String a(String str) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        Parcel a = a(2, aQ);
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final boolean b() {
        Parcel a = a(1, aQ());
        boolean a2 = bhx.a(a);
        a.recycle();
        return a2;
    }
}
