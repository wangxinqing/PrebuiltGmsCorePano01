package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aubs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aubs {
    static final aubs a = new aubs((byte[]) null);
    private static volatile boolean b = false;
    private static volatile aubs c;
    private static volatile aubs d;
    private final Map e;

    public aubs() {
        this.e = new HashMap();
    }

    public static aubs a() {
        return new aubs();
    }

    public static aubs b() {
        aubs aubs = c;
        if (aubs == null) {
            synchronized (aubs.class) {
                aubs = c;
                if (aubs == null) {
                    aubs = a;
                    c = aubs;
                }
            }
        }
        return aubs;
    }

    public static aubs c() {
        Class<aubs> cls = aubs.class;
        aubs aubs = d;
        if (aubs != null) {
            return aubs;
        }
        synchronized (cls) {
            aubs aubs2 = d;
            if (aubs2 != null) {
                return aubs2;
            }
            aubs a2 = aucb.a(cls);
            d = a2;
            return a2;
        }
    }

    public aubs(byte[] bArr) {
        this.e = Collections.emptyMap();
    }

    public auci a(audx audx, int i) {
        return (auci) this.e.get(new aubr(audx, i));
    }

    public final void a(auci auci) {
        this.e.put(new aubr(auci.a, auci.a()), auci);
    }
}
