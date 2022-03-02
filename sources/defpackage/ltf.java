package defpackage;

import android.util.Log;
import java.util.Map;

/* renamed from: ltf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
enum ltf implements lti {
    ;
    
    private static final anaf b = null;

    static {
        b = anaf.a("=[]", lte.IS_EMPTY, "*=", lte.CONTAINS);
    }

    /* access modifiers changed from: public */
    ltf(String str) {
    }

    public final amrm a(ltl ltl) {
        ampx ampx = (ampx) ltl.a((Map) b);
        Long l = null;
        if (ampx != lte.IS_EMPTY) {
            try {
                l = Long.valueOf(Long.parseLong(ltl.a, 16));
            } catch (NumberFormatException e) {
                Log.w("CAR.BT", "Could not parse value", e);
            }
        }
        return new ltc(this, ampx, l);
    }
}
