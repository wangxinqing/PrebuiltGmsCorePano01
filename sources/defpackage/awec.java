package defpackage;

import java.util.concurrent.ExecutionException;

/* renamed from: awec  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awec extends awee {
    private final Throwable a;

    public final Object a() {
        throw new ExecutionException(this.a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof awec) {
            return this.a.equals(((awec) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String canonicalName = this.a.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22);
        sb.append("Produced[failed with ");
        sb.append(canonicalName);
        sb.append("]");
        return sb.toString();
    }

    public awec(Throwable th) {
        amrl.a((Object) th);
        this.a = th;
    }
}
