package defpackage;

/* renamed from: asal  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum asal implements auco {
    UNKNOWN_EVENT_TYPE(0),
    PAYLOAD_ERROR(1),
    PAYLOAD_CANCELED(2);
    
    public final int d;

    private asal(int i) {
        this.d = i;
    }

    public static asal a(int i) {
        if (i == 0) {
            return UNKNOWN_EVENT_TYPE;
        }
        if (i == 1) {
            return PAYLOAD_ERROR;
        }
        if (i != 2) {
            return null;
        }
        return PAYLOAD_CANCELED;
    }

    public static aucq b() {
        return asak.a;
    }

    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
