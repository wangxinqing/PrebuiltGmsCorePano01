package defpackage;

/* renamed from: arfq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum arfq implements auco {
    UNKNOWN_NON_UI_CONTEXT(0),
    DRIVING_MODE_GEARHEAD_SETTING_COPIER(1),
    DRIVING_MODE_DND_SETTING_COPIER(2),
    DRIVING_MODE_LOCATION(3);
    
    public final int e;

    private arfq(int i) {
        this.e = i;
    }

    public static arfq a(int i) {
        if (i == 0) {
            return UNKNOWN_NON_UI_CONTEXT;
        }
        if (i == 1) {
            return DRIVING_MODE_GEARHEAD_SETTING_COPIER;
        }
        if (i == 2) {
            return DRIVING_MODE_DND_SETTING_COPIER;
        }
        if (i != 3) {
            return null;
        }
        return DRIVING_MODE_LOCATION;
    }

    public static aucq b() {
        return arfp.a;
    }

    public final int a() {
        return this.e;
    }

    public final String toString() {
        return Integer.toString(this.e);
    }
}
