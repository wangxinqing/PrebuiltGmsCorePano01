package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: nsq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nsq extends bhv implements nss {
    public nsq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gcm.IGcmServiceDiagnostics");
    }

    public final List b() {
        Parcel a = a(1, aQ());
        ArrayList<String> createStringArrayList = a.createStringArrayList();
        a.recycle();
        return createStringArrayList;
    }

    public final String c() {
        Parcel a = a(2, aQ());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final String d() {
        Parcel a = a(3, aQ());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
