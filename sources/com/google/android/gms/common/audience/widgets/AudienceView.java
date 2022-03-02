package com.google.android.gms.common.audience.widgets;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.people.data.Audience;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AudienceView extends FrameLayout {
    private static Context c;
    public iin a;
    public iip b;
    private final Context d;
    private final iij e;

    public AudienceView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    private static Pair a(Context context) {
        if (c == null) {
            c = hxy.c(context);
        }
        Context context2 = c;
        if (context2 != null) {
            try {
                return new Pair(iii.asInterface((IBinder) context2.getClassLoader().loadClass("com.google.android.gms.plus.audience.widgets.AudienceViewImpl$DynamiteHost").newInstance()), c);
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            }
        }
        return new Pair(new iio(), context);
    }

    public final void b(boolean z) {
        try {
            this.e.setShowEmptyText(z);
        } catch (RemoteException e2) {
        }
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("parent"));
        try {
            this.e.onRestoreInstanceState(bundle.getBundle("impl"));
        } catch (RemoteException e2) {
        }
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("parent", super.onSaveInstanceState());
        try {
            bundle.putBundle("impl", this.e.onSaveInstanceState());
        } catch (RemoteException e2) {
        }
        return bundle;
    }

    public AudienceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AudienceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Pair a2 = a(context);
        this.e = (iij) a2.first;
        this.d = (Context) a2.second;
        try {
            this.e.initialize(mbz.a((Object) getContext()), mbz.a((Object) this.d), new iil(this));
            addView((View) mbz.a(this.e.getView()));
        } catch (RemoteException e2) {
        }
    }

    public final void a(int i, iin iin, iip iip) {
        this.a = iin;
        this.b = iip;
        try {
            this.e.setEditMode(i);
        } catch (RemoteException e2) {
        }
    }

    public final void a(Audience audience) {
        try {
            this.e.setAudience(audience);
        } catch (RemoteException e2) {
        }
    }

    public final void a(iin iin) {
        iva.a((Object) iin);
        a(3, iin, (iip) null);
    }

    public final void a(boolean z) {
        try {
            this.e.setIsUnderageAccount(z);
        } catch (RemoteException e2) {
        }
    }
}
