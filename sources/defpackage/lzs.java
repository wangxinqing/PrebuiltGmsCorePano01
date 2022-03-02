package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Random;

/* renamed from: lzs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lzs implements lya {
    public volatile lzz a;
    public volatile byte[] b;
    final /* synthetic */ lzt c;
    private final long d;
    private final mad e;

    public lzs(lzt lzt, String str, mad mad) {
        this.c = lzt;
        this.e = mad;
        this.b = mae.a(str);
        this.d = 0;
    }

    public final String a(Map map) {
        byte[] bArr;
        mad b2 = this.e.b();
        b2.a(14, maf.COARSE);
        if (this.b == null) {
            lzi lzi = new lzi();
            this.c.a((Runnable) new lzq(this, map, lzi));
            try {
                bArr = (byte[]) lzi.a(this.d);
                if (bArr == null) {
                    long j = this.d;
                    StringBuilder sb = new StringBuilder(41);
                    sb.append("Snapshot timeout: ");
                    sb.append(j);
                    sb.append(" ms");
                    bArr = mae.a(sb.toString());
                }
            } catch (InterruptedException e2) {
                String valueOf = String.valueOf(e2.toString());
                bArr = mae.a(valueOf.length() == 0 ? new String("Results transfer failed: ") : "Results transfer failed: ".concat(valueOf));
            }
        } else {
            bArr = this.b;
        }
        b2.a(15, maf.COARSE);
        if (axen.b()) {
            aucd o = amoa.f.o();
            auay a2 = auay.a(bArr);
            if (o.c) {
                o.c();
                o.c = false;
            }
            amoa amoa = (amoa) o.b;
            a2.getClass();
            amoa.a |= 2;
            amoa.c = a2;
            amnz a3 = b2.a();
            if (o.c) {
                o.c();
                o.c = false;
            }
            amoa amoa2 = (amoa) o.b;
            a3.getClass();
            amoa2.d = a3;
            amoa2.a |= 4;
            amnw amnw = amnw.c;
            aucd o2 = amnw.c.o();
            if (amnw.b != axfc.b()) {
                boolean b3 = axfc.b();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                amnw amnw2 = (amnw) o2.b;
                amnw2.a |= 1;
                amnw2.b = b3;
            }
            amnw amnw3 = (amnw) o2.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            amoa amoa3 = (amoa) o.b;
            amnw3.getClass();
            amoa3.e = amnw3;
            amoa3.a |= 8;
            amoa amoa4 = (amoa) o.i();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr2 = new byte[8];
                new Random().nextBytes(bArr2);
                bArr2[0] = 10;
                bArr2[1] = 6;
                byte b4 = 3;
                for (int i = 0; i < 8; i++) {
                    b4 ^= bArr2[i];
                }
                bArr2[2] = (byte) (bArr2[2] ^ ((byte) b4));
                byteArrayOutputStream.write(bArr2);
                aucd aucd = (aucd) amoa4.c(5);
                aucd.a((aucj) amoa4);
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                amoa amoa5 = (amoa) aucd.b;
                amoa5.a &= -2;
                amoa5.b = amoa.f.b;
                ((amoa) aucd.i()).a(byteArrayOutputStream);
                bArr = byteArrayOutputStream.toByteArray();
            } catch (IOException e3) {
                throw new RuntimeException(e3);
            }
        }
        return mae.a(bArr);
    }

    public final void b() {
        this.c.a((Runnable) new lzr(this));
    }

    public lzs(lzt lzt, lzz lzz, long j, mad mad) {
        this.c = lzt;
        this.a = lzz;
        this.d = j;
        this.e = mad;
        lzt.b++;
    }

    public final boolean a() {
        return this.a != null && this.b == null && this.a.asBinder().pingBinder();
    }
}
