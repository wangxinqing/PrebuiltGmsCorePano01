package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: geq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class geq extends bhw implements IInterface {
    final /* synthetic */ acwd a;

    public geq() {
        super("com.google.android.gms.auth.folsom.internal.IKeyRetrievalConsentCallback");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public geq(acwd acwd) {
        super("com.google.android.gms.auth.folsom.internal.IKeyRetrievalConsentCallback");
        this.a = acwd;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        bhx.a(parcel);
        ihd.a((Status) bhx.a(parcel, Status.CREATOR), this.a);
        return true;
    }
}
