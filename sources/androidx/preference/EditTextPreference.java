package androidx.preference;

import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.preference.Preference;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class EditTextPreference extends DialogPreference {
    public String g;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new amb();
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

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EditTextPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130969078(0x7f0401f6, float:1.7546828E38)
            r1 = 16842898(0x1010092, float:2.3693967E-38)
            int r0 = defpackage.lj.a((android.content.Context) r4, (int) r0, (int) r1)
            r3.<init>(r4, r5, r0)
            int[] r1 = defpackage.anc.d
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            boolean r5 = defpackage.lj.a((android.content.res.TypedArray) r4, (int) r2, (int) r2, (boolean) r2)
            if (r5 == 0) goto L_0x002a
            amc r5 = defpackage.amc.a
            if (r5 != 0) goto L_0x0025
            amc r5 = new amc
            r5.<init>()
            defpackage.amc.a = r5
        L_0x0025:
            amc r5 = defpackage.amc.a
            r3.a((defpackage.amn) r5)
        L_0x002a:
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.EditTextPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* access modifiers changed from: protected */
    public final Object a(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public final boolean c() {
        return TextUtils.isEmpty(this.g) || super.c();
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
        a(d((String) obj));
    }

    public final void a(String str) {
        boolean c = c();
        this.g = str;
        e(str);
        boolean c2 = c();
        if (c2 != c) {
            c(c2);
        }
        b();
    }
}
