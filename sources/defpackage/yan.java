package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: yan  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yan {
    private static final anax b = anax.a(6L, 13L, 14L, 15L);
    private static final amzy c = amzy.a("family", "coworkers", "friends");
    public final Set a = new HashSet();

    public yan() {
        xip.a();
        if (((Boolean) xgf.a.a()).booleanValue()) {
            try {
                String c2 = ayrj.c();
                ArrayList arrayList = new ArrayList();
                if (!TextUtils.isEmpty(c2)) {
                    for (String parseLong : amsk.a(',').a((CharSequence) c2)) {
                        long parseLong2 = Long.parseLong(parseLong, 16);
                        anax anax = b;
                        Long valueOf = Long.valueOf(parseLong2);
                        if (!anax.contains(valueOf)) {
                            arrayList.add(valueOf);
                        }
                    }
                }
                this.a.addAll(arrayList);
            } catch (NumberFormatException e) {
                xdt.b("FSA2_GroupSourceIdValidator", "Unable to parse group source ID black list %s", ayrj.c());
            }
        }
    }

    public static boolean a(String str) {
        try {
            Long.parseLong(str, 16);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean b(String str) {
        return c.contains(str);
    }

    public static boolean c(String str) {
        try {
            Long.parseLong(str, 16);
            return true;
        } catch (NumberFormatException e) {
            xdt.a("FSA2_GroupSourceIdValidator", "Unable to parse groupSourceId, treat as invalid: %s", str);
            return false;
        }
    }
}
