package defpackage;

import android.content.Context;
import java.util.Collection;
import java.util.List;

/* renamed from: nys  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nys {
    private List a = amzy.h();
    private final nyr b;

    public nys(Context context) {
        this.b = new nyr(context);
    }

    public final synchronized List a() {
        return axlc.a.a().ak() ? this.b.a() : this.a;
    }

    public final synchronized void b() {
        this.a = amzy.h();
    }

    public final synchronized void a(List list) {
        this.a = amzy.a((Collection) list);
    }
}
