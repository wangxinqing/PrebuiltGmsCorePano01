package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: aya  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aya implements axz {
    public final List a;

    public aya(Object obj) {
        this(Collections.singletonList(new bbc(obj)));
    }

    public final List b() {
        return this.a;
    }

    public final boolean c() {
        return this.a.isEmpty() || (this.a.size() == 1 && ((bbc) this.a.get(0)).d());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.a.toArray()));
        }
        return sb.toString();
    }

    public aya(List list) {
        this.a = list;
    }
}
