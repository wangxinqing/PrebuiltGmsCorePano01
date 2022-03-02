package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity;

/* renamed from: ywf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ywf extends irq {
    private final ConnectionResult a;
    private final UpgradeAccountEntity b;

    public ywf(ywg ywg, yuu yuu, ConnectionResult connectionResult, UpgradeAccountEntity upgradeAccountEntity) {
        super(ywg, yuu);
        this.a = connectionResult;
        this.b = upgradeAccountEntity;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((yuu) obj).a(this.a, this.b);
    }

    /* access modifiers changed from: protected */
    public final void b() {
    }
}
