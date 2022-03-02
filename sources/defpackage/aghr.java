package defpackage;

/* renamed from: aghr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aghr {
    public aorv a;
    public Integer b;
    public Integer c;
    public Integer d;
    public Boolean e;
    public aghp f;

    public final aghs a() {
        String str = this.b == null ? " primesInitializationPriority" : "";
        if (this.c == null) {
            str = str.concat(" primesMetricExecutorPriority");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" primesMetricExecutorPoolSize");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" enableEarlyTimers");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
        }
        agdh agdh = new agdh(this.a, this.b.intValue(), this.c.intValue(), this.d.intValue(), this.f, this.e.booleanValue());
        int i = agdh.a;
        boolean z = false;
        if (i > 0 && i <= 2) {
            z = true;
        }
        amrl.b(z, "Thread pool size must be less than or equal to %s", 2);
        return agdh;
    }
}
