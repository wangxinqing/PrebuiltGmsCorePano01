package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class TwoStatePreference extends Preference {
    public boolean a;
    public boolean b;
    private CharSequence c;
    private CharSequence d;
    private boolean e;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new ani();
        boolean a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt() != 1 ? false : true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* access modifiers changed from: protected */
    public final Object a(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    /* access modifiers changed from: protected */
    public final void b(anb anb) {
        b(anb.c(16908304));
    }

    public final void c(CharSequence charSequence) {
        this.c = charSequence;
        if (this.a) {
            b();
        }
    }

    /* access modifiers changed from: protected */
    public final Parcelable d() {
        Parcelable d2 = super.d();
        if (this.y) {
            return d2;
        }
        SavedState savedState = new SavedState(d2);
        savedState.a = this.a;
        return savedState;
    }

    public final void h(boolean z) {
        boolean z2 = this.a;
        if (z2 != z || !this.e) {
            this.a = z;
            this.e = true;
            g(z);
            if (z2 != z) {
                c(c());
                b();
            }
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        boolean z = !this.a;
        if (b((Object) Boolean.valueOf(z))) {
            h(z);
        }
    }

    /* access modifiers changed from: protected */
    public final void b(View view) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            int i = 0;
            if (this.a && !TextUtils.isEmpty(this.c)) {
                textView.setText(this.c);
            } else if (!this.a && !TextUtils.isEmpty(this.d)) {
                textView.setText(this.d);
            } else {
                CharSequence f = f();
                if (!TextUtils.isEmpty(f)) {
                    textView.setText(f);
                } else {
                    i = 8;
                }
            }
            if (i != textView.getVisibility()) {
                textView.setVisibility(i);
            }
        }
    }

    public final boolean c() {
        if (!this.b) {
            if (!this.a) {
                return true;
            }
        } else if (this.a) {
            return true;
        }
        return super.c();
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }

    /* access modifiers changed from: protected */
    public final void a(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.a(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.a(savedState.getSuperState());
        h(savedState.a);
    }

    public final void d(CharSequence charSequence) {
        this.d = charSequence;
        if (!this.a) {
            b();
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Object obj) {
        if (obj == null) {
            obj = false;
        }
        h(d(((Boolean) obj).booleanValue()));
    }
}
