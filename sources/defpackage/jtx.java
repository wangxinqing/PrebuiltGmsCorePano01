package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;

/* renamed from: jtx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jtx extends jws {
    final /* synthetic */ jtn a;
    final /* synthetic */ PendingIntent b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jtx(icc icc, jtn jtn, PendingIntent pendingIntent) {
        super(icc);
        this.a = jtn;
        this.b = pendingIntent;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        ((jwu) ibf).a(this, (ContextDataFilterImpl) this.a, (jtv) null, this.b);
    }
}
