package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: tea  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tea extends bhw implements teb {
    private final idg a;

    public tea() {
        super("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback");
    }

    public static tea a(idg idg) {
        return new tea(idg);
    }

    public final void a(Status status) {
        this.a.a((Object) status);
    }

    private tea(idg idg) {
        super("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback");
        this.a = idg;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a((Status) bhx.a(parcel, Status.CREATOR));
        return true;
    }
}
