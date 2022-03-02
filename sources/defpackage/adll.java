package defpackage;

import java.util.Arrays;
import java.util.concurrent.Callable;

/* renamed from: adll  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adll {
    public final String a;
    public final adre b;
    public final boolean c;
    public final Callable d;

    public adll(String str, adre adre) {
        this(str, adre, false, (Callable) null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof adll) {
            adll adll = (adll) obj;
            if (!this.a.equals(adll.a) || !this.b.equals(adll.b) || this.c != adll.c) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c)});
    }

    public adll(String str, adre adre, boolean z, Callable callable) {
        this.a = str;
        this.b = adre;
        this.c = z;
        this.d = callable;
    }

    public adll(String str, adre adre, byte[] bArr) {
        this(str, adre, true, (Callable) null);
    }
}
