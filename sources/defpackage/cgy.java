package defpackage;

import java.util.Arrays;

/* renamed from: cgy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cgy {
    public final long a;
    public final int[] b = new int[cha.a.length];
    public final int[] c = new int[cha.a.length];

    public cgy(long j) {
        this.a = j;
    }

    public final boolean a(int i) {
        return this.b[i] > 0;
    }

    public final float b(int i) {
        if (a(i)) {
            return ((float) this.c[i]) / ((float) this.b[i]);
        }
        String valueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
        sb.append(valueOf);
        sb.append(" does not have frequency index ");
        sb.append(i);
        throw new IllegalArgumentException(String.valueOf(sb.toString()));
    }

    /* access modifiers changed from: package-private */
    public final float c(int i) {
        if (a(i)) {
            return b(i);
        }
        return -120.0f;
    }

    public final String toString() {
        long j = this.a;
        String arrays = Arrays.toString(this.b);
        String arrays2 = Arrays.toString(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 60 + String.valueOf(arrays2).length());
        sb.append("ApSample{address='");
        sb.append(j);
        sb.append("', counts=");
        sb.append(arrays);
        sb.append(", rssiSums=");
        sb.append(arrays2);
        sb.append("}");
        return sb.toString();
    }
}
