package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.firstparty.GetClientTokenResponse;

/* renamed from: adxo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adxo extends adxn {
    private final idg a;

    public final void a(Status status, GetClientTokenResponse getClientTokenResponse) {
        this.a.a((Object) new adxe(status, getClientTokenResponse));
    }

    public adxo(idg idg) {
        this.a = idg;
    }
}
