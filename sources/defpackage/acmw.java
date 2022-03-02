package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: acmw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acmw {
    public static final iwd a = acqa.a("Setup", "UI", "PeopleLoader");
    public icc b;
    public final Map c = new HashMap();
    public final Map d = new HashMap();
    public final Set e = new HashSet();
    public final qub f;
    private final ica g = new acmr(this);
    private final icb h = new acms();

    public acmw(Context context) {
        if (!azjq.b()) {
            ica ica = this.g;
            icb icb = this.h;
            wlr wlr = new wlr();
            wlr.a = 80;
            wls a2 = wlr.a();
            ibz ibz = new ibz(context);
            ibz.a(wlt.a, (ibj) a2);
            ibz.a(ica);
            ibz.a(icb);
            this.b = ibz.b();
        }
        this.f = acpd.a(context);
    }
}
