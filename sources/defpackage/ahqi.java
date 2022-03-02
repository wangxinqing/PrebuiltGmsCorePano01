package defpackage;

import java.nio.ByteBuffer;

/* renamed from: ahqi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahqi implements Runnable {
    final /* synthetic */ ByteBuffer a;
    final /* synthetic */ ahqj b;

    public ahqi(ahqj ahqj, ByteBuffer byteBuffer) {
        this.b = ahqj;
        this.a = byteBuffer;
    }

    public final void run() {
        this.b.f = this.a.getLong();
        int i = 0;
        while (true) {
            int[] iArr = this.b.g;
            if (i < iArr.length) {
                iArr[i] = this.a.getInt();
                i++;
            } else {
                return;
            }
        }
    }
}
