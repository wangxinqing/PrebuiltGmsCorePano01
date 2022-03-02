package defpackage;

import com.android.volley.toolbox.ImageRequest;

/* renamed from: avnk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avnk extends aucj implements audy {
    public static final avnk c;
    private static volatile auef e;
    public String a = "";
    public int b = ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
    private int d;

    static {
        avnk avnk = new avnk();
        c = avnk;
        aucj.a(avnk.class, (aucj) avnk);
    }

    private avnk() {
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
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\b\u0000\u0003\u0004\u0002", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new avnk();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (avnk.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(c);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
