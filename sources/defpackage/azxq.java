package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: azxq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azxq {
    public static final azxl a = new azxn();

    public static azxi a(azxi azxi, List list) {
        amrl.a((Object) azxi, (Object) "channel");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            azxi = new azxp(azxi, (azxm) it.next());
        }
        return azxi;
    }

    public static azxi a(azxi azxi, azxm... azxmArr) {
        return a(azxi, Arrays.asList(azxmArr));
    }
}
