package com.google.android.places.ui.autocomplete;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.places.PlacesLoggingChimeraService;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AutocompleteChimeraActivity extends bjs {
    ibz a;
    ibz b;
    icc c;
    public SessionLogger d;
    public alcp e;
    public EditText f;
    public RecyclerView g;
    public View h;
    public View i;
    public TextView j;
    public Button k;
    public boolean l = false;
    public boolean m = false;
    public boolean n;
    private Handler o;
    private icc p;
    private ImageButton q;
    private boolean r = false;
    private icf s;
    private String t;

    public final void e() {
        this.d.h++;
        rlq c2 = this.e.getFilter();
        String obj = this.f.getText().toString();
        c2.publishResults(obj, c2.performFiltering(obj));
    }

    public final void f() {
        if (this.f.getText().toString().isEmpty()) {
            this.q.setVisibility(4);
        } else {
            this.q.setVisibility(0);
        }
    }

    public final void h() {
        this.o.removeCallbacksAndMessages((Object) null);
        this.h.setVisibility(8);
        this.g.setVisibility(0);
    }

    public final void i() {
        this.r = true;
        this.d.e = true;
        a(0, (rhq) null, Status.e);
    }

    public final void onBackPressed() {
        i();
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        String str;
        aoec aoec;
        this.o = new qvr(Looper.getMainLooper());
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("mode", -1);
        if (intExtra != 2) {
            setTheme(2132019296);
        }
        super.onCreate(bundle);
        StrictMode.allowThreadDiskReads();
        StrictMode.allowThreadDiskWrites();
        if (intExtra == 2) {
            setContentView((int) R.layout.place_autocomplete_main_overlay);
            findViewById(R.id.back_button).setOnClickListener(new alcc(this));
            View findViewById = findViewById(R.id.root);
            findViewById(R.id.content).setOnTouchListener(new alcd());
            findViewById.setOnTouchListener(new alce(this));
        } else {
            setContentView((int) R.layout.place_autocomplete_main_fullscreen);
            Toolbar toolbar = (Toolbar) findViewById(R.id.action_bar);
            findViewById(R.id.back_button).setVisibility(8);
            toolbar.d((int) R.drawable.ic_arrow_back_grey600_24dp);
            a(toolbar);
            toolbar.a((View.OnClickListener) new alcf(this));
            getWindow().setSoftInputMode(16);
        }
        this.f = (EditText) findViewById(R.id.edit_text);
        this.g = (RecyclerView) findViewById(R.id.list);
        this.h = findViewById(R.id.error);
        this.i = findViewById(R.id.place_autocomplete_error_progress);
        this.j = (TextView) findViewById(R.id.error_message);
        this.q = (ImageButton) findViewById(R.id.clear_button);
        this.k = (Button) findViewById(R.id.try_again);
        int i2 = 3;
        int i3 = 0;
        if (bundle == null || !bundle.containsKey("session")) {
            this.d = new SessionLogger();
            int intExtra2 = intent.getIntExtra("origin", -1);
            if (intExtra2 == 1) {
                aoec = aoec.ANDROID_AUTOCOMPLETE_FRAGMENT;
            } else if (intExtra2 == 2) {
                aoec = aoec.ANDROID_AUTOCOMPLETE_MANUAL_LAUNCHER;
            } else if (intExtra2 != 3) {
                aoec = aoec.UNKNOWN_ORIGIN;
            } else {
                aoec = aoec.ANDROID_PLACE_PICKER;
            }
            SessionLogger sessionLogger = this.d;
            if (aoec != null) {
                sessionLogger.a = aoec.j;
            } else {
                sessionLogger.a = 0;
            }
            if (intExtra == 2) {
                sessionLogger.b = 1;
            } else {
                sessionLogger.b = 2;
            }
            String obj = this.f.getText().toString();
            amrl.b(sessionLogger.k == null, (Object) "Input value must be initialized exactly once");
            sessionLogger.k = obj;
        } else {
            this.d = (SessionLogger) bundle.getParcelable("session");
        }
        Intent intent2 = getIntent();
        ComponentName b2 = jhg.b((Activity) this);
        if (b2 == null || b2.getPackageName() == null) {
            str = null;
        } else {
            str = b2.getPackageName();
            if (str.equals("com.google.android.gms") && intent2.hasExtra("forwarded_app")) {
                str = intent2.getStringExtra("forwarded_app");
            }
        }
        this.t = str;
        if (str == null) {
            if (Log.isLoggable("Places", 6)) {
                Log.e("Places", "Cannot find caller. Did you forget to use startActivityForResult?");
            }
            finish();
            return;
        }
        if (this.d.a() != aoec.ANDROID_PLACE_PICKER) {
            ibz ibz = new ibz(this);
            ibq ibq = rij.a;
            riq riq = new riq();
            riq.a = this.t;
            riq.c = 0;
            ibz.a(ibq, (ibj) riq.a());
            ibz.a(this, 1, (icb) null);
            this.b = ibz;
            this.c = ibz.b();
        } else {
            i2 = 1;
        }
        ibz ibz2 = new ibz(this);
        ibq ibq2 = rij.a;
        riq riq2 = new riq();
        riq2.a = this.t;
        riq2.c = i2;
        ibz2.a(ibq2, (ibj) riq2.a());
        ibz2.a(this, 0, (icb) null);
        ibz2.a((ica) new alcg(this));
        this.a = ibz2;
        if (intent.hasExtra("account_name")) {
            this.a.a(intent.getStringExtra("account_name"));
        }
        this.p = this.a.b();
        if (bundle != null) {
            this.n = bundle.getBoolean("api_key_verified");
        }
        alcp alcp = new alcp(this.p);
        this.e = alcp;
        alcp.a.e = (LatLngBounds) intent.getParcelableExtra("bounds");
        this.e.a.f = (AutocompleteFilter) intent.getParcelableExtra("filter");
        this.e.a.h = new alch(this);
        try {
            act.class.getDeclaredMethod("e", new Class[0]);
            this.g.setLayoutManager(new abk(1));
        } catch (NoSuchMethodException e2) {
            this.g.setLayoutManager(new alcm());
        }
        int i4 = Build.VERSION.SDK_INT;
        this.g.setItemAnimator(new alcr(getResources()));
        this.g.addOnScrollListener(new alci(this));
        this.e.a.g = new alcj(this);
        this.f.setText(intent.getStringExtra("initial_query"));
        if (this.d.a() == aoec.ANDROID_PLACE_PICKER) {
            this.f.post(new alck(this));
        }
        EditText editText = this.f;
        editText.setSelection(editText.getText().length());
        this.f.addTextChangedListener(new albw(this));
        this.f.setOnEditorActionListener(new albx(this));
        this.q.setOnClickListener(new alby(this));
        this.h.setOnClickListener(new albz(this));
        this.k.setOnClickListener(new alca(this));
        this.g.setAdapter(this.e);
        h();
        f();
        if (intExtra == 1) {
            int intExtra3 = intent.getIntExtra("primary_color", 0);
            int intExtra4 = intent.getIntExtra("primary_color_dark", 0);
            if (Color.alpha(intExtra3) >= 255) {
                i3 = intExtra3;
            }
            if (i3 != 0 && intExtra4 != 0) {
                int a2 = akyq.a(i3, getResources().getColor(R.color.text_white_alpha_87), getResources().getColor(R.color.text_black_alpha_87));
                int a3 = akyq.a(i3, getResources().getColor(R.color.text_white_alpha_26), getResources().getColor(R.color.text_black_alpha_26));
                akyp.a(this, i3, intExtra4, a2);
                this.f.setTextColor(a2);
                this.f.setHintTextColor(a3);
                Drawable drawable = this.q.getDrawable();
                akyp.a(drawable, a2);
                this.q.setImageDrawable(drawable);
            }
        } else if (intExtra == 2) {
            int i5 = Build.VERSION.SDK_INT;
            getWindow().addFlags(67108864);
            View findViewById2 = findViewById(R.id.root);
            findViewById2.setPadding(findViewById2.getPaddingLeft(), findViewById2.getPaddingTop() + jgv.a(getContainerActivity()), findViewById2.getPaddingRight(), findViewById2.getPaddingBottom());
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        if (super.isFinishing()) {
            if (!this.r && !this.m) {
                this.d.f = true;
            }
            SessionLogger sessionLogger = this.d;
            PlacesParams placesParams = new PlacesParams(this.t, Locale.getDefault(), (String) null);
            Context applicationContext = getApplicationContext();
            if (sessionLogger.c) {
                Log.wtf("Places", "Already logged");
            } else {
                aucd o2 = aoed.q.o();
                aoec a2 = sessionLogger.a();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aoed aoed = (aoed) o2.b;
                aoed.b = a2.j;
                aoed.a |= 1;
                int a3 = aoea.a(sessionLogger.b);
                if (a3 != 0) {
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    aoed aoed2 = (aoed) o2.b;
                    aoed2.c = a3;
                    aoed2.a |= 2;
                }
                boolean z = sessionLogger.d;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aoed aoed3 = (aoed) o2.b;
                int i2 = aoed3.a | 4;
                aoed3.a = i2;
                aoed3.d = z;
                boolean z2 = sessionLogger.e;
                int i3 = i2 | 8;
                aoed3.a = i3;
                aoed3.e = z2;
                boolean z3 = sessionLogger.f;
                int i4 = i3 | 16;
                aoed3.a = i4;
                aoed3.f = z3;
                int i5 = sessionLogger.g;
                int i6 = i4 | 32;
                aoed3.a = i6;
                aoed3.g = i5;
                int i7 = sessionLogger.h;
                int i8 = i6 | 64;
                aoed3.a = i8;
                aoed3.h = i7;
                int i9 = sessionLogger.i;
                int i10 = i8 | 128;
                aoed3.a = i10;
                aoed3.i = i9;
                int i11 = sessionLogger.j;
                aoed3.a = i10 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                aoed3.j = i11;
                int length = sessionLogger.k.length();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aoed aoed4 = (aoed) o2.b;
                int i12 = aoed4.a | 512;
                aoed4.a = i12;
                aoed4.k = length;
                int i13 = sessionLogger.l;
                int i14 = i12 | 1024;
                aoed4.a = i14;
                aoed4.l = i13;
                int i15 = sessionLogger.m;
                int i16 = i14 | 2048;
                aoed4.a = i16;
                aoed4.m = i15;
                boolean z4 = sessionLogger.n;
                int i17 = i16 | FragmentTransaction.TRANSIT_ENTER_MASK;
                aoed4.a = i17;
                aoed4.n = z4;
                int i18 = sessionLogger.o;
                aoed4.a = i17 | FragmentTransaction.TRANSIT_EXIT_MASK;
                aoed4.o = i18;
                int b2 = (int) azcc.b();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aoed aoed5 = (aoed) o2.b;
                aoed5.a |= 16384;
                aoed5.p = b2;
                aoed aoed6 = (aoed) o2.i();
                aoei c2 = akig.c(10, placesParams);
                aucd aucd = (aucd) c2.c(5);
                aucd.a((aucj) c2);
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                aoei aoei = (aoei) aucd.b;
                aoei aoei2 = aoei.w;
                aoed6.getClass();
                aoei.q = aoed6;
                aoei.a |= 16384;
                PlacesLoggingChimeraService.a(applicationContext, (aoei) aucd.i());
                sessionLogger.c = true;
            }
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        SessionLogger sessionLogger = this.d;
        if (!sessionLogger.b()) {
            Log.wtf("Places", "Already inactive!");
        } else {
            sessionLogger.o += (int) (SystemClock.elapsedRealtime() - sessionLogger.p);
            sessionLogger.p = -1;
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        SessionLogger sessionLogger = this.d;
        if (sessionLogger.b()) {
            Log.wtf("Places", "Already active!");
        } else {
            sessionLogger.p = SystemClock.elapsedRealtime();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("session", this.d);
        bundle.putBoolean("api_key_verified", this.n);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        if (this.c != null && !this.n) {
            icf icf = this.s;
            if (icf != null) {
                icf.b();
            }
            ibq ibq = rij.a;
            icc icc = this.c;
            idf a2 = icc.a((idf) new rjf(rij.a, icc));
            this.s = a2;
            a2.a(new alcl(this), azcc.d(), TimeUnit.MILLISECONDS);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.google.android.gms.common.internal.safeparcel.SafeParcelable, rhq] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r3, defpackage.rhq r4, com.google.android.gms.common.api.Status r5) {
        /*
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            if (r4 == 0) goto L_0x000c
            java.lang.String r1 = "selected_place"
            defpackage.ivy.a((com.google.android.gms.common.internal.safeparcel.SafeParcelable) r4, (android.content.Intent) r0, (java.lang.String) r1)
        L_0x000c:
            java.lang.String r4 = "status"
            defpackage.ivy.a((com.google.android.gms.common.internal.safeparcel.SafeParcelable) r5, (android.content.Intent) r0, (java.lang.String) r4)
            r2.setResult(r3, r0)
            r2.supportFinishAfterTransition()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.places.ui.autocomplete.AutocompleteChimeraActivity.a(int, rhq, com.google.android.gms.common.api.Status):void");
    }

    public final void a(String str, boolean z) {
        this.o.removeCallbacksAndMessages((Object) null);
        this.o.postDelayed(new alcb(this, str, z), azcc.a.a().c());
    }
}
