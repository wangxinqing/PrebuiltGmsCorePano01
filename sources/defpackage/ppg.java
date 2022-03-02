package defpackage;

/* renamed from: ppg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ppg {
    static long a(long j, long j2) {
        return (j ^ j2) * 1099511628211L;
    }

    static long a(long j, String str) {
        for (int i = 0; i < str.length(); i++) {
            j = (j ^ ((long) str.charAt(i))) * 1099511628211L;
        }
        return j;
    }
}
