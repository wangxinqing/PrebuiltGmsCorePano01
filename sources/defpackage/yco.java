package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.Closeable;

/* renamed from: yco  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yco implements Closeable {
    public final ParcelFileDescriptor a;
    private boolean b;

    public yco(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = parcelFileDescriptor;
        ycp.b.incrementAndGet();
    }

    public final void a(boolean z) {
        if (!this.b) {
            this.b = true;
            ycp.b.decrementAndGet();
            if (z) {
                jjt.a(this.a);
            }
        }
    }

    public final void close() {
        a(true);
    }
}
