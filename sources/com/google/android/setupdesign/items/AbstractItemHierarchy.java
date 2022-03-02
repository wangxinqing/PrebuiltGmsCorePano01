package com.google.android.setupdesign.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class AbstractItemHierarchy implements alih {
    private final ArrayList a = new ArrayList();
    public int b = 0;

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
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((alig) arrayList.get(i3)).a(this, i, i2);
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
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((alig) arrayList.get(i2)).a(this, i);
        }
    }

    public AbstractItemHierarchy(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, alhx.b);
        this.b = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
    }

    public final void a(alig alig) {
        this.a.add(alig);
    }

    public final void b(int i, int i2) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("notifyItemRangeInserted: Invalid position=");
            sb.append(i);
            Log.w("AbstractItemHierarchy", sb.toString());
        } else if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder(54);
            sb2.append("notifyItemRangeInserted: Invalid itemCount=");
            sb2.append(i2);
            Log.w("AbstractItemHierarchy", sb2.toString());
        } else {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((alig) arrayList.get(i3)).b(this, i, i2);
            }
        }
    }

    public final void b(alig alig) {
        this.a.remove(alig);
    }
}
