package defpackage;

import android.content.Intent;
import java.util.concurrent.Callable;

/* renamed from: iju  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class iju implements Callable {
    private final ijv a;
    private final Intent b;

    public iju(ijv ijv, Intent intent) {
        this.a = ijv;
        this.b = intent;
    }

    public final Object call() {
        this.a.a(this.b);
        return null;
    }
}
