package defpackage;

import com.google.android.gms.audiomodem.Encoding;
import java.util.Arrays;

/* renamed from: eeq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eeq {
    public final ecx a;
    public final Encoding b;
    public final int c;
    public final byte[] d;
    public final int e;
    public int f = 0;

    public eeq(ecx ecx, Encoding encoding, int i, byte[] bArr, int i2) {
        this.a = ecx;
        this.b = encoding;
        this.c = i;
        this.d = bArr;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof eeq)) {
            eeq eeq = (eeq) obj;
            if (!ius.a(this.a, eeq.a) || !ius.a(this.b, eeq.b) || this.c != eeq.c || !Arrays.equals(this.d, eeq.d) || this.e != eeq.e) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d, Integer.valueOf(this.e)});
    }
}
