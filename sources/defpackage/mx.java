package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: mx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mx implements Callable {
    final /* synthetic */ Context a;
    final /* synthetic */ mw b;
    final /* synthetic */ int c;
    final /* synthetic */ String d;

    public mx(Context context, mw mwVar, int i, String str) {
        this.a = context;
        this.b = mwVar;
        this.c = i;
        this.d = str;
    }

    /* renamed from: a */
    public final nd call() {
        nd a2 = ne.a(this.a, this.b, this.c);
        if (a2.a != null) {
            ne.a.a((Object) this.d, (Object) a2.a);
        }
        return a2;
    }
}
