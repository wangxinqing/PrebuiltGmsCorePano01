package defpackage;

/* renamed from: atqx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum atqx implements auco {
    UNKNOWN_SYNC_TYPE(0),
    DO_NOT_SYNC(1),
    SYNCABLE_TO_BACKEND(2),
    SYNCABLE_TO_BACKEND_ANONYMOUS_ACCOUNT_ONLY(3),
    SYNCABLE_TO_BACKEND_ACCOUNT_ONLY(4);
    
    public final int f;

    private atqx(int i) {
        this.f = i;
    }

    public static atqx a(int i) {
        if (i == 0) {
            return UNKNOWN_SYNC_TYPE;
        }
        if (i == 1) {
            return DO_NOT_SYNC;
        }
        if (i == 2) {
            return SYNCABLE_TO_BACKEND;
        }
        if (i == 3) {
            return SYNCABLE_TO_BACKEND_ANONYMOUS_ACCOUNT_ONLY;
        }
        if (i != 4) {
            return null;
        }
        return SYNCABLE_TO_BACKEND_ACCOUNT_ONLY;
    }

    public static aucq b() {
        return atqw.a;
    }

    public final int a() {
        return this.f;
    }

    public final String toString() {
        return Integer.toString(this.f);
    }
}
