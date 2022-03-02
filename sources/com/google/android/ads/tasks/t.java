package com.google.android.ads.tasks;

import java.io.UnsupportedEncodingException;
import java.util.concurrent.CountDownLatch;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class t implements Runnable {
    final /* synthetic */ u a;

    public t(u uVar) {
        this.a = uVar;
    }

    public final void run() {
        CountDownLatch countDownLatch;
        u uVar = this.a;
        try {
            bhm bhm = uVar.a;
            Class loadClass = bhm.c.loadClass(uVar.a(bhm.e, uVar.b));
            if (loadClass != null) {
                uVar.d = loadClass.getMethod(uVar.a(uVar.a.e, uVar.c), uVar.e);
                if (uVar.d != null) {
                    countDownLatch = uVar.f;
                    countDownLatch.countDown();
                }
            }
        } catch (bgs | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException e) {
        } catch (NullPointerException e2) {
            countDownLatch = uVar.f;
        } catch (Throwable th) {
            uVar.f.countDown();
            throw th;
        }
        countDownLatch = uVar.f;
        countDownLatch.countDown();
    }
}
