package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class PreferenceGroup extends Preference {
    public final ou a;
    public List b;
    public int c;
    private final Handler d;
    private boolean e;
    private int f;
    private boolean g;
    private final Runnable h;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new amp();
        int a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.a = i;
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(Bundle bundle) {
        super.a(bundle);
        int g2 = g();
        for (int i = 0; i < g2; i++) {
            f(i).a(bundle);
        }
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        int g2 = g();
        for (int i = 0; i < g2; i++) {
            f(i).b(bundle);
        }
    }

    public final Preference c(CharSequence charSequence) {
        Preference c2;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        } else if (TextUtils.equals(this.t, charSequence)) {
            return this;
        } else {
            int g2 = g();
            for (int i = 0; i < g2; i++) {
                Preference f2 = f(i);
                if (TextUtils.equals(f2.t, charSequence)) {
                    return f2;
                }
                if ((f2 instanceof PreferenceGroup) && (c2 = ((PreferenceGroup) f2).c(charSequence)) != null) {
                    return c2;
                }
            }
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final Parcelable d() {
        return new SavedState(super.d(), this.c);
    }

    public final void e(int i) {
        if (i != Integer.MAX_VALUE && !i()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.c = i;
    }

    public final Preference f(int i) {
        return (Preference) this.b.get(i);
    }

    public final int g() {
        return this.b.size();
    }

    public boolean r() {
        return true;
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (byte[]) null);
    }

    public final void m() {
        super.o();
        this.g = true;
        int g2 = g();
        for (int i = 0; i < g2; i++) {
            f(i).m();
        }
    }

    public final void n() {
        p();
        this.g = false;
        int g2 = g();
        for (int i = 0; i < g2; i++) {
            f(i).n();
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, byte[] bArr) {
        super(context, attributeSet, i, 0);
        this.a = new ou();
        this.d = new Handler();
        this.e = true;
        this.f = 0;
        this.g = false;
        this.c = Integer.MAX_VALUE;
        this.h = new amo(this);
        this.b = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, anc.h, i, 0);
        this.e = lj.a(obtainStyledAttributes, 2, 2, true);
        if (obtainStyledAttributes.hasValue(1)) {
            e(lj.d(obtainStyledAttributes, 1, 1));
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public final void a(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.a(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.c = savedState.a;
        super.a(savedState.getSuperState());
    }

    public final void b(Preference preference) {
        c(preference);
        l();
    }

    public final void c(Preference preference) {
        synchronized (this) {
            super.p();
            if (preference.E == this) {
                preference.a((PreferenceGroup) null);
            }
            if (this.b.remove(preference)) {
                String str = preference.t;
                if (str != null) {
                    this.a.put(str, Long.valueOf(preference.e()));
                    this.d.removeCallbacks(this.h);
                    this.d.post(this.h);
                }
                if (this.g) {
                    preference.n();
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void a(Preference preference) {
        long j;
        if (!this.b.contains(preference)) {
            if (preference.t != null) {
                PreferenceGroup preferenceGroup = this;
                while (true) {
                    PreferenceGroup preferenceGroup2 = preferenceGroup.E;
                    if (preferenceGroup2 == null) {
                        break;
                    }
                    preferenceGroup = preferenceGroup2;
                }
                String str = preference.t;
                if (preferenceGroup.c((CharSequence) str) != null) {
                    Log.e("PreferenceGroup", "Found duplicated key: \"" + str + "\". This can cause unintended behaviour, please use unique keys for every preference.");
                }
            }
            if (preference.q == Integer.MAX_VALUE) {
                if (this.e) {
                    int i = this.f;
                    this.f = i + 1;
                    preference.a(i);
                }
                if (preference instanceof PreferenceGroup) {
                    ((PreferenceGroup) preference).e = this.e;
                }
            }
            int binarySearch = Collections.binarySearch(this.b, preference);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 1;
            }
            preference.f(c());
            synchronized (this) {
                this.b.add(binarySearch, preference);
            }
            amy amy = this.l;
            String str2 = preference.t;
            if (str2 == null || !this.a.containsKey(str2)) {
                j = amy.a();
            } else {
                j = ((Long) this.a.get(str2)).longValue();
                this.a.remove(str2);
            }
            preference.m = j;
            preference.n = true;
            try {
                preference.a(amy);
                preference.n = false;
                preference.a(this);
                if (this.g) {
                    preference.m();
                }
                l();
            } catch (Throwable th) {
                preference.n = false;
                throw th;
            }
        }
    }

    public final void c(boolean z) {
        super.c(z);
        int g2 = g();
        for (int i = 0; i < g2; i++) {
            f(i).f(z);
        }
    }
}
