package defpackage;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: agwo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agwo {
    static final ConcurrentHashMap a = new ConcurrentHashMap();
    public final agvm b;
    public final boolean c = false;
    public final agxa d = new agxa(new agwk(this));
    private final String e;

    public agwo(agvm agvm, String str) {
        this.b = agvm;
        this.e = str;
    }

    public static Map a(agxe agxe) {
        boolean z;
        double d2;
        String str;
        auay auay;
        HashMap a2 = anet.a(agxe.f.size() + 3);
        aucx aucx = agxe.f;
        int size = aucx.size();
        int i = 0;
        while (i < size) {
            agxf agxf = (agxf) aucx.get(i);
            int i2 = agxf.b;
            int i3 = i2 != 0 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? i2 != 6 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
            int i4 = i3 - 1;
            if (i3 != 0) {
                if (i4 == 0) {
                    a2.put(agxf.d, Long.valueOf(i2 == 2 ? ((Long) agxf.c).longValue() : 0));
                } else if (i4 == 1) {
                    String str2 = agxf.d;
                    if (i2 == 3) {
                        z = ((Boolean) agxf.c).booleanValue();
                    } else {
                        z = false;
                    }
                    a2.put(str2, Boolean.valueOf(z));
                } else if (i4 == 2) {
                    String str3 = agxf.d;
                    if (i2 == 4) {
                        d2 = ((Double) agxf.c).doubleValue();
                    } else {
                        d2 = 0.0d;
                    }
                    a2.put(str3, Double.valueOf(d2));
                } else if (i4 == 3) {
                    String str4 = agxf.d;
                    if (i2 == 5) {
                        str = (String) agxf.c;
                    } else {
                        str = "";
                    }
                    a2.put(str4, str);
                } else if (i4 == 4) {
                    String str5 = agxf.d;
                    if (i2 == 6) {
                        auay = (auay) agxf.c;
                    } else {
                        auay = auay.b;
                    }
                    a2.put(str5, auay.k());
                }
                i++;
            } else {
                throw null;
            }
        }
        a2.put("__phenotype_server_token", agxe.d);
        a2.put("__phenotype_snapshot_token", agxe.b);
        a2.put("__phenotype_configuration_version", Long.valueOf(agxe.e));
        return anaf.a((Map) a2);
    }

    public final File b() {
        return new File(this.b.d.getDir("phenotype_file", 0), String.valueOf(this.e).concat(".pb"));
    }

    public final void a() {
        yef.a(this.b.d).a(this.e, "", "").a((Executor) this.b.a(), agwu.a((acvp) new agwn(this)));
    }
}
