package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import java.lang.ref.SoftReference;
import java.util.concurrent.Executor;

/* renamed from: akfj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akfj {
    public static final /* synthetic */ int a = 0;
    private static final Executor b = qvj.b.d(5);
    private static akfj d;
    private static final Object e = new Object();
    private static final int[] f = {128, 512, Integer.MAX_VALUE};
    private final LruCache c;

    public akfj(Context context) {
        int memoryClass = ((ActivityManager) context.getSystemService("activity")).getMemoryClass() / 4;
        this.c = new akfe((memoryClass > 32 ? 32 : memoryClass) * 1048576);
    }

    public static final akfj a(Context context) {
        if (d == null) {
            synchronized (e) {
                if (d == null) {
                    d = new akfj(context);
                }
            }
        }
        return d;
    }

    private static String a(String str, int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = f;
            if (i2 >= iArr.length) {
                throw new RuntimeException();
            } else if (i <= iArr[i2]) {
                StringBuilder sb = new StringBuilder(str.length() + 16);
                sb.append(str);
                sb.append(":");
                sb.append("");
                sb.append(":");
                sb.append(f[i2]);
                return sb.toString();
            } else {
                i2++;
            }
        }
    }

    public final Bitmap a(akfl akfl) {
        if (akfl.d != 2048) {
            akfi akfi = (akfi) this.c.get(a(akfl.a(), akfl.d));
            if (akfi != null) {
                Bitmap bitmap = akfi.a;
                if (!akfi.b || bitmap.getHeight() >= akfl.d) {
                    return bitmap;
                }
            }
            for (int length = f.length - 1; length >= 0; length--) {
                if (f[length] < akfl.d) {
                    akfi akfi2 = (akfi) this.c.get(a(akfl.a(), f[length]));
                    if (akfi2 != null && !akfi2.b) {
                        return akfi2.a;
                    }
                }
            }
            return null;
        }
        for (int length2 = f.length - 1; length2 >= 0; length2--) {
            akfi akfi3 = (akfi) this.c.get(a(akfl.a(), f[length2]));
            if (akfi3 != null && !akfi3.b) {
                return akfi3.a;
            }
        }
        return null;
    }

    public final void a(akfl akfl, akfh akfh) {
        Bitmap bitmap;
        a((Object) akfh);
        boolean b2 = akeh.b(akfl.b);
        if (!b2) {
            bitmap = a(akfl);
        } else {
            bitmap = null;
        }
        if (b2) {
            akej.a().a(akfl);
        }
        akfg akfg = new akfg(this, bitmap, b2, akfh);
        akfh.d = new SoftReference(akfg);
        akfg.executeOnExecutor(b, new akfl[]{akfl});
    }

    public final void a(akfl akfl, Bitmap bitmap, boolean z) {
        int i = akfl.f;
        String a2 = akfl.a();
        Bitmap.Config config = akfl.g;
        String a3 = a(a2, bitmap.getHeight());
        akfi akfi = (akfi) this.c.get(a3);
        if (akfi != null) {
            Bitmap bitmap2 = akfi.a;
            if (bitmap2.getWidth() >= bitmap.getWidth() && bitmap2.getHeight() >= bitmap.getHeight()) {
                return;
            }
        }
        this.c.put(a3, new akfi(bitmap, z));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r3 = (defpackage.akfh) r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof defpackage.akfh
            r1 = 0
            if (r0 == 0) goto L_0x0015
            akfh r3 = (defpackage.akfh) r3
            java.lang.ref.SoftReference r0 = r3.d
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r0.get()
            akfm r0 = (defpackage.akfm) r0
            r3.d = r1
            r1 = r0
            goto L_0x0016
        L_0x0015:
        L_0x0016:
            if (r1 == 0) goto L_0x001c
            r3 = 1
            r1.cancel(r3)
        L_0x001c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akfj.a(java.lang.Object):void");
    }
}
