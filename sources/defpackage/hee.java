package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.google.android.chimera.IntentOperation;

/* renamed from: hee  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class hee extends IntentOperation {
    public final String a;

    protected hee(String str) {
        this.a = str;
    }

    public abstract void a();

    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if (!"android.provider.Telephony.SECRET_CODE".equals(action)) {
            String valueOf = String.valueOf(action);
            Log.w("SecretCodeIO", valueOf.length() == 0 ? new String("Ignoring unexpected intent: ") : "Ignoring unexpected intent: ".concat(valueOf));
            return;
        }
        Uri data = intent.getData();
        String str = null;
        if (data != null && "android_secret_code".equals(data.getScheme())) {
            str = data.getHost();
        }
        if (str == null) {
            String valueOf2 = String.valueOf(data);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 39);
            sb.append("Ignoring malformed SECRET_CODE Intent: ");
            sb.append(valueOf2);
            Log.w("SecretCodeIO", sb.toString());
        } else if (this.a.equals(str)) {
            a();
        }
    }
}
