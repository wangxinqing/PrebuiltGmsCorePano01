package defpackage;

/* renamed from: owq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class owq {
    public static long a(long j, byte[] bArr) {
        for (byte b : bArr) {
            j = (j ^ ((long) b)) * 1099511628211L;
        }
        return j;
    }
}
