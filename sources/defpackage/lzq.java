package defpackage;

import java.util.Map;

/* renamed from: lzq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lzq implements Runnable {
    final /* synthetic */ Map a;
    final /* synthetic */ lzi b;
    final /* synthetic */ lzs c;

    public lzq(lzs lzs, Map map, lzi lzi) {
        this.c = lzs;
        this.a = map;
        this.b = lzi;
    }

    public final void run() {
        byte[] bArr;
        try {
            bArr = this.c.a.a(this.a);
            if (bArr == null) {
                this.c.b = mae.a("Received null");
                bArr = this.c.b;
            }
        } catch (Exception e) {
            lzs lzs = this.c;
            String valueOf = String.valueOf(e.toString());
            lzs.b = mae.a(valueOf.length() == 0 ? new String("Snapshot failed: ") : "Snapshot failed: ".concat(valueOf));
            bArr = this.c.b;
            this.c.b();
        }
        this.b.a((Object) bArr);
    }
}
