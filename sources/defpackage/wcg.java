package defpackage;

import android.accounts.Account;
import com.google.android.gms.nearby.sharing.Contact;

/* renamed from: wcg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wcg {
    public final wgx a;
    public final wcp b;
    public final wbo c;

    public wcg(wgx wgx, wcp wcp, wbo wbo) {
        this.a = wgx;
        this.b = wcp;
        this.c = wbo;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v43, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.nearby.sharing.Contact a(defpackage.vig r12) {
        /*
            vif r0 = new vif
            r0.<init>()
            vii r1 = r12.b
            if (r1 == 0) goto L_0x000a
            goto L_0x000c
        L_0x000a:
            vii r1 = defpackage.vii.d
        L_0x000c:
            long r1 = r1.b
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.a = r1
            vii r1 = r12.b
            if (r1 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            vii r1 = defpackage.vii.d
        L_0x001b:
            java.lang.String r1 = r1.c
            r0.b = r1
            java.lang.String r1 = r12.c
            r0.c = r1
            java.lang.String r1 = r12.d
            boolean r1 = r1.isEmpty()
            r2 = 0
            if (r1 != 0) goto L_0x0033
            java.lang.String r1 = r12.d
            android.net.Uri r1 = android.net.Uri.parse(r1)
            goto L_0x0034
        L_0x0033:
            r1 = r2
        L_0x0034:
            r0.d = r1
            boolean r1 = r12.g
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.e = r1
            aucx r1 = r12.f
            int r1 = r1.size()
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0049
            goto L_0x005b
        L_0x0049:
            aucx r1 = r12.e
            int r1 = r1.size()
            if (r1 != 0) goto L_0x005b
            vim r1 = new vim
            r1.<init>()
            com.google.android.gms.nearby.sharing.ContactInfo r1 = r1.a()
            goto L_0x00a6
        L_0x005b:
            aucx r1 = r12.f
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x006d
            aucx r1 = r12.f
            java.lang.Object r1 = r1.get(r3)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x006e
        L_0x006d:
        L_0x006e:
            if (r2 != 0) goto L_0x0087
            aucx r1 = r12.e
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            vim r2 = new vim
            r2.<init>()
            r5 = 2
            r2.a = r5
            r2.b = r1
            com.google.android.gms.nearby.sharing.ContactInfo r1 = r2.a()
            goto L_0x00a6
        L_0x0087:
            int r1 = android.os.Build.VERSION.SDK_INT
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r1 = r1.getCountry()
            java.lang.String r1 = android.telephony.PhoneNumberUtils.formatNumber(r2, r1)
            if (r1 != 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r2 = r1
        L_0x0099:
            vim r1 = new vim
            r1.<init>()
            r1.a = r4
            r1.b = r2
            com.google.android.gms.nearby.sharing.ContactInfo r1 = r1.a()
        L_0x00a6:
            r0.f = r1
            boolean r1 = r12.h
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.g = r1
            boolean r1 = r12.i
            if (r1 != 0) goto L_0x00c0
            boolean r1 = defpackage.ayni.E()
            if (r1 == 0) goto L_0x00bf
            boolean r12 = r12.k
            if (r12 != 0) goto L_0x00c0
            goto L_0x00c1
        L_0x00bf:
            goto L_0x00c1
        L_0x00c0:
            r3 = 1
        L_0x00c1:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r3)
            r0.h = r12
            java.lang.Long r12 = r0.a
            java.lang.String r1 = "Contact's id must not be null."
            defpackage.iva.a((java.lang.Object) r12, (java.lang.Object) r1)
            java.lang.String r12 = r0.b
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            r12 = r12 ^ r4
            java.lang.String r1 = "Contact's lookupKey must not be null or empty."
            defpackage.iva.b(r12, r1)
            java.lang.String r12 = r0.c
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            r12 = r12 ^ r4
            java.lang.String r1 = "Contact's displayName must not be null or empty."
            defpackage.iva.b(r12, r1)
            com.google.android.gms.nearby.sharing.ContactInfo r12 = r0.f
            java.lang.String r1 = "Contact's contactInfo must not be null or empty."
            defpackage.iva.a((java.lang.Object) r12, (java.lang.Object) r1)
            java.lang.Boolean r12 = r0.e
            java.lang.String r1 = "Contact's isSelected must not be null."
            defpackage.iva.a((java.lang.Object) r12, (java.lang.Object) r1)
            java.lang.Boolean r12 = r0.g
            java.lang.String r1 = "Contact's isReachable must not be null."
            defpackage.iva.a((java.lang.Object) r12, (java.lang.Object) r1)
            java.lang.Boolean r12 = r0.h
            java.lang.String r1 = "Contact's isRecommended must not be null."
            defpackage.iva.a((java.lang.Object) r12, (java.lang.Object) r1)
            com.google.android.gms.nearby.sharing.Contact r12 = new com.google.android.gms.nearby.sharing.Contact
            java.lang.Long r1 = r0.a
            long r3 = r1.longValue()
            java.lang.String r5 = r0.b
            java.lang.String r6 = r0.c
            android.net.Uri r7 = r0.d
            java.lang.Boolean r1 = r0.e
            boolean r8 = r1.booleanValue()
            com.google.android.gms.nearby.sharing.ContactInfo r9 = r0.f
            java.lang.Boolean r1 = r0.g
            boolean r10 = r1.booleanValue()
            java.lang.Boolean r0 = r0.h
            boolean r11 = r0.booleanValue()
            r2 = r12
            r2.<init>(r3, r5, r6, r7, r8, r9, r10, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wcg.a(vig):com.google.android.gms.nearby.sharing.Contact");
    }

    public final int b(Contact contact) {
        Account b2 = this.c.b();
        if (b2 == null) {
            ((anih) ((anih) vvj.a.c()).a("wcg", "b", 120, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to unmark contact %s: account is null.", contact.a);
            return 35505;
        }
        wgx wgx = this.a;
        aucd o = vii.d.o();
        long j = contact.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        vii vii = (vii) o.b;
        int i = vii.a | 1;
        vii.a = i;
        vii.b = j;
        String str = contact.b;
        str.getClass();
        vii.a = i | 2;
        vii.c = str;
        int b3 = wgx.b(b2, (vii) o.i());
        if (b3 == 0) {
            if (contact.g) {
                this.b.b();
            }
            this.b.c();
        }
        return b3;
    }

    public final int a(Contact contact) {
        Account b2 = this.c.b();
        if (b2 == null) {
            ((anih) ((anih) vvj.a.c()).a("wcg", "a", 100, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to mark contact %s: account is null.", contact.a);
            return 35505;
        }
        wgx wgx = this.a;
        aucd o = vii.d.o();
        long j = contact.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        vii vii = (vii) o.b;
        int i = vii.a | 1;
        vii.a = i;
        vii.b = j;
        String str = contact.b;
        str.getClass();
        vii.a = i | 2;
        vii.c = str;
        int a2 = wgx.a(b2, (vii) o.i());
        if (a2 != 0) {
            return a2;
        }
        this.b.c();
        return 0;
    }

    public final void a() {
        this.a.a();
        this.b.f().edit().clear().apply();
    }
}
