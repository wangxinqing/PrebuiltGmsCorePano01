package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.firstparty.GetClientTokenResponse;

/* renamed from: adxe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adxe implements icl {
    public final GetClientTokenResponse a;
    private final Status b;

    public adxe(Status status, GetClientTokenResponse getClientTokenResponse) {
        this.b = status;
        this.a = getClientTokenResponse;
    }

    public final Status aO() {
        return this.b;
    }
}
