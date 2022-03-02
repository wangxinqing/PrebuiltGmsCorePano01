package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;
import java.util.ArrayList;

/* renamed from: hyx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hyx extends ArrayAdapter {
    private final LayoutInflater a;
    private final ArrayList b;

    public hyx(Context context, ArrayList arrayList) {
        super(context, 17367043, arrayList);
        this.b = arrayList;
        this.a = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        hyz hyz;
        if (view == null) {
            view = this.a.inflate(R.layout.common_account_type_picker_row, (ViewGroup) null);
            hyz = new hyz();
            hyz.b = (TextView) view.findViewById(R.id.account_row_text);
            hyz.a = (ImageView) view.findViewById(R.id.account_row_icon);
            view.setTag(hyz);
        } else {
            hyz = (hyz) view.getTag();
        }
        hyz.b.setText(((hyy) this.b.get(i)).b);
        hyz.a.setImageDrawable(((hyy) this.b.get(i)).c);
        return view;
    }
}
