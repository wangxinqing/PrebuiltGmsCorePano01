package defpackage;

import java.util.Arrays;

/* renamed from: bxu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bxu {
    public final bzm a;
    public final bwa b;
    public final boolean c;

    public bxu(bzm bzm, bwa bwa, boolean z) {
        this.a = bzm;
        this.b = bwa;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bxu) {
            bxu bxu = (bxu) obj;
            return this.a.equals(bxu.a) && this.b.equals(bxu.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("fncReg", this.a);
        a2.a("consK", this.b);
        a2.a("isExisting", Boolean.valueOf(this.c));
        return a2.toString();
    }
}
