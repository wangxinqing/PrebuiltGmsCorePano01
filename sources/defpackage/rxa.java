package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdd.FileGroupWithDownloadStatus;
import java.util.List;

/* renamed from: rxa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rxa extends bhw implements rxb {
    final /* synthetic */ acwd a;

    public rxa() {
        super("com.google.android.gms.mdd.IMddFileGroupWithDownloadStatusCallback");
    }

    public final void a(Status status, List list) {
        ihd.a(status, list, this.a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rxa(acwd acwd) {
        super("com.google.android.gms.mdd.IMddFileGroupWithDownloadStatusCallback");
        this.a = acwd;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a((Status) bhx.a(parcel, Status.CREATOR), parcel.createTypedArrayList(FileGroupWithDownloadStatus.CREATOR));
        return true;
    }
}
