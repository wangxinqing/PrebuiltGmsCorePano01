package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;
import com.google.android.gms.smartdevice.d2d.ui.TargetChimeraActivity;

/* renamed from: abze  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abze extends qvr {
    final /* synthetic */ abxm a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abze(abxm abxm, Looper looper) {
        super(looper);
        this.a = abxm;
    }

    public final void handleMessage(Message message) {
        Bundle bundle;
        try {
            int i = message.what;
            if (i == 0) {
                abtb abtb = this.a.a;
                TargetConnectionArgs targetConnectionArgs = (TargetConnectionArgs) message.obj;
                abtb abtb2 = ((abtx) abtb).a;
                acdr.a.a("Device connected", new Object[0]);
                acac acac = ((acdo) abtb2).a.i;
                aucd aucd = acac.c;
                long currentTimeMillis = System.currentTimeMillis() - acac.a;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                anpa anpa = (anpa) aucd.b;
                anpa anpa2 = anpa.u;
                anpa.a |= 4;
                anpa.c = currentTimeMillis;
                ((acdo) abtb2).a.g.b(111, Bundle.EMPTY);
            } else if (i == 1) {
                abtb abtb3 = this.a.a;
                ((abtx) abtb3).b.a("target_nearby_api");
                abtb abtb4 = ((abtx) abtb3).a;
                acdr.a.a("TargetBootstrapListener.onDisconnected()", new Object[0]);
                acdr acdr = ((acdo) abtb4).a;
                if (acdr.c && acdr.f != 2) {
                    acdr.a();
                }
            } else if (i == 2) {
                BootstrapCompletionResult bootstrapCompletionResult = message.obj != null ? (BootstrapCompletionResult) message.obj : null;
                abtb abtb5 = this.a.a;
                ((abtx) abtb5).b.a("target_nearby_api");
                abtb abtb6 = ((abtx) abtb5).a;
                ((acdo) abtb6).a.f = 2;
                acdr.a.a("TargetBootstrapListener.onCompleted()", new Object[0]);
                acdr acdr2 = ((acdo) abtb6).a;
                if (acdr2.j) {
                    if (acdr2.e == null) {
                        acdr2.g.b(108, Bundle.EMPTY);
                        return;
                    }
                }
                Bundle bundle2 = acdr2.e;
                if (bundle2 != null) {
                    bundle = new Bundle();
                    String string = bundle2.getString("restoreAccount");
                    String string2 = bundle2.getString("restoreToken");
                    iwd iwd = acdr.a;
                    String valueOf = String.valueOf(string);
                    iwd.a(valueOf.length() == 0 ? new String("restoreAccountId: ") : "restoreAccountId: ".concat(valueOf), new Object[0]);
                    iwd iwd2 = acdr.a;
                    String valueOf2 = String.valueOf(string2);
                    iwd2.a(valueOf2.length() == 0 ? new String("restoreToken: ") : "restoreToken: ".concat(valueOf2), new Object[0]);
                    if (TextUtils.isEmpty(string)) {
                        acdr.a.b("Restore account is null or empty.", new Object[0]);
                    }
                    bundle.putString("restoreAccount", string);
                    bundle.putString("restoreToken", string2);
                    bundle.putParcelableArrayList("accounts", bundle2.getParcelableArrayList("accounts"));
                } else {
                    bundle = Bundle.EMPTY;
                }
                boolean z = ((acdo) abtb6).a.h;
                acdr.a.a("handleResults()", new Object[0]);
                TargetChimeraActivity targetChimeraActivity = (TargetChimeraActivity) acdr2.getActivity();
                if (targetChimeraActivity == null) {
                    acdr2.l = new acdp(bundle, z, bootstrapCompletionResult);
                    acdr.a.e("TargetChimeraActivity is null in doneToSuw()", new Object[0]);
                    return;
                }
                targetChimeraActivity.a(bundle, z, bootstrapCompletionResult);
            } else if (i == 3) {
                abtb abtb7 = this.a.a;
                acdr.a.a((String) message.obj, new Object[0]);
            } else if (i == 4) {
                abtb abtb8 = this.a.a;
                String str = (String) message.obj;
                abtb abtb9 = ((abtx) abtb8).a;
                iwd iwd3 = acdr.a;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39);
                sb.append("TargetBootstrapListener.onPinProvided(");
                sb.append(str);
                sb.append(")");
                iwd3.a(sb.toString(), new Object[0]);
                acdr acdr3 = ((acdo) abtb9).a;
                acdr.a.a("startPinCode()", new Object[0]);
                Bundle bundle3 = new Bundle();
                bundle3.putString("pin.code", str);
                acdr3.g.b(113, bundle3);
            } else if (i == 5) {
                abtb abtb10 = this.a.a;
                int intValue = ((Integer) message.obj).intValue();
                if (intValue != 8004) {
                    ((abtx) abtb10).b.a("target_nearby_api");
                }
                abtb abtb11 = ((abtx) abtb10).a;
                if (intValue != 8004) {
                    iwd iwd4 = acdr.a;
                    String valueOf3 = String.valueOf(abpp.g(intValue));
                    iwd4.e(valueOf3.length() == 0 ? new String("Something went wrong: ") : "Something went wrong: ".concat(valueOf3), new Object[0]);
                    ((acdo) abtb11).a.a();
                    return;
                }
                ((acdo) abtb11).a.g.b(115, Bundle.EMPTY);
            } else {
                int i2 = message.what;
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("Unrecognized message: ");
                sb2.append(i2);
                throw new IllegalArgumentException(sb2.toString());
            }
        } catch (RemoteException e) {
            Log.e("SmartDevice", "Error invoking ISourceBootstrapListener.", e);
        }
    }
}
