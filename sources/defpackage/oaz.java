package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import java.util.ArrayList;

/* renamed from: oaz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oaz extends TextView implements View.OnClickListener {
    private final Context a;
    private final avnj b;
    private final oby c;

    public oaz(Context context, avnj avnj, oby oby) {
        super(context);
        this.a = context;
        this.b = avnj;
        this.c = oby;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, context.getResources().getDimensionPixelSize(R.dimen.gh_contact_vertical_padding), 0, 0);
        setLayoutParams(layoutParams);
        setText(context.getString(R.string.gh_cuf_add_additional));
        setTextColor(context.getResources().getColor(R.color.material_google_blue_500));
        setOnClickListener(this);
    }

    public void onClick(View view) {
        obw obw = new obw(this.a, (obg) null, this.b, this.c, false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        obw.setLayoutParams(layoutParams);
        oby oby = this.c;
        ImageView imageView = new ImageView(oby.getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 16;
        imageView.setLayoutParams(layoutParams2);
        imageView.setImageResource(R.drawable.gh_search_clear);
        LinearLayout linearLayout = new LinearLayout(oby.getContext());
        linearLayout.addView(obw);
        linearLayout.addView(imageView);
        oby.addView(linearLayout, oby.getChildCount() - 1);
        imageView.setContentDescription(imageView.getContext().getString(R.string.common_ui_confirm_deleting_button));
        imageView.setOnClickListener(new obx(oby, obw, linearLayout));
        if (oby.b == null) {
            oby.b = new ArrayList();
        }
        oby.b.add(obw);
        obw.requestFocus();
        oby.a();
    }
}
