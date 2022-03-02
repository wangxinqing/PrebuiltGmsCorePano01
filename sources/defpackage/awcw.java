package defpackage;

import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: awcw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awcw {
    static final String a = "OkHttp";
    public static final String b = String.valueOf("OkHttp").concat("-Sent-Millis");
    public static final String c = String.valueOf(a).concat("-Received-Millis");
    public static final String d = String.valueOf(a).concat("-Selected-Protocol");
    public static final String e = String.valueOf(a).concat("-Response-Source");
    private static final Comparator f = new awcv();

    static {
        awag awag = awag.a;
    }

    public static long a(avzb avzb) {
        String a2 = avzb.a("Content-Length");
        if (a2 == null) {
            return -1;
        }
        try {
            return Long.parseLong(a2);
        } catch (NumberFormatException e2) {
            return -1;
        }
    }

    public static List b(avzb avzb, String str) {
        ArrayList arrayList = new ArrayList();
        int a2 = avzb.a();
        for (int i = 0; i < a2; i++) {
            if (str.equalsIgnoreCase(avzb.a(i))) {
                String b2 = avzb.b(i);
                int i2 = 0;
                while (i2 < b2.length()) {
                    int a3 = awcf.a(b2, i2, " ");
                    String trim = b2.substring(i2, a3).trim();
                    int a4 = awcf.a(b2, a3);
                    if (!b2.regionMatches(true, a4, "realm=\"", 0, 7)) {
                        break;
                    }
                    int i3 = a4 + 7;
                    int a5 = awcf.a(b2, i3, "\"");
                    String substring = b2.substring(i3, a5);
                    i2 = awcf.a(b2, awcf.a(b2, a5 + 1, ",") + 1);
                    arrayList.add(new avyo(trim, substring));
                }
            }
        }
        return arrayList;
    }

    public static long a(avzj avzj) {
        return a(avzj.c);
    }

    public static long a(avzm avzm) {
        return a(avzm.f);
    }

    public static avzj a(avzm avzm, Proxy proxy) {
        PasswordAuthentication requestPasswordAuthentication;
        avzm avzm2 = avzm;
        Proxy proxy2 = proxy;
        int i = 0;
        if (avzm2.c == 407) {
            List b2 = avzm.b();
            avzj avzj = avzm2.a;
            avzd avzd = avzj.a;
            int size = b2.size();
            while (i < size) {
                avyo avyo = (avyo) b2.get(i);
                if ("Basic".equalsIgnoreCase(avyo.a)) {
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) proxy.address();
                    PasswordAuthentication requestPasswordAuthentication2 = Authenticator.requestPasswordAuthentication(inetSocketAddress.getHostName(), awcb.a(proxy2, avzd), inetSocketAddress.getPort(), avzd.a, avyo.b, avyo.a, avzd.a(), Authenticator.RequestorType.PROXY);
                    if (requestPasswordAuthentication2 != null) {
                        String a2 = avyv.a(requestPasswordAuthentication2.getUserName(), new String(requestPasswordAuthentication2.getPassword()));
                        avzi b3 = avzj.b();
                        b3.b("Proxy-Authorization", a2);
                        return b3.a();
                    }
                }
                i++;
            }
            return null;
        }
        List b4 = avzm.b();
        avzj avzj2 = avzm2.a;
        avzd avzd2 = avzj2.a;
        int size2 = b4.size();
        while (i < size2) {
            avyo avyo2 = (avyo) b4.get(i);
            if (!"Basic".equalsIgnoreCase(avyo2.a) || (requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(avzd2.b, awcb.a(proxy2, avzd2), avzd2.c, avzd2.a, avyo2.b, avyo2.a, avzd2.a(), Authenticator.RequestorType.SERVER)) == null) {
                i++;
            } else {
                String a3 = avyv.a(requestPasswordAuthentication.getUserName(), new String(requestPasswordAuthentication.getPassword()));
                avzi b5 = avzj2.b();
                b5.b("Authorization", a3);
                return b5.a();
            }
        }
        return null;
    }

    public static Map a(avzb avzb, String str) {
        TreeMap treeMap = new TreeMap(f);
        int a2 = avzb.a();
        for (int i = 0; i < a2; i++) {
            String a3 = avzb.a(i);
            String b2 = avzb.b(i);
            ArrayList arrayList = new ArrayList();
            List list = (List) treeMap.get(a3);
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.add(b2);
            treeMap.put(a3, Collections.unmodifiableList(arrayList));
        }
        if (str != null) {
            treeMap.put((Object) null, Collections.unmodifiableList(Collections.singletonList(str)));
        }
        return Collections.unmodifiableMap(treeMap);
    }

    public static void a(avzi avzi, Map map) {
        String str;
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            if (("Cookie".equalsIgnoreCase(str2) || "Cookie2".equalsIgnoreCase(str2)) && !((List) entry.getValue()).isEmpty()) {
                List list = (List) entry.getValue();
                if (list.size() == 1) {
                    str = (String) list.get(0);
                } else {
                    StringBuilder sb = new StringBuilder();
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (i > 0) {
                            sb.append("; ");
                        }
                        sb.append((String) list.get(i));
                    }
                    str = sb.toString();
                }
                avzi.a(str2, str);
            }
        }
    }
}
