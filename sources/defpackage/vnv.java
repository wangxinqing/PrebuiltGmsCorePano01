package defpackage;

/* renamed from: vnv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum vnv implements auco {
    UNKNOWN_FRAME_TYPE(0),
    INTRODUCTION(1),
    RESPONSE(2),
    PAIRED_KEY_ENCRYPTION(3),
    PAIRED_KEY_RESULT(4),
    CERTIFICATE_INFO(5);
    
    public final int g;

    private vnv(int i) {
        this.g = i;
    }

    public static vnv a(int i) {
        if (i == 0) {
            return UNKNOWN_FRAME_TYPE;
        }
        if (i == 1) {
            return INTRODUCTION;
        }
        if (i == 2) {
            return RESPONSE;
        }
        if (i == 3) {
            return PAIRED_KEY_ENCRYPTION;
        }
        if (i == 4) {
            return PAIRED_KEY_RESULT;
        }
        if (i != 5) {
            return null;
        }
        return CERTIFICATE_INFO;
    }

    public static aucq b() {
        return vnu.a;
    }

    public final int a() {
        return this.g;
    }

    public final String toString() {
        return Integer.toString(this.g);
    }
}
