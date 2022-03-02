package defpackage;

/* renamed from: aukg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aukg {
    TRIVIAL_BIGTABLE,
    FOOTPRINTS,
    REGISTRATION,
    CHANNELID_NOT_SET;

    public static aukg a(int i) {
        if (i == 0) {
            return CHANNELID_NOT_SET;
        }
        if (i == 1) {
            return TRIVIAL_BIGTABLE;
        }
        if (i == 2) {
            return FOOTPRINTS;
        }
        if (i != 3) {
            return null;
        }
        return REGISTRATION;
    }
}
