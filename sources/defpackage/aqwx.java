package defpackage;

/* renamed from: aqwx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aqwx implements auco {
    REQUEST_MASK_CONTAINER_UNKNOWN(0),
    PROFILE(1),
    DOMAIN_PROFILE(7),
    CONTACT(2),
    ACCOUNT(5),
    AFFINITY(11),
    DOMAIN_CONTACT(8),
    PLACE(4),
    RAW_DEVICE_CONTACT(13),
    DELEGATED_CONTACT(15),
    CONTACT_ANNOTATION(14),
    CIRCLE(3),
    EXTERNAL_ACCOUNT(6),
    DEVICE_CONTACT(9),
    GOOGLE_GROUP(10),
    CALENDAR_RESOURCE(16),
    UNRECOGNIZED(-1);
    
    private final int r;

    private aqwx(int i) {
        this.r = i;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.r;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(a());
    }
}
