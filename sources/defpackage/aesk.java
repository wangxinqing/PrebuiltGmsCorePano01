package defpackage;

/* renamed from: aesk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aesk {
    public Integer a;
    private Integer b;
    private aeso c;
    private aeso d;
    private aeso e;
    private aeso f;
    private Boolean g;
    private Boolean h;

    public final aesl a() {
        String str = this.b == null ? " syncType" : "";
        if (this.c == null) {
            str = str.concat(" upSyncPolicy");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" upSyncWithListenerPolicy");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" downSyncPolicy");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" downSyncWithListenerPolicy");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" requiresCharging");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" requiresUnmetered");
        }
        if (str.isEmpty()) {
            return new aesh(this.b.intValue(), this.c, this.d, this.e, this.f, this.a, this.g.booleanValue(), this.h.booleanValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public final void b(aeso aeso) {
        if (aeso != null) {
            this.f = aeso;
            return;
        }
        throw new NullPointerException("Null downSyncWithListenerPolicy");
    }

    public final void c(aeso aeso) {
        if (aeso != null) {
            this.c = aeso;
            return;
        }
        throw new NullPointerException("Null upSyncPolicy");
    }

    public final void d(aeso aeso) {
        if (aeso != null) {
            this.d = aeso;
            return;
        }
        throw new NullPointerException("Null upSyncWithListenerPolicy");
    }

    public final void b(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    public final void a(int i) {
        this.b = Integer.valueOf(i);
    }

    public final void a(aeso aeso) {
        if (aeso != null) {
            this.e = aeso;
            return;
        }
        throw new NullPointerException("Null downSyncPolicy");
    }

    public final void a(boolean z) {
        this.g = Boolean.valueOf(z);
    }
}
