package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;

/* renamed from: jtw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jtw extends jws {
    final /* synthetic */ jtn a;
    final /* synthetic */ jtv b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jtw(icc icc, jtn jtn, jtv jtv) {
        super(icc);
        this.a = jtn;
        this.b = jtv;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        ((jwu) ibf).a(this, (ContextDataFilterImpl) this.a, this.b, (PendingIntent) null);
    }
}
