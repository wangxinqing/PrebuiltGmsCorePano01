package com.android.setupwizardlib.items;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ItemGroup extends AbstractItemHierarchy implements bdl, bdj {
    private final List b = new ArrayList();
    private final SparseIntArray c = new SparseIntArray();
    private int d = 0;
    private boolean e = false;

    public ItemGroup() {
    }

    private final int b(bdk bdk) {
        List list = this.b;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (list.get(i) == bdk) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        b();
        if (i == -1) {
            return -1;
        }
        int size2 = this.b.size();
        int i2 = -1;
        while (i2 < 0 && i < size2) {
            i2 = this.c.get(i, -1);
            i++;
        }
        if (i2 >= 0) {
            return i2;
        }
        return a();
    }

    public final int a() {
        b();
        return this.d;
    }

    public final bdk c() {
        if (this.a == R.id.android_auto_item) {
            return this;
        }
        List list = this.b;
        int size = list.size();
        int i = 0;
        while (i < size) {
            bdk c2 = ((bdk) list.get(i)).c();
            i++;
            if (c2 != null) {
                return c2;
            }
        }
        return null;
    }

    public final bdi a(int i) {
        int keyAt;
        b();
        if (i < 0 || i >= this.d) {
            int i2 = this.d;
            StringBuilder sb = new StringBuilder(35);
            sb.append("size=");
            sb.append(i2);
            sb.append("; index=");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        SparseIntArray sparseIntArray = this.c;
        int size = sparseIntArray.size() - 1;
        int i3 = 0;
        while (true) {
            if (i3 <= size) {
                int i4 = (i3 + size) >>> 1;
                int valueAt = sparseIntArray.valueAt(i4);
                if (valueAt >= i) {
                    if (valueAt <= i) {
                        keyAt = sparseIntArray.keyAt(i4);
                        break;
                    }
                    size = i4 - 1;
                } else {
                    i3 = i4 + 1;
                }
            } else {
                keyAt = sparseIntArray.keyAt(i3 - 1);
                break;
            }
        }
        if (keyAt >= 0) {
            return ((bdk) this.b.get(keyAt)).a(i - this.c.get(keyAt));
        }
        throw new IllegalStateException("Cannot have item start index < 0");
    }

    public ItemGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private final void b() {
        if (this.e) {
            this.d = 0;
            this.c.clear();
            for (int i = 0; i < this.b.size(); i++) {
                bdk bdk = (bdk) this.b.get(i);
                if (bdk.a() > 0) {
                    this.c.put(i, this.d);
                }
                this.d += bdk.a();
            }
            this.e = false;
        }
    }

    public final void b(bdk bdk, int i) {
        this.e = true;
        int b2 = b(bdk);
        if (b2 >= 0) {
            c(b2 + i);
            return;
        }
        String valueOf = String.valueOf(bdk);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("Unexpected child remove ");
        sb.append(valueOf);
        Log.e("ItemGroup", sb.toString());
    }

    public final void a(bdk bdk) {
        this.e = true;
        this.b.add(bdk);
        bdk.a((bdj) this);
        int a = bdk.a();
        if (a > 0) {
            a(b(bdk), a);
        }
    }

    public final void a(bdk bdk, int i) {
        int b2 = b(bdk);
        if (b2 >= 0) {
            b(b2 + i);
            return;
        }
        String valueOf = String.valueOf(bdk);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("Unexpected child change ");
        sb.append(valueOf);
        Log.e("ItemGroup", sb.toString());
    }

    public final void a(bdk bdk, int i, int i2) {
        this.e = true;
        int b2 = b(bdk);
        if (b2 >= 0) {
            a(b2 + i, i2);
            return;
        }
        String valueOf = String.valueOf(bdk);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("Unexpected child insert ");
        sb.append(valueOf);
        Log.e("ItemGroup", sb.toString());
    }
}
