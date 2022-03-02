package com.google.android.gms.plus.audience;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientActionDataEntity;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AudienceSearchChimeraActivity extends yoz implements TextView.OnEditorActionListener, TextWatcher, yqc {
    private EditText w;
    private yok x;

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ypk a(Intent intent, Fragment fragment) {
        String str = this.a;
        String str2 = this.b;
        boolean a = iia.a(intent, false);
        boolean j = iia.j(intent);
        boolean k = iia.k(intent);
        boolean k2 = iia.k(intent);
        boolean l = iia.l(intent);
        boolean booleanExtra = intent.getBooleanExtra("EXTRA_SEARCH_EMAIL", false);
        String str3 = this.d;
        String str4 = this.c;
        yok yok = new yok();
        yok.setArguments(yok.a(str, str2, a, j, k, k2, l, booleanExtra, str3, str4));
        this.x = yok;
        return yok;
    }

    public final void afterTextChanged(Editable editable) {
        if (!TextUtils.isEmpty(editable.toString())) {
            this.x.a(editable.toString());
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* access modifiers changed from: protected */
    public final int e() {
        return R.string.plus_audience_selection_title_search;
    }

    /* access modifiers changed from: protected */
    public final void f() {
        a(iax.x, n());
        super.f();
    }

    /* access modifiers changed from: protected */
    public final void h() {
        a(iax.y, (ClientActionDataEntity) null);
        super.h();
    }

    /* access modifiers changed from: protected */
    public final FavaDiagnosticsEntity i() {
        return iay.f;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(textView.getWindowToken(), 0);
        return true;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* access modifiers changed from: protected */
    public final void a(Bundle bundle) {
        findViewById(R.id.action_buttons).setVisibility(8);
        this.f.a(this);
        EditText editText = (EditText) LayoutInflater.from(this).inflate(R.layout.plus_audience_selection_search_box, (ViewGroup) null);
        this.w = editText;
        editText.setOnEditorActionListener(this);
        this.w.addTextChangedListener(this);
        ((LinearLayout) findViewById(R.id.search_container)).addView(this.w, 0);
    }

    public final void a(Object obj) {
        if (this.f.a.b.size() > 0) {
            f();
        }
    }
}
