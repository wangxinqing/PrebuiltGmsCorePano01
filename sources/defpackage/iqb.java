package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: iqb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iqb extends bhw implements iqc {
    final /* synthetic */ ipv a;

    public iqb() {
        super("com.google.android.gms.common.download.internal.IDownloadServiceCallbacks");
    }

    public final void a(Status status) {
        this.a.a((icl) status);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iqb(ipv ipv) {
        super("com.google.android.gms.common.download.internal.IDownloadServiceCallbacks");
        this.a = ipv;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a((Status) bhx.a(parcel, Status.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            this.a.a((icl) (Status) bhx.a(parcel, Status.CREATOR));
        }
        return true;
    }
}
