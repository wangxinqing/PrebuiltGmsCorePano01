package defpackage;

import android.os.Parcel;

/* renamed from: allm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class allm extends bhw implements alln {
    public allm() {
        super("com.google.android.vending.verifier.IListHarmfulAppsCallback");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a(bhx.a(parcel), parcel.createByteArray());
        return true;
    }
}
