package com.google.android.gms.accountsettings.operations;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.accountsettings.mg.poc.model.repository.RepositoryDatabase;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AccountChangedIntentOperation extends IntentOperation {
    static iwd a = dit.a("AcctChgOp");
    private RepositoryDatabase b;

    public AccountChangedIntentOperation() {
    }

    public final void onCreate() {
        if (this.b == null) {
            this.b = RepositoryDatabase.a(getApplicationContext());
        }
    }

    public final void onDestroy() {
        RepositoryDatabase repositoryDatabase = this.b;
        if (repositoryDatabase != null) {
            repositoryDatabase.d();
        }
    }

    public final void onHandleIntent(Intent intent) {
        a.a("Handle intent-operations: %s", intent);
        if (intent != null && "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(intent.getAction())) {
            a.a("Remove data for obsolete accounts", new Object[0]);
            ArrayList arrayList = new ArrayList();
            for (Account account : jgu.d(this, getPackageName())) {
                arrayList.add(account.name);
            }
            RepositoryDatabase repositoryDatabase = this.b;
            repositoryDatabase.k().b(arrayList);
            repositoryDatabase.l().a((List) arrayList);
            if (arrayList.isEmpty()) {
                repositoryDatabase.m().b();
            }
        }
    }

    protected AccountChangedIntentOperation(Context context, RepositoryDatabase repositoryDatabase) {
        attachBaseContext(context);
        this.b = repositoryDatabase;
    }
}
