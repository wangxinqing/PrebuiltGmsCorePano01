package com.google.android.gms.family.v2.manage;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.family.model.DashboardDataModel;
import com.google.android.gms.family.model.InvitationDataModel;
import com.google.android.gms.family.model.MemberDataModel;
import com.google.android.gms.family.v2.model.ContactPickerOptionsData;
import com.google.android.gms.family.v2.model.PageData;
import com.google.android.gms.family.v2.model.PageDataMap;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class FamilyManagementChimeraActivity extends bjs implements mnz, mok, mon, mnj, mpb, mmb, mmz, mou, mfz, icb {
    public String a;
    public mfr b;
    public mhi c;
    public ProgressDialog d = null;
    public mfp e;
    private icc f;
    private boolean g;
    private boolean h = false;
    private DashboardDataModel i;
    private PageDataMap j;
    private boolean k = false;
    private ContactPickerOptionsData l;

    private final void b(Intent intent) {
        if (intent.getStringExtra("consistencyToken") != null) {
            this.b.a(intent.getStringExtra("consistencyToken"), intent.getLongExtra("tokenExpirationTimeSecs", 0));
        }
    }

    private final void c(Intent intent) {
        b(intent);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentById(R.id.fm_family_management_fragment_container) instanceof moo) {
            supportFragmentManager.popBackStackImmediate();
        }
        g();
        s();
    }

    private final void d(Intent intent) {
        if (this.b.a() != null && !this.b.a().isEmpty()) {
            intent.putExtra("consistencyToken", this.b.a()).putExtra("tokenExpirationTimeSecs", this.b.b());
        }
    }

    private final void r() {
        g();
        setResult(9, q());
        finish();
    }

    private final void s() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentById(R.id.fm_family_management_fragment_container) instanceof mob) {
            ((mob) supportFragmentManager.findFragmentById(R.id.fm_family_management_fragment_container)).a();
        }
    }

    private final void t() {
        DialogFragment dialogFragment = (DialogFragment) getSupportFragmentManager().findFragmentByTag("InvitationsPreconditions");
        if (dialogFragment != null) {
            dialogFragment.dismissAllowingStateLoss();
        }
        getWindow().clearFlags(FragmentTransaction.TRANSIT_EXIT_MASK);
    }

    private final void u() {
        ProgressDialog progressDialog = new ProgressDialog(this, mfx.b(getIntent()));
        this.d = progressDialog;
        progressDialog.setIndeterminate(true);
        this.d.setCancelable(false);
        this.d.setMessage(getResources().getString(R.string.fm_delete_family_progress));
        this.d.show();
    }

    private final boolean v() {
        return getIntent().getBooleanExtra("isDirectAddInvitations", false);
    }

    public final void a() {
        super.onBackPressed();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentById(R.id.fm_family_management_fragment_container) instanceof mow) {
            this.c.a(31);
            ((mow) supportFragmentManager.findFragmentById(R.id.fm_family_management_fragment_container)).e();
        }
        if (supportFragmentManager.findFragmentById(R.id.fm_family_management_fragment_container) instanceof mob) {
            this.c.a(27);
        }
    }

    public final void a(DashboardDataModel dashboardDataModel) {
        this.i = dashboardDataModel;
    }

    public final void a(ContactPickerOptionsData contactPickerOptionsData) {
        this.l = contactPickerOptionsData;
    }

    public final void a(PageDataMap pageDataMap) {
        this.j = pageDataMap;
    }

    public final int aR() {
        return 5;
    }

    public final int aS() {
        return 1;
    }

    public final void aT() {
        this.h = true;
        u();
        getSupportLoaderManager().initLoader(0, (Bundle) null, new moi(this));
    }

    public final mhi b() {
        return this.c;
    }

    public final void e() {
        Intent intent = (Intent) getIntent().getParcelableExtra("createAccountIntent");
        if (intent == null) {
            p();
            return;
        }
        intent.putExtra("consistencyToken", this.b.a());
        intent.putExtra("tokenExpirationTimeSecs", this.b.b());
        startActivityForResult(intent, 5);
    }

    public final void f() {
        this.c.a(11);
        String str = this.a;
        mnn mnn = new mnn();
        Bundle bundle = new Bundle(1);
        bundle.putString("accountName", str);
        mnn.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(R.id.fm_family_management_fragment_container, mnn).addToBackStack("Confirm delete family").commit();
    }

    public final void g() {
        this.g = true;
    }

    public final Activity getActivity() {
        return this;
    }

    public final void h() {
        g();
        this.k = true;
    }

    public final void i() {
        this.c.a(2, 8, "updaterequired");
        a(4);
    }

    public final mfr j() {
        return this.b;
    }

    public final mfp k() {
        return this.e;
    }

    public final boolean l() {
        return false;
    }

    public final void m() {
        t();
    }

    public final void n() {
        p();
        t();
    }

    public final void o() {
        if (!this.j.b(31) || !this.j.a(31).a.containsKey(33)) {
            ith ith = mfv.a;
            return;
        }
        this.c.a(36);
        startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse((String) this.j.a(31).a.get(33))), 7);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        switch (i2) {
            case 1:
                g();
                b(intent);
                if (intent.getIntExtra("num-invitations-sent", 0) > 0 || (axga.c() && v() && intent.getParcelableArrayListExtra("direct-add-contacts-list") != null && !intent.getParcelableArrayListExtra("direct-add-contacts-list").isEmpty())) {
                    if (!this.j.b(38) || !this.j.a(38).a.containsKey(34)) {
                        akax.a(findViewById(R.id.fm_family_management_fragment_container), (int) R.string.fm_invitations_sent, 0).c();
                    } else {
                        akax.a(findViewById(R.id.fm_family_management_fragment_container), (CharSequence) (String) this.j.a(38).a.get(34), 0).c();
                    }
                    s();
                    return;
                }
                return;
            case 2:
                if (i3 == 6) {
                    c(intent);
                    return;
                }
                return;
            case 3:
                if (i3 == 9) {
                    r();
                    return;
                }
                return;
            case 4:
                if (i3 == 6) {
                    c(intent);
                    return;
                } else if (i3 == 9) {
                    r();
                    return;
                } else {
                    return;
                }
            case 5:
                if (i3 == 11) {
                    g();
                    b(intent);
                    s();
                    return;
                }
                return;
            case 6:
                if (i3 == 12) {
                    g();
                    b(intent);
                    s();
                    return;
                }
                return;
            case 7:
            case 8:
            case 9:
                s();
                return;
            default:
                return;
        }
    }

    public final void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() == 0) {
            setResult(3, q());
            finish();
        } else if (!(getSupportFragmentManager().findFragmentById(R.id.fm_family_management_fragment_container) instanceof mna)) {
            super.onBackPressed();
            if (this.k) {
                g();
                s();
                this.k = false;
            }
        } else {
            a();
        }
    }

    /* JADX WARNING: type inference failed for: r12v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            super.onCreate(r12)
            mhi r0 = new mhi
            r0.<init>(r11)
            r11.c = r0
            java.lang.String r0 = defpackage.jhg.a((com.google.android.chimera.Activity) r11)
            hya r1 = defpackage.hya.a((android.content.Context) r11)
            boolean r1 = r1.b((java.lang.String) r0)
            r2 = 2
            if (r1 != 0) goto L_0x0025
            mhi r12 = r11.c
            r0 = 8
            r12.a((int) r2, (int) r0)
            r12 = -3
            r11.a((int) r12)
            return
        L_0x0025:
            android.content.Intent r1 = r11.getIntent()
            defpackage.mfx.a(r11, r1, r0)
            android.content.Intent r0 = r11.getIntent()
            java.lang.String r1 = "accountName"
            java.lang.String r0 = r0.getStringExtra(r1)
            r11.a = r0
            if (r0 != 0) goto L_0x0046
            mhi r12 = r11.c
            r0 = 13
            r12.a((int) r2, (int) r0)
            r12 = -2
            r11.a((int) r12)
            return
        L_0x0046:
            mfp r0 = new mfp
            android.content.Intent r3 = r11.getIntent()
            java.lang.String r4 = "appId"
            java.lang.String r3 = r3.getStringExtra(r4)
            com.google.android.chimera.config.ModuleManager r4 = com.google.android.chimera.config.ModuleManager.get(r11)
            com.google.android.chimera.config.ModuleManager$ModuleInfo r4 = r4.getCurrentModule()
            int r4 = r4.moduleVersion
            java.lang.String r4 = java.lang.Integer.toString(r4)
            r0.<init>(r3, r4)
            r11.e = r0
            mhi r3 = r11.c
            java.lang.String r4 = r11.a
            java.lang.String r5 = r0.b
            java.lang.String r0 = r0.a
            r3.a((java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r0)
            mhi r0 = r11.c
            r0.a((int) r2)
            r11.getSupportLoaderManager()
            mfr r0 = new mfr
            r0.<init>()
            r11.b = r0
            android.content.Intent r0 = r11.getIntent()
            r11.b((android.content.Intent) r0)
            android.content.Intent r0 = r11.getIntent()
            java.lang.String r2 = "familyChanged"
            r3 = 0
            boolean r0 = r0.getBooleanExtra(r2, r3)
            r4 = 1
            if (r0 == 0) goto L_0x0096
            r0 = 1
            goto L_0x00a2
        L_0x0096:
            if (r12 == 0) goto L_0x00a1
            boolean r0 = r12.getBoolean(r2, r3)
            if (r0 != 0) goto L_0x009f
            goto L_0x00a1
        L_0x009f:
            r0 = 1
            goto L_0x00a2
        L_0x00a1:
            r0 = 0
        L_0x00a2:
            r11.g = r0
            r0 = 2131624315(0x7f0e017b, float:1.8875806E38)
            r11.setContentView((int) r0)
            if (r12 == 0) goto L_0x00b6
            java.lang.String r0 = "FamilyRolesChanged"
            boolean r0 = r12.getBoolean(r0, r3)
            if (r0 == 0) goto L_0x00b6
            r0 = 1
            goto L_0x00b7
        L_0x00b6:
            r0 = 0
        L_0x00b7:
            r11.k = r0
            icc r0 = r11.f
            if (r0 != 0) goto L_0x00e5
            ibz r0 = new ibz
            r0.<init>(r11)
            java.lang.String r2 = r11.a
            r0.a((java.lang.String) r2)
            ibq r2 = defpackage.adws.a
            adwq r5 = new adwq
            r5.<init>()
            boolean r6 = defpackage.axgd.c()
            r6 = r6 ^ r4
            r5.a = r6
            adwr r5 = r5.a()
            r0.a((defpackage.ibq) r2, (defpackage.ibj) r5)
            r0.a((com.google.android.chimera.Activity) r11, (defpackage.icb) r11)
            icc r0 = r0.b()
            r11.f = r0
        L_0x00e5:
            android.content.Intent r0 = r11.getIntent()
            java.lang.String r2 = "manageMemberIntent"
            android.os.Parcelable r0 = r0.getParcelableExtra(r2)
            if (r0 == 0) goto L_0x00f3
            r0 = 1
            goto L_0x00f4
        L_0x00f3:
            r0 = 0
        L_0x00f4:
            android.content.Intent r2 = r11.getIntent()
            java.lang.String r5 = "manageSupervisedMemberIntent"
            android.os.Parcelable r2 = r2.getParcelableExtra(r5)
            if (r2 == 0) goto L_0x0102
            r2 = 1
            goto L_0x0103
        L_0x0102:
            r2 = 0
        L_0x0103:
            android.content.Intent r5 = r11.getIntent()
            java.lang.String r6 = "manageKIntent"
            android.os.Parcelable r5 = r5.getParcelableExtra(r6)
            if (r5 == 0) goto L_0x0111
            r5 = 1
            goto L_0x0112
        L_0x0111:
            r5 = 0
        L_0x0112:
            com.google.android.chimera.FragmentManager r6 = r11.getSupportFragmentManager()
            java.lang.String r7 = r11.a
            boolean r8 = defpackage.axga.c()
            if (r8 == 0) goto L_0x0125
            boolean r8 = r11.v()
            if (r8 == 0) goto L_0x0125
            goto L_0x0126
        L_0x0125:
            r4 = 0
        L_0x0126:
            mob r8 = new mob
            r8.<init>()
            android.os.Bundle r9 = new android.os.Bundle
            r10 = 5
            r9.<init>(r10)
            r9.putString(r1, r7)
            java.lang.String r1 = "hasMemberIntent"
            r9.putBoolean(r1, r0)
            java.lang.String r0 = "hasSupervisedMemberIntent"
            r9.putBoolean(r0, r2)
            java.lang.String r0 = "hasKidIntent"
            r9.putBoolean(r0, r5)
            java.lang.String r0 = "directAdd"
            r9.putBoolean(r0, r4)
            r8.setArguments(r9)
            r0 = 2131428227(0x7f0b0383, float:1.8478093E38)
            com.google.android.chimera.Fragment r1 = r6.findFragmentById(r0)
            if (r1 != 0) goto L_0x015f
            com.google.android.chimera.FragmentTransaction r1 = r6.beginTransaction()
            com.google.android.chimera.FragmentTransaction r0 = r1.add((int) r0, (com.google.android.chimera.Fragment) r8)
            r0.commit()
        L_0x015f:
            r0 = 0
            if (r12 == 0) goto L_0x0179
            java.lang.String r1 = "DeleteFamilyInProgress"
            boolean r1 = r12.getBoolean(r1, r3)
            if (r1 == 0) goto L_0x0179
            r11.u()
            com.google.android.chimera.LoaderManager r1 = r11.getSupportLoaderManager()
            moi r2 = new moi
            r2.<init>(r11)
            r1.initLoader(r3, r0, r2)
        L_0x0179:
            if (r12 == 0) goto L_0x0184
            java.lang.String r1 = "DashboardDataModel"
            android.os.Parcelable r1 = r12.getParcelable(r1)
            com.google.android.gms.family.model.DashboardDataModel r1 = (com.google.android.gms.family.model.DashboardDataModel) r1
            goto L_0x0185
        L_0x0184:
            r1 = r0
        L_0x0185:
            r11.i = r1
            if (r12 == 0) goto L_0x0193
            java.lang.String r0 = "pageDataMap"
            android.os.Parcelable r12 = r12.getParcelable(r0)
            r0 = r12
            com.google.android.gms.family.v2.model.PageDataMap r0 = (com.google.android.gms.family.v2.model.PageDataMap) r0
            goto L_0x0194
        L_0x0193:
        L_0x0194:
            r11.j = r0
            int r12 = android.os.Build.VERSION.SDK_INT
            r12 = 14
            r11.setRequestedOrientation(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.family.v2.manage.FamilyManagementChimeraActivity.onCreate(android.os.Bundle):void");
    }

    public final void onDestroy() {
        mhi mhi = this.c;
        if (mhi != null) {
            mhi.a(3);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("familyChanged", this.g);
        bundle.putBoolean("DeleteFamilyInProgress", this.h);
        bundle.putBoolean("FamilyRolesChanged", this.k);
        ProgressDialog progressDialog = this.d;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        bundle.putParcelable("DashboardDataModel", this.i);
        bundle.putParcelable("pageDataMap", this.j);
    }

    public final void p() {
        mfu.a((Activity) this).show();
    }

    public final Intent q() {
        Intent putExtra = new Intent().putExtra("accountName", this.a).putExtra("familyChanged", this.g);
        d(putExtra);
        return putExtra;
    }

    /* access modifiers changed from: package-private */
    public final Intent b(MemberDataModel memberDataModel, String str, boolean z) {
        return new Intent().setClassName(this, "com.google.android.gms.family.v2.manage.DeleteMemberActivity").putExtra("accountName", this.a).putExtra("memberId", memberDataModel.a).putExtra("memberGivenName", memberDataModel.d).putExtra("hohGivenName", str).putExtra("leaveFamily", z).putExtra("appId", this.e.a).putExtra("customTheme", getIntent().getIntExtra("customTheme", 0)).putExtra("predefinedTheme", jlh.a(getIntent().getStringExtra("predefinedTheme"))).putExtra("clientCallingPackage", jhg.a((Activity) this));
    }

    private final void c(MemberDataModel memberDataModel, String str, boolean z) {
        PageData a2 = this.j.a(31);
        moo moo = new moo();
        Bundle bundle = new Bundle(4);
        bundle.putParcelable("member_data", memberDataModel);
        bundle.putString("hoh_given_name", str);
        bundle.putParcelable("manage_member_pd", a2);
        bundle.putBoolean("can_be_removed", z);
        moo.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(R.id.fm_family_management_fragment_container, moo).addToBackStack((String) null).commit();
    }

    public final void d() {
        mpc.a(this.a, getString(R.string.fm_reauth_password_title_delete_family), getString(R.string.fm_reauth_pin_title_delete_family)).show(getSupportFragmentManager(), (String) null);
    }

    public final void a(int i2) {
        ith ith = mfv.a;
        setResult(4, new Intent().putExtra("accountName", this.a).putExtra("errorCode", i2));
        finish();
    }

    public final void a(int i2, int i3) {
        Intent putExtra = new Intent().setClassName(this, "com.google.android.gms.family.invites.SendInvitationsActivity").putExtra("accountName", this.a).putExtra("consistencyToken", this.b.a()).putExtra("tokenExpirationTimeSecs", this.b.b()).putExtra("max-available-slots", i2).putExtra("appId", this.e.a).putExtra("isDirectAddInvitations", v()).putExtra("customTheme", getIntent().getIntExtra("customTheme", 0)).putExtra("predefinedTheme", jlh.a(getIntent().getStringExtra("predefinedTheme"))).putExtra("clientCallingPackage", jhg.a((Activity) this)).putExtra("inviteeRole", i3).putExtra("invitesSendingPagedata", this.j.b(23) ? this.j.a(23) : new PageData(apkp.e)).putExtra("invitesRetryPagedata", this.j.b(24) ? this.j.a(24) : new PageData(apkp.e)).putExtra("invitesRetryLaterPagedata", this.j.b(25) ? this.j.a(25) : new PageData(apkp.e));
        DashboardDataModel dashboardDataModel = this.i;
        if (dashboardDataModel != null && dashboardDataModel.f) {
            putExtra.putExtra("disable-sms-invites", true);
        }
        ContactPickerOptionsData contactPickerOptionsData = this.l;
        if (contactPickerOptionsData == null) {
            mfu.a(this, new mod(this)).show();
            t();
            return;
        }
        putExtra.putExtra("contactPickerOptions", contactPickerOptionsData);
        startActivityForResult(putExtra, 1);
        t();
    }

    public final void c() {
        this.c.a(13);
        onBackPressed();
    }

    public final void b(int i2, int i3) {
        if (!axgm.b()) {
            getWindow().addFlags(FragmentTransaction.TRANSIT_EXIT_MASK);
        }
        mmc.a(this.a, i2, i3).show(getSupportFragmentManager(), "InvitationsPreconditions");
    }

    public final void b(InvitationDataModel invitationDataModel) {
        mfv.c("FamilyManagementChimeraActivity", "show dashboard and delete invitation", new Object[0]);
        onBackPressed();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentById(R.id.fm_family_management_fragment_container) instanceof mob) {
            mob mob = (mob) supportFragmentManager.findFragmentById(R.id.fm_family_management_fragment_container);
            mob.a(mob.getResources().getString(R.string.fm_cancelling_invitation_message));
            mob.getActivity().getSupportLoaderManager().initLoader(3, (Bundle) null, new mnr(mob, invitationDataModel));
        }
    }

    public final void b(MemberDataModel memberDataModel) {
        if (((Intent) getIntent().getParcelableExtra("manageKIntent")) == null || memberDataModel.g != 4) {
            this.c.a(37);
            Intent className = new Intent().setClassName(this, "com.google.android.gms.family.webview.FamilyWebViewActivity");
            String valueOf = String.valueOf(memberDataModel.a);
            startActivityForResult(className.putExtra("webviewUrl", valueOf.length() == 0 ? new String("https://families.google.com/familylink/kids/") : "https://families.google.com/familylink/kids/".concat(valueOf)).putExtra("accountName", this.a), 9);
            return;
        }
        a(memberDataModel);
    }

    public final void b(PageData pageData) {
        mfu.a(this, pageData, this.a, new mog(this), (DialogInterface.OnClickListener) null, false).show();
    }

    public final void a(ConnectionResult connectionResult) {
        mfu.a(this, new moc(this)).show();
    }

    public final void a(InvitationDataModel invitationDataModel) {
        mol mol = new mol();
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("invitation", invitationDataModel);
        mol.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(R.id.fm_family_management_fragment_container, mol).addToBackStack("Manage Invitations").commit();
    }

    public final void a(MemberDataModel memberDataModel) {
        Intent intent = (Intent) getIntent().getParcelableExtra("manageKIntent");
        if (intent != null) {
            intent.putExtra("memberId", memberDataModel.a);
            d(intent);
            startActivityForResult(intent, 6);
        }
    }

    public final void a(MemberDataModel memberDataModel, String str, boolean z) {
        Intent b2 = b(memberDataModel, str, z);
        if (z) {
            this.c.a(16);
            startActivityForResult(b2, 3);
            return;
        }
        this.c.a(7);
        startActivityForResult(b2, 2);
    }

    public final void a(MemberDataModel memberDataModel, String str, boolean z, boolean z2) {
        this.c.a(5);
        if (axfo.c()) {
            Intent intent = (Intent) getIntent().getParcelableExtra("manageSupervisedMemberIntent");
            if (intent == null || !memberDataModel.a()) {
                Intent intent2 = (Intent) getIntent().getParcelableExtra("manageMemberIntent");
                if (intent2 != null) {
                    if (axfo.b() && !z2) {
                        intent2.removeExtra("removeMemberIntent");
                    } else {
                        intent2.putExtra("removeMemberIntent", b(memberDataModel, str, z));
                    }
                    intent2.putExtra("memberId", memberDataModel.a);
                    d(intent2);
                    startActivityForResult(intent2, 4);
                    return;
                }
                c(memberDataModel, str, z2);
                return;
            }
            this.c.a(5);
            intent.putExtra("memberId", memberDataModel.a);
            d(intent);
            startActivityForResult(intent, 8);
            return;
        }
        Intent intent3 = (Intent) getIntent().getParcelableExtra("manageMemberIntent");
        if (intent3 != null) {
            if (!axfo.b() || z2) {
                intent3.putExtra("removeMemberIntent", b(memberDataModel, str, z));
            }
            intent3.putExtra("memberId", memberDataModel.a);
            d(intent3);
            startActivityForResult(intent3, 4);
            return;
        }
        c(memberDataModel, str, z2);
    }

    public final void a(PageData pageData) {
        if (pageData == null) {
            sr a2 = mfu.a((Context) this);
            a2.b((int) R.string.fm_not_in_family_error);
            a2.b((int) R.string.close_button_label, (DialogInterface.OnClickListener) new moe(this));
            a2.b().show();
            return;
        }
        mfu.a(this, pageData, this.a, new mof(this), (DialogInterface.OnClickListener) null, false).show();
    }

    public final void a(PageData pageData, String str, int i2) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentById(R.id.fm_family_management_fragment_container) instanceof mow) {
            this.c.a(29);
        }
        if (supportFragmentManager.findFragmentById(R.id.fm_family_management_fragment_container) instanceof mob) {
            this.c.a(25);
        }
        String str2 = this.a;
        mna mna = new mna();
        Bundle bundle = new Bundle(4);
        bundle.putString("accountName", str2);
        bundle.putParcelable("pageData", pageData);
        bundle.putInt("desiredRole", i2);
        bundle.putString("memberId", str);
        mna.setArguments(bundle);
        supportFragmentManager.beginTransaction().replace(R.id.fm_family_management_fragment_container, mna).addToBackStack("ChangeRoleConfirmation").commitAllowingStateLoss();
    }

    public final void a(String str, int i2) {
        super.onBackPressed();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        apix a2 = apix.a(i2);
        if (a2 == null) {
            a2 = apix.UNKNOWN_FAMILY_ROLE;
        }
        if (supportFragmentManager.findFragmentById(R.id.fm_family_management_fragment_container) instanceof mow) {
            this.c.a(30);
            mow mow = (mow) supportFragmentManager.findFragmentById(R.id.fm_family_management_fragment_container);
            mow.b();
            mow.getActivity().getSupportLoaderManager().restartLoader(7, (Bundle) null, new mov(mow, str, a2));
        }
        if (supportFragmentManager.findFragmentById(R.id.fm_family_management_fragment_container) instanceof mob) {
            this.c.a(26);
            mob mob = (mob) supportFragmentManager.findFragmentById(R.id.fm_family_management_fragment_container);
            mob.f();
            mob.getActivity().getSupportLoaderManager().restartLoader(7, (Bundle) null, new moa(mob, str, a2));
        }
    }

    public final void a(ArrayList arrayList, PageData pageData) {
        String str = this.a;
        PageData a2 = this.j.a(33);
        Bundle bundle = new Bundle(4);
        bundle.putString("accountName", str);
        bundle.putParcelableArrayList("MEMBERS", arrayList);
        bundle.putParcelable("mppd", pageData);
        bundle.putParcelable("mpnepd", a2);
        mow mow = new mow();
        mow.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(R.id.fm_family_management_fragment_container, mow).addToBackStack("ManageParents").commit();
    }
}
