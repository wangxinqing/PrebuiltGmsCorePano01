package defpackage;

import java.util.Map;

/* renamed from: apej  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apej {
    public apef a;
    public Map b;
    public apel c;
    private Integer d;
    private Integer e;
    private Integer f;
    private Integer g;
    private Integer h;

    /* access modifiers changed from: package-private */
    public final apek a() {
        String str = this.d == null ? " headerSize" : "";
        if (this.e == null) {
            str = str.concat(" flags");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" keyIndex");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" values");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" parentEntry");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" parent");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" typeChunkIndex");
        }
        if (str.isEmpty()) {
            return new apdj(this.d.intValue(), this.e.intValue(), this.f.intValue(), this.a, this.b, this.g.intValue(), this.c, this.h.intValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* access modifiers changed from: package-private */
    public final void b(int i) {
        this.d = Integer.valueOf(i);
    }

    /* access modifiers changed from: package-private */
    public final void c(int i) {
        this.f = Integer.valueOf(i);
    }

    /* access modifiers changed from: package-private */
    public final void d(int i) {
        this.g = Integer.valueOf(i);
    }

    /* access modifiers changed from: package-private */
    public final void e(int i) {
        this.h = Integer.valueOf(i);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i) {
        this.e = Integer.valueOf(i);
    }
}
