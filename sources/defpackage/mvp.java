package defpackage;

import android.content.Context;
import android.os.Bundle;

/* renamed from: mvp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mvp implements myb {
    private final mvr a;
    private final long b;
    private final Bundle c;

    public mvp(mvr mvr, long j, Bundle bundle) {
        this.a = mvr;
        this.b = j;
        this.c = bundle;
    }

    public final void a(Object obj) {
        Context context = (Context) obj;
        ofx.a(this.b, this.c, context, this.a.a());
    }
}
