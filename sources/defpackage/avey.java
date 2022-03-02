package defpackage;

/* renamed from: avey  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum avey implements auco {
    SYNC_REASON_UNKNOWN(0),
    SYNC_REASON_CONTACT_CHANGED_INSIGNIFICANT(1),
    SYNC_REASON_CONTACT_CHANGED_SIGNIFICANT(2),
    SYNC_REASON_FACS_CACHE_UPDATED(3),
    SYNC_REASON_UDC_SETTING_CHANGED(4),
    SYNC_REASON_POWER_CONNECTED(5);
    
    public static final aucp g = null;
    private final int h;

    static {
        g = new avex();
    }

    private avey(int i2) {
        this.h = i2;
    }

    public static avey a(int i2) {
        if (i2 == 0) {
            return SYNC_REASON_UNKNOWN;
        }
        if (i2 == 1) {
            return SYNC_REASON_CONTACT_CHANGED_INSIGNIFICANT;
        }
        if (i2 == 2) {
            return SYNC_REASON_CONTACT_CHANGED_SIGNIFICANT;
        }
        if (i2 == 3) {
            return SYNC_REASON_FACS_CACHE_UPDATED;
        }
        if (i2 == 4) {
            return SYNC_REASON_UDC_SETTING_CHANGED;
        }
        if (i2 != 5) {
            return null;
        }
        return SYNC_REASON_POWER_CONNECTED;
    }

    public final int a() {
        return this.h;
    }

    public final String toString() {
        return Integer.toString(this.h);
    }
}
