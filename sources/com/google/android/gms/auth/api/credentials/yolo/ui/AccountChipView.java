package com.google.android.gms.auth.api.credentials.yolo.ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.volley.toolbox.ImageLoader;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AccountChipView extends LinearLayout {
    private static ImageLoader a;
    private static fqh b;

    public AccountChipView(Context context) {
        super(context);
        a(context);
    }

    private final void a(Context context) {
        View.inflate(context, R.layout.account_chip_view, this);
    }

    private final LinearLayout b() {
        return (LinearLayout) findViewById(R.id.default_credential_avatar);
    }

    private static ImageLoader c() {
        if (a == null) {
            b = new fqh();
            a = new ImageLoader(ihs.b().getRequestQueue(), b);
        }
        return a;
    }

    public AccountChipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    /* access modifiers changed from: package-private */
    public final jmg a() {
        return (jmg) findViewById(R.id.credential_avatar);
    }

    public AccountChipView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    public final void a(fqg fqg) {
        String str = fqg.d;
        TextView textView = (TextView) findViewById(R.id.credential_primary_label);
        if (TextUtils.isEmpty(str)) {
            textView.setText("");
        } else {
            textView.setText(str);
        }
        a(fqg.e);
        if (!TextUtils.isEmpty(fqg.c)) {
            String str2 = fqg.c;
            b().setVisibility(8);
            a().setVisibility(0);
            a().setImageUrl(str2, c());
        } else if (fqg.b) {
            int i = fqg.a;
            b().setVisibility(8);
            a().setVisibility(0);
            a().setDefaultImageResId(i);
            a().setImageUrl((String) null, c());
        } else {
            int i2 = fqg.a;
            a().setVisibility(8);
            b().setVisibility(0);
            ((ImageView) findViewById(R.id.default_credential_avatar_icon)).setBackgroundResource(i2);
        }
        setContentDescription(fqg.d);
    }

    @Deprecated
    public final void a(String str) {
        TextView textView = (TextView) findViewById(R.id.credential_secondary_label);
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(str);
        textView.setVisibility(0);
    }
}
