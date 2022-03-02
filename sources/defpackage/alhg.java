package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.PersistableBundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/* renamed from: alhg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alhg implements View.OnClickListener {
    public final int a;
    public CharSequence b;
    public boolean c = true;
    public int d = 0;
    public final int e;
    public View.OnClickListener f;
    public alhd g;
    private int h = 0;

    public alhg(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, algd.b);
        this.b = obtainStyledAttributes.getString(1);
        this.f = null;
        int i = obtainStyledAttributes.getInt(2, 0);
        if (i < 0 || i > 8) {
            throw new IllegalArgumentException("Not a ButtonType");
        }
        this.a = i;
        this.e = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
    }

    public final PersistableBundle a(String str) {
        String str2;
        PersistableBundle persistableBundle = new PersistableBundle();
        String concat = str.concat("_text");
        String charSequence = this.b.toString();
        if (charSequence.length() > 50) {
            charSequence = String.format("%s…", new Object[]{charSequence.substring(0, 49)});
        }
        persistableBundle.putString(concat, charSequence);
        String concat2 = str.concat("_type");
        switch (this.a) {
            case 1:
                str2 = "ADD_ANOTHER";
                break;
            case 2:
                str2 = "CANCEL";
                break;
            case 3:
                str2 = "CLEAR";
                break;
            case 4:
                str2 = "DONE";
                break;
            case 5:
                str2 = "NEXT";
                break;
            case 6:
                str2 = "OPT_IN";
                break;
            case 7:
                str2 = "SKIP";
                break;
            case 8:
                str2 = "STOP";
                break;
            default:
                str2 = "OTHER";
                break;
        }
        persistableBundle.putString(concat2, str2);
        persistableBundle.putInt(str.concat("_onClickCount"), this.h);
        return persistableBundle;
    }

    public void onClick(View view) {
        View.OnClickListener onClickListener = this.f;
        if (onClickListener != null) {
            this.h++;
            onClickListener.onClick(view);
        }
    }

    public alhg(CharSequence charSequence, View.OnClickListener onClickListener, int i, int i2) {
        this.b = charSequence;
        this.f = onClickListener;
        this.a = i;
        this.e = i2;
    }

    public final void a(int i) {
        LinearLayout linearLayout;
        Button button;
        this.d = i;
        alhd alhd = this.g;
        if (alhd != null && (linearLayout = alhd.b.b) != null && (button = (Button) linearLayout.findViewById(alhd.a)) != null) {
            button.setVisibility(i);
            alhd.b.d();
        }
    }

    public final void a(CharSequence charSequence) {
        LinearLayout linearLayout;
        Button button;
        this.b = charSequence;
        alhd alhd = this.g;
        if (alhd != null && (linearLayout = alhd.b.b) != null && (button = (Button) linearLayout.findViewById(alhd.a)) != null) {
            button.setText(charSequence);
        }
    }

    public final void a(boolean z) {
        LinearLayout linearLayout;
        Button button;
        alha alha;
        this.c = z;
        alhd alhd = this.g;
        if (alhd != null && (linearLayout = alhd.b.b) != null && (button = (Button) linearLayout.findViewById(alhd.a)) != null) {
            button.setEnabled(z);
            alhe alhe = alhd.b;
            if (alhe.a) {
                if (alhd.a == alhe.e) {
                    alha = alha.CONFIG_FOOTER_PRIMARY_BUTTON_TEXT_COLOR;
                } else {
                    alha = alha.CONFIG_FOOTER_SECONDARY_BUTTON_TEXT_COLOR;
                }
                alhe.a(button, alha);
            }
        }
    }
}
