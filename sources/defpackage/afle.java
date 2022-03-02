package defpackage;

/* renamed from: afle  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum afle implements auco {
    NONE(0),
    SUBSCRIBED(1),
    DOWNLOAD_IN_PROGRESS(2),
    DOWNLOAD_FAILED(3),
    DOWNLOAD_COMPLETE(4),
    INTERNAL_ERROR(5);
    
    public final int g;

    private afle(int i) {
        this.g = i;
    }

    public static afle a(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return SUBSCRIBED;
        }
        if (i == 2) {
            return DOWNLOAD_IN_PROGRESS;
        }
        if (i == 3) {
            return DOWNLOAD_FAILED;
        }
        if (i == 4) {
            return DOWNLOAD_COMPLETE;
        }
        if (i != 5) {
            return null;
        }
        return INTERNAL_ERROR;
    }

    public static aucq b() {
        return afld.a;
    }

    public final int a() {
        return this.g;
    }

    public final String toString() {
        return Integer.toString(this.g);
    }
}
