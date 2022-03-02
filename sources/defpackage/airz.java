package defpackage;

/* renamed from: airz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class airz {
    private static airz c;
    public final aizw a;
    public long b = Long.MAX_VALUE;

    private airz(aizw aizw) {
        this.a = aizw;
    }

    public static synchronized airz a(aizw aizw) {
        airz airz;
        synchronized (airz.class) {
            if (c == null) {
                c = new airz(aizw);
            }
            airz = c;
        }
        return airz;
    }
}
