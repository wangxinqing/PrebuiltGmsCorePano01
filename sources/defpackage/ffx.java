package defpackage;

import java.util.Arrays;

/* renamed from: ffx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ffx implements ibj, ibl {
    public final String a;

    public ffx(String str) {
        this.a = str;
    }

    public static ffw a(String str) {
        return new ffw(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ffx) {
            return ius.a(this.a, ((ffx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
