package defpackage;

import com.android.volley.toolbox.ImageRequest;
import java.util.concurrent.TimeUnit;

/* renamed from: ahvv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahvv {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final ahwk f;
    public int g;
    public long h;

    public ahvv(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        boolean z4 = true;
        if (i5 == 0 && i6 == 0) {
            i5 = ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
            i6 = ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
        } else {
            if (i5 <= 0) {
                z3 = false;
            } else {
                z3 = i6 > 0;
            }
            amrl.a(z3);
            amrl.a(i5 < i6);
        }
        long j = (long) i6;
        if (j < TimeUnit.HOURS.toMillis(1)) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z);
        long j2 = ((long) i5) * 48000;
        if (j2 % 1000 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        amrl.a(z2);
        long j3 = j * 48000;
        amrl.a(j3 % 1000 != 0 ? false : z4);
        this.e = i7;
        int i9 = (int) (j2 / 1000);
        this.b = i9;
        this.f = new ahwk(i9 * i8, i7 * i8, Float.class);
        this.d = i8;
        this.a = i6;
        this.c = (int) (j3 / 1000);
        this.g = 0;
    }
}
