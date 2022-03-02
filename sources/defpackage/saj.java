package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable;
import java.util.List;

/* renamed from: saj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class saj extends bhw implements sak {
    final /* synthetic */ acwd a;

    public saj() {
        super("com.google.android.gms.mdh.internal.IMdhFootprintsListCallback");
    }

    public final void a(Status status, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
        List list;
        if (status.c()) {
            list = mdhFootprintListSafeParcelable.a;
        } else {
            list = null;
        }
        ihd.a(status, list, this.a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public saj(acwd acwd) {
        super("com.google.android.gms.mdh.internal.IMdhFootprintsListCallback");
        this.a = acwd;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a((Status) bhx.a(parcel, Status.CREATOR), (MdhFootprintListSafeParcelable) bhx.a(parcel, MdhFootprintListSafeParcelable.CREATOR));
        return true;
    }
}
