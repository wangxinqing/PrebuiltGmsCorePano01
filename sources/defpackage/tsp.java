package defpackage;

/* renamed from: tsp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tsp {
    public static final jjg a = tgd.a("NearbyDiscovery");

    public static String a(askx askx) {
        if (askx == null) {
            return "FastPairLog{}";
        }
        Object[] objArr = new Object[4];
        int i = 0;
        objArr[0] = Integer.valueOf(askx.b);
        int i2 = 1;
        objArr[1] = Long.valueOf(askx.i);
        objArr[2] = Long.valueOf(askx.j);
        if ((askx.a & 512) != 0) {
            askw askw = askx.k;
            if (askw == null) {
                askw = askw.c;
            }
            i = askw.b;
        }
        objArr[3] = Integer.valueOf(i);
        StringBuilder sb = new StringBuilder(String.format("FastPairLog{0x%06x, salted address=%s, duration=%dms, number of keys=%d", objArr));
        if ((askx.a & 2) != 0) {
            sb.append(", bond state=");
            int a2 = asos.a(askx.c);
            if (a2 == 0) {
                a2 = 1;
            }
            sb.append(Integer.toString(a2 - 1));
        }
        if ((4 & askx.a) != 0) {
            sb.append(", error code=");
            int a3 = asox.a(askx.d);
            if (a3 != 0) {
                i2 = a3;
            }
            sb.append(Integer.toString(i2 - 1));
            int i3 = askx.a;
            if ((i3 & 32) != 0) {
                sb.append(", bond event=");
                askt askt = askx.g;
                if (askt == null) {
                    askt = askt.d;
                }
                sb.append(askt);
            } else if ((i3 & 16) != 0) {
                sb.append(", br/edr event=");
                askr askr = askx.f;
                if (askr == null) {
                    askr = askr.c;
                }
                sb.append(askr);
            } else if ((i3 & 8) != 0) {
                sb.append(", gatt event=");
                askv askv = askx.e;
                if (askv == null) {
                    askv = askv.c;
                }
                sb.append(askv);
            } else if ((i3 & 64) != 0) {
                sb.append(", connection event=");
                asks asks = askx.h;
                if (asks == null) {
                    asks = asks.d;
                }
                sb.append(asks);
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public static String a(auwy auwy) {
        String str;
        if (auwy == null) {
            return "LoggedNearbyDiscovery{}";
        }
        StringBuilder sb = new StringBuilder("LoggedNearbyDiscovery{");
        asom a2 = asom.a(auwy.b);
        if (a2 == null) {
            a2 = asom.UNKNOWN_DISCOVERY_EVENT;
        }
        sb.append(a2);
        aucx aucx = auwy.d;
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            auwc auwc = (auwc) aucx.get(i);
            sb.append(",");
            if (auwc != null) {
                String str2 = auwc.b;
                int i2 = auwc.f;
                int i3 = auwc.g;
                double d = auwc.j;
                long j = auwc.k;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 133);
                sb2.append("LoggedDiscoveryItem{");
                sb2.append(str2);
                sb2.append(", rssi=");
                sb2.append(i2);
                sb2.append(", tx power=");
                sb2.append(i3);
                sb2.append(", distance=");
                sb2.append(d);
                sb2.append(", salted address=");
                sb2.append(j);
                sb2.append("}");
                str = sb2.toString();
            } else {
                str = "LoggedDiscoveryItem{}";
            }
            sb.append(str);
        }
        sb.append("}");
        return sb.toString();
    }
}
