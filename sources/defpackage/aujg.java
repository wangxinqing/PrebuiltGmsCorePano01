package defpackage;

/* renamed from: aujg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aujg implements auco {
    SEMANTIC_UNKNOWN(0),
    SEMANTIC_REROUTE_SOURCE(1),
    SEMANTIC_REROUTE_PROPOSED(2),
    SEMANTIC_REROUTE_TAKEN(3),
    SEMANTIC_HOME(4),
    SEMANTIC_WORK(5),
    SEMANTIC_ONBOARD_TRANSIT(6),
    SEMANTIC_MAPS_SEARCH(7),
    SEMANTIC_FREQUENT_PLACE(8),
    SEMANTIC_OTHER(9);
    
    public final int k;

    private aujg(int i) {
        this.k = i;
    }

    public static aujg a(int i) {
        switch (i) {
            case 0:
                return SEMANTIC_UNKNOWN;
            case 1:
                return SEMANTIC_REROUTE_SOURCE;
            case 2:
                return SEMANTIC_REROUTE_PROPOSED;
            case 3:
                return SEMANTIC_REROUTE_TAKEN;
            case 4:
                return SEMANTIC_HOME;
            case 5:
                return SEMANTIC_WORK;
            case 6:
                return SEMANTIC_ONBOARD_TRANSIT;
            case 7:
                return SEMANTIC_MAPS_SEARCH;
            case 8:
                return SEMANTIC_FREQUENT_PLACE;
            case 9:
                return SEMANTIC_OTHER;
            default:
                return null;
        }
    }

    public static aucq b() {
        return aujf.a;
    }

    public final int a() {
        return this.k;
    }

    public final String toString() {
        return Integer.toString(this.k);
    }
}
