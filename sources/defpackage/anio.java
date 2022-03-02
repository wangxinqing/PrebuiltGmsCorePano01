package defpackage;

/* renamed from: anio  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum anio {
    GENERAL(true),
    BOOLEAN(false),
    CHARACTER(false),
    INTEGRAL(false),
    FLOAT(true);
    
    public final boolean f;

    private anio(boolean z) {
        this.f = z;
    }
}
