package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: zrt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zrt {
    public final gsa a;

    public zrt(Context context) {
        this.a = new gsa(context);
    }

    public final acwa a() {
        return acws.a((Executor) new jfz(1, 9), (Callable) new zrs(this));
    }
}
