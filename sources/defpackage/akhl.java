package defpackage;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;

/* renamed from: akhl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class akhl implements icm, ica {
    protected final icc a;

    public akhl(icc icc) {
        this.a = icc;
    }

    /* access modifiers changed from: protected */
    public abstract icf a();

    public final void a(int i) {
    }

    public final void g(Bundle bundle) {
        a().a(this, 10, TimeUnit.SECONDS);
    }

    public void a(icl icl) {
        this.a.b((ica) this);
    }
}
