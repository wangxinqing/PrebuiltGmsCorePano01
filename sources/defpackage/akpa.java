package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: akpa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akpa {
    public akrg a;
    public final akyn b;
    public final akrq c;
    public final ou d = new ou(this.f.size() + this.e.size());
    public final List e = Arrays.asList(azcf.a.a().i().split(","));
    public final List f = Arrays.asList(azbk.a.a().i().split(","));

    public akpa(akyn akyn, akrq akrq) {
        this.b = akyn;
        this.c = akrq;
    }

    public final List a(int i) {
        if (i != 100) {
            return i != 110 ? Collections.emptyList() : this.f;
        }
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, akrf akrf) {
        List<String> a2 = a(i);
        if (a2 != null && !a2.isEmpty()) {
            for (String str : a2) {
                if (this.d.containsKey(str)) {
                    ((akrh) this.d.get(str)).b(akrf);
                }
            }
        }
    }
}
