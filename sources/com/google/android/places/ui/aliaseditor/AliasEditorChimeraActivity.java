package com.google.android.places.ui.aliaseditor;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.maps.model.LatLng;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AliasEditorChimeraActivity extends bjs implements albl, alai, albu, akzs, akzt, akzq {
    public akzz a;
    public String b;
    public AlertDialog c;
    public albn d;
    public boolean e;
    public boolean f;
    public rhq g;
    public rhq h;
    private albm i;
    private ProgressDialog j;
    private AlertDialog k;
    private int l;
    private int m;
    private int n;
    private Bitmap o;
    private int p;
    private int q;
    private int r;
    private alai s;
    private alah t;

    private final void a(int i2) {
        String string = getString(i2);
        if (this.j == null) {
            ProgressDialog progressDialog = new ProgressDialog(this);
            this.j = progressDialog;
            progressDialog.setCancelable(false);
            this.j.setIndeterminate(true);
        }
        this.j.setMessage(string);
        this.j.show();
    }

    private final void a(albv albv) {
        albv.a = this;
        albv.b = this.a;
    }

    private final void b(String str) {
        if (Log.isLoggable("Places", 6)) {
            Log.e("Places", str);
        }
        setResult(2);
        finish();
    }

    private final void c(String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("edited_alias_name", this.b);
        intent.putExtra("edited_alias_address", str2);
        intent.putExtra("edited_alias_place_id", str);
        setResult(-1, intent);
        finish();
    }

    public final void d() {
        runOnUiThread(new alaw(this));
    }

    public final void e() {
        int i2 = this.l;
        int i3 = this.m;
        rhq rhq = this.g;
        String str = null;
        if (!(rhq == null || rhq.q() == null)) {
            str = this.g.q().toString();
        }
        alal a2 = alal.a(i2, i3, str);
        a(a2, (alai) this);
        getSupportFragmentManager().beginTransaction().replace(R.id.content_area, a2, "search_fragment").addToBackStack("search_transaction").commit();
    }

    public final void f() {
        rhq rhq = this.g;
        String a2 = jhg.a((Activity) this);
        int i2 = this.p;
        int i3 = this.q;
        int i4 = this.r;
        int i5 = this.l;
        int i6 = this.m;
        int i7 = this.n;
        Bundle bundle = new Bundle();
        bundle.putParcelable("selected_place", (PlaceEntity) rhq);
        bundle.putString("calling_package", a2);
        bundle.putInt("overlay_resource_id", i2);
        bundle.putInt("overlay_width", i3);
        bundle.putInt("overlay_height", i4);
        bundle.putInt("primary_color", i5);
        bundle.putInt("primary_color_dark", i6);
        bundle.putInt("text_color", i7);
        albv albv = new albv();
        albv.setArguments(bundle);
        a(albv);
        this.s = albv;
        this.t = albv;
        getSupportFragmentManager().beginTransaction().replace(R.id.content_area, albv, "map_fragment").addToBackStack("map_transaction").commit();
    }

    public final void h() {
        a((int) R.string.alias_editor_deleting_alias);
        akzz akzz = this.a;
        String str = this.b;
        icf icf = akzz.m;
        if (icf != null) {
            icf.b();
        }
        ibq ibq = rij.a;
        icc icc = akzz.a;
        iva.a((Object) str, (Object) "alias == null");
        if (!str.equals("Home") && !str.equals("Work")) {
            iva.b(false, "subId == null when alias is not home or work");
        }
        akzz.m = icc.b((idf) new rjk(rij.a, icc, str));
        akzz.m.a(new akzp(akzz), azcc.d(), TimeUnit.MILLISECONDS);
    }

    public final void i() {
        onBackPressed();
    }

    public final void j() {
        int i2 = this.l;
        int i3 = this.m;
        rhq rhq = this.g;
        String str = null;
        if (!(rhq == null || rhq.q() == null)) {
            str = this.g.q().toString();
        }
        alal a2 = alal.a(i2, i3, str);
        a(a2, this.s, this.t);
        getSupportFragmentManager().beginTransaction().replace(R.id.content_area, a2, "map_search_fragment").addToBackStack("map_search_transaction").commit();
    }

    public final void k() {
        ProgressDialog progressDialog = this.j;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    public final void l() {
        getSupportFragmentManager().popBackStackImmediate();
        rhq rhq = this.g;
        if (rhq != null) {
            b(rhq);
        }
    }

    public final void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() <= 0) {
            rhq rhq = this.g;
            if (rhq != null) {
                c(rhq.a(), this.g.q().toString());
            } else {
                c((String) null, (String) null);
            }
        } else {
            l();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        int i2;
        super.onCreate(bundle);
        ComponentName b2 = jhg.b((Activity) this);
        if (b2 == null) {
            b("Cannot find caller. Did you forget to use startActivityForResult?");
        } else if (b2.getPackageName() == null) {
            b("Cannot find caller's package name.");
        } else {
            this.d = new albn(this, getIntent(), b2);
            try {
                akvn akvn = new akvn(1);
                akvn.a((Context) this, this.d.a);
                albn albn = this.d;
                akvn.a(albn.a, albn.d);
                albn albn2 = this.d;
                if (albn2.c == null) {
                    b("Cannot find user's account name.");
                    return;
                }
                String str = albn2.b;
                if (str == null) {
                    b("Cannot find alias name to be edited.");
                    return;
                }
                this.b = str;
                if (str.equals("Home") || this.b.equals("Work")) {
                    albn albn3 = this.d;
                    this.a = new akzz(this, albn3.a, albn3.c, new PlaceFilter(), this.d.d);
                    int i3 = this.d.h;
                    this.p = i3;
                    if (i3 > 0) {
                        try {
                            this.o = BitmapFactory.decodeResource(getPackageManager().getResourcesForApplication(b2.getPackageName()), this.p);
                            albn albn4 = this.d;
                            this.q = albn4.i;
                            this.r = albn4.j;
                        } catch (PackageManager.NameNotFoundException e2) {
                            if (Log.isLoggable("Places", 5)) {
                                Log.w("Places", String.format("Resources not found for %s, so map overlay is being ignored.", new Object[]{b2.getPackageName()}));
                            }
                        }
                    }
                    setContentView((int) R.layout.alias_editor_activity);
                    if (bundle == null) {
                        albn albn5 = this.d;
                        int i4 = albn5.e;
                        if (i4 == 0 && albn5.f == 0) {
                            akyp akyp = new akyp(b2, getPackageManager());
                            int color = getResources().getColor(R.color.places_ui_default_primary);
                            try {
                                color = akyp.a("primary");
                            } catch (akyo e3) {
                            }
                            this.l = color;
                            int color2 = getResources().getColor(R.color.places_ui_default_primary_dark);
                            try {
                                color2 = akyp.a("primary_dark");
                            } catch (akyo e4) {
                            }
                            this.m = color2;
                            i2 = akyq.a(this.l, getResources().getColor(R.color.text_white_alpha_87), getResources().getColor(R.color.text_black_alpha_87));
                            this.n = i2;
                        } else {
                            if (i4 == 0) {
                                i4 = getResources().getColor(R.color.places_ui_default_primary);
                            }
                            this.l = i4;
                            int i5 = this.d.f;
                            if (i5 == 0) {
                                i5 = getResources().getColor(R.color.places_ui_search_primary_dark);
                            }
                            this.m = i5;
                            i2 = this.d.g;
                            if (i2 == 0) {
                                i2 = getResources().getColor(R.color.places_ui_default_text);
                            }
                            this.n = i2;
                        }
                        String str2 = this.d.b;
                        int i6 = this.l;
                        int i7 = this.m;
                        albm albm = new albm();
                        Bundle bundle2 = new Bundle();
                        bundle2.putCharSequence("alias_name", str2);
                        bundle2.putInt("primary_color", i6);
                        bundle2.putInt("primary_color_dark", i7);
                        bundle2.putInt("text_color", i2);
                        albm.setArguments(bundle2);
                        this.i = albm;
                        getSupportFragmentManager().beginTransaction().add(R.id.content_area, this.i, "editor_fragment").commit();
                    } else {
                        this.l = bundle.getInt("primary_color");
                        this.m = bundle.getInt("primary_color_dark");
                        this.n = bundle.getInt("text_color");
                        this.g = PlaceEntity.a(bundle.getParcelable("aliased_place"), this);
                        this.h = PlaceEntity.a(bundle.getParcelable("pending_aliased_place"), this);
                        this.i = (albm) getSupportFragmentManager().findFragmentByTag("editor_fragment");
                        alal alal = (alal) getSupportFragmentManager().findFragmentByTag("search_fragment");
                        if (alal != null) {
                            a(alal, (alai) this);
                        }
                        albv albv = (albv) getSupportFragmentManager().findFragmentByTag("map_fragment");
                        if (albv != null) {
                            this.s = albv;
                            this.t = albv;
                            a(albv);
                        }
                        alal alal2 = (alal) getSupportFragmentManager().findFragmentByTag("map_search_fragment");
                        if (alal2 != null) {
                            alai alai = this.s;
                            alah alah = this.t;
                            if (alah == null) {
                                alah = new alat();
                            }
                            a(alal2, alai, alah);
                        }
                    }
                    if (this.g == null) {
                        this.e = false;
                        a((int) R.string.alias_editor_loading_alias);
                        this.a.b();
                        return;
                    }
                    this.e = true;
                    return;
                }
                b(String.format("The AliasEditor supports only %s and %s.", new Object[]{"Home", "Work"}));
            } catch (nja e5) {
                b(e5.getMessage());
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        k();
        AlertDialog alertDialog = this.c;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        AlertDialog alertDialog2 = this.k;
        if (alertDialog2 != null) {
            alertDialog2.dismiss();
        }
        super.onDestroy();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("primary_color", this.l);
        bundle.putInt("primary_color_dark", this.m);
        bundle.putInt("text_color", this.n);
        bundle.putParcelable("aliased_place", (PlaceEntity) this.g);
        bundle.putParcelable("pending_aliased_place", (PlaceEntity) this.h);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        this.i.a = this;
        akzz akzz = this.a;
        akzz.f = this;
        akzz.g = this;
        akzz.a.a((ica) new akzk(new alau(this)));
        akzz.a.e();
        this.f = true;
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        this.f = false;
        this.a.a.g();
        akzz akzz = this.a;
        akzz.g = null;
        akzz.f = null;
        this.i.a = null;
        super.onStop();
    }

    public final void c() {
        this.g = null;
        albm albm = this.i;
        if (albm != null) {
            albm.b.setText(albm.getString(R.string.alias_editor_default_address_format, albm.e));
            albm.c.a((rqs) new albj(albm));
        }
        k();
    }

    public final void b() {
        k();
        if (this.k == null) {
            this.k = new AlertDialog.Builder(this).setMessage(R.string.alias_editor_delete_failed).setPositiveButton(R.string.common_retry, new albb(this)).setNegativeButton(R.string.common_cancel, new alba(this)).setOnCancelListener(new alaz(this)).create();
        }
        this.k.show();
    }

    private final void a(alal alal, alai alai) {
        a(alal, alai, new alas());
    }

    private final void a(alal alal, alai alai, alah alah) {
        alal.e = alai;
        alal.g = this.a;
        alal.f = akyr.a((Context) this);
        alal.i = 6;
        alal.h = alah;
    }

    public final void a() {
        runOnUiThread(new alay(this));
    }

    public final void a(String str) {
        if (str != null) {
            akzz akzz = this.a;
            akzz.h = this;
            akzz.a(new String[]{str});
            return;
        }
        this.a.b();
    }

    public final void b(String str, String str2) {
        a((int) R.string.alias_editor_saving_alias);
        akzz akzz = this.a;
        String str3 = this.b;
        icf icf = akzz.l;
        if (icf != null) {
            icf.b();
        }
        ibq ibq = rij.a;
        icc icc = akzz.a;
        boolean z = true;
        if (str == null && str2 == null) {
            z = false;
        }
        iva.b(z, "placeId == null and address == null");
        iva.a((Object) str3, (Object) "alias == null");
        akzz.l = icc.b((idf) new rjj(rij.a, icc, str3, str, str2));
        akzz.l.a(new akzy(akzz, str, str2), azcc.d(), TimeUnit.MILLISECONDS);
    }

    public final void a(String str, String str2) {
        runOnUiThread(new alar(this, this, str, str2));
    }

    public final void a(Map map) {
        runOnUiThread(new alav(this, map));
    }

    public final void a(rhq rhq) {
        if (rhq != null) {
            this.h = rhq;
            b(rhq.a(), this.h.q().toString());
        }
    }

    public final void a(rhq[] rhqArr) {
        runOnUiThread(new alax(this, rhqArr));
    }

    public final void b(rhq rhq) {
        String str;
        iva.a("updateAlias must be called on the UI thread");
        if (this.f && this.i.d) {
            if (rhq.q() == null || rhq.q().equals("")) {
                str = rhq.d().toString();
            } else {
                str = rhq.q();
            }
            if (this.o != null) {
                albm albm = this.i;
                LatLng d2 = rhq.d();
                Bitmap bitmap = this.o;
                float f2 = (float) this.q;
                float f3 = (float) this.r;
                albm.c.a((rqs) new albh(albm, rls.a(d2, (double) Math.max(f2, f3)), d2, str, bitmap, f2, f3));
            } else if (rhq.f() != null) {
                albm albm2 = this.i;
                LatLng d3 = rhq.d();
                albm2.c.a((rqs) new albi(albm2, rhq.f(), d3, str));
            } else {
                albm albm3 = this.i;
                albm3.c.a((rqs) new albg(albm3, rhq.d(), str));
            }
        }
    }

    public final void b(rhq[] rhqArr) {
        rhq rhq = rhqArr[0];
        if (rhq != null) {
            this.h = rhq;
            b(rhq.a(), this.h.q().toString());
        }
    }
}
