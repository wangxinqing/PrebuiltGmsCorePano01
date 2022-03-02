package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/* renamed from: znq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class znq extends BaseAdapter {
    public final Context M;
    public final LayoutInflater N;
    protected final int O = i();
    public zni P = new znl();
    private int a = 0;

    public znq(Context context) {
        this.M = context;
        this.N = LayoutInflater.from(context);
    }

    public static String b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.substring(0, 1);
        }
        return null;
    }

    public final View a(View view, int i) {
        return view == null ? this.N.inflate(i, (ViewGroup) null) : view;
    }

    public final int getCount() {
        return this.P.d();
    }

    public final Object getItem(int i) {
        return this.P.b(i);
    }

    public final long getItemId(int i) {
        this.P.b(i);
        return (long) i;
    }

    public final int getItemViewType(int i) {
        return this.P.a(i);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return this.P.a(i, view, viewGroup, i > 0);
    }

    public final int getViewTypeCount() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public void h() {
    }

    public final boolean hasStableIds() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final int i() {
        int i = this.a;
        this.a = i + 1;
        return i;
    }

    public final String a(int i) {
        if (i != 0) {
            return this.M.getResources().getString(i);
        }
        return null;
    }

    public final void a(zni zni) {
        this.P = zni;
        h();
        notifyDataSetChanged();
    }
}
