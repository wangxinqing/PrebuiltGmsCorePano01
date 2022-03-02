package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* renamed from: lcm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lcm extends lcp {
    public final Set a;

    public lcm(Set set) {
        super(lcr.APPDATA);
        this.a = set;
    }

    public final String a() {
        ArrayList arrayList = new ArrayList(this.a);
        Collections.sort(arrayList);
        return TextUtils.join(",", arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return ius.a(this.a, ((lcm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
