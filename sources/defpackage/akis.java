package defpackage;

import android.content.Context;
import java.util.List;

/* renamed from: akis  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akis {
    public final ikh a;
    public boolean b = false;
    private final ikd c;

    public akis(Context context, String str) {
        akiq akiq = new akiq();
        this.c = akiq;
        this.a = ikh.a(context, str, 4, akiq);
    }

    public final List a() {
        return this.a.d();
    }

    public final int b() {
        return this.a.d().size();
    }
}
