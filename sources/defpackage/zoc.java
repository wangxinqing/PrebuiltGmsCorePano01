package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;

/* renamed from: zoc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zoc extends bhw implements zod {
    private final acwd a;

    public zoc() {
        super("com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks");
    }

    public final void a(Status status) {
        ihd.a(status, this.a);
    }

    public final void a(Status status, long j) {
        ihd.a(status, Long.valueOf(j), this.a);
    }

    public zoc(acwd acwd) {
        super("com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks");
        this.a = acwd;
    }

    public final void a(Status status, PseudonymousIdToken pseudonymousIdToken) {
        ihd.a(status, pseudonymousIdToken, this.a);
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a((Status) bhx.a(parcel, Status.CREATOR), (PseudonymousIdToken) bhx.a(parcel, PseudonymousIdToken.CREATOR));
        } else if (i == 2) {
            a((Status) bhx.a(parcel, Status.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            a((Status) bhx.a(parcel, Status.CREATOR), parcel.readLong());
        }
        return true;
    }
}
