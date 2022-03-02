package com.android.setupwizardlib.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import java.util.ArrayList;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class AbstractItemHierarchy implements bdk {
    public int a = 0;
    private final ArrayList b = new ArrayList();

    public AbstractItemHierarchy() {
    }

    public final void a(int i, int i2) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("notifyItemRangeInserted: Invalid position=");
            sb.append(i);
            Log.w("AbstractItemHierarchy", sb.toString());
            return;
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((bdj) arrayList.get(i3)).a(this, i, i2);
        }
    }

    public final void b(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(52);
            sb.append("notifyItemRangeChanged: Invalid position=");
            sb.append(i);
            Log.w("AbstractItemHierarchy", sb.toString());
            return;
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((bdj) arrayList.get(i2)).a(this, i);
        }
    }

    public final void c(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("notifyItemRangeInserted: Invalid position=");
            sb.append(i);
            Log.w("AbstractItemHierarchy", sb.toString());
            return;
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((bdj) arrayList.get(i2)).b(this, i);
        }
    }

    public AbstractItemHierarchy(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bdg.a);
        this.a = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
    }

    public final void a(bdj bdj) {
        this.b.add(bdj);
    }
}
