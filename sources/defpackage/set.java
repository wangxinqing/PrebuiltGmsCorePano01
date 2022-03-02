package defpackage;

/* renamed from: set  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum set implements auco {
    UNKNOWN(0),
    PROFILE_FORCE_SYNC(1),
    PROFILE_UPDATE_PERSON_ME(2),
    PROFILE_UPDATE_PHOTO_ME(3);
    
    public final int e;

    private set(int i) {
        this.e = i;
    }

    public static set a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return PROFILE_FORCE_SYNC;
        }
        if (i == 2) {
            return PROFILE_UPDATE_PERSON_ME;
        }
        if (i != 3) {
            return null;
        }
        return PROFILE_UPDATE_PHOTO_ME;
    }

    public static aucq b() {
        return ses.a;
    }

    public final int a() {
        return this.e;
    }

    public final String toString() {
        return Integer.toString(this.e);
    }
}
