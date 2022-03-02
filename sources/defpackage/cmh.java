package defpackage;

import java.util.Map;

/* renamed from: cmh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cmh {
    public Integer a;
    public Map b;
    private String c;
    private cmg d;
    private Long e;
    private Long f;

    public final cmi a() {
        String str = this.c == null ? " transportName" : "";
        if (this.d == null) {
            str = str.concat(" encodedPayload");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" eventMillis");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" uptimeMillis");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" autoMetadata");
        }
        if (str.isEmpty()) {
            return new cmd(this.c, this.a, this.d, this.e.longValue(), this.f.longValue(), this.b);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public final void b(long j) {
        this.f = Long.valueOf(j);
    }

    public final void a(long j) {
        this.e = Long.valueOf(j);
    }

    public final void a(cmg cmg) {
        if (cmg != null) {
            this.d = cmg;
            return;
        }
        throw new NullPointerException("Null encodedPayload");
    }

    public final void a(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null transportName");
    }
}
