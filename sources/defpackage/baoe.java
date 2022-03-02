package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: baoe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baoe {
    public static final batg a = batg.a(":");
    public static final baob[] b = {new baob(baob.e, ""), new baob(baob.b, "GET"), new baob(baob.b, "POST"), new baob(baob.c, "/"), new baob(baob.c, "/index.html"), new baob(baob.d, "http"), new baob(baob.d, "https"), new baob(baob.a, "200"), new baob(baob.a, "204"), new baob(baob.a, "206"), new baob(baob.a, "304"), new baob(baob.a, "400"), new baob(baob.a, "404"), new baob(baob.a, "500"), new baob("accept-charset", ""), new baob("accept-encoding", "gzip, deflate"), new baob("accept-language", ""), new baob("accept-ranges", ""), new baob("accept", ""), new baob("access-control-allow-origin", ""), new baob("age", ""), new baob("allow", ""), new baob("authorization", ""), new baob("cache-control", ""), new baob("content-disposition", ""), new baob("content-encoding", ""), new baob("content-language", ""), new baob("content-length", ""), new baob("content-location", ""), new baob("content-range", ""), new baob("content-type", ""), new baob("cookie", ""), new baob("date", ""), new baob("etag", ""), new baob("expect", ""), new baob("expires", ""), new baob("from", ""), new baob("host", ""), new baob("if-match", ""), new baob("if-modified-since", ""), new baob("if-none-match", ""), new baob("if-range", ""), new baob("if-unmodified-since", ""), new baob("last-modified", ""), new baob("link", ""), new baob("location", ""), new baob("max-forwards", ""), new baob("proxy-authenticate", ""), new baob("proxy-authorization", ""), new baob("range", ""), new baob("referer", ""), new baob("refresh", ""), new baob("retry-after", ""), new baob("server", ""), new baob("set-cookie", ""), new baob("strict-transport-security", ""), new baob("transfer-encoding", ""), new baob("user-agent", ""), new baob("vary", ""), new baob("via", ""), new baob("www-authenticate", "")};
    public static final Map c;

    static {
        int i = 0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(b.length);
        while (true) {
            baob[] baobArr = b;
            if (i < baobArr.length) {
                if (!linkedHashMap.containsKey(baobArr[i].f)) {
                    linkedHashMap.put(b[i].f, Integer.valueOf(i));
                }
                i++;
            } else {
                c = Collections.unmodifiableMap(linkedHashMap);
                return;
            }
        }
    }

    public static void a(batg batg) {
        int e = batg.e();
        for (int i = 0; i < e; i++) {
            byte a2 = batg.a(i);
            if (a2 >= 65 && a2 <= 90) {
                String valueOf = String.valueOf(batg.a());
                throw new IOException(valueOf.length() == 0 ? new String("PROTOCOL_ERROR response malformed: mixed case name: ") : "PROTOCOL_ERROR response malformed: mixed case name: ".concat(valueOf));
            }
        }
    }
}
