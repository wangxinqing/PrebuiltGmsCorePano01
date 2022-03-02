package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: awbj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awbj {
    public static final awbg[] a = {new awbg(awbg.e, ""), new awbg(awbg.b, "GET"), new awbg(awbg.b, "POST"), new awbg(awbg.c, "/"), new awbg(awbg.c, "/index.html"), new awbg(awbg.d, "http"), new awbg(awbg.d, "https"), new awbg(awbg.a, "200"), new awbg(awbg.a, "204"), new awbg(awbg.a, "206"), new awbg(awbg.a, "304"), new awbg(awbg.a, "400"), new awbg(awbg.a, "404"), new awbg(awbg.a, "500"), new awbg("accept-charset", ""), new awbg("accept-encoding", "gzip, deflate"), new awbg("accept-language", ""), new awbg("accept-ranges", ""), new awbg("accept", ""), new awbg("access-control-allow-origin", ""), new awbg("age", ""), new awbg("allow", ""), new awbg("authorization", ""), new awbg("cache-control", ""), new awbg("content-disposition", ""), new awbg("content-encoding", ""), new awbg("content-language", ""), new awbg("content-length", ""), new awbg("content-location", ""), new awbg("content-range", ""), new awbg("content-type", ""), new awbg("cookie", ""), new awbg("date", ""), new awbg("etag", ""), new awbg("expect", ""), new awbg("expires", ""), new awbg("from", ""), new awbg("host", ""), new awbg("if-match", ""), new awbg("if-modified-since", ""), new awbg("if-none-match", ""), new awbg("if-range", ""), new awbg("if-unmodified-since", ""), new awbg("last-modified", ""), new awbg("link", ""), new awbg("location", ""), new awbg("max-forwards", ""), new awbg("proxy-authenticate", ""), new awbg("proxy-authorization", ""), new awbg("range", ""), new awbg("referer", ""), new awbg("refresh", ""), new awbg("retry-after", ""), new awbg("server", ""), new awbg("set-cookie", ""), new awbg("strict-transport-security", ""), new awbg("transfer-encoding", ""), new awbg("user-agent", ""), new awbg("vary", ""), new awbg("via", ""), new awbg("www-authenticate", "")};
    public static final Map b;

    static {
        int i = 0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(a.length);
        while (true) {
            awbg[] awbgArr = a;
            if (i < awbgArr.length) {
                if (!linkedHashMap.containsKey(awbgArr[i].h)) {
                    linkedHashMap.put(a[i].h, Integer.valueOf(i));
                }
                i++;
            } else {
                b = Collections.unmodifiableMap(linkedHashMap);
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
