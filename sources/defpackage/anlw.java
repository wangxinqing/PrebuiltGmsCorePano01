package defpackage;

import java.io.Serializable;

/* renamed from: anlw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anlw implements Serializable {
    private static final long serialVersionUID = 0;
    private final String a;
    private final int b;
    private final String c;

    public anlw(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    private Object readResolve() {
        return new anlx(this.a, this.b, this.c);
    }
}
