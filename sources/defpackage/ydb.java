package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ydb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ydb {
    private static final Map a = new HashMap();

    public static synchronized yda a(Context context, String str) {
        yda yda;
        synchronized (ydb.class) {
            yda = (yda) a.get(str);
            if (yda == null) {
                yda = new yda(context, str);
                a.put(str, yda);
            }
        }
        return yda;
    }
}
