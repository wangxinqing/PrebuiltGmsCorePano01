package defpackage;

import com.google.android.gms.audiomodem.Encoding;
import java.util.Arrays;

/* renamed from: eem  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eem {
    public final ecy a;
    public final Encoding b;

    public eem(ecy ecy, Encoding encoding) {
        this.a = ecy;
        this.b = encoding;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof eem)) {
            eem eem = (eem) obj;
            if (!ius.a(this.a, eem.a) || !ius.a(this.b, eem.b)) {
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
