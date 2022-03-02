package defpackage;

/* renamed from: aiyq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiyq {
    public int a = 0;
    private int b;

    /* access modifiers changed from: package-private */
    public final boolean a(long j, aixs[] aixsArr) {
        int length;
        int i = this.a;
        int i2 = 0;
        if (i != 0) {
            return i != 1;
        }
        if (aixsArr == null || (length = aixsArr.length) == 0) {
            return true;
        }
        if (i == 0) {
            this.b++;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                aixs aixs = aixsArr[i2];
                if (aixs != null) {
                    long j2 = aixs.a;
                    if (j2 != 0 && j2 != -1) {
                        if (Math.abs(j - j2) > 3600000) {
                            this.a = 1;
                            break;
                        } else if (this.b > 6) {
                            this.a = 2;
                        }
                    } else {
                        this.a = 1;
                    }
                }
                i2++;
            }
        }
        return a(j, (aixs[]) null);
    }
}
