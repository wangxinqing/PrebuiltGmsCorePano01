package defpackage;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* renamed from: jjq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jjq {
    private static String a(String str, String str2) {
        try {
            return URLDecoder.decode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Map a(URI uri, String str) {
        String str2;
        Map emptyMap = Collections.emptyMap();
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            emptyMap = new HashMap();
            Scanner scanner = new Scanner(rawQuery);
            scanner.useDelimiter("&");
            while (scanner.hasNext()) {
                String[] split = scanner.next().split("=");
                int length = split.length;
                if (length == 0 || length > 2) {
                    throw new IllegalArgumentException("bad parameter");
                }
                String a = a(split[0], str);
                if (length == 2) {
                    str2 = a(split[1], str);
                } else {
                    str2 = null;
                }
                emptyMap.put(a, str2);
            }
        }
        return emptyMap;
    }
}
