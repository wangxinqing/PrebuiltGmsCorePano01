package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ahhc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahhc implements ahhb {
    public static final ahhc d = new ahhc("");
    private static final Charset f = Charset.forName("UTF-8");
    private static final List g = new ArrayList();
    public final Map a = new HashMap(10);
    public final Object b = new Object();
    public volatile ahha c;
    private final String e;

    private ahhc(String str) {
        this.e = str;
    }

    public static synchronized ahhc a(String str) {
        synchronized (ahhc.class) {
            List list = g;
            int size = list.size();
            int i = 0;
            while (i < size) {
                ahhc ahhc = (ahhc) list.get(i);
                i++;
                if (ahhc.e.equals(str)) {
                    return ahhc;
                }
            }
            ahhc ahhc2 = new ahhc(str);
            g.add(ahhc2);
            return ahhc2;
        }
    }

    public static long b(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes(f));
            return ByteBuffer.wrap(instance.digest()).getLong();
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Deprecated
    public final ahgt a(String str, ahgx ahgx) {
        return (ahgt) a((ahgz) new ahgt(str, this, ahgx));
    }

    public final ahgz b(String str, ahgx... ahgxArr) {
        synchronized (this.b) {
            ahgz ahgz = (ahgz) this.a.get(str);
            if (ahgz == null) {
                ahgz ahgz2 = new ahgz(str, this, ahgxArr);
                this.a.put(ahgz2.b, ahgz2);
                return ahgz2;
            }
            ahgz.a(ahgxArr);
            return ahgz;
        }
    }

    public final ahgv a(String str, ahgx... ahgxArr) {
        synchronized (this.b) {
            ahgv ahgv = (ahgv) this.a.get(str);
            if (ahgv == null) {
                ahgv ahgv2 = new ahgv(str, this, ahgxArr);
                this.a.put(ahgv2.b, ahgv2);
                return ahgv2;
            }
            ahgv.a(ahgxArr);
            return ahgv;
        }
    }

    @Deprecated
    public final ahgz a(ahgz ahgz) {
        synchronized (this.b) {
            ahgz ahgz2 = (ahgz) this.a.get(ahgz.b);
            if (ahgz2 == null) {
                this.a.put(ahgz.b, ahgz);
                return ahgz;
            } else if (ahgz2.getClass() == ahgz.getClass()) {
                ahgz2.a(ahgz.c);
                return ahgz2;
            } else {
                String str = ahgz2.b;
                StringBuilder sb = new StringBuilder(str.length() + 36);
                sb.append("Streamz ");
                sb.append(str);
                sb.append(" with a different class name");
                throw new ahhf(sb.toString());
            }
        }
    }
}
