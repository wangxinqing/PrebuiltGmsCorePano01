package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: auo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class auo implements Callable {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;

    public auo(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return aus.c(this.a, this.b);
    }
}
