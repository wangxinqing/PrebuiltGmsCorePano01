package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: giu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class giu extends qvy {
    final /* synthetic */ gix a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public giu(gix gix, String str) {
        super(str);
        this.a = gix;
    }

    public final void a(ComponentName componentName) {
        iwd iwd = gix.a;
        String valueOf = String.valueOf(componentName.toShortString());
        iwd.b(valueOf.length() == 0 ? new String("onServiceDisconnected ") : "onServiceDisconnected ".concat(valueOf), new Object[0]);
        this.a.g = null;
    }

    public final void a(ComponentName componentName, IBinder iBinder) {
        cpw cpw;
        iwd iwd = gix.a;
        String valueOf = String.valueOf(componentName.toShortString());
        iwd.b(valueOf.length() == 0 ? new String("onServiceConnected ") : "onServiceConnected ".concat(valueOf), new Object[0]);
        gix gix = this.a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.installapi.IPlayInstallService");
            cpw = queryLocalInterface instanceof cpw ? (cpw) queryLocalInterface : new cpw(iBinder);
        } else {
            cpw = null;
        }
        gix.g = cpw;
        try {
            gix gix2 = this.a;
            Bundle bundle = new Bundle();
            bundle.putInt("network_type", 1);
            bundle.putBoolean("charging", false);
            bundle.putBoolean("idle", false);
            Bundle a2 = gix2.g.a(gix2.getContext().getPackageName(), gix2.e, bundle);
            int i = a2.getInt("status_code", -4);
            int i2 = -3;
            if (i == -4) {
                Bundle bundle2 = a2.getBundle("error");
                String string = bundle2.getString("reason");
                String string2 = bundle2.getString("exception_type");
                iwd iwd2 = gix.a;
                StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 91 + String.valueOf(string2).length());
                sb.append("starting DPC installation failed with STATUS_CODE_REQUEST_FAILED reason = ");
                sb.append(string);
                sb.append(" exceptionType = ");
                sb.append(string2);
                iwd2.e(sb.toString(), new Object[0]);
                if ("transient".equals(string)) {
                    i2 = -2;
                }
                gix2.a(Integer.valueOf(i2));
            } else if (i == -3) {
                iwd iwd3 = gix.a;
                StringBuilder sb2 = new StringBuilder(61);
                sb2.append("starting DPC installation failed with status code ");
                sb2.append(i);
                iwd3.e(sb2.toString(), new Object[0]);
                if (((Long) jhg.b.c()).longValue() == 0) {
                    i2 = -2;
                }
                gix2.a(Integer.valueOf(i2));
            } else if (i == -2 || i == -1) {
                iwd iwd4 = gix.a;
                StringBuilder sb3 = new StringBuilder(61);
                sb3.append("starting DPC installation failed with status code ");
                sb3.append(i);
                iwd4.e(sb3.toString(), new Object[0]);
                gix2.a(-3);
            } else if (i != 0) {
                iwd iwd5 = gix.a;
                StringBuilder sb4 = new StringBuilder(77);
                sb4.append("Unknown status code ");
                sb4.append(i);
                sb4.append(" returned by PlayInstallService#installPackage");
                iwd5.e(sb4.toString(), new Object[0]);
                gix2.a(-2);
            } else {
                gix.a.b("DPC installation successfully requested", new Object[0]);
            }
        } catch (RemoteException e) {
            gix.a.e("DPC installation failed - couldn't connect to the install service", e, new Object[0]);
            this.a.a(-2);
        }
    }
}
