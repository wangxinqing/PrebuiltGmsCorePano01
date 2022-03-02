package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.common.account.BaseAccountChipAccountPickerChimeraActivity$2;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hzc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class hzc extends hzd {
    public static final iwd a = new iwd("CommonAccount", "BaseAccountChipAccountPicker");
    private static final int k = 3;
    public hzb b;
    public int c = 2;
    private hol i;
    private String j;

    private static void a(Context context, SpannableStringBuilder spannableStringBuilder, String str, String str2, Resources.Theme theme, int i2) {
        if (TextUtils.isEmpty(str2)) {
            spannableStringBuilder.append(str);
            return;
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(str);
        if (!TextUtils.isEmpty(str2)) {
            spannableStringBuilder.setSpan(new BaseAccountChipAccountPickerChimeraActivity$2(str2, theme, i2, context), length, spannableStringBuilder.length(), 33);
        }
    }

    /* access modifiers changed from: protected */
    public final void e() {
        setContentView((int) R.layout.common_account_chip_account_picker);
        this.h = (ListView) findViewById(16908298);
        if (this.g.a() && ((pyu) this.g.b()).c()) {
            amri d = ((pyu) this.g.b()).d();
            amri e = ((pyu) this.g.b()).e();
            TextView textView = (TextView) findViewById(R.id.consent_text);
            if (textView != null) {
                findViewById(R.id.consent_divider).setVisibility(0);
                textView.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(R.string.common_account_consent_text_permissions, new Object[]{l()}));
                if (d.a() || e.a()) {
                    textView.setMovementMethod(new LinkMovementMethod());
                    String lowerCase = getString(R.string.common_privacy_policy).toLowerCase();
                    String lowerCase2 = getString(R.string.common_terms_of_service).toLowerCase();
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                    a(this, spannableStringBuilder2, lowerCase, (String) d.c(), getTheme(), getThemeResId());
                    a(this, spannableStringBuilder3, lowerCase2, (String) e.c(), getTheme(), getThemeResId());
                    spannableStringBuilder.append(" ");
                    spannableStringBuilder.append(TextUtils.expandTemplate(getString(R.string.common_account_consent_text_agreement), new CharSequence[]{spannableStringBuilder2, spannableStringBuilder3}));
                }
                textView.setText(spannableStringBuilder);
            }
        }
        this.h.setAdapter(this.b);
        this.h.setChoiceMode(1);
        this.h.setItemsCanFocus(false);
        this.h.setOnItemClickListener(new hza(this));
        this.h.scrollBy(0, -1);
        this.h.scrollBy(0, 1);
    }

    /* access modifiers changed from: protected */
    public final ArrayList f() {
        ArrayList f = super.f();
        return (f.isEmpty() || TextUtils.isEmpty(this.j)) ? f : jgu.a((List) f, this.j);
    }

    /* access modifiers changed from: protected */
    public abstract hzb h();

    public final void onBackPressed() {
        this.c = 2;
        super.onBackPressed();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.i = new hol(getApplicationContext(), "ANDROID_AUTH", (String) null);
        this.j = getIntent().getStringExtra("hostedDomainFilter");
        this.b = h();
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        if (isFinishing()) {
            aucd o = anoh.g.o();
            int i2 = this.c;
            if (o.c) {
                o.c();
                o.c = false;
            }
            anoh anoh = (anoh) o.b;
            int i3 = i2 - 1;
            if (i2 != 0) {
                anoh.b = i3;
                anoh.a |= 1;
                int size = f().size();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                anoh anoh2 = (anoh) o.b;
                int i4 = anoh2.a | 2;
                anoh2.a = i4;
                anoh2.c = size;
                int i5 = this.d;
                int i6 = i4 | 4;
                anoh2.a = i6;
                anoh2.d = i5;
                String str = this.f;
                if (str != null) {
                    str.getClass();
                    anoh2.a = i6 | 8;
                    anoh2.e = str;
                }
                aucd o2 = anon.v.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                anon anon = (anon) o2.b;
                anon.c = 17;
                anon.a |= 1;
                int i7 = k;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                anoh anoh3 = (anoh) o.b;
                int i8 = i7 - 1;
                if (i7 != 0) {
                    anoh3.f = i8;
                    anoh3.a |= 16;
                    anoh anoh4 = (anoh) o.i();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    anon anon2 = (anon) o2.b;
                    anoh4.getClass();
                    anon2.o = anoh4;
                    anon2.a |= 524288;
                    this.i.a((audx) (anon) o2.i()).b();
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        super.onDestroy();
    }

    public final void onStart() {
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public final void a(Bundle bundle) {
        bundle.putBoolean("pickedFromAccountChips", true);
    }
}
