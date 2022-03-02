package defpackage;

import android.content.Context;

/* renamed from: twh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class twh extends twf {
    private final aehx a;

    public twh(Context context, ttg ttg, aehx aehx) {
        super(context, ttg);
        this.a = aehx;
    }

    public final aspb a() {
        return aspb.REMOTE_PAIR_START;
    }

    public final aspb b() {
        return aspb.REMOTE_PAIR_END;
    }

    public final void a(Throwable th) {
        super.a(th);
        this.a.a(3, th.getMessage());
    }

    public final void b(String str) {
        super.b(str);
        this.a.a(2, "");
    }
}
