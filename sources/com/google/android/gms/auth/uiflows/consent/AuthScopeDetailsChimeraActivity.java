package com.google.android.gms.auth.uiflows.consent;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AuthScopeDetailsChimeraActivity extends FragmentActivity implements View.OnClickListener, View.OnTouchListener {
    private String a;
    private Intent b;
    private ScrollView c;

    public void onClick(View view) {
        if (view.getId() == R.id.ok) {
            this.b.putExtra("detail_end_time", System.currentTimeMillis());
            if (this.c.getHeight() < this.c.getChildAt(0).getMeasuredHeight()) {
                this.b.putExtra("detail_screen_scrollable", true);
            } else {
                this.b.putExtra("scroll_screen_end", true);
            }
            setResult(-1, this.b);
            finish();
        }
    }

    public final void onCreate(Bundle bundle) {
        float f;
        requestWindowFeature(1);
        super.onCreate(bundle);
        setContentView((int) R.layout.auth_consent_scope_details_activity);
        Intent intent = new Intent();
        this.b = intent;
        intent.putExtra("detail_start_time", System.currentTimeMillis());
        this.a = getIntent().getStringExtra("scope_details");
        ScrollView scrollView = (ScrollView) findViewById(R.id.scrollview_details);
        this.c = scrollView;
        scrollView.setOnTouchListener(this);
        String str = this.a;
        if (str != null) {
            Spanned fromHtml = Html.fromHtml(str.replaceAll("\n", "<br/>"));
            TextView textView = (TextView) findViewById(R.id.scope_details_text);
            textView.setText(fromHtml);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setClickable(true);
        } else {
            ((TextView) findViewById(R.id.scope_details_text)).setText((CharSequence) null);
        }
        ((Button) findViewById(R.id.ok)).setOnClickListener(this);
        Resources resources = getResources();
        if (jix.a(resources)) {
            f = resources.getDimension(R.dimen.plus_auth_dialog_tablet_resize_factor);
        } else {
            f = resources.getDimension(R.dimen.plus_auth_dialog_resize_factor);
        }
        jgv.a(getContainerActivity(), (double) f);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (view.getId() == R.id.scrollview_details && view.getHeight() + view.getScrollY() == this.c.getChildAt(0).getMeasuredHeight()) {
            this.b.putExtra("scroll_screen_end", true);
        }
        return false;
    }
}
