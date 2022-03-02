package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: adkd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adkd {
    private static final iwd a = adnt.c("PackagePropertyFiles");
    private static final anax b = anax.a("metadata", "payload.bin", "payload_properties.txt");

    public static List a(String str) {
        return a(str, b);
    }

    private static List a(String str, anax anax) {
        anax anax2 = anax;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str2 : amsk.a(',').a((CharSequence) str.replaceAll("\\s+", ""))) {
            List c = amsk.a(':').c(str2);
            if (c.size() == 3) {
                String str3 = (String) c.get(0);
                try {
                    long parseLong = Long.parseLong((String) c.get(1));
                    long parseLong2 = Long.parseLong((String) c.get(2));
                    if (parseLong < 0 || parseLong2 < 0) {
                        throw new IOException(String.format("Invalid tokens: [%s].", new Object[]{str2}));
                    }
                    linkedHashMap.put(str3, new adkc(str3, parseLong, parseLong2));
                    a.a("Found tokens: filename=%s, offset=%d, size=%d.", str3, Long.valueOf(parseLong), Long.valueOf(parseLong2));
                } catch (NumberFormatException e) {
                    throw new IOException(String.format("Invalid tokens: [%s].", new Object[]{str2}), e);
                }
            } else {
                throw new IOException(String.format("Unknown tokens: [%s].", new Object[]{str2}));
            }
        }
        if (linkedHashMap.keySet().containsAll(anax2)) {
            return new ArrayList(linkedHashMap.values());
        }
        throw new IOException(String.format("Missing required property files: [%s].", new Object[]{amre.a(',').a((Iterable) iko.b(anax2, linkedHashMap.keySet()))}));
    }

    public static List b(String str) {
        return a(str, anfv.a);
    }
}
