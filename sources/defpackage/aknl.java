package defpackage;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;

/* renamed from: aknl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aknl implements icm, ica {
    private final String a;
    private final icc b;

    public aknl(icc icc, String str) {
        this.a = str;
        this.b = icc;
    }

    /* access modifiers changed from: protected */
    public abstract icf a();

    public final void a(int i) {
    }

    public final void g(Bundle bundle) {
        a().a(this, 10, TimeUnit.SECONDS);
    }

    public void a(icl icl) {
        this.b.b((ica) this);
        if (icl.aO().c()) {
            aklz.a();
            this.a.concat(" succeeded");
            return;
        }
        aklz.a();
        String str = this.a;
        String status = icl.aO().toString();
        StringBuilder sb = new StringBuilder(str.length() + 20 + String.valueOf(status).length());
        sb.append(str);
        sb.append(" failed with status ");
        sb.append(status);
        sb.toString();
    }
}
