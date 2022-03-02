package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: kqy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kqy {
    public final String a;
    public final amzy b;

    public kqy(String str, amzy amzy) {
        iva.a((Object) str);
        this.a = str;
        iva.a((Object) amzy);
        this.b = amzy;
    }

    public final String[] a() {
        return (String[]) this.b.toArray(new String[this.b.size()]);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            kqy kqy = (kqy) obj;
            return this.a.equals(kqy.a) && anda.a((List) this.b, (Object) kqy.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public kqy(String str, String str2) {
        this(str, amzy.a((Object) str2));
    }
}
