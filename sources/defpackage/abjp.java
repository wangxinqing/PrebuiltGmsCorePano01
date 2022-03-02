package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.smart_profile.card.view.BaseCardView;

/* renamed from: abjp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abjp {
    public final Context a;
    public final String b;
    public final Activity c;
    public final jtf d;
    private final BaseCardView e;
    private final avjo f;
    private final jsx g;
    private int h = 300;

    public abjp(Activity activity, Context context, BaseCardView baseCardView, avjo avjo, jsx jsx, String str, jtf jtf) {
        this.c = activity;
        this.e = baseCardView;
        this.a = context;
        this.f = avjo;
        this.g = jsx;
        this.b = str;
        this.d = jtf;
        if (avjo.a.size() != 0) {
            baseCardView.a((int) R.string.profile_people_common_title);
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.a).inflate(R.layout.related_people_row, (ViewGroup) null);
            int childCount = linearLayout.getChildCount();
            int i = childCount + childCount;
            int i2 = 0;
            while (i2 < i && i2 < this.f.a.size()) {
                if (i2 == childCount) {
                    this.e.a((View) linearLayout);
                    linearLayout = (LinearLayout) LayoutInflater.from(this.a).inflate(R.layout.related_people_row, (ViewGroup) null);
                }
                View childAt = linearLayout.getChildAt(i2 % childCount);
                avjq avjq = (avjq) this.f.a.get(i2);
                childAt.setVisibility(0);
                if (!avjq.a.isEmpty()) {
                    TextView textView = (TextView) childAt.findViewById(R.id.display_name);
                    int i3 = Build.VERSION.SDK_INT;
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setText(avjq.a);
                }
                String str2 = avjq.c;
                str2 = TextUtils.isEmpty(str2) ? avjq.d : str2;
                String a2 = iqv.a(jpr.b(TextUtils.isEmpty(str2) ? azid.b() : str2), this.a.getResources().getDimensionPixelSize(R.dimen.profile_card_people_avatar_diameter));
                jsx jsx2 = this.g;
                int i4 = this.h;
                this.h = i4 + 1;
                jsx2.a(a2, i4, new abjn(this, childAt));
                if (!avjq.b.isEmpty()) {
                    childAt.setOnClickListener(new abjo(this, avjq));
                }
                i2++;
            }
            this.e.a((View) linearLayout);
            return;
        }
        baseCardView.setVisibility(8);
    }
}
