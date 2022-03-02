package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/* renamed from: alif  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alif extends BaseAdapter implements alig {
    private final alih a;
    private final alie b = new alie();

    public alif(alih alih) {
        this.a = alih;
        alih.a((alig) this);
        b();
    }

    private final void b() {
        for (int i = 0; i < getCount(); i++) {
            alid a2 = getItem(i);
            alie alie = this.b;
            int e = a2.e();
            if (alie.a.indexOfKey(e) < 0) {
                alie.a.put(e, alie.b);
                alie.b++;
            }
            alie.a.get(e);
        }
    }

    /* renamed from: a */
    public final alid getItem(int i) {
        return this.a.a(i);
    }

    public final int getCount() {
        return this.a.a();
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getItemViewType(int i) {
        return this.b.a.get(getItem(i).e());
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        alid a2 = getItem(i);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(a2.e(), viewGroup, false);
        }
        a2.a(view);
        return view;
    }

    public final int getViewTypeCount() {
        return this.b.a.size();
    }

    public final boolean isEnabled(int i) {
        return getItem(i).d();
    }

    public final void a() {
        b();
        notifyDataSetChanged();
    }

    public final void a(alih alih, int i) {
        a();
    }

    public final void a(alih alih, int i, int i2) {
        a();
    }

    public final void b(alih alih, int i, int i2) {
        a();
    }
}
