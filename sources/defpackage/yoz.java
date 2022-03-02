package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.people.model.AccountMetadata;
import com.google.android.gms.plus.audience.AudienceSelectionScrollView;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientActionDataEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: yoz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class yoz extends yqb implements LoaderManager.LoaderCallbacks, View.OnClickListener, ypc {
    public String a;
    public String b;
    public String c;
    public String d;
    public boolean e;
    public yqd f;
    private boolean w;
    private String x;
    private boolean y;

    private final void a(Status status) {
        if (!this.w) {
            try {
                status.a(getContainerActivity(), 0);
                this.w = true;
            } catch (IntentSender.SendIntentException e2) {
                getSupportLoaderManager().restartLoader(0, (Bundle) null, this);
            }
        }
    }

    private final void c(Intent intent) {
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("audienceSelectionList");
        ypk a2 = a(intent, findFragmentByTag);
        if (a2 != findFragmentByTag) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, a2, "audienceSelectionList").commit();
        }
    }

    private final boolean r() {
        return !getPackageName().equals(this.c);
    }

    /* access modifiers changed from: protected */
    public abstract ypk a(Intent intent, Fragment fragment);

    /* access modifiers changed from: protected */
    public void a(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    public void a(xaa xaa) {
    }

    /* access modifiers changed from: protected */
    public final void b(Intent intent) {
        a(-1, intent);
    }

    /* access modifiers changed from: protected */
    public abstract int e();

    /* access modifiers changed from: protected */
    public void f() {
        b(j().a);
    }

    /* access modifiers changed from: protected */
    public void h() {
        a(0, (Intent) null);
    }

    /* access modifiers changed from: protected */
    public abstract FavaDiagnosticsEntity i();

    /* access modifiers changed from: protected */
    public iia j() {
        iia iia = new iia(new Intent());
        ArrayList arrayList = new ArrayList(iia.e(getIntent()));
        Audience audience = this.f.a;
        ArrayList arrayList2 = new ArrayList(audience.b);
        arrayList2.removeAll(arrayList);
        ArrayList arrayList3 = new ArrayList(arrayList);
        arrayList3.removeAll(audience.b);
        iia.b((List) arrayList);
        iia.a(arrayList2);
        iia.b(arrayList3);
        iia.a(audience.c);
        return iia;
    }

    /* access modifiers changed from: protected */
    public final void k() {
        a(0, (Intent) null);
    }

    /* access modifiers changed from: protected */
    public boolean l() {
        return true;
    }

    public final yqd m() {
        return this.f;
    }

    /* access modifiers changed from: protected */
    public final ClientActionDataEntity n() {
        return ian.a(new ArrayList(this.f.a.b), false, false);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 0 && i2 != -1) {
            this.y = true;
            h();
        }
    }

    public final void onBackPressed() {
        h();
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.ok) {
            f();
        } else if ((id == R.id.audience_selection_update_circle_view || id == R.id.audience_selection_checkbox || id == R.id.add_to_circles_top_blank_view || id == R.id.add_to_circles_left_blank_view || id == R.id.add_to_circles_right_blank_view) && this.n && c(-1)) {
            f();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        String str;
        int i;
        int i2;
        int i3;
        Intent intent = getIntent();
        if (intent.hasExtra("com.google.android.gms.common.acl.EXTRA_UPDATE_PERSON") || intent.hasExtra("com.google.android.gms.common.acl.EXTRA_UPDATE_PERSON_ID")) {
            str = iia.c(intent).e;
        } else {
            str = null;
        }
        boolean z = !TextUtils.isEmpty(str);
        iia.c(intent);
        String d2 = iia.d(intent);
        this.e = false;
        int i4 = 8;
        if (!getWindow().hasFeature(8)) {
            requestWindowFeature(1);
        } else if (!TextUtils.isEmpty(d2) && !z) {
            aE().c(true);
            this.e = true;
        } else {
            requestWindowFeature(1);
        }
        super.onCreate(bundle);
        if (!jgu.e(this)) {
            try {
                this.c = jhg.c((Activity) this);
                this.a = intent.getStringExtra("com.google.android.gms.common.acl.EXTRA_ACCOUNT_NAME");
                this.b = intent.getStringExtra("com.google.android.gms.common.acl.EXTRA_PLUS_PAGE_ID");
                this.d = iia.b(intent);
                this.x = intent.getStringExtra("OK_TEXT");
                if (TextUtils.isEmpty(this.d)) {
                    this.d = "80";
                }
                if (TextUtils.isEmpty(this.a)) {
                    Log.e("AudienceSelectionActivi", "Account name must not be empty.");
                    k();
                    return;
                }
                if (bundle == null && r()) {
                    a(ibb.a, i());
                }
                Intent intent2 = getIntent();
                this.n = false;
                if (z) {
                    this.p = 0;
                    this.l = false;
                    this.m = false;
                    overridePendingTransition(0, 0);
                    setContentView((int) R.layout.plus_add_to_circles_activity);
                    this.g = (AudienceSelectionScrollView) findViewById(R.id.audience_selection_container_view);
                    AudienceSelectionScrollView audienceSelectionScrollView = this.g;
                    audienceSelectionScrollView.a = this;
                    audienceSelectionScrollView.b = this;
                    if (this.o) {
                        i4 = 0;
                    }
                    audienceSelectionScrollView.setVisibility(i4);
                    this.t = getResources().getInteger(R.integer.maximum_showing_circles);
                    this.j = (int) (getResources().getDimension(R.dimen.plus_add_to_circles_header_height) + getResources().getDimension(R.dimen.plus_add_to_circles_header_divider));
                    this.k = (FrameLayout) findViewById(R.id.add_to_circles_top_blank_view);
                    android.app.Activity containerActivity = getContainerActivity();
                    Resources resources = containerActivity.getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                    int identifier2 = resources.getIdentifier("navigation_bar_height_landscape", "dimen", "android");
                    boolean hasPermanentMenuKey = ViewConfiguration.get(containerActivity).hasPermanentMenuKey();
                    if (identifier <= 0) {
                        i = 0;
                    } else {
                        i = !hasPermanentMenuKey ? resources.getDimensionPixelSize(identifier) : 0;
                    }
                    if (identifier2 <= 0) {
                        i2 = 0;
                    } else {
                        i2 = !hasPermanentMenuKey ? resources.getDimensionPixelSize(identifier2) : 0;
                    }
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    Display defaultDisplay = ((WindowManager) containerActivity.getSystemService("window")).getDefaultDisplay();
                    int i5 = Build.VERSION.SDK_INT;
                    defaultDisplay.getRealMetrics(displayMetrics);
                    int i6 = displayMetrics.widthPixels;
                    int i7 = displayMetrics.heightPixels;
                    if (i6 > i7 && i2 == i) {
                        i3 = i7 - jgv.a(containerActivity);
                    } else {
                        i3 = (i7 - i) - jgv.a(containerActivity);
                    }
                    this.k.setLayoutParams(new LinearLayout.LayoutParams(-1, i3));
                    this.k.setOnClickListener(this);
                    View findViewById = findViewById(R.id.add_to_circles_left_blank_view);
                    findViewById.setOnClickListener(this);
                    View findViewById2 = findViewById(R.id.add_to_circles_right_blank_view);
                    findViewById2.setOnClickListener(this);
                    qb.b((View) this.k, 2);
                    qb.b(findViewById, 2);
                    qb.b(findViewById2, 2);
                    this.h = (FrameLayout) findViewById(R.id.fragment_container);
                    String string = getResources().getString(R.string.plus_add_to_circles_title_default);
                    String d3 = iia.d(intent2);
                    if (TextUtils.isEmpty(d3)) {
                        String str2 = iia.c(intent2).f;
                        if (!TextUtils.isEmpty(str2)) {
                            string = getResources().getString(R.string.plus_add_to_circles_title_with_user_name, new Object[]{str2});
                        }
                    } else {
                        string = d3;
                    }
                    int a2 = iia.a(intent2, getResources().getColor(R.color.plus_add_to_circles_header_text));
                    TextView textView = (TextView) findViewById(R.id.add_to_circles_title);
                    textView.setText(string);
                    textView.setTextColor(yqb.d(a2));
                    int b2 = iia.b(intent2, getResources().getColor(R.color.plus_add_to_circles_header_grey));
                    GradientDrawable gradientDrawable = (GradientDrawable) ((LinearLayout) findViewById(R.id.add_to_circles_header)).getBackground();
                    if (gradientDrawable != null) {
                        gradientDrawable.setColor(yqb.d(b2));
                    }
                    this.r = 0;
                    this.q = 0;
                    this.u = false;
                    super.p();
                    this.n = true;
                } else {
                    setContentView((int) R.layout.plus_audience_selection_activity);
                    if (this.e) {
                        findViewById(R.id.plus_auth_title).setVisibility(8);
                    }
                    jgv.a(getContainerActivity(), 0.67d);
                    Button button = (Button) findViewById(R.id.ok);
                    button.setOnClickListener(this);
                    if (!TextUtils.isEmpty(this.x)) {
                        button.setText(this.x);
                    }
                }
                if (bundle == null) {
                    this.w = false;
                    iww iww = new iww();
                    iww.a((Collection) iia.e(getIntent()));
                    iww.a(iia.i(getIntent()));
                    this.f = new yqd(iww.a());
                } else {
                    this.w = bundle.getBoolean("resolvingError", false);
                    this.f = new yqd((Audience) bundle.getParcelable("audience"));
                }
                c(intent);
                if (!TextUtils.isEmpty(d2)) {
                    setTitle((CharSequence) d2);
                } else if (this.e) {
                    setTitle(e());
                }
                getSupportLoaderManager().initLoader(0, (Bundle) null, this);
                a(bundle);
            } catch (SecurityException e2) {
                k();
            }
        } else {
            Log.w("AudienceSelectionActivi", "This activity is not available for restricted profile.");
            k();
        }
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        if (i == 0) {
            return new yri(this, this.a, this.b, this.d, this.c);
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append("Unknown loader ID: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void onLoaderReset(Loader loader) {
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        super.onPostResume();
        if (this.w && !this.y) {
            getSupportLoaderManager().restartLoader(0, (Bundle) null, this);
            c(getIntent());
            this.w = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("audience", this.f.a);
        bundle.putBoolean("resolvingError", this.w);
    }

    public final void setTitle(int i) {
        setTitle((CharSequence) getString(i));
    }

    public final void setTitle(CharSequence charSequence) {
        if (this.n) {
            return;
        }
        if (this.e) {
            aE().a(charSequence);
        } else {
            super.setTitle(charSequence);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(int i, Intent intent) {
        if (!TextUtils.isEmpty(this.a) && r()) {
            a(i(), ibb.a);
        }
        setResult(i, intent);
        finish();
    }

    /* renamed from: a */
    public void onLoadFinished(Loader loader, xfh xfh) {
        AccountMetadata accountMetadata;
        if (loader.getId() == 0) {
            Status status = ((yri) loader).f;
            if (status.c() && xfh != null && xfh.a() == 1) {
                xaa b2 = xfh.a(0);
                if (l() && b2.j() == null) {
                    Bundle bundle = (Bundle) b2.a.f.getParcelable("account_metadata");
                    if (bundle != null) {
                        bundle.setClassLoader(b2.getClass().getClassLoader());
                        accountMetadata = (AccountMetadata) bundle.getParcelable(b2.c());
                    } else {
                        accountMetadata = null;
                    }
                    if (accountMetadata == null || !accountMetadata.a) {
                        if (!this.w) {
                            int myUid = Process.myUid();
                            String str = this.a;
                            yuf yuf = new yuf(this, new ClientContext(myUid, str, str, this.c, getPackageName()));
                            yuf.a = 1;
                            Intent a2 = yuf.a();
                            this.y = false;
                            startActivityForResult(a2, 0);
                            this.w = true;
                            return;
                        }
                        return;
                    }
                }
                a(b2);
            } else if (status.b()) {
                a(status);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(FavaDiagnosticsEntity favaDiagnosticsEntity, FavaDiagnosticsEntity favaDiagnosticsEntity2) {
        izr.a(this, this.a, favaDiagnosticsEntity, favaDiagnosticsEntity2, this.c);
    }

    /* access modifiers changed from: protected */
    public final void a(FavaDiagnosticsEntity favaDiagnosticsEntity, ClientActionDataEntity clientActionDataEntity) {
        izr.a(this, this.a, this.b, favaDiagnosticsEntity, i(), this.c, clientActionDataEntity);
    }
}
