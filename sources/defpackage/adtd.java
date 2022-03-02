package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
import android.util.Base64;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.ConsentInformation;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: adtd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adtd extends adso {
    private final String a;
    private final byte[] b;
    private final int[] c;
    private final int d;
    private final Context e;
    private final acwd f;
    private final hol g;

    private final boolean a(ConsentInformation.AccountConsentInformation accountConsentInformation, int i, boolean z, boolean z2) {
        List a2 = accountConsentInformation.a();
        aucd o = avvq.e.o();
        if (!a2.isEmpty()) {
            int size = a2.size();
            for (int i2 = 0; i2 < size; i2++) {
                Integer num = (Integer) a2.get(i2);
                if (num != null) {
                    aups a3 = aups.a(num.intValue());
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    avvq avvq = (avvq) o.b;
                    a3.getClass();
                    if (!avvq.c.a()) {
                        avvq.c = aucj.a(avvq.c);
                    }
                    avvq.c.d(a3.d);
                }
            }
        }
        try {
            avvt avvt = (avvt) aucj.a((aucj) avvt.l, accountConsentInformation.b);
            if (o.c) {
                o.c();
                o.c = false;
            }
            avvq avvq2 = (avvq) o.b;
            avvt.getClass();
            avvq2.b = avvt;
            avvq2.a |= 1;
            if (azuc.a.a().b() && this.e.getPackageName().equals("com.google.android.gms")) {
                int i3 = Build.VERSION.SDK_INT;
                UserManager userManager = (UserManager) this.e.getSystemService("user");
                if (userManager != null) {
                    int userCount = userManager.getUserCount();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    avvq avvq3 = (avvq) o.b;
                    avvq3.a |= 2;
                    avvq3.d = userCount;
                }
            }
            hol hol = this.g;
            if (z2) {
                hol = hol.a(this.e.getApplicationContext(), this.a);
            }
            hoi a4 = hol.a(this.b);
            a4.f = avsd.a(this.d);
            a4.d = this.a;
            HashMap hashMap = new HashMap();
            hashMap.put("CONSENT_INFO", Base64.encodeToString(((avvq) o.i()).k(), 0));
            hashMap.put("ACCOUNT_INDEX", Integer.toString(i));
            aucf aucf = a4.i;
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            avrm avrm = avrm.t;
            ((avrm) aucf.b).i = aucj.s();
            for (Map.Entry entry : hashMap.entrySet()) {
                aucd o2 = avrn.d.o();
                String str = (String) entry.getKey();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                avrn avrn = (avrn) o2.b;
                str.getClass();
                avrn.a |= 1;
                avrn.b = str;
                String str2 = (String) entry.getValue();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                avrn avrn2 = (avrn) o2.b;
                str2.getClass();
                avrn2.a |= 2;
                avrn2.c = str2;
                a4.i.a((avrn) o2.i());
            }
            if (!z && !z2) {
                a4.c(accountConsentInformation.a);
            }
            int[] iArr = this.c;
            if (iArr != null && iArr.length > 0 && !z2) {
                a4.a(iArr);
            }
            a4.b();
            return true;
        } catch (auda e2) {
            return false;
        }
    }

    public adtd(String str, byte[] bArr, int[] iArr, int i, Context context, acwd acwd) {
        this.a = str;
        this.b = bArr;
        this.c = iArr;
        this.d = i;
        this.f = acwd;
        this.e = context;
        this.g = new hol(context, (String) null, (String) null);
    }

    public final void a(Status status, ConsentInformation consentInformation) {
        if (!status.c()) {
            ihd.a(status, this.f);
            return;
        }
        List a2 = consentInformation.a();
        if (!consentInformation.c || a2.isEmpty()) {
            if (!consentInformation.b || a2.isEmpty()) {
                int size = a2.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (a((ConsentInformation.AccountConsentInformation) a2.get(i), i2, false, false)) {
                        i2++;
                        i++;
                    } else {
                        ihd.a(Status.c, this.f);
                        return;
                    }
                }
            } else if (!a((ConsentInformation.AccountConsentInformation) a2.get(0), 0, true, false)) {
                ihd.a(Status.c, this.f);
                return;
            }
        } else if (!a((ConsentInformation.AccountConsentInformation) a2.get(0), 0, false, true)) {
            ihd.a(Status.c, this.f);
            return;
        }
        ihd.a(Status.a, this.f);
    }
}
