package defpackage;

import com.google.android.gms.droidguard.DroidGuardResultsRequest;

/* renamed from: lzo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class lzo {
    final String c;
    final DroidGuardResultsRequest d;
    final mad e;
    boolean f = false;

    public lzo(String str, DroidGuardResultsRequest droidGuardResultsRequest) {
        maf maf;
        int i = 0;
        this.c = str;
        if (droidGuardResultsRequest == null) {
            this.d = new DroidGuardResultsRequest();
        } else {
            this.d = droidGuardResultsRequest;
        }
        if (axen.b()) {
            String[] split = axen.a.a().b().split(",");
            int length = split.length;
            while (true) {
                if (i < length) {
                    if (str.equals(split[i])) {
                        maf = maf.FINE;
                        break;
                    }
                    i++;
                } else {
                    maf = maf.COARSE;
                    break;
                }
            }
            this.e = new mag(maf);
            return;
        }
        this.e = new lzu();
    }

    private final synchronized void a(lya lya) {
        if (!this.f) {
            this.f = true;
            try {
                b(lya);
            } catch (Exception e2) {
            }
        } else {
            lya.b();
        }
    }

    /* access modifiers changed from: protected */
    public void b(lya lya) {
    }

    /* access modifiers changed from: package-private */
    public final void c(lya lya) {
        if (axek.a.a().a()) {
            synchronized (this) {
                if (!this.f) {
                    this.f = true;
                    try {
                        b(lya);
                    } catch (Exception e2) {
                    }
                } else {
                    lya.b();
                }
            }
        } else {
            a(lya);
        }
    }
}
