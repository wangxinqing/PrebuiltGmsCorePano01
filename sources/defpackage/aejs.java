package defpackage;

import android.content.Context;
import com.google.android.libraries.bluetooth.BluetoothGattException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

/* renamed from: aejs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aejs {
    public static final String a = aejs.class.getSimpleName();
    public static final long b = TimeUnit.SECONDS.toMillis(1);
    public final Object c = new Object();
    public final aekc d = new aejq(this);
    public final aekl e = new aekl(5);
    public final Context f;
    public final aekd g;
    public final aeju h;
    public volatile aejh i = null;
    public volatile aeka j = null;
    final ConcurrentMap k = new ConcurrentHashMap();

    public aejs(Context context, aekd aekd) {
        amrl.a((Object) context);
        amrl.a((Object) aekd);
        aeju aeju = new aeju();
        this.f = context;
        this.g = aekd;
        this.h = aeju;
    }

    public final aejn a(aejw aejw) {
        aejn aejn = (aejn) this.k.get(aejw);
        if (aejn != null) {
            return aejn;
        }
        throw new BluetoothGattException(String.format("Received operation on an unknown device: %s", new Object[]{aejw}), 257);
    }
}
