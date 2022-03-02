package defpackage;

/* renamed from: yba  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yba {
    public String a;
    public int b;
    private Long c;
    private Long d;
    private Integer e;
    private Integer f;
    private Boolean g;

    public final xli a() {
        String str = this.a == null ? " name" : "";
        if (this.c == null) {
            str = str.concat(" startTimeMicroSec");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" timeDurationMicroSec");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" subEventCount");
        }
        if (this.b == 0) {
            str = String.valueOf(str).concat(" networkType");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" payloadSize");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" networkEvent");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
        }
        yas yas = new yas(this.a, this.c.longValue(), this.d.longValue(), this.e.intValue(), this.b, this.f.intValue(), this.g.booleanValue());
        aucd o = xli.g.o();
        String str2 = yas.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        xli xli = (xli) o.b;
        str2.getClass();
        xli.a |= 1;
        xli.b = str2;
        long j = yas.b;
        xli xli2 = (xli) o.b;
        xli2.a |= 2;
        xli2.c = j;
        long j2 = yas.c;
        xli xli3 = (xli) o.b;
        xli3.a |= 4;
        xli3.d = j2;
        int i = yas.d;
        xli xli4 = (xli) o.b;
        xli4.a |= 8;
        xli4.e = i;
        if (ayrz.a.a().a() || yas.e) {
            aucd o2 = xlh.d.o();
            int i2 = yas.f;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            xlh xlh = (xlh) o2.b;
            int i3 = i2 - 1;
            if (i2 != 0) {
                xlh.b = i3;
                xlh.a |= 1;
                int i4 = yas.d;
                xlh xlh2 = (xlh) o2.b;
                xlh2.a |= 2;
                xlh2.c = i4;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                xli xli5 = (xli) o.b;
                xlh xlh3 = (xlh) o2.i();
                xlh3.getClass();
                xli5.f = xlh3;
                xli5.a |= 16;
            } else {
                throw null;
            }
        }
        return (xli) o.i();
    }

    public final void b(int i) {
        this.e = Integer.valueOf(i);
    }

    public final void b(long j) {
        this.d = Long.valueOf(j);
    }

    public final void a(int i) {
        this.f = Integer.valueOf(i);
    }

    public final void a(long j) {
        this.c = Long.valueOf(j);
    }

    public final void a(boolean z) {
        this.g = Boolean.valueOf(z);
    }
}
