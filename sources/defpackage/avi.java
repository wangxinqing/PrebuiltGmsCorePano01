package defpackage;

import java.util.Arrays;

/* renamed from: avi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avi {
    public final Object a;
    public final Throwable b;

    public avi(Object obj) {
        this.a = obj;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof avi) {
            avi avi = (avi) obj;
            Object obj2 = this.a;
            if (obj2 != null && obj2.equals(avi.a)) {
                return true;
            }
            Throwable th = this.b;
            if (!(th == null || avi.b == null)) {
                return th.toString().equals(this.b.toString());
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public avi(Throwable th) {
        this.b = th;
        this.a = null;
    }
}
