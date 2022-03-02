package defpackage;

/* renamed from: ovg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum ovg implements auco {
    GENERAL_USE(0),
    SEARCHED_USE(1),
    GLOBAL_SEARCH_USE(2),
    USAGE_ENDED_USE(3),
    CONTEXT_ONLY_USE(4),
    FIREBASE_USER_ACTIONS_USE(5);
    
    public final int g;

    private ovg(int i) {
        this.g = i;
    }

    public static ovg a(int i) {
        if (i == 0) {
            return GENERAL_USE;
        }
        if (i == 1) {
            return SEARCHED_USE;
        }
        if (i == 2) {
            return GLOBAL_SEARCH_USE;
        }
        if (i == 3) {
            return USAGE_ENDED_USE;
        }
        if (i == 4) {
            return CONTEXT_ONLY_USE;
        }
        if (i != 5) {
            return null;
        }
        return FIREBASE_USER_ACTIONS_USE;
    }

    public static aucq b() {
        return ovf.a;
    }

    public final int a() {
        return this.g;
    }

    public final String toString() {
        return Integer.toString(this.g);
    }
}
