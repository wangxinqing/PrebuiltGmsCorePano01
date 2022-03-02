package defpackage;

/* renamed from: arnt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arnt {
    public final int a;
    public final int b;
    public final byte[] c;

    public arnt(int i, int i2, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
    }

    public final audx a(auef auef) {
        if (auef != null) {
            try {
                return (audx) auef.a(this.c);
            } catch (auda e) {
                new Object[1][0] = e;
            }
        }
        return null;
    }
}
