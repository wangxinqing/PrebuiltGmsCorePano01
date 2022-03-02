package defpackage;

import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: lgf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lgf implements lfo {
    private final lgc a;
    private aucd b = ambe.l.o();

    static {
        new ith("ImpressionSyncInfoBuild", "");
    }

    public lgf(lgc lgc) {
        this.a = lgc;
    }

    private final void b() {
        iva.a((Object) this.b, (Object) "Builder can only be used once.");
    }

    public final void a() {
        boolean z;
        b();
        lgc lgc = this.a;
        ambe ambe = (ambe) this.b.i();
        lgc.k();
        if ((((ambk) lgc.e.b).a & FragmentTransaction.TRANSIT_ENTER_MASK) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't set SyncInfo more than once");
        aucd aucd = lgc.e;
        iva.a((Object) ambe);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambk ambk = (ambk) aucd.b;
        ambk ambk2 = ambk.K;
        ambe.getClass();
        ambk.o = ambe;
        ambk.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
        this.b = null;
    }

    public final void c(int i) {
        boolean z;
        b();
        if ((((ambe) this.b.b).a & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't call setChangeLogLimit() twice");
        aucd aucd = this.b;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambe ambe = (ambe) aucd.b;
        ambe ambe2 = ambe.l;
        ambe.a |= 8;
        ambe.e = i;
    }

    public final void d(int i) {
        boolean z;
        b();
        if ((((ambe) this.b.b).a & 512) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't call setEntryDbProcessTimeMs() twice");
        aucd aucd = this.b;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambe ambe = (ambe) aucd.b;
        ambe ambe2 = ambe.l;
        ambe.a |= 512;
        ambe.k = i;
    }

    public final void e(int i) {
        boolean z;
        b();
        if ((((ambe) this.b.b).a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't call setEntrySyncTimeMs() twice");
        aucd aucd = this.b;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambe ambe = (ambe) aucd.b;
        ambe ambe2 = ambe.l;
        ambe.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        ambe.j = i;
    }

    public final void f(int i) {
        boolean z;
        b();
        if ((((ambe) this.b.b).a & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't call setMaxFeedsSynced() twice");
        aucd aucd = this.b;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambe ambe = (ambe) aucd.b;
        ambe ambe2 = ambe.l;
        ambe.a |= 4;
        ambe.d = i;
    }

    public final void g(int i) {
        boolean z;
        b();
        if ((((ambe) this.b.b).a & 16) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't call setSyncTrigger() twice");
        if (i == 1) {
            aucd aucd = this.b;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            ambe ambe = (ambe) aucd.b;
            ambe ambe2 = ambe.l;
            ambe.f = 1;
            ambe.a |= 16;
        } else if (i == 2) {
            aucd aucd2 = this.b;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            ambe ambe3 = (ambe) aucd2.b;
            ambe ambe4 = ambe.l;
            ambe3.f = 2;
            ambe3.a |= 16;
        } else if (i != 3) {
            aucd aucd3 = this.b;
            if (aucd3.c) {
                aucd3.c();
                aucd3.c = false;
            }
            ambe ambe5 = (ambe) aucd3.b;
            ambe ambe6 = ambe.l;
            ambe5.f = 4;
            ambe5.a |= 16;
        } else {
            aucd aucd4 = this.b;
            if (aucd4.c) {
                aucd4.c();
                aucd4.c = false;
            }
            ambe ambe7 = (ambe) aucd4.b;
            ambe ambe8 = ambe.l;
            ambe7.f = 3;
            ambe7.a |= 16;
        }
    }

    public final void h(int i) {
        b();
        iva.a(((((ambe) this.b.b).a & 1) ^ 1) != 0, (Object) "Can't call setSyncType() twice");
        if (i == 0) {
            aucd aucd = this.b;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            ambe ambe = (ambe) aucd.b;
            ambe ambe2 = ambe.l;
            ambe.b = 1;
            ambe.a |= 1;
        } else if (i == 1) {
            aucd aucd2 = this.b;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            ambe ambe3 = (ambe) aucd2.b;
            ambe ambe4 = ambe.l;
            ambe3.b = 2;
            ambe3.a |= 1;
        } else if (i == 2) {
            aucd aucd3 = this.b;
            if (aucd3.c) {
                aucd3.c();
                aucd3.c = false;
            }
            ambe ambe5 = (ambe) aucd3.b;
            ambe ambe6 = ambe.l;
            ambe5.b = 3;
            ambe5.a |= 1;
        } else if (i == 3) {
            aucd aucd4 = this.b;
            if (aucd4.c) {
                aucd4.c();
                aucd4.c = false;
            }
            ambe ambe7 = (ambe) aucd4.b;
            ambe ambe8 = ambe.l;
            ambe7.b = 4;
            ambe7.a |= 1;
        } else if (i == 4) {
            aucd aucd5 = this.b;
            if (aucd5.c) {
                aucd5.c();
                aucd5.c = false;
            }
            ambe ambe9 = (ambe) aucd5.b;
            ambe ambe10 = ambe.l;
            ambe9.b = 5;
            ambe9.a |= 1;
        } else if (i != 5) {
            aucd aucd6 = this.b;
            if (aucd6.c) {
                aucd6.c();
                aucd6.c = false;
            }
            ambe ambe11 = (ambe) aucd6.b;
            ambe ambe12 = ambe.l;
            ambe11.b = 7;
            ambe11.a |= 1;
        } else {
            aucd aucd7 = this.b;
            if (aucd7.c) {
                aucd7.c();
                aucd7.c = false;
            }
            ambe ambe13 = (ambe) aucd7.b;
            ambe ambe14 = ambe.l;
            ambe13.b = 6;
            ambe13.a |= 1;
        }
    }

    public final void b(int i) {
        boolean z;
        b();
        if ((((ambe) this.b.b).a & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't call setAppDataFolderIdUpdaterTimeMs() twice");
        aucd aucd = this.b;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambe ambe = (ambe) aucd.b;
        ambe ambe2 = ambe.l;
        ambe.a |= 128;
        ambe.i = i;
    }

    public final void a(int i) {
        boolean z;
        b();
        if ((((ambe) this.b.b).a & 64) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't call setAboutRequestTimeMs() twice");
        aucd aucd = this.b;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambe ambe = (ambe) aucd.b;
        ambe ambe2 = ambe.l;
        ambe.a |= 64;
        ambe.h = i;
    }

    public final void a(long j) {
        boolean z;
        b();
        if ((((ambe) this.b.b).a & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't call setItemsSynced() twice");
        aucd aucd = this.b;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambe ambe = (ambe) aucd.b;
        ambe ambe2 = ambe.l;
        ambe.a |= 2;
        ambe.c = j;
    }

    public final void a(Long l) {
        boolean z;
        b();
        if ((((ambe) this.b.b).a & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't call setPendingPushNotificationsCount() twice");
        aucd aucd = this.b;
        long longValue = l.longValue();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambe ambe = (ambe) aucd.b;
        ambe ambe2 = ambe.l;
        ambe.a |= 32;
        ambe.g = longValue;
    }
}
