package com.google.android.setupdesign.items;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ItemGroup extends AbstractItemHierarchy implements alii, alig {
    public final List a = new ArrayList();
    public boolean c = false;
    private final SparseIntArray d = new SparseIntArray();
    private int e = 0;

    public ItemGroup() {
    }

    public static int a(List list, Object obj) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == obj) {
                return i;
            }
        }
        return -1;
    }

    private final int b(alih alih) {
        return c(a(this.a, (Object) alih));
    }

    public final int c(int i) {
        b();
        if (i == -1) {
            return -1;
        }
        int size = this.a.size();
        int i2 = -1;
        while (i2 < 0 && i < size) {
            i2 = this.d.get(i, -1);
            i++;
        }
        return i2 < 0 ? a() : i2;
    }

    private final void b() {
        if (this.c) {
            this.e = 0;
            this.d.clear();
            for (int i = 0; i < this.a.size(); i++) {
                alih alih = (alih) this.a.get(i);
                if (alih.a() > 0) {
                    this.d.put(i, this.e);
                }
                this.e += alih.a();
            }
            this.c = false;
        }
    }

    public final int a() {
        b();
        return this.e;
    }

    public ItemGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void b(alih alih, int i, int i2) {
        this.c = true;
        int b = b(alih);
        if (b >= 0) {
            b(b + i, i2);
            return;
        }
        String valueOf = String.valueOf(alih);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("Unexpected child remove ");
        sb.append(valueOf);
        Log.e("ItemGroup", sb.toString());
    }

    public final alid a(int i) {
        int keyAt;
        b();
        if (i < 0 || i >= this.e) {
            int i2 = this.e;
            StringBuilder sb = new StringBuilder(35);
            sb.append("size=");
            sb.append(i2);
            sb.append("; index=");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        SparseIntArray sparseIntArray = this.d;
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
            return ((alih) this.a.get(keyAt)).a(i - this.d.get(keyAt));
        }
        throw new IllegalStateException("Cannot have item start index < 0");
    }

    public final alih c() {
        if (this.b == R.id.target_device_item_group) {
            return this;
        }
        List list = this.a;
        int size = list.size();
        int i = 0;
        while (i < size) {
            alih c2 = ((alih) list.get(i)).c();
            i++;
            if (c2 != null) {
                return c2;
            }
        }
        return null;
    }

    public final void a(alih alih) {
        this.c = true;
        this.a.add(alih);
        alih.a((alig) this);
        int a2 = alih.a();
        if (a2 > 0) {
            a(b(alih), a2);
        }
    }

    public final void a(alih alih, int i) {
        int b = b(alih);
        if (b >= 0) {
            b(b + i);
            return;
        }
        String valueOf = String.valueOf(alih);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("Unexpected child change ");
        sb.append(valueOf);
        Log.e("ItemGroup", sb.toString());
    }

    public final void a(alih alih, int i, int i2) {
        this.c = true;
        int b = b(alih);
        if (b >= 0) {
            a(b + i, i2);
            return;
        }
        String valueOf = String.valueOf(alih);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("Unexpected child insert ");
        sb.append(valueOf);
        Log.e("ItemGroup", sb.toString());
    }
}
