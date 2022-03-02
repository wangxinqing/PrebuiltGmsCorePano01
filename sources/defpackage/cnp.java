package defpackage;

import java.util.Set;

/* renamed from: cnp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cnp {
    private Long a;
    private Long b;
    private Set c;

    public final cnq a() {
        String str = this.a == null ? " delta" : "";
        if (this.b == null) {
            str = str.concat(" maxAllowedDelay");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" flags");
        }
        if (str.isEmpty()) {
            return new cnl(this.a.longValue(), this.b.longValue(), this.c);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public final void b() {
        this.b = 86400000L;
    }

    public final void a(long j) {
        this.a = Long.valueOf(j);
    }

    public final void a(Set set) {
        if (set != null) {
            this.c = set;
            return;
        }
        throw new NullPointerException("Null flags");
    }
}
