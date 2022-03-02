package com.google.android.gms.appinvite.sms;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.os.RemoteException;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UpdateSmsOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        String stringExtra = intent.getStringExtra("accountName");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("sentSms");
        ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("notSentSms");
        Account account = new Account(stringExtra, "com.google");
        ClientContext clientContext = new ClientContext();
        clientContext.b = Process.myUid();
        clientContext.d = account;
        clientContext.c = account;
        clientContext.e = getPackageName();
        clientContext.f = getPackageName();
        clientContext.a(new String[]{"https://www.googleapis.com/auth/plus.native"});
        Context applicationContext = getApplicationContext();
        try {
            new dxc(clientContext, dwj.a(applicationContext), new dwd(applicationContext), stringArrayListExtra, stringArrayListExtra2).a(applicationContext);
        } catch (RemoteException | jbk e) {
            apev.a(e);
        }
    }
}
