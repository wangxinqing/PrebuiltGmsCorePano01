package defpackage;

import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferProgress;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorAnnotatedData;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.TargetAccountImportController$ChallengeIntentHelper;
import com.google.android.gms.smartdevice.d2d.TargetAccountImportController$ImportReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: absy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class absy {
    public static final iwd a = acqa.a("D2D", "TargetAccountImportController");
    public final Handler b;
    public final etl c;
    public final absz d;
    public final Set e = new HashSet();
    public boolean f;
    public final TargetAccountImportController$ChallengeIntentHelper g;
    public final acel h;
    public AccountTransferMsg i;
    private final Context j;
    private final acan k;
    private final Set l = new HashSet();
    private BroadcastReceiver m;

    public absy(Context context, Handler handler, acan acan, absz absz, boolean z) {
        iva.a((Object) context);
        this.j = context;
        iva.a((Object) handler);
        this.b = handler;
        iva.a((Object) acan);
        this.k = acan;
        iva.a((Object) absz);
        this.d = absz;
        this.h = new acel(jfm.b(10), new jls(handler), azlf.a.a().a(), new absv(this));
        this.g = new TargetAccountImportController$ChallengeIntentHelper(context, handler, this.h, absz);
        this.c = esu.a(context, abvq.a(context, false, z));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0007, code lost:
        r2 = (r2 = r2.e).d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg r2) {
        /*
            r0 = 0
            if (r2 == 0) goto L_0x0015
            com.google.android.gms.auth.api.accounttransfer.AccountTransferProgress r2 = r2.e
            if (r2 == 0) goto L_0x0015
            java.util.List r2 = r2.d
            if (r2 == 0) goto L_0x0015
            java.lang.String r1 = "com.google"
            boolean r2 = r2.contains(r1)
            if (r2 == 0) goto L_0x0015
            r2 = 1
            return r2
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.absy.b(com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg):boolean");
    }

    private final void c() {
        AccountTransferMsg accountTransferMsg = this.i;
        if (accountTransferMsg == null) {
            a.e("Cannot log - no previous transfer message", new Object[0]);
        } else {
            AccountTransferProgress accountTransferProgress = accountTransferMsg.e;
            if (accountTransferProgress != null) {
                acan acan = this.k;
                int size = this.l.size();
                int a2 = acdy.a(accountTransferProgress.d);
                int a3 = acdy.a(accountTransferProgress.f);
                int a4 = acdy.a(accountTransferProgress.e);
                aucd aucd = acan.f.a.b().b;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                anxi anxi = (anxi) aucd.b;
                anxi anxi2 = anxi.f;
                int i2 = anxi.a | 1;
                anxi.a = i2;
                anxi.b = size;
                int i3 = i2 | 2;
                anxi.a = i3;
                anxi.c = a2;
                int i4 = i3 | 4;
                anxi.a = i4;
                anxi.d = a3;
                anxi.a = i4 | 8;
                anxi.e = a4;
            } else {
                a.e("Cannot log - last transfer message has no progress", new Object[0]);
            }
        }
        this.h.b();
        if (this.f) {
            this.f = false;
            a.b("importAccounts(END_SESSION)", new Object[0]);
            etn etn = new etn();
            etn.a(4);
            Status a5 = acqd.a(this.c.b(etn.a()));
            if (!a5.c()) {
                a.e("Error ending session %d", Integer.valueOf(a5.i));
            }
        }
    }

    public final synchronized void a() {
        if (this.m != null) {
            c();
            try {
                this.j.unregisterReceiver(this.m);
            } catch (IllegalArgumentException e2) {
                a.a((Throwable) e2);
            }
            this.m = null;
        }
        this.l.clear();
    }

    public final void b() {
        ArrayList arrayList = new ArrayList(r2);
        for (Account account : acpd.a(this.j).a("com.google")) {
            Bundle bundle = new Bundle();
            bundle.putString("name", account.name);
            arrayList.add(bundle);
        }
        this.h.b();
        this.d.a((List) arrayList);
        this.d.a();
    }

    public final void a(AccountTransferMsg accountTransferMsg) {
        AccountTransferMsg accountTransferMsg2;
        iva.a(this.b);
        int i2 = 3;
        this.k.b(3);
        if (!this.g.e) {
            acel acel = this.h;
            if (acel.e) {
                acel.a();
            } else {
                acel.c();
            }
        }
        this.f = true;
        ArrayList arrayList = accountTransferMsg.c;
        int a2 = acdy.a(arrayList);
        for (int i3 = 0; i3 < a2; i3++) {
            this.l.add(((AuthenticatorAnnotatedData) arrayList.get(i3)).c.c);
        }
        if (this.m == null) {
            this.m = new TargetAccountImportController$ImportReceiver(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.auth.ACCOUNT_DATA_AVAILABLE_FOR_SETUP");
            intentFilter.addAction("com.google.android.gms.smartdevice.setup.IMPORT_CHALLENGE_COMPLETE");
            intentFilter.addAction("com.google.android.gms.smartdevice.setup.RESTORE_DATA");
            this.j.registerReceiver(this.m, intentFilter);
            a.b("importAccount(START_SESSION, data) size = %s", Integer.valueOf(a2));
            i2 = 1;
        } else {
            a.a("importAccounts(DEPOSIT_DATA, data) size = %s", Integer.valueOf(a2));
        }
        etn etn = new etn();
        etn.a(i2);
        etn.a(accountTransferMsg.c);
        etn.a(accountTransferMsg.e);
        acwa b2 = this.c.b(etn.a());
        Status a3 = acqd.a(b2);
        if (a3.c()) {
            accountTransferMsg2 = (AccountTransferMsg) b2.d();
        } else {
            accountTransferMsg2 = null;
        }
        a.a("importAccount() %s", a3);
        c(accountTransferMsg2);
    }

    public final boolean c(AccountTransferMsg accountTransferMsg) {
        AccountTransferProgress accountTransferProgress;
        if (!(accountTransferMsg == null || (accountTransferProgress = accountTransferMsg.e) == null)) {
            a.a("checking progress %s", accountTransferProgress);
            this.i = accountTransferMsg;
            for (String str : accountTransferProgress.b().values()) {
                if (!"in_progress".equals(str)) {
                    if ("registered".equals(str)) {
                    }
                }
            }
            c();
            if (!b(accountTransferMsg)) {
                this.d.a(10579, "Google authenticator failed to import");
            } else {
                b();
            }
            return true;
        }
        return false;
    }
}
