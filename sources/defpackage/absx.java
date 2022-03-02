package defpackage;

import android.app.PendingIntent;
import android.os.ResultReceiver;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorAnnotatedData;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.TargetAccountImportController$ChallengeIntentHelper;
import com.google.android.gms.smartdevice.d2d.TargetAccountImportController$ImportReceiver;
import com.google.android.gms.smartdevice.d2d.data.AccountTransferPayload;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.ui.ForwardingChimeraActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: absx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class absx implements Runnable {
    final /* synthetic */ String[] a;
    final /* synthetic */ TargetAccountImportController$ImportReceiver b;

    public absx(TargetAccountImportController$ImportReceiver targetAccountImportController$ImportReceiver, String[] strArr) {
        this.b = targetAccountImportController$ImportReceiver;
        this.a = strArr;
    }

    public final void run() {
        if (azlf.m()) {
            absy absy = this.b.a;
            String[] strArr = this.a;
            iwd iwd = absy.a;
            if (strArr != null) {
                HashSet a2 = angm.a(strArr.length);
                Collections.addAll(a2, strArr);
                if (absy.e.containsAll(a2)) {
                    absy.a.a("Skipping broadcast. %s already processed", Arrays.toString(this.a));
                    return;
                }
            }
        }
        absy.a.a("Handling authenticatorIds %s", Arrays.toString(this.a));
        absy absy2 = this.b.a;
        iva.a(absy2.b);
        absy2.h.c();
        absy.a.a("Additional info requested, importAccount(RETRIEVE_DATA)", new Object[0]);
        etn etn = new etn();
        etn.a(2);
        acwa b2 = absy2.c.b(etn.a());
        Status a3 = acqd.a(b2);
        if (!a3.c()) {
            int i = a3.i;
            StringBuilder sb = new StringBuilder(46);
            sb.append("importAccount(RETRIEVE_DATA) error ");
            sb.append(i);
            String sb2 = sb.toString();
            absy.a.e(sb2, new Object[0]);
            absy2.d.a(10579, sb2);
            return;
        }
        AccountTransferMsg accountTransferMsg = (AccountTransferMsg) b2.d();
        if (absy2.c(accountTransferMsg)) {
            return;
        }
        if (accountTransferMsg == null) {
            absy.a.e("AccountTransferMsg was null", new Object[0]);
            return;
        }
        ArrayList arrayList = accountTransferMsg.c;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                AuthenticatorAnnotatedData authenticatorAnnotatedData = (AuthenticatorAnnotatedData) arrayList.get(i2);
                String str = authenticatorAnnotatedData.f;
                absy.a.a("Processing authenticator data with id(%s)", str);
                absy2.e.add(str);
                AuthenticatorTransferInfo authenticatorTransferInfo = authenticatorAnnotatedData.c;
                absy.a.b("Processing %s, status - %d", authenticatorTransferInfo.c, Integer.valueOf(authenticatorTransferInfo.d));
                int i3 = authenticatorTransferInfo.d;
                if (i3 == 3) {
                    arrayList2.add(authenticatorAnnotatedData);
                } else if (i3 == 4) {
                    TargetAccountImportController$ChallengeIntentHelper targetAccountImportController$ChallengeIntentHelper = absy2.g;
                    PendingIntent a4 = ForwardingChimeraActivity.a(targetAccountImportController$ChallengeIntentHelper.a, (ResultReceiver) targetAccountImportController$ChallengeIntentHelper, authenticatorTransferInfo.f);
                    if (targetAccountImportController$ChallengeIntentHelper.e) {
                        absy.a.a("Queuing additional challenge request", new Object[0]);
                        targetAccountImportController$ChallengeIntentHelper.b.add(a4);
                    } else {
                        targetAccountImportController$ChallengeIntentHelper.c.b();
                        targetAccountImportController$ChallengeIntentHelper.e = true;
                        targetAccountImportController$ChallengeIntentHelper.d.a(a4);
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                etn etn2 = new etn();
                etn2.a(arrayList2);
                etn2.a(accountTransferMsg.e);
                AccountTransferPayload accountTransferPayload = new AccountTransferPayload(etn2.a());
                MessagePayload messagePayload = new MessagePayload();
                messagePayload.a(accountTransferPayload);
                absy2.d.a(messagePayload);
                return;
            }
            return;
        }
        absy.a.a("No authenticator data to process", new Object[0]);
    }
}
