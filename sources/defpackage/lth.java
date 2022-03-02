package defpackage;

import android.util.Log;
import java.util.Map;

/* renamed from: lth  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
enum lth implements lti {
    MAJOR_CLASS,
    CLASS;
    
    private static final anaf c = null;

    static {
        c = anaf.a("=", ltg.a);
    }

    public final amrm a(ltl ltl) {
        Integer num;
        ampx ampx = (ampx) ltl.a((Map) c);
        try {
            num = Integer.valueOf(Integer.parseInt(ltl.a, 16));
        } catch (NumberFormatException e) {
            Log.w("CAR.BT", "Could not parse value", e);
            num = null;
        }
        return new ltc(this, ampx, num);
    }
}
