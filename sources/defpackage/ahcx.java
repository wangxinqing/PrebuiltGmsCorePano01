package defpackage;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

/* renamed from: ahcx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahcx {
    public static final avlt a;

    static {
        aucd o = avlt.c.o();
        avlq avlq = avlq.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        avlt avlt = (avlt) o.b;
        avlq.getClass();
        avlt.b = avlq;
        avlt.a = 1;
        avlt avlt2 = (avlt) o.i();
        aucd o2 = avlt.c.o();
        avlr avlr = avlr.c;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        avlt avlt3 = (avlt) o2.b;
        avlr.getClass();
        avlt3.b = avlr;
        avlt3.a = 2;
        avlt avlt4 = (avlt) o2.i();
        aucd o3 = avlt.c.o();
        avls avls = avls.c;
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        avlt avlt5 = (avlt) o3.b;
        avls.getClass();
        avlt5.b = avls;
        avlt5.a = 3;
        a = (avlt) o3.i();
    }

    public static String a(avlt avlt) {
        int i;
        avlr avlr;
        avls avls;
        avlv avlv;
        int i2 = avlt.a;
        if (i2 == 0) {
            i = 5;
        } else if (i2 != 1) {
            i = i2 != 2 ? i2 != 3 ? i2 != 4 ? 0 : 4 : 3 : 2;
        } else {
            i = 1;
        }
        int i3 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i3 == 0) {
            return "compress";
        } else {
            if (i3 == 1) {
                if (i2 == 2) {
                    avlr = (avlr) avlt.b;
                } else {
                    avlr = avlr.c;
                }
                if (avlr.a != 1) {
                    return "encrypt";
                }
                String a2 = a((String) avlr.b);
                StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 21);
                sb.append("encrypt(aes_gcm_key=");
                sb.append(a2);
                sb.append(")");
                return sb.toString();
            } else if (i3 == 2) {
                if (i2 == 3) {
                    avls = (avls) avlt.b;
                } else {
                    avls = avls.c;
                }
                if (avls.a != 1) {
                    return "integrity";
                }
                String a3 = a((String) avls.b);
                StringBuilder sb2 = new StringBuilder(String.valueOf(a3).length() + 18);
                sb2.append("integrity(sha256=");
                sb2.append(a3);
                sb2.append(")");
                return sb2.toString();
            } else if (i3 == 3) {
                if (i2 == 4) {
                    avlv = (avlv) avlt.b;
                } else {
                    avlv = avlv.c;
                }
                if ((avlv.a & 1) != 0) {
                    String a4 = a(avlv.b);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(a4).length() + 12);
                    sb3.append("zip(target=");
                    sb3.append(a4);
                    sb3.append(")");
                    return sb3.toString();
                }
                throw new IllegalArgumentException("zip transform requires target");
            } else {
                throw new IllegalArgumentException("No transform specified");
            }
        }
    }

    public static String a(avlu avlu) {
        amzt j = amzy.j();
        aucx aucx = avlu.a;
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            j.c(a((avlt) aucx.get(i)));
        }
        return ahbw.a((List) j.a());
    }

    private static final String a(String str) {
        try {
            return URLEncoder.encode(str, ahbs.a.displayName());
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }
}
