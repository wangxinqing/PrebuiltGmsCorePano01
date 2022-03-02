package com.google.android.setupdesign.items;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class AbstractItem extends AbstractItemHierarchy implements alid {
    public AbstractItem() {
    }

    public int a() {
        throw null;
    }

    public final alid a(int i) {
        return this;
    }

    public final void b() {
        b(0);
    }

    public alih c() {
        if (this.b != R.id.target_device_item_group) {
            return null;
        }
        return this;
    }

    public AbstractItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
