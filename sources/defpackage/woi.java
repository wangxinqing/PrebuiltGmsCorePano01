package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: woi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class woi implements Callable {
    private final String a;
    private final Context b;

    public woi(String str, Context context) {
        this.a = str;
        this.b = context;
    }

    public final Object call() {
        String str = this.a;
        return new oq(str, eig.c(this.b, str));
    }
}
