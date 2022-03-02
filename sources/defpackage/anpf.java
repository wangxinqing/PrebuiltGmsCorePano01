package defpackage;

import com.android.volley.toolbox.ImageRequest;

/* renamed from: anpf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anpf extends aucj implements audy {
    public static final anpf d;
    private static volatile auef e;
    public int a;
    public int b = ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
    public String c = "";

    static {
        anpf anpf = new anpf();
        d = anpf;
        aucj.a(anpf.class, (aucj) anpf);
    }

    private anpf() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001", new Object[]{"a", "b", anpe.a, "c"});
        } else if (i2 == 3) {
            return new anpf();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (anpf.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(d);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
