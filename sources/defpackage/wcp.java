package defpackage;

import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.ContactsContract;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.nearby.sharing.provider.connections.ContactBookUpdater$1;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: wcp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wcp {
    public final Context a;
    public final wbo b;
    public final wgx c;
    public final jiq d;
    public final ExecutorService e;
    public final Handler f = new qvr(Looper.getMainLooper());
    public final AtomicBoolean g = new AtomicBoolean(false);
    public boolean h = false;
    public final BroadcastReceiver i = new ContactBookUpdater$1(this, "nearby");
    public final ContentObserver j = new wco(this, "nearby", "ContactsContentObserver", this.f);
    private final wcf k;
    private final whf l;
    private final vvq m;

    public wcp(Context context, wbo wbo, wgx wgx, wcf wcf, whf whf, vvq vvq, jiq jiq, ExecutorService executorService) {
        this.a = context;
        this.b = wbo;
        this.c = wgx;
        this.k = wcf;
        this.l = whf;
        this.m = vvq;
        this.d = jiq;
        this.e = executorService;
    }

    public final void b() {
        this.k.f();
        this.k.d();
    }

    public final void c() {
        a((Runnable) new wck(this));
    }

    public final boolean d() {
        Account b2 = this.b.b();
        if (b2 == null) {
            ((anih) ((anih) vvj.a.c()).a("wcp", "d", 295, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot upload contacts: account or account id is null.");
            return false;
        } else if (!a(b2, this.c.b(b2))) {
            return false;
        } else {
            return this.l.a(b2, this.c.b(b2));
        }
    }

    public final void e() {
        this.a.getContentResolver().unregisterContentObserver(this.j);
        thp.a(this.a, this.i);
        ((anih) ((anih) vvj.a.d()).a("wcp", "e", 411, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Stopped listening for contact book changed events.");
    }

    public final SharedPreferences f() {
        return this.a.getSharedPreferences("nearbysharing:provider:contacts:state", 0);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g() {
        thp.a(this.a, this.i, new IntentFilter("com.google.android.gms.nearby.sharing.DEVICE_CONTACTS_CONSENT_ENABLED"));
        ((anih) ((anih) vvj.a.d()).a("wcp", "g", 201, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ContactBookUpdater has started listening for device contacts consent.");
        try {
            this.a.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, this.j);
            ((anih) ((anih) vvj.a.d()).a("wcp", "g", 209, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ContactBookUpdater has started listening for contact book changed events.");
        } catch (SecurityException e2) {
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e2);
            ((anih) anih.a("wcp", "g", 214, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ContactBookUpdater failed to listen to contact book changes.");
        }
    }

    private static boolean a(vvq vvq, Account account) {
        try {
            return ((Boolean) acws.a(vvq.a(account), ayni.a.a().bw(), TimeUnit.MILLISECONDS)).booleanValue();
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            anih anih = (anih) vvj.a.c();
            anih.a(e2);
            ((anih) anih.a("wcp", "a", 374, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot verify Device Contacts: got exception.");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(boolean z) {
        if (ayni.a.a().z() && !z && this.d.a() - f().getLong("last_sync", 0) < ayni.a.a().A()) {
            ((anih) ((anih) vvj.a.d()).a("wcp", "b", 235, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring sync request for contact book because we've recently synced.");
            return;
        }
        Account b2 = this.b.b();
        if (b2 == null) {
            ((anih) ((anih) vvj.a.c()).a("wcp", "b", 243, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to sync contact book: account not set.");
            this.h = false;
            return;
        }
        wgw a2 = this.c.a(b2);
        ((anih) ((anih) vvj.a.d()).a("wcp", "b", 249, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Contact book update: %s.", (Object) a2);
        wgw wgw = wgw.NO_CONTACTS_CHANGED;
        int ordinal = a2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                this.h = d();
            } else if (ordinal == 2 || ordinal == 3) {
                b();
                this.h = d();
            }
        } else if (!this.h) {
            this.h = d();
        }
        if (this.h) {
            f().edit().putLong("last_sync", this.d.a()).apply();
        }
    }

    public final void a() {
        a((Runnable) new wch(this));
        this.e.shutdown();
        ((anih) ((anih) vvj.a.d()).a("wcp", "a", 191, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ContactBookUpdater has been shutdown.");
    }

    public final void a(Runnable runnable) {
        this.e.execute(runnable);
    }

    public final void a(boolean z) {
        a((Runnable) new wcj(this, z));
    }

    public final boolean a(Account account, vih vih) {
        aspx aspx;
        Account account2 = account;
        vih vih2 = vih;
        if (!a(this.m, account2)) {
            ((anih) ((anih) vvj.a.d()).a("wcp", "a", 325, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Device Contacts is disabled: cannot update contacts reachability.");
            return false;
        }
        ((anih) ((anih) vvj.a.d()).a("wcp", "a", 328, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Device Contacts is enabled: updating all contacts reachability.");
        jiq jiq = this.d;
        aucd o = vih.b.o();
        long a2 = jiq.a();
        aucx aucx = vih2.a;
        int size = aucx.size();
        for (int i2 = 0; i2 < size; i2++) {
            vig vig = (vig) aucx.get(i2);
            if (a2 - vig.j > ayni.a.a().aJ()) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                vih vih3 = (vih) o.b;
                vig.getClass();
                vih3.a();
                vih3.a.add(vig);
            }
        }
        vih vih4 = (vih) o.i();
        if (vih4.a.size() <= 0) {
            return true;
        }
        whf whf = this.l;
        if (whf.d) {
            aspx = null;
        } else if (account2 == null || vih4.a.size() == 0 || whf.b.a(ayni.a.a().s(), ayni.a.a().t())) {
            aspx = null;
        } else {
            whf.b.a();
            asps asps = (asps) aspv.b.o();
            aucx aucx2 = vih4.a;
            int size2 = aucx2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                vig vig2 = (vig) aucx2.get(i3);
                aspt aspt = (aspt) aspu.d.o();
                vii vii = vig2.b;
                if (vii == null) {
                    vii = vii.d;
                }
                String str = vii.c;
                if (aspt.c) {
                    aspt.c();
                    aspt.c = false;
                }
                str.getClass();
                ((aspu) aspt.b).a = str;
                aspt.a(vig2.e);
                aspt.b(vig2.f);
                asps.a(aspt);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                whd whd = whf.a;
                ClientContext c2 = whf.c(account2);
                aspv aspv = (aspv) asps.i();
                if (whd.b == null) {
                    whd.b = baaj.a(baai.UNARY, "location.nearby.sharing.v1.NearbySharingService/CheckContactsReachability", baoq.a(aspv.b), baoq.a(aspx.b));
                }
                aspx aspx2 = (aspx) whd.a.a(whd.b, c2, aspv, 10000, TimeUnit.MILLISECONDS);
                whf.c.a(vvb.a(4, 2, SystemClock.elapsedRealtime() - elapsedRealtime));
                aspx = aspx2;
            } catch (babk | eif e2) {
                whf.c.a(vvb.a(4, whf.a(e2), SystemClock.elapsedRealtime() - elapsedRealtime));
                anih anih = (anih) vvj.a.b();
                anih.a((Throwable) e2);
                ((anih) anih.a("whf", "b", 558, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("'checkContactsReachability' failed.");
                aspx = null;
            }
        }
        if (aspx != null) {
            jiq jiq2 = this.d;
            nz nzVar = new nz();
            aucx aucx3 = aspx.a;
            int size3 = aucx3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                aspw aspw = (aspw) aucx3.get(i4);
                nzVar.put(aspw.a, aspw);
            }
            long a3 = jiq2.a();
            int i5 = 5;
            aucd aucd = (aucd) vih2.c(5);
            aucd.a((aucj) vih2);
            int i6 = 0;
            while (i6 < ((vih) aucd.b).a.size()) {
                vig A = aucd.A(i6);
                vii vii2 = A.b;
                if (vii2 == null) {
                    vii2 = vii.d;
                }
                aspw aspw2 = (aspw) nzVar.get(vii2.c);
                if (aspw2 != null) {
                    aucd aucd2 = (aucd) A.c(i5);
                    aucd2.a((aucj) A);
                    boolean z = aspw2.b;
                    if (aucd2.c) {
                        aucd2.c();
                        aucd2.c = false;
                    }
                    vig vig3 = (vig) aucd2.b;
                    vig vig4 = vig.l;
                    int i7 = vig3.a | 16;
                    vig3.a = i7;
                    vig3.h = z;
                    boolean z2 = aspw2.c;
                    int i8 = i7 | 32;
                    vig3.a = i8;
                    vig3.i = z2;
                    vig3.a = i8 | 64;
                    vig3.j = a3;
                    aucd.c(i6, aucd2);
                }
                i6++;
                i5 = 5;
            }
            if (this.c.a(account2, (vih) aucd.i())) {
                return true;
            }
            ((anih) ((anih) vvj.a.c()).a("wcp", "a", 342, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to save contact book to disk after refreshing reachability.");
        }
        return false;
    }
}
