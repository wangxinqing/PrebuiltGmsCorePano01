package defpackage;

/* renamed from: xkm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum xkm implements auco {
    UNKNOWN_STAGE(0),
    GROUP_SYNC_DOWN_PROGRESS(1),
    CONTACT_SYNC_DOWN_PROGRESS(2),
    PHOTO_SYNC_DOWN_PROGRESS(3),
    GROUP_SYNC_UP_PROGRESS(4),
    CONTACT_SYNC_UP_PROGRESS(5),
    PHOTO_SYNC_UP_PROGRESS(6);
    
    public final int h;

    private xkm(int i2) {
        this.h = i2;
    }

    public static xkm a(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN_STAGE;
            case 1:
                return GROUP_SYNC_DOWN_PROGRESS;
            case 2:
                return CONTACT_SYNC_DOWN_PROGRESS;
            case 3:
                return PHOTO_SYNC_DOWN_PROGRESS;
            case 4:
                return GROUP_SYNC_UP_PROGRESS;
            case 5:
                return CONTACT_SYNC_UP_PROGRESS;
            case 6:
                return PHOTO_SYNC_UP_PROGRESS;
            default:
                return null;
        }
    }

    public static aucq b() {
        return xkl.a;
    }

    public final int a() {
        return this.h;
    }

    public final String toString() {
        return Integer.toString(this.h);
    }
}
