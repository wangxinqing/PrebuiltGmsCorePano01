package defpackage;

import java.util.Arrays;

/* renamed from: aafk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aafk implements ibj, ibl {
    public final String a;

    public aafk(aafj aafj) {
        this.a = aafj.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aafk) {
            return ius.a(this.a, ((aafk) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
