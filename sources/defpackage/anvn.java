package defpackage;

/* renamed from: anvn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum anvn implements auco {
    NONE(0),
    WIFI_D2D(1),
    OEM_APP(2);
    
    public final int d;

    private anvn(int i) {
        this.d = i;
    }

    public static anvn a(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return WIFI_D2D;
        }
        if (i != 2) {
            return null;
        }
        return OEM_APP;
    }

    public static aucq b() {
        return anvm.a;
    }

    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
