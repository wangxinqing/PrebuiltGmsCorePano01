package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.clearcut.b;
import java.util.concurrent.Callable;

/* renamed from: nnr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class nnr implements Callable {
    private final Context a;

    public nnr(Context context) {
        this.a = context;
    }

    public final Object call() {
        return new b(this.a, "GLAS");
    }
}
