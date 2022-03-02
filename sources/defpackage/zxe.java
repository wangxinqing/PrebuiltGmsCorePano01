package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: zxe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class zxe extends adl implements View.OnClickListener {
    final TextView s;
    final TextView t;
    final zxg u;

    public zxe(zxg zxg, View view) {
        super(view);
        this.u = zxg;
        this.s = (TextView) view.findViewById(16908310);
        this.t = (TextView) view.findViewById(16908304);
        view.setFocusable(true);
        view.setOnClickListener(this);
        View findViewById = view.findViewById(R.id.icon_frame);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        View findViewById2 = view.findViewById(16908294);
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        View findViewById3 = view.findViewById(16908312);
        if (findViewById3 != null) {
            findViewById3.setVisibility(8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0080, code lost:
        if ((r5.flags & 129) != 0) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r8) {
        /*
            r7 = this;
            java.lang.String r8 = "com.google.android.apps.pixelmigrate"
            int r0 = r7.d()
            r1 = -1
            if (r0 == r1) goto L_0x012a
            r1 = 2
            if (r0 == r1) goto L_0x012a
            r1 = 4
            if (r0 != r1) goto L_0x0019
            zxg r2 = r7.u
            java.util.List r2 = r2.g
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x012a
        L_0x0019:
            if (r0 == 0) goto L_0x00df
            zxg r2 = r7.u
            java.util.List r2 = r2.g
            int r0 = r0 + -4
            java.lang.Object r0 = r2.get(r0)
            zyi r0 = (defpackage.zyi) r0
            boolean r2 = r0.a()
            if (r2 == 0) goto L_0x00d5
            boolean r2 = defpackage.azfh.c()
            if (r2 != 0) goto L_0x0035
            goto L_0x00d5
        L_0x0035:
            zxg r2 = r7.u
            com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity r2 = r2.a
            gsj r3 = r0.l
            byte[] r3 = r3.k()
            r2.f = r3
            zxg r2 = r7.u
            java.lang.String r3 = r2.e
            java.lang.String r2 = r2.f
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x00ba
            zxg r2 = r7.u
            com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity r3 = r2.a
            java.lang.String r2 = r2.e
            gsj r4 = r0.l
            boolean r4 = defpackage.zyi.a(r4)
            if (r4 == 0) goto L_0x00a5
            android.accounts.Account r4 = new android.accounts.Account
            java.lang.String r5 = "com.google"
            r4.<init>(r2, r5)
            gsj r0 = r0.l
            byte[] r0 = r0.k()
            if (r0 == 0) goto L_0x009d
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            android.content.pm.PackageManager r5 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0083 }
            r6 = 1048576(0x100000, float:1.469368E-39)
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo(r8, r6)     // Catch:{ NameNotFoundException -> 0x0083 }
            if (r5 != 0) goto L_0x007c
            goto L_0x0084
        L_0x007c:
            int r5 = r5.flags     // Catch:{ NameNotFoundException -> 0x0083 }
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L_0x0084
            goto L_0x0086
        L_0x0083:
            r8 = move-exception
        L_0x0084:
            java.lang.String r8 = "com.google.android.apps.restore"
        L_0x0086:
            java.lang.String r5 = "com.google.android.apps.pixelmigrate.cloudrestore.component.KeyRecoveryLockScreenEntryActivity"
            android.content.Intent r8 = r2.setClassName(r8, r5)
            java.lang.String r2 = "KeyRecoveryLockScreenEntryActivity.account"
            android.content.Intent r8 = r8.putExtra(r2, r4)
            java.lang.String r2 = "KeyRecoveryLockScreenEntryActivity.device"
            android.content.Intent r8 = r8.putExtra(r2, r0)
            r3.startActivityForResult(r8, r1)
            return
        L_0x009d:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required arguments cannot be null."
            r8.<init>(r0)
            throw r8
        L_0x00a5:
            r8 = 1
            r3.a((boolean) r8)
            gst r8 = defpackage.gso.a(r3)
            zrq r0 = defpackage.zrc.a(r3)
            zxg r1 = r3.b
            java.lang.String r1 = r1.e
            r3.a(r8, r0, r1)
            return
        L_0x00ba:
            zxg r8 = r7.u
            com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity r0 = r8.a
            java.lang.String r8 = r8.e
            zwj r1 = new zwj
            r1.<init>()
            r1.a = r8
            com.google.android.chimera.FragmentManager r8 = r0.getFragmentManager()
            java.lang.Class<zwj> r0 = defpackage.zwj.class
            java.lang.String r0 = r0.getSimpleName()
            r1.show((com.google.android.chimera.FragmentManager) r8, (java.lang.String) r0)
            return
        L_0x00d5:
            zxg r8 = r7.u
            com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity r1 = r8.a
            java.lang.String r8 = r8.e
            r1.a(r8, r0)
            return
        L_0x00df:
            zxg r8 = r7.u
            com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity r8 = r8.a
            zyg r8 = r8.a
            zxq r0 = r8.b
            java.lang.String r0 = r0.b
            r1 = 0
            if (r0 != 0) goto L_0x00f2
            com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity r8 = r8.a
            r8.a((android.accounts.Account) r1)
            return
        L_0x00f2:
            com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity r2 = r8.a
            android.accounts.Account[] r2 = defpackage.zrr.a(r2)
            int r3 = r2.length
            r4 = 0
        L_0x00fa:
            if (r4 >= r3) goto L_0x010b
            r5 = r2[r4]
            java.lang.String r6 = r5.name
            boolean r6 = android.text.TextUtils.equals(r0, r6)
            if (r6 != 0) goto L_0x0109
            int r4 = r4 + 1
            goto L_0x00fa
        L_0x0109:
            r1 = r5
            goto L_0x010c
        L_0x010b:
        L_0x010c:
            com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity r0 = r8.a
            r0.a((android.accounts.Account) r1)
            if (r1 == 0) goto L_0x012a
            java.lang.String r0 = r1.name
            zwl r2 = r8.d
            java.lang.String r2 = r2.e
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x012a
            zwl r0 = r8.d
            r0.b()
            zwl r8 = r8.d
            java.lang.String r0 = r1.name
            r8.e = r0
        L_0x012a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zxe.onClick(android.view.View):void");
    }
}
