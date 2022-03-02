package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: bmn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class bmn implements Runnable {
    private final bmp a;

    public bmn(bmp bmp) {
        this.a = bmp;
    }

    public final void run() {
        int i;
        boolean z;
        Intent intent;
        bmp bmp = this.a;
        ArrayList<Intent> arrayList = new ArrayList<>();
        while (true) {
            int size = arrayList.size();
            synchronized (bmp.d) {
                bmp.g = false;
                while (bmp.e.isEmpty()) {
                    try {
                        bmp.d.wait();
                    } catch (InterruptedException e) {
                        return;
                    }
                }
                arrayList.addAll(bmp.e);
                bmp.e.clear();
                i = bmp.f;
                z = true;
                bmp.g = true;
            }
            if (bmp.c) {
                Iterator it = arrayList.subList(size, arrayList.size()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        intent = null;
                        break;
                    }
                    intent = (Intent) it.next();
                    if ("com.google.android.chimera.container.IntentOperationService.SAVED_INTENT".equals(intent.getAction()) && intent.getLongExtra("uniqueid", -1) == bmp.b) {
                        break;
                    }
                }
                if (intent != null) {
                    synchronized (bmp.h) {
                        bmp.a(intent, (List) arrayList);
                    }
                    bmp.c = false;
                } else {
                    continue;
                }
            } else {
                synchronized (bmp.h) {
                    z = false;
                    for (Intent a2 : arrayList) {
                        z |= bmp.a(a2);
                    }
                }
            }
            arrayList.clear();
            bmp.startService(bmp.a("com.google.android.chimera.container.IntentOperationService.NO_OP"));
            if (z) {
                bmp.c();
            }
            bmp.stopSelf(i);
            bmp.b();
            bmp.a(false);
        }
        while (true) {
        }
    }
}
