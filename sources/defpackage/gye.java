package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: gye  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gye extends bhw implements gyf {
    final /* synthetic */ acwd a;

    public gye() {
        super("com.google.android.gms.checkin.internal.ICheckinApiCallbacks");
    }

    public final void a(Status status, String str) {
        ihd.a(status, str, this.a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gye(acwd acwd) {
        super("com.google.android.gms.checkin.internal.ICheckinApiCallbacks");
        this.a = acwd;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 5) {
            return false;
        }
        a((Status) bhx.a(parcel, Status.CREATOR), parcel.readString());
        return true;
    }
}
