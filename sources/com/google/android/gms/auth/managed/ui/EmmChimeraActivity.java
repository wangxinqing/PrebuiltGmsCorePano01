package com.google.android.gms.auth.managed.ui;

import android.accounts.Account;
import android.app.DownloadManager;
import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class EmmChimeraActivity extends ijd implements gie, gin, giz, ijh {
    private static final iwd a = ehv.a("AuthManaged", "EmmActivity");
    private Account b;
    private gic c;
    private byte[] d;
    private avwi e;
    private long f;
    private int g;
    private gjh h;
    private boolean i;
    private Bundle j;
    private String k;

    private final int c(int i2) {
        TypedArray obtainTypedArray = getResources().obtainTypedArray(i2);
        int resourceId = obtainTypedArray.getResourceId(h(), 0);
        obtainTypedArray.recycle();
        return resourceId;
    }

    public final void a() {
        g();
    }

    public final void b() {
        if (this.g == 3) {
            a(-1);
        } else {
            c();
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        if (((gio) getFragmentManager().findFragmentByTag("DownloadInstallFragment")) == null) {
            String str = this.b.name;
            avwi avwi = this.e;
            String str2 = avwi.c;
            String str3 = avwi.h;
            int i2 = this.g;
            String i3 = i();
            int h2 = h();
            gio gio = new gio();
            Bundle bundle = new Bundle();
            bundle.putString("account_name", str);
            bundle.putString("package_display_name", str2);
            bundle.putString("package_icon_url", str3);
            bundle.putInt("package_install_state", i2);
            bundle.putString("theme", i3);
            bundle.putInt("variant_index", h2);
            gio.setArguments(bundle);
            getFragmentManager().beginTransaction().replace(16908290, gio, "DownloadInstallFragment").commitAllowingStateLoss();
        }
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        if (((gja) getFragmentManager().findFragmentByTag("ProgressDialogFragment")) == null) {
            String str = this.e.c;
            String string = getString(R.string.auth_common_downloading);
            String string2 = getString(R.string.auth_device_management_download_paused);
            long j2 = this.f;
            byte[] bArr = this.d;
            gja gja = new gja();
            Bundle bundle = new Bundle();
            bundle.putCharSequence("title", str);
            bundle.putCharSequence("message", string);
            bundle.putCharSequence("pausedMessage", string2);
            bundle.putLong("downloadRequestId", j2);
            bundle.putByteArray("packageInformationBytes", bArr);
            gja.setArguments(bundle);
            getFragmentManager().beginTransaction().add((Fragment) gja, "ProgressDialogFragment").commitAllowingStateLoss();
            this.c.c = "ProgressDialogFragment";
        }
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        int i2;
        if (this.g == 2) {
            i2 = R.array.auth_device_management_download_not_updated_message;
        } else {
            i2 = R.array.auth_device_management_download_failed_message;
        }
        if (((iji) getFragmentManager().findFragmentByTag("FailedDialogFragment")) == null) {
            getFragmentManager().beginTransaction().add((Fragment) iji.a(getText(c(R.array.auth_device_management_download_failed_title)), getText(c(i2)), getText(R.string.common_retry), getText(R.string.common_dismiss), (CharSequence) null, true), "FailedDialogFragment").commitAllowingStateLoss();
            this.c.c = "FailedDialogFragment";
        }
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        if (((iji) getFragmentManager().findFragmentByTag("SkipDialogFragment")) == null) {
            getFragmentManager().beginTransaction().add((Fragment) iji.a(getText(c(R.array.auth_device_management_download_skip_message)), getText(c(R.array.auth_device_management_download_skip_confirm)), getText(R.string.auth_common_go_back), false), "SkipDialogFragment").commitAllowingStateLoss();
            this.c.c = "SkipDialogFragment";
        }
    }

    public final int h() {
        if (getIntent().getBooleanExtra("is_unicorn_account", false)) {
            return 2;
        }
        if (!getIntent().getBooleanExtra("is_unicorn_account", false) || !awow.a.a().h()) {
            return 0;
        }
        return 1;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        iwd iwd = a;
        StringBuilder sb = new StringBuilder(41);
        sb.append("onActivityResult: ");
        sb.append(i3);
        sb.append(" ");
        sb.append(i2);
        iwd.c(sb.toString(), new Object[0]);
        if (i2 == 1 && i3 == 0) {
            a.c("Forced DO is cancelled, removing the account", new Object[0]);
            a(10, (Intent) null);
            return;
        }
        boolean booleanExtra = getIntent().getBooleanExtra("is_setup_wizard", false);
        if (booleanExtra && i3 == 0) {
            int i4 = Build.VERSION.SDK_INT;
            if (((DevicePolicyManager) getSystemService("device_policy")).getDeviceOwner() != null || (jkr.c() && ((DevicePolicyManager) getSystemService("device_policy")).getUserProvisioningState() == 4)) {
                a.c("Provisioning is indeed done, returns RESULT_OKAY instead", new Object[0]);
                i3 = -1;
            }
        }
        if (awox.b() && !booleanExtra && i2 == 2 && i3 == 0 && this.h.a(this.k)) {
            avwi avwi = this.e;
            if (("com.google.android.apps.work.clouddpc".equals(avwi.b) || "com.google.android.apps.enterprise.dmagent".equals(avwi.b)) && getIntent().getIntExtra("flow", -1) == 0) {
                a.c("Returning to remove just added Google managed account", new Object[0]);
                a(10, (Intent) null);
                return;
            }
        }
        Account account = this.b;
        iva.a((Object) account);
        enz a2 = eoa.a(this);
        iha b2 = ihb.b();
        b2.b = new Feature[]{eia.b};
        b2.a = new epi(account);
        ((iby) a2).b(b2.a()).a((acvs) new gjg());
        a(i3, intent);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ef, code lost:
        if (r4 != false) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00fe, code lost:
        if (defpackage.awow.a.b().a() == false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x010e, code lost:
        if (defpackage.awow.a.b().c() == false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x011e, code lost:
        if (defpackage.awow.a.b().b() == false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0135, code lost:
        if ("com.google.work".equals(r6.b.type) == false) goto L_0x013c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            iwd r0 = a
            java.lang.String r1 = java.lang.String.valueOf(r7)
            android.content.Intent r2 = r6.getIntent()
            android.os.Bundle r2 = r2.getExtras()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + 10
            int r3 = r3 + r4
            r5.<init>(r3)
            java.lang.String r3 = "onCreate "
            r5.append(r3)
            r5.append(r1)
            java.lang.String r1 = " "
            r5.append(r1)
            r5.append(r2)
            java.lang.String r1 = r5.toString()
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r0.c(r1, r3)
            boolean r0 = defpackage.awpr.c()
            if (r0 != 0) goto L_0x004e
            goto L_0x0059
        L_0x004e:
            if (r7 != 0) goto L_0x0059
            gji r0 = defpackage.gji.a((android.content.Context) r6)
            r1 = 8
            r0.a((int) r1)
        L_0x0059:
            int r0 = android.os.Build.VERSION.SDK_INT
            android.content.pm.PackageManager r0 = r6.getPackageManager()
            java.lang.String r1 = "android.software.device_admin"
            boolean r0 = r0.hasSystemFeature(r1)
            r1 = 0
            if (r0 != 0) goto L_0x006d
            r7 = 5
            r6.a((int) r7, (android.content.Intent) r1)
            return
        L_0x006d:
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r3 = "flow"
            int r0 = r0.getIntExtra(r3, r2)
            if (r0 != 0) goto L_0x009a
            java.lang.String r3 = "user"
            java.lang.Object r3 = r6.getSystemService(r3)
            android.os.UserManager r3 = (android.os.UserManager) r3
            java.lang.String r4 = r6.getPackageName()
            android.os.Bundle r3 = r3.getApplicationRestrictions(r4)
            if (r3 == 0) goto L_0x009a
            java.lang.String r4 = "auth_account:disallow_managed_account"
            boolean r3 = r3.getBoolean(r4, r2)
            if (r3 != 0) goto L_0x0094
            goto L_0x009a
        L_0x0094:
            r7 = 9
            r6.a((int) r7, (android.content.Intent) r1)
            return
        L_0x009a:
            gjh r3 = defpackage.gjh.a()
            r6.h = r3
            android.content.Intent r3 = r6.getIntent()
            java.lang.String r4 = "account"
            android.os.Parcelable r3 = r3.getParcelableExtra(r4)
            android.accounts.Account r3 = (android.accounts.Account) r3
            r6.b = r3
            android.content.Intent r3 = r6.getIntent()
            java.lang.String r4 = "dm_status"
            java.lang.String r3 = r3.getStringExtra(r4)
            r6.k = r3
            if (r0 != 0) goto L_0x013c
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r3 = "is_setup_wizard"
            boolean r3 = r0.getBooleanExtra(r3, r2)
            java.lang.String r4 = "is_user_owner"
            boolean r4 = r0.getBooleanExtra(r4, r2)
            java.lang.String r5 = "is_unicorn_account"
            boolean r0 = r0.getBooleanExtra(r5, r2)
            if (r0 != 0) goto L_0x00f2
            if (r3 == 0) goto L_0x00e3
            awow r0 = defpackage.awow.a
            awpa r0 = r0.a()
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x0137
            goto L_0x00ef
        L_0x00e3:
            awow r0 = defpackage.awow.a
            awpa r0 = r0.a()
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x0137
        L_0x00ef:
            if (r4 == 0) goto L_0x0137
            goto L_0x0121
        L_0x00f2:
            if (r3 != 0) goto L_0x0100
            awow r0 = defpackage.awow.a
            awpa r0 = r0.a()
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0137
        L_0x0100:
            if (r3 == 0) goto L_0x0110
            if (r4 == 0) goto L_0x0110
            awow r0 = defpackage.awow.a
            awpa r0 = r0.a()
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0137
        L_0x0110:
            if (r3 == 0) goto L_0x0121
            if (r4 != 0) goto L_0x0121
            awow r0 = defpackage.awow.a
            awpa r0 = r0.a()
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x0121
            goto L_0x0137
        L_0x0121:
            gjh r0 = r6.h
            java.lang.String r3 = r6.k
            boolean r0 = r0.a((java.lang.String) r3)
            if (r0 == 0) goto L_0x0137
            android.accounts.Account r0 = r6.b
            java.lang.String r0 = r0.type
            java.lang.String r3 = "com.google.work"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x013c
        L_0x0137:
            r7 = 7
            r6.a((int) r7, (android.content.Intent) r1)
            return
        L_0x013c:
            if (r7 != 0) goto L_0x013f
            goto L_0x0148
        L_0x013f:
            java.lang.String r0 = "force_device_owner_launched"
            boolean r7 = r7.getBoolean(r0)
            r6.i = r7
        L_0x0148:
            com.google.android.chimera.FragmentManager r7 = r6.getFragmentManager()
            java.lang.String r0 = "StateRetainFragment"
            com.google.android.chimera.Fragment r7 = r7.findFragmentByTag(r0)
            gic r7 = (defpackage.gic) r7
            r6.c = r7
            if (r7 != 0) goto L_0x0170
            gic r7 = new gic
            r7.<init>()
            r6.c = r7
            com.google.android.chimera.FragmentManager r7 = r6.getFragmentManager()
            com.google.android.chimera.FragmentTransaction r7 = r7.beginTransaction()
            gic r1 = r6.c
            com.google.android.chimera.FragmentTransaction r7 = r7.add((com.google.android.chimera.Fragment) r1, (java.lang.String) r0)
            r7.commit()
        L_0x0170:
            gic r7 = r6.c
            byte[] r7 = r7.a
            r6.d = r7
            if (r7 != 0) goto L_0x0179
            goto L_0x0189
        L_0x0179:
            gjh r0 = r6.h
            avwi r7 = r0.a((byte[]) r7)
            r6.e = r7
            gjh r0 = r6.h
            int r7 = r0.a((android.content.Context) r6, (defpackage.avwi) r7)
            r6.g = r7
        L_0x0189:
            gic r7 = r6.c
            long r0 = r7.b
            r6.f = r0
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            r0 = 1
            java.lang.String r1 = "intentionally_canceled"
            android.content.Intent r7 = r7.putExtra(r1, r0)
            r6.setResult(r2, r7)
            android.content.Intent r7 = r6.getIntent()
            java.lang.String r0 = "options"
            android.os.Parcelable r7 = r7.getParcelableExtra(r0)
            android.os.Bundle r7 = (android.os.Bundle) r7
            r6.j = r7
            if (r7 != 0) goto L_0x01b2
            android.os.Bundle r7 = android.os.Bundle.EMPTY
            r6.j = r7
        L_0x01b2:
            boolean r7 = defpackage.awpf.b()
            if (r7 != 0) goto L_0x01bf
            android.os.Bundle r7 = r6.j
            java.lang.String r0 = "source_device_id"
            r7.remove(r0)
        L_0x01bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.managed.ui.EmmChimeraActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    public final void onResumeFragments() {
        super.onResumeFragments();
        a.c("onResumeFragments", new Object[0]);
        if (isFinishing()) {
            a.b("finish() had been called, skip resuming fragments.", new Object[0]);
        } else if (this.c.a != null) {
            d();
            gic gic = this.c;
            if (gic.b != -1 && "ProgressDialogFragment".equals(gic.c)) {
                e();
            } else if ("FailedDialogFragment".equals(this.c.c)) {
                f();
            } else if ("SkipDialogFragment".equals(this.c.c)) {
                g();
            }
        } else if (((gif) getFragmentManager().findFragmentByTag("FetchManagingAppFragment")) == null) {
            Account account = this.b;
            String i2 = i();
            gif gif = new gif();
            Bundle bundle = new Bundle();
            bundle.putParcelable("account", account);
            bundle.putString("theme", i2);
            gif.setArguments(bundle);
            getFragmentManager().beginTransaction().add(16908290, gif, "FetchManagingAppFragment").commit();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("force_device_owner_launched", this.i);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        Intent intent = getIntent();
        avwi avwi = this.e;
        Account account = this.b;
        int i3 = 0;
        boolean booleanExtra = intent.getBooleanExtra("is_setup_wizard", false);
        Bundle bundle = this.j;
        iva.a((Object) avwi);
        iva.a((Object) account);
        gje a2 = gjh.a(this, avwi.b, avwi, account, bundle, Boolean.valueOf(booleanExtra), false, (String) null);
        if (a2.a.i == Status.a.i && a2.b != null) {
            if (awpr.c()) {
                a.c("Launching managing app", new Object[0]);
                gji.a((Context) this).a(14, this.e);
            }
            Intent intent2 = a2.b;
            if (awox.b()) {
                i3 = 2;
            }
            startActivityForResult(intent2, i3);
        } else if (i2 != -1) {
            a(i2, (Intent) null);
        } else {
            a(2, (Intent) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        avwi avwi = this.e;
        iva.a((Object) avwi);
        DownloadManager.Request visibleInDownloadsUi = new DownloadManager.Request(Uri.parse(avwi.i)).setNotificationVisibility(2).setVisibleInDownloadsUi(false);
        if (!avwi.j.isEmpty() && !avwi.k.isEmpty()) {
            String str = avwi.j;
            String str2 = avwi.k;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
            sb.append(str);
            sb.append("=");
            sb.append(str2);
            visibleInDownloadsUi.addRequestHeader("Cookie", sb.toString());
        }
        long enqueue = ((DownloadManager) getSystemService("download")).enqueue(visibleInDownloadsUi);
        this.f = enqueue;
        this.c.b = enqueue;
        e();
    }

    public final void b(int i2) {
        this.c.c = null;
        if (i2 == 3) {
            g();
        } else if (i2 == 1) {
            f();
        } else if (i2 == 2) {
            a(-1);
        }
        ((DownloadManager) getSystemService("download")).remove(new long[]{this.f});
        this.c.b = -1;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, Intent intent) {
        iwd iwd = a;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Finish with resultCode: ");
        sb.append(i2);
        iwd.c(sb.toString(), new Object[0]);
        if (awpr.c()) {
            gji a2 = gji.a((Context) this);
            aucd o = baqb.g.o();
            bapz a3 = gji.a();
            if (o.c) {
                o.c();
                o.c = false;
            }
            baqb baqb = (baqb) o.b;
            a3.getClass();
            baqb.b = a3;
            int i3 = baqb.a | 1;
            baqb.a = i3;
            baqb.c = 15;
            int i4 = 2;
            int i5 = i3 | 2;
            baqb.a = i5;
            switch (i2) {
                case -1:
                    break;
                case 0:
                    i4 = 3;
                    break;
                case 2:
                    i4 = 4;
                    break;
                case 3:
                    i4 = 5;
                    break;
                case 4:
                    i4 = 6;
                    break;
                case 5:
                    i4 = 7;
                    break;
                case 6:
                    i4 = 8;
                    break;
                case 7:
                    i4 = 9;
                    break;
                case 8:
                    i4 = 10;
                    break;
                case 9:
                    i4 = 11;
                    break;
                case 10:
                    i4 = 12;
                    break;
                default:
                    i4 = 1;
                    break;
            }
            baqb.e = i4 - 1;
            baqb.a = i5 | 8;
            hoi a4 = a2.a.a(((baqb) o.i()).k());
            a4.b(15);
            a4.b();
        }
        if (i2 == 0) {
            if (intent == null) {
                intent = new Intent();
            }
            intent.putExtra("intentionally_canceled", true);
        }
        setResult(i2, intent);
        finish();
    }

    public final void a(iji iji, int i2) {
        Fragment findFragmentByTag = getFragmentManager().findFragmentByTag("SkipDialogFragment");
        Fragment findFragmentByTag2 = getFragmentManager().findFragmentByTag("FailedDialogFragment");
        iji.dismissAllowingStateLoss();
        this.c.c = null;
        if (i2 == 1 && findFragmentByTag == iji) {
            a(6, (Intent) null);
        } else if (findFragmentByTag2 != iji) {
        } else {
            if (i2 != 1) {
                a(4);
            } else {
                c();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x024a, code lost:
        if (r14.name.contains("@") == false) goto L_0x0256;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(byte[] r13, boolean r14, java.lang.String r15) {
        /*
            r12 = this;
            iwd r0 = a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 45
            r1.<init>(r2)
            java.lang.String r2 = "onFetchManagingAppInfoFragmentFinished, "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r0.c(r1, r3)
            r12.d = r13
            gjh r0 = r12.h
            avwi r13 = r0.a((byte[]) r13)
            r12.e = r13
            r0 = 0
            r1 = 3
            if (r13 == 0) goto L_0x0282
            android.content.Intent r13 = r12.getIntent()
            java.lang.String r3 = "suppress_account_provisioning"
            boolean r13 = r13.getBooleanExtra(r3, r2)
            if (r13 == 0) goto L_0x0050
            avwi r13 = r12.e
            java.lang.String r13 = r13.b
            android.content.Intent r3 = r12.getIntent()
            java.lang.String r4 = "calling_package"
            java.lang.String r3 = r3.getStringExtra(r4)
            boolean r13 = r13.equals(r3)
            if (r13 != 0) goto L_0x004a
            goto L_0x0050
        L_0x004a:
            r13 = 8
            r12.a((int) r13, (android.content.Intent) r0)
            return
        L_0x0050:
            android.os.Bundle r13 = r12.j
            java.lang.String r0 = "enforced_management_mode"
            int r13 = r13.getInt(r0, r2)
            r3 = 2
            r4 = 1
            if (r13 != 0) goto L_0x006e
            qub r13 = defpackage.qub.a((android.content.Context) r12)
            java.lang.String r5 = "com.google"
            android.accounts.Account[] r13 = r13.a((java.lang.String) r5)
            int r13 = r13.length
            if (r13 <= r4) goto L_0x006e
            android.os.Bundle r13 = r12.j
            r13.putInt(r0, r3)
        L_0x006e:
            boolean r13 = android.text.TextUtils.isEmpty(r15)
            java.lang.String r5 = "source_device_id"
            if (r13 != 0) goto L_0x007b
            android.os.Bundle r13 = r12.j
            r13.putString(r5, r15)
        L_0x007b:
            android.content.ContentResolver r13 = r12.getContentResolver()
            java.lang.String r15 = "device_provisioned"
            int r13 = android.provider.Settings.Secure.getInt(r13, r15, r4)
            if (r14 == 0) goto L_0x0267
            boolean r14 = defpackage.jkr.e()
            if (r14 == 0) goto L_0x0267
            android.content.Intent r14 = r12.getIntent()
            java.lang.String r15 = "is_setup_wizard"
            boolean r14 = r14.getBooleanExtra(r15, r2)
            if (r14 == 0) goto L_0x0267
            android.os.Bundle r14 = r12.j
            int r14 = r14.getInt(r0, r2)
            if (r14 != r3) goto L_0x00a3
            goto L_0x0267
        L_0x00a3:
            if (r13 != 0) goto L_0x0267
            boolean r13 = r12.i
            if (r13 != 0) goto L_0x0266
            r12.i = r4
            boolean r13 = defpackage.awpr.c()
            if (r13 == 0) goto L_0x00d3
            iwd r13 = a
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r15 = 26
            r14.<init>(r15)
            java.lang.String r15 = "Launching forced DO, true"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            java.lang.Object[] r15 = new java.lang.Object[r2]
            r13.c(r14, r15)
            gji r13 = defpackage.gji.a((android.content.Context) r12)
            r14 = 15
            avwi r15 = r12.e
            r13.a((int) r14, (defpackage.avwi) r15)
        L_0x00d3:
            avwi r13 = r12.e
            android.accounts.Account r14 = r12.b
            android.os.Bundle r15 = r12.j
            defpackage.iva.a((java.lang.Object) r13)
            iwd r3 = defpackage.gjh.a
            java.lang.String r6 = r13.b
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "packageName: "
            int r8 = r6.length()
            if (r8 != 0) goto L_0x00f2
            java.lang.String r6 = new java.lang.String
            r6.<init>(r7)
            goto L_0x00f6
        L_0x00f2:
            java.lang.String r6 = r7.concat(r6)
        L_0x00f6:
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r3.c(r6, r7)
            iwd r3 = defpackage.gjh.a
            java.lang.String r6 = r13.m
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "zeroTouchDeviceAdminReceiver: "
            int r8 = r6.length()
            if (r8 != 0) goto L_0x0111
            java.lang.String r6 = new java.lang.String
            r6.<init>(r7)
            goto L_0x0115
        L_0x0111:
            java.lang.String r6 = r7.concat(r6)
        L_0x0115:
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r3.c(r6, r7)
            iwd r3 = defpackage.gjh.a
            java.lang.String r6 = r13.i
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "apkDownloadUrl: "
            int r8 = r6.length()
            if (r8 != 0) goto L_0x0130
            java.lang.String r6 = new java.lang.String
            r6.<init>(r7)
            goto L_0x0134
        L_0x0130:
            java.lang.String r6 = r7.concat(r6)
        L_0x0134:
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r3.c(r6, r7)
            iwd r3 = defpackage.gjh.a
            java.lang.String r6 = r13.f
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "apkSigningCertSha256Hash: "
            int r8 = r6.length()
            if (r8 != 0) goto L_0x014f
            java.lang.String r6 = new java.lang.String
            r6.<init>(r7)
            goto L_0x0153
        L_0x014f:
            java.lang.String r6 = r7.concat(r6)
        L_0x0153:
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r3.c(r6, r7)
            iwd r3 = defpackage.gjh.a
            java.lang.String r6 = r13.j
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "apkDownloadCookieName: "
            int r8 = r6.length()
            if (r8 != 0) goto L_0x016e
            java.lang.String r6 = new java.lang.String
            r6.<init>(r7)
            goto L_0x0172
        L_0x016e:
            java.lang.String r6 = r7.concat(r6)
        L_0x0172:
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r3.c(r6, r7)
            iwd r3 = defpackage.gjh.a
            java.lang.String r6 = r13.k
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "apkDownloadCookieValue: "
            int r8 = r6.length()
            if (r8 != 0) goto L_0x018d
            java.lang.String r6 = new java.lang.String
            r6.<init>(r7)
            goto L_0x0191
        L_0x018d:
            java.lang.String r6 = r7.concat(r6)
        L_0x0191:
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r3.c(r6, r7)
            android.os.PersistableBundle r3 = new android.os.PersistableBundle
            r3.<init>()
            android.content.Intent r6 = new android.content.Intent
            java.lang.String r7 = "android.app.action.PROVISION_MANAGED_DEVICE_FROM_TRUSTED_SOURCE"
            r6.<init>(r7)
            android.content.ComponentName r7 = new android.content.ComponentName
            java.lang.String r8 = r13.b
            java.lang.String r9 = r13.m
            r7.<init>(r8, r9)
            java.lang.String r8 = "android.app.extra.PROVISIONING_DEVICE_ADMIN_COMPONENT_NAME"
            android.content.Intent r6 = r6.putExtra(r8, r7)
            java.lang.String r7 = r13.c
            java.lang.String r8 = "android.app.extra.PROVISIONING_DEVICE_ADMIN_PACKAGE_LABEL"
            android.content.Intent r6 = r6.putExtra(r8, r7)
            java.lang.String r7 = r13.i
            java.lang.String r8 = "android.app.extra.PROVISIONING_DEVICE_ADMIN_PACKAGE_DOWNLOAD_LOCATION"
            android.content.Intent r6 = r6.putExtra(r8, r7)
            java.lang.String r7 = r13.f
            java.lang.String r8 = "android.app.extra.PROVISIONING_DEVICE_ADMIN_SIGNATURE_CHECKSUM"
            android.content.Intent r6 = r6.putExtra(r8, r7)
            java.lang.String r7 = r13.j
            java.lang.String r8 = r13.k
            java.lang.String r9 = java.lang.String.valueOf(r7)
            int r9 = r9.length()
            java.lang.String r10 = java.lang.String.valueOf(r8)
            int r10 = r10.length()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            int r9 = r9 + r4
            int r9 = r9 + r10
            r11.<init>(r9)
            r11.append(r7)
            java.lang.String r7 = "="
            r11.append(r7)
            r11.append(r8)
            java.lang.String r7 = r11.toString()
            java.lang.String r8 = "android.app.extra.PROVISIONING_DEVICE_ADMIN_PACKAGE_DOWNLOAD_COOKIE_HEADER"
            android.content.Intent r6 = r6.putExtra(r8, r7)
            java.lang.String r13 = r13.b
            java.lang.String r7 = "com.google.android.apps.work.clouddpc"
            boolean r13 = r7.equals(r13)
            if (r13 == 0) goto L_0x0256
            java.lang.String r13 = r14.name
            java.lang.String r7 = "com.google.android.apps.work.clouddpc.EXTRA_ACCOUNT_NAME"
            r3.putString(r7, r13)
            java.lang.String r13 = r14.type
            java.lang.String r7 = "com.google.android.apps.work.clouddpc.EXTRA_ACCOUNT_TYPE"
            r3.putString(r7, r13)
            int r13 = r15.getInt(r0, r2)
            r3.putInt(r0, r13)
            java.lang.String r13 = "restore_mode"
            int r0 = r15.getInt(r13, r2)
            r3.putInt(r13, r0)
            r7 = -1
            long r7 = r15.getLong(r5, r7)
            r3.putLong(r5, r7)
            boolean r13 = defpackage.jkr.h()
            if (r13 == 0) goto L_0x0256
            awow r13 = defpackage.awow.a
            awpa r13 = r13.a()
            boolean r13 = r13.i()
            if (r13 == 0) goto L_0x023d
            goto L_0x024d
        L_0x023d:
            if (r14 == 0) goto L_0x0256
            defpackage.iva.a((java.lang.Object) r14)
            java.lang.String r13 = r14.name
            java.lang.String r14 = "@"
            boolean r13 = r13.contains(r14)
            if (r13 != 0) goto L_0x024d
            goto L_0x0256
        L_0x024d:
            java.lang.String r13 = "android.app.extra.PROVISIONING_SKIP_EDUCATION_SCREENS"
            r3.putBoolean(r13, r4)
            r6.putExtra(r13, r4)
        L_0x0256:
            java.lang.String r13 = "android.app.extra.PROVISIONING_ADMIN_EXTRAS_BUNDLE"
            r6.putExtra(r13, r3)
            java.lang.String r13 = "android.app.extra.PROVISIONING_TRIGGER"
            android.content.Intent r13 = r6.putExtra(r13, r1)
            r12.startActivityForResult(r13, r4)
            return
        L_0x0266:
            return
        L_0x0267:
            gic r13 = r12.c
            byte[] r14 = r12.d
            r13.a = r14
            gjh r13 = r12.h
            avwi r14 = r12.e
            int r13 = r13.a((android.content.Context) r12, (defpackage.avwi) r14)
            r12.g = r13
            if (r13 != r1) goto L_0x027e
            r13 = -1
            r12.a(r13)
            return
        L_0x027e:
            r12.d()
            return
        L_0x0282:
            r12.a((int) r1, (android.content.Intent) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.managed.ui.EmmChimeraActivity.a(byte[], boolean, java.lang.String):void");
    }
}
