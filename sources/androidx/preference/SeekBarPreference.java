package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SeekBarPreference extends Preference {
    private SeekBar.OnSeekBarChangeListener G = new and(this);
    private View.OnKeyListener H = new ane(this);
    public int a;
    public int b;
    public boolean c;
    public SeekBar d;
    public boolean e;
    public boolean f;
    private int g;
    private int h;
    private TextView i;
    private boolean j;

    private final void a(int i2, boolean z) {
        int i3 = this.b;
        if (i2 < i3) {
            i2 = i3;
        }
        int i4 = this.g;
        if (i2 > i4) {
            i2 = i4;
        }
        if (i2 != this.a) {
            this.a = i2;
            e(i2);
            if (j() && i2 != d(i2 ^ -1)) {
                SharedPreferences.Editor c2 = this.l.c();
                c2.putInt(this.t, i2);
                super.a(c2);
            }
            if (z) {
                b();
            }
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
        savedState.b = this.b;
        savedState.c = this.g;
        return savedState;
    }

    public final void e(int i2) {
        TextView textView = this.i;
        if (textView != null) {
            textView.setText(String.valueOf(i2));
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new anf();
        int a;
        int b;
        int c;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.c = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, anc.j, R.attr.seekBarPreferenceStyle, 0);
        this.b = obtainStyledAttributes.getInt(3, 0);
        int i2 = obtainStyledAttributes.getInt(1, 100);
        int i3 = this.b;
        i2 = i2 < i3 ? i3 : i2;
        if (i2 != this.g) {
            this.g = i2;
            b();
        }
        int i4 = obtainStyledAttributes.getInt(4, 0);
        if (i4 != this.h) {
            this.h = Math.min(this.g - this.b, Math.abs(i4));
            b();
        }
        this.e = obtainStyledAttributes.getBoolean(2, true);
        this.j = obtainStyledAttributes.getBoolean(5, false);
        this.f = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public final Object a(TypedArray typedArray, int i2) {
        return Integer.valueOf(typedArray.getInt(i2, 0));
    }

    public final void a(anb anb) {
        super.a(anb);
        anb.a.setOnKeyListener(this.H);
        this.d = (SeekBar) anb.c(R.id.seekbar);
        TextView textView = (TextView) anb.c(R.id.seekbar_value);
        this.i = textView;
        if (this.j) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.i = null;
        }
        SeekBar seekBar = this.d;
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(this.G);
            this.d.setMax(this.g - this.b);
            int i2 = this.h;
            if (i2 != 0) {
                this.d.setKeyProgressIncrement(i2);
            } else {
                this.h = this.d.getKeyProgressIncrement();
            }
            this.d.setProgress(this.a - this.b);
            e(this.a);
            this.d.setEnabled(h());
            return;
        }
        Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
    }

    /* access modifiers changed from: protected */
    public final void a(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.a(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.a(savedState.getSuperState());
        this.a = savedState.a;
        this.b = savedState.b;
        this.g = savedState.c;
        b();
    }

    public final void a(SeekBar seekBar) {
        int progress = this.b + seekBar.getProgress();
        if (progress == this.a) {
            return;
        }
        if (b((Object) Integer.valueOf(progress))) {
            a(progress, false);
            return;
        }
        seekBar.setProgress(this.a - this.b);
        e(this.a);
    }

    /* access modifiers changed from: protected */
    public final void a(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        a(d(((Integer) obj).intValue()), true);
    }
}
