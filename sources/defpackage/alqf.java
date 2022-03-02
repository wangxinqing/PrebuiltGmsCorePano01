package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: alqf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alqf {
    public final String a;
    public final Map b;
    public final Map c;
    public final alqb d;
    public final List e;

    public alqf(alqd alqd) {
        String str = alqd.a;
        if (str != null) {
            this.a = str;
            this.b = Collections.unmodifiableMap(alqd.b);
            this.c = Collections.unmodifiableMap(alqd.e);
            this.d = alqd.c;
            this.e = Collections.unmodifiableList(alqd.d);
            return;
        }
        throw new NullPointerException("baseUri");
    }
}
