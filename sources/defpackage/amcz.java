package defpackage;

/* renamed from: amcz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum amcz implements auco {
    UNKNOWN_DRIVE_SCOPE(0),
    DRIVE_SCOPE_FILE(1),
    DRIVE_SCOPE_APPFOLDER(2),
    DRIVE_SCOPE_FULL(3),
    DRIVE_SCOPE_APPS(4),
    DRIVE_SCOPE_METADATA_READONLY(5),
    DRIVE_SCOPE_PHOTOS_READONLY(6);
    
    public final int h;

    private amcz(int i2) {
        this.h = i2;
    }

    public static amcz a(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN_DRIVE_SCOPE;
            case 1:
                return DRIVE_SCOPE_FILE;
            case 2:
                return DRIVE_SCOPE_APPFOLDER;
            case 3:
                return DRIVE_SCOPE_FULL;
            case 4:
                return DRIVE_SCOPE_APPS;
            case 5:
                return DRIVE_SCOPE_METADATA_READONLY;
            case 6:
                return DRIVE_SCOPE_PHOTOS_READONLY;
            default:
                return null;
        }
    }

    public static aucq b() {
        return amcy.a;
    }

    public final int a() {
        return this.h;
    }

    public final String toString() {
        return Integer.toString(this.h);
    }
}
