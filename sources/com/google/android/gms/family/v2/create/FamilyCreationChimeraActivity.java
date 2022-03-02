package com.google.android.gms.family.v2.create;

import android.accounts.Account;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseIntArray;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.family.v2.model.BillingSignupData;
import com.google.android.gms.family.v2.model.BirthdayData;
import com.google.android.gms.family.v2.model.CanCreateFamilyData;
import com.google.android.gms.family.v2.model.PageData;
import com.google.android.gms.family.v2.model.PageDataMap;
import com.google.android.gms.family.v2.model.ProfileData;
import com.google.android.gms.family.v2.model.SetupParams;
import com.google.android.gms.family.v2.model.UpgradeParams;
import com.google.android.gms.wallet.firstparty.ExecuteBuyFlowRequest;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import java.util.ArrayList;
import java.util.Calendar;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class FamilyCreationChimeraActivity extends bjs implements mhr, mle, mlm, mqk, mjw, mhy, mke, mjt, mqn, mfz, icb, mlp {
    public String a;
    public mfr b;
    public byte[] c;
    public String d;
    public apix e = apix.UNKNOWN_FAMILY_ROLE;
    public apix f = apix.UNKNOWN_FAMILY_ROLE;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public PageDataMap l;
    public UpgradeParams m;
    public SetupParams n;
    public ProfileData o;
    public CanCreateFamilyData p;
    public Calendar q;
    public mhi r;
    public mfp s;
    public int t = 1;
    private SparseIntArray u;
    private boolean v;
    private boolean w;
    /* access modifiers changed from: private */
    public boolean x;
    private boolean y;
    private icc z;

    private final void A() {
        C();
        getSupportLoaderManager().restartLoader(3, (Bundle) null, new mjk(this));
    }

    private final void B() {
        C();
        getSupportLoaderManager().restartLoader(0, (Bundle) null, new mip(this));
    }

    private final void C() {
        findViewById(R.id.fm_family_creation_loading_screen).setVisibility(0);
    }

    private final boolean D() {
        return getIntent().getBooleanExtra("isDirectAddInvitations", false);
    }

    private final Intent E() {
        Intent putExtra = new Intent().putExtra("accountName", this.a);
        putExtra.putExtra("familyChanged", this.x);
        if (this.b.a() != null && !this.b.a().isEmpty()) {
            putExtra.putExtra("consistencyToken", this.b.a()).putExtra("tokenExpirationTimeSecs", this.b.b());
        }
        return putExtra;
    }

    private final FragmentTransaction F() {
        if (this.l.b(4)) {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            String str = this.a;
            PageData a2 = this.l.a(4);
            mjx mjx = new mjx();
            Bundle bundle = new Bundle(2);
            bundle.putString("accountName", str);
            bundle.putParcelable("pageData", a2);
            mjx.setArguments(bundle);
            return beginTransaction.replace(R.id.fm_family_creation_fragment_container, mjx).addToBackStack((String) null);
        } else if (this.l.b(22)) {
            return getSupportFragmentManager().beginTransaction().replace(R.id.fm_family_creation_fragment_container, mju.a(this.a, this.l.a(22), this.l.a(18), this.l.a(19))).addToBackStack((String) null);
        } else {
            if (this.l.b(16)) {
                return getSupportFragmentManager().beginTransaction().replace(R.id.fm_family_creation_fragment_container, mkf.a(this.a, this.l.a(16), this.l.a(18), this.l.a(19))).addToBackStack((String) null);
            }
            return null;
        }
    }

    private final void G() {
        if (o()) {
            j();
        }
        apku[] apkuArr = this.p.b;
        if (apkuArr != null && apkuArr.length > 0 && apkuArr[0] == apku.LACKS_BIRTHDAY) {
            i();
            return;
        }
        mfu.a(this, this.p.c, this.a, new mie(this), (DialogInterface.OnClickListener) null, false).show();
    }

    private final BillingSignupData H() {
        if (this.v) {
            return this.m.a;
        }
        return this.n.a;
    }

    private final WalletCustomTheme I() {
        String stringExtra = getIntent().getStringExtra("predefinedTheme");
        int i2 = 0;
        if (!TextUtils.isEmpty(stringExtra)) {
            if (stringExtra.equals("play")) {
                i2 = 2132018525;
            } else if (stringExtra.equals("music")) {
                i2 = 2132018528;
            } else if (stringExtra.equals("youtube")) {
                i2 = -1;
            }
        }
        if (i2 == 0) {
            i2 = 2132018423;
        }
        if (i2 == -1) {
            return null;
        }
        WalletCustomTheme walletCustomTheme = new WalletCustomTheme();
        walletCustomTheme.a = hdg.a(this, i2);
        return walletCustomTheme;
    }

    private final void J() {
        DialogFragment dialogFragment = (DialogFragment) getSupportFragmentManager().findFragmentByTag("upgrade-preconditions");
        if (dialogFragment != null) {
            dialogFragment.dismissAllowingStateLoss();
        }
        getWindow().clearFlags(FragmentTransaction.TRANSIT_EXIT_MASK);
    }

    private final void K() {
        mfu.a(this, new mig(this), new mid(this)).show();
    }

    public final void a(boolean z2) {
        this.y = z2;
    }

    public final mhi b() {
        return this.r;
    }

    public final void c(int i2) {
        ith ith = mfv.a;
        setResult(4, new Intent().putExtra("accountName", this.a).putExtra("errorCode", i2));
        finish();
    }

    public final void d(boolean z2) {
        J();
        C();
        getSupportLoaderManager().initLoader(1, (Bundle) null, new mjc(this, z2));
    }

    public final void e() {
        if (axgj.b() && this.y) {
            this.r.b(32);
            setResult(1);
            finish();
        } else if (this.v || this.p.a) {
            b(false);
        } else {
            G();
        }
    }

    public final void f() {
        this.k = false;
        l();
    }

    public final Activity getActivity() {
        return this;
    }

    public final void h() {
        if (this.v || this.p.a) {
            b(false);
        } else {
            G();
        }
    }

    public final void i() {
        mhz mhz;
        if (this.o.f != null) {
            String str = this.a;
            PageData a2 = this.l.a(3);
            PageData a3 = this.l.a(14);
            BirthdayData birthdayData = this.o.f;
            mhz = new mhz();
            Bundle bundle = new Bundle(4);
            bundle.putString("accountName", str);
            bundle.putParcelable("birthdayPageData", a2);
            bundle.putParcelable("confirmPageData", a3);
            bundle.putParcelable("birthday", birthdayData);
            mhz.setArguments(bundle);
        } else {
            String str2 = this.a;
            PageData a4 = this.l.a(3);
            PageData a5 = this.l.a(14);
            mhz = new mhz();
            Bundle bundle2 = new Bundle(3);
            bundle2.putString("accountName", str2);
            bundle2.putParcelable("birthdayPageData", a4);
            bundle2.putParcelable("confirmPageData", a5);
            mhz.setArguments(bundle2);
        }
        getFragmentManager().beginTransaction().add((Fragment) mhz, "birthdayDialog").commitAllowingStateLoss();
    }

    public final void j() {
        findViewById(R.id.fm_family_creation_loading_screen).setVisibility(8);
    }

    public final void k() {
        this.w = true;
        if (!this.h && !this.g) {
            B();
            return;
        }
        j();
        l();
    }

    public final void l() {
        mlq mlq;
        if (this.y && this.l.b(35)) {
            j();
            this.y = false;
            if (!axga.c() || !D() || !this.s.a.equals("agsa")) {
                mlq = mlq.a(this.a, this.l.a(35), (ArrayList) null);
            } else {
                mlq = mlq.a(this.a, this.l.a(35), new ArrayList());
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fm_family_creation_fragment_container, mlq).addToBackStack((String) null).commitAllowingStateLoss();
        } else if (this.k) {
            Intent addFlags = new Intent().setClassName(this, "com.google.android.gms.family.v2.invites.SendInvitationsActivity").putExtra("accountName", this.a).putExtra("consistencyToken", this.b.a()).putExtra("tokenExpirationTimeSecs", this.b.b()).putExtra("appId", this.s.a).putExtra("customTheme", getIntent().getIntExtra("customTheme", 0)).putExtra("predefinedTheme", jlh.a(getIntent().getStringExtra("predefinedTheme"))).putExtra("clientCallingPackage", jhg.a((Activity) this)).putExtra("fromCreate", true).putExtra("familyChanged", this.x).putExtra("profileData", this.o).putExtra("inviteeRole", this.e.g).addFlags(65536);
            if (axga.c() && this.s.a.equals("agsa")) {
                addFlags.putExtra("isDirectAddInvitations", D());
            }
            startActivityForResult(addFlags, 2);
        } else {
            setResult(1, E());
            this.r.b(7);
            finish();
        }
    }

    public final void m() {
        this.r.b(32);
        setResult(3, E());
        finish();
    }

    public final void n() {
        if (!this.i || F() == null) {
            B();
        } else {
            F().commit();
        }
    }

    public final boolean o() {
        return getSupportFragmentManager().findFragmentById(R.id.fm_family_creation_fragment_container) != null;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 != 1) {
            if (i2 == 2) {
                if (i3 == 1) {
                    if (intent.getStringExtra("consistencyToken") != null) {
                        this.b.a(getIntent().getStringExtra("consistencyToken"), getIntent().getLongExtra("tokenExpirationTimeSecs", 0));
                    }
                    this.x = intent.getBooleanExtra("familyChanged", this.x);
                    if (axga.b() && this.x) {
                        setResult(1, E());
                        this.r.b(31);
                        finish();
                        return;
                    }
                    this.k = false;
                    l();
                } else if (this.l.b(35)) {
                    this.r.b(30);
                    this.k = false;
                    this.y = true;
                    getLoaderManager().destroyLoader(0);
                    getLoaderManager().destroyLoader(1);
                    getLoaderManager().destroyLoader(2);
                    getLoaderManager().destroyLoader(3);
                    getLoaderManager().destroyLoader(4);
                    getLoaderManager().destroyLoader(5);
                    getLoaderManager().destroyLoader(6);
                    getLoaderManager().destroyLoader(7);
                    l();
                } else {
                    j();
                    if (this.j) {
                        C();
                        getSupportLoaderManager().restartLoader(6, (Bundle) null, new miw(this));
                    }
                }
            }
        } else if (i3 == -1) {
            this.r.b(15);
            this.j = true;
            this.x = true;
            k();
        } else {
            j();
        }
    }

    public final void onBackPressed() {
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.fm_family_creation_fragment_container);
        if (findFragmentById == null) {
            m();
        } else if (findFragmentById instanceof mlq) {
            setResult(1, E());
            this.r.b(31);
            finish();
        } else {
            super.onBackPressed();
        }
    }

    public final void onCreate(Bundle bundle) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        PageDataMap pageDataMap;
        Calendar calendar;
        super.onCreate(bundle);
        this.r = new mhi(this);
        setRequestedOrientation(1);
        String a2 = jhg.a((Activity) this);
        if (!hya.a((Context) this).b(a2)) {
            this.r.a(3, 8);
            c(-3);
            return;
        }
        String stringExtra = getIntent().getStringExtra("accountName");
        this.a = stringExtra;
        if (stringExtra == null) {
            this.r.a(3, 13);
            c(-2);
            return;
        }
        boolean z10 = false;
        Account account = null;
        for (Account account2 : qub.a((Context) this).a("com.google")) {
            if (account2.name.equals(this.a)) {
                account = account2;
            }
        }
        if (account == null) {
            this.r.a(3, 14);
            String str = this.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42);
            sb.append("Selected account: ");
            sb.append(str);
            sb.append(" doesn't exist on device");
            sb.toString();
            c(-2);
            return;
        }
        mfx.a(this, getIntent(), a2);
        this.s = new mfp(getIntent().getStringExtra("appId"), Integer.toString(ModuleManager.get(this).getCurrentModule().moduleVersion));
        this.d = getIntent().getStringExtra("referencePcid");
        this.b = new mfr();
        if (bundle != null && bundle.getString("consistencyToken") != null) {
            this.b.a(bundle.getString("consistencyToken"), bundle.getLong("tokenExpirationTimeSecs", 0));
        } else if (getIntent().getStringExtra("consistencyToken") != null) {
            this.b.a(getIntent().getStringExtra("consistencyToken"), getIntent().getLongExtra("tokenExpirationTimeSecs", 0));
        }
        if (bundle != null && bundle.getByteArray("auditToken") != null) {
            this.c = bundle.getByteArray("auditToken");
        } else if (getIntent().getByteArrayExtra("auditToken") != null) {
            this.c = getIntent().getByteArrayExtra("auditToken");
        } else {
            aucd o2 = aqnm.c.o();
            auay a3 = auay.a(egl.a());
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aqnm aqnm = (aqnm) o2.b;
            a3.getClass();
            aqnm.a |= 1;
            aqnm.b = a3;
            this.c = ((aqnm) o2.i()).k();
        }
        this.o = bundle != null ? (ProfileData) bundle.getParcelable("profileData") : null;
        this.p = bundle != null ? (CanCreateFamilyData) bundle.getParcelable("canCreateData") : null;
        this.n = bundle != null ? (SetupParams) bundle.getParcelable("setupParams") : null;
        this.m = bundle != null ? (UpgradeParams) bundle.getParcelable("upgradeParams") : null;
        int a4 = bundle != null ? apiv.a(bundle.getInt("pcidType")) : 0;
        if (a4 == 0) {
            a4 = 1;
        }
        this.t = a4;
        if (bundle == null || !bundle.getBoolean("hasFamily", false)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.g = z2;
        if (bundle == null || !bundle.getBoolean("familyCreated", false)) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.h = z3;
        if (bundle == null || !bundle.getBoolean("isUpgradeFlow", false)) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.v = z4;
        if (bundle == null || !bundle.getBoolean("inviteOnFinish", false)) {
            z5 = false;
        } else {
            z5 = true;
        }
        this.k = z5;
        if (bundle == null || !bundle.getBoolean("walletComplete", false)) {
            z6 = false;
        } else {
            z6 = true;
        }
        this.w = z6;
        if (bundle == null || !bundle.getBoolean("fopChanged", false)) {
            z7 = false;
        } else {
            z7 = true;
        }
        this.j = z7;
        if (bundle == null || !bundle.getBoolean("fopRequested", false)) {
            z8 = false;
        } else {
            z8 = true;
        }
        this.i = z8;
        if (bundle == null || !bundle.getBoolean("skipClicked", false)) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.y = z9;
        if (bundle != null) {
            pageDataMap = (PageDataMap) bundle.getParcelable("pageDataMap");
        } else {
            pageDataMap = null;
        }
        this.l = pageDataMap;
        if (bundle != null) {
            calendar = (Calendar) bundle.getSerializable("pendingBirthday");
        } else {
            calendar = null;
        }
        this.q = calendar;
        apix a5 = bundle != null ? apix.a(bundle.getInt("inviteeRole")) : apix.UNKNOWN_FAMILY_ROLE;
        this.e = a5;
        if (a5 == null) {
            a5 = apix.UNKNOWN_FAMILY_ROLE;
        }
        this.e = a5;
        if (bundle != null && bundle.getBoolean("familyChanged")) {
            z10 = true;
        }
        this.x = z10;
        if (this.z == null) {
            boolean c2 = axgd.c();
            ibz ibz = new ibz(this);
            ibz.a(this.a);
            ibq ibq = adws.a;
            adwq adwq = new adwq();
            adwq.a = c2 ^ true ? 1 : 0;
            ibz.a(ibq, (ibj) adwq.a());
            ibq ibq2 = wlt.a;
            wlr wlr = new wlr();
            wlr.a = 80;
            ibz.a(ibq2, (ibj) wlr.a());
            ibz.a((Activity) this, (icb) this);
            this.z = ibz.b();
        }
        mhi mhi = this.r;
        String str2 = this.a;
        mfp mfp = this.s;
        mhi.a(str2, mfp.b, mfp.a);
        this.r.b(2);
        setContentView((int) R.layout.fm_activity_family_creation_v2);
        j();
        if (this.q != null) {
            A();
        } else if (!o()) {
            C();
            this.u = new SparseIntArray();
            getSupportLoaderManager().initLoader(5, (Bundle) null, new mjf(this));
            b(5);
            getSupportLoaderManager().initLoader(7, (Bundle) null, new mis(this));
            b(7);
            getSupportLoaderManager().initLoader(6, (Bundle) null, new miw(this));
            b(6);
            getSupportLoaderManager().initLoader(4, (Bundle) null, new mij(this));
            b(4);
        }
    }

    public final void onPause() {
        super.onPause();
        getSupportLoaderManager().destroyLoader(2);
        getSupportLoaderManager().destroyLoader(5);
        getSupportLoaderManager().destroyLoader(7);
        getSupportLoaderManager().destroyLoader(6);
        getSupportLoaderManager().destroyLoader(4);
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("profileData", this.o);
        bundle.putParcelable("canCreateData", this.p);
        bundle.putParcelable("upgradeParams", this.m);
        bundle.putParcelable("setupParams", this.n);
        bundle.putBoolean("hasFamily", this.g);
        bundle.putBoolean("familyCreated", this.h);
        bundle.putBoolean("isUpgradeFlow", this.v);
        bundle.putBoolean("inviteOnFinish", this.k);
        bundle.putBoolean("walletComplete", this.w);
        bundle.putBoolean("fopChanged", this.j);
        bundle.putBoolean("fopRequested", this.i);
        bundle.putBoolean("skipClicked", this.y);
        bundle.putParcelable("pageDataMap", this.l);
        bundle.putInt("inviteeRole", this.e.g);
        int i2 = this.t;
        int i3 = i2 - 1;
        if (i2 != 0) {
            bundle.putInt("pcidType", i3);
            Calendar calendar = this.q;
            if (calendar != null) {
                bundle.putSerializable("pendingBirthday", calendar);
            }
            if (this.b.a() != null && !this.b.a().isEmpty()) {
                bundle.putString("consistencyToken", this.b.a());
                bundle.putLong("tokenExpirationTimeSecs", this.b.b());
            }
            bundle.putBoolean("familyChanged", this.x);
            bundle.putByteArray("auditToken", this.c);
            return;
        }
        throw null;
    }

    public final mfp p() {
        return this.s;
    }

    public final boolean q() {
        j();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (this.l.b(1)) {
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            String str = this.a;
            PageData a2 = this.l.a(1);
            mhs mhs = new mhs();
            Bundle bundle = new Bundle(2);
            bundle.putString("accountName", str);
            bundle.putParcelable("pageData", a2);
            mhs.setArguments(bundle);
            beginTransaction.add((int) R.id.fm_family_creation_fragment_container, (Fragment) mhs).commitAllowingStateLoss();
        } else if (axgj.b() && this.l.b(37)) {
            FragmentTransaction beginTransaction2 = supportFragmentManager.beginTransaction();
            byte[] bArr = this.c;
            String str2 = this.a;
            PageData a3 = this.l.a(37);
            mlf mlf = new mlf();
            Bundle bundle2 = new Bundle(4);
            bundle2.putByteArray("auditToken", bArr);
            bundle2.putString("accountName", str2);
            bundle2.putParcelable("pageData", a3);
            mlf.setArguments(bundle2);
            beginTransaction2.add((int) R.id.fm_family_creation_fragment_container, (Fragment) mlf).commitAllowingStateLoss();
        } else if (this.l.b(2)) {
            supportFragmentManager.beginTransaction().add((int) R.id.fm_family_creation_fragment_container, (Fragment) mln.a(this.c, this.a, this.l.a(2), this.o)).commitAllowingStateLoss();
        } else if (this.l.b(22)) {
            supportFragmentManager.beginTransaction().add((int) R.id.fm_family_creation_fragment_container, (Fragment) mju.a(this.a, this.l.a(22), this.l.a(18), this.l.a(19))).commitAllowingStateLoss();
        } else if (!this.l.b(16)) {
            return false;
        } else {
            supportFragmentManager.beginTransaction().add((int) R.id.fm_family_creation_fragment_container, (Fragment) mkf.a(this.a, this.l.a(16), this.l.a(18), this.l.a(19))).commitAllowingStateLoss();
        }
        return true;
    }

    public final void r() {
        WalletCustomTheme I = I();
        boolean c2 = axgd.c();
        adxh adxh = new adxh(this);
        adxh.a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS", Base64.decode(H().a, 0));
        adxh.a(new Account(this.a, "com.google"));
        adxh.a(c2 ^ true ? 1 : 0);
        adxh.a(I);
        this.r.b(6);
        startActivityForResult(adxh.a(), 1);
    }

    public final void s() {
        C();
        getSupportLoaderManager().initLoader(8, (Bundle) null, new mim(this));
    }

    public final void t() {
        m();
    }

    public final boolean u() {
        return this.w;
    }

    public final icc v() {
        return this.z;
    }

    public final mfr w() {
        return this.b;
    }

    public final void x() {
        mfu.a((Activity) this).show();
        J();
    }

    public final void y() {
        J();
    }

    public final void z() {
        apku[] apkuArr;
        if (this.u.size() == 0) {
            boolean z2 = this.f == apix.HEAD_OF_HOUSEHOLD && this.g && this.i;
            this.v = z2;
            if (!z2) {
                CanCreateFamilyData canCreateFamilyData = this.p;
                if (!canCreateFamilyData.a && (apkuArr = canCreateFamilyData.b) != null && apkuArr.length > 0 && apkuArr[0] != apku.LACKS_BIRTHDAY && this.p.c == null) {
                    K();
                    return;
                } else if (this.q != null) {
                    if (!this.p.a) {
                        G();
                        this.q = null;
                        return;
                    } else if (this.i) {
                        getSupportLoaderManager().initLoader(2, (Bundle) null, new miz(this));
                        return;
                    } else {
                        b(true);
                        getFragmentManager().executePendingTransactions();
                        this.q = null;
                        return;
                    }
                } else if (this.p.a) {
                    getSupportLoaderManager().initLoader(2, (Bundle) null, new miz(this));
                    return;
                } else if (!this.l.b(2)) {
                    G();
                    return;
                }
            }
            if (this.l.b(1) || this.l.b(2) || this.l.b(22) || this.l.b(16)) {
                q();
            } else {
                K();
            }
        }
    }

    public final void a() {
        getSupportFragmentManager().beginTransaction().replace(R.id.fm_family_creation_fragment_container, mln.a(this.c, this.a, this.l.a(2), this.o)).addToBackStack((String) null).commit();
    }

    public final void b(int i2) {
        this.u.put(i2, 1);
    }

    public final void b(boolean z2) {
        FragmentTransaction fragmentTransaction = null;
        if (getIntent().hasExtra("tosContent")) {
            fragmentTransaction = getSupportFragmentManager().beginTransaction().replace(R.id.fm_family_creation_fragment_container, mql.a(this.c, this.a, getIntent().getStringExtra("tosContent"), getIntent().getStringExtra("tosContinueButton"), getIntent().getStringExtra("tosMoreButton"))).addToBackStack((String) null);
        } else if (this.i) {
            fragmentTransaction = F();
        }
        if (fragmentTransaction == null) {
            B();
        } else if (z2) {
            j();
            fragmentTransaction.commitAllowingStateLoss();
        } else {
            fragmentTransaction.commit();
        }
    }

    public final void c(boolean z2) {
        if (this.w) {
            k();
        } else if (axfr.b() && z2) {
            s();
        } else if (this.v) {
            getWindow().addFlags(FragmentTransaction.TRANSIT_EXIT_MASK);
            String str = this.a;
            String str2 = this.d;
            int i2 = this.t;
            int i3 = i2 - 1;
            if (i2 != 0) {
                mqo mqo = new mqo();
                Bundle bundle = new Bundle(4);
                bundle.putString("accountName", str);
                bundle.putString("referencePcid", str2);
                bundle.putInt("pcidType", i3);
                bundle.putBoolean("headless", z2);
                mqo.setArguments(bundle);
                mqo.show(getSupportFragmentManager(), "upgrade-preconditions");
                return;
            }
            throw null;
        } else if (!axfr.b() && z2) {
            adwq adwq = new adwq();
            adwq.b();
            a(adws.a(this, adwq.a()));
        } else {
            r();
        }
    }

    public final void a(int i2) {
        this.u.delete(i2);
    }

    public final void a(adxa adxa) {
        C();
        ExecuteBuyFlowRequest executeBuyFlowRequest = new ExecuteBuyFlowRequest(Base64.decode(H().b, 0), (byte[]) null, I());
        iha b2 = ihb.b();
        b2.a = new adwx(adxa, executeBuyFlowRequest);
        adxa.b(b2.a()).a((acvv) new mic(this));
    }

    public final void a(ConnectionResult connectionResult) {
        mfu.a(this, new mib(this)).show();
    }

    public final void a(PageData pageData) {
        mfu.a(this, pageData, this.a, new mif(this), (DialogInterface.OnClickListener) null, false).show();
        J();
    }

    public final /* synthetic */ void a(ick ick) {
        if (ick.q().equals(Status.a)) {
            j();
            this.x = true;
            k();
        } else if (ick.q().b()) {
            try {
                startIntentSenderForResult(ick.q().k.getIntentSender(), 1, (Intent) null, 0, 0, 0);
            } catch (IntentSender.SendIntentException e2) {
                j();
                this.r.a(3, 5);
                mfv.f("FamilyCreationChimeraActivity", "Error starting pending intent: ", e2);
            }
        }
    }

    public final void a(Calendar calendar) {
        this.q = calendar;
        A();
    }
}
