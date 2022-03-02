package defpackage;

import java.util.HashSet;

/* renamed from: hb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hb {
    final /* synthetic */ hl a;

    public hb(hl hlVar) {
        this.a = hlVar;
    }

    public final void a(gj gjVar, mo moVar) {
        hl hlVar = this.a;
        if (hlVar.h.get(gjVar) == null) {
            hlVar.h.put(gjVar, new HashSet());
        }
        ((HashSet) hlVar.h.get(gjVar)).add(moVar);
    }

    public final void b(gj gjVar, mo moVar) {
        if (!moVar.a()) {
            hl hlVar = this.a;
            HashSet hashSet = (HashSet) hlVar.h.get(gjVar);
            if (hashSet != null && hashSet.remove(moVar) && hashSet.isEmpty()) {
                hlVar.h.remove(gjVar);
                if (gjVar.m < 3) {
                    hlVar.b(gjVar);
                    hlVar.c(gjVar);
                }
            }
        }
    }
}
