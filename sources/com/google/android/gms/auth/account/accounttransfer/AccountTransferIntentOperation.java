package com.google.android.gms.auth.account.accounttransfer;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AccountTransferIntentOperation extends IntentOperation {
    private static final iwd c = ehv.a("AccountTransfer", "AccountTransferIntentOperation");
    etl a;
    achf b;
    private jfp d;

    private final ejl a() {
        ejn ejn = new ejn(this.a);
        achf achf = this.b;
        ibq ibq = abmq.a;
        return new ejl(this, ejn, achf, qub.a((Context) this), this.a);
    }

    public final void onCreate() {
        c.b("onCreate()", new Object[0]);
        jfp jfp = new jfp("AccountTransferIntentOperation", 9);
        this.d = jfp;
        jfp.start();
        this.a = esu.a(this);
        this.b = abmq.a(this);
    }

    public final void onDestroy() {
        c.b("onDestroy()", new Object[0]);
        this.d.quit();
        this.d = null;
    }

    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("key_extra_account_type");
            if (!"com.google".equals(stringExtra)) {
                c.d("Not handling acconut type in onHandleIntent(accountType=%s). Sending completion status", stringExtra);
                ejp.a(esu.a(this), stringExtra);
                return;
            }
            String action = intent.getAction();
            c.b("onHandleIntent(intent=%s)", action);
            if ("com.google.android.gms.auth.ACCOUNT_EXPORT_DATA_AVAILABLE".equals(action)) {
                a().a();
            } else if ("com.google.android.gms.auth.ACCOUNT_IMPORT_DATA_AVAILABLE".equals(action)) {
                ejn ejn = new ejn(this.a);
                achf achf = this.b;
                ibq ibq = abmq.a;
                new ejm(this, ejn, achf, qub.a((Context) this), (eny) eny.a.b(), new ejo(this, new jfo(this.d)), this.a).a();
            } else if ("com.google.android.gms.auth.START_ACCOUNT_EXPORT".equals(action)) {
                ejl a2 = a();
                ejl.a.b("startAccountExport()", new Object[0]);
                try {
                    a2.b();
                } catch (ejk e) {
                    ejl.a.e("startAccountExport() error", e, new Object[0]);
                    ejp.b(a2.b);
                }
            }
        } else {
            c.d("onHandleIntent(intent=null)", new Object[0]);
        }
    }
}
