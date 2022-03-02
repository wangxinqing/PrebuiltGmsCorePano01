package defpackage;

import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: abio  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abio extends abkc {
    private final TextView a = ((TextView) this.c.findViewById(R.id.text));

    public abio(abiq abiq, String str) {
        super((ViewGroup) LayoutInflater.from(abiq.a).inflate(R.layout.card_entry_text_only, (ViewGroup) null));
        int i;
        Spanned a2 = jpr.a(str);
        this.a.setText(a2.toString().trim());
        this.a.setEllipsize(TextUtils.TruncateAt.END);
        TextView textView = this.a;
        if (qb.h(textView) == 1) {
            i = 5;
        } else {
            i = 3;
        }
        textView.setGravity(i);
        a(a2.toString());
    }

    public final void a() {
        this.a.setMaxLines(50);
    }

    public final void b() {
        this.a.setMaxLines(5);
    }

    public final boolean c() {
        return true;
    }
}
