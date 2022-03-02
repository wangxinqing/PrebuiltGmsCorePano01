package defpackage;

import android.util.Log;

/* renamed from: ini  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ini extends imh {
    private final agvx b;

    public ini(String str, agvx agvx) {
        super(str);
        iva.a((Object) agvx);
        this.b = agvx;
    }

    /* access modifiers changed from: protected */
    public final boolean a(inb inb) {
        Long valueOf = Long.valueOf(b());
        return valueOf.longValue() > 0 && Long.valueOf(b(inb)).longValue() < valueOf.longValue();
    }

    public final long b() {
        return ((Long) this.b.c()).longValue();
    }

    public final long b(inb inb) {
        imz imz = inb.h;
        if (imz != null) {
            anhk i = inb.b().listIterator();
            long j = 0;
            while (i.hasNext()) {
                imb imb = (imb) i.next();
                if (imz.a.equals(imb.a)) {
                    byte[] bArr = imb.f;
                    if (bArr.length != 8) {
                        return 0;
                    }
                    try {
                        Long valueOf = Long.valueOf(aook.a(bArr));
                        if (j < valueOf.longValue()) {
                            j = valueOf.longValue();
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        Log.e(a(), "Failed to parse opaque data", e);
                        return 0;
                    }
                }
            }
            return j;
        }
        Log.e(a(), "Fixer was null on context!!");
        return 0;
    }
}
