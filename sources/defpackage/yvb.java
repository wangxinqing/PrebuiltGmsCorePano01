package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.internal.model.apps.AppAclsEntity;

/* renamed from: yvb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yvb extends irq {
    private final ConnectionResult a;
    private final AppAclsEntity b;

    public yvb(ywg ywg, yuk yuk, ConnectionResult connectionResult, AppAclsEntity appAclsEntity) {
        super(ywg, yuk);
        this.a = connectionResult;
        this.b = appAclsEntity;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((yuk) obj).b(this.a, this.b);
    }

    /* access modifiers changed from: protected */
    public final void b() {
    }
}
