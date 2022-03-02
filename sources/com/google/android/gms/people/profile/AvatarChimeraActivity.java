package com.google.android.gms.people.profile;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentActivity;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ActionTargetEntity;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AvatarChimeraActivity extends FragmentActivity implements ica, icb, xja {
    public DialogFragment a;
    public boolean b;
    public Uri c;
    public Uri d;
    public Uri e;
    public boolean f;
    private icc g;
    private String h;
    private int i = -1;
    private String j;
    private String k;
    private Uri l;
    private final icm m = new xis(this);
    private final icm n = new xit(this);
    private final icm o = new xiu(this);

    private final void g() {
        boolean z;
        if (this.c != null) {
            z = true;
        } else {
            z = false;
        }
        ibq ibq = wlt.a;
        icc icc = this.g;
        icc.b((idf) new xda(icc, this.j, this.k, this.e, z)).a(this.o);
        this.f = true;
        this.a = new xiw();
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add((Fragment) this.a, "progress_dialog");
        beginTransaction.commitAllowingStateLoss();
    }

    public final void a() {
        Uri a2 = xix.a(this, "camera-avatar.jpg");
        this.c = a2;
        if (a2 != null) {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.putExtra("output", this.c);
            int i2 = Build.VERSION.SDK_INT;
            intent.addFlags(1);
            intent.addFlags(2);
            try {
                startActivityForResult(intent, 1);
            } catch (ActivityNotFoundException e2) {
                Log.w("People.Avatar", "No activity to take photo");
            }
        } else {
            Log.w("People.Avatar", "Failed to create temp file to take photo");
            f();
            e();
        }
    }

    public final void a(int i2) {
    }

    public final void b() {
        this.d = Uri.EMPTY;
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        startActivityForResult(intent, 2);
    }

    public final void c() {
        e();
    }

    public final void d() {
        setResult(1);
        finish();
    }

    public final void e() {
        a(iau.c, "2");
        setResult(0);
        finish();
    }

    public final void f() {
        Toast.makeText(this, R.string.people_avatar_error, 0).show();
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    if (i3 == -1) {
                        this.e = (Uri) intent.getParcelableExtra("com.google.android.gms.people.profile.EXTRA_URI");
                        if (this.g.i()) {
                            g();
                            return;
                        }
                        return;
                    }
                    e();
                }
            } else if (i3 == -1) {
                Uri data = intent.getData();
                this.d = data;
                if (data == null || TextUtils.isEmpty(data.toString())) {
                    Log.w("People.Avatar", "Empty data returned from pick photo");
                    f();
                    e();
                    return;
                }
                Uri uri = this.d;
                if (uri == null || (!"http".equals(uri.getScheme()) && !"https".equals(uri.getScheme()))) {
                    a(this.d);
                    return;
                }
                this.l = this.d;
                this.d = null;
                if (this.g.i()) {
                    String uri2 = this.l.toString();
                    ibq ibq = wlt.a;
                    xdh.a(this.g, uri2).a(this.n);
                }
            } else {
                e();
            }
        } else if (i3 == -1) {
            a(this.c);
        } else {
            e();
        }
    }

    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        getWindow().getDecorView();
        if (!jgu.e(this)) {
            try {
                this.h = jhg.c((Activity) this);
                if (bundle != null) {
                    this.i = bundle.getInt("app_id", -1);
                    this.j = bundle.getString("account_name");
                    this.k = bundle.getString("page_gaia_id");
                    this.b = bundle.getBoolean("owner_loaded");
                    this.c = (Uri) bundle.getParcelable("take_photo_uri");
                    this.d = (Uri) bundle.getParcelable("pick_photo_uri");
                    this.l = (Uri) bundle.getParcelable("remote_pick_photo_uri");
                    this.e = (Uri) bundle.getParcelable("cropped_photo_uri");
                    this.f = bundle.getBoolean("result_pending");
                }
                if (this.j == null && this.k == null && (extras = getIntent().getExtras()) != null) {
                    this.j = extras.getString("com.google.android.gms.people.profile.EXTRA_ACCOUNT");
                    this.k = extras.getString("com.google.android.gms.people.profile.EXTRA_PAGE_ID");
                }
                if (TextUtils.isEmpty(this.j)) {
                    Log.e("People.Avatar", "Profile image account name is unspecified");
                    setResult(0);
                    finish();
                    return;
                }
                if (this.i == -1) {
                    Bundle extras2 = getIntent().getExtras();
                    if (extras2 != null) {
                        this.i = extras2.getInt("com.google.android.gms.people.profile.EXTRA_APP_ID", -1);
                    }
                    if (this.i == -1) {
                        int intValue = ((Integer) ycf.a.getOrDefault(this.h, -1)).intValue();
                        this.i = intValue;
                        if (intValue == -1) {
                            Log.e("People.Avatar", "EXTRA_SOCIAL_CLIENT_APP_ID must be set");
                            setResult(0);
                            finish();
                            return;
                        }
                    }
                }
                ibz ibz = new ibz(this);
                ibz.b = this.h;
                ibq ibq = wlt.a;
                wlr wlr = new wlr();
                wlr.a = this.i;
                ibz.a(ibq, (ibj) wlr.a());
                icc b2 = ibz.b();
                this.g = b2;
                b2.a((ica) this);
                this.g.a((icb) this);
                if (bundle == null) {
                    a(iau.a, "2");
                }
            } catch (SecurityException e2) {
                setResult(0);
                finish();
            }
        } else {
            Log.w("People.Avatar", "This activity is not available for restricted profile.");
            setResult(0);
            finish();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("app_id", this.i);
        bundle.putString("account_name", this.j);
        bundle.putString("page_gaia_id", this.k);
        bundle.putBoolean("owner_loaded", this.b);
        bundle.putParcelable("take_photo_uri", this.c);
        bundle.putParcelable("pick_photo_uri", this.d);
        bundle.putParcelable("remote_pick_photo_uri", this.l);
        bundle.putParcelable("cropped_photo_uri", this.e);
        bundle.putBoolean("result_pending", this.f);
    }

    public final void onStart() {
        super.onStart();
        if (!this.g.i() && !this.g.j()) {
            this.g.e();
        }
    }

    public final void onStop() {
        super.onStop();
        if (this.g.i() || this.g.j()) {
            this.g.g();
        }
    }

    public final void g(Bundle bundle) {
        if (!this.b) {
            ibq ibq = wlt.a;
            xco.a(this.g, this.j, this.k).a(this.m);
            return;
        }
        Uri uri = this.l;
        if (uri != null) {
            ibq ibq2 = wlt.a;
            xdh.a(this.g, uri.toString()).a(this.n);
        } else if ((this.c != null || this.d != null) && !this.f && this.e != null) {
            g();
        }
    }

    public final void a(Uri uri) {
        Intent className = new Intent().setClassName(this, "com.google.android.gms.people.profile.AvatarPreviewActivity");
        className.setAction("android.intent.action.VIEW");
        className.putExtra("com.google.android.gms.people.profile.EXTRA_ACCOUNT", this.j);
        className.putExtra("com.google.android.gms.people.profile.EXTRA_URI", uri);
        startActivityForResult(className, 3);
    }

    public final void a(ConnectionResult connectionResult) {
        f();
        d();
    }

    public final void a(FavaDiagnosticsEntity favaDiagnosticsEntity, String str) {
        izq izq = new izq((Context) this);
        izq.b(this.h);
        izq.c(ylj.b);
        izq.a(this.j);
        izq.a(favaDiagnosticsEntity);
        if (str != null) {
            zeo zeo = new zeo();
            zeo.b = str;
            zeo.c.add(62);
            izq.a((ActionTargetEntity) zeo.a());
        }
        izr.a(this, izq);
    }
}
