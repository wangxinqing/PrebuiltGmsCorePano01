package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: aluf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aluf extends altx implements alsl {
    private StringBuilder c;

    private aluf(aluf aluf, aluh aluh) {
        super(aluf.a, aluh, true);
        this.c = aluf.c;
    }

    private final amiw b(int i, int i2) {
        return aluv.a(d(), i, i2);
    }

    public final int a() {
        return this.c.length();
    }

    public final void a(String str, alss alss, alty alty) {
    }

    public final amiw g() {
        return aluv.a(d(), aluv.c);
    }

    public final amiw i() {
        if (this.c.length() > 0) {
            return b(0, this.c.length());
        }
        return aluv.a();
    }

    public final List k() {
        if (this.c.length() > 0) {
            return Collections.singletonList(b(0, this.c.toString()));
        }
        return Collections.emptyList();
    }

    public final int l() {
        return this.c.length() + 16;
    }

    public final Iterable o() {
        return Collections.emptyList();
    }

    /* access modifiers changed from: protected */
    public final void r() {
        this.c = new StringBuilder(this.c);
    }

    public aluf(aluh aluh, amjf amjf) {
        super(amjf, aluh, false);
        this.c = new StringBuilder();
    }

    private final amiw b(int i, String str) {
        return aluv.a(d(), i, str);
    }

    public final int a(alsn alsn) {
        return this.c.toString().hashCode();
    }

    public final alse a(int i, int i2) {
        if (i2 != i) {
            return this.b.a(b(i, i2), alss.d);
        }
        return alse.a;
    }

    public final String b(alsn alsn) {
        return this.c.toString();
    }

    public final alse a(int i, String str) {
        return this.b.a(b(i, str), alss.d);
    }

    public final alse a(String str) {
        amiw a = aluv.a(alyy.a(new alyz(this.c), new alza(str), d()).a);
        if (aluv.b(a)) {
            return alse.a;
        }
        return this.b.a(a, alss.d);
    }

    public final altx a(aluh aluh) {
        p();
        return new aluf(this, aluh);
    }

    public final amiw a(amiw amiw) {
        amiv amiv = amiv.KIND_NOT_SET;
        int ordinal = amiw.b.ordinal();
        if (ordinal == 3) {
            amir b = amiw.b();
            int i = b.b;
            return b(i, b.d.length() + i);
        } else if (ordinal == 5) {
            amik c2 = amiw.c();
            int i2 = c2.b;
            return b(i2, this.c.substring(i2, c2.c));
        } else {
            throw new IllegalStateException(amiw.toString());
        }
    }

    public final void a(amiw amiw, alss alss, alty alty) {
        boolean z;
        q();
        amiv amiv = amiv.KIND_NOT_SET;
        int ordinal = amiw.b.ordinal();
        if (ordinal == 3) {
            amir b = amiw.b();
            int i = b.b;
            int a = a();
            String str = b.d;
            if (i <= a) {
                this.c.insert(i, str);
                if (alty.a) {
                    alty.a((altj) new altn(this, alss, alty.d(), i, str));
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder(75);
            sb.append("Insert at index ");
            sb.append(i);
            sb.append(" starts after end of string (length ");
            sb.append(a);
            sb.append(")");
            throw new altb(sb.toString());
        } else if (ordinal != 5) {
            b(amiw);
        } else {
            amik c2 = amiw.c();
            int i2 = c2.b;
            int i3 = c2.c;
            int a2 = a();
            if (i3 >= i2) {
                z = true;
            } else {
                z = false;
            }
            alys.a(z, "Delete endIndex must be >= startIndex");
            if (i3 <= a2) {
                if (alty.a) {
                    alss alss2 = alss;
                    alty.a((altj) new altm(this, alss2, alty.d(), i2, this.c.subSequence(i2, i3).toString()));
                }
                this.c.delete(i2, i3);
                return;
            }
            StringBuilder sb2 = new StringBuilder(78);
            sb2.append("Delete [");
            sb2.append(i2);
            sb2.append(",");
            sb2.append(i3);
            sb2.append(") ends after end of string (length ");
            sb2.append(a2);
            sb2.append(")");
            throw new altb(sb2.toString());
        }
    }

    public final boolean a(altt altt, alsk alsk) {
        if (alsk instanceof alsl) {
            return this.c.toString().equals(((alsl) alsk).toString());
        }
        return false;
    }
}
