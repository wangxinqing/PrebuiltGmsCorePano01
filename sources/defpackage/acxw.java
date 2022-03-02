package defpackage;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: acxw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class acxw {
    protected int b;
    protected int c;
    protected int d;

    public abstract int a();

    /* access modifiers changed from: protected */
    public abstract void a(acxa acxa, long j, Object[] objArr);

    /* access modifiers changed from: protected */
    public final void a(aucd aucd) {
        int i = this.b;
        if (i != 0) {
            long j = (long) i;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            avqd avqd = (avqd) aucd.b;
            avqd avqd2 = avqd.al;
            avqd.a |= 64;
            avqd.h = j;
        }
        int i2 = this.c;
        if (i2 != 0) {
            long j2 = (long) i2;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            avqd avqd3 = (avqd) aucd.b;
            avqd avqd4 = avqd.al;
            avqd3.a |= 128;
            avqd3.i = j2;
        }
        int i3 = this.d;
        if (i3 != 0) {
            long j3 = (long) i3;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            avqd avqd5 = (avqd) aucd.b;
            avqd avqd6 = avqd.al;
            avqd5.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            avqd5.j = j3;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Object[] objArr, int i) {
        this.b = 0;
        this.c = 0;
        this.d = 0;
        int length = objArr.length;
        if (length > i) {
            Integer num = objArr[i];
            if (num instanceof Integer) {
                this.b = num.intValue();
            }
        }
        int i2 = i + 1;
        if (length > i2) {
            Integer num2 = objArr[i2];
            if (num2 instanceof Integer) {
                this.c = num2.intValue();
            }
        }
        int i3 = i2 + 1;
        if (length > i3) {
            Integer num3 = objArr[i3];
            if (num3 instanceof Integer) {
                this.d = num3.intValue();
            }
        }
    }
}
