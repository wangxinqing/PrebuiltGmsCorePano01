package defpackage;

import com.google.android.gms.audiomodem.Encoding;
import java.util.Arrays;

/* renamed from: een  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class een {
    public final ecz a;
    public final Encoding b;

    public een(ecz ecz, Encoding encoding) {
        this.a = ecz;
        this.b = encoding;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof een)) {
            een een = (een) obj;
            if (!ius.a(this.a, een.a) || !ius.a(this.b, een.b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
