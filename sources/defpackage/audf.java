package defpackage;

/* renamed from: audf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class audf {
    protected volatile audx a;
    public volatile auay b;

    static {
        aubs.b();
    }

    public final auay a() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                auay auay = this.b;
                return auay;
            }
            if (this.a != null) {
                this.b = this.a.au();
            } else {
                this.b = auay.b;
            }
            auay auay2 = this.b;
            return auay2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof audf)) {
            return false;
        }
        audf audf = (audf) obj;
        audx audx = this.a;
        audx audx2 = audf.a;
        if (audx == null && audx2 == null) {
            return a().equals(audf.a());
        }
        if (audx != null && audx2 != null) {
            return audx.equals(audx2);
        }
        if (audx == null) {
            return a(audx2.j()).equals(audx2);
        }
        return audx.equals(audf.a(audx.j()));
    }

    public int hashCode() {
        return 1;
    }

    public final audx a(audx audx) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = audx;
                        this.b = auay.b;
                    } catch (auda e) {
                        this.a = audx;
                        this.b = auay.b;
                    }
                }
            }
        }
        return this.a;
    }
}
