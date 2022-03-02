package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: jpy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jpy extends LinearLayout {
    private final TextView a = ((TextView) findViewById(R.id.text));
    private final TextView b = ((TextView) findViewById(R.id.subtext));

    public jpy(Context context) {
        super(context);
        inflate(getContext(), R.layout.gm_about_card_entry, this);
        setOrientation(0);
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        this.a.setText(str);
        setOnLongClickListener(new jpx(this, str));
    }

    /* access modifiers changed from: package-private */
    public final void b(String str) {
        this.b.setText(str);
        this.b.setVisibility(0);
    }
}
