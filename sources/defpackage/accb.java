package defpackage;

import android.content.Context;
import java.util.Map;

/* renamed from: accb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class accb {
    public static void a(Context context, Map map, String str) {
        String a = iqi.a(context);
        if (a != null) {
            map.put("device", a);
        }
        if (str != null) {
            map.put("app", str);
        }
    }
}
