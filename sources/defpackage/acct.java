package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: acct  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acct extends acco {
    public final accj b;
    public final acac c;
    private final acmx d;

    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.Context, accj] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public acct(android.content.Context r1, com.google.android.chimera.FragmentManager r2, android.os.Bundle r3, defpackage.acac r4) {
        /*
            r0 = this;
            r0.<init>(r2)
            r0.b = r1
            r0.c = r4
            if (r3 == 0) goto L_0x0015
            r1 = 2131428347(0x7f0b03fb, float:1.8478336E38)
            com.google.android.chimera.Fragment r1 = r2.findFragmentById(r1)
            acmx r1 = (defpackage.acmx) r1
            r0.d = r1
            goto L_0x001f
        L_0x0015:
            acmx r1 = new acmx
            r1.<init>()
            r0.d = r1
            r0.a((com.google.android.chimera.Fragment) r1)
        L_0x001f:
            acmx r1 = r0.d
            if (r1 == 0) goto L_0x002c
            accs r1 = new accs
            r1.<init>(r0)
            acmx r2 = r0.d
            r2.b = r1
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acct.<init>(android.content.Context, com.google.android.chimera.FragmentManager, android.os.Bundle, acac):void");
    }

    public final int a() {
        return 4;
    }

    public final void a(Bundle bundle) {
    }

    public final boolean a(int i) {
        return i == 116;
    }

    public final void b(int i, Bundle bundle) {
        if (i == 116) {
            String string = bundle.getString("pairingCode");
            String string2 = bundle.getString("encodedKey");
            acmx acmx = this.d;
            if (acmx != null && !TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                acmx.a = Uri.parse(azjt.f()).buildUpon().appendPath("qr").appendPath(string).appendQueryParameter("key", string2).toString();
                acmx.a(acmx.a);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("Unknown action ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
