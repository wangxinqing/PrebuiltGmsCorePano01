package defpackage;

import android.os.Parcel;
import com.google.android.gms.location.internal.FusedLocationProviderResult;

/* renamed from: rgd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class rgd extends bhw implements rge {
    public rgd() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a((FusedLocationProviderResult) bhx.a(parcel, FusedLocationProviderResult.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            a();
        }
        return true;
    }
}
