package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.plus.service.v1whitelisted.models.ItemScope;
import java.util.ArrayList;

/* renamed from: yno  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yno extends BaseAdapter implements View.OnClickListener {
    public final ynn a;
    public final ArrayList b = new ArrayList();
    public boolean c;
    private final LayoutInflater d;

    public yno(Context context, ynn ynn) {
        this.d = LayoutInflater.from(context);
        this.a = ynn;
    }

    /* renamed from: a */
    public final zhg getItem(int i) {
        if (i < this.b.size()) {
            return (zhg) this.b.get(i);
        }
        return null;
    }

    public final int getCount() {
        return this.b.size() + (this.c ? 1 : 0);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getItemViewType(int i) {
        return i < this.b.size() ? 0 : 1;
    }

    /* JADX WARNING: type inference failed for: r6v9, types: [com.google.android.chimera.LoaderManager$LoaderCallbacks, ynn] */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        String str;
        String str2;
        String str3 = null;
        if (i >= this.b.size()) {
            if (view == null) {
                view = this.d.inflate(R.layout.plus_list_apps_item_loading, viewGroup, false);
            }
            ? r6 = this.a;
            r6.getLoaderManager().restartLoader(200, (Bundle) null, r6);
        } else {
            if (view == null) {
                view = this.d.inflate(R.layout.plus_list_moments_item, viewGroup, false);
            }
            zhg zhg = (zhg) this.b.get(i);
            ItemScope h = zhg.h();
            ImageView imageView = (ImageView) view.findViewById(R.id.icon);
            if (h != null) {
                str = h.c;
            } else {
                str = null;
            }
            ynu ynu = (ynu) this.a;
            Drawable a2 = ynu.d.a(str);
            if (a2 == null) {
                ynu.c.a(str);
            }
            imageView.setImageDrawable(a2);
            imageView.setOnClickListener(this);
            imageView.setTag(zhg);
            ((TextView) view.findViewById(R.id.title)).setText(zhg.d());
            if (zhg.g()) {
                try {
                    str2 = ymq.a(view.getContext(), ymp.a(zhg.f()).a).toString();
                } catch (NumberFormatException e) {
                    str2 = null;
                }
            } else {
                str2 = null;
            }
            zej b2 = zhg.b();
            if (b2 != null) {
                str3 = b2.b();
            }
            if (str2 == null) {
                str2 = str3;
            } else if (str3 != null) {
                str2 = String.format(view.getContext().getString(R.string.plus_list_moments_time_acl_format), new Object[]{str2, str3});
            }
            ((TextView) view.findViewById(R.id.time_acl)).setText(str2);
        }
        return view;
    }

    public final int getViewTypeCount() {
        return 2;
    }

    public final boolean hasStableIds() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.content.DialogInterface$OnClickListener, ynn] */
    public void onClick(View view) {
        String str;
        ? r0 = this.a;
        zhg zhg = (zhg) view.getTag();
        if (zhg.h() != null) {
            str = zhg.h().d;
        } else {
            str = null;
        }
        ((ynu) r0).a.b(!yng.a(str, r0.getActivity(), r0) ? iak.l : iak.k, ial.g);
    }
}
