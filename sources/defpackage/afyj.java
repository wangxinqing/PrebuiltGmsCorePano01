package defpackage;

import java.util.Collections;
import java.util.Map;

/* renamed from: afyj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afyj implements amqy {
    private final afyl a;

    public afyj(afyl afyl) {
        this.a = afyl;
    }

    public final Object a(Object obj) {
        afys afys = (afys) obj;
        afys afys2 = this.a.c;
        aucd aucd = (aucd) afys.c(5);
        aucd.a((aucj) afys);
        Map b = afyt.b(afys2);
        for (Integer intValue : b.keySet()) {
            int intValue2 = intValue.intValue();
            int a2 = afyt.a(Collections.unmodifiableList(((afys) aucd.b).b), intValue2);
            if (a2 == -1) {
                aucd.a(afyt.a(intValue2));
            } else {
                aucd.a(a2, afyt.a(aucd.B(a2)));
            }
        }
        for (Map.Entry entry : b.entrySet()) {
            int intValue3 = ((Integer) entry.getKey()).intValue();
            Long l = (Long) entry.getValue();
            if (l != null) {
                int b2 = afyt.b(Collections.unmodifiableList(((afys) aucd.b).e), intValue3);
                if (b2 == -1) {
                    long longValue = l.longValue();
                    aucd.a(afyt.a(intValue3, longValue, longValue));
                } else {
                    aucd.a(b2, afyt.a(aucd.C(b2), l.longValue()));
                }
            }
        }
        return (afys) aucd.i();
    }
}
