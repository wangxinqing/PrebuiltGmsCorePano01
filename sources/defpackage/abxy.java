package defpackage;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.chimera.Activity;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;

/* renamed from: abxy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abxy extends qvr {
    final /* synthetic */ abxa a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abxy(abxa abxa, Looper looper) {
        super(looper);
        this.a = abxa;
    }

    public final void handleMessage(Message message) {
        try {
            int i = message.what;
            if (i != 0) {
                int i2 = 1;
                if (i == 1) {
                    abpw abpw = this.a.a;
                    ((abzb) abpw).b.g("source-bootstrap-api");
                    abpw abpw2 = ((abzb) abpw).a;
                    aclm.a.a("Target disconnected", new Object[0]);
                    ((acky) abpw2).a.b.d();
                } else if (i == 2) {
                    ((acky) ((abzb) this.a.a).a).a.b.a((String) message.obj);
                } else if (i == 3) {
                    abpw abpw3 = this.a.a;
                    int intValue = ((Integer) message.obj).intValue();
                    ((abzb) abpw3).b.g("source-bootstrap-api");
                    abpw abpw4 = ((abzb) abpw3).a;
                    iwd iwd = aclm.a;
                    String valueOf = String.valueOf(abpp.g(intValue));
                    iwd.e(valueOf.length() == 0 ? new String("Bootstrap error: ") : "Bootstrap error: ".concat(valueOf), new Object[0]);
                    if (intValue == 10557 || intValue == 10584) {
                        i2 = 3;
                    } else if (intValue == 10595) {
                        i2 = 8;
                    }
                    ((acky) abpw4).a.b.c(i2);
                } else if (i == 4) {
                    ((acky) ((abzb) this.a.a).a).a.b.a((VerificationInfo) message.obj);
                } else {
                    int i3 = message.what;
                    StringBuilder sb = new StringBuilder(33);
                    sb.append("Unrecognized message: ");
                    sb.append(i3);
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                abpw abpw5 = ((abzb) this.a.a).a;
                ((acky) abpw5).a.g = (BootstrapOptions) message.obj;
                if (!azjn.d() && ((acky) abpw5).a.g.c()) {
                    Activity activity = ((acky) abpw5).a.getActivity();
                    if (activity == null) {
                        aclm.a.d("no activity", new Object[0]);
                        return;
                    } else if (acpd.a(activity).a("com.google").length == 0) {
                        ((acky) abpw5).a.b.c(7);
                        return;
                    }
                }
                ((acky) abpw5).a.b.c();
            }
        } catch (RemoteException e) {
            Log.e("SmartDevice", "Error invoking ISourceBootstrapListener.", e);
        }
    }
}
