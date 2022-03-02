package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: maq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class maq {
    public final Map a = Collections.synchronizedMap(new HashMap());

    public final Object a(Object obj) {
        return this.a.get(obj);
    }
}
