package defpackage;

/* renamed from: ad  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum ad {
    DESTROYED,
    INITIALIZED,
    CREATED,
    STARTED,
    RESUMED;

    public final boolean a(ad adVar) {
        return compareTo(adVar) >= 0;
    }
}
