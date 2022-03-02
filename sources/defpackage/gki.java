package defpackage;

import android.app.KeyguardManager;
import android.app.admin.DevicePolicyManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.R;
import com.google.android.gms.auth.setup.d2d.SourceChimeraActivity;
import java.io.IOException;

/* renamed from: gki  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gki implements DialogInterface.OnClickListener {
    final /* synthetic */ SourceChimeraActivity a;

    public gki(SourceChimeraActivity sourceChimeraActivity) {
        this.a = sourceChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean z;
        boolean z2;
        DevicePolicyManager devicePolicyManager;
        Intent createConfirmDeviceCredentialIntent;
        SourceChimeraActivity sourceChimeraActivity = this.a;
        if (sourceChimeraActivity.e) {
            synchronized (sourceChimeraActivity.i) {
                if (sourceChimeraActivity.s != null) {
                    aucd o = gkt.h.o();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    gkt.a((gkt) o.b);
                    String string = sourceChimeraActivity.getString(R.string.auth_d2d_target_unlock_progress_message);
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    gkt gkt = (gkt) o.b;
                    string.getClass();
                    gkt.a |= 2;
                    gkt.b = string;
                    try {
                        sourceChimeraActivity.s.a((gkt) o.i());
                    } catch (IOException e) {
                        SourceChimeraActivity.a.a((Throwable) e);
                    }
                }
                int i2 = Build.VERSION.SDK_INT;
                KeyguardManager keyguardManager = (KeyguardManager) sourceChimeraActivity.getSystemService("keyguard");
                z = true;
                if (keyguardManager == null || (createConfirmDeviceCredentialIntent = keyguardManager.createConfirmDeviceCredentialIntent(sourceChimeraActivity.getString(R.string.auth_d2d_source_title), (CharSequence) null)) == null) {
                    z2 = false;
                } else {
                    sourceChimeraActivity.j = true;
                    sourceChimeraActivity.startActivityForResult(createConfirmDeviceCredentialIntent, 1);
                    z2 = true;
                }
                if (!z2 && (devicePolicyManager = (DevicePolicyManager) sourceChimeraActivity.getSystemService("device_policy")) != null) {
                    sourceChimeraActivity.q = new acrz(sourceChimeraActivity, 805306394, "d2d", (String) null, "com.google.android.gms");
                    try {
                        sourceChimeraActivity.j = true;
                        devicePolicyManager.lockNow();
                    } catch (SecurityException e2) {
                        sourceChimeraActivity.j = false;
                        sourceChimeraActivity.q = null;
                    }
                }
                z = z2;
            }
            if (!z) {
                SourceChimeraActivity.a.c("Unable to bring up the lockscreen", new Object[0]);
            } else {
                return;
            }
        }
        this.a.a();
    }
}
