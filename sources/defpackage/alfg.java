package defpackage;

/* renamed from: alfg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum alfg {
    HIDDEN(0.0f),
    COLLAPSED(25.0f),
    EXPANDED(75.0f),
    FULLY_EXPANDED(100.0f);
    
    alfg e;
    public alfg f;
    public final float g;

    static {
        alfg alfg;
        alfg alfg2;
        alfg alfg3;
        alfg alfg4;
        alfg2.e = alfg2;
        alfg2.f = alfg2;
        alfg3.e = alfg3;
        alfg3.f = alfg4;
        alfg4.e = alfg3;
        alfg4.f = alfg;
        alfg.e = alfg4;
        alfg.f = alfg;
    }

    private alfg(float f2) {
        this.g = f2;
    }

    public static alfg a(String str) {
        return (alfg) Enum.valueOf(alfg.class, str);
    }
}
