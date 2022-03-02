package defpackage;

import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.gms.R;

/* renamed from: mrm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class mrm extends hdf {
    public arwt a;
    protected boolean b;
    private arxg c;

    private static final int b(Intent intent) {
        return intent.getIntExtra("caller", 0);
    }

    public final void a(int i) {
        String string = getResources().getString(i);
        if (aE() != null) {
            aE().a((CharSequence) string);
        }
        setTitle((CharSequence) string);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0084, code lost:
        if (r5 != false) goto L_0x00b8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            super.onCreate(r9)
            boolean r0 = r8.b
            if (r0 != 0) goto L_0x0172
            boolean r0 = defpackage.aymw.W()
            if (r0 == 0) goto L_0x0124
            arxg r0 = new arxg
            r0.<init>(r8)
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0124
            hya r0 = defpackage.hya.a((android.content.Context) r8)
            java.lang.String r1 = "com.google.location.nearby.apps.fastpair.autotest"
            boolean r0 = r0.b((java.lang.String) r1)
            r2 = 1
            if (r0 != 0) goto L_0x00b8
            java.lang.String r0 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r3 = "a"
            java.lang.String r4 = "mre"
            jjg r5 = defpackage.mte.a
            anie r5 = r5.c()
            anih r5 = (defpackage.anih) r5
            r6 = 28
            anie r5 = r5.a((java.lang.String) r4, (java.lang.String) r3, (int) r6, (java.lang.String) r0)
            anih r5 = (defpackage.anih) r5
            java.lang.String r6 = "AutoTestChecker: Auto test is not Google signed, check if it's local build"
            r5.a((java.lang.String) r6)
            android.content.pm.PackageManager r5 = r8.getPackageManager()     // Catch:{ NameNotFoundException -> 0x009e }
            r6 = 64
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r1, r6)     // Catch:{ NameNotFoundException -> 0x009e }
            android.content.pm.Signature[] r6 = r5.signatures
            if (r6 == 0) goto L_0x0087
            android.content.pm.Signature[] r6 = r5.signatures
            int r6 = r6.length
            if (r6 == r2) goto L_0x0054
            goto L_0x0087
        L_0x0054:
            aymt r6 = defpackage.aymt.a
            aymu r6 = r6.a()
            java.lang.String r6 = r6.d()
            android.content.pm.Signature[] r5 = r5.signatures
            r7 = 0
            r5 = r5[r7]
            java.lang.String r5 = r5.toCharsString()
            boolean r5 = r6.equals(r5)
            jjg r6 = defpackage.mte.a
            anie r6 = r6.c()
            anih r6 = (defpackage.anih) r6
            r7 = 50
            anie r0 = r6.a((java.lang.String) r4, (java.lang.String) r3, (int) r7, (java.lang.String) r0)
            anih r0 = (defpackage.anih) r0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)
            java.lang.String r4 = "AutoTestChecker: isNearByDevSigned=%b"
            r0.a((java.lang.String) r4, (java.lang.Object) r3)
            if (r5 == 0) goto L_0x0124
            goto L_0x00b8
        L_0x0087:
            jjg r1 = defpackage.mte.a
            anie r1 = r1.c()
            anih r1 = (defpackage.anih) r1
            r2 = 44
            anie r0 = r1.a((java.lang.String) r4, (java.lang.String) r3, (int) r2, (java.lang.String) r0)
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "AutoTestChecker: Auto test should only have one signature!"
            r0.a((java.lang.String) r1)
            goto L_0x0124
        L_0x009e:
            r1 = move-exception
            jjg r2 = defpackage.mte.a
            anie r2 = r2.c()
            anih r2 = (defpackage.anih) r2
            r2.a((java.lang.Throwable) r1)
            r1 = 39
            anie r0 = r2.a((java.lang.String) r4, (java.lang.String) r3, (int) r1, (java.lang.String) r0)
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "AutoTestChecker: Auto test package not found!"
            r0.a((java.lang.String) r1)
            goto L_0x0124
        L_0x00b8:
            com.google.android.chimera.config.ModuleManager$ModuleInfo r0 = defpackage.jil.c(r8)
            if (r0 == 0) goto L_0x00c3
            com.google.android.chimera.config.ModuleManager$ModuleApkInfo r0 = r0.moduleApk
            java.lang.String r0 = r0.apkPackageName
            goto L_0x00c7
        L_0x00c3:
            java.lang.String r0 = r8.getPackageName()
        L_0x00c7:
            arwt r3 = new arwt
            r3.<init>(r8, r0)
            r8.a = r3
            java.lang.String r0 = "AutoTestUiInjector"
            java.lang.String r4 = "init called"
            android.util.Log.w(r0, r4)
            java.lang.ref.WeakReference r4 = r3.a
            java.lang.Object r4 = r4.get()
            android.content.Context r4 = (android.content.Context) r4
            if (r4 != 0) goto L_0x00e5
            java.lang.String r1 = "Error! init failed because context is null!"
            android.util.Log.w(r0, r1)
            goto L_0x0124
        L_0x00e5:
            aryh r5 = r3.d
            if (r5 == 0) goto L_0x010d
            aryi r6 = r3.c     // Catch:{ RemoteException -> 0x00ef }
            r5.a(r6)     // Catch:{ RemoteException -> 0x00ef }
            goto L_0x0124
        L_0x00ef:
            r5 = move-exception
            java.lang.String r5 = r5.getMessage()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = "Error! iAutoTestService.register meet exception! "
            int r7 = r5.length()
            if (r7 != 0) goto L_0x0106
            java.lang.String r5 = new java.lang.String
            r5.<init>(r6)
            goto L_0x010a
        L_0x0106:
            java.lang.String r5 = r6.concat(r5)
        L_0x010a:
            android.util.Log.w(r0, r5)
        L_0x010d:
            java.lang.String r5 = "Try to bind TestHandlerService"
            android.util.Log.w(r0, r5)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r5 = "com.google.location.nearby.common.fastpair.autotest.ACTION_BIND_FOR_UI_TEST"
            r0.<init>(r5)
            java.lang.String r5 = "com.google.location.nearby.apps.fastpair.autotest.TestHandlerService"
            r0.setClassName(r1, r5)
            android.content.ServiceConnection r1 = r3.b
            r4.bindService(r0, r1, r2)
        L_0x0124:
            android.content.Intent r0 = r8.getIntent()
            r1 = 0
            if (r0 == 0) goto L_0x0144
            java.lang.String r2 = r0.getAction()
            java.lang.String r3 = "com.google.android.gms.nearby.fastpair.GMSCORE_DEVICE_DETAILS"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0144
            java.lang.String r9 = "account_key"
            byte[] r9 = r0.getByteArrayExtra(r9)
            mta r1 = defpackage.mta.a((byte[]) r9)
            java.lang.String r9 = "fast_pair_device_details"
            goto L_0x014f
        L_0x0144:
            if (r9 != 0) goto L_0x014e
            mrt r1 = new mrt
            r1.<init>()
            java.lang.String r9 = "devices_list"
            goto L_0x014f
        L_0x014e:
            r9 = r1
        L_0x014f:
            if (r1 == 0) goto L_0x016a
            com.google.android.chimera.FragmentManager r0 = r8.getFragmentManager()
            com.google.android.chimera.FragmentTransaction r0 = r0.beginTransaction()
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            com.google.android.chimera.FragmentTransaction r9 = r0.replace(r2, r1, r9)
            r9.commit()
            arwt r9 = r8.a
            if (r9 == 0) goto L_0x016a
            r9.a(r1)
        L_0x016a:
            arxg r9 = new arxg
            r9.<init>(r8)
            r8.c = r9
            return
        L_0x0172:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mrm.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        arwt arwt = this.a;
        if (arwt != null) {
            Context context = (Context) arwt.a.get();
            if (context == null) {
                Log.w("AutoTestUiInjector", "Error! release failed because context is null!");
                return;
            }
            Log.w("AutoTestUiInjector", "release called");
            arwt.a();
            arwt.d = null;
            context.unbindService(arwt.b);
        }
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (!this.b) {
            setIntent(intent);
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.b) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (menuItem.getItemId() != R.id.action_debug_items) {
            return super.onOptionsItemSelected(menuItem);
        }
        menuItem.setChecked(!menuItem.isChecked());
        aryq aryq = aryq.a;
        menuItem.isChecked();
        arxg arxg = this.c;
        arxg.c().edit().putBoolean("nearby_debug_mode", menuItem.isChecked()).commit();
        startService(arza.b(this).setAction("com.google.android.gms.nearby.discovery:ACTION_DEBUG_CHANGE"));
        return true;
    }

    public final boolean onPrepareOptionsMenu(Menu menu) {
        if (this.b) {
            return super.onPrepareOptionsMenu(menu);
        }
        MenuItem findItem = menu.findItem(R.id.action_debug_items);
        if (Settings.Global.getInt(getContentResolver(), "development_settings_enabled", 0) != 0 || this.c.a()) {
            findItem.setChecked(this.c.a());
        } else {
            menu.removeItem(findItem.getItemId());
        }
        return super.onPrepareOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        if (!this.b) {
            int b2 = b(getIntent());
            if (b2 == 1) {
                mtd.a(this, asom.DEVICES_LIST_VIEW_LAUNCHED_FROM_NOTIFICATION);
            } else if (b2 != 2) {
                ((anih) ((anih) aryq.a.b()).a("mrm", "onStart", 147, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Invalid caller %d", b(getIntent()));
            } else {
                mtd.a(this, asom.DEVICES_LIST_VIEW_LAUNCHED_FROM_SETTINGS);
            }
        }
    }

    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getWindow().getDecorView().sendAccessibilityEvent(32);
    }
}
