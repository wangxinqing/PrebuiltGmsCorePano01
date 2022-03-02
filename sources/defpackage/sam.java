package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.MdhFootprintsReadResult;

/* renamed from: sam  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sam extends bhw implements san {
    final /* synthetic */ acwd a;

    public sam() {
        super("com.google.android.gms.mdh.internal.IMdhFootprintsReadResultCallback");
    }

    public final void a(Status status, MdhFootprintsReadResult mdhFootprintsReadResult) {
        ihd.a(status, mdhFootprintsReadResult, this.a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sam(acwd acwd) {
        super("com.google.android.gms.mdh.internal.IMdhFootprintsReadResultCallback");
        this.a = acwd;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a((Status) bhx.a(parcel, Status.CREATOR), (MdhFootprintsReadResult) bhx.a(parcel, MdhFootprintsReadResult.CREATOR));
        return true;
    }
}
