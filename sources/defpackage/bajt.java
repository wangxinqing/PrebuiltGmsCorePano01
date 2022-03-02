package defpackage;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bajt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bajt extends OutputStream {
    public final List a = new ArrayList();
    final /* synthetic */ bajw b;
    private balv c;

    public bajt(bajw bajw) {
        this.b = bajw;
    }

    public final void write(int i) {
        balv balv = this.c;
        if (balv != null && balv.a() > 0) {
            this.c.a((byte) i);
            return;
        }
        write(new byte[]{(byte) i}, 0, 1);
    }

    public final void write(byte[] bArr, int i, int i2) {
        if (this.c == null) {
            balv a2 = this.b.b.a(i2);
            this.c = a2;
            this.a.add(a2);
        }
        while (i2 > 0) {
            int min = Math.min(i2, this.c.a());
            if (min == 0) {
                int b2 = this.c.b();
                balv a3 = this.b.b.a(Math.max(i2, b2 + b2));
                this.c = a3;
                this.a.add(a3);
            } else {
                this.c.a(bArr, i, min);
                i += min;
                i2 -= min;
            }
        }
    }
}
