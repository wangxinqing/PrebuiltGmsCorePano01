package defpackage;

/* renamed from: auej  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class auej implements audu {
    public final audx a;
    public final String b;
    public final Object[] c;
    private final int d;

    public auej(audx audx, String str, Object[] objArr) {
        char charAt;
        this.a = audx;
        this.b = str;
        this.c = objArr;
        char charAt2 = str.charAt(0);
        if (charAt2 >= 55296) {
            char c2 = charAt2 & 8191;
            int i = 13;
            int i2 = 1;
            while (true) {
                int i3 = i2 + 1;
                charAt = str.charAt(i2);
                if (charAt < 55296) {
                    break;
                }
                c2 |= (charAt & 8191) << i;
                i += 13;
                i2 = i3;
            }
            charAt2 = c2 | (charAt << i);
        }
        this.d = charAt2;
    }

    public final boolean a() {
        return (this.d & 2) == 2;
    }

    public final audx b() {
        return this.a;
    }

    public final int c() {
        return (this.d & 1) != 1 ? 2 : 1;
    }
}
