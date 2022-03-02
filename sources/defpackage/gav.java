package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.cryptauth.SignCryptedBlob;
import com.google.android.gms.common.api.Status;

/* renamed from: gav  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gav extends bhw implements IInterface {
    final /* synthetic */ gai a;

    public gav() {
        super("com.google.android.gms.auth.cryptauth.internal.ISignCryptResultCallback");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            this.a.a((Object) (SignCryptedBlob) bhx.a(parcel, SignCryptedBlob.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            this.a.a((Status) bhx.a(parcel, Status.CREATOR));
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gav(gai gai) {
        super("com.google.android.gms.auth.cryptauth.internal.ISignCryptResultCallback");
        this.a = gai;
    }
}
