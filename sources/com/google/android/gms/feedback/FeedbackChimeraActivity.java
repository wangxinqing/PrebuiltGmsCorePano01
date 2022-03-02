package com.google.android.gms.feedback;

import android.accounts.Account;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.Html;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.Pair;
import android.view.Display;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import com.google.android.gms.common.ui.URLSpanNoUnderline;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.feedback.Screenshot;
import com.google.android.material.card.MaterialCardView;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FeedbackChimeraActivity extends bjs implements MenuItem.OnMenuItemClickListener, mxt, mwa, ofu {
    public static mwg d;
    public static Bitmap e;
    public static List g;
    public static HelpConfig j;
    public static oab k;
    public static boolean l = false;
    public final aoru a = jfm.a(10);
    public mwb b;
    public boolean c = false;
    public Bitmap f;
    public String h;
    public boolean i = false;
    public myj m;
    public String n;
    private ServiceConnection o;
    private String p;

    public static void a(Bitmap bitmap) {
        mwg mwg = d;
        if (mwg != null) {
            e = bitmap;
            mwg.a(Screenshot.a(bitmap));
            return;
        }
        Log.w("gf_FeedbackActivity", "Session is null, not setting screenshot.");
    }

    public static boolean a(mwg mwg) {
        return d == mwg;
    }

    public static ErrorReport j() {
        mwg mwg = d;
        if (mwg != null) {
            return mwg.g();
        }
        return null;
    }

    public static boolean l() {
        return e.getHeight() > e.getWidth();
    }

    public static boolean m() {
        return e != null;
    }

    public final void b(int i2) {
        if (j() != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (j().ac == null) {
                j().ac = new Bundle();
            }
            long j2 = (long) i2;
            if (j().ac.getLong("max_char_count_delta") < j2) {
                j().ac.putLong("max_char_count_delta", j2);
            }
            if (j().ac.getLong("input_start_time") == 0) {
                j().ac.putLong("input_start_time", currentTimeMillis);
                j().ac.putLong("input_end_time", currentTimeMillis);
            }
            if (j().ac.getLong("input_end_time") != 0) {
                j().ac.putLong("input_end_time", currentTimeMillis);
            }
        }
    }

    public final void c(Intent intent) {
        String str;
        int i2;
        boolean z;
        int i3;
        Intent intent2 = intent;
        if (intent2 != null) {
            String stringExtra = intent2.getStringExtra("com.android.feedback.SAFEPARCELABLE_SESSION_ID");
            if (!(!TextUtils.isEmpty(stringExtra))) {
                if (d == null) {
                    d = a(intent2.getParcelableExtra("com.android.feedback.SCREENSHOT_EXTRA"), d(intent), intent2.hasExtra("ASYNC_PSD_START_TICK_NANOS") ? Long.valueOf(intent2.getLongExtra("ASYNC_PSD_START_TICK_NANOS", -1)) : null);
                }
                mwg mwg = d;
                if (mwg == null) {
                    Log.e("gf_FeedbackActivity", "onFragmentResume failed to create a session.");
                } else if (this.c) {
                    ErrorReport g2 = mwg.g();
                    Screenshot screenshot = d.b;
                    mwb mwb = this.b;
                    mxc mxc = (mxc) mwb;
                    ImageView imageView = (ImageView) mxc.a((int) R.id.gf_screenshot_icon);
                    ProgressBar progressBar = (ProgressBar) mxc.a((int) R.id.gf_progress_spinner);
                    TextView textView = (TextView) mxc.a((int) R.id.gf_edit_screenshot);
                    EditText editText = (EditText) mxc.a((int) R.id.gf_issue_description);
                    TextView textView2 = (TextView) mxc.a((int) R.id.gf_view_logs);
                    CheckBox checkBox = (CheckBox) mxc.a((int) R.id.gf_include_screenshot);
                    CheckBox checkBox2 = (CheckBox) mxc.a((int) R.id.gf_include_logs);
                    editText.setText(g2.b);
                    editText.setSelection(editText.getText().length());
                    String string = mwb.getString(R.string.common_view);
                    textView2.setLinksClickable(true);
                    textView2.setText(string);
                    checkBox.setChecked(!g2.W);
                    checkBox.setOnCheckedChangeListener(new mwt(mxc));
                    if (ofq.b(axhh.b())) {
                        mwj.a((View) checkBox);
                    }
                    checkBox2.setChecked(!g2.W);
                    checkBox2.setOnCheckedChangeListener(new mwu(mxc));
                    if (ofq.b(axhh.b())) {
                        mwj.a((View) checkBox2);
                    }
                    mxc.a((int) R.id.gf_system_info_card).setOnClickListener(new mwv(mxc));
                    mxc.a((int) R.id.gf_screenshot_card).setOnClickListener(new mww(mxc));
                    if (screenshot == null) {
                        imageView.setVisibility(8);
                        textView.setVisibility(8);
                    } else {
                        imageView.setMaxHeight(mwb.getResources().getDimensionPixelSize(R.dimen.gf_screenshot_preview_height));
                        imageView.setScaleType(ImageView.ScaleType.MATRIX);
                        progressBar.setVisibility(0);
                    }
                    Resources resources = mwb.getResources();
                    TextView textView3 = (TextView) mxc.a((int) R.id.gf_preview_text);
                    String string2 = resources.getString(R.string.gf_legal_request);
                    String string3 = resources.getString(R.string.common_system_info_composed_string);
                    String string4 = resources.getString(R.string.common_privacy_policy_composed_string);
                    String string5 = resources.getString(R.string.common_terms_of_service_composed_string);
                    Spannable a2 = URLSpanNoUnderline.a(Html.fromHtml(resources.getString(R.string.gf_policy, new Object[]{string2, string3, string4, string5})));
                    ofx.a(a2, string2, mxc.a(axgy.a.a().p()));
                    ofx.a(a2, string3, (ClickableSpan) new mwy(mxc));
                    ofx.a(a2, string4, (ClickableSpan) new mxa(mxc));
                    ofx.a(a2, string5, mxc.a(axgy.a.a().D()));
                    textView3.setLinksClickable(true);
                    textView3.setMovementMethod(LinkMovementMethod.getInstance());
                    textView3.setText(a2);
                    if (d != null) {
                        if (!ofq.b(axhn.a.a().b()) || (str = this.p) == null) {
                            str = this.h;
                        }
                        int length = d.a.length;
                        String[] strArr = new String[length];
                        if (TextUtils.isEmpty(str) || !str.toLowerCase(Locale.ENGLISH).equals("anonymous")) {
                            z = false;
                            i2 = 1;
                        } else {
                            z = true;
                            i2 = 0;
                        }
                        int i4 = 0;
                        for (String str2 : d.a) {
                            String string6 = getString(R.string.common_from);
                            StringBuilder sb = new StringBuilder(String.valueOf(string6).length() + 2 + String.valueOf(str2).length());
                            sb.append(string6);
                            sb.append("  ");
                            sb.append(str2);
                            strArr[i4] = sb.toString();
                            if (!z) {
                                if (str2.contains("google.com")) {
                                    i2 = i4;
                                }
                                if (!TextUtils.isEmpty(str) && TextUtils.equals(str2, str)) {
                                    i2 = i4;
                                    z = true;
                                }
                            }
                            i4++;
                        }
                        mwb mwb2 = this.b;
                        mxc mxc2 = (mxc) mwb2;
                        Spinner spinner = (Spinner) mxc2.a((int) R.id.gf_account_spinner);
                        ArrayAdapter arrayAdapter = new ArrayAdapter(mwb2.getActivity(), R.layout.gf_material_2_spinner, strArr);
                        if (!ofy.b()) {
                            i3 = 17367049;
                        } else {
                            i3 = R.layout.gf_account_spinner_dropdown_item;
                        }
                        arrayAdapter.setDropDownViewResource(i3);
                        spinner.setAdapter(arrayAdapter);
                        spinner.setOnItemSelectedListener(new mxb(mxc2));
                        if (length > 1) {
                            spinner.setSelection(i2);
                        }
                    }
                    if (TextUtils.isEmpty(g2.T)) {
                        a(screenshot, g2);
                    }
                    Bitmap bitmap = this.f;
                    if (bitmap != null) {
                        this.b.a(bitmap, k());
                    }
                    sg aE = aE();
                    String string7 = getString(R.string.gf_send_feedback);
                    String str3 = g2.a.packageName;
                    p();
                    a(aE, string7);
                    a(!d.f);
                    this.c = false;
                }
            } else {
                try {
                    Bitmap b2 = this.m.b(stringExtra);
                    a(false);
                    this.b.a(b2, true);
                    this.c = false;
                } catch (RemoteException e2) {
                    Log.e("gf_FeedbackActivity", e2.getMessage());
                }
            }
        } else {
            Log.e("gf_FeedbackActivity", "onFragmentResume called with null intent.");
            finish();
        }
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [android.os.Parcelable] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.feedback.ErrorReport d(android.content.Intent r4) {
        /*
            r3 = this;
            com.google.android.gms.feedback.ErrorReport r0 = new com.google.android.gms.feedback.ErrorReport
            r0.<init>()
            java.lang.String r1 = "android.intent.extra.BUG_REPORT"
            boolean r2 = r4.hasExtra(r1)
            if (r2 == 0) goto L_0x0015
            android.os.Parcelable r1 = r4.getParcelableExtra(r1)
            android.app.ApplicationErrorReport r1 = (android.app.ApplicationErrorReport) r1
            r0.a = r1
        L_0x0015:
            java.lang.String r1 = "com.android.feedback.SAFEPARCELABLE_REPORT"
            boolean r2 = r4.hasExtra(r1)
            if (r2 == 0) goto L_0x003a
            android.os.Parcelable r4 = r4.getParcelableExtra(r1)
            r0 = r4
            com.google.android.gms.feedback.ErrorReport r0 = (com.google.android.gms.feedback.ErrorReport) r0
            java.lang.String r4 = r0.B
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x003a
            java.lang.String r4 = r0.B
            r3.h = r4
            boolean r4 = r0.E
            if (r4 != 0) goto L_0x003a
            java.lang.String r4 = ""
            r0.B = r4
            goto L_0x003b
        L_0x003a:
        L_0x003b:
            com.google.android.gms.feedback.LogOptions r4 = r0.Z
            defpackage.mxu.i = r4
            java.lang.String r4 = r0.ag
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x004d
            java.lang.String r4 = defpackage.myo.b()
            r0.ag = r4
        L_0x004d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.feedback.FeedbackChimeraActivity.d(android.content.Intent):com.google.android.gms.feedback.ErrorReport");
    }

    public void dismiss(View view) {
        String str;
        ErrorReport j2 = j();
        if (j2 != null) {
            str = j2.b;
        } else {
            str = null;
        }
        a(45, j2, str, k.e);
        setResult(-1);
        finish();
    }

    public final FrameLayout e() {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(R.id.feedback_content);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    public final void f() {
        ThemeSettings themeSettings;
        int i2;
        Intent intent = new Intent();
        if (k()) {
            intent.setClassName(this, "com.google.android.gms.feedback.AnnotateScreenshotActivity");
            ErrorReport j2 = j();
            if (!(j2 == null || (themeSettings = j2.Y) == null || (i2 = themeSettings.b) == 0)) {
                if (themeSettings.a == 0 && i2 != 0) {
                    i2 = -1;
                }
                intent.putExtra("EXTRA_ACTION_BAR_COLOR_RES_ID", i2);
            }
        } else {
            intent.setClassName(this, "com.google.android.gms.feedback.PreviewScreenshotActivity");
        }
        startActivity(intent);
    }

    public final void h() {
        startActivity(new Intent().setClassName(this, "com.google.android.gms.feedback.PreviewActivity"));
    }

    public final void i() {
        mwg mwg = d;
        if (mwg != null) {
            mwg.c();
        }
        finish();
    }

    public final boolean k() {
        if (((AccessibilityManager) getSystemService("accessibility")).isEnabled() || !this.i || !axgy.a.a().a()) {
            return false;
        }
        return true;
    }

    public final String n() {
        mwb mwb = this.b;
        return mwb != null ? ((EditText) ((mxc) mwb).a((int) R.id.gf_issue_description)).getText().toString().trim() : "";
    }

    public final void o() {
        mwg mwg = d;
        if (mwg != null) {
            mwg.a();
        }
    }

    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 0 && i3 == -1) {
            finish();
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        supportInvalidateOptionsMenu();
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_action_bar, menu);
        menu.findItem(R.id.common_send).setIcon(ofx.a((Context) this, TextUtils.isEmpty(n()) ? ofy.b() ? ofy.a(this, R.attr.gf_disabledIconColor) : kf.b(this, R.color.google_grey500) : ofy.b() ? ofy.a(this, R.attr.gf_primaryBlueColor) : kf.b(this, R.color.google_blue600)));
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        mxu.g = null;
        e = null;
        l = false;
        g = null;
        d = null;
        if (this.m != null) {
            jca.a().a((Context) this, this.o);
        }
        super.onDestroy();
    }

    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            return super.onKeyDown(i2, keyEvent);
        }
        i();
        return true;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (!mwj.a(j())) {
            return false;
        }
        sr srVar = new sr(this);
        srVar.b((int) R.string.common_ok, (DialogInterface.OnClickListener) null);
        srVar.b((int) R.string.gf_invalid_description_text);
        srVar.b().show();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        if (!(d == null || intent == null)) {
            ErrorReport d2 = d(intent);
            ErrorReport g2 = d.g();
            if (d2 != null && g2 != null && !TextUtils.isEmpty(d2.R) && !TextUtils.isEmpty(g2.R) && TextUtils.equals(d2.R, g2.R)) {
                return;
            }
        }
        Long l2 = null;
        d = null;
        e = null;
        l = false;
        this.f = null;
        g = null;
        ErrorReport d3 = d(intent);
        super.onNewIntent(intent);
        if (d3.E) {
            if (intent.hasExtra("ASYNC_PSD_START_TICK_NANOS")) {
                l2 = Long.valueOf(intent.getLongExtra("ASYNC_PSD_START_TICK_NANOS", -1));
            }
            d = a(intent.getParcelableExtra("com.android.feedback.SCREENSHOT_EXTRA"), d3, l2);
            return;
        }
        b(intent);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        mwk mwk;
        if (!(!TextUtils.isEmpty(this.n))) {
            if (d != null) {
                int itemId = menuItem.getItemId();
                if (itemId == R.id.common_send) {
                    View findViewById = findViewById(R.id.gf_issue_description);
                    if (findViewById != null) {
                        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(findViewById.getWindowToken(), 0);
                    }
                    mwg mwg = d;
                    mwg.a();
                    FeedbackChimeraActivity feedbackChimeraActivity = mwg.c;
                    ErrorReport g2 = mwg.g();
                    if (axgy.a.a().i() && !g2.E) {
                        String str = g2.a.packageName;
                        String B = axgy.a.a().B();
                        int i2 = g2.a.type;
                        String G = axgy.a.a().G();
                        if (str != null && B != null && G != null) {
                            String[] a2 = ofx.a(B);
                            int length = a2.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= length) {
                                    break;
                                }
                                String str2 = a2[i3];
                                if (!str.startsWith(str2) || TextUtils.isEmpty(str2)) {
                                    i3++;
                                } else if (ofx.a(Integer.toString(i2), G) && jkf.a(feedbackChimeraActivity)) {
                                    j = mwj.a(g2, (Context) feedbackChimeraActivity);
                                    int i4 = mwk.a;
                                    try {
                                        mwk = new mwk(feedbackChimeraActivity, g2);
                                    } catch (Exception e2) {
                                        mwk = null;
                                    }
                                    if (mwk != null) {
                                        jhg.a((AsyncTask) mwk, (Object[]) new HelpConfig[]{j});
                                    }
                                }
                            }
                        }
                    }
                    mxj.a(g2, (Context) feedbackChimeraActivity);
                    feedbackChimeraActivity.a(g2, true);
                    return true;
                } else if (itemId != 16908332) {
                    return super.onOptionsItemSelected(menuItem);
                } else {
                    i();
                }
            }
            return true;
        }
        if (menuItem.getItemId() == R.id.common_send) {
            this.a.execute(new mvs(this));
        }
        return true;
    }

    public final boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem item = menu.getItem(0);
        if (!mwj.a(j()) || !TextUtils.isEmpty(n())) {
            return true;
        }
        item.setOnMenuItemClickListener(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        mwg mwg = d;
        if (mwg == null) {
            mwg mwg2 = new mwg(this, bundle);
            d = mwg2;
            this.c = true;
            mwg2.b();
            return;
        }
        mwg.a(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mwg mwg = d;
        if (mwg != null) {
            mwg.a();
            muv muv = mwg.g;
            if (!jkr.c()) {
                bundle.putParcelable("feedback.REPORT", muv.a);
                bundle.putParcelable("feedback.SCREENSHOT_KEY", muv.b.c);
            }
            bundle.putStringArray("feedback.RUNNING_APPS", muv.b.a);
            bundle.putBundle("feedback.PSD_BUNDLE_KEY", muv.b.d);
            bundle.putStringArray("feedback.PSBD_FILE_PATH_KEY", muv.b.e);
            bundle.putStringArray("feedback.FOUND_ACCOUNTS", mwg.a);
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        mwg mwg = d;
        if (mwg != null) {
            mwg.c();
        }
    }

    public void readMore(View view) {
        startActivityForResult(new Intent().setClassName(this, "com.google.android.gms.feedback.SuggestionsActivity"), 0);
    }

    public static void p() {
        int i2 = Build.VERSION.SDK_INT;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0107, code lost:
        if ((r5 - r6) <= 0) goto L_0x0109;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            java.lang.String r0 = "\\."
            java.lang.String r1 = ""
            java.lang.String r2 = "[^0-9\\.]"
            super.onCreate(r15)
            android.view.Window r15 = r14.getWindow()
            r3 = 34
            r15.setSoftInputMode(r3)
            android.content.Intent r15 = r14.getIntent()
            com.google.android.gms.feedback.ErrorReport r3 = r14.d(r15)
            boolean r4 = defpackage.ofy.a()
            java.lang.String r5 = "com.google"
            r6 = 2132019205(0x7f140805, float:1.9676738E38)
            r7 = 0
            r8 = 2132019210(0x7f14080a, float:1.9676748E38)
            if (r4 == 0) goto L_0x0044
            r4 = 2132019207(0x7f140807, float:1.9676742E38)
            defpackage.ofy.a((com.google.android.chimera.Activity) r14, (com.google.android.gms.feedback.ErrorReport) r3, (int) r8, (int) r6, (int) r4)
            java.lang.String r4 = r14.h
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x003f
            android.accounts.Account r4 = new android.accounts.Account
            java.lang.String r6 = r14.h
            r4.<init>(r6, r5)
            goto L_0x0040
        L_0x003f:
            r4 = r7
        L_0x0040:
            defpackage.myc.a(r14, r3, r4)
            goto L_0x0071
        L_0x0044:
            boolean r4 = defpackage.ofy.b()
            if (r4 == 0) goto L_0x006d
            boolean r4 = defpackage.ofy.a((com.google.android.gms.feedback.ErrorReport) r3)
            if (r4 == 0) goto L_0x0054
            r14.setTheme(r6)
            goto L_0x0058
        L_0x0054:
            r14.setTheme(r8)
        L_0x0058:
            java.lang.String r4 = r14.h
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0068
            android.accounts.Account r4 = new android.accounts.Account
            java.lang.String r6 = r14.h
            r4.<init>(r6, r5)
            goto L_0x0069
        L_0x0068:
            r4 = r7
        L_0x0069:
            defpackage.myc.a(r14, r3, r4)
            goto L_0x0071
        L_0x006d:
            r14.setTheme(r8)
        L_0x0071:
            r4 = 1
            defpackage.nzf.a(r14, r4)
            defpackage.mxu.g = r14
            boolean r5 = r3.E
            if (r5 == 0) goto L_0x0087
            java.lang.String r15 = "gf_FeedbackActivity"
            java.lang.String r0 = "Invalid request for feedback invocation. This action is not permitted"
            android.util.Log.e(r15, r0)
            r14.finish()
            return
        L_0x0087:
            android.widget.FrameLayout r5 = r14.e()
            r14.setContentView((android.view.View) r5)
            if (r3 == 0) goto L_0x0127
            android.app.ApplicationErrorReport r5 = r3.a
            java.lang.String r5 = r5.packageName
            axgy r6 = defpackage.axgy.a
            axgz r6 = r6.a()
            java.lang.String r6 = r6.F()
            java.lang.String r8 = java.lang.String.valueOf(r5)
            java.lang.String r9 = ":"
            java.lang.String r8 = r8.concat(r9)
            java.lang.String[] r6 = defpackage.ofx.a((java.lang.String) r6)
            int r9 = r6.length
            r10 = 0
            r11 = 0
        L_0x00af:
            if (r11 >= r9) goto L_0x00c5
            r12 = r6[r11]
            boolean r13 = r12.startsWith(r8)
            if (r13 == 0) goto L_0x00c2
            int r6 = r8.length()
            java.lang.String r7 = r12.substring(r6)
            goto L_0x00c6
        L_0x00c2:
            int r11 = r11 + 1
            goto L_0x00af
        L_0x00c5:
        L_0x00c6:
            if (r7 != 0) goto L_0x00c9
            goto L_0x0127
        L_0x00c9:
            android.content.pm.PackageManager r6 = r14.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0126 }
            android.content.pm.PackageInfo r5 = r6.getPackageInfo(r5, r10)     // Catch:{ NameNotFoundException -> 0x0126 }
            java.lang.String r5 = r5.versionName     // Catch:{ NameNotFoundException -> 0x0126 }
            java.lang.String r5 = r5.replaceAll(r2, r1)     // Catch:{ NameNotFoundException -> 0x0126 }
            java.lang.String r1 = r7.replaceAll(r2, r1)     // Catch:{ NameNotFoundException -> 0x0126 }
            java.lang.String[] r2 = r5.split(r0)     // Catch:{ NameNotFoundException -> 0x0126 }
            java.lang.String[] r0 = r1.split(r0)     // Catch:{ NameNotFoundException -> 0x0126 }
            r1 = 0
        L_0x00e4:
            int r5 = r2.length     // Catch:{ NameNotFoundException -> 0x0126 }
            int r6 = r0.length     // Catch:{ NameNotFoundException -> 0x0126 }
            int r7 = java.lang.Math.max(r5, r6)     // Catch:{ NameNotFoundException -> 0x0126 }
            if (r1 < r7) goto L_0x00ed
            goto L_0x0109
        L_0x00ed:
            if (r1 >= r5) goto L_0x00f6
            r5 = r2[r1]     // Catch:{ NameNotFoundException -> 0x0126 }
            int r5 = defpackage.myd.a(r5)     // Catch:{ NameNotFoundException -> 0x0126 }
            goto L_0x00f7
        L_0x00f6:
            r5 = 0
        L_0x00f7:
            if (r1 >= r6) goto L_0x0100
            r6 = r0[r1]     // Catch:{ NameNotFoundException -> 0x0126 }
            int r6 = defpackage.myd.a(r6)     // Catch:{ NameNotFoundException -> 0x0126 }
            goto L_0x0101
        L_0x0100:
            r6 = 0
        L_0x0101:
            if (r5 != r6) goto L_0x0106
            int r1 = r1 + 1
            goto L_0x00e4
        L_0x0106:
            int r5 = r5 - r6
            if (r5 > 0) goto L_0x0127
        L_0x0109:
            r0 = 119(0x77, float:1.67E-43)
            r14.a((int) r0, (com.google.android.gms.feedback.ErrorReport) r3)
            com.google.android.gms.feedback.ErrorReport r0 = r14.d(r15)
            mvt r1 = new mvt
            r1.<init>(r14, r0, r15)
            mya r15 = new mya
            r15.<init>(r1, r0)
            com.google.android.chimera.FragmentManager r0 = r14.getSupportFragmentManager()
            java.lang.String r1 = "UpgradeDialog"
            r15.show((com.google.android.chimera.FragmentManager) r0, (java.lang.String) r1)
            goto L_0x015c
        L_0x0126:
            r0 = move-exception
        L_0x0127:
            r0 = 8
            r14.a((int) r0, (com.google.android.gms.feedback.ErrorReport) r3)
            java.lang.String r0 = "com.android.feedback.SAFEPARCELABLE_SESSION_ID"
            java.lang.String r0 = r15.getStringExtra(r0)
            r14.n = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ r4
            if (r0 == 0) goto L_0x0159
            mvu r0 = new mvu
            java.lang.String r1 = "feedback"
            r0.<init>(r14, r1, r15)
            r14.o = r0
            android.content.Intent r15 = new android.content.Intent
            r15.<init>()
            java.lang.String r0 = "com.google.android.gms.feedback.FeedbackAsyncService"
            android.content.Intent r15 = r15.setClassName(r14, r0)
            jca r0 = defpackage.jca.a()
            android.content.ServiceConnection r1 = r14.o
            r0.a(r14, r15, r1, r4)
            goto L_0x015c
        L_0x0159:
            r14.b((android.content.Intent) r15)
        L_0x015c:
            aoru r15 = r14.a
            defpackage.ofp.a((defpackage.aoru) r15, (android.content.Context) r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.feedback.FeedbackChimeraActivity.onCreate(android.os.Bundle):void");
    }

    public static void a(sg sgVar, String str) {
        sgVar.a((CharSequence) str);
        sgVar.b(true);
        sgVar.a((Drawable) null);
    }

    /* access modifiers changed from: package-private */
    public final mwg a(Parcelable parcelable, ErrorReport errorReport, Long l2) {
        Screenshot screenshot;
        Screenshot screenshot2 = null;
        if (mwj.a(errorReport)) {
            try {
                ApplicationInfo applicationInfo = getPackageManager().getApplicationInfo(errorReport.a.packageName, 0);
                Bitmap bitmap = errorReport.af;
                if (bitmap != null) {
                    screenshot = Screenshot.a(bitmap);
                } else if (parcelable == null) {
                    byte[] bArr = errorReport.v;
                    if (bArr != null) {
                        screenshot = Screenshot.a(bArr, errorReport.x, errorReport.w);
                    } else if (!TextUtils.isEmpty(errorReport.T)) {
                        screenshot = new Screenshot();
                        Screenshot.a(getFilesDir(), errorReport.T, screenshot, false, this);
                    } else {
                        screenshot = !TextUtils.isEmpty(errorReport.u) ? Screenshot.a(errorReport.u, errorReport.x, errorReport.w) : null;
                    }
                } else {
                    screenshot = (Screenshot) parcelable;
                }
                errorReport.a.processName = applicationInfo.processName;
                screenshot2 = screenshot;
            } catch (PackageManager.NameNotFoundException e2) {
                apev.a(e2);
                finish();
                return null;
            }
        }
        mwg mwg = new mwg(this, errorReport, screenshot2, l2);
        mwg.b();
        return mwg;
    }

    public final void b(Intent intent) {
        this.c = true;
        mxc mxc = new mxc();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_intent", intent);
        mxc.setArguments(bundle);
        this.b = mxc;
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        if (getSupportFragmentManager().findFragmentByTag("feedback_fragment") != null) {
            beginTransaction.replace(R.id.feedback_content, this.b, "feedback_fragment");
        } else {
            beginTransaction.add(R.id.feedback_content, this.b, "feedback_fragment");
        }
        beginTransaction.commit();
    }

    public final void b(ErrorReport errorReport, boolean z) {
        if (ofq.b(axht.b()) && jkf.a(this) && mwj.a(errorReport)) {
            FeedbackAsyncChimeraService.b((Context) this, errorReport);
        } else if (ofq.b(axht.b()) || !jkf.a(this) || TextUtils.isEmpty(errorReport.B)) {
            new mxj(this, errorReport).start();
        } else {
            FeedbackAsyncChimeraService.b((Context) this, errorReport);
        }
        if (z) {
            i();
        }
    }

    public final void a(int i2) {
        String str;
        if (d != null) {
            String concat = String.valueOf(getString(R.string.gf_selection_accessibility_prompt)).concat(" ");
            if (i2 == 0) {
                this.p = "anonymous";
                d.g().B = "";
                String valueOf = String.valueOf(concat);
                String valueOf2 = String.valueOf(getString(R.string.gf_unspecified_email_account));
                str = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
            } else {
                String str2 = d.a[i2];
                this.p = str2;
                d.g().B = str2;
                String valueOf3 = String.valueOf(concat);
                String valueOf4 = String.valueOf(str2);
                str = valueOf4.length() == 0 ? new String(valueOf3) : valueOf3.concat(valueOf4);
            }
            AccessibilityManager accessibilityManager = (AccessibilityManager) getSystemService("accessibility");
            if (accessibilityManager.isEnabled()) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(16384);
                obtain.setPackageName(obtain.getPackageName());
                obtain.setClassName(obtain.getClassName());
                obtain.getText().add(str);
                obtain.setEnabled(true);
                accessibilityManager.sendAccessibilityEvent(obtain);
            }
        }
    }

    public final void a(int i2, ErrorReport errorReport) {
        a(i2, errorReport, (String) null, (String) null);
    }

    public final void a(int i2, ErrorReport errorReport, String str, String str2) {
        Account account;
        if (errorReport == null) {
            Log.e("gf_FeedbackActivity", "ErrorReport is required to populate MetricsData.");
            return;
        }
        if (!TextUtils.isEmpty(this.h)) {
            account = new Account(this.h, "com.google");
        } else {
            account = null;
        }
        myc.a(this, errorReport, i2, account, str2, str, -1);
    }

    public final void a(Parcelable parcelable) {
        mwg mwg = d;
        if (mwg == null) {
            Log.w("gf_FeedbackActivity", "Session is null, not updating screenshot.");
        } else {
            mwg.a((Screenshot) parcelable);
        }
    }

    public final void a(ErrorReport errorReport, boolean z) {
        if (!ofq.a(axhe.b())) {
            mwg mwg = d;
            if (mwg == null || !mwg.f()) {
                b(errorReport, z);
            } else {
                a(mwg, z);
            }
        } else {
            this.a.execute(new mvw(this, errorReport, z));
        }
    }

    public final void a(Screenshot screenshot, ErrorReport errorReport) {
        int i2;
        int i3;
        if (screenshot != null && !TextUtils.isEmpty(screenshot.c)) {
            if (errorReport.v == null) {
                i3 = screenshot.a;
                i2 = screenshot.b;
            } else {
                i3 = errorReport.x;
                i2 = errorReport.w;
            }
            Rect rect = new Rect();
            getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            Pair a2 = mwj.a(getResources(), rect, i3, i2, true);
            Display defaultDisplay = getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            jhg.a((AsyncTask) new mvv(this, errorReport, Pair.create(Integer.valueOf(point.x), Integer.valueOf(point.y)), screenshot, a2), (Object[]) new Void[0]);
            return;
        }
        mxc mxc = (mxc) this.b;
        ((ImageView) mxc.a((int) R.id.gf_screenshot_icon)).setVisibility(8);
        ((MaterialCardView) mxc.a((int) R.id.gf_include_screenshot_card)).setVisibility(8);
        ((TextView) mxc.a((int) R.id.gf_edit_screenshot)).setVisibility(8);
    }

    public final void a(CharSequence charSequence) {
        if (d != null) {
            if (mwj.a(j())) {
                supportInvalidateOptionsMenu();
            }
            d.g().b = charSequence.toString();
        }
    }

    public final void a(Map map) {
        mwg mwg = d;
        if (mwg != null) {
            mwg.a(map);
        }
    }

    public final void a(mwg mwg, boolean z) {
        if (mwg.d()) {
            b(mwg.g(), z);
        } else {
            new qvr(Looper.getMainLooper()).postDelayed(new mvx(this, mwg, z), axgy.e());
        }
    }

    public final void a(boolean z) {
        mxc mxc = (mxc) this.b;
        int i2 = 4;
        mxc.a((int) R.id.gf_progress).setVisibility(!z ? 4 : 0);
        View a2 = mxc.a((int) R.id.gf_feedback_view);
        if (!z) {
            i2 = 0;
        }
        a2.setVisibility(i2);
    }
}
