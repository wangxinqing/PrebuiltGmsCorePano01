package defpackage;

/* renamed from: aeja  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeja {
    public amri a;
    private Boolean b;
    private Long c;
    private amri d;

    public aeja() {
    }

    public final aejb a() {
        String str = this.b == null ? " autoConnect" : "";
        if (this.c == null) {
            str = str.concat(" connectionTimeoutMillis");
        }
        if (str.isEmpty()) {
            return new aeio(this.b.booleanValue(), this.c.longValue(), this.d, this.a);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public final void b() {
        this.b = false;
    }

    public aeja(byte[] bArr) {
        this.d = ampu.a;
        this.a = ampu.a;
    }

    public final void a(long j) {
        this.c = Long.valueOf(j);
    }
}
