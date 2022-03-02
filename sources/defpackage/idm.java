package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: idm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class idm implements ice {
    private final qvn a;
    private final ice b;

    public idm(qvn qvn, ice ice) {
        this.a = qvn;
        this.b = ice;
    }

    public final void a(Status status) {
        this.a.a(new idn(this.b, status));
    }
}
