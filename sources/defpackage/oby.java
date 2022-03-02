package defpackage;

import android.content.Context;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: oby  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oby extends LinearLayout implements obm {
    public final obw a;
    public List b;
    private final TextView c;

    public oby(Context context, obg obg, avnj avnj) {
        super(context);
        setTag(avnj.b);
        setOrientation(1);
        obw obw = new obw(context, obg, avnj, this, true);
        this.a = obw;
        addView(obw);
        TextView textView = this.a.a;
        if (textView != null) {
            addView(textView);
        }
        if (avnj.l) {
            oaz oaz = new oaz(context, avnj, this);
            this.c = oaz;
            addView(oaz);
            a();
            return;
        }
        this.c = null;
    }

    public final void a() {
        if (this.c != null) {
            obw obw = this.a;
            boolean z = true;
            if (!obw.c && !obw.getText().toString().isEmpty()) {
                List list = this.b;
                if (list != null) {
                    int size = list.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        int i2 = i + 1;
                        if (((EditText) list.get(i)).getText().toString().isEmpty()) {
                            break;
                        }
                        i = i2;
                    }
                }
                z = false;
            }
            if (this.c.getVisibility() == 0 && z) {
                this.c.setVisibility(8);
            } else if (this.c.getVisibility() == 8 && !z) {
                this.c.setVisibility(0);
            }
        }
    }

    public final List aY() {
        obw obw = this.a;
        if (obw.b) {
            return Collections.singletonList(obw);
        }
        return Collections.emptyList();
    }

    public final List c() {
        ArrayList arrayList = new ArrayList();
        String str = (String) getTag();
        if (this.b == null) {
            arrayList.add(oaq.a(str, this.a.getText().toString()));
        } else {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
            sb.append(str);
            sb.append("_0");
            arrayList.add(oaq.a(sb.toString(), this.a.getText().toString()));
            List list = this.b;
            int size = list.size();
            int i = 0;
            int i2 = 1;
            while (i < size) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12);
                sb2.append(str);
                sb2.append("_");
                sb2.append(i2);
                arrayList.add(oaq.a(sb2.toString(), ((EditText) list.get(i)).getText().toString()));
                i++;
                i2++;
            }
        }
        return arrayList;
    }
}
