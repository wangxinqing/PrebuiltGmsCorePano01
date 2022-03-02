package defpackage;

import java.util.Arrays;

/* renamed from: dvg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dvg {
    public final String a;
    public final dvj[] b;

    public dvg(String str, dvj[] dvjArr) {
        this.a = str;
        int length = dvjArr.length;
        if (length != 0) {
            dvj[] dvjArr2 = new dvj[length];
            System.arraycopy(dvjArr, 0, dvjArr2, 0, length);
            this.b = dvjArr2;
            return;
        }
        throw new IllegalArgumentException("Must provide at least 1 CorpusTableMapping");
    }

    private final Object[] a() {
        return new Object[]{this.a, this.b};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof dvg)) {
            return false;
        }
        return Arrays.deepEquals(a(), ((dvg) obj).a());
    }

    public final int hashCode() {
        return Arrays.deepHashCode(a());
    }
}
