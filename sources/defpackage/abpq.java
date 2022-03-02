package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferProgress;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorAnnotatedData;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.SourceAccountExportController$ExportReceiver;
import com.google.android.gms.smartdevice.d2d.data.AccountTransferPayload;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: abpq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abpq implements Runnable {
    final /* synthetic */ String[] a;
    final /* synthetic */ SourceAccountExportController$ExportReceiver b;

    public abpq(SourceAccountExportController$ExportReceiver sourceAccountExportController$ExportReceiver, String[] strArr) {
        this.b = sourceAccountExportController$ExportReceiver;
        this.a = strArr;
    }

    public final void run() {
        int i;
        if (azlf.m()) {
            abpr abpr = this.b.a;
            String[] strArr = this.a;
            if (strArr != null && abpr.g.containsAll(Arrays.asList(strArr))) {
                abpr.a.a("Skipping broadcast. Already processed %s", Arrays.toString(this.a));
                return;
            }
        }
        abpr.a.a("Handling authenticatorIds %s", Arrays.toString(this.a));
        abpr abpr2 = this.b.a;
        etn etn = new etn();
        etn.a(2);
        acwa a2 = abpr2.c.a(etn.a());
        Status a3 = acqd.a(a2);
        AccountTransferMsg accountTransferMsg = a3.c() ? (AccountTransferMsg) a2.d() : null;
        abpr.a.a("exportAccounts(RETRIEVE_DATA) %s", a3);
        if (a3.i == 20501) {
            abpr.a.a("No data available", new Object[0]);
        } else if (accountTransferMsg != null) {
            ArrayList arrayList = accountTransferMsg.c;
            ArrayList arrayList2 = new ArrayList();
            AccountTransferProgress accountTransferProgress = accountTransferMsg.e;
            if (accountTransferProgress == null || abpr2.h != 0) {
                i = 0;
            } else {
                abpr2.h = ((ou) accountTransferProgress.b()).h;
                i = 0;
            }
            while (i < arrayList.size()) {
                AuthenticatorAnnotatedData authenticatorAnnotatedData = (AuthenticatorAnnotatedData) arrayList.get(i);
                abpr2.g.add(authenticatorAnnotatedData.f);
                AuthenticatorTransferInfo authenticatorTransferInfo = authenticatorAnnotatedData.c;
                abpr2.f.add(authenticatorTransferInfo.c);
                PendingIntent pendingIntent = authenticatorTransferInfo.f;
                abpr.a.b("Processing %s, status %d", authenticatorTransferInfo.c, Integer.valueOf(authenticatorTransferInfo.d));
                if (pendingIntent != null) {
                    abpr.a.a("Found pendingIntent %s", pendingIntent);
                    abpr2.e.incrementAndGet();
                    abpr2.b.a();
                    abpr2.b.a(pendingIntent);
                } else {
                    arrayList2.add(authenticatorAnnotatedData);
                }
                i++;
            }
            MessagePayload messagePayload = new MessagePayload();
            etn etn2 = new etn();
            etn2.a(arrayList2);
            etn2.a(accountTransferProgress);
            messagePayload.a(new AccountTransferPayload(etn2.a()));
            abpr2.b.a(messagePayload);
        } else {
            abpr2.a("Retrieved data was null");
        }
    }
}
