package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ardr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ardr {
    public final List a;
    public final long b;

    public ardr(List list, long j) {
        ArrayList arrayList = new ArrayList(list);
        this.a = arrayList;
        Collections.sort(arrayList, Collections.reverseOrder(ardq.c));
        this.b = j;
    }

    public final boolean a() {
        return !this.a.isEmpty();
    }

    public final ardq b() {
        if (a()) {
            return (ardq) this.a.get(0);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ardr) {
            ardr ardr = (ardr) obj;
            if (!this.a.equals(ardr.a) || this.b != ardr.b) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }
}
