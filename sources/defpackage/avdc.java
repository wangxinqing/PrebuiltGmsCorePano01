package defpackage;

/* renamed from: avdc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum avdc implements auco {
    UNKNOWN(0),
    WHATSAPP_PROFILE(1),
    WHATSAPP_VOIP_CALL(2),
    WHATSAPP_VIDEO_CALL(3),
    LINE_PROFILE(4);
    
    public final int f;

    private avdc(int i) {
        this.f = i;
    }

    public final int a() {
        return this.f;
    }

    public final String toString() {
        return Integer.toString(this.f);
    }
}
