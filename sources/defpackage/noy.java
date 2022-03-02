package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: noy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class noy implements Callable {
    private final Context a;

    public noy(Context context) {
        this.a = context;
    }

    public final Object call() {
        return lxz.a(this.a, "msa-f", (Map) new HashMap());
    }
}
