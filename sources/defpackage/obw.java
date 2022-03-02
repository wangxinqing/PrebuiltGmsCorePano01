package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.AppCompatEditText;
import android.text.InputFilter;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: obw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class obw extends AppCompatEditText implements obf {
    public final TextView a;
    public final boolean b;
    public boolean c;
    private final oby d;
    private final int e;
    private final String f;
    private final int g = getTextColors().getDefaultColor();
    private final obg h;
    private oct i;

    public obw(Context context, obg obg, avnj avnj, oby oby, boolean z) {
        super(context);
        String str;
        int i2;
        int i3;
        this.h = obg;
        this.d = oby;
        this.f = avnj.k;
        TextView textView = null;
        this.i = null;
        this.c = false;
        if (!TextUtils.isEmpty(this.f)) {
            c();
        }
        if (z) {
            if (!this.c && !avnj.g.isEmpty()) {
                setText(avnj.g);
            }
            this.b = avnj.d;
        } else {
            this.b = false;
        }
        oay.a((EditText) this, jlh.a(avnj.c), this.b);
        int a2 = avni.a(avnj.e);
        int i4 = 1;
        if (a2 != 0 && a2 == 3) {
            setSingleLine(false);
            if ((avnj.a & 64) != 0) {
                avnk avnk = avnj.h;
                str = (avnk == null ? avnk.c : avnk).a;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                i2 = Integer.valueOf(str).intValue();
            } else {
                i2 = 5;
            }
            setLines(i2);
            setGravity(51);
            if ((avnj.a & 64) != 0) {
                avnk avnk2 = avnj.h;
                i3 = (avnk2 == null ? avnk.c : avnk2).b;
            } else {
                i3 = 0;
            }
            this.e = i3;
            if (i3 > 0) {
                setFilters(new InputFilter[]{new InputFilter.LengthFilter(i3)});
                textView = oay.a(context, String.valueOf(this.e), false);
                textView.setTextColor(context.getResources().getColor(R.color.gh_edit_watcher_text));
                textView.setGravity(5);
            }
            this.a = textView;
        } else {
            setSingleLine();
            this.a = null;
            this.e = 0;
        }
        int a3 = avni.a(avnj.e);
        i4 = a3 != 0 ? a3 : i4;
        if (i4 == 3) {
            setInputType(147457);
        } else if (i4 == 16) {
            setInputType(16417);
        } else if (i4 != 18) {
            setInputType(16384);
        } else {
            setInputType(3);
        }
    }

    private final void c() {
        this.c = true;
        setText(this.f);
        setTextColor(getContext().getResources().getColor(R.color.gh_placeholder_text));
    }

    public final void a(oct oct) {
        this.i = oct;
    }

    public final boolean b() {
        return this.h.getVisibility() == 0;
    }

    /* access modifiers changed from: protected */
    public final void onFocusChanged(boolean z, int i2, Rect rect) {
        if (!z) {
            if (!TextUtils.isEmpty(this.f) && TextUtils.isEmpty(getText())) {
                c();
            }
        } else if (this.c) {
            this.c = false;
            setText("");
            setTextColor(this.g);
        }
        super.onFocusChanged(z, i2, rect);
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        oct oct = this.i;
        if (oct != null) {
            oct.a();
        }
        TextView textView = this.a;
        if (textView != null) {
            textView.setText(String.valueOf(this.e - charSequence.length()));
        }
        oby oby = this.d;
        if (oby != null) {
            oby.a();
        }
    }

    public final boolean a() {
        return !getText().toString().trim().isEmpty();
    }
}
