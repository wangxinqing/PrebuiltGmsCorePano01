package defpackage;

import android.view.View;

/* renamed from: akes  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akes implements Runnable {
    final /* synthetic */ akey a;

    public akes(akey akey) {
        this.a = akey;
    }

    public final void run() {
        akey akey = this.a;
        int i = akey.h;
        if (i == 1 || i == 0) {
            int size = akey.e.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    akey.a((View) akey.e.get(i2));
                }
                akey.e.clear();
            }
            akey.h = 3;
        }
    }
}
