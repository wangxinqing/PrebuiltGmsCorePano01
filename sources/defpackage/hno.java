package defpackage;

import android.accounts.Account;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import android.os.SystemClock;

/* renamed from: hno  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hno extends jeu {
    private static final iwd a = hir.c("SyncAdapter");
    private static final anaf b;

    static {
        anab h = anaf.h();
        h.a("auth-api-nigori", 301);
        h.a("auth-api-credentials", 303);
        h.a("auth-api-settings", 302);
        h.a("chromesync-autofill-wallet", 304);
        h.a("chromesync-wallet-metadata", 305);
        b = h.a();
    }

    public hno(Context context) {
        super(context, false, "chromesync");
    }

    public static Bundle a(hnw hnw) {
        Bundle a2 = hnw.a();
        a2.putBoolean("expedited", true);
        a2.putBoolean("force", true);
        a2.putBoolean("do_not_retry", true);
        return a2;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return 7937;
    }

    /* access modifiers changed from: protected */
    public final void a(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        hnw hnw;
        auus auus;
        a.b("performSync() triggered.", new Object[0]);
        if (bundle != null && bundle.getBoolean("initialize", false)) {
            a.b("Initializing SyncAdapter...", new Object[0]);
            ContentResolver.setIsSyncable(account, str, 1);
            ContentResolver.setSyncAutomatically(account, str, true);
        }
        if (awsc.a.a().a()) {
            aeem.a(getContext().getContentResolver(), account, "com.google.android.gms.auth.api.credentials", "chromiumsync", new String[0]);
            aeem.a(getContext().getContentResolver(), account, str, "chromiumsync", new String[0]);
        } else {
            aeem.a(getContext().getContentResolver(), account, "com.google.android.gms.auth.api.credentials", "chromiumsync", new String[0]);
            aeem.a(getContext().getContentResolver(), account, str, "chromiumsync", "auth-api-nigori", "auth-api-credentials", "auth-api-settings", "chromesync-autofill-wallet", "chromesync-wallet-metadata");
        }
        try {
            if (bundle.containsKey("feed")) {
                String string = bundle.getString("feed");
                if (!b.containsKey(string)) {
                    a.e("Unrecognizable feed name: %s.", string);
                    return;
                }
                hnv hnv = new hnv();
                hnv.a = pyv.a(getContext(), account);
                hnv.b = ((Integer) b.get(string)).intValue();
                String string2 = bundle.getString("hint");
                if (string2 != null) {
                    try {
                        auus = (auus) aucj.a((aucj) auus.b, jhy.c(string2));
                    } catch (auda e) {
                        a.e("Unable to parse sync hint.", e, new Object[0]);
                        auus = null;
                    }
                    if (auus != null && !amrk.a(auus.a)) {
                        hnv.d = auus.a;
                    }
                }
                hnw = hnv.a();
            } else {
                amri a2 = hnw.a(getContext(), bundle);
                if (a2.a()) {
                    hnw = (hnw) a2.b();
                } else {
                    return;
                }
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                ((hnu) hnu.a.b()).b(hnw);
                a.c("Successfully synced in %d milliseconds with request: %s.", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), hnw);
            } catch (hjm e2) {
                a.e("Failed to sync.", e2, new Object[0]);
            }
        } catch (eif e3) {
            a.e("Error when creating the request.", e3, new Object[0]);
        }
    }
}
