package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: allp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class allp extends bhw implements allq {
    public allp() {
        super("com.google.android.vending.verifier.IVerifyAppsDataCallback");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a(bhx.a(parcel), (Bundle) bhx.a(parcel, Bundle.CREATOR));
        return true;
    }
}
