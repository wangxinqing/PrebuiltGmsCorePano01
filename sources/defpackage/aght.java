package defpackage;

/* renamed from: aght  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aght {
    private Boolean a;
    private Integer b;
    private aghu c;
    private Boolean d;

    public final aghw a() {
        String str = this.a == null ? " enabled" : "";
        if (this.b == null) {
            str = str.concat(" sampleRatePerSecond");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" dynamicSampler");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" recordTimerDuration");
        }
        if (str.isEmpty()) {
            return new agdi(this.a.booleanValue(), this.b.intValue(), this.c, this.d.booleanValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public final void b(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    public final void a(int i) {
        this.b = Integer.valueOf(i);
    }

    public final void a(aghu aghu) {
        if (aghu != null) {
            this.c = aghu;
            return;
        }
        throw new NullPointerException("Null dynamicSampler");
    }

    public final void a(boolean z) {
        this.a = Boolean.valueOf(z);
    }
}
