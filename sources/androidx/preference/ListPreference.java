package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ListPreference extends DialogPreference {
    private boolean G;
    private String g;
    public CharSequence[] h;
    public CharSequence[] i;
    public String j;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new ame();
        String a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, lj.a(context, (int) R.attr.dialogPreferenceStyle, 16842897));
    }

    /* access modifiers changed from: protected */
    public final Object a(TypedArray typedArray, int i2) {
        return typedArray.getString(i2);
    }

    public final int b(String str) {
        CharSequence[] charSequenceArr;
        if (!(str == null || (charSequenceArr = this.i) == null)) {
            for (int length = charSequenceArr.length - 1; length >= 0; length--) {
                if (TextUtils.equals(this.i[length].toString(), str)) {
                    return length;
                }
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public final Parcelable d() {
        Parcelable d = super.d();
        if (this.y) {
            return d;
        }
        SavedState savedState = new SavedState(d);
        savedState.a = this.j;
        return savedState;
    }

    public final CharSequence f() {
        amn amn = this.F;
        if (amn != null) {
            return amn.a(this);
        }
        Object g2 = g();
        CharSequence f = super.f();
        String str = this.g;
        if (str != null) {
            Object[] objArr = new Object[1];
            if (g2 == null) {
                g2 = "";
            }
            objArr[0] = g2;
            String format = String.format(str, objArr);
            if (!TextUtils.equals(format, f)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return format;
            }
        }
        return f;
    }

    public final CharSequence g() {
        CharSequence[] charSequenceArr;
        int b = b(this.j);
        if (b < 0 || (charSequenceArr = this.h) == null) {
            return null;
        }
        return charSequenceArr[b];
    }

    /* access modifiers changed from: protected */
    public final void a(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.a(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.a(savedState.getSuperState());
        a(savedState.a);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, anc.e, i2, 0);
        this.h = lj.c(obtainStyledAttributes, 2, 0);
        this.i = lj.c(obtainStyledAttributes, 3, 1);
        if (lj.a(obtainStyledAttributes, 4, 4, false)) {
            if (amf.a == null) {
                amf.a = new amf();
            }
            a((amn) amf.a);
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, anc.g, i2, 0);
        this.g = lj.a(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }

    public final void a(CharSequence charSequence) {
        super.a(charSequence);
        this.g = charSequence != null ? charSequence.toString() : null;
    }

    /* access modifiers changed from: protected */
    public final void a(Object obj) {
        a(d((String) obj));
    }

    public final void a(String str) {
        boolean z = !TextUtils.equals(this.j, str);
        if (z || !this.G) {
            this.j = str;
            this.G = true;
            e(str);
            if (z) {
                b();
            }
        }
    }
}
