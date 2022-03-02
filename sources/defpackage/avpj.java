package defpackage;

/* renamed from: avpj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum avpj implements auco {
    UNKNOWN(0),
    SUCCESS(1),
    INVALID_BAD_ID(2),
    INVALID_BAD_CLIENT(3),
    INVALID_CHANGED_RECENTLY(4),
    INVALID_SERVER_ERROR(5);
    
    public final int g;

    private avpj(int i) {
        this.g = i;
    }

    public static avpj a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return SUCCESS;
        }
        if (i == 2) {
            return INVALID_BAD_ID;
        }
        if (i == 3) {
            return INVALID_BAD_CLIENT;
        }
        if (i == 4) {
            return INVALID_CHANGED_RECENTLY;
        }
        if (i != 5) {
            return null;
        }
        return INVALID_SERVER_ERROR;
    }

    public static aucq b() {
        return avpi.a;
    }

    public final int a() {
        return this.g;
    }

    public final String toString() {
        return Integer.toString(this.g);
    }
}
