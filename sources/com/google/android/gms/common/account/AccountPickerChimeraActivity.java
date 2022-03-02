package com.google.android.gms.common.account;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AccountPickerChimeraActivity extends qcd {
    public static final iwd a = new iwd("CommonAccount", "AccountPicker");
    public String b;
    public iad c;
    public String d;
    public Account e;
    public agcf f;
    public TextView g;
    public View h;
    public iae i;
    public pzp j;
    public int k = -1;
    public boolean l = true;
    public boolean m;
    private TextView n;
    private TextView o;
    private hol p;

    private static String a(String str) {
        return new Intent("android.intent.action.VIEW", Uri.parse(str)).toUri(1);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i2, int i3, Intent intent) {
        this.j.a(i2, i3, intent);
    }

    public final void onBackPressed() {
        a(2);
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        int i2;
        int i3;
        TextView textView;
        iae iae = new iae(getIntent(), 1);
        this.i = iae;
        setTheme(iae.i);
        this.e = this.i.e;
        super.onCreate(bundle);
        String str = null;
        setTitle((CharSequence) null);
        this.p = new hol(getApplicationContext(), "ANDROID_AUTH", (String) null);
        iae iae2 = this.i;
        String a2 = jhg.a((Activity) this);
        if (a2 == null) {
            a.d("Unable to get caller identity", new Object[0]);
            a2 = null;
        } else if (!qby.a((Context) this, a2)) {
            a.d("App was not signed by Google.", new Object[0]);
            a2 = null;
        } else if (ampw.a(a2, getPackageName())) {
            a2 = iae2.g;
        }
        if (a2 != null) {
            this.d = a2;
            this.m = hya.a((Context) this).b(this.d);
            this.b = iaf.b(getApplication(), this.d);
            if (this.j == null) {
                pzn pzn = new pzn(getApplicationContext(), this.d);
                iae iae3 = this.i;
                pzn.f = iae3.d;
                pzn.a((List) iae3.a);
                iae iae4 = this.i;
                pzn.c = iae4.b;
                pzn.e = iae4.m;
                pzn.a = true;
                pzn.b = true;
                pzn.d = iae4.l;
                this.j = (pzp) qck.a(this, pzn).a(pzp.class);
            }
            this.j.h.a(this, new hyp(this));
            this.j.i.a(this, new hyq(this));
            iae iae5 = this.i;
            if (iae5.n != 2) {
                int intExtra = iae5.h.getIntExtra("overrideCustomTheme", 0);
                i2 = intExtra != 1 ? intExtra != 2 ? 0 : iae5.k.a() ? azge.b() ? R.layout.common_account_account_picker_first_party_aligned_with_one_google : R.layout.common_account_account_picker_first_party : R.layout.common_account_account_picker_generic : R.layout.common_account_account_picker_game;
            } else {
                i2 = R.layout.common_account_wearable_picker;
            }
            setContentView(i2);
            if (!azge.b()) {
                this.g = (TextView) findViewById(R.id.main_title);
                TextView textView2 = (TextView) findViewById(R.id.subtitle);
                ImageView imageView = (ImageView) findViewById(R.id.app_icon);
                RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
                this.n = (TextView) findViewById(R.id.consent_text);
                iad iad = new iad(this.j, -1, -1);
                this.c = iad;
                recyclerView.setAdapter(iad);
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(new abk());
                int dimensionPixelSize = getResources().getDimensionPixelSize(iag.a(this, R.attr.common_account_row_item_horizontal_padding, R.dimen.common_account_row_item_horizontal_padding));
                if (this.g == null) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                qcm.a(this, recyclerView, i3, R.drawable.common_account_list_divider, dimensionPixelSize, dimensionPixelSize);
                if (this.i.k.a() && (textView = this.g) != null) {
                    textView.setText((CharSequence) this.i.k.b());
                }
                iae iae6 = this.i;
                if (iae6.j) {
                    a(iae6.b(), this.i.a());
                }
                a(textView2, imageView, recyclerView);
                return;
            }
            this.g = (TextView) findViewById(R.id.main_title);
            this.h = findViewById(R.id.selected_account_container);
            TextView textView3 = (TextView) findViewById(R.id.selected_account_email);
            TextView textView4 = (TextView) findViewById(R.id.subtitle);
            ImageView imageView2 = (ImageView) findViewById(R.id.app_icon);
            RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.list);
            this.n = (TextView) findViewById(R.id.consent_text);
            this.o = (TextView) findViewById(R.id.consent_text1p);
            iad iad2 = new iad(this.j, R.layout.common_account_manage_accounts_chip_view, R.layout.common_account_selected_account);
            this.c = iad2;
            recyclerView2.setAdapter(iad2);
            recyclerView2.setHasFixedSize(true);
            recyclerView2.setLayoutManager(new abk());
            TextView textView5 = this.g;
            if (textView5 != null && this.m && this.e == null) {
                textView5.setVisibility(0);
            }
            if (!(this.h == null || this.e == null || textView3 == null || !this.m)) {
                findViewById(R.id.selected_account_container).setVisibility(0);
                Account account = this.e;
                if (account != null) {
                    str = account.name;
                }
                textView3.setText(str);
            }
            if (this.m) {
                a(amri.b(azgb.a.a().a()), amri.b(azgb.a.a().b()));
            } else {
                a(this.i.b(), this.i.a());
            }
            a(textView4, imageView2, recyclerView2);
            return;
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        if (isFinishing() && this.l) {
            a(2);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        this.j.b();
    }

    private final void a(amri amri, amri amri2) {
        if (azge.b() && this.m) {
            View findViewById = findViewById(R.id.consent_divider);
            findViewById.setVisibility(0);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
            findViewById.setLayoutParams(layoutParams);
            String string = getString(R.string.common_privacy_policy_composed_string);
            String string2 = getString(R.string.common_terms_of_service_composed_string);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            TextView textView = this.o;
            if (textView != null) {
                textView.setVisibility(0);
                this.o.setMovementMethod(new LinkMovementMethod());
            }
            qcn.a(this, spannableStringBuilder, string, a((String) amri.b()), getTheme(), getThemeResId(), R.attr.common_account_consent_color, (View.OnClickListener) null);
            qcn.a(this, spannableStringBuilder2, string2, a((String) amri2.b()), getTheme(), getThemeResId(), R.attr.common_account_consent_color, (View.OnClickListener) null);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            spannableStringBuilder3.append(spannableStringBuilder);
            spannableStringBuilder3.append("  •  ");
            spannableStringBuilder3.append(spannableStringBuilder2);
            TextView textView2 = this.o;
            if (textView2 != null) {
                textView2.setText(spannableStringBuilder3);
                return;
            }
            return;
        }
        findViewById(R.id.consent_divider).setVisibility(0);
        this.n.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(getString(R.string.common_account_consent_text_permissions, new Object[]{this.b}));
        if (amri.a() || amri2.a()) {
            this.n.setMovementMethod(new LinkMovementMethod());
            String lowerCase = getString(R.string.common_privacy_policy).toLowerCase();
            String lowerCase2 = getString(R.string.common_terms_of_service).toLowerCase();
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
            SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
            if (amri.a()) {
                qcn.a(this, spannableStringBuilder5, lowerCase, a((String) amri.b()), getTheme(), getThemeResId(), R.attr.common_account_link_color, (View.OnClickListener) null);
            } else {
                spannableStringBuilder5.append(lowerCase);
            }
            if (amri2.a()) {
                qcn.a(this, spannableStringBuilder6, lowerCase2, a((String) amri2.b()), getTheme(), getThemeResId(), R.attr.common_account_link_color, (View.OnClickListener) null);
            } else {
                spannableStringBuilder6.append(lowerCase2);
            }
            spannableStringBuilder4.append(" ");
            spannableStringBuilder4.append(TextUtils.expandTemplate(getString(R.string.common_account_consent_text_agreement), new CharSequence[]{spannableStringBuilder5, spannableStringBuilder6}));
        }
        this.n.setText(spannableStringBuilder4);
    }

    private final void a(TextView textView, ImageView imageView, RecyclerView recyclerView) {
        if (imageView != null) {
            Drawable drawable = (Drawable) iaf.a(getApplication(), this.d).c();
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        if (textView != null) {
            String string = getString(R.string.common_account_account_chip_subtitle, new Object[]{this.b});
            if (TextUtils.isEmpty(string)) {
                textView.setVisibility(8);
            } else {
                textView.setText(string);
                textView.setVisibility(0);
            }
        }
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new hyu(this, recyclerView));
        if (jkr.b()) {
            getWindow().setBackgroundDrawableResource(R.drawable.common_account_rounded_dialog_background);
        }
        this.j.a();
    }

    public final void a(int i2) {
        int i3;
        List list = (List) this.j.g.b();
        aucd o2 = anoh.g.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        anoh anoh = (anoh) o2.b;
        anoh.b = i2 - 1;
        anoh.a |= 1;
        if (list != null) {
            i3 = list.size();
        } else {
            i3 = 0;
        }
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        anoh anoh2 = (anoh) o2.b;
        int i4 = anoh2.a | 2;
        anoh2.a = i4;
        anoh2.c = i3;
        int i5 = this.k;
        int i6 = i4 | 4;
        anoh2.a = i6;
        anoh2.d = i5;
        String str = this.d;
        str.getClass();
        int i7 = i6 | 8;
        anoh2.a = i7;
        anoh2.e = str;
        anoh2.f = 1;
        anoh2.a = i7 | 16;
        anoh anoh3 = (anoh) o2.i();
        aucd o3 = anon.v.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        anon anon = (anon) o3.b;
        anon.c = 17;
        int i8 = anon.a | 1;
        anon.a = i8;
        anoh3.getClass();
        anon.o = anoh3;
        anon.a = 524288 | i8;
        this.p.a((audx) (anon) o3.i()).b();
    }
}
