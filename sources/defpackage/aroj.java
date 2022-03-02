package defpackage;

import java.util.Locale;

/* renamed from: aroj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aroj {
    public final int a;
    public final int b;

    public aroj(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final String toString() {
        return String.format(Locale.US, "Type=%d(0x%X), Version=%d(0x%X)", new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.b)});
    }
}
