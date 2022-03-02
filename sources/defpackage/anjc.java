package defpackage;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: anjc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anjc {
    public static final anjc a = new anjc(Collections.unmodifiableSortedMap(new TreeMap()));
    public final SortedMap b;
    private Integer c = null;
    private String d = null;

    static {
        Collections.unmodifiableSortedSet(new TreeSet());
    }

    private anjc(SortedMap sortedMap) {
        this.b = sortedMap;
    }

    public final void a(aniq aniq) {
        for (Map.Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            Set<Object> set = (Set) entry.getValue();
            if (!set.isEmpty()) {
                for (Object a2 : set) {
                    ((anip) aniq).a(str, a2);
                }
            } else {
                ((anip) aniq).a(str, (Object) null);
            }
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof anjc) && ((anjc) obj).b.equals(this.b);
    }

    public final int hashCode() {
        if (this.c == null) {
            this.c = Integer.valueOf(this.b.hashCode());
        }
        return this.c.intValue();
    }

    public final String toString() {
        if (this.d == null) {
            StringBuilder sb = new StringBuilder();
            anip anip = new anip("[ ", " ]", sb);
            a(anip);
            anip.a();
            this.d = sb.toString();
        }
        return this.d;
    }
}
