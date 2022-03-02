package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import com.google.android.gms.R;

/* renamed from: ypo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ypo extends RelativeLayout implements Checkable, CompoundButton.OnCheckedChangeListener, View.OnClickListener {
    private View a;
    public Object d;
    protected CheckBox e;
    public ypn f;
    public boolean g;

    public ypo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void a() {
        this.f = null;
        this.e.setVisibility(0);
        a(true);
    }

    public final void b(boolean z) {
        this.a.setVisibility(!z ? 8 : 0);
    }

    public final void d() {
        this.e.setVisibility(8);
    }

    public final boolean isChecked() {
        return this.e.isChecked();
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ypn ypn = this.f;
        if (ypn != null) {
            ypn.a(this, z);
        }
    }

    public void onClick(View view) {
        if (view.getId() != R.id.audience_selection_checkbox) {
            CheckBox checkBox = this.e;
            checkBox.setChecked(!checkBox.isChecked());
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = findViewById(R.id.top_border);
        CheckBox checkBox = (CheckBox) findViewById(R.id.audience_selection_checkbox);
        this.e = checkBox;
        checkBox.setOnCheckedChangeListener(this);
        setOnClickListener(this);
    }

    public void setChecked(boolean z) {
        this.e.setChecked(z);
    }

    public final void toggle() {
        this.e.toggle();
    }

    public final void a(boolean z) {
        setClickable(z);
        setFocusable(z);
    }
}
