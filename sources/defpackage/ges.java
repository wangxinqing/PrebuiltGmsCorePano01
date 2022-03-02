package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: ges  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ges extends bhw implements IInterface {
    final /* synthetic */ acwd a;

    public ges() {
        super("com.google.android.gms.auth.folsom.internal.IKeyRetrievalSyncStatusCallback");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ges(acwd acwd) {
        super("com.google.android.gms.auth.folsom.internal.IKeyRetrievalSyncStatusCallback");
        this.a = acwd;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        ihd.a((Status) bhx.a(parcel, Status.CREATOR), Integer.valueOf(parcel.readInt()), this.a);
        return true;
    }
}
