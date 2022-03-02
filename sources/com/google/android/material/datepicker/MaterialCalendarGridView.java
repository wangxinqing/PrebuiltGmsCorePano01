package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.gms.R;
import java.util.Calendar;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class MaterialCalendarGridView extends GridView {
    private final Calendar a;

    public MaterialCalendarGridView(Context context) {
        this(context, (AttributeSet) null);
    }

    private static int a(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        ajvq a2 = getAdapter();
        DateSelector dateSelector = a2.c;
        ajus ajus = a2.d;
        Long a3 = a2.getItem(a2.a());
        Long a4 = a2.getItem(a2.b());
        for (oq oqVar : dateSelector.d()) {
            Object obj = oqVar.a;
            if (obj == null || oqVar.b == null) {
                materialCalendarGridView = this;
            } else {
                long longValue = ((Long) obj).longValue();
                long longValue2 = ((Long) oqVar.b).longValue();
                Long valueOf = Long.valueOf(longValue);
                Long valueOf2 = Long.valueOf(longValue2);
                if (a3 != null && a4 != null && valueOf.longValue() <= a4.longValue() && valueOf2.longValue() >= a3.longValue()) {
                    if (longValue < a3.longValue()) {
                        i2 = a2.a();
                        if (i2 % a2.b.e != 0) {
                            i = materialCalendarGridView.getChildAt(i2 - 1).getRight();
                        } else {
                            i = 0;
                        }
                    } else {
                        materialCalendarGridView.a.setTimeInMillis(longValue);
                        i2 = a2.b(materialCalendarGridView.a.get(5));
                        i = a(materialCalendarGridView.getChildAt(i2));
                    }
                    if (longValue2 > a4.longValue()) {
                        i4 = a2.b();
                        if ((i4 + 1) % a2.b.e != 0) {
                            i3 = materialCalendarGridView.getChildAt(i4).getRight();
                        } else {
                            i3 = getWidth();
                        }
                    } else {
                        materialCalendarGridView.a.setTimeInMillis(longValue2);
                        i4 = a2.b(materialCalendarGridView.a.get(5));
                        i3 = a(materialCalendarGridView.getChildAt(i4));
                    }
                    int itemId = (int) a2.getItemId(i2);
                    int itemId2 = (int) a2.getItemId(i4);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (getNumColumns() + numColumns) - 1;
                        View childAt = materialCalendarGridView.getChildAt(numColumns);
                        int top = childAt.getTop() + ajus.a.a();
                        int bottom = childAt.getBottom() - ajus.a.b();
                        if (numColumns > i2) {
                            i5 = 0;
                        } else {
                            i5 = i;
                        }
                        canvas.drawRect((float) i5, (float) top, (float) (i4 > numColumns2 ? getWidth() : i3), (float) bottom, ajus.h);
                        itemId++;
                        materialCalendarGridView = this;
                    }
                    materialCalendarGridView = this;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
        } else if (i == 33) {
            setSelection(getAdapter().b());
        } else if (i == 130) {
            setSelection(getAdapter().a());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().a()) {
            return true;
        }
        if (i != 19) {
            return false;
        }
        setSelection(getAdapter().a());
        return true;
    }

    public final void setSelection(int i) {
        if (i < getAdapter().a()) {
            super.setSelection(getAdapter().a());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final ajvq getAdapter() {
        return (ajvq) super.getAdapter();
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof ajvq) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), ajvq.class.getCanonicalName()}));
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = ajvz.c();
        if (ajvl.a(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        qb.a((View) this, (oz) new ajvg());
    }
}
