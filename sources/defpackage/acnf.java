package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;
import java.util.ArrayList;

/* renamed from: acnf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acnf extends ArrayAdapter {
    private final int a;

    public acnf(Context context, int i) {
        super(context, i, new ArrayList());
        this.a = i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(this.a, viewGroup, false);
        }
        acng acng = (acng) getItem(i);
        TextView textView = (TextView) view.findViewById(R.id.title);
        boolean z = !TextUtils.isEmpty(acng.b) && !acng.b.equalsIgnoreCase(acng.a);
        textView.setVisibility(!z ? 8 : 0);
        if (z) {
            textView.setText(acng.b);
            if (acng.d) {
                textView.setAlpha(0.5f);
            }
        }
        TextView textView2 = (TextView) view.findViewById(R.id.subtitle);
        textView2.setText(acng.a);
        textView2.setVisibility(0);
        if (acng.d) {
            textView2.setAlpha(0.5f);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        Bitmap bitmap = acng.c;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            imageView.setImageResource(R.drawable.product_logo_avatar_circle_blue_color_36);
        }
        if (acng.d) {
            imageView.setAlpha(0.5f);
        }
        return view;
    }
}
