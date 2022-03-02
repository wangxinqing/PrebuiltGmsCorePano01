package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: alxg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alxg {
    public final List a = new ArrayList();
    private final Map b = new HashMap();

    public alxg(String str) {
        alys.a((Object) str, "json");
        amjf a2 = a((amic) new alze(str).a((alzf) alsd.a));
        if (a2.b == amje.REFERENCED_ID) {
            String b2 = a2.b();
            if (b2.equals("root")) {
                for (alxd alxd : this.b.values()) {
                    this.a.add(aluv.a(alxd.a, alxd.b));
                }
                for (alxd alxd2 : this.b.values()) {
                    if (!(alxd2 instanceof alxf)) {
                        this.a.addAll(alxd2.a());
                    }
                }
                for (alxd alxd3 : this.b.values()) {
                    if (alxd3 instanceof alxf) {
                        this.a.addAll(alxd3.a());
                    }
                }
                return;
            }
            throw new alrw(b2);
        }
        throw new alrx();
    }

    private final amjf a(alxd alxd) {
        if (this.b.containsKey(alxd.a)) {
            String valueOf = String.valueOf(alxd.a);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Input contains more than one value for object with ID: ") : "Input contains more than one value for object with ID: ".concat(valueOf));
        }
        this.b.put(alxd.a, alxd);
        amjd c = amjf.c();
        c.a(alxd.a);
        return c.a();
    }

    public final amjf a(amic amic) {
        amib amib = amic.b;
        if (amib == amib.NULL_VALUE) {
            return aluw.a;
        }
        if (amib == amib.STRUCT_VALUE) {
            Map a2 = amic.d().a();
            if (a2.containsKey("data")) {
                return a((amic) a2.get("data"));
            }
            if (a2.containsKey("json")) {
                return aluw.b((amic) a2.get("json"));
            }
            if (a2.containsKey("type")) {
                amih a3 = aluv.a(((amic) a2.get("type")).b());
                amig amig = amig.KIND_NOT_SET;
                int ordinal = a3.b.ordinal();
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        return a((alxd) new alxb(this, amic));
                    }
                    if (ordinal == 3) {
                        return a((alxd) new alxe(amic));
                    }
                    if (ordinal == 4) {
                        return a((alxd) new alxf(amic));
                    }
                    if (ordinal != 5) {
                        String valueOf = String.valueOf(a3);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
                        sb.append("Unsupported Realtime type: ");
                        sb.append(valueOf);
                        throw new IllegalStateException(sb.toString());
                    }
                }
                return a((alxd) new alxc(this, amic));
            } else if (a2.containsKey("ref")) {
                String b2 = ((amic) a2.get("ref")).b();
                amjd c = amjf.c();
                c.a(b2);
                return c.a();
            } else {
                String valueOf2 = String.valueOf(alsc.a(amic));
                throw new alsb(valueOf2.length() == 0 ? new String("Expected Realtime object, reference, or input data but was: ") : "Expected Realtime object, reference, or input data but was: ".concat(valueOf2));
            }
        } else {
            throw new alrv("object", amic.toString());
        }
    }
}
