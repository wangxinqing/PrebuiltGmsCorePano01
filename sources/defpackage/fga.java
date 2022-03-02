package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: fga  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class fga extends bhw implements fgb {
    public fga() {
        super("com.google.android.gms.auth.api.credentials.internal.IBundleCallbacks");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a((Bundle) bhx.a(parcel, Bundle.CREATOR));
        return true;
    }
}
