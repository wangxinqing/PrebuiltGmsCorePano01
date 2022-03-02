package defpackage;

import android.content.Context;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: occ  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class occ extends RadioGroup implements ocz, obm, obf {
    public oct a = null;
    private final List b;
    private final boolean c;
    private obg d;
    private List e = null;

    public occ(Context context, obg obg, avnj avnj) {
        super(context);
        this.d = obg;
        boolean z = avnj.d;
        this.c = z;
        if (z) {
            setOnCheckedChangeListener(new oca(this));
        }
        setTag(avnj.b);
        this.b = new ArrayList();
        aucx aucx = avnj.f;
        int size = aucx.size();
        int i = 0;
        int i2 = -1;
        for (int i3 = 0; i3 < size; i3++) {
            avnl avnl = (avnl) aucx.get(i3);
            i++;
            obz obz = new obz(context, i, avnl);
            this.b.add(obz);
            addView(obz);
            if (obz.a()) {
                EditText editText = obz.a;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setLayoutParams(new RadioGroup.LayoutParams(-1, -2));
                linearLayout.setOrientation(1);
                linearLayout.addView(editText);
                addView(linearLayout);
            }
            if (avnl.d) {
                i2 = i;
            }
        }
        if (i2 > 0) {
            check(i2);
        }
        this.d.a(this);
    }

    private final obz f() {
        int checkedRadioButtonId = getCheckedRadioButtonId();
        if (checkedRadioButtonId > 0) {
            return (obz) findViewById(checkedRadioButtonId);
        }
        return null;
    }

    public final void a(List list) {
        this.e = list;
        setOnCheckedChangeListener(new ocb(this));
    }

    public final void a(oct oct) {
        this.a = oct;
    }

    public final List aY() {
        if (this.c) {
            return Collections.singletonList(this);
        }
        return Collections.emptyList();
    }

    public final boolean b() {
        return this.d.getVisibility() == 0;
    }

    public final List c() {
        obz f = f();
        if (f == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        String str = (String) getTag();
        String str2 = (String) f.getTag();
        arrayList.add(oaq.a(str, str2));
        if (f.a()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
            sb.append(str);
            sb.append("--");
            sb.append(str2);
            arrayList.add(oaq.a(sb.toString(), f.a.getText().toString()));
        }
        return arrayList;
    }

    public final String d() {
        obz f = f();
        if (f != null) {
            return (String) f.getTag();
        }
        return null;
    }

    public final void e() {
        List list = this.e;
        if (list != null) {
            ocv.a(list);
            oct oct = this.a;
            if (oct != null) {
                oct.a();
            }
        }
    }

    public final boolean a() {
        return getCheckedRadioButtonId() > 0;
    }
}
