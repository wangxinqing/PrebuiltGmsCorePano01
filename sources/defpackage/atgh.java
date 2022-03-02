package defpackage;

/* renamed from: atgh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class atgh implements atgo {
    private static final String a = atgh.class.getSimpleName();
    private int b;
    volatile long c = 0;

    private final String h() {
        int a2 = a();
        if (a2 == 7) {
            return "BILLING_POINT_REQUEST";
        }
        if (a2 == 15) {
            return "COOKIE_REQUEST";
        }
        if (a2 == 36) {
            return "LAYER_TILE_REQUEST";
        }
        if (a2 == 45) {
            return "STREET_VIEW_REPORT";
        }
        if (a2 == 50) {
            return "REVERSE_GEOCODE_REQUEST";
        }
        if (a2 == 62) {
            return "CLIENT_PROPERTIES_2_REQUEST";
        }
        if (a2 == 75) {
            return "CLIENT_PARAMETERS_REQUEST";
        }
        if (a2 == 108) {
            return "MAP_TILE_4_REQUEST";
        }
        if (a2 == 118) {
            return "INDOOR_BUILDING_REQUEST";
        }
        if (a2 == 132) {
            return "API_TOKEN_REQUEST";
        }
        if (a2 == 39) {
            return "RESOURCE_REQUEST";
        }
        if (a2 == 40) {
            return "STREETVIEW_REQUEST";
        }
        if (a2 == 147) {
            return "API_QUOTA_EVENT_REQUEST";
        }
        if (a2 == 148) {
            return "LAYER_METADATA_REQUEST";
        }
        StringBuilder sb = new StringBuilder(24);
        sb.append("UNKNOWN_TYPE ");
        sb.append(a2);
        return sb.toString();
    }

    public boolean b() {
        throw null;
    }

    public void c() {
        a("onComplete");
    }

    public boolean d() {
        boolean z;
        a("onRetry");
        synchronized (this) {
            if (this.b < 3) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final synchronized void e() {
        this.b++;
    }

    public final void f() {
        a("onPermanentFailure");
    }

    public final void g() {
        if (atfx.a(a, 3)) {
            String valueOf = String.valueOf(h());
            if (valueOf.length() == 0) {
                new String("REQUEST  type = ");
            } else {
                "REQUEST  type = ".concat(valueOf);
            }
        }
        this.c = System.currentTimeMillis();
    }

    public String toString() {
        return h();
    }

    public atgh() {
        synchronized (this) {
            this.b = 0;
        }
    }

    public final void a(String str) {
        long currentTimeMillis = System.currentTimeMillis() - this.c;
        if (this.c > 0) {
            if (atfx.a(a, 3)) {
                String h = h();
                StringBuilder sb = new StringBuilder(str.length() + 44 + String.valueOf(h).length());
                sb.append(str);
                sb.append(", ");
                sb.append(h);
                sb.append(", elapsed time (ms) = ");
                sb.append(currentTimeMillis);
                sb.toString();
            }
        } else if (atfx.a(a, 3)) {
            String h2 = h();
            StringBuilder sb2 = new StringBuilder(str.length() + 19 + String.valueOf(h2).length());
            sb2.append(str);
            sb2.append(", ");
            sb2.append(h2);
            sb2.append(", no request time");
            sb2.toString();
        }
    }
}
