package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: ukh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ukh implements Callable {
    private final uki a;

    public ukh(uki uki) {
        this.a = uki;
    }

    public final Object call() {
        Object obj;
        uki uki = this.a;
        Context context = uki.a;
        String str = uki.b;
        url url = uki.c;
        int i = uki.d;
        if (aymi.F()) {
            obj = urc.a(context, str, url, i);
        } else {
            obj = ura.a(context, str, url);
        }
        if (obj != null) {
            return obj;
        }
        throw new RuntimeException(String.format("Failed to create an outgoing MultiplexBleSocket to %s.", new Object[]{uki.b}));
    }
}
