package com.google.android.gms.auth.uiflows.consent;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.R;
import com.google.android.gms.auth.firstparty.shared.ScopeData;
import com.google.android.gms.common.audience.widgets.AudienceView;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AuthAudienceViewChimeraActivity extends FragmentActivity implements View.OnClickListener, iin {
    private String a;
    private String b;
    private ScopeData c;
    private Audience d;
    private Audience e;
    private AudienceView f;
    private RadioButton g;
    private RadioButton h;
    private LinearLayout i;
    private TextView j;

    private final void a(boolean z) {
        this.g.setChecked(z);
        this.h.setChecked(!z);
    }

    private final void b() {
        AudienceView audienceView = this.f;
        if (!(audienceView == null || this.g == null)) {
            audienceView.setEnabled(false);
            this.g.setEnabled(false);
        }
        a(true);
        iia a2 = ihz.a();
        a2.a(this.b);
        a2.b(this.d.b);
        a2.a.putParcelableArrayListExtra("INITIAL_ACL", iia.a(this.d.b));
        a2.d("80");
        a2.b(getString(R.string.auth_plus_audience_selection_description_acl));
        startActivityForResult(a2.a, 1);
    }

    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 1) {
            AudienceView audienceView = this.f;
            if (!(audienceView == null || this.g == null)) {
                audienceView.setEnabled(true);
                this.g.setEnabled(true);
            }
            if (i3 == -1) {
                iia iia = new iia(intent);
                iww iww = new iww();
                iww.a((Collection) iia.c());
                Audience a2 = iww.a();
                this.d = a2;
                AudienceView audienceView2 = this.f;
                if (audienceView2 != null) {
                    audienceView2.a(a2);
                    a(true ^ ixb.a(this.d));
                }
            } else if (ixb.a(this.d)) {
                a(false);
            }
        }
        super.onActivityResult(i2, i3, intent);
    }

    public final void onBackPressed() {
        this.f.a(this.e);
        Intent intent = new Intent();
        intent.putExtra("pacl_audience", this.e);
        setResult(0, intent);
        finish();
    }

    public void onClick(View view) {
        Audience audience;
        if (view == this.g || view == this.f) {
            b();
        } else if (view == this.h || view == this.i) {
            a(false);
        } else if (view == findViewById(R.id.ok)) {
            Intent intent = new Intent();
            if (!this.g.isChecked()) {
                audience = new iww().a();
            } else {
                audience = this.d;
            }
            intent.putExtra("pacl_audience", audience);
            setResult(-1, intent);
            finish();
        }
    }

    public final void onCreate(Bundle bundle) {
        float f2;
        Audience audience;
        requestWindowFeature(1);
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.e = (Audience) intent.getParcelableExtra("pacl_audience");
        this.a = intent.getStringExtra("scope_description");
        this.b = intent.getStringExtra("account_name");
        this.c = (ScopeData) intent.getParcelableExtra("scope_data");
        intent.getStringExtra("calling_package");
        if (this.e == null) {
            String str = this.c.f;
            if (str != null) {
                try {
                    List a2 = yxf.a(jhy.c(str));
                    iww iww = new iww();
                    iww.a((Collection) a2);
                    audience = iww.a();
                } catch (Exception e2) {
                    Log.e("AuthAudienceViewActivity", str.length() == 0 ? new String("Failed to parse audience from roster: ") : "Failed to parse audience from roster: ".concat(str), e2);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(AudienceMember.c("myCircles", getResources().getString(R.string.common_chips_label_your_circles)));
                    iww iww2 = new iww();
                    iww2.a((Collection) arrayList);
                    audience = iww2.a();
                }
            } else {
                audience = null;
            }
            this.e = audience;
        }
        if (bundle != null) {
            this.d = (Audience) bundle.getParcelable("STATE_SELECTED_AUDIENCE");
        } else {
            this.d = this.e;
        }
        setContentView((int) R.layout.auth_consent_audience_view_activity);
        AudienceView audienceView = (AudienceView) findViewById(R.id.audience_view);
        this.f = audienceView;
        audienceView.a((iin) this);
        this.f.b(true);
        this.g = (RadioButton) findViewById(R.id.acl_radio_button);
        this.h = (RadioButton) findViewById(R.id.private_pacl_radio_button);
        this.i = (LinearLayout) findViewById(R.id.private_pacl_layout);
        this.f.a(this.d);
        this.g.setOnClickListener(this);
        this.h.setOnClickListener(this);
        this.i.setOnClickListener(this);
        this.f.setOnClickListener(this);
        a(!ixb.a(this.d));
        ((Button) findViewById(R.id.ok)).setOnClickListener(this);
        Spanned fromHtml = Html.fromHtml(this.a);
        TextView textView = (TextView) findViewById(R.id.pacl_description);
        this.j = textView;
        textView.setText(fromHtml);
        this.j.setMovementMethod(LinkMovementMethod.getInstance());
        this.j.setClickable(true);
        Resources resources = getResources();
        if (jix.a(resources)) {
            f2 = resources.getDimension(R.dimen.plus_auth_dialog_tablet_resize_factor);
        } else {
            f2 = resources.getDimension(R.dimen.plus_auth_dialog_resize_factor);
        }
        jgv.a(getContainerActivity(), (double) f2);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("STATE_SELECTED_AUDIENCE", this.d);
    }

    public final void a() {
        b();
    }
}
