package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: dke  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dke extends dlz implements dky {
    private static DecimalFormat a;
    private final dmd b;
    private final String c;
    private final Uri e;

    public static Uri a(String str) {
        iva.c(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(str);
        return builder.build();
    }

    public static Map b(dkn dkn) {
        String str;
        HashMap hashMap = new HashMap();
        dlh dlh = (dlh) dkn.a(dlh.class);
        if (dlh != null) {
            for (Map.Entry entry : Collections.unmodifiableMap(dlh.a).entrySet()) {
                Object value = entry.getValue();
                if (value == null) {
                    str = null;
                } else if (value instanceof String) {
                    str = (String) value;
                    if (TextUtils.isEmpty(str)) {
                        str = null;
                    }
                } else if (value instanceof Double) {
                    Double d = (Double) value;
                    str = d.doubleValue() != 0.0d ? a(d.doubleValue()) : null;
                } else {
                    str = value instanceof Boolean ? value != Boolean.FALSE ? "1" : null : String.valueOf(value);
                }
                if (str != null) {
                    hashMap.put((String) entry.getKey(), str);
                }
            }
        }
        dlm dlm = (dlm) dkn.a(dlm.class);
        if (dlm != null) {
            a((Map) hashMap, "t", dlm.a);
            a((Map) hashMap, "cid", dlm.b);
            a((Map) hashMap, "uid", dlm.c);
            a((Map) hashMap, "sc", (String) null);
            a((Map) hashMap, "sf", 0.0d);
            a((Map) hashMap, "ni", dlm.f);
            a((Map) hashMap, "adid", dlm.d);
            a((Map) hashMap, "ate", dlm.e);
        }
        dln dln = (dln) dkn.a(dln.class);
        if (dln != null) {
            a((Map) hashMap, "cd", (String) null);
            a((Map) hashMap, "a", (double) dln.a);
            a((Map) hashMap, "dr", (String) null);
        }
        if (((dlk) dkn.a(dlk.class)) != null) {
            a((Map) hashMap, "ec", (String) null);
            a((Map) hashMap, "ea", (String) null);
            a((Map) hashMap, "el", (String) null);
            a((Map) hashMap, "ev", 0.0d);
        }
        dle dle = (dle) dkn.a(dle.class);
        if (dle != null) {
            a((Map) hashMap, "cn", dle.a);
            a((Map) hashMap, "cs", dle.b);
            a((Map) hashMap, "cm", dle.c);
            a((Map) hashMap, "ck", dle.d);
            a((Map) hashMap, "cc", dle.e);
            a((Map) hashMap, "ci", dle.f);
            a((Map) hashMap, "anid", dle.g);
            a((Map) hashMap, "gclid", dle.h);
            a((Map) hashMap, "dclid", dle.i);
            a((Map) hashMap, "aclid", dle.j);
        }
        if (((dll) dkn.a(dll.class)) != null) {
            a((Map) hashMap, "exd", (String) null);
            a((Map) hashMap, "exf", false);
        }
        if (((dlo) dkn.a(dlo.class)) != null) {
            a((Map) hashMap, "sn", (String) null);
            a((Map) hashMap, "sa", (String) null);
            a((Map) hashMap, "st", (String) null);
        }
        if (((dlp) dkn.a(dlp.class)) != null) {
            a((Map) hashMap, "utv", (String) null);
            a((Map) hashMap, "utt", 0.0d);
            a((Map) hashMap, "utc", (String) null);
            a((Map) hashMap, "utl", (String) null);
        }
        dlf dlf = (dlf) dkn.a(dlf.class);
        if (dlf != null) {
            for (Map.Entry entry2 : Collections.unmodifiableMap(dlf.a).entrySet()) {
                String a2 = dkg.a("cd", ((Integer) entry2.getKey()).intValue());
                if (!TextUtils.isEmpty(a2)) {
                    hashMap.put(a2, (String) entry2.getValue());
                }
            }
        }
        dlg dlg = (dlg) dkn.a(dlg.class);
        if (dlg != null) {
            for (Map.Entry entry3 : Collections.unmodifiableMap(dlg.a).entrySet()) {
                String a3 = dkg.a("cm", ((Integer) entry3.getKey()).intValue());
                if (!TextUtils.isEmpty(a3)) {
                    hashMap.put(a3, a(((Double) entry3.getValue()).doubleValue()));
                }
            }
        }
        dlj dlj = (dlj) dkn.a(dlj.class);
        if (dlj != null) {
            int i = 1;
            for (dlr dlr : Collections.unmodifiableList(dlj.b)) {
                dkg.a("promo", i);
                hashMap.putAll(dlr.a());
                i++;
            }
            int i2 = 1;
            for (dlq dlq : Collections.unmodifiableList(dlj.a)) {
                dkg.a("pr", i2);
                hashMap.putAll(dlq.a());
                i2++;
            }
            int i3 = 1;
            for (Map.Entry entry4 : dlj.c.entrySet()) {
                String a4 = dkg.a("il", i3);
                int i4 = 1;
                for (dlq dlq2 : (List) entry4.getValue()) {
                    String valueOf = String.valueOf(a4);
                    String valueOf2 = String.valueOf(dkg.a(i4));
                    if (valueOf2.length() == 0) {
                        new String(valueOf);
                    } else {
                        valueOf.concat(valueOf2);
                    }
                    hashMap.putAll(dlq.a());
                    i4++;
                }
                if (!TextUtils.isEmpty((CharSequence) entry4.getKey())) {
                    hashMap.put(String.valueOf(a4).concat("nm"), (String) entry4.getKey());
                }
                i3++;
            }
        }
        dli dli = (dli) dkn.a(dli.class);
        if (dli != null) {
            a((Map) hashMap, "ul", dli.a);
            a((Map) hashMap, "sd", 0.0d);
            a(hashMap, "sr", dli.b, dli.c);
            a(hashMap, "vp", 0, 0);
        }
        dld dld = (dld) dkn.a(dld.class);
        if (dld != null) {
            a((Map) hashMap, "an", dld.a);
            a((Map) hashMap, "aid", dld.c);
            a((Map) hashMap, "aiid", dld.d);
            a((Map) hashMap, "av", dld.b);
        }
        return hashMap;
    }

    public final Uri a() {
        return this.e;
    }

    public dke(dmd dmd, String str) {
        super(dmd);
        iva.c(str);
        this.b = dmd;
        this.c = str;
        this.e = a(str);
    }

    static String a(double d) {
        if (a == null) {
            a = new DecimalFormat("0.######");
        }
        return a.format(d);
    }

    private static void a(Map map, String str, double d) {
        if (d != 0.0d) {
            map.put(str, a(d));
        }
    }

    private static void a(Map map, String str, int i, int i2) {
        if (i > 0 && i2 > 0) {
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            map.put(str, sb.toString());
        }
    }

    private static void a(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    private static void a(Map map, String str, boolean z) {
        if (z) {
            map.put(str, "1");
        }
    }

    public final void a(dkn dkn) {
        iva.a((Object) dkn);
        iva.b(dkn.c, "Can't deliver not submitted measurement");
        iva.b("deliver should be called on worker thread");
        dkn a2 = dkn.a();
        dlm dlm = (dlm) a2.b(dlm.class);
        if (TextUtils.isEmpty(dlm.a)) {
            e().a(b(a2), "Ignoring measurement without type");
        } else if (TextUtils.isEmpty(dlm.b)) {
            e().a(b(a2), "Ignoring measurement without client id");
        } else {
            this.b.d().b();
            if (dpx.a(0.0d, dlm.b)) {
                b("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(0.0d));
                return;
            }
            Map b2 = b(a2);
            b2.put("v", "1");
            b2.put("_v", dmb.b);
            b2.put("tid", this.c);
            if (!this.b.d().e) {
                HashMap hashMap = new HashMap();
                dpx.a((Map) hashMap, "uid", dlm.c);
                dld dld = (dld) dkn.a(dld.class);
                if (dld != null) {
                    dpx.a((Map) hashMap, "an", dld.a);
                    dpx.a((Map) hashMap, "aid", dld.c);
                    dpx.a((Map) hashMap, "av", dld.b);
                    dpx.a((Map) hashMap, "aiid", dld.d);
                }
                b2.put("_s", String.valueOf(i().a(new dmf(dlm.b, this.c, !TextUtils.isEmpty(dlm.d), hashMap))));
                i().a(new dpc(e(), b2, dkn.d, true));
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : b2.entrySet()) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append((String) entry.getKey());
                sb.append("=");
                sb.append((String) entry.getValue());
            }
            c("Dry run is enabled. GoogleAnalytics would have sent", sb.toString());
        }
    }
}
