package defpackage;

/* renamed from: avwo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum avwo implements auco {
    UNSET(0),
    OPTED_IN(1),
    OPT_IN_REJECTED(2),
    OPT_IN_VIEWED(3),
    OPT_IN_SNOOZED(4),
    UNRECOGNIZED(-1);
    
    private final int g;

    private avwo(int i) {
        this.g = i;
    }

    public static avwo a(int i) {
        if (i == 0) {
            return UNSET;
        }
        if (i == 1) {
            return OPTED_IN;
        }
        if (i == 2) {
            return OPT_IN_REJECTED;
        }
        if (i == 3) {
            return OPT_IN_VIEWED;
        }
        if (i != 4) {
            return null;
        }
        return OPT_IN_SNOOZED;
    }

    public final String toString() {
        return Integer.toString(a());
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
