package defpackage;

import android.util.Log;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: erw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class erw implements err {
    private final erk a;
    private final erl b;
    private final aurn c = new aurn(this.d, new ers());
    private final auri d;

    public erw(erk erk, erl erl) {
        auri auri = new auri();
        this.a = erk;
        this.b = erl;
        this.d = auri;
    }

    public final List a(String str, boolean z) {
        return a(str, z, (byte[]) null);
    }

    public final List a(String str, boolean z, byte[] bArr) {
        int i;
        boolean z2;
        String str2;
        ert a2 = this.a.a(str);
        if (a2 == null) {
            Log.e("TenDigitOtp", "Failed to get Authzen secret.");
            return null;
        }
        Long a3 = this.b.a(a2);
        if (!(a3 == null || a3.longValue() % 2 == 0)) {
            a3 = this.b.a(a2);
        }
        String valueOf = String.valueOf(a3);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
        sb.append("Current counter: ");
        sb.append(valueOf);
        sb.toString();
        if (a3 == null) {
            Log.e("TenDigitOtp", "Failed to get counter.");
            return null;
        }
        if (!z) {
            i = 1;
        } else {
            i = 2;
        }
        try {
            aurn aurn = this.c;
            byte[] bArr2 = a2.b;
            long longValue = a3.longValue();
            aurn.a(true);
            long a4 = auri.a();
            aurm aurm = new aurm(aurn.b.a(bArr2), 9, aurn.a);
            ArrayList arrayList = new ArrayList(2);
            for (long j = 0; j < 2; j++) {
                long j2 = (longValue + j) % 1000;
                aurn.a(true);
                boolean z3 = false;
                if (j2 >= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                aurn.a(z2);
                if (j2 < 1000) {
                    z3 = true;
                }
                aurn.a(z3);
                String a5 = aurm.a(a4, j2, i, bArr);
                if (j2 % 2 != 0) {
                    long j3 = (j2 % 50) / 10;
                    str2 = Long.toString(j3 + j3 + 1);
                } else {
                    str2 = Long.toString(j2 % 10);
                }
                String valueOf2 = String.valueOf(str2);
                String valueOf3 = String.valueOf(a5);
                arrayList.add(valueOf3.length() == 0 ? new String(valueOf2) : valueOf2.concat(valueOf3));
            }
            return arrayList;
        } catch (InvalidKeyException e) {
            Log.e("TenDigitOtp", "Failed to generate code.", e);
            return null;
        }
    }
}
