package defpackage;

/* renamed from: aqmj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aqmj implements auco {
    UNKNOWN_OPEN_LINK_ACTION(0),
    LINK_OPENED_IN_WEBVIEW(1),
    LINK_OPENED_IN_BROWSER(2);
    
    public final int d;

    private aqmj(int i) {
        this.d = i;
    }

    public static aqmj a(int i) {
        if (i == 0) {
            return UNKNOWN_OPEN_LINK_ACTION;
        }
        if (i == 1) {
            return LINK_OPENED_IN_WEBVIEW;
        }
        if (i != 2) {
            return null;
        }
        return LINK_OPENED_IN_BROWSER;
    }

    public static aucq b() {
        return aqmi.a;
    }

    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
