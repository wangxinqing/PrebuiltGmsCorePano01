package defpackage;

/* renamed from: tts  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tts {
    public Throwable a;
    private aspb b;
    private Long c;
    private Integer d;
    private Integer e;

    public final ttt a() {
        String str = this.b == null ? " eventCode" : "";
        if (this.c == null) {
            str = str.concat(" timestamp");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" numberAccountKeysOnProvider");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" numberDevicesOnFootprints");
        }
        if (str.isEmpty()) {
            return new ttv(this.b, this.c.longValue(), this.a, this.d.intValue(), this.e.intValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public final void b(int i) {
        this.e = Integer.valueOf(i);
    }

    public final void a(int i) {
        this.d = Integer.valueOf(i);
    }

    public final void a(long j) {
        this.c = Long.valueOf(j);
    }

    public final void a(aspb aspb) {
        if (aspb != null) {
            this.b = aspb;
            return;
        }
        throw new NullPointerException("Null eventCode");
    }
}
