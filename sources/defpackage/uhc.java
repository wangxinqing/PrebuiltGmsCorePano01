package defpackage;

import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.OnStartAdvertisingResultParams;

/* renamed from: uhc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class uhc extends bhw implements uhd {
    public uhc() {
        super("com.google.android.gms.nearby.internal.connection.IStartAdvertisingResultListener");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        a((OnStartAdvertisingResultParams) bhx.a(parcel, OnStartAdvertisingResultParams.CREATOR));
        return true;
    }
}
