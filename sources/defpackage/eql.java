package defpackage;

import android.content.Context;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.common.api.Status;

/* renamed from: eql  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eql extends nis {
    private final ifu a;
    private final ClearTokenRequest b;

    public eql(ifu ifu, ClearTokenRequest clearTokenRequest) {
        super(224, "ClearTokenGoogleAuthOperation");
        this.a = ifu;
        this.b = clearTokenRequest;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        qub a2 = qub.a(context);
        a2.b("com.google", this.b.b);
        a2.b("cn.google", this.b.b);
        this.a.a(Status.a);
    }

    public final void a(Status status) {
        this.a.a(status);
    }
}
