package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: abjz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class abjz extends abkc {
    public final int a;
    private final List b;

    public abjz(Context context, int i) {
        this(context, i, (Drawable) null);
    }

    public void a() {
        e();
        for (int i = this.a; i < this.b.size(); i++) {
            ((abkc) this.b.get(i)).a();
        }
    }

    public void b() {
        f();
        for (int i = this.a; i < this.b.size(); i++) {
            ((abkc) this.b.get(i)).b();
        }
    }

    public final boolean c() {
        if (this.a > 0 && !this.b.isEmpty()) {
            return true;
        }
        List list = this.b;
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (((abkc) list.get(i)).c()) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    public final boolean d() {
        return this.b.isEmpty();
    }

    public abjz(Context context, int i, int i2, Drawable drawable) {
        this(context, i2, drawable);
        LayoutInflater.from(this.c.getContext()).inflate(R.layout.composite_entry_title, this.c);
        TextView textView = (TextView) this.c.findViewById(R.id.title);
        textView.setVisibility(0);
        textView.setText(i);
    }

    public final void a(abkc abkc) {
        this.b.add(abkc);
        this.c.addView(abkc.c);
    }

    public abjz(Context context, int i, Drawable drawable) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        if (drawable != null) {
            linearLayout.setDividerDrawable(drawable);
            linearLayout.setShowDividers(2);
        }
        this.c = linearLayout;
        this.b = new ArrayList();
        this.a = i;
    }

    public abjz(Context context, Drawable drawable) {
        this(context, 0, drawable);
    }
}
