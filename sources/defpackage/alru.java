package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: alru  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alru {
    public final int a;
    public final long b;
    public final List c;

    public alru(int i, long j, Collection collection) {
        boolean z;
        this.a = i;
        this.b = j;
        this.c = Collections.unmodifiableList(new ArrayList(collection));
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        alys.a(z, "revision must be non-negative");
        alys.a(j >= 0 ? true : z2, "request number must be non-negative");
        alys.a((Object) collection, "changes");
        alys.a(!collection.isEmpty(), "a change is required");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alru)) {
            return false;
        }
        alru alru = (alru) obj;
        return alyr.a(Integer.valueOf(this.a), Integer.valueOf(alru.a), Long.valueOf(this.b), Long.valueOf(alru.b), this.c, alru.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), this.c});
    }

    public final String toString() {
        int i = this.a;
        long j = this.b;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 80);
        sb.append("SaveRequest [revision=");
        sb.append(i);
        sb.append(", requestNumber=");
        sb.append(j);
        sb.append(", changes=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
