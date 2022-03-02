package defpackage;

import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: igf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class igf {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    public static igc a(Object obj, String str) {
        iva.a(obj, (Object) "Listener must not be null");
        iva.a((Object) str, (Object) "Listener type must not be null");
        iva.a(str, (Object) "Listener type must not be empty");
        return new igc(obj, str);
    }

    public static ige a(Object obj, Looper looper, String str) {
        iva.a(obj, (Object) "Listener must not be null");
        iva.a((Object) looper, (Object) "Looper must not be null");
        iva.a((Object) str, (Object) "Listener type must not be null");
        return new ige(looper, obj, str);
    }
}
