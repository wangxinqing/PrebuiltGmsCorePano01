package defpackage;

import java.util.Arrays;

/* renamed from: amit  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amit {
    public static final amit a = new amit();
    public int b = 0;
    public int c = 0;
    public String d = "";

    private amit() {
    }

    public static amis a() {
        return new amis();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amit) {
            amit amit = (amit) obj;
            return alyr.a(Integer.valueOf(this.b), Integer.valueOf(amit.b)) && alyr.a(Integer.valueOf(this.c), Integer.valueOf(amit.c)) && alyr.a(this.d, amit.d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), Integer.valueOf(this.b), this.d});
    }

    public amit(amis amis) {
        this.b = amis.a;
        this.c = amis.b;
        this.d = amis.c;
    }
}
