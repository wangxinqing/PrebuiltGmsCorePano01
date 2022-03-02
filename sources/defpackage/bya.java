package defpackage;

import com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation;
import java.util.Arrays;

/* renamed from: bya  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bya {
    public final String a;
    public final long b;
    public final long c;

    private bya(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public static bya a(UpdateFenceOperation updateFenceOperation) {
        return new bya(updateFenceOperation.f, updateFenceOperation.g, updateFenceOperation.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bya) {
            return this.a.equals(((bya) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("fenceKey", this.a);
        a2.a("resp", Long.valueOf(this.b));
        a2.a("ttl", Long.valueOf(this.c));
        return a2.toString();
    }
}
