package defpackage;

import java.util.Map;

/* renamed from: ltk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
enum ltk implements lti {
    MAC,
    NAME;
    
    private static final anaf c = null;

    static {
        c = anaf.a("=", ltj.EQUALS, "^=", ltj.STARTS_WITH, "$=", ltj.ENDS_WITH, "*=", ltj.CONTAINS);
    }

    public final amrm a(ltl ltl) {
        return new ltc(this, (ampx) ltl.a((Map) c), ltl.a);
    }
}
