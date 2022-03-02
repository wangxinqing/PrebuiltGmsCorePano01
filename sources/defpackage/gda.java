package defpackage;

/* renamed from: gda  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum gda {
    UNKNOWN,
    GRANTED,
    REJECTED;

    public static gda a(String str) {
        return (gda) Enum.valueOf(gda.class, str);
    }
}
