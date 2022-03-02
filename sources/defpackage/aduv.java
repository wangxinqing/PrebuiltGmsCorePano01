package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: aduv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aduv implements ibj {
    public final String a;
    public final String b;
    public final List c;

    public aduv(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aduv) {
            aduv aduv = (aduv) obj;
            return ius.a(this.b, aduv.b) && ius.a(this.a, aduv.a) && ius.a(this.c, aduv.c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c});
    }
}
