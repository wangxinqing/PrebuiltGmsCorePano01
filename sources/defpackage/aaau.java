package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: aaau  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaau extends bhw implements aaav {
    final /* synthetic */ acwd a;

    public aaau() {
        super("com.google.android.gms.scheduler.ISchedulerCallbacks");
    }

    public final void a(Status status) {
        ihd.a(status, (Object) null, this.a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aaau(acwd acwd) {
        super("com.google.android.gms.scheduler.ISchedulerCallbacks");
        this.a = acwd;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a((Status) bhx.a(parcel, Status.CREATOR));
        return true;
    }
}
