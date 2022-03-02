package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: alug  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alug extends altx implements Comparable, alsp {
    private static final amip d = aluv.c("").g();
    public String c;
    private int e;
    private amii f;

    private alug(alug alug, aluh aluh) {
        super(alug.a, aluh, false);
        this.e = alug.e;
        this.c = alug.c;
        this.f = alug.f;
    }

    private final amiw a(String str, int i, amii amii) {
        return aluv.a(d(), str, i, amii);
    }

    public final String a() {
        return this.c;
    }

    public final int b() {
        return this.e;
    }

    public final boolean c() {
        return this.f == amii.SHIFT_TO_INVALID;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return alsp.Dt.compare(this, (alug) obj);
    }

    public final amiw g() {
        return aluv.a(d(), aluv.d);
    }

    public final amiw i() {
        if (this.c.isEmpty() && this.e == -1) {
            return aluv.a();
        }
        return a("", -1, amii.SHIFT_AFTER_DELETE);
    }

    public final List k() {
        if (this.c.isEmpty() && this.e == -1 && this.f == amii.SHIFT_AFTER_DELETE) {
            return Collections.emptyList();
        }
        return Collections.singletonList(a(this.c, this.e, this.f));
    }

    public final int l() {
        return this.c.length() + 32;
    }

    public final amii n() {
        return this.f;
    }

    public final Iterable o() {
        if (this.c.isEmpty()) {
            return Collections.emptyList();
        }
        return Collections.singletonList(this.b.b(this.c).a);
    }

    /* access modifiers changed from: protected */
    public final void r() {
    }

    public alug(aluh aluh, amjf amjf) {
        super(amjf, aluh, false);
        this.e = d.c;
        this.c = d.b;
        this.f = d.d;
    }

    private final void a(int i, alss alss, String str, alty alty) {
        String str2;
        if (this.e != i || !alyr.a(this.c, str)) {
            String str3 = this.c;
            int i2 = this.e;
            this.e = i;
            if (!alyr.a(str, str3)) {
                if (!this.c.isEmpty()) {
                    b(this.b.b(this.c).a);
                }
                Map map = (Map) ((alul) this.b).b.a.get(this.c);
                if (map != null) {
                    map.remove(d());
                }
                this.c = str;
                if (!str.isEmpty()) {
                    altx b = this.b.b(this.c);
                    if (b == null) {
                        a(this.c, alss, alty);
                    } else {
                        a(b.e());
                        ((alul) this.b).b.a(this);
                    }
                }
                str2 = str;
            } else {
                str2 = str3;
            }
            if (alty.a) {
                alty.a((altj) new altl(this, alss, alty.d(), str2, i, i2, str3));
            }
        }
    }

    public final String b(alsn alsn) {
        String d2 = d();
        String str = this.c;
        int i = this.e;
        String valueOf = String.valueOf(this.f);
        int length = String.valueOf(d2).length();
        StringBuilder sb = new StringBuilder(length + 28 + String.valueOf(str).length() + String.valueOf(valueOf).length());
        sb.append("IndexRef [");
        sb.append(d2);
        sb.append(" -> ");
        sb.append(str);
        sb.append("@");
        sb.append(i);
        sb.append(" ");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final int a(alsn alsn) {
        return Arrays.hashCode(new Object[]{d(), Integer.valueOf(this.e), this.f});
    }

    public final altx a(aluh aluh) {
        return new alug(this, aluh);
    }

    public final amiw a(amiw amiw) {
        a(amiw, amiv.INDEX);
        return a(this.c, this.e, this.f);
    }

    public final void a(int i) {
        this.b.a(a(this.c, i, this.f), alss.d);
    }

    public final void a(amiw amiw, alss alss, alty alty) {
        amiv amiv = amiv.KIND_NOT_SET;
        int ordinal = amiw.b.ordinal();
        if (ordinal == 3) {
            amir b = amiw.b();
            int i = this.e;
            if (i >= b.b) {
                i += aluv.a(b);
            }
            a(i, alss, this.c, alty);
        } else if (ordinal == 5) {
            amik c2 = amiw.c();
            int i2 = c2.b;
            int i3 = c2.c;
            int i4 = i3 - i2;
            int i5 = this.e;
            if (i5 < i2 || i5 >= i3) {
                if (i5 >= i3) {
                    i5 -= i4;
                }
            } else if (alss.a()) {
                b(aluv.a("", c2));
            } else {
                i5 = alsq.a(this.e, c2, this.f, 2);
            }
            a(i5, alss, this.c, alty);
        } else if (ordinal == 6) {
        } else {
            if (ordinal == 8) {
                amit f2 = amiw.f();
                int i6 = this.e;
                if (amiw.c.equals(this.c)) {
                    int i7 = f2.b;
                    int i8 = this.e;
                    if (i7 == i8) {
                        a(aluv.a(amiw), alss, f2.d, alty);
                        return;
                    } else if (i7 < i8) {
                        i6--;
                    }
                }
                if (f2.d.equals(this.c) && f2.c <= this.e) {
                    i6++;
                }
                if (i6 != this.e) {
                    a(i6, alss, this.c, alty);
                }
            } else if (ordinal != 9) {
                b(amiw);
            } else {
                amip g = amiw.g();
                this.f = g.d;
                a(g.c, alss, g.b, alty);
            }
        }
    }

    public final void a(String str, alss alss, alty alty) {
        if (this.c.equals(str)) {
            this.c = "";
            this.e = -1;
            this.f = amii.SHIFT_AFTER_DELETE;
        }
    }

    public final boolean a(altt altt, alsk alsk) {
        if (!(alsk instanceof alsp)) {
            return false;
        }
        alsp alsp = (alsp) alsk;
        return alyr.a(this.c, alsp.a(), Integer.valueOf(this.e), Integer.valueOf(alsp.b()), this.f, alsp.n());
    }
}
