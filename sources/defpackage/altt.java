package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: altt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class altt {
    private final Set a = new HashSet();

    public final boolean a(amjf amjf, amjf amjf2, alsg alsg, alsg alsg2) {
        if (amjf == null || amjf2 == null) {
            return amjf == null && amjf2 == null;
        }
        if (amjf.b != amje.REFERENCED_ID || amjf2.b != amje.REFERENCED_ID) {
            return aluw.a(amjf, amjf2);
        }
        altx b = ((alul) alsg).a(amjf.b());
        alsk a2 = alsg2.a(amjf2.b());
        alts alts = new alts(b, a2);
        if (this.a.contains(alts)) {
            return true;
        }
        this.a.add(alts);
        if (b == null) {
            return a2 == null;
        }
        return b.a(this, a2);
    }
}
