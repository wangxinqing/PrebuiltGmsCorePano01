package defpackage;

import java.util.Map;

/* renamed from: sli  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sli {
    public final anaf a;

    public sli(Map map) {
        a(!map.containsKey(set.UNKNOWN), "Sync handlers can't be registered for the UNKNOWN operation!");
        this.a = anet.a(map);
    }

    public static void a(boolean z, String str) {
        if (!z) {
            throw new sle(str);
        }
    }
}
