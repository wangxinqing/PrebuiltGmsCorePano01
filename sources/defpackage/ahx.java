package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: ahx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ahx extends ahu {
    private final int a;
    private final int j;
    private final LayoutInflater k;

    @Deprecated
    public ahx(Context context, int i) {
        super(context, true);
        this.j = i;
        this.a = i;
        this.k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public View a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.k.inflate(this.a, viewGroup, false);
    }

    public final View b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.k.inflate(this.j, viewGroup, false);
    }

    public ahx(Context context, Cursor cursor) {
        super(context, cursor);
        this.j = 17367044;
        this.a = 17367044;
        this.k = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
