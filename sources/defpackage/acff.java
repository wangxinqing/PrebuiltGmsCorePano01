package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: acff  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class acff extends bhw implements acfg {
    public acff() {
        super("com.google.android.gms.smartdevice.directtransfer.internal.IDirectTransferCallback");
    }

    public void a(Status status) {
        throw null;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a((Status) bhx.a(parcel, Status.CREATOR));
        return true;
    }
}
