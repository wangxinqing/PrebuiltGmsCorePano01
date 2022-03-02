package com.google.android.gms.plus.apps;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ListAppsChimeraActivity extends bjs {
    private ymb a;
    private final ArrayList b = new ArrayList();
    private ymc c;

    private final void a(ymc ymc) {
        if (ymc.getTag() == "connected_apps") {
            findViewById(R.id.filters_spinner_view).setVisibility(0);
        } else {
            findViewById(R.id.filters_spinner_view).setVisibility(8);
        }
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.show(ymc);
        ymc ymc2 = this.c;
        if (!(ymc2 == null || ymc2 == ymc)) {
            beginTransaction.hide(ymc2);
        }
        beginTransaction.setTransition(0);
        beginTransaction.commit();
        ymc.a(aE());
        this.c = ymc;
    }

    public final boolean aF() {
        finish();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        if (i != 1) {
            if (i == 2) {
                this.a.b = i2;
            } else if (i != 3) {
                super.onActivityResult(i, i2, intent);
            } else if (i2 == -1) {
                String stringExtra2 = intent.getStringExtra("deleted_moment_id");
                ynu ynu = (ynu) getSupportFragmentManager().findFragmentByTag("activity_log");
                if (stringExtra2 != null && ynu != null) {
                    ynu.b.add(stringExtra2);
                    if (ynu.getListAdapter() != null) {
                        yno d = ynu.getListAdapter();
                        ArrayList arrayList = ((ynu) d.a).b;
                        Iterator it = d.b.iterator();
                        boolean z = false;
                        while (it.hasNext()) {
                            if (arrayList.contains(((zhg) it.next()).e())) {
                                it.remove();
                                z = true;
                            }
                        }
                        if (z) {
                            d.notifyDataSetChanged();
                        }
                    }
                }
            }
        } else if (i2 == -1 && (stringExtra = intent.getStringExtra("com.google.android.gms.plus.DISCONNECTED_APP_ID")) != null) {
            this.a.e.add(stringExtra);
            this.c.a(aE());
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r22) {
        /*
            r21 = this;
            r6 = r21
            r0 = r22
            super.onCreate(r22)
            boolean r1 = defpackage.jgu.e(r21)
            java.lang.String r2 = "AppSettings"
            r3 = 0
            if (r1 == 0) goto L_0x001c
            java.lang.String r0 = "This activity is not available for restricted profile."
            android.util.Log.w(r2, r0)
            r6.setResult(r3)
            r21.finish()
            return
        L_0x001c:
            android.content.Intent r1 = r21.getIntent()
            java.lang.String r4 = r1.getAction()
            java.lang.String r5 = "com.google.android.gms.plus.action.VIEW_ACTIVITY_LOG"
            boolean r4 = r5.equals(r4)
            java.lang.String r5 = "com.google.android.gms.extras.ACCOUNT_NAME"
            java.lang.String r5 = r1.getStringExtra(r5)
            java.lang.String r7 = "application"
            java.lang.String r8 = "com.google.android.gms.extras.APP_ID"
            if (r5 == 0) goto L_0x0037
            goto L_0x0059
        L_0x0037:
            if (r4 != 0) goto L_0x003a
            goto L_0x0047
        L_0x003a:
            boolean r9 = r1.hasExtra(r8)
            if (r9 != 0) goto L_0x004b
            boolean r9 = r1.hasExtra(r7)
            if (r9 != 0) goto L_0x004b
        L_0x0047:
            java.lang.String r5 = defpackage.ymb.b((android.content.Context) r21)
        L_0x004b:
            if (r5 != 0) goto L_0x0059
            java.lang.String r0 = "This activity is requires an account name."
            android.util.Log.w(r2, r0)
            r6.setResult(r3)
            r21.finish()
            return
        L_0x0059:
            r9 = 2131624730(0x7f0e031a, float:1.8876648E38)
            r6.setContentView((int) r9)
            r9 = 2131428083(0x7f0b02f3, float:1.84778E38)
            android.view.View r9 = r6.findViewById(r9)
            r10 = 8
            r9.setVisibility(r10)
            sg r9 = r21.aE()
            r10 = 20
            r11 = 28
            r9.a((int) r10, (int) r11)
            java.lang.String r9 = defpackage.jhg.a((com.google.android.chimera.Activity) r21)
            if (r9 != 0) goto L_0x0080
            java.lang.String r9 = r21.getPackageName()
        L_0x0080:
            com.google.android.chimera.FragmentManager r10 = r21.getSupportFragmentManager()
            java.lang.String r11 = "apps_util"
            com.google.android.chimera.Fragment r12 = r10.findFragmentByTag(r11)
            ymb r12 = (defpackage.ymb) r12
            r6.a = r12
            r13 = 1
            if (r12 != 0) goto L_0x00ba
            android.os.Bundle r12 = new android.os.Bundle
            r12.<init>()
            java.lang.String r14 = "account_name"
            r12.putString(r14, r5)
            java.lang.String r14 = "calling_package_name"
            r12.putString(r14, r9)
            ymb r14 = new ymb
            r14.<init>()
            r14.setArguments(r12)
            r6.a = r14
            r14.setRetainInstance(r13)
            com.google.android.chimera.FragmentTransaction r10 = r10.beginTransaction()
            ymb r12 = r6.a
            com.google.android.chimera.FragmentTransaction r10 = r10.add((com.google.android.chimera.Fragment) r12, (java.lang.String) r11)
            r10.commit()
        L_0x00ba:
            hya r10 = defpackage.hya.a((android.content.Context) r21)
            boolean r10 = r10.b((java.lang.String) r9)
            com.google.android.chimera.FragmentManager r11 = r21.getSupportFragmentManager()
            com.google.android.chimera.FragmentTransaction r12 = r11.beginTransaction()
            r12.setTransition(r3)
            android.content.Intent r14 = r21.getIntent()
            java.lang.String r8 = r14.getStringExtra(r8)
            android.os.Parcelable r7 = r14.getParcelableExtra(r7)
            com.google.android.gms.plus.internal.model.apps.ApplicationEntity r7 = (com.google.android.gms.plus.internal.model.apps.ApplicationEntity) r7
            java.lang.String r15 = "com.google.android.gms.extras.ALL_APPS"
            java.lang.String r13 = "activity_log"
            java.lang.String r3 = "connected_apps"
            r17 = 0
            if (r10 == 0) goto L_0x010a
            r18 = r5
            java.lang.String r5 = "com.google.android.gms.extras.COLLECTION_FILTER"
            java.lang.String r5 = r14.getStringExtra(r5)
            if (r8 != 0) goto L_0x00f0
            goto L_0x010e
        L_0x00f0:
            if (r5 == 0) goto L_0x010e
            r5 = 5
            boolean r5 = android.util.Log.isLoggable(r2, r5)
            if (r5 == 0) goto L_0x00fe
            java.lang.String r5 = "EXTRA_APP_ID and EXTRA_COLLECTION_FILTER filters for Activity Log are mutually exclusive."
            android.util.Log.w(r2, r5)
        L_0x00fe:
            r2 = 0
            r6.setResult(r2)
            r21.finish()
            r20 = r1
            goto L_0x01aa
        L_0x010a:
            r18 = r5
            r5 = r17
        L_0x010e:
            if (r4 != 0) goto L_0x0111
            goto L_0x0117
        L_0x0111:
            if (r8 != 0) goto L_0x0152
            if (r7 != 0) goto L_0x0152
            if (r5 != 0) goto L_0x0152
        L_0x0117:
            com.google.android.chimera.Fragment r19 = r11.findFragmentByTag(r3)
            ymc r19 = (defpackage.ymc) r19
            if (r19 != 0) goto L_0x0145
            java.lang.String r2 = "com.google.android.gms.extras.PRESELECTED_FILTER"
            r20 = r1
            r1 = -1
            int r2 = r14.getIntExtra(r2, r1)
            if (r2 != r1) goto L_0x0138
            r1 = 0
            boolean r2 = r14.getBooleanExtra(r15, r1)
            if (r2 == 0) goto L_0x0135
            r16 = 0
            goto L_0x013a
        L_0x0135:
            r16 = 1
            goto L_0x013a
        L_0x0138:
            r16 = r2
        L_0x013a:
            yml r1 = defpackage.yml.b((int) r16)
            r2 = 2131428347(0x7f0b03fb, float:1.8478336E38)
            r12.add(r2, r1, r3)
            goto L_0x0149
        L_0x0145:
            r20 = r1
            r1 = r19
        L_0x0149:
            r12.hide(r1)
            java.util.ArrayList r2 = r6.b
            r2.add(r1)
            goto L_0x0154
        L_0x0152:
            r20 = r1
        L_0x0154:
            com.google.android.chimera.Fragment r1 = r11.findFragmentByTag(r13)
            ymc r1 = (defpackage.ymc) r1
            if (r1 == 0) goto L_0x015e
            goto L_0x019f
        L_0x015e:
            if (r7 == 0) goto L_0x0161
            goto L_0x017c
        L_0x0161:
            if (r10 == 0) goto L_0x0170
            java.lang.String r1 = "com.google.android.gms.extras.APP_NAME"
            java.lang.String r1 = r14.getStringExtra(r1)
            java.lang.String r2 = "com.google.android.gms.extras.APP_ICON_URL"
            java.lang.String r2 = r14.getStringExtra(r2)
            goto L_0x0173
        L_0x0170:
            r1 = r17
            r2 = r1
        L_0x0173:
            if (r8 == 0) goto L_0x017b
            com.google.android.gms.plus.internal.model.apps.ApplicationEntity r7 = new com.google.android.gms.plus.internal.model.apps.ApplicationEntity
            r7.<init>(r1, r2, r8)
            goto L_0x017c
        L_0x017b:
        L_0x017c:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            if (r7 == 0) goto L_0x0189
            java.lang.String r2 = "app_filter"
            r1.putParcelable(r2, r7)
            goto L_0x0190
        L_0x0189:
            if (r5 == 0) goto L_0x0190
            java.lang.String r2 = "collection_filter"
            r1.putString(r2, r5)
        L_0x0190:
            ynu r2 = new ynu
            r2.<init>()
            r2.setArguments(r1)
            r1 = 2131428347(0x7f0b03fb, float:1.8478336E38)
            r12.add(r1, r2, r13)
            r1 = r2
        L_0x019f:
            r12.hide(r1)
            java.util.ArrayList r2 = r6.b
            r2.add(r1)
            r12.commit()
        L_0x01aa:
            if (r0 == 0) goto L_0x01b6
            java.lang.String r1 = "selected_page_tag"
            java.lang.String r13 = r0.getString(r1)
            r3 = r17
            r4 = r3
            goto L_0x01e6
        L_0x01b6:
            if (r4 == 0) goto L_0x01cd
            com.google.android.gms.common.server.FavaDiagnosticsEntity r0 = defpackage.ial.g
            java.lang.String r1 = r21.getPackageName()
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x01c9
            com.google.android.gms.common.server.FavaDiagnosticsEntity r1 = defpackage.ylj.b
            r4 = r0
            r3 = r1
            goto L_0x01e6
        L_0x01c9:
            r4 = r0
            r3 = r17
            goto L_0x01e6
        L_0x01cd:
            r0 = r20
            r1 = 0
            boolean r0 = r0.getBooleanExtra(r15, r1)
            if (r0 == 0) goto L_0x01df
            com.google.android.gms.common.server.FavaDiagnosticsEntity r0 = defpackage.ial.d
            com.google.android.gms.common.server.FavaDiagnosticsEntity r1 = defpackage.ial.j
            r4 = r1
            r13 = r3
            r3 = r0
            goto L_0x01e6
        L_0x01df:
            com.google.android.gms.common.server.FavaDiagnosticsEntity r0 = defpackage.ylj.a
            com.google.android.gms.common.server.FavaDiagnosticsEntity r1 = defpackage.ial.b
            r4 = r1
            r13 = r3
            r3 = r0
        L_0x01e6:
            java.util.ArrayList r0 = r6.b
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0222
            java.util.ArrayList r0 = r6.b
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            ymc r0 = (defpackage.ymc) r0
            java.util.ArrayList r2 = r6.b
            int r5 = r2.size()
        L_0x01fd:
            if (r1 >= r5) goto L_0x0212
            java.lang.Object r7 = r2.get(r1)
            ymc r7 = (defpackage.ymc) r7
            int r1 = r1 + 1
            java.lang.String r8 = r7.getTag()
            boolean r8 = r8.equals(r13)
            if (r8 == 0) goto L_0x01fd
            goto L_0x0213
        L_0x0212:
            r7 = r0
        L_0x0213:
            if (r3 == 0) goto L_0x021f
            com.google.android.gms.common.server.FavaDiagnosticsEntity r2 = defpackage.iak.e
            r0 = r21
            r1 = r18
            r5 = r9
            defpackage.izr.a((android.content.Context) r0, (java.lang.String) r1, (com.google.android.gms.common.server.FavaDiagnosticsEntity) r2, (com.google.android.gms.common.server.FavaDiagnosticsEntity) r3, (com.google.android.gms.common.server.FavaDiagnosticsEntity) r4, (java.lang.String) r5)
        L_0x021f:
            r6.a(r7)
        L_0x0222:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.plus.apps.ListAppsChimeraActivity.onCreate(android.os.Bundle):void");
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        this.c.onPrepareOptionsMenu(menu);
        for (int i = 0; i < this.b.size(); i++) {
            if (((ymc) this.b.get(i)) != this.c) {
                int i2 = Build.VERSION.SDK_INT;
            }
        }
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        ymb ymb = this.a;
        if (ymb == null) {
            return;
        }
        if (ymb.l.i() || ymb.l.j()) {
            ymb.l.g();
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() < this.b.size()) {
            ymc ymc = (ymc) this.b.get(menuItem.getItemId());
            ymc ymc2 = this.c;
            if (ymc != ymc2) {
                this.a.a(ymc2.c(), ymc.c());
                a(ymc);
                supportInvalidateOptionsMenu();
            }
            return true;
        } else if (this.c.onOptionsItemSelected(menuItem) || super.onOptionsItemSelected(menuItem)) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("selected_page_tag", this.c.getTag());
    }
}
