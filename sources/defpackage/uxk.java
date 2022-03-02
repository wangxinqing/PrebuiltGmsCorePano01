package defpackage;

import java.util.Arrays;

/* renamed from: uxk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uxk implements ibj, ibl {
    public final String a;
    public final boolean b;
    public final int c;
    public final String d = null;
    public final String e;

    public uxk(uxj uxj) {
        this.a = uxj.a;
        this.b = uxj.b;
        this.c = uxj.d;
        this.e = uxj.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uxk) {
            uxk uxk = (uxk) obj;
            if (ius.a(this.a, uxk.a) && this.b == uxk.b) {
                String str = uxk.d;
                return ius.a((Object) null, (Object) null) && ius.a(this.e, uxk.e) && this.c == uxk.c;
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b), null, this.e, Integer.valueOf(this.c)});
    }
}
