package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.internal.model.apps.AppAclsEntity;

/* renamed from: yvd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yvd extends irq {
    private final ConnectionResult a;
    private final AppAclsEntity b;

    public yvd(ywg ywg, yul yul, ConnectionResult connectionResult, AppAclsEntity appAclsEntity) {
        super(ywg, yul);
        this.a = connectionResult;
        this.b = appAclsEntity;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((yul) obj).a(this.a, this.b);
    }

    /* access modifiers changed from: protected */
    public final void b() {
    }
}
