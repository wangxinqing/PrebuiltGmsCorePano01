package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: ajqy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajqy implements arpv {
    private final Map a = new HashMap();
    private int b = 0;
    private final arpv c;

    static {
        ajqy.class.getSimpleName();
    }

    public ajqy(arpv arpv) {
        this.c = arpv;
    }

    public final arpu a(Long l) {
        arpv arpv;
        arpu arpu = (arpu) this.a.get(l);
        if (arpu == null && (arpv = this.c) != null) {
            airo airo = (airo) arpv;
            airo.e.a();
            arpu = null;
            if ((aydu.h() & 1) != 0) {
                airq airq = airo.f;
                long longValue = l.longValue();
                arpl arpl = airq.a;
                arrc a2 = arpl.a.u.a();
                a2.a(arpl.a.c.b());
                a2.a(1);
                arsy arsy = arpl.i;
                arsy.a(new long[]{longValue});
                arpl.i = arsy;
                Set a3 = arpl.a.a(arpl.i, a2);
                if (!a3.isEmpty()) {
                    arpu = ((arpu[]) a3.toArray(new arpu[a3.size()]))[0];
                }
            }
            String valueOf = String.valueOf(arpu);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("Frewle ApEntry has value: ");
            sb.append(valueOf);
            sb.toString();
        }
        return arpu;
    }

    public final void a() {
        String supplyRttLocations = aydu.a.a().supplyRttLocations();
        if (supplyRttLocations == null) {
            this.a.clear();
            this.b = 0;
        } else if (supplyRttLocations.hashCode() != this.b) {
            this.b = supplyRttLocations.hashCode();
            if (supplyRttLocations.length() == 0) {
                new String("RTT database initialization, phenotype flag is ");
            } else {
                "RTT database initialization, phenotype flag is ".concat(supplyRttLocations);
            }
            int i = -1;
            String[] split = supplyRttLocations.split(";", -1);
            StringBuilder sb = new StringBuilder(32);
            sb.append("RTT string is length ");
            sb.append(r0);
            sb.toString();
            for (String valueOf : split) {
                String valueOf2 = String.valueOf(valueOf);
                if (valueOf2.length() == 0) {
                    new String("RTT ap record is ");
                } else {
                    "RTT ap record is ".concat(valueOf2);
                }
            }
            this.a.clear();
            int length = split.length;
            int i2 = 0;
            while (i2 < length) {
                String[] split2 = split[i2].split(",", i);
                if (split2.length == 2) {
                    long a2 = arvy.a(split2[0]);
                    if (a2 != -1) {
                        try {
                            long parseLong = Long.parseLong(split2[1]);
                            String str = split2[0];
                            String str2 = split2[1];
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(str2).length());
                            sb2.append("RTT ap is ");
                            sb2.append(str);
                            sb2.append(", ");
                            sb2.append(str2);
                            sb2.toString();
                            Map map = this.a;
                            Long valueOf3 = Long.valueOf(a2);
                            arpu arpu = r8;
                            arpu arpu2 = new arpu(a2, parseLong, 0.0d, 0.0d, 0.0f, 0.0d, 0, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
                            map.put(valueOf3, arpu);
                        } catch (NullPointerException | NumberFormatException e) {
                        }
                    }
                }
                i2++;
                i = -1;
            }
        }
    }
}
