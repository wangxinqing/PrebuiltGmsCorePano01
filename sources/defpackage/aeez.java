package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.provider.Settings;
import java.util.Locale;

/* renamed from: aeez  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeez {
    private static final anml a;

    static {
        anml anml = anml.g;
        anmk anmk = (anmk) anml;
        anml anml2 = anmk.d;
        if (anml2 == null) {
            anmf anmf = anmk.b;
            if (anmf.a()) {
                amrl.b(!anmf.b(), (Object) "Cannot call upperCase() on a mixed-case alphabet");
                char[] cArr = new char[anmf.b.length];
                int i = 0;
                while (true) {
                    char[] cArr2 = anmf.b;
                    if (i >= cArr2.length) {
                        break;
                    }
                    cArr[i] = ampw.a(cArr2[i]);
                    i++;
                }
                anmf = new anmf(anmf.a.concat(".upperCase()"), cArr);
            }
            if (anmf != anmk.b) {
                anml = anmk.a(anmf, anmk.c);
            }
            anmk.d = anml;
            anml2 = anml;
        }
        a = anml2.a(":");
    }

    public static String a(byte[] bArr) {
        return a.a(bArr);
    }

    public static byte[] a(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "bluetooth_address");
        if (string == null || !BluetoothAdapter.checkBluetoothAddress(string)) {
            return null;
        }
        return a(string);
    }

    public static byte[] a(String str) {
        return a.b((CharSequence) str.toUpperCase(Locale.US));
    }
}
