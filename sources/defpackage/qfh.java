package defpackage;

import java.util.HashSet;
import java.util.Set;

@Deprecated
/* renamed from: qfh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qfh {
    private static Set a;

    public static synchronized Set a() {
        Set set;
        synchronized (qfh.class) {
            if (a == null) {
                a = new HashSet();
                for (String parseInt : amsk.a(',').a((CharSequence) axuy.a.a().P())) {
                    a.add(Integer.valueOf(Integer.parseInt(parseInt)));
                }
            }
            set = a;
        }
        return set;
    }
}
