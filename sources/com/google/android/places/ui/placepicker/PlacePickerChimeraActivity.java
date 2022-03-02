package com.google.android.places.ui.placepicker;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PlacePickerChimeraActivity extends bjs implements alet, alel {
    public boolean a;
    public icf b;
    private aleu c;
    private aldj d;
    private aldi e;
    private icf f;
    private int g;

    private final Bundle i() {
        Bundle extras = getIntent().getExtras();
        return extras == null ? new Bundle() : extras;
    }

    public final void a() {
        rep rep = new rep();
        LocationRequest a2 = LocationRequest.a();
        a2.c(100);
        rep.a(a2);
        LocationSettingsRequest a3 = rep.a();
        icc icc = e().c;
        this.b = icc.a((idf) new rgz(icc, a3));
        this.b.a(new alep(this), azcc.d(), TimeUnit.MILLISECONDS);
    }

    public final LocationRequestInternal b() {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.c(100);
        locationRequest.c(5000);
        locationRequest.b(16);
        LocationRequestInternal a2 = LocationRequestInternal.a("places_place_picker", locationRequest);
        if (i().getString("gcore_client_name") != null) {
            a2.a();
        }
        ComponentName b2 = jhg.b((Activity) this);
        if (b2 != null) {
            a2.a(Collections.singletonList(new ClientIdentity(jhg.i(this, b2.getPackageName()), b2.getPackageName())));
        }
        return a2;
    }

    public final aldi e() {
        if (this.e == null) {
            this.e = new aldi(this, jhg.a((Activity) this), i().getString("gcore_client_name"), i().getString("account_name"));
        }
        return this.e;
    }

    public final ales f() {
        return new ales(jhg.b((Activity) this), i());
    }

    public final aldh h() {
        return new aldh(this);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2) {
            setResult(i2, intent);
            finish();
        }
    }

    public final void onBackPressed() {
        aleu aleu = this.c;
        if (aleu != null) {
            aleu.b();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
        if (r2 != 3) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            super.onCreate(r10)
            android.content.ComponentName r0 = defpackage.jhg.b((com.google.android.chimera.Activity) r9)
            if (r0 == 0) goto L_0x014c
            java.lang.String r1 = r0.getPackageName()
            if (r1 != 0) goto L_0x0011
            goto L_0x014c
        L_0x0011:
            r1 = 0
            if (r10 == 0) goto L_0x0025
            java.lang.String r2 = "api_key_verified"
            boolean r2 = r10.getBoolean(r2)
            r9.a = r2
            java.lang.String r2 = "launch_mode"
            int r2 = r10.getInt(r2, r1)
            r9.g = r2
            goto L_0x0028
        L_0x0025:
            r9.g = r1
            r2 = 0
        L_0x0028:
            r3 = 3
            r4 = 1
            if (r2 != 0) goto L_0x0061
            java.lang.String r0 = r0.getPackageName()
            azcc r2 = defpackage.azcc.a
            azcd r2 = r2.a()
            java.lang.String r2 = r2.e()
            r5 = 44
            amsk r5 = defpackage.amsk.a((char) r5)
            java.lang.Iterable r2 = r5.a((java.lang.CharSequence) r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x0048:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x005e
            java.lang.Object r5 = r2.next()
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0048
            r9.g = r3
            goto L_0x011a
        L_0x005e:
            r9.g = r4
            goto L_0x0063
        L_0x0061:
            if (r2 == r3) goto L_0x011a
        L_0x0063:
            r10 = 2131624689(0x7f0e02f1, float:1.8876565E38)
            r9.setContentView((int) r10)
            alev r10 = new alev
            com.google.android.chimera.FragmentManager r0 = r9.getFragmentManager()
            r10.<init>(r0)
            com.google.android.chimera.FragmentManager r0 = r10.a
            java.lang.String r2 = "state_controller_fragment"
            com.google.android.chimera.Fragment r0 = r0.findFragmentByTag(r2)
            aleu r0 = (defpackage.aleu) r0
            if (r0 != 0) goto L_0x0094
            aleu r0 = new aleu
            r0.<init>()
            r0.setRetainInstance(r4)
            com.google.android.chimera.FragmentManager r10 = r10.a
            com.google.android.chimera.FragmentTransaction r10 = r10.beginTransaction()
            com.google.android.chimera.FragmentTransaction r10 = r10.add((com.google.android.chimera.Fragment) r0, (java.lang.String) r2)
            r10.commit()
            goto L_0x0095
        L_0x0094:
        L_0x0095:
            r9.c = r0
            android.content.Intent r10 = r9.getIntent()
            java.lang.String r0 = "primary_color"
            boolean r2 = r10.hasExtra(r0)
            r3 = 0
            if (r2 == 0) goto L_0x00ad
            int r0 = r10.getIntExtra(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x00ae
        L_0x00ad:
            r0 = r3
        L_0x00ae:
            java.lang.String r2 = "primary_color_dark"
            boolean r5 = r10.hasExtra(r2)
            if (r5 == 0) goto L_0x00c0
            int r2 = r10.getIntExtra(r2, r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            goto L_0x00c1
        L_0x00c0:
        L_0x00c1:
            java.lang.String r2 = "hide_nearby_places"
            boolean r2 = r10.getBooleanExtra(r2, r1)
            if (r2 != 0) goto L_0x00cb
            goto L_0x00cf
        L_0x00cb:
            aleu r2 = r9.c
            r2.c = r1
        L_0x00cf:
            java.lang.String r1 = "account_name"
            boolean r2 = r10.hasExtra(r1)
            if (r2 == 0) goto L_0x00e0
            java.lang.String r1 = r10.getStringExtra(r1)
            aleu r2 = r9.c
            r2.b = r1
        L_0x00e0:
            java.lang.String r1 = defpackage.jhg.a((com.google.android.chimera.Activity) r9)
            aleu r2 = r9.c
            java.lang.String r5 = "reference_marker_overlay_resource_id"
            r6 = -1
            int r5 = r10.getIntExtra(r5, r6)
            java.lang.String r7 = "reference_marker_overlay_width_meters"
            int r7 = r10.getIntExtra(r7, r6)
            java.lang.String r8 = "reference_marker_overlay_height_meters"
            int r10 = r10.getIntExtra(r8, r6)
            if (r5 != r6) goto L_0x00fc
            goto L_0x010a
        L_0x00fc:
            if (r7 == r6) goto L_0x010a
            if (r10 == r6) goto L_0x010a
            r2.f = r1
            r2.g = r4
            r2.h = r5
            r2.i = r7
            r2.j = r10
        L_0x010a:
            aleu r10 = r9.c
            r10.d = r0
            r10.e = r3
            r10.c()
            aleu r10 = r9.c
            r10.a = r9
            ibq r10 = defpackage.ren.a
            return
        L_0x011a:
            if (r10 != 0) goto L_0x014b
            android.content.Intent r10 = new android.content.Intent
            r10.<init>()
            java.lang.String r0 = "com.google.android.location.places.ui.autocomplete.AutocompleteActivity"
            r10.setClassName(r9, r0)
            android.content.Intent r0 = r9.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L_0x0133
            r10.putExtras(r0)
        L_0x0133:
            java.lang.String r0 = defpackage.jhg.a((com.google.android.chimera.Activity) r9)
            java.lang.String r1 = "forwarded_app"
            r10.putExtra(r1, r0)
            java.lang.String r0 = "origin"
            r10.putExtra(r0, r3)
            java.lang.String r0 = "mode"
            r10.putExtra(r0, r4)
            r0 = 2
            r9.startActivityForResult(r10, r0)
        L_0x014b:
            return
        L_0x014c:
            r10 = 6
            java.lang.String r0 = "Places"
            boolean r10 = android.util.Log.isLoggable(r0, r10)
            if (r10 == 0) goto L_0x015a
            java.lang.String r10 = "Cannot find caller. Did you forget to use startActivityForResult?"
            android.util.Log.e(r0, r10)
        L_0x015a:
            r9.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.places.ui.placepicker.PlacePickerChimeraActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        aleu aleu = this.c;
        if (aleu != null) {
            aleu.a = null;
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("api_key_verified", this.a);
        bundle.putInt("launch_mode", this.g);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        if (this.d == null) {
            e();
            ibq ibq = rij.a;
            this.d = new aldj(this);
        }
        if (!this.a) {
            icf icf = this.f;
            if (icf != null) {
                icf.b();
            }
            ibq ibq2 = rij.a;
            icc icc = e().b;
            idf a2 = icc.a((idf) new rje(rij.a, icc));
            this.f = a2;
            a2.a(new aleq(this), azcc.d(), TimeUnit.MILLISECONDS);
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        icf icf = this.b;
        if (icf != null) {
            icf.b();
            this.b = null;
        }
        super.onStop();
    }
}
