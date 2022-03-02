package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: noq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class noq implements Callable {
    private final nou a;

    public noq(nou nou) {
        this.a = nou;
    }

    public final Object call() {
        Context context = this.a.a;
        return nod.a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }
}
