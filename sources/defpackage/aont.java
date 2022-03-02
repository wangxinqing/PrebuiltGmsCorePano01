package defpackage;

/* renamed from: aont  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aont {
    public static long a(long j, long j2) {
        long j3 = j + j2;
        boolean z = true;
        boolean z2 = (j ^ j2) < 0;
        if ((j ^ j3) < 0) {
            z = false;
        }
        aonu.a(z2 | z, "checkedAdd", j, j2);
        return j3;
    }

    public static long b(long j, long j2) {
        long j3 = j - j2;
        boolean z = true;
        boolean z2 = (j ^ j2) >= 0;
        if ((j ^ j3) < 0) {
            z = false;
        }
        aonu.a(z2 | z, "checkedSubtract", j, j2);
        return j3;
    }
}
