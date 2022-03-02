package defpackage;

/* renamed from: aqkd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aqkd implements auco {
    TOKEN_TYPE_UNSPECIFIED(0),
    OAUTH2_ACCESS_TOKEN(1),
    OAUTH2_REFRESH_TOKEN(2),
    GOOGLE_ID_TOKEN(3),
    UNRECOGNIZED(-1);
    
    private final int f;

    private aqkd(int i) {
        this.f = i;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(a());
    }
}
