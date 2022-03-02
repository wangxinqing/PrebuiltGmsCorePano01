package defpackage;

import com.google.android.gms.nearby.bootstrap.Device;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;
import java.util.Locale;

/* renamed from: abqm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abqm implements tdb {
    final /* synthetic */ abqo a;

    public abqm(abqo abqo) {
        this.a = abqo;
    }

    public final void a() {
        acau acau = this.a.e;
        if (acau != null) {
            acau.a();
        }
        this.a.d = null;
    }

    public final void b() {
        acau acau = this.a.e;
        if (acau != null) {
            acau.a((String) null);
        }
    }

    public final void a(int i) {
        iwd iwd = abqo.a;
        String valueOf = String.valueOf(tdg.g(i));
        iwd.e(valueOf.length() == 0 ? new String("Nearby.Bootstrap ConnectionListener error: ") : "Nearby.Bootstrap ConnectionListener error: ".concat(valueOf), new Object[0]);
        acau acau = this.a.e;
        if (acau != null) {
            acau.a(10557);
        }
    }

    public final void b(String str) {
        iva.a(str, (Object) "base64 cannot be null.");
        iva.a(str.length() >= 6, (Object) "base64 must be 6 or more characters.");
        StringBuilder sb = new StringBuilder(str.toUpperCase(Locale.US).substring(0, 6));
        iva.a((Object) sb, (Object) "sb cannot be null.");
        for (int i = 0; i < sb.length(); i++) {
            char charAt = sb.charAt(i);
            if (charAt == '+') {
                sb.setCharAt(i, '5');
            } else if (charAt == '/') {
                sb.setCharAt(i, '6');
            } else if (charAt == 'A') {
                sb.setCharAt(i, '0');
            } else if (charAt == 'E') {
                sb.setCharAt(i, '1');
            } else if (charAt == 'I') {
                sb.setCharAt(i, '2');
            } else if (charAt == 'O') {
                sb.setCharAt(i, '3');
            } else if (charAt == 'U') {
                sb.setCharAt(i, '4');
            }
        }
        String sb2 = sb.toString();
        acau acau = this.a.e;
        if (acau != null) {
            acau.a(sb2);
        }
    }

    public final void a(Device device, byte[] bArr) {
        amrl.a((Object) device, (Object) "device is null.");
        iwd iwd = abqo.a;
        String str = device.b;
        String str2 = device.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(str2).length());
        sb.append("Connected to target device:");
        sb.append(str);
        sb.append(" (");
        sb.append(str2);
        sb.append(")");
        iwd.a(sb.toString(), new Object[0]);
        acbn acbn = new acbn(this.a.b, device);
        amrl.a((Object) acbn, (Object) "DeviceMessageSender is null.");
        acau acau = this.a.e;
        if (acau != null) {
            acau.a(acbn, (TargetConnectionArgs) null);
        }
    }

    public final void a(String str) {
        abqo.a.f("ConnectionListener.onTokenFailure(String) called on source device. This should not happen.", new Object[0]);
        throw new UnsupportedOperationException("Token failure not supported on source device.");
    }
}
