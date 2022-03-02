package defpackage;

import java.util.Arrays;
import java.util.Locale;

@Deprecated
/* renamed from: rir  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rir implements ibj, ibl {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final Locale e = null;

    public rir(riq riq) {
        this.a = riq.a;
        this.b = riq.b;
        this.c = riq.c;
        this.d = riq.d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rir) {
            rir rir = (rir) obj;
            if (ius.a(this.a, rir.a) && ius.a(this.b, rir.b) && ius.a(Integer.valueOf(this.c), Integer.valueOf(rir.c)) && ius.a(this.d, rir.d)) {
                Locale locale = rir.e;
                if (ius.a((Object) null, (Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d, null});
    }
}
