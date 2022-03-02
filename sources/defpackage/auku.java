package defpackage;

/* renamed from: auku  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum auku implements auco {
    UNKNOWN(0),
    SYNC_FULL_SNAPSHOT(1),
    SYNC_LATEST_PER_SECONDARY_ID(2),
    SYNC_COMBINED(3);
    
    public final int e;

    private auku(int i) {
        this.e = i;
    }

    public static auku a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return SYNC_FULL_SNAPSHOT;
        }
        if (i == 2) {
            return SYNC_LATEST_PER_SECONDARY_ID;
        }
        if (i != 3) {
            return null;
        }
        return SYNC_COMBINED;
    }

    public static aucq b() {
        return aukt.a;
    }

    public final int a() {
        return this.e;
    }

    public final String toString() {
        return Integer.toString(this.e);
    }
}
