package defpackage;

/* renamed from: ybu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ybu {
    public static final ybu a = new ybu(false, -1);
    public final boolean b;
    public final int c;

    public ybu(boolean z, int i) {
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ybu) {
            ybu ybu = (ybu) obj;
            if (this.b == ybu.b && this.c == ybu.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        return (i + i) | this.b ? 1 : 0;
    }
}
