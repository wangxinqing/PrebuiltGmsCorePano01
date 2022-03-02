package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: abka  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abka extends abkc {
    public final List a;
    public int b;

    public abka(Context context, String str) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.c = linearLayout;
        if (!TextUtils.isEmpty(str)) {
            LayoutInflater.from(this.c.getContext()).inflate(R.layout.composite_entry_title, this.c);
            TextView textView = (TextView) this.c.findViewById(R.id.title);
            textView.setVisibility(0);
            textView.setText(str);
        }
        this.b = 0;
        this.a = new ArrayList();
    }

    public final void a() {
        a(this.b + Math.min(this.a.size() - this.b, this.c.getContext().getResources().getInteger(R.integer.reporting_chain_max_num_rows_to_expand_at_once)));
    }

    public final void b() {
        f();
        if (this.a.size() >= 3) {
            for (int i = 3; i < this.a.size(); i++) {
                ((abkf) this.a.get(i)).b();
            }
            this.b = 3;
            return;
        }
        this.b = this.a.size();
    }

    public final boolean c() {
        return !this.a.isEmpty();
    }

    public final boolean d() {
        return this.b < this.a.size();
    }

    public final void a(int i) {
        if (i >= 0) {
            e();
            int min = Math.min(i, this.a.size());
            for (int i2 = this.b; i2 < min; i2++) {
                ((abkf) this.a.get(i2)).a();
            }
            this.b = min;
        }
    }

    public final void a(abkf abkf) {
        this.a.add(abkf);
        this.c.addView(abkf.c);
    }
}
