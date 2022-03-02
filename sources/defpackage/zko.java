package defpackage;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.google.android.gms.R;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.plus.sharebox.AddToCircleChimeraActivity;

/* renamed from: zko  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zko extends BaseAdapter {
    final /* synthetic */ AddToCircleChimeraActivity a;

    public zko(AddToCircleChimeraActivity addToCircleChimeraActivity) {
        this.a = addToCircleChimeraActivity;
    }

    /* renamed from: a */
    public final AudienceMember getItem(int i) {
        AddToCircleChimeraActivity addToCircleChimeraActivity = this.a;
        int i2 = AddToCircleChimeraActivity.d;
        return (AudienceMember) addToCircleChimeraActivity.c.e.b.get(i);
    }

    public final int getCount() {
        AddToCircleChimeraActivity addToCircleChimeraActivity = this.a;
        int i = AddToCircleChimeraActivity.d;
        return addToCircleChimeraActivity.c.e.b.size();
    }

    public final long getItemId(int i) {
        return (long) getItem(i).hashCode();
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        zkr zkr;
        if (view == null) {
            view = this.a.getLayoutInflater().inflate(R.layout.plus_add_to_circle_list_item, viewGroup, false);
            zkr = new zkr(view);
            view.setTag(zkr);
        } else {
            zkr = (zkr) view.getTag();
        }
        view.setOnClickListener(this.a);
        AudienceMember a2 = getItem(i);
        zkr.a = i;
        zkr.b = a2;
        if (a2 != null) {
            if (TextUtils.isEmpty(a2.g)) {
                String str = a2.e;
                zkr.c.setTag(str);
                if (ycm.i(str)) {
                    zkr.c.setImageResource(R.drawable.quantum_ic_email_black_24);
                }
            } else {
                zkr.c.setTag(a2.g);
                String str2 = a2.g;
                ImageView imageView = zkr.c;
                if (str2.equals(imageView.getTag())) {
                    AddToCircleChimeraActivity addToCircleChimeraActivity = this.a;
                    int i2 = AddToCircleChimeraActivity.d;
                    Bitmap bitmap = (Bitmap) addToCircleChimeraActivity.b.a((Object) str2);
                    if (bitmap == null) {
                        ibq ibq = wlt.a;
                        xdh.a(this.a.a, str2, 1, 1).a((icm) new zkq(this.a, str2, imageView));
                    } else {
                        imageView.setImageBitmap(bitmap);
                    }
                }
            }
            zkr.d.setText(a2.f);
            zkr.e.setChecked(a2.h.getBoolean("checked", false));
        }
        return view;
    }
}
