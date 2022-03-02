package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: agnw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agnw implements agno {
    private static final anhq a = anhq.a("agnw");
    private final File b;
    private boolean c;
    private agnv d;

    public agnw(File file) {
        this.b = file;
        boolean z = true;
        if (file == null) {
            ((anhn) ((anhn) a.b()).a("agnw", "a", 83, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Transmitter initialized with invalid path");
            z = false;
        } else if (!file.exists()) {
            if (!this.b.getParentFile().exists() || !this.b.getParentFile().canWrite()) {
                z = this.b.getParentFile().mkdirs();
            }
        } else if (!this.b.canWrite()) {
            ((anhn) ((anhn) a.b()).a("agnw", "a", 93, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("File %s is not writable", (Object) this.b);
            z = false;
        }
        this.c = z;
    }

    private final boolean a() {
        File file = this.b;
        if (file == null) {
            ((anhn) ((anhn) a.b()).a("agnw", "a", 83, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Transmitter initialized with invalid path");
            return false;
        } else if (!file.exists()) {
            if (!this.b.getParentFile().exists() || !this.b.getParentFile().canWrite()) {
                return this.b.getParentFile().mkdirs();
            }
            return true;
        } else if (this.b.canWrite()) {
            return true;
        } else {
            ((anhn) ((anhn) a.b()).a("agnw", "a", 93, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("File %s is not writable", (Object) this.b);
            return false;
        }
    }

    private final void b() {
        try {
            this.d = new agnv(new FileOutputStream(this.b, true));
        } catch (IOException e) {
            anhn anhn = (anhn) a.b();
            anhn.a((Throwable) e);
            ((anhn) anhn.a("agnw", "b", 104, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("An error occurred while creating output stream.");
            this.c = false;
        }
    }

    private final synchronized void b(basu basu) {
        if (this.d == null) {
            try {
                this.d = new agnv(new FileOutputStream(this.b, true));
            } catch (IOException e) {
                anhn anhn = (anhn) a.b();
                anhn.a((Throwable) e);
                ((anhn) anhn.a("agnw", "b", 104, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("An error occurred while creating output stream.");
                this.c = false;
            }
        }
        try {
            agnv agnv = this.d;
            byte[] k = basu.k();
            synchronized (agnv.a) {
                agnv.a.c(k);
                agnv.a.c();
            }
        } catch (IOException e2) {
            anhn anhn2 = (anhn) a.b();
            anhn2.a((Throwable) e2);
            ((anhn) anhn2.a("agnw", "b", 121, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("An error occurred while dumping data.");
            this.c = false;
            return;
        }
        return;
    }

    public final void a(basu basu) {
        if (!this.c) {
            ((anhn) ((anhn) a.c()).a("agnw", "a", 67, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Skip logging metric as transmitter not initialized properly");
        } else {
            b(basu);
        }
    }
}
