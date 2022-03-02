package defpackage;

/* renamed from: aaym  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaym {
    public String a;
    private Boolean b;
    private Boolean c;
    private Long d;
    private Integer e;
    private Boolean f;
    private Long g;

    public final aayn a() {
        String str = this.b == null ? " jpegMissing" : "";
        if (this.c == null) {
            str = str.concat(" jpegTampered");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" jpegWrongLength");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" jpegTamperedBytes");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" jpegNewlyTampered");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" jpegModificationTime");
        }
        if (str.isEmpty()) {
            return new aaxj(this.b.booleanValue(), this.c.booleanValue(), this.d.longValue(), this.e.intValue(), this.f.booleanValue(), this.a, this.g.longValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public final void b(long j) {
        this.d = Long.valueOf(j);
    }

    public final void c(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    public final void b(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    public final void a(int i) {
        this.e = Integer.valueOf(i);
    }

    public final void a(long j) {
        this.g = Long.valueOf(j);
    }

    public final void a(boolean z) {
        this.b = Boolean.valueOf(z);
    }
}
