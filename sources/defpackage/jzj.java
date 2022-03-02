package defpackage;

import android.accounts.Account;
import com.google.android.gms.drive.networkcontrol.ConnectivityChangeReceiver;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: jzj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jzj extends Thread {
    final /* synthetic */ lsm a;
    final /* synthetic */ jzk b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jzj(jzk jzk, String str, lsm lsm) {
        super(str);
        this.b = jzk;
        this.a = lsm;
    }

    public final void run() {
        kkg kkg;
        int i;
        kky k;
        try {
            File file = null;
            ((kjp) this.a.d).a.a(klv.a, (kqy) null);
            jzk jzk = this.b;
            int i2 = jzk.d;
            kkg = jzk.a;
            HashSet<String> hashSet = new HashSet<>();
            kkf kkf = kkg.b;
            for (klb klb : ((kjp) kkf).a(((kjp) kkf).a.a(kle.a.b(), (String[]) null, (kqy) null, (String) null), (kkp) kkn.a).a()) {
                hashSet.add(klb.f);
            }
            for (Account account : lrg.a(kkg.d)) {
                hashSet.remove(account.name);
            }
            for (String c : hashSet) {
                kkg.b.a(kkg.b.c(c));
            }
            File file2 = new File(kkg.c.a.getCacheDir(), "filecache2");
            if (file2.exists()) {
                if (file2.isDirectory()) {
                    file = file2;
                }
            }
            if (file != null) {
                jjc.a(file);
            }
            File d = kkg.c.d();
            if (d != null) {
                jjc.a(d);
            }
        } catch (IOException e) {
            kkg.a.c("Error removing legacy content files");
        } catch (Throwable th) {
            jzk jzk2 = this.b;
            int i3 = jzk.d;
            jzk2.c.countDown();
            throw th;
        }
        if (kkg.c.f() != null) {
            kkg.b.d();
            try {
                anav anav = new anav();
                k = kkg.b.k();
                Iterator it = k.iterator();
                while (it.hasNext()) {
                    knh knh = (knh) it.next();
                    lro lro = knh.d;
                    if (lro == null || lro.b == null || lro.c == null) {
                        anav.b(knh.a);
                        knh.u();
                    }
                }
                kkg.b.a((Set) anav.a());
                kkg.b.f();
                k.close();
                kkg.b.e();
                File[] listFiles = kkg.c.f().listFiles();
                if (listFiles == null) {
                    kkg.a.c("ObsoleteDataCleaner", "Unable to retrieve files to delete from shared content directory.");
                } else {
                    for (File file3 : listFiles) {
                        if (kkg.b.g(file3.getName())) {
                            file3.delete();
                        }
                    }
                }
            } catch (Throwable th2) {
                kkg.b.e();
                throw th2;
            }
        }
        this.a.l.a();
        this.a.p.a();
        lsm lsm = this.a;
        lih lih = lsm.o;
        lsm.v.a();
        this.a.f.c();
        ConnectivityChangeReceiver connectivityChangeReceiver = this.a.A;
        connectivityChangeReceiver.a(this.b.b.b);
        connectivityChangeReceiver.a((lgu) lih.m);
        connectivityChangeReceiver.a(this.a.w.a);
        this.a.B.a(this.b.b.a);
        this.b.b.a();
        lih.a();
        this.b.c.countDown();
    }
}
