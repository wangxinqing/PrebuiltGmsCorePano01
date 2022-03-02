package defpackage;

import android.content.Context;

/* renamed from: uap  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uap {
    public final arxg a;
    public final tsu b;
    private final jiq c;

    public uap(Context context) {
        this.a = (arxg) thl.a(context, arxg.class);
        this.c = (jiq) thl.a(context, jiq.class);
        this.b = (tsu) thl.a(context, tsu.class);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.a.a(0);
        this.a.a(c());
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return this.a.g() || this.a.c().getLong("KEY_NOTIFICATION_ALLOWED_AT_TIMESTAMP_SECONDS", 0) <= c();
    }

    public final long c() {
        return this.c.a() / 1000;
    }
}
