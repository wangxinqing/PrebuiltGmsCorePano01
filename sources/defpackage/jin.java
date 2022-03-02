package defpackage;

/* renamed from: jin  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jin implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ jip b;

    public jin(jip jip, String str) {
        this.b = jip;
        this.a = str;
    }

    public final void run() {
        boolean z;
        jip jip = this.b;
        String str = this.a;
        if (str == null) {
            z = true;
        } else {
            z = false;
        }
        int i = jip.c.h;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                if (z) {
                    break;
                }
                if (str.equals(((jio) jip.c.c(i2)).k())) {
                    z = true;
                }
                i2++;
            } else if (!z) {
                return;
            }
        }
        jip.a(false);
    }
}
