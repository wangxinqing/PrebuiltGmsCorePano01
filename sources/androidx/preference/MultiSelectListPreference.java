package androidx.preference;

import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.Preference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MultiSelectListPreference extends DialogPreference {
    private Set g = new HashSet();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MultiSelectListPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130969035(0x7f0401cb, float:1.754674E38)
            r1 = 16842897(0x1010091, float:2.3693964E-38)
            int r0 = defpackage.lj.a((android.content.Context) r4, (int) r0, (int) r1)
            r3.<init>(r4, r5, r0)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r3.g = r1
            int[] r1 = defpackage.anc.f
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            r5 = 2
            defpackage.lj.c(r4, r5, r2)
            r5 = 3
            r0 = 1
            defpackage.lj.c(r4, r5, r0)
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.MultiSelectListPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* access modifiers changed from: protected */
    public final Object a(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    /* access modifiers changed from: protected */
    public final Parcelable d() {
        Parcelable d = super.d();
        if (this.y) {
            return d;
        }
        SavedState savedState = new SavedState(d);
        savedState.a = this.g;
        return savedState;
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new amg();
        Set a;

        public SavedState(Parcel parcel) {
            super(parcel);
            int readInt = parcel.readInt();
            this.a = new HashSet();
            String[] strArr = new String[readInt];
            parcel.readStringArray(strArr);
            Collections.addAll(this.a, strArr);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a.size());
            Set set = this.a;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
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

    /* access modifiers changed from: protected */
    public final void a(Object obj) {
        a(b((Set) obj));
    }

    public final void a(Set set) {
        this.g.clear();
        this.g.addAll(set);
        if (j() && !set.equals(b((Set) null))) {
            SharedPreferences.Editor c = this.l.c();
            c.putStringSet(this.t, set);
            super.a(c);
        }
        b();
    }
}
