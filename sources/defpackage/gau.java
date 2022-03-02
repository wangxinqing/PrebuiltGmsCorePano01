package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.cryptauth.CryptauthPublicKey;
import com.google.android.gms.common.api.Status;

/* renamed from: gau  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gau extends bhw implements IInterface {
    final /* synthetic */ gah a;

    public gau() {
        super("com.google.android.gms.auth.cryptauth.internal.IRetrievePublicKeyCallback");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            this.a.a((Object) (CryptauthPublicKey) bhx.a(parcel, CryptauthPublicKey.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            this.a.a((Status) bhx.a(parcel, Status.CREATOR));
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gau(gah gah) {
        super("com.google.android.gms.auth.cryptauth.internal.IRetrievePublicKeyCallback");
        this.a = gah;
    }
}
