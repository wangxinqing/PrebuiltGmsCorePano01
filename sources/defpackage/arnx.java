package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: arnx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class arnx implements Runnable {
    final /* synthetic */ arnz a;
    private final int b;
    private final int c;
    private final byte[] d;

    public arnx(arnz arnz, int i, int i2, byte[] bArr) {
        this.a = arnz;
        this.b = i;
        this.c = i2;
        this.d = bArr;
    }

    public final void run() {
        aroq aroq;
        arot arot;
        arnh arnh;
        Locale locale = Locale.ENGLISH;
        new Object[1][0] = Integer.valueOf(this.c);
        int i = this.c;
        if (i == 3) {
            byte[] bArr = this.d;
            if (bArr != null && bArr.length == 5) {
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                byte b2 = wrap.get();
                wrap.getInt();
                synchronized (this.a.k) {
                    aroq = this.a.l;
                    this.a.l = null;
                }
                if (aroq != null) {
                    if (b2 == 0) {
                        arny arny = this.a.i;
                        int i2 = this.b;
                        long j = aroq.b;
                        arnr arnr = (arnr) arny;
                        if (arnr.c(i2)) {
                            synchronized (arnr.k) {
                                arnh arnh2 = (arnh) ((arnr) arny).l.get(j);
                                if (arnh2 != null) {
                                    if (arnh2 != arnr.b) {
                                        ((arnr) arny).m.remove(arnh2.b());
                                    }
                                    ((arnr) arny).l.remove(j);
                                }
                            }
                            arnr.a(j, true);
                        }
                    }
                    aroq.d = b2;
                    aroq.c.countDown();
                    return;
                }
                return;
            }
            Locale locale2 = Locale.ENGLISH;
            Object[] objArr = {5, Arrays.toString(bArr)};
        } else if (i == 4) {
            byte[] bArr2 = this.d;
            if (bArr2 != null && bArr2.length == 1) {
                byte b3 = bArr2[0];
                synchronized (this.a.k) {
                    arot = this.a.m;
                    this.a.m = null;
                }
                if (arot != null) {
                    if (b3 == 0) {
                        arny arny2 = this.a.i;
                        int i3 = this.b;
                        int i4 = arot.b;
                        arnr arnr2 = (arnr) arny2;
                        if (arnr2.c(i3) && (arnh = (arnh) arnr2.m.get(i4)) != null) {
                            arnr2.l.delete(arnh.a());
                            arnr2.m.delete(i4);
                        }
                    }
                    arot.d = b3;
                    arot.c.countDown();
                    return;
                }
                return;
            }
            Locale locale3 = Locale.ENGLISH;
            Object[] objArr2 = {1, Arrays.toString(bArr2)};
        } else if (i == 5) {
        } else {
            if (i != 7) {
                Locale locale4 = Locale.ENGLISH;
                new Object[1][0] = Integer.valueOf(this.c);
                return;
            }
            ((arnr) this.a.i).b(this.b);
        }
    }
}
