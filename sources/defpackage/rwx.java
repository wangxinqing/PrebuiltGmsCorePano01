package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdd.FileGroupResponse;

/* renamed from: rwx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rwx extends bhw implements rwy {
    final /* synthetic */ acwd a;

    public rwx() {
        super("com.google.android.gms.mdd.IMddFileGroupCallback");
    }

    public final void a(Status status, FileGroupResponse fileGroupResponse) {
        ihd.a(status, fileGroupResponse, this.a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rwx(acwd acwd) {
        super("com.google.android.gms.mdd.IMddFileGroupCallback");
        this.a = acwd;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a((Status) bhx.a(parcel, Status.CREATOR), (FileGroupResponse) bhx.a(parcel, FileGroupResponse.CREATOR));
        return true;
    }
}
