package defpackage;

import android.content.Context;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import java.util.List;

/* renamed from: obp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class obp extends CheckBox implements obf, ocz {
    public final EditText a;
    public final boolean b;
    public oct c;
    private final obg d;
    private List e;

    public obp(Context context, obg obg, avnl avnl) {
        super(context);
        this.d = obg;
        boolean z = avnl.f;
        this.b = z;
        if (z) {
            setOnCheckedChangeListener(new obn(this));
        }
        setTag(avnl.b);
        Object[] objArr = new Object[2];
        String str = "";
        objArr[0] = (2 & avnl.a) != 0 ? avnl.c : str;
        objArr[1] = this.b ? " *" : str;
        setText(String.format("%s%s", objArr));
        setChecked(avnl.d);
        oay.a((TextView) this, this.b);
        this.a = avnl.e ? oay.a(context, (CompoundButton) this) : null;
    }

    public final void a(List list) {
        this.e = list;
        setOnCheckedChangeListener(new obo(this));
    }

    public final void a(oct oct) {
        this.c = oct;
    }

    public final boolean b() {
        return this.d.getVisibility() == 0;
    }

    public final boolean c() {
        return this.a != null;
    }

    public final String d() {
        return String.valueOf(isChecked());
    }

    public final void e() {
        List list = this.e;
        if (list != null) {
            ocv.a(list);
            oct oct = this.c;
            if (oct != null) {
                oct.a();
            }
        }
    }

    public final boolean a() {
        return isChecked();
    }
}
