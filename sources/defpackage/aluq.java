package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* renamed from: aluq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aluq extends alua {
    private final aluh e;

    public aluq(aluh aluh) {
        super(new alul((alul) aluh).b, (alsu) null, alss.d, true);
        this.e = aluh;
    }

    public final alse a() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void a(alsk alsk) {
    }

    public final void a(String str, altz altz) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void b(amiw amiw) {
    }

    public final boolean b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void c(amiw amiw) {
    }

    /* access modifiers changed from: protected */
    public final void f(amiw amiw) {
        String str = amiw.c;
        altx a = this.a.a(str, true);
        if (a != null) {
            a.a(amiw, this.c, this.d);
            a(str, amiw);
            return;
        }
        String valueOf = String.valueOf(amiw);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(valueOf).length());
        sb.append("No object with ID ");
        sb.append(str);
        sb.append(" when applying: ");
        sb.append(valueOf);
        throw new altd(sb.toString());
    }

    public final alse a(amiw amiw) {
        d(amiw);
        ArrayList arrayList = new ArrayList(this.d.a().size());
        for (altj altj : this.d.a()) {
            arrayList.add(altj.a(this.e.b(altj.a.d())));
        }
        return new alse(arrayList, (Collection) null, (Set) null, (amiw) null, (alsw) null, (amiw) null, (alsh) null);
    }
}
