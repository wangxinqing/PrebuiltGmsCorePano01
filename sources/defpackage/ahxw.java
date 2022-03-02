package defpackage;

import java.io.File;
import java.util.Locale;

/* renamed from: ahxw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahxw extends ahvl {
    final /* synthetic */ ahxx a;
    private File b;

    public ahxw(ahxx ahxx) {
        this.a = ahxx;
    }

    public final void a() {
        ahtp ahtp;
        if (this.a.a() && (ahtp = this.a.p) != null) {
            ahtp.c();
        }
    }

    public final void j() {
        ahtp ahtp;
        if (ayez.c() && this.a.a() && (ahtp = this.a.p) != null) {
            ahtp.b();
        }
    }

    public final void a(int i, String str) {
        if (this.b == null) {
            this.b = new File(str).getParentFile();
        }
    }

    public final void a(int i, String str, String str2) {
        boolean z;
        if (this.a.a()) {
            if (this.a.o != -1) {
                z = true;
            } else {
                z = false;
            }
            amrl.b(z);
            ahtp ahtp = this.a.p;
            if (ahtp != null) {
                ahtp.b();
            }
            if (str2.length() == 0) {
                new String("Failed to write file: ");
            } else {
                "Failed to write file: ".concat(str2);
            }
        }
    }

    public final void a(ahuz ahuz) {
        boolean z;
        int i;
        ahxx ahxx = this.a;
        if (ahxx.p != null && ahxx.a()) {
            if (this.a.o != -1) {
                z = true;
            } else {
                z = false;
            }
            amrl.b(z);
            long c = this.a.c.c();
            if (ahuz == null || ahuz.a() != 0) {
                i = this.a.q ? 2 : 1;
            } else {
                i = 3;
            }
            ahwy.a(this.a.b.o(), false);
            ahxx ahxx2 = this.a;
            long j = ahxx2.o;
            ahxx2.a(j, j, c, i, true);
            return;
        }
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
        sb.append("Skipping onLastSegmentSaved because NLP is disabled. ");
        sb.append(valueOf);
        sb.toString();
        File file = this.b;
        if (file != null) {
            ajre.a(file);
            Locale locale = Locale.ENGLISH;
            new Object[1][0] = this.b.getPath();
        }
    }

    public final void a(String str) {
        boolean z;
        if (this.a.a()) {
            ahxx ahxx = this.a;
            if (ahxx.p == null || ahxx.o == -1) {
                z = false;
            } else {
                z = true;
            }
            amrl.b(z);
            String valueOf = String.valueOf(str);
            if (valueOf.length() == 0) {
                new String("Failed to collect: ");
            } else {
                "Failed to collect: ".concat(valueOf);
            }
            ahwy.a(this.a.b.o(), false);
            ahxx ahxx2 = this.a;
            ahxx2.a(ahxx2.o, -1, ahxx2.c.c(), 29, true);
        }
    }
}
