package defpackage;

import com.google.android.libraries.bluetooth.BluetoothException;

/* renamed from: aejd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aejd extends aekf {
    final /* synthetic */ aejf a;

    public aejd(aejf aejf) {
        this.a = aejf;
    }

    public final void a(int i) {
        String str;
        if (i == 1) {
            str = "SCAN_FAILED_ALREADY_STARTED";
        } else if (i == 2) {
            str = "SCAN_FAILED_APPLICATION_REGISTRATION_FAILED";
        } else if (i == 3) {
            str = "SCAN_FAILED_INTERNAL_ERROR";
        } else if (i != 4) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Unknown error code - ");
            sb.append(i);
            str = sb.toString();
        } else {
            str = "SCAN_FAILED_FEATURE_UNSUPPORTED";
        }
        aejf aejf = this.a;
        String str2 = aejf.a;
        aekl aekl = aejf.e;
        aekj aekj = new aekj(aeje.SCAN);
        String valueOf = String.valueOf(str);
        aekl.a(aekj, (Object) new BluetoothException(valueOf.length() == 0 ? new String("Scan failed: ") : "Scan failed: ".concat(valueOf)));
    }

    public final void a(aekg aekg) {
        aejf aejf = this.a;
        String str = aejf.a;
        aejf.e.a(new aekj(aeje.SCAN), (Object) aejw.a(aekg.a.getDevice()));
    }
}
