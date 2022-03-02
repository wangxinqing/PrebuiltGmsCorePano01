package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.model.posts.Settings;

/* renamed from: yvx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yvx extends irq {
    private final ConnectionResult a;
    private final Settings b;

    public yvx(ywg ywg, yur yur, ConnectionResult connectionResult, Settings settings) {
        super(ywg, yur);
        this.a = connectionResult;
        this.b = settings;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((yur) obj).a(this.a, this.b);
    }

    /* access modifiers changed from: protected */
    public final void b() {
    }
}
