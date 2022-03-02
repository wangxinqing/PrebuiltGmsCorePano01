package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* renamed from: ahu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ahu extends BaseAdapter implements Filterable, ahv {
    protected boolean b;
    protected boolean c;
    public Cursor d;
    protected Context e;
    protected int f;
    protected ahs g;
    protected DataSetObserver h;
    protected ahw i;

    public ahu(Context context, Cursor cursor) {
        a(context, cursor, 0);
    }

    public final Cursor a() {
        return this.d;
    }

    public Cursor a(CharSequence charSequence) {
        return this.d;
    }

    public abstract View a(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract void a(View view, Context context, Cursor cursor);

    public View b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return a(context, cursor, viewGroup);
    }

    public Cursor c(Cursor cursor) {
        Cursor cursor2 = this.d;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            ahs ahs = this.g;
            if (ahs != null) {
                cursor2.unregisterContentObserver(ahs);
            }
            DataSetObserver dataSetObserver = this.h;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.d = cursor;
        if (cursor == null) {
            this.f = -1;
            this.b = false;
            notifyDataSetInvalidated();
        } else {
            ahs ahs2 = this.g;
            if (ahs2 != null) {
                cursor.registerContentObserver(ahs2);
            }
            DataSetObserver dataSetObserver2 = this.h;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f = cursor.getColumnIndexOrThrow("_id");
            this.b = true;
            notifyDataSetChanged();
        }
        return cursor2;
    }

    public final int getCount() {
        Cursor cursor;
        if (!this.b || (cursor = this.d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.b) {
            return null;
        }
        this.d.moveToPosition(i2);
        if (view == null) {
            view = b(this.e, this.d, viewGroup);
        }
        a(view, this.e, this.d);
        return view;
    }

    public final Filter getFilter() {
        if (this.i == null) {
            this.i = new ahw(this);
        }
        return this.i;
    }

    public final Object getItem(int i2) {
        Cursor cursor;
        if (!this.b || (cursor = this.d) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.d;
    }

    public final long getItemId(int i2) {
        Cursor cursor;
        if (!this.b || (cursor = this.d) == null || !cursor.moveToPosition(i2)) {
            return 0;
        }
        return this.d.getLong(this.f);
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.d.moveToPosition(i2)) {
            if (view == null) {
                view = a(this.e, this.d, viewGroup);
            }
            a(view, this.e, this.d);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i2);
        }
    }

    public boolean hasStableIds() {
        return true;
    }

    public ahu(Context context, boolean z) {
        a(context, (Cursor) null, !z ? 2 : 1);
    }

    public CharSequence b(Cursor cursor) {
        return cursor != null ? cursor.toString() : "";
    }

    /* access modifiers changed from: package-private */
    public final void a(Context context, Cursor cursor, int i2) {
        int i3;
        boolean z = false;
        if ((i2 & 1) == 1) {
            i2 |= 2;
            this.c = true;
        } else {
            this.c = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.d = cursor;
        this.b = z;
        this.e = context;
        if (z) {
            i3 = cursor.getColumnIndexOrThrow("_id");
        } else {
            i3 = -1;
        }
        this.f = i3;
        if ((i2 & 2) == 2) {
            this.g = new ahs(this);
            this.h = new aht(this);
        } else {
            this.g = null;
            this.h = null;
        }
        if (z) {
            ahs ahs = this.g;
            if (ahs != null) {
                cursor.registerContentObserver(ahs);
            }
            DataSetObserver dataSetObserver = this.h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public void a(Cursor cursor) {
        Cursor c2 = c(cursor);
        if (c2 != null) {
            c2.close();
        }
    }
}
