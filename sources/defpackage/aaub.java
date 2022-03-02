package defpackage;

/* renamed from: aaub  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aaub implements auco {
    UNDEFINED(0),
    NEW_ACTIVITY_AFTER_SCREEN_OFF(1);
    
    public final int c;

    private aaub(int i) {
        this.c = i;
    }

    public static aaub a(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i != 1) {
            return null;
        }
        return NEW_ACTIVITY_AFTER_SCREEN_OFF;
    }

    public static aucq b() {
        return aaua.a;
    }

    public final int a() {
        return this.c;
    }

    public final String toString() {
        return Integer.toString(this.c);
    }
}
