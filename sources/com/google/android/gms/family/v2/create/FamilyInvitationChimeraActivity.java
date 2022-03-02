package com.google.android.gms.family.v2.create;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.family.v2.model.ContactPickerOptionsData;
import com.google.android.gms.family.v2.model.PageData;
import com.google.android.gms.family.v2.model.PageDataMap;
import com.google.android.gms.family.v2.model.ProfileData;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class FamilyInvitationChimeraActivity extends bjs implements mkt, mmb, mlp, icb {
    public mhi a;
    private String b;
    private mfr c;
    private icc d;
    private PageDataMap e;
    private ContactPickerOptionsData f;
    private mfp g;
    private boolean h = false;
    private int i = 0;
    private int j;

    private final void a(boolean z, ArrayList arrayList) {
        int i2;
        String str;
        i();
        String str2 = this.b;
        PageDataMap pageDataMap = this.e;
        if (!z) {
            i2 = 7;
        } else {
            i2 = 6;
        }
        FragmentTransaction replace = getSupportFragmentManager().beginTransaction().replace(R.id.fm_family_invitation_fragment_container, mlq.a(str2, pageDataMap.a(i2), arrayList));
        if (axga.b()) {
            str = "backStackTagSuccessFragment";
        } else {
            str = null;
        }
        replace.addToBackStack(str).commit();
    }

    private final void t() {
        DialogFragment dialogFragment = (DialogFragment) getSupportFragmentManager().findFragmentByTag("invite-preconditions");
        if (dialogFragment != null) {
            dialogFragment.dismissAllowingStateLoss();
        }
        getWindow().clearFlags(FragmentTransaction.TRANSIT_EXIT_MASK);
    }

    private final void u() {
        setResult(3, w());
        finish();
        if (getIntent().getBooleanExtra("fromCreate", false)) {
            overridePendingTransition(0, 0);
        }
    }

    private final Intent w() {
        Intent putExtra = new Intent().putExtra("accountName", this.b);
        putExtra.putExtra("familyChanged", this.h);
        if (this.c.a() != null && !this.c.a().isEmpty()) {
            putExtra.putExtra("consistencyToken", this.c.a()).putExtra("tokenExpirationTimeSecs", this.c.b());
        }
        return putExtra;
    }

    private final boolean x() {
        return getIntent().getBooleanExtra("isDirectAddInvitations", false);
    }

    public final void a(ContactPickerOptionsData contactPickerOptionsData) {
        this.f = contactPickerOptionsData;
    }

    public final void a(PageDataMap pageDataMap) {
        this.e = pageDataMap;
    }

    public final mhi b() {
        return this.a;
    }

    public final void e() {
        this.a.a(4, 8, "updaterequired");
        b(-3);
    }

    public final void f() {
        o();
    }

    public final void h() {
        findViewById(R.id.fm_family_invitation_loading_screen).setVisibility(0);
    }

    public final void i() {
        findViewById(R.id.fm_family_invitation_loading_screen).setVisibility(8);
    }

    public final mfr j() {
        return this.c;
    }

    public final mfp k() {
        return this.g;
    }

    public final boolean l() {
        return getIntent().getBooleanExtra("isOnboardInvitations", true);
    }

    public final void m() {
        t();
    }

    public final void n() {
        mfu.a((Activity) this).show();
        t();
    }

    public final void o() {
        setResult(1, w());
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        boolean z = true;
        if (i2 == 1) {
            if (intent.getStringExtra("consistencyToken") != null) {
                this.c.a(intent.getStringExtra("consistencyToken"), intent.getLongExtra("tokenExpirationTimeSecs", 0));
            }
            int intExtra = this.i + intent.getIntExtra("num-invitations-created", 0);
            this.i = intExtra;
            if (intExtra > 0) {
                this.h = true;
            }
            if (i3 != 0) {
                if (!this.e.b(6) && !this.e.b(7)) {
                    o();
                } else if (!axga.c() || !x()) {
                    if (intent.getIntExtra("num-invitations-sent", 0) == 0) {
                        z = false;
                    }
                    a(z, (ArrayList) null);
                } else {
                    ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("direct-add-contacts-list");
                    boolean z2 = !parcelableArrayListExtra.isEmpty();
                    if (axga.b()) {
                        this.h = z2;
                    }
                    a(z2, parcelableArrayListExtra);
                }
            } else if (axga.c() && x() && this.e.b(7)) {
                a(false, new ArrayList());
            } else if (this.e.b(5) || this.e.b(17)) {
                i();
            } else {
                u();
            }
        }
    }

    public final void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() == 0) {
            u();
        } else if (!axga.b() || !getSupportFragmentManager().getBackStackEntryAt(0).getName().equals("backStackTagSuccessFragment")) {
            super.onBackPressed();
        } else {
            o();
        }
    }

    /* JADX WARNING: type inference failed for: r1v20, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            super.onCreate(r14)
            r0 = 1
            r13.setRequestedOrientation(r0)
            mhi r1 = new mhi
            r1.<init>(r13)
            r13.a = r1
            java.lang.String r1 = defpackage.jhg.a((com.google.android.chimera.Activity) r13)
            hya r2 = defpackage.hya.a((android.content.Context) r13)
            boolean r2 = r2.b((java.lang.String) r1)
            r3 = 4
            if (r2 != 0) goto L_0x0029
            mhi r14 = r13.a
            r0 = 8
            r14.a((int) r3, (int) r0)
            r14 = -3
            r13.b(r14)
            return
        L_0x0029:
            android.content.Intent r2 = r13.getIntent()
            defpackage.mfx.a(r13, r2, r1)
            android.content.Intent r1 = r13.getIntent()
            java.lang.String r2 = "accountName"
            java.lang.String r1 = r1.getStringExtra(r2)
            r13.b = r1
            r4 = -2
            if (r1 != 0) goto L_0x004a
            mhi r14 = r13.a
            r0 = 13
            r14.a((int) r3, (int) r0)
            r13.b(r4)
            return
        L_0x004a:
            qub r1 = defpackage.qub.a((android.content.Context) r13)
            java.lang.String r5 = "com.google"
            android.accounts.Account[] r1 = r1.a((java.lang.String) r5)
            int r5 = r1.length
            r6 = 0
            r7 = 0
            r9 = r7
            r8 = 0
        L_0x0059:
            if (r8 >= r5) goto L_0x006c
            r10 = r1[r8]
            java.lang.String r11 = r10.name
            java.lang.String r12 = r13.b
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r9 = r10
        L_0x0069:
            int r8 = r8 + 1
            goto L_0x0059
        L_0x006c:
            if (r9 == 0) goto L_0x0189
            mfp r1 = new mfp
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r4 = "appId"
            java.lang.String r3 = r3.getStringExtra(r4)
            com.google.android.chimera.config.ModuleManager r4 = com.google.android.chimera.config.ModuleManager.get(r13)
            com.google.android.chimera.config.ModuleManager$ModuleInfo r4 = r4.getCurrentModule()
            int r4 = r4.moduleVersion
            java.lang.String r4 = java.lang.Integer.toString(r4)
            r1.<init>(r3, r4)
            r13.g = r1
            mhi r3 = r13.a
            java.lang.String r4 = r13.b
            java.lang.String r5 = r1.b
            java.lang.String r1 = r1.a
            r3.a((java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r1)
            android.content.Intent r1 = r13.getIntent()
            java.lang.String r3 = "inviteeRole"
            r4 = 3
            int r1 = r1.getIntExtra(r3, r4)
            r13.j = r1
            mfr r1 = new mfr
            r1.<init>()
            r13.c = r1
            r10 = 0
            java.lang.String r1 = "tokenExpirationTimeSecs"
            java.lang.String r5 = "consistencyToken"
            if (r14 == 0) goto L_0x00c9
            java.lang.String r8 = r14.getString(r5)
            if (r8 != 0) goto L_0x00bb
            goto L_0x00c9
        L_0x00bb:
            mfr r8 = r13.c
            java.lang.String r5 = r14.getString(r5)
            long r10 = r14.getLong(r1, r10)
            r8.a(r5, r10)
            goto L_0x00e8
        L_0x00c9:
            android.content.Intent r8 = r13.getIntent()
            java.lang.String r8 = r8.getStringExtra(r5)
            if (r8 == 0) goto L_0x00e8
            mfr r8 = r13.c
            android.content.Intent r12 = r13.getIntent()
            java.lang.String r5 = r12.getStringExtra(r5)
            android.content.Intent r12 = r13.getIntent()
            long r10 = r12.getLongExtra(r1, r10)
            r8.a(r5, r10)
        L_0x00e8:
            if (r14 == 0) goto L_0x00f4
            java.lang.String r1 = "pageDataMap"
            android.os.Parcelable r1 = r14.getParcelable(r1)
            r7 = r1
            com.google.android.gms.family.v2.model.PageDataMap r7 = (com.google.android.gms.family.v2.model.PageDataMap) r7
            goto L_0x00f5
        L_0x00f4:
        L_0x00f5:
            r13.e = r7
            java.lang.String r1 = "familyChanged"
            if (r14 != 0) goto L_0x0106
            android.content.Intent r14 = r13.getIntent()
            boolean r14 = r14.getBooleanExtra(r1, r6)
            r13.h = r14
            goto L_0x010d
        L_0x0106:
            boolean r14 = r14.getBoolean(r1)
            r13.h = r14
        L_0x010d:
            icc r14 = r13.d
            if (r14 != 0) goto L_0x0147
            wlr r14 = defpackage.wls.a()
            r1 = 80
            r14.a = r1
            wls r14 = r14.a()
            ibz r1 = new ibz
            r1.<init>(r13)
            r1.a = r9
            ibq r5 = defpackage.wlt.a
            r1.a((defpackage.ibq) r5, (defpackage.ibj) r14)
            ibq r14 = defpackage.adws.a
            adwq r5 = new adwq
            r5.<init>()
            boolean r6 = defpackage.axgd.c()
            r0 = r0 ^ r6
            r5.a = r0
            adwr r0 = r5.a()
            r1.a((defpackage.ibq) r14, (defpackage.ibj) r0)
            r1.a((com.google.android.chimera.Activity) r13, (defpackage.icb) r13)
            icc r14 = r1.b()
            r13.d = r14
        L_0x0147:
            r14 = 2131624314(0x7f0e017a, float:1.8875804E38)
            r13.setContentView((int) r14)
            r13.i()
            com.google.android.chimera.FragmentManager r14 = r13.getSupportFragmentManager()
            r0 = 2131428225(0x7f0b0381, float:1.8478088E38)
            com.google.android.chimera.Fragment r1 = r14.findFragmentById(r0)
            if (r1 != 0) goto L_0x0188
            com.google.android.chimera.FragmentTransaction r14 = r14.beginTransaction()
            java.lang.String r1 = r13.b
            int r5 = r13.j
            boolean r6 = r13.x()
            mkx r7 = new mkx
            r7.<init>()
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>(r4)
            r8.putString(r2, r1)
            r8.putInt(r3, r5)
            java.lang.String r1 = "isDirectAddInvitations"
            r8.putBoolean(r1, r6)
            r7.setArguments(r8)
            com.google.android.chimera.FragmentTransaction r14 = r14.add((int) r0, (com.google.android.chimera.Fragment) r7)
            r14.commit()
        L_0x0188:
            return
        L_0x0189:
            mhi r14 = r13.a
            r0 = 14
            r14.a((int) r3, (int) r0)
            java.lang.String r14 = r13.b
            java.lang.String r0 = java.lang.String.valueOf(r14)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 42
            r1.<init>(r0)
            java.lang.String r0 = "Selected account: "
            r1.append(r0)
            r1.append(r14)
            java.lang.String r14 = " doesn't exist on device"
            r1.append(r14)
            r1.toString()
            r13.b(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.family.v2.create.FamilyInvitationChimeraActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("pageDataMap", this.e);
        if (this.c.a() != null && !this.c.a().isEmpty()) {
            bundle.putString("consistencyToken", this.c.a());
            bundle.putLong("tokenExpirationTimeSecs", this.c.b());
        }
        bundle.putBoolean("familyChanged", this.h);
    }

    public final ProfileData p() {
        return (ProfileData) getIntent().getParcelableExtra("profileData");
    }

    public final int q() {
        return this.i;
    }

    public final void r() {
        u();
    }

    public final void s() {
        PageDataMap pageDataMap = this.e;
        if (pageDataMap == null || pageDataMap.b(7)) {
            a(false, (ArrayList) null);
        } else {
            u();
        }
    }

    public final icc v() {
        return this.d;
    }

    public final void b(int i2) {
        ith ith = mfv.a;
        setResult(4, new Intent().putExtra("accountName", this.b).putExtra("errorCode", i2));
        finish();
    }

    public final void a(int i2) {
        if (i2 <= 0) {
            sr a2 = mfu.a((Context) this);
            a2.a((int) R.string.fm_family_is_full);
            a2.b((int) R.string.fm_cant_invite_more_members);
            a2.b((int) R.string.common_continue, (DialogInterface.OnClickListener) new mjm(this));
            a2.c();
            return;
        }
        getWindow().addFlags(FragmentTransaction.TRANSIT_EXIT_MASK);
        mmc.a(this.b, i2, this.j).show(getSupportFragmentManager(), "invite-preconditions");
    }

    public final void a(int i2, int i3) {
        Intent putExtra = new Intent().setClassName(this, "com.google.android.gms.family.invites.SendInvitationsActivity").putExtra("accountName", this.b).putExtra("consistencyToken", this.c.a()).putExtra("tokenExpirationTimeSecs", this.c.b()).putExtra("max-available-slots", i2).putExtra("appId", this.g.a).putExtra("customTheme", getIntent().getIntExtra("customTheme", 0)).putExtra("predefinedTheme", jlh.a(getIntent().getStringExtra("predefinedTheme"))).putExtra("clientCallingPackage", jhg.a((Activity) this)).putExtra("isOnboardInvitations", l()).putExtra("inviteeRole", this.j).putExtra("invitesSendingPagedata", this.e.b(23) ? this.e.a(23) : new PageData(apkp.e)).putExtra("invitesRetryPagedata", this.e.b(24) ? this.e.a(24) : new PageData(apkp.e)).putExtra("invitesRetryLaterPagedata", this.e.b(25) ? this.e.a(25) : new PageData(apkp.e));
        if (axga.c()) {
            putExtra.putExtra("isDirectAddInvitations", x());
        }
        putExtra.putExtra("contactPickerOptions", this.f);
        startActivityForResult(putExtra, 1);
        t();
    }

    public final void a(ConnectionResult connectionResult) {
        mfu.a(this, new mjl(this)).show();
    }
}
