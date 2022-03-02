package defpackage;

import com.google.android.gms.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: lqt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lqt {
    public static final lqs a = new lqx("title");
    public static final lqs b = new lqn("modifiedDate", R.string.drive_menu_sort_last_modified, true, liy.b, lqv.a);
    static final lqs c = new lqn("modifiedByMeDate", R.string.drive_menu_sort_last_modified_by_me, true, liy.c, lqv.b);
    static final lqs d = new lqn("openedByMeDate", R.string.drive_menu_sort_last_opened_by_me, true, liy.d, lqv.c);
    static final lqs e;
    private static final lqs[] f;
    private static final Map g;

    static {
        lqn lqn = new lqn("sharedDate", R.string.drive_menu_sort_share_date, false, liy.e, lqv.d);
        e = lqn;
        f = new lqs[]{a, b, c, d, lqn};
        HashMap hashMap = new HashMap();
        lqs[] lqsArr = f;
        int length = lqsArr.length;
        for (int i = 0; i < 5; i++) {
            lqs lqs = lqsArr[i];
            if (((lqs) hashMap.put(lqs.a(), lqs)) != null) {
                String valueOf = String.valueOf(lqs.a());
                throw new IllegalStateException(valueOf.length() == 0 ? new String("Duplicate SortOption identifier: ") : "Duplicate SortOption identifier: ".concat(valueOf));
            }
        }
        g = Collections.unmodifiableMap(hashMap);
    }

    public static lqs a(String str) {
        iva.a((Object) str);
        return (lqs) g.get(str);
    }
}
