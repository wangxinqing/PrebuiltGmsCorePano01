package defpackage;

import java.util.Set;

/* renamed from: afca  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afca {
    private final awdn a;
    private final awdn b;

    public afca(awdn awdn, awdn awdn2) {
        this.b = awdn;
        this.a = awdn2;
    }

    public final void a() {
        for (afbz b2 : (Set) this.b.a()) {
            try {
                b2.b();
            } catch (Exception e) {
                ((pdg) this.a.a()).a("MDH database wipe out failed", e);
            }
        }
    }
}
