package defpackage;

import android.os.Build;
import com.google.android.chimera.FragmentTransaction;
import java.nio.ByteBuffer;

/* renamed from: bava  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bava implements bawd {
    final /* synthetic */ boolean a;
    final /* synthetic */ bavb b;

    public bava(bavb bavb, boolean z) {
        this.b = bavb;
        this.a = z;
    }

    public final void a() {
        bavb bavb = this.b;
        bavb.d = bavb.b.getLength();
        bavb bavb2 = this.b;
        long j = bavb2.d;
        if (j != 0) {
            if (j <= 0 || j >= 8192) {
                bavb2.c = ByteBuffer.allocateDirect(FragmentTransaction.TRANSIT_EXIT_MASK);
            } else {
                bavb2.c = ByteBuffer.allocateDirect(((int) j) + 1);
            }
            bavb bavb3 = this.b;
            long j2 = bavb3.d;
            if (j2 > 0 && j2 <= 2147483647L) {
                bavb3.f.setFixedLengthStreamingMode((int) j2);
            } else if (j2 > 2147483647L) {
                int i = Build.VERSION.SDK_INT;
                bavb3.f.setFixedLengthStreamingMode(j2);
            } else {
                bavb3.f.setChunkedStreamingMode(FragmentTransaction.TRANSIT_EXIT_MASK);
            }
            if (!this.a) {
                this.b.a.set(1);
                bavb bavb4 = this.b;
                bavb4.b.rewind(bavb4);
                return;
            }
            this.b.a();
            return;
        }
        bavb2.c();
    }
}
