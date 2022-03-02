package defpackage;

import android.content.Context;
import android.util.Log;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.List;

/* renamed from: erm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class erm implements err {
    private final erk a;
    private final erl b;
    private final aurg c = new aurg(this.d, new ers());
    private final auri d;

    public erm(erk erk, erl erl) {
        auri auri = new auri();
        this.a = erk;
        this.b = erl;
        this.d = auri;
    }

    public static erm a(Context context) {
        return new erm(new erk(context), new erv(context));
    }

    public final List a(String str, boolean z) {
        return a(str, z, (byte[]) null);
    }

    public final List a(String str, boolean z, byte[] bArr) {
        ert a2 = this.a.a(str);
        if (a2 == null) {
            Log.e("EightDigitOtp", "Failed to get Authzen secret.");
            return null;
        }
        Long a3 = this.b.a(a2);
        String valueOf = String.valueOf(a3);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
        sb.append("Current counter: ");
        sb.append(valueOf);
        sb.toString();
        if (a3 != null) {
            try {
                String[] strArr = new String[1];
                aurg aurg = this.c;
                byte[] bArr2 = a2.b;
                long longValue = a3.longValue();
                if (longValue >= 0) {
                    strArr[0] = String.format("%02d%s", new Object[]{Long.valueOf(longValue % aurg.a), new aurm(aurg.b.a(bArr2), 6, aurm.a).a(auri.a(), longValue, 0, bArr)});
                    return Arrays.asList(strArr);
                }
                throw new IllegalArgumentException("Counter must be non-negative");
            } catch (InvalidKeyException e) {
                Log.e("EightDigitOtp", "Failed to generate code.");
                return null;
            }
        } else {
            Log.e("EightDigitOtp", "Failed to get counter.");
            return null;
        }
    }
}
