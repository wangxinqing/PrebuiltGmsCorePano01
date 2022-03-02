package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: alud  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alud extends altx implements alsi {
    public volatile List c;
    public int d;

    private alud(alud alud, aluh aluh) {
        super(alud.a, aluh, true);
        this.d = 0;
        this.c = alud.c;
        this.d = alud.d;
    }

    private final amiw a(int i, Iterable iterable) {
        return aluv.a(d(), i, iterable);
    }

    private final amiw b(int i, int i2) {
        return aluv.a(d(), i, i2);
    }

    public final amiw g() {
        return aluv.a(d(), aluv.b);
    }

    public final amiw i() {
        if (a() > 0) {
            return b(0, a());
        }
        return aluv.a();
    }

    public final List k() {
        if (a() == 0) {
            return Collections.emptyList();
        }
        return Collections.singletonList(a(0, (Iterable) this.c));
    }

    public final int l() {
        return this.d + 24;
    }

    /* access modifiers changed from: protected */
    public final Iterable o() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public final void r() {
        this.c = new ArrayList(this.c);
    }

    public alud(aluh aluh, amjf amjf) {
        super(amjf, aluh, false);
        this.d = 0;
        this.c = new ArrayList();
    }

    private final void a(amik amik, alss alss, alty alty) {
        boolean z;
        int i = amik.b;
        int i2 = amik.c;
        int a = a();
        if (i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        alys.a(z, "Delete endIndex must be >= startIndex");
        if (i2 <= a) {
            List<amjf> subList = this.c.subList(i, i2);
            if (alty.a) {
                alty.a((altj) new altq(this, alss, alty.d(), i, new ArrayList(subList), (alsi) null, (Integer) null));
            }
            for (amjf amjf : subList) {
                this.d -= aluw.a(amjf);
                b(amjf);
            }
            subList.clear();
            return;
        }
        StringBuilder sb = new StringBuilder(74);
        sb.append("Delete [");
        sb.append(i);
        sb.append(",");
        sb.append(i2);
        sb.append(") ends after end of list (size ");
        sb.append(a);
        sb.append(")");
        throw new altb(sb.toString());
    }

    private final amiw b(int i, Iterable iterable) {
        return aluv.b(d(), i, iterable);
    }

    public final String b(alsn alsn) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        List list = this.c;
        int size = list.size();
        boolean z = true;
        int i = 0;
        while (i < size) {
            amjf amjf = (amjf) list.get(i);
            if (!z) {
                sb.append(", ");
            }
            sb.append((String) alsn.a(amjf));
            i++;
            z = false;
        }
        sb.append("]");
        return sb.toString();
    }

    public final List b() {
        return Collections.unmodifiableList(this.c);
    }

    public final int a() {
        return this.c.size();
    }

    public final int a(alsn alsn) {
        List list = this.c;
        int size = list.size();
        int i = 17;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 37) + ((Integer) alsn.a((amjf) list.get(i2))).intValue();
        }
        return i;
    }

    public final alse a(int i, int i2) {
        return this.b.a(b(i, i2), alss.d);
    }

    public final alse a(int i, alsi alsi, int i2) {
        if (i < 0 || i >= a() || i2 > alsi.a()) {
            int a = a();
            int a2 = alsi.a();
            StringBuilder sb = new StringBuilder(85);
            sb.append("srcIndex: ");
            sb.append(i);
            sb.append(" srcSize: ");
            sb.append(a);
            sb.append("destIndex: ");
            sb.append(i2);
            sb.append("destSize: ");
            sb.append(a2);
            throw new altb(sb.toString());
        }
        return this.b.a(aluv.a(d(), i, alsi.d(), i2), alss.d);
    }

    public final alse a(int i, Collection collection) {
        if (!collection.isEmpty()) {
            return this.b.a(a(i, (Iterable) collection), alss.d);
        }
        return alse.a;
    }

    public final alse a(int i, List list) {
        return this.b.a(b(i, (Iterable) list), alss.d);
    }

    public final altx a(aluh aluh) {
        p();
        return new alud(this, aluh);
    }

    public final amiw a(amiw amiw) {
        amiv amiv = amiv.KIND_NOT_SET;
        int ordinal = amiw.b.ordinal();
        if (ordinal == 3) {
            amir b = amiw.b();
            int i = b.b;
            return b(i, b.a() + i);
        } else if (ordinal == 5) {
            amik c2 = amiw.c();
            int i2 = c2.b;
            return a(i2, (Iterable) this.c.subList(i2, c2.c));
        } else if (ordinal == 6) {
            amjl d2 = amiw.d();
            int i3 = d2.b;
            List list = this.c;
            int i4 = d2.b;
            return b(i3, (Iterable) list.subList(i4, d2.a() + i4));
        } else {
            throw new IllegalStateException(amiw.toString());
        }
    }

    public final amjf a(int i) {
        return (amjf) this.c.get(i);
    }

    public final void a(amiw amiw, alss alss, alty alty) {
        ArrayList arrayList;
        ArrayList arrayList2;
        q();
        amiv amiv = amiv.KIND_NOT_SET;
        int ordinal = amiw.b.ordinal();
        if (ordinal == 3) {
            amir b = amiw.b();
            int i = b.b;
            int a = a();
            List<amjf> b2 = b.b();
            if (i <= a) {
                this.c.addAll(i, b2);
                for (amjf amjf : b2) {
                    this.d += aluw.a(amjf);
                    a(amjf);
                }
                if (alty.a) {
                    alty.a((altj) new altp(this, alss, alty.d(), i, b2, (alsi) null, (Integer) null));
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder(71);
            sb.append("Insert at index ");
            sb.append(i);
            sb.append(" starts after end of list (size ");
            sb.append(a);
            sb.append(")");
            throw new altb(sb.toString());
        } else if (ordinal == 5) {
            a(amiw.c(), alss, alty);
        } else if (ordinal != 6) {
            b(amiw);
        } else {
            amjl d2 = amiw.d();
            int i2 = d2.b;
            if (alty.a) {
                arrayList = new ArrayList();
            } else {
                arrayList = null;
            }
            if (alty.a) {
                arrayList2 = new ArrayList();
            } else {
                arrayList2 = null;
            }
            for (amjf amjf2 : d2.b()) {
                amjf amjf3 = (amjf) this.c.get(i2);
                this.c.set(i2, amjf2);
                int a2 = this.d - aluw.a(amjf3);
                this.d = a2;
                this.d = a2 + aluw.a(amjf2);
                a(amjf2);
                b(amjf3);
                if (!(arrayList2 == null || arrayList == null)) {
                    arrayList.add(amjf2);
                    arrayList2.add(amjf3);
                }
                i2++;
            }
            if (alty.a) {
                alty.a((altj) new altr(this, alss, alty.d(), d2.b, arrayList, arrayList2));
            }
        }
    }

    public final void a(String str, alss alss, alty alty) {
        Collection<alsp> values = ((alul) this.b).b.b(d()).values();
        int i = 0;
        while (i < this.c.size()) {
            if (aluw.a(str, (amjf) this.c.get(i))) {
                amiw a = aluv.a(d(), i, i + 1);
                if (!values.isEmpty()) {
                    for (alsp alsp : values) {
                        ((alug) alsp).a(a, alss, alty);
                    }
                }
                a(a.c(), alss, alty);
                i--;
            }
            i++;
        }
    }

    public final boolean a(altt altt, alsk alsk) {
        if (alsk instanceof alud) {
            alud alud = (alud) alsk;
            if (a() == alud.a()) {
                for (int i = 0; i < a(); i++) {
                    if (!altt.a(a(i), alud.a(i), this.b, alud.b)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
