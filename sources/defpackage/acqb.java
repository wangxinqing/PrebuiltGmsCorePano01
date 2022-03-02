package defpackage;

import android.app.Activity;
import android.content.Context;
import android.nfc.NdefMessage;
import android.nfc.NfcAdapter;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;

/* renamed from: acqb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acqb {
    public static void a(Activity activity) {
        int i = Build.VERSION.SDK_INT;
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(activity);
        if (defaultAdapter != null && defaultAdapter.isEnabled()) {
            defaultAdapter.setNdefPushMessage((NdefMessage) null, activity, new Activity[0]);
        }
    }

    public static boolean a(Context context) {
        int i = Build.VERSION.SDK_INT;
        Bundle applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }
}
