package com.android.setupwizardlib.items;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.R;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class AbstractItem extends AbstractItemHierarchy implements bdi {
    public AbstractItem() {
    }

    public int a() {
        throw null;
    }

    public final bdi a(int i) {
        return this;
    }

    public final void b() {
        b(0);
    }

    public bdk c() {
        if (this.a != R.id.android_auto_item) {
            return null;
        }
        return this;
    }

    public AbstractItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
