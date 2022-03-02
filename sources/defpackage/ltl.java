package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: ltl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ltl {
    public String a;

    public ltl(String str) {
        this.a = str;
    }

    /* access modifiers changed from: package-private */
    public final Object a(Map map) {
        String a2 = a((Set) ((anaf) map).keySet());
        if (a2 != null) {
            return map.get(a2);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final String a(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (this.a.startsWith(str)) {
                this.a = this.a.substring(str.length());
                return str;
            }
        }
        return null;
    }
}
