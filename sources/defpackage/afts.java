package defpackage;

import java.util.Random;

/* renamed from: afts  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afts implements afjk {
    private final Random a = new Random();

    public final boolean a(long j) {
        return j > 0 && j <= 2147483647L && this.a.nextInt((int) j) == 0;
    }
}
