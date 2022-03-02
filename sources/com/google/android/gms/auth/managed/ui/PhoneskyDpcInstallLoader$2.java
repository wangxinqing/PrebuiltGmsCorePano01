package com.google.android.gms.auth.managed.ui;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PhoneskyDpcInstallLoader$2 extends nla {
    final /* synthetic */ gix a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoneskyDpcInstallLoader$2(gix gix, String str) {
        super(str);
        this.a = gix;
    }

    public final void a(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("package_name");
        int intExtra = intent.getIntExtra("package_event", -1);
        iwd iwd = gix.a;
        StringBuilder sb = new StringBuilder(String.valueOf(stringExtra).length() + 49);
        sb.append("Install update for package ");
        sb.append(stringExtra);
        sb.append(" and event ");
        sb.append(intExtra);
        iwd.b(sb.toString(), new Object[0]);
        if (this.a.e.equals(stringExtra)) {
            gix gix = this.a;
            if (intExtra != 10) {
                if (intExtra != 11) {
                    switch (intExtra) {
                        case -1:
                            gix.a(-3);
                            return;
                        case 0:
                            break;
                        case 1:
                            gix.a(-5);
                            return;
                        case 2:
                        case 3:
                        case 5:
                            gix.a(-2);
                            return;
                        case 4:
                            gix.a(-6);
                            return;
                        case 6:
                            break;
                        default:
                            iwd iwd2 = gix.a;
                            StringBuilder sb2 = new StringBuilder(37);
                            sb2.append("Unexpected install event: ");
                            sb2.append(intExtra);
                            iwd2.d(sb2.toString(), new Object[0]);
                            gix.a(-2);
                            return;
                    }
                }
                gix.a(-4);
                return;
            }
            gix.a(-1);
        }
    }
}
