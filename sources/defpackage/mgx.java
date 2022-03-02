package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.telephony.TelephonyManager;
import com.google.android.chimera.Activity;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: mgx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mgx {
    private static final Set a = new HashSet(Arrays.asList(new String[]{"android.permission-group.CONTACTS"}));
    private static final Set b = new HashSet(Arrays.asList(new String[]{"android.permission-group.CONTACTS", "android.permission-group.PHONE", "android.permission-group.SMS"}));
    private final Activity c;
    private final mgw d;
    private final ixm e = ixm.b;
    private final boolean f;

    public mgx(Activity activity, mgw mgw, boolean z) {
        this.c = activity;
        this.d = mgw;
        this.f = z;
    }

    private final boolean a() {
        return this.c.getPackageManager().hasSystemFeature("android.hardware.telephony") && ((TelephonyManager) this.c.getSystemService("phone")).getLine1Number() != null;
    }

    public final void a(boolean z) {
        boolean z2 = true;
        boolean z3 = false;
        if (jkr.b()) {
            Set a2 = this.e.a(b);
            boolean z4 = !a2.contains("android.permission-group.SMS");
            boolean z5 = !a2.contains("android.permission-group.CONTACTS");
            boolean z6 = !a2.contains("android.permission-group.PHONE");
            if (!z5 && z) {
                try {
                    this.c.startIntentSenderForResult(this.e.a(this.c, a).getIntentSender(), 2, (Intent) null, 0, 0, 0);
                } catch (IntentSender.SendIntentException e2) {
                    mfv.f("InvitationPermissionHelper", "trouble sending intent for requesting permissions", new Object[0]);
                    this.d.a();
                }
            } else {
                if (this.f) {
                    z2 = false;
                } else if (!z4) {
                    z2 = false;
                } else if (!z6 || !a()) {
                    z2 = false;
                }
                this.d.a(z5, z2);
            }
        } else {
            mgw mgw = this.d;
            if (!this.f && a()) {
                z3 = true;
            }
            mgw.a(true, z3);
        }
    }
}
