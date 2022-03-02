package defpackage;

import android.content.Context;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenResponse;
import com.google.android.gms.common.api.Status;

/* renamed from: eqm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eqm extends nis {
    private final ClearTokenRequest a;
    private final eqk b;
    private final eon c;

    public eqm(eon eon, eqk eqk, ClearTokenRequest clearTokenRequest) {
        super(153, "ClearToken");
        this.c = eon;
        this.a = clearTokenRequest;
        this.b = eqk;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        this.c.a(Status.a, this.b.a(context).a(this.a));
    }

    public final void a(Status status) {
        this.c.a(status, (ClearTokenResponse) null);
    }
}
