package defpackage;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: awbp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awbp {
    public final awbp[] a;
    public final int b;
    public final int c;

    public awbp() {
        this.a = new awbp[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        this.b = 0;
        this.c = 0;
    }

    public awbp(int i, int i2) {
        this.a = null;
        this.b = i;
        int i3 = i2 & 7;
        this.c = i3 == 0 ? 8 : i3;
    }
}
