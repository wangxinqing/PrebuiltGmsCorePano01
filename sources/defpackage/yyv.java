package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity;

/* renamed from: yyv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yyv extends yyz implements View.OnClickListener {
    private yyu g;
    private String h;

    /* access modifiers changed from: protected */
    public final void a() {
    }

    /* access modifiers changed from: protected */
    public final void b() {
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof yyu)) {
            String valueOf = String.valueOf(yyu.class.getSimpleName());
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Host must implement ") : "Host must implement ".concat(valueOf));
        } else {
            this.g = (yyu) activity;
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.back_button) {
            this.a.b(iar.d, this.a.bd());
            this.g.b();
        } else if (id != R.id.next_button) {
        } else {
            if ("invalidNameHardFail".equals(this.h)) {
                this.g.f();
            } else {
                super.onClick(view);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.e.setVisibility(0);
        this.e.setText(R.string.plus_bad_name_decline_button_label);
        String string = getArguments().getString("error_id");
        this.h = string;
        if ("invalidNameHardFail".equals(string)) {
            this.d.setText(R.string.plus_bad_name_skip_button_label);
        } else {
            this.d.setText(R.string.plus_bad_name_agree_button_label);
        }
        return onCreateView;
    }

    /* access modifiers changed from: protected */
    public final void a(LayoutInflater layoutInflater, View view) {
        layoutInflater.inflate(R.layout.plus_oob_buttons, (ViewGroup) view.findViewById(R.id.buttons_layout), true);
    }

    public final void a(UpgradeAccountEntity upgradeAccountEntity) {
        super.a(upgradeAccountEntity);
        int childCount = this.b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.b.getChildAt(i);
            if (childAt instanceof yyg) {
                yyg yyg = (yyg) childAt;
                if (!TextUtils.isEmpty(yyg.j())) {
                    if ("appealButton".equals(yyg.b.f())) {
                        this.d.setText(yyg.j());
                    } else if ("changeButton".equals(yyg.b.f())) {
                        this.e.setText(yyg.j());
                    }
                }
            }
        }
    }
}
