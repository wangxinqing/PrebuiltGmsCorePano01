package defpackage;

/* renamed from: abov  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum abov {
    UNKNOWN((byte) 0),
    PHONE((byte) 1),
    TABLET((byte) 2),
    TV((byte) 3),
    WEAR((byte) 4),
    WEAVE((byte) 5),
    AUTO((byte) 6);
    
    public final byte h;

    private abov(byte b) {
        this.h = b;
    }

    public static abov a(String str) {
        if (str != null) {
            for (abov abov : values()) {
                if (ampw.a(abov.name(), str)) {
                    return abov;
                }
            }
        }
        return UNKNOWN;
    }
}
