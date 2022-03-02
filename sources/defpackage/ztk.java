package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ztk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ztk {
    private static final Map a = new HashMap();

    static synchronized ztj a(Context context, String str) {
        ztj ztj;
        synchronized (ztk.class) {
            ztj = (ztj) a.get(str);
            if (ztj == null) {
                ztj = new ztj(context, str);
                a.put(str, ztj);
            }
        }
        return ztj;
    }
}
