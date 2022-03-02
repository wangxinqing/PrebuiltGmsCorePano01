package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: agkc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agkc {
    private static final Pattern b = Pattern.compile("^(\\*[a-z]+\\*).*");
    final ConcurrentHashMap a = new ConcurrentHashMap();

    static String a(String str) {
        String[] split = str.split("/");
        return (split == null || split.length != 3) ? "MALFORMED" : split[0];
    }

    /* access modifiers changed from: package-private */
    public final baqv a(int i, baqv baqv) {
        baqp baqp = baqv.d;
        if (baqp == null) {
            baqp = baqp.d;
        }
        if ((baqp.a & 2) == 0) {
            return baqv;
        }
        baqp baqp2 = baqv.d;
        if (baqp2 == null) {
            baqp2 = baqp.d;
        }
        aucd aucd = (aucd) baqp2.c(5);
        aucd.a((aucj) baqp2);
        aucd aucd2 = (aucd) baqv.c(5);
        aucd2.a((aucj) baqv);
        String str = ((baqp) aucd.b).c;
        Long a2 = ageb.a(str);
        amrl.a((Object) a2);
        long longValue = a2.longValue();
        ConcurrentHashMap concurrentHashMap = this.a;
        Long valueOf = Long.valueOf(longValue);
        if (!concurrentHashMap.containsKey(valueOf)) {
            int i2 = i - 1;
            if (i2 == 0) {
                Matcher matcher = b.matcher(str);
                if (matcher.matches()) {
                    if (str.startsWith("*sync*/")) {
                        String valueOf2 = String.valueOf(a(str.substring(7)));
                        str = valueOf2.length() == 0 ? new String("*sync*/") : "*sync*/".concat(valueOf2);
                    } else {
                        str = matcher.group(1);
                    }
                }
            } else if (i2 == 1) {
                str = a(str);
            } else if (i2 == 2) {
                str = "--";
            }
            Long a3 = ageb.a(str);
            if (a3 != null) {
                this.a.putIfAbsent(valueOf, a3);
            }
        }
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        baqp baqp3 = (baqp) aucd.b;
        int i3 = baqp3.a | 1;
        baqp3.a = i3;
        baqp3.b = longValue;
        baqp3.a = i3 & -3;
        baqp3.c = baqp.d.c;
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        baqv baqv2 = (baqv) aucd2.b;
        baqp baqp4 = (baqp) aucd.i();
        baqv baqv3 = baqv.e;
        baqp4.getClass();
        baqv2.d = baqp4;
        baqv2.a |= 4;
        return (baqv) aucd2.i();
    }

    /* access modifiers changed from: package-private */
    public final baqv a(baqv baqv) {
        baqp baqp = baqv.d;
        if (baqp == null) {
            baqp = baqp.d;
        }
        if ((baqp.a & 1) == 0) {
            return baqv;
        }
        baqp baqp2 = baqv.d;
        if (baqp2 == null) {
            baqp2 = baqp.d;
        }
        aucd aucd = (aucd) baqp2.c(5);
        aucd.a((aucj) baqp2);
        Long l = (Long) this.a.get(Long.valueOf(((baqp) aucd.b).b));
        amrl.a((Object) l);
        aucd aucd2 = (aucd) baqv.c(5);
        aucd2.a((aucj) baqv);
        long longValue = l.longValue();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        baqp baqp3 = (baqp) aucd.b;
        baqp3.a |= 1;
        baqp3.b = longValue;
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        baqv baqv2 = (baqv) aucd2.b;
        baqp baqp4 = (baqp) aucd.i();
        baqv baqv3 = baqv.e;
        baqp4.getClass();
        baqv2.d = baqp4;
        baqv2.a |= 4;
        return (baqv) aucd2.i();
    }
}
